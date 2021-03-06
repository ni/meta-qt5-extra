SUMMARY = "Rubber Band Library library for audio time-stretching and pitch-shifting"
HOMEPAGE = "http://breakfastquay.com/rubberband/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=28f6289fba0406b8f491e9b2d5767488"

inherit autotools-brokensep pkgconfig

DEPENDS += " \
    fftw \
    libsamplerate0 \
    vamp-plugin-sdk \
    ladspa-sdk \
"

# fftwf is neon accelerated -> force SINGLE precision
SINGLEPATCH = "${@bb.utils.contains('TUNE_FEATURES', 'neon', 'file://0002-Optional-replace-FFTW_DOUBLE_ONLY-by-FFTW_SINGLE_ONL.patch', '', d)}"

SRC_URI = " \
    http://code.breakfastquay.com/attachments/download/34/${BPN}-${PV}.tar.bz2 \
    file://0001-replace-double-process_t.patch \
    ${SINGLEPATCH} \
"
SRC_URI[md5sum] = "6c2b4e18a714bcc297d0db81a10f9348"
SRC_URI[sha256sum] = "ff0c63b0b5ce41f937a8a3bc560f27918c5fe0b90c6bc1cb70829b86ada82b75"

CPPFLAGS += "-ftree-vectorize -DPROCESS_SAMPLE_TYPE=float"

FILES_${PN} += " \
    ${datadir}/ladspa \
    ${libdir}/ladspa \
    ${libdir}/vamp \
"

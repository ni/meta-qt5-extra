SUMMARY = "MLT Multimedia Framework"
HOMEPAGE = "http://www.mltframework.org"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=4b54a1fd55a448865a0b32d41598759d \
    file://GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

SRC_URI = " \
    git://github.com/mltframework/mlt.git;protocol=https \
"
SRCREV = "aea7f984b85ac61a4052d6ae17ce981d0530548e"
S = "${WORKDIR}/git"

inherit autotools-brokensep pkgconfig

DEPENDS += " \
    gtk+ \
    qtbase \
    qtsvg \
    virtual/libx11 \
    pango \
    sox \
    libav \
    libsdl libsdl-image \
    libexif \
    libsamplerate0 \
    fftw \
    jack \
    ladspa-sdk \
"

CLEANBROKEN = "1"

CXXFLAGS += "--std=c++11"

CONF_ACCEL ?= " \
    --disable-mmx \
    --disable-sse \
    --disable-sse2 \
"

EXTRA_OECONF = " \
    ${CONF_ACCEL} \
    --enable-gpl \
"

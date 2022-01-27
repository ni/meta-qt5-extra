SUMMARY = "A sound and music computing system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343"

inherit cmake gettext python-dir

# TBD: fltk is not propely detected
DEPENDS += " \
    flex-native \
    bison-native \
    swig-native \
    python \
    alsa-lib \
    libsndfile1 \
    portaudio-v19 \
    portmidi \
    fluidsynth \
    curl \
    fltk \
    liblo \
    luajit \
    stk \
    libvorbis \
    libeigen \
    libwebsockets \
"

SRC_URI = " \
    git://github.com/csound/csound.git;protocol=https \
    file://0001-Do-not-set-include-path-to-usr-local-include.patch \
    file://0002-Do-not-use-try_run-for-portaudio.patch \
    file://0003-strict-aliasing-errors.patch \
    file://0004-Engine-csound_orc_semantics.c-Fix-build-with-gcc8.patch \
    file://0005-InOut-pmidi.c-Fix-build-with-gcc8.patch \
    file://0006-fixed-unsafe-use-of-strncpy.patch \
    file://0007-util1-csd_util-cs.c-Fix-build-with-gcc8.patch \
"
SRCREV = "c6e19a041507c057a27927761ddb80deb4213eb6"
S = "${WORKDIR}/git"
PV = "6.11.0"

# Where to get lua-version from?
LUA_VERSION = "5.3"

EXTRA_OECMAKE += " \
    -DUSE_DOUBLE=OFF \
    -DPYTHON_MODULE_INSTALL_DIR=${PYTHON_SITEPACKAGES_DIR} \
    -DLUA_MODULE_INSTALL_DIR=${libdir}/lua/${LUA_VERSION} \
"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'pulseaudio', d)}"
PACKAGECONFIG[pulseaudio] = "-DUSE_PULSEAUDIO=ON,-DUSE_PULSEAUDIO=OFF,pulseaudio,pulseaudio-server"

PACKAGES =+ " \
    ${PN}-python2 \
    ${PN}-lua \
"

FILES_${PN}-python2 = "${PYTHON_SITEPACKAGES_DIR}"
RDEPENDS_${PN}-python2 += "python"

FILES_${PN}-lua = "${libdir}/lua"
RDEPENDS_${PN}-lua += "lua"

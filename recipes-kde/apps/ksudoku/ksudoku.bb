SUMMARY = "KSudoku is a logic-based symbol placement puzzle"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gtk-icon-cache distro_features_check

REQUIRED_DISTRO_FEATURES = "x11 opengl"

DEPENDS += " \
    libglu \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    karchive \
    kconfigwidgets \
    kcrash \
    kguiaddons \
    ki18n \
    kiconthemes \
    kio \
    kjobwidgets \
    kwidgetsaddons  \
    kxmlgui \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "668dd1114d8722e5e9c1a55efaefec67"
SRC_URI[sha256sum] = "d40acfb93c2c148f066c238316ba35b44c753ad59090c64f53ecac35da710b3a"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/kxmlgui5 \
"

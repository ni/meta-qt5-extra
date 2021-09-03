SUMMARY = "KReversi is is a simple strategy game played against the computer"
DESCRIPTION = "KReversi is is a simple one player strategy game played against the computer"
LICENSE = "GFDL-1.2+ & GPL-2.0-or-later & LGPL-2.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GFDL-1.2-or-later.txt;md5=9a4c4207e152ff95aa8539e9c1ed53e9 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-only.txt;md5=da48810c4ddf8e49efa031294a26b98c \
"

inherit kde-apps gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kpackage-native \
    kdoctools-native \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    kdeclarative \
    ki18n \
    kiconthemes \
    kio \
    kxmlgui \
    kwidgetsaddons \
    kdoctools \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "f2bde796d8a556cddbb8e89515571e836f66980069f93736195540ff31fc07be"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
"

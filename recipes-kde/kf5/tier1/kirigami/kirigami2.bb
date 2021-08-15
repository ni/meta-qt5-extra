SUMMARY = "QtQuick plugins to build user interfaces based on the KDE UX guidelines"
LICENSE = "LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

# Is that true: We are depending on plasma-framework and are a tier2??
DEPENDS += " \
    kpackage-native \
    qtquickcontrols2 \
    qtsvg \
"

PV = "${KF5_VERSION}"

SRC_URI[sha256sum] = "598c9e245d2726ada15c50d51f38827116f25d7e966af0cdfbb3bca396e01716"

FILES:${PN} += " \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_QML} \
"

RPROVIDES:${PN} += "kirigami"
RREPLACES:${PN} += "kirigami"
RCONFLICTS:${PN} += "kirigami"

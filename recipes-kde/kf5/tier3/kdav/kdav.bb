SUMMARY = "DAV protocol implementation with KJobs"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kcoreaddons \
    ki18n \
    kio \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "8b211ec6e1009f11ae5d0769e21947a473d6ca479ea8a16701a808aa57335b3e"

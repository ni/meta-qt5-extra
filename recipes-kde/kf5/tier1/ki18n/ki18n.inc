SUMMARY = "Advanced internationalization framework"
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later  & LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 gettext

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "1544dd5a002a2376f1018fee619ae2de861cd900cec312fade09e6a6943ef8ad"

EXTRA_OECMAKE += "DBUILD_TESTING=OFF"

require ${BPN}.inc

inherit gtk-icon-cache

DEPENDS += " \
    ${BPN}-native \
"

SRC_URI += "file://0003-Find-native-qrcAlias.patch"

FILES:${PN} += "${datadir}/icons"

PACKAGES =+ "${PN}-binres"
FILES:${PN}-binres = " \
    ${datadir}/icons/breeze/breeze-icons.rcc \
    ${datadir}/icons/breeze-dark/breeze-icons-dark.rcc \
"

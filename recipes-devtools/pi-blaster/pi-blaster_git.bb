DESCRIPTION = "This project enables PWM on the GPIO pins you request of a Raspberry Pi."
HOMEPAGE = "https://github.com/sarfata/pi-blaster/"
SECTION = "devel/libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=295;endline=319;md5=86d10e4bcf4b4014d306dde7c1d2a80d"

SRC_URI = "git://github.com/sarfata/pi-blaster;branch=master;protocol=https \
           file://remove-initscript-lsb-dependency.patch \
           "

SRCREV = "fbba9a7dcef0f352a11f8a2a5f6cbc15b62c0829"

inherit update-rc.d autotools

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME:${PN} = "${PN}.boot.sh"
INITSCRIPT_PARAMS:${PN} = "defaults 15 85"

COMPATIBLE_MACHINE = "^rpi$"

PACKAGE_ARCH = "${MACHINE_ARCH}"

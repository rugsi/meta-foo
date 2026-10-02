SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://foo.c;md5=661eac128e5828b8abe8365a01b0c5e2"

SRC_URI = "file://foo.c"

S = "${UNPACKDIR}"

DEPENDS = "xorgproto"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} -o foo foo.c
}

do_install() {
    install -d ${D}/${bindir}
    install -m 755 ${S}/foo ${D}/${bindir}
}

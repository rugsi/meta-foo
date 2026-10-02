require recipes-core/images/core-image-base.bb

SUMMARY = "foo image"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

IMAGE_INSTALL:append = " foo-program"

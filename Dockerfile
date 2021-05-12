FROM fedora:34

ADD https://maven.pkg.github.com/Buildchimp/buildgrid-format/org/commonjava/build/grid/buildgrid-format/latest-build/buildgrid-format-latest-build.jar /

ENTRYPOINT /bin/bash

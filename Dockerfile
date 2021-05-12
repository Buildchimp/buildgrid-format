FROM fedora:34

ARG URL=$url

ADD $url /

ENTRYPOINT /bin/bash

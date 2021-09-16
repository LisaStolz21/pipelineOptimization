#
# This software is not designed or intended for use in on-line control of
# aircraft, air traffic, aircraft navigation or aircraft communications;
# or in the design, construction, operation or maintenance of any nuclear
# facility; or using or redistributing the Software for such purposes.
#

FROM payara/micro:5.2020.4

LABEL maintainer="thomas.hanel@haw-landshut.de" app="pipelineOptimization"

COPY ./target/pipelineOptimization.war ${DEPLOY_DIR}

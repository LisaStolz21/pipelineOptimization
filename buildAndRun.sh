#!/bin/bash
#
# This software is not designed or intended for use in on-line control of
# aircraft, air traffic, aircraft navigation or aircraft communications;
# or in the design, construction, operation or maintenance of any nuclear
# facility; or using or redistributing the Software for such purposes.
#

declare -r LOCAL_PORT=8080
declare -r PROJECT="pipelineOptimization"
declare -r NAMESPACE=$(id -u -n)

mvn clean package \
	&& docker build \
			--tag "$NAMESPACE/$PROJECT" .

docker rm -f "$PROJECT"  2>/dev/null || echo "no running container ${PROJECT} found." \
	&& docker run --detach \
			--publish $LOCAL_PORT:8080 \
			--name "$PROJECT" \
			"$NAMESPACE/$PROJECT" 

cat << EOF
Example is running at:
http://localhost:$LOCAL_PORT/$PROJECT/first
 
Stop and remove running container using:
docker rm -f $PROJECT 
EOF

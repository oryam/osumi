#!/bin/bash
# Stop application

APP_USER=osumi
APP_SCRIPT=osumi-application
APP_HOME=/apps/osumi/application

#ps -fe | grep java | grep $APP_USER | grep -v grep | gawk '{print $2}' | xargs kill -9
kill -9 $(cat $APP_HOME/pid/$APP_SCRIPT.pid)

exit 0

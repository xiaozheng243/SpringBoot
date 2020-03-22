#!/bin/bash
#停止脚本 stop.sh
PID=$(ps -ef | grep $1 | grep -v grep | awk '{ print $2 }')
if [ -z "$PID" ]
then
    echo The target application has been existed!
else
    echo kill target $PID
    kill $PID
fi
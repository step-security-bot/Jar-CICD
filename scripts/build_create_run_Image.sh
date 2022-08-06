#!/usr/bin/env bash

set -e
cd app/
mvn -B clean package -DskipTests --file pom.xml



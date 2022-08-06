#!/usr/bin/env bash

set -e

docker run -d --name jarcicd -p 80:8080 jarcicd

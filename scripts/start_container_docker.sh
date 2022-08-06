#!/usr/bin/env bash

set -e

docker run -d --name JarCICD -p 80:8080 JarCICD

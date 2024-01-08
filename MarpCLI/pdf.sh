#!/bin/bash

marp --html --engine ./engine.js --theme-set ./theme.css --allow-local-files --pdf "$@"
marp --html --engine ./engine.js --theme-set ./theme.css --allow-local-files --html "$@"

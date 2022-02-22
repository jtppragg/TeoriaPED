#!/bin/bash

marp --html --engine ./engine.js --theme ./theme.css --allow-local-files --pdf "$@"

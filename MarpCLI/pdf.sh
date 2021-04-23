#!/bin/bash

marp --engine ./engine.js --theme ./theme.css --allow-local-files --pdf "$@"

# CS1710 - Assignment 2

## Overview

Answer to "Part I: Algorithm" can be found in `PartI/Algorithm.md`.

Answers to "Part II: Tracing" can be found in `PartII/Trace1.md` and `PartII/Trace2.md`.

Answers to "Part III: Programming Exercises" can be found in `/PartIII/src/*.java`.

## Exporting

To export to a .zip from the repository, run the following.

`rm -i *.zip; git gc --aggressive --prune=now && git archive HEAD --format=zip -9 > "$(printf "r%s.%s - %s - %s.zip" "$(git rev-list --count HEAD)" "$(git rev-parse --short HEAD)" "$(TZ='Canada/Newfoundland' date --iso-8601=seconds)" "$(git --no-pager show -s --format='%an' HEAD)")"`

*Warning: This will try to remove all zip files, regardless of name.*
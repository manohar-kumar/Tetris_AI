#!/bin/sh
value=$(cat testfile.txt)
sed '/public static int[] myarr/s/public static int[] myarr.*/$value/g' State.java

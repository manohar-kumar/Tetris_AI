#!/bin/sh
java Test >testfile.txt
value=$(cat testfile.txt)
sed -i "s/public static int\[\] myarr.*/$value/g" State.java


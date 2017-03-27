#/bin/bash
cd cpp/

if [[ $1 == 'comp' ]];then 
	
	g++ -std=c++11 -fPIC -c -I /usr/lib/jvm/java-8-openjdk-amd64/include/ -I /usr/lib/jvm/java-8-openjdk-amd64/include/linux/ -I . -I ../../include/  -I ../../database/ -o libJdatabase.o libJdatabase.cpp

elif [[ $1 == 'link' ]]; then
	g++ -shared  -L . -o libJdatabase.so libJdatabase.o  -l database
fi
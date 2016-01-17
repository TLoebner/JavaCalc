FROM debian
RUN apt-get update
RUN apt-get -y upgrade
RUN apt-get -y install openjdk-7-jdk git
RUN apt-get -y install ant
RUN mkdir /testsoftware
WORKDIR /testsoftware
RUN git clone --branch=numa_stuff https://github.com/TLoebner/JavaCalc.git
WORKDIR /testsoftware/JavaCalc
RUN java -version
RUN ant 

FROM fedora
RUN dnf -y distro-sync
RUN dnf -y install git java-1.8.0-openjdk-devel
RUN dnf -y install ant ant-junit
RUN mkdir /testsoftware
WORKDIR /testsoftware
RUN ssh-keygen -t rsa -N "" -f my.key
RUN git clone --branch=master https://github.com/TLoebner/JavaCalc.git
WORKDIR /testsoftware/JavaCalc
RUN java -version
RUN ant 

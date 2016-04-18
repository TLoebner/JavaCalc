FROM base/archlinux
RUN pacman -Scc --noconfirm
RUN pacman-key --init
RUN pacman-key --populate archlinux
RUN pacman-key --refresh-keys
RUN pacman -Syyu --noconfirm
RUN pacman-db-upgrade
RUN pacman -Syyu --noconfirm
RUN pacman -S jdk7-openjdk git --noconfirm
RUN pacman -S apache-ant --noconfirm
RUN mkdir /testsoftware
WORKDIR /testsoftware
RUN git clone  --branch=master https://github.com/TLoebner/JavaCalc.git
WORKDIR /testsoftware/JavaCalc
RUN java -version
RUN ant 

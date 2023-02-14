FROM ub-base
RUN apt update && apt install -yq --no-install-recommends \
    software-properties-common
#indicamos el timezone
#ARG TZ=Europe/Madrid

ARG USUARIO
ARG PASSWD
ARG TZ
ARG PROYECTO
ARG DB_USER
ARG DB_PORT
#VARIABLES DE ENTORNO CON EL VALOR DE LOS ARGUMENTOS PARA
ENV USUARIO=$USUARIO
ENV PASSWD=${PASSWD}
ENV TZ=${TZ}
ENV PROYECTO=${PROYECTO}
ENV DB_USER=${DB_USER}
ENV DB_PORT=${DB_PORT}

#ENV TZ=${TZ}
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY ./start-php.sh /root
RUN chmod +x /root/start-php.sh
RUN dos2unix /root/start-php.sh 

RUN echo "$PROYECTO, ${DB_USER}, ${USUARIO}">/root/vars_dfile.txt

EXPOSE 80

#instalamos php
#RUN add-apt-repository ppa:ondrej/php 
RUN apt-get update && apt-get install -y php \
    php-cli \
    php-fpm \
    php-json \
    php-common \
    php-mysql \
    php-zip \
    php-gd \
    php-mbstring \
    php-curl \
    php-xml \
    php-pear \ 
    php-bcmath \
    apache2 

RUN chown -R www-data /var/log/apache2
RUN chown -R www-data /etc/apache2
ENTRYPOINT [ "/root/start-php.sh" ]
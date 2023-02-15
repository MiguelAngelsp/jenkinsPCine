echo "Desplegando la app de gstión de un Cine"

docker-compose -f pCine/build/docker-compose.yml build
docker-compose -f pCine/build/docker-compose.yml up -d
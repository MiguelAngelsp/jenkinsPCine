echo "Desplegando la app de gstión de un Cine"

docker-compose -f build/docker-compose.yml build
docker-compose -f build/docker-compose.yml up -d
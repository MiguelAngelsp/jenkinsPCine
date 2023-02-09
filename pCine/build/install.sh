echo "Desplegando la app de gstión de un Cine"

docker-compose -f docker-compose.yml build
docker-compose -f docker-compose.yml up -d
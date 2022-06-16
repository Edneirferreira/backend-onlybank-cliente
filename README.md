# Backend Only Bank Clientes

Esta aplicação possui o serviço de clients:
Base de dados: AWS DynamoDB

--build

docker buildx build --platform=linux/amd64 --build-arg JAR_FILE=backend-onlybank-cliente-1.0.0-SNAPSHOT.jar -t sdm/backend-onlybank-cliente .

--run

docker run -it -p 8080:8080 --name backend-onlybank-cliente -e APP_AWS_ACCESSKEY=ACCESSKEY -e APP_AWS_SECRETKEY=SECRET sdm/backend-onlybank-cliente

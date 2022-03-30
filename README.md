# spring-serverless-gcp

# Running locally
`./mvnw clean function:run`
`curl -X POST http://localhost:8080 -d 'Hello'`

# Deploying to GCP
```
./mvnw clean package

gcloud functions deploy spring-serverless-gcp \
--entry-point org.springframework.cloud.function.adapter.gcp.GcfJarLauncher \
--runtime java11 \
--trigger-http \
--source target/deploy \
--memory 512MB

curl -X POST https://us-central1-PROJECT-ID.cloudfunctions.net/spring-serverless-gcp -d 'Hello' -H "Authorization: bearer $(gcloud auth print-identity-token)"

```

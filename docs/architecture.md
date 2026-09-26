# RailFlow YardOps architecture

RailFlow is a three-service deployment: a Spring Boot API, a Vite React client, and Railway-managed PostgreSQL. The API owns domain state and exposes resource endpoints under `/api`; scan events pass through `EventIngestionService`, update the asset location, and are evaluated by `AlertRuleEngine` before persistence. Actuator exposes health and Prometheus metrics.

## Local development

Start the API with `cd backend && mvn spring-boot:run`, then the UI with `cd frontend && npm install && npm run dev`. Set `VITE_API_URL` when the API is hosted away from `localhost:8080`.

## Production configuration

Set `SPRING_DATASOURCE_URL`, `SPRING_DATASOURCE_USERNAME`, and `SPRING_DATASOURCE_PASSWORD` on the Railway backend service. The frontend only needs `VITE_API_URL` at build time. Health is available at `/actuator/health`; Prometheus metrics are available at `/actuator/prometheus`.
# RailFlow YardOps

Production-shaped freight rail operations platform for shipment lifecycle management, railcar visibility, yard capacity, event ingestion, exception alerting, and service monitoring.

## Stack

Java 21, Spring Boot 3.4, Spring Data JPA, PostgreSQL/H2, Actuator, Micrometer, JUnit 5, React, Vite, Recharts-ready dashboard, Docker, Railway, and GitHub Actions.

## Run

```powershell
cd backend
mvn spring-boot:run
```

```powershell
cd frontend
npm install
npm run dev
```

The API defaults to `http://localhost:8080`; the UI defaults to `http://localhost:5173`. API resources include `/api/shipments`, `/api/railcars`, `/api/trains`, `/api/yards`, `/api/events`, `/api/alerts`, and `/api/dashboards/operations`.

## Deployment

`railway.json` defines backend and frontend services. Add a Railway PostgreSQL service and map its connection values to the three `SPRING_DATASOURCE_*` variables. The CI workflow runs Maven tests and the frontend production build on every push and pull request.
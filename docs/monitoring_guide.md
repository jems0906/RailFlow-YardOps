# Monitoring guide

Use `/actuator/health` for readiness, `/actuator/info` for service metadata, `/actuator/metrics` for local inspection, and `/actuator/prometheus` for scraping. HTTP request histograms expose p50, p95, and p99 distributions. Custom metrics include `railflow.events.ingested` and `railflow.alerts.unresolved`. Logs are emitted as JSON for collection by a Railway log drain.
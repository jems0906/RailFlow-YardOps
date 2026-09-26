# API design

The REST API uses resource-oriented URLs and JSON payloads. Collections support optional filters, while lifecycle operations use explicit subresources such as `PATCH /api/shipments/{id}/status` and `PATCH /api/alerts/{id}/resolve`. Scan events are write-only ingestion records and are processed transactionally before alert evaluation.

The dashboard summary is optimized for a control-center read: it combines counts, yard utilization, alert state, and service status in one request.
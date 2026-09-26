# Alert rules

- `MISSED_SCAN`: an event references an unknown railcar; warning severity.
- `EXCESSIVE_DWELL`: a scan is older than 24 hours; warning severity.
- `BLOCKED_SHIPMENT`: a high-priority interchange event is waiting for action; critical severity.

Alerts can be filtered by severity and status and acknowledged or resolved through the API.
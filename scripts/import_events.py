import csv, json, sys
from urllib.request import Request, urlopen

api = sys.argv[1] if len(sys.argv) > 1 else "http://localhost:8080/api/events"
with open("data_samples/scan_events.csv", newline="") as source:
    for row in csv.DictReader(source):
        payload = json.dumps(row).encode()
        request = Request(api, data=payload, headers={"Content-Type": "application/json"}, method="POST")
        with urlopen(request) as response:
            print(response.status, row["car_number"])
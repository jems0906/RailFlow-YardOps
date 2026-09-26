import csv, random
from pathlib import Path
out = Path(__file__).parent.parent / "data_samples"; out.mkdir(exist_ok=True)
with (out / "railcars.csv").open("w", newline="") as f:
    writer = csv.DictWriter(f, fieldnames=["car_number","type","capacity","location","status"]); writer.writeheader()
    for i in range(1, 51): writer.writerow({"car_number": f"BNSF-{48000+i}", "type": random.choice(["Boxcar","Covered hopper","Gondola"]), "capacity": 2860, "location": random.choice(["NPT","KCM","CHI"]), "status": "IN_YARD"})
print(f"Generated {50} synthetic railcars in {out}")
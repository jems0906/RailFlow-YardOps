const base = import.meta.env.VITE_API_URL || '/api';
export async function getDashboard(){const r=await fetch(`${base}/dashboards/operations`); if(!r.ok) throw Error('API unavailable'); return r.json();}
export async function getResource(name){const r=await fetch(`${base}/${name}`); if(!r.ok) throw Error('API unavailable'); return r.json();}
export async function updateAlert(id, action){const r=await fetch(`${base}/alerts/${id}/${action}`,{method:'PATCH'}); if(!r.ok) throw Error('Unable to update alert'); return r.json();}
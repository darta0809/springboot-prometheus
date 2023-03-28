# springboot-prometheus

注意：  
使用 docker-compose 啟動服務，prometheus.yml 的設定  
不可以用 localhost:{port} 必須用 host.docker.internal:{port}

### Prometheus

http://localhost:9090/

查詢狀態:  
http://localhost:9090/targets

### Grafana

http://localhost:3000/

預設帳號密碼:admin/admin

### Node-exporter

http://localhost:9100/

### Cadvisor

http://localhost:8899/
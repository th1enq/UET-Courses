# Docker VNC Container

## Summary

This Docker container provides a lightweight desktop environment accessible via VNC and SSH. It uses XFCE as the desktop environment and TightVNC as the VNC server.

## Build image

```sh
docker build -t docker-vnc .
```

## Run container

```sh
docker run -d -p 5901:5901 -p 22:22 --name vnc-container docker-vnc
```

## Create VNC password

```sh
vncpasswd
```

## Login

- SSH:
  - user: `user`
  - password: `user`
  - command: `ssh user@localhost -p 22`
- VNC:
  - command: `vncviewer localhost:5901` (in guest)
  - command: `vncserver :1` (in container)
  ```

## Stop and remove container

```sh
docker stop vnc-container
```

```sh
docker rm vnc-container
```

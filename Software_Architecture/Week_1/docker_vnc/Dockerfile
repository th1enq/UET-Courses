# Base image
FROM archlinux:latest

RUN pacman -Syu --noconfirm && \
    pacman -S --noconfirm openssh tigervnc xorg-xinit xfce4 xfce4-goodies sudo

RUN useradd -m -s /bin/bash user && \
    echo "user:user" | chpasswd && \
    echo "user ALL=(ALL) NOPASSWD: ALL" >> /etc/sudoers

RUN mkdir -p /home/user/.vnc
COPY scripts/xstartup /home/user/.vnc/xstartup
RUN chown -R user:user /home/user/.vnc && chmod +x /home/user/.vnc/xstartup

RUN ssh-keygen -A

EXPOSE 22 5901

CMD ["/usr/sbin/sshd", "-D"]

#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main() {
    int i, N = 10; // Giảm N xuống để tránh tạo quá nhiều tiến trình
    for (i = 0; i < N; i++) {
        pid_t pid = fork();
    }
    
    sleep(1000000); // Giữ tiến trình để dùng pstree kiể
    return 0;
}

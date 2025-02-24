# Assignment 03

```c
#include <stdio.h>
#include <unistd.h>
int main()
{
    int i;

    int N=10;
    for (i = 0; i < N; i++)
        fork();
    return 0;
}
```

- Phân tích đoạn code trên. Lệnh ```fork()``` sẽ tạo ra tiến trình con sao chép tiến trình cha. Các lệnh được thực hiện tiếp tục sau lệnh ```fork()``` đó.

- Sau lệnh ```fork()``` đầu tiên $(i = 0)$:
  
  - Tiến trình cha $P_0$
  
  - Tiến trình con $P_1$ được tạo ra từ $P_0$
  
  - **Tổng số tiến trình: 2**

            <img src="file:///home/th1enq/.config/marktext/images/2025-02-20-18-46-55-image.png" title="" alt="" width="387">

- Sau lệnh ```fork()``` thứ hai $(i = 1)$:
  
  - Tiến trình $P_0$ tạo ra $P_2$
  
  - Tiến trình $P_1$ tạo ra $P_3$
  
  - **Tổng số tiến trình: 4**

            <img title="" src="file:///home/th1enq/.config/marktext/images/2025-02-20-18-49-36-image.png" alt="" width="395">

- Tương tự như vậy sau lệnh ```fork()``` thứ ba $(i = 2)$:
  
  - Tiến trình $P_0$ tạo ra $P_4$
  
  - Tiến trình $P_1$ tạo ra $P_5$
  
  - Tiến trình $P_2$ tạo ra $P_6$
  
  - Tiến trình $P_3$ tạo ra $P_7$
  
  - **Tổng số tiến trình: 8**

        <img src="file:///home/th1enq/.config/marktext/images/2025-02-20-18-51-49-image.png" title="" alt="" width="422"> 

- Tổng quát, gọi $f_i$ là tổng số nút sau lần gọi thứ $i$

-  Sau lần gọi ```fork()``` thứ i. Mỗi tiến trình cũ tạo ra 1 tiến trình mới

- Như vậy: $f_i = f_{i-1} * 2 = 2^{i}$

- Vậy sau lần gọi ```fork()``` thứ $10$, **tổng số tiến trình là $2^{10} = 1024$**



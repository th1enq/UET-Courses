# Bổ sung một hàm hệ thống vào Linux kernel

## Bước 1: Tạo file code module mới.

- Ở đây bạn có thể tùy chỉnh hàm ```hello_linux_init``` theo nhu cầu của bạn. Ở đây tôi muốn in ra dòng chữ ```Hello Linux !!!```

```c
// hello.c
#include <linux/init.h>
#include <linux/module.h>
#include <linux/kernel.h>

int hello_linux_init(void)
{
    printk(KERN_INFO "Hello Linux !!!\n");
    return 0;
}

module_init(hello_linux_init);

MODULE_LICENSE("GPL");
MODULE_DESCRIPTION("Hello Linux Module");
MODULE_AUTHOR("SGG")
```

## Bước 2: Compile module

- Để thuận tiện hãy tạo 1 ```Makefile``` . 
  
  ```makefile
  obj-m += hello.o
  
  all:
       make -C /lib/modules/$(shell uname -r)/build M=$(PWD) modules
  ```

- Sử dụng lệnh make để biên dịch
  
  ```bash
  make
  ```

- Sau khi biên dịch xong, sẽ tạo ra một vài file. Những hãy chỉ quan tâm đến file ```hello.ko```. File này đại diện cho kernel module đã biên dịch.
  
  ![](/home/th1enq/snap/marktext/9/.config/marktext/images/2025-02-14-09-25-21-image.png)

## Bước 3: Thêm module vừa tạo vào kernel

- Để load module vào kernel. Ta sử dụng lệnh
  
  ```bash
  sudo insmod hello.ko
  ```

## Bước 4: Hiển thị kết quả

- Để kiểm tra và hiển thị module vừa thêm có thành công không. Hãy sử dụng lệnh
  
  ```bash
  lsmod
  ```

- Ta thấy kết quả như mong muốn được in ra ở cuối cùng. Như vậy là thành công
  
  ![](/home/th1enq/snap/marktext/9/.config/marktext/images/2025-02-14-09-40-45-image.png)

### Bước 5: Xóa module

- Nếu ta muốn xóa moduel vừa thêm. Ta sử dụng lệnh
  
  ```bash
  sudo rmmod hello
  ```

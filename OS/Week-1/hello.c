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
MODULE_AUTHOR("SGG");

#include <sys/types.h>
#include <sys/wait.h>
#include <stdio.h>
#include <unistd.h>

int value = 5;

int main(){
	printf("Before fork()\n");
	pid_t pid;
	pid = fork();
	if (pid < 0) { /* error occurred */
		fprintf(stderr, "Fork Failed");
		return 1;
	}
	else if (pid == 0) { /* child process */
		value += 15;
		printf("CHILD: value = %d\n",value);
		/* LINE A */
		return 0;
	}
	else if (pid > 0) { /* parent process */
		wait(NULL);
		printf("PARENT: value = %d\n",value);

		/* LINE B */
		return 0;
	}
}

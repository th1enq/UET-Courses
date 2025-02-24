run: kill build
	./process_tree & pstree -p -l | grep process_tree

build:
	gcc process_tree.c -o process_tree

kill:
	pkill process_tree

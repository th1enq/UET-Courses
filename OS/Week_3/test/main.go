package main

import (
	"fmt"
	"sync"
)

var X int = 5
var wg sync.WaitGroup

func processA() {
	defer wg.Done()
	Y := X * 2
	X = Y
}

func processB() {
	defer wg.Done()
	Z := X + 1
	X = Z
}

func main() {
	// Case 1: A runs first, then B
	X = 5
	wg.Add(2)
	go processA()
	go processB()
	wg.Wait()
	fmt.Println("Case 1: X =", X)

	// Case 2: B runs first, then A
	X = 5
	wg.Add(2)
	go processB()
	go processA()
	wg.Wait()
	fmt.Println("Case 2: X =", X)

	// Case 3: A and B interleave
	X = 5
	wg.Add(2)
	go func() {
		Y := X * 2
		X = Y
		wg.Done()
	}()
	go func() {
		Z := X + 1
		X = Z
		wg.Done()
	}()
	wg.Wait()
	fmt.Println("Case 3: X =", X)

	// Case 4: B and A interleave
	X = 5
	wg.Add(2)
	go func() {
		Z := X + 1
		X = Z
		wg.Done()
	}()
	go func() {
		Y := X * 2
		X = Y
		wg.Done()
	}()
	wg.Wait()
	fmt.Println("Case 4: X =", X)
}

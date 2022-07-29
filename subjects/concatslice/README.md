## Concat-Slice

### Instructions

- Write a function that takes two slices of integers and returns the concatenation of the two slices. 

### Expected function

```go
func ConcatSlice(slice1,slice2 []int) []int {
    
}
```

### Usage

Here is a possible program to test your function :

```go
package main

import (
	"fmt"
)

func main() {
	fmt.Println(ConcatSlice([]int{1,2,3},[]int{4,5,6}))
    fmt.Println(ConcatSlice([]int{},[]int{4,5,6,7,8,9}))
    fmt.Println(ConcatSlice([]int{1,2,3},[]int{}))
}
```

And its output :

```console
$ go run .
[1 2 3 4 5 6]
[4 5 6 7 8 9]
[1 2 3]
```
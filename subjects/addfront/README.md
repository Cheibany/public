## addfront

### Instructions

Write a function that takes a string and a slice of strings, this function will return a new slice of a string with the given string prepended

### Expected function 

```go
func AddFront(s string, slice []string) []string {
    // your code here
}
```

### Usage

Here is a possible program to test your function:

```go
package main

import "fmt"

func main() {
    fmt.Println(AddFront("Hello", []string{"world"}))
    fmt.Println(AddFront("Hello", []string{"world", "!"}))
    fmt.Println(AddFront("Hello", []string{}))
}
```

and the output should be:

```console
$ go run .
[Hello world]
[Hello world !]
[Hello]
```
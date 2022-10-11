# TurnItIn
demo for TurnItIn

**Note** this current implementation does not ignore case, and does not escape any special characters such as (,.:/!?*, etc).  


To run, on a command line run 

```bash
javac TurnItInCountingStrings.java

```
```bash
java TurnItInCountingStrings "test string"

```

Sample output:
```
java TurnItInCountingStrings "this is a test, a very bad test"
a 2
very 1
test 1
bad 1
test, 1
this 1
is 1

```

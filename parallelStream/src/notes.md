1) When to use parallel stream
1. large datasets where multi-threading improve performance
2. processing millions of tasks
3. no shared mutable state

when to use parallel and parallelStream

2) parallel()
1. converts and existing sequential stream into a parallel stream 
2. applied on any existing stream (stream())
3. list.stream().parallel()

parallelStream()
1. creates a parallel stream from a collection 
2. applied on collection classes(Map,Set,List);
3. create a new parallelStream directly 
4. list.parallelStream()

parallel()--> when you already have a sequential stream 
parallelStream() --> when working directly with collections 

3) Effect of forEachOrdered()

1. it can impact execution time in a parallel stream because 
   a. maintain the original order 
   b. may reduce parallelism and impact performance unlike forEach 


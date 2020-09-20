(*  count elements in a list    *)


fun count (nil) = 0 (* if we pass an empty list then return 0*)
|   count(h::t) = count(t) + 1; (* if we pass a non empty list then call recursively *)

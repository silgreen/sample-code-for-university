(*  return the head of a list    *)
fun head(nil) = []
|head(h::t) = [h];

(*  return the tail of a list    *)

fun tail(nil) = []
|tail(h::t) = t; 

(*  check if the list is empty     *)

fun empty(nil) = true
|empty(h::t) = false;

(*  count elements in a list    *)

fun count (nil) = 0 (* if we pass an empty list then return 0*)
|   count(h::t) = count(t) + 1; (* if we pass a non empty list then call recursively *)

(*  check if an element is member of a list    *)

fun member(nil,x) = false
|member(h::t,x) = if h = x then true else member(t,x);
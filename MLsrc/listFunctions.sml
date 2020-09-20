(*  count elements in a list    *)

fun head(nil) = []
|head(h::t) = [h];

fun tail(nil) = []
|tail(h::t) = t; 

fun empty(nil) = true
|empty(h::t) = false;


fun count (nil) = 0 (* if we pass an empty list then return 0*)
|   count(h::t) = count(t) + 1; (* if we pass a non empty list then call recursively *)

(*  element member of a list    *)

fun member(nil,x) = false
|member(h::t,x) = if h = x then true else member(t,x);
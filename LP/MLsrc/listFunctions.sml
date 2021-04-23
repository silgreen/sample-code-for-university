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

fun countList (nil) = 0 (* if we pass an empty list then return 0*)
|   countList(h::t) = count(t) + 1; (* if we pass a non empty list then call recursively *)

(*  check if an element is member of a list    *)

fun member(nil,x) = false
|member(h::t,x) = if h = x then true else member(t,x);

fun count(0) = 0 
| count(n) = 1 + count(n-1); (*count from 0 to n*);

fun fact(0) = 1 
| fact(n) = n * fact(n-1); (*that compute the factorial of n*);

fun min(nil) = 0
|min(h::t) = if h <= t ;

(* append function *)
fun append(nil,l2) = l2
|append(h::t,l2) = h::t @ l2;

(*      superior order functions    *)
(*      map is a default function   *)

fun filter(nil) = nil
| filter(h::t) = if f(h) then x::(filter(y)) else filter(y);

fun reduce f e [] = e
| reduce f e (h :: t) = f (h, reduce t)


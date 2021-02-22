/*lenght of a list*/

list_len([],0).
list_len([_|T],N) :- list_len(T,X), N is X + 1.

/*sum*/
list_sum([],0).
list_sum([H|T], TotalSum) :- list_sum(T,Sum),TotalSum is H + Sum.

/*Max*/

list_max([H|T],A,Max) :- H > A, list_max(T,H,Max).
list_max([H|T],A,Max) :- H =< A, list_max(T,A,Max).
list_max([],A,A).

/*Append function*/
append([],L,L).
append([H|T],L2,[H|L3]):- append(T,L2,L3).

prefix(P,L) :- append(P,_,L).
Suffix(S,L) :- append(_,S,L).
SubList(Subl,L) :- Suffix(S,L), prefix(Subl,S).

/*member function*/
member(X,[H|_]).
member(X,[_|T) :- member(X,T).

/* reverse a list */
rev([],[]).
rev([H|T],R) :- rev(T,RevT), append(RevT,[H],R).

fatt(0,1).
fatt(N,F) :- N > 0, N1 is N-1, fatt(N1,F1), F is N * N1. 
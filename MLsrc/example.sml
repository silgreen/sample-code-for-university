(*  the comments in this language are structured like that
    a tip for you, try the live compiler. type sml file only for better indentation
    now some sample code in this language!
*)

(*  if you type anything on the command line you will receive a reponse like that*)

- 3; (*enter*)
(*val it = 3 : int*) (* this is the console output we can translate this line like that:
                    the value you have inserted = 3 (in this case) is of type int*)

-0w7 mod 0w4;
(*val it = 0wx3 : word*)

- "hello " ^ "world";
(*val it = "hello world" : string*)

- ord #"a"; ord #"b";
(*val it = 97 : int
  val it = 98 : int *)

- 3 + 2.2; (*ERROR! in Ml the explicit cast does'nt exist*)

- real(3) + 2.2; 
(*this is correct and the output is:
val it = 5.2 : real*)




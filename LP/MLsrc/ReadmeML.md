once you have installed the ML compiler, you can use it in 2 ways:
<ol>
<li>interacting with the compiler (like a browser console for javascript)</li>
<li>type a .sml file with your instructions, go to the command line, start the compiler with sml, and then run use "name-of-your-file"</li>
</ol>

<h2>Info about this language</h2>

<h3>Types</h3>

<ul>
<li><em>int</em></li> 
    0,1,2,3,~2,~3,~4,...<br>
  the symbol ~ is the minus sign<br>
  operators: +, -, *, mod, div, =,...
<li><em>word</em></li>
    0w44, 0w53, ~0w15, 0wxff,...<br>
  they are unsigned integers
<li><em>real</em></li>
    3.14, 2.0, 0.1E6,...<br>
<li><em>string</em></li>
    "abc", "123",...<br>
  operators: ^, size, =, >,...<br>
<li><em>char</em></li>
    #"a", #"\n", #"\163",...<br>
  operators: ord, chr, =, <,...<br>
 <li><em>bool</em></li>
    true, false<br>
   operators: not, andalso, orelse, =<br>
</ul>

(println "Hello, world!")
"h"
100
true

(type 'a)

(def a "aaaaa")

(let [l "light"] (println (str "God said let there be " l)))

(let [l "light"
             d "darkness"]
             (println (str "God said let there be " l))
             (println (str "God also said let there be " d)))

(let [l "light"
            l_d (str l " and" " darkness")]
            (println (str "God also said let there be " l_d)))

(let [a "aaa"]
        (println a))

(let [a "aaa"]
        (let [a "AAA"]
          (println a)))

(let [a "a"]
        (let []
          (println a)))

(def object "light")
(println (str "God said let there be " object))

(def object "darkness")
(println (str "God said let there be " object))

(+ 4 (* 2 3))
(+ 3 4 5 6)
(/ 4) ; 1/4
+
(get "abrakadabra" 0)
((fn [who] (str "Hello, " who "!")) "Jani")
((fn [name] (str "Welcome to Rivendell mr " name)) "Bjim")
(def hello (fn [who] (str "Hello, " who "!")))
(hello "handsome")
((defn                                 ; Start a function definition:
  hello                               ; name
  "Gives out personalized greetings." ; a optional docstring
  [who]                               ; parameters inside brackets
  (str "Hello, " who "!")) "jim")

((defn hypotenuse [x y]
  (let [bla (* x x)
        blu (* y y)]
    (Math/sqrt (+ bla blu)))) 3 5)

  (val (clojure.lang.MapEntry. :a :b))

  (val (first {:one :two}))
;;=> :two

(seq (into (sorted-map) {:key1 "value1" :key2 "value2"}))
;;=> ([:key1 "value1"] [:key2 "value2"])

(let [x 42]
         (+ x x))
;=> 84

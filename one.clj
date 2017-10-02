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

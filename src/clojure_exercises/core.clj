(ns clojure-exercises.core)


;; #14
(= 8 ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn [x] (+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))
;; Functions can be written a variety of ways. I'm not so sure about that "partial" thing.

;; #15 Write a function which doubles a number
(= ((fn [x] (* x 2)) 2) 4)
;;returns true. The function is (fn [x] (* x 2))

;; #16 Write a function which returns a personalized greeting
(= ((fn [x] (str "Hello, " x "!")) "Dave") "Hello, Dave!")
;;returns true. Function is (fn [x] (str "Hello, " x "!"))

;; #17 The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure.
(= '(6 7 8) (map #(+ % 5) '(1 2 3)))
;;returns true. Maps the function (+ % 5) onto the list '(1 2 3)

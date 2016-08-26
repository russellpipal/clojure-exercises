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

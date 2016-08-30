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

;; #18 The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true.
(= '(6 7) (filter #(> % 5) '(3 4 5 6 7)))
;;returns true. Pretty simple, just filters those in the list that are greater than 5.

;; #19 Local Bindings. Clojure lets you give local names to values using the special let-form.
(= 7 (let [x 5] (+ 2 x)))
(= 7 (let [x 3 y 10] (- y x)))
(= 7 (let [x 21] (let [y 3] (/ x y))))
;; all return true. Let just seems to replace a variable in a local expression.

;; #36 (next in order), Let it Be
;;Can you bind x, y, and z so that these are all true?
(= 10 (let __ (+ x y)))
(= 4 (let __ (+ y z)))
(= 1 (let __ z))
;;Solve from z to x. Then z=1, y=3, x=7, so use the vector [z 1 y 3 x 7]
(= 10 (let [z 1 y 3 x 7] (+ x y)))
(= 4 (let [z 1 y 3 x 7] (+ y z)))
(= 1 (let [z 1 y 3 x 7] z))
;;All return true.

;; #37 Regular expressions (there seems to be different ways to order these problems)
(= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
;; Seems pretty simple, just applies the regex to the string. This one is easy.

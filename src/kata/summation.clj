(ns kata.summation)

;https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/clojure

(defn summation [n]
  (/ (* n (+ n 1)) 2)
  )

; #againwhatlearned
; use `inc` function to increment a value:
; ```
; (/ (* n (inc n)) 2))
; ```

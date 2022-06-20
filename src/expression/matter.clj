(ns expression.matter)

;https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/clojure

(defn expression-matter [a b c]
  (reduce max [
               (+ a b c)
               (* a b c)
               (+ a (* b c))
               (* a (+ b c))
               (* (+ a b) c)
               ]
          )
  )

;; --------------------------------------
;; Again what learned (can be shortened):
;(defn expression-matter [a b c]
;  (max
;    (* a b c)
;    (* a (+ b c))
;    (* (+ a b) c)
;    (+ a b c)
;    )
;  )

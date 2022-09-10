(ns kata)

;https://www.codewars.com/kata/5545f109004975ea66000086/train/clojure

(defn is-divisible [n x y]
  (== 0
      (max
        (mod n x)
        (mod n y)
        )
      )
  )

;; #againwhatlearned
;; use `=` operator to check more than two operands for equality:
;; ```
;; (= (mod n x) (mod n y) 0)
;; ```
;;
;; use `zero?` to check operand against zero and `and` to combine two conditions:
;; ```
;; (and (zero? (mod n x)) (zero? (mod n y)))
;; ```
;;
;; use `every` to check all values against a condition:
;; ```
;; (every? zero? (map #(mod n %) [x y]))
;; ```

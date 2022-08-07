(ns kata)

;https://www.codewars.com/kata/515e271a311df0350d00000f/train/clojure

(defn square-sum [xs]
  (reduce + (map #(* % %) xs))
  )

; #againwhatlearned
; use `thread-last` macro
; https://clojure.org/guides/threading_macros#thread-last
; ```
;   (->> xs
;       (map #(* % %))
;       (apply +)))
; ```

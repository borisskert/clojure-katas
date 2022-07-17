(ns clojure.string-repeat)

;https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/clojure

(defn repeat-str [n strng]
  (clojure.string/join (repeat n strng))
  )

; #againwhatlearned Also a solution:
;(defn repeat-str [n strng]
;  (apply str (repeat n strng))
;  )

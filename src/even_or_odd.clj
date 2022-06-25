(ns even-or-odd)

; https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/clojure
(defn even-or-odd [number]
  (if (even? number)
    "Even"
    "Odd")
  )

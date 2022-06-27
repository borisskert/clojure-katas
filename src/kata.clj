(ns kata)

;https://www.codewars.com/kata/5715eaedb436cf5606000381/train/clojure
(defn positive-sum [xs]
  (reduce + (filterv pos? xs))
  )

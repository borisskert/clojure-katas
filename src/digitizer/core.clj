(ns digitizer.core)

;https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/clojure

(defn digitize [n]
  (if (< n 10)
    [n]
    (concat
      (list (mod n 10))
      (digitize (long (/ n 10)))
      )
    )
  )

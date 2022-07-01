(ns clojure.phone)

;https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/clojure
(defn create-phone-number [nums]
  (String/format "(%d%d%d) %d%d%d-%d%d%d%d" (to-array nums))
  )

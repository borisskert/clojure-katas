(ns century.core)

;https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/clojure

(defn century [year]
  (inc (int (/ (dec year) 100)))
  )

; #againwhatlearned
; (1) use `thread-first` macro
; https://clojure.org/guides/threading_macros#thread-first
; (2) use `quot` function to divide
; ```
; (-> year
;      dec
;      (quot 100)
;      inc)
; ```

(ns clojure.string-repeat-test
  (:require [clojure.string-repeat :refer :all]
            [clojure.test :refer :all]))

(deftest simple-test
  (is (= (repeat-str 4 "a") "aaaa"))
  (is (= (repeat-str 3 "hello ") "hello hello hello "))
  (is (= (repeat-str 2 "abc") "abcabc")))

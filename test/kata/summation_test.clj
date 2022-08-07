(ns kata.summation-test
  (:require [clojure.test :refer :all]
            [kata.summation :refer :all]))
(defn tester [n e]
  (testing (str "Testing for " n)
    (is (= (summation n) e))))
(deftest basic-tests
  (tester 1 1)
  (tester 8 36)
  (tester 22 253)
  (tester 100 5050)
  (tester 213 22791))

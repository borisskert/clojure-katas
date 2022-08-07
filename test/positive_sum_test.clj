(ns positive-sum-test
  (:require [clojure.test :refer :all]
            [positive-sum :refer [positive-sum]]))

(deftest
  Sum-of-positive-basic-Tests
  (is (= (positive-sum []) 0))
  (is (= (positive-sum [1 2 3 4 5]) 15))
  (is (= (positive-sum [1 -2 3 4 5]) 13))
  (is (= (positive-sum [-1 2 3 4 -5]) 9))
  (is (= (positive-sum [-1 -2 -3 -4 -5]) 0)))

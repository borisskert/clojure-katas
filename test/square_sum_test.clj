(ns square-sum-test
  (:require [clojure.test :refer :all]
            [square-sum :refer [square-sum]]))

(deftest basic-tests
  (is (= (square-sum [1, 2]) 5))
  (is (= (square-sum [5, 3, 4]) 50))
  (is (= (square-sum []) 0)))

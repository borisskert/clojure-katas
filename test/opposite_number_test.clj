(ns opposite-number-test
  (:require [clojure.test :refer :all]
            [opposite-number :refer [opposite]]))

(deftest opposite-test
  (is (= (opposite 1) -1))
  )

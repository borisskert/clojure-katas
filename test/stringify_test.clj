(ns stringify-test
  (:require [clojure.test :refer :all]
            [stringify :refer :all]))

(deftest number-to-string-test-example
  (is (= (number-to-string 67) "67"))
  )

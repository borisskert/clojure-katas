(ns clojure.phone-test
  (:require [clojure.test :refer :all]
            [clojure.phone :refer :all]))

(defn tester [arr exp]
  (testing (str "Testing for " arr)
    (is (= (create-phone-number arr) exp))))
(deftest basic-tests
  (tester [1 2 3 4 5 6 7 8 9 0] "(123) 456-7890")
  (tester [1 1 1 1 1 1 1 1 1 1] "(111) 111-1111")
  (tester [4 7 8 1 5 7 9 9 7 1] "(478) 157-9971")
  (tester [7 8 0 2 2 1 7 5 1 3] "(780) 221-7513"))

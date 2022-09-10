(ns digitizer.code-test
  (:require [clojure.test :refer :all]
            [digitizer.core :refer [digitize]]))

(deftest basic-tests
  (is (= (digitize 0) [0]))
  (is (= (digitize 12) [2 1]))
  (is (= (digitize 35231) [1 3 2 5 3]))
  (is (= (digitize 4576289392) [2 9 3 9 8 2 6 7 5 4]))
  (is (= (digitize 54870283839) [9 3 8 3 8 2 0 7 8 4 5]))
  )

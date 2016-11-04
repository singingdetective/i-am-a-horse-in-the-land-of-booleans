(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [x] (if (< x 0) (* x -1) x))

(defn divides? [divisor n] (if(== 0 (mod n divisor)) true false))

(defn fizzbuzz [n] (cond
                      (== 0 (mod n 15)) "gotcha!"
                      (== 0 (mod n 3))  "fizz"
                      (== 0 (mod n 5))  "buzz"
                      :else             ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age] (or (< age 13) (> age 19)))

(defn generic-doublificate [x] (cond
                                  (= true (number? x)) (+ x x)
                                  (and (or (vector? x) (list? x) (map? x)) (== 0 (count x))) nil
                                  (and (not (map? x)) (< 0 (count x))) (* 2 (count x))
                                  :else true))

(defn leap-year? [year]
  (or
    (and (== 0 (mod year 4)) (== 0 (mod year 100)) (== 0 (mod year 400)))
    (and (== 0 (mod year 4)) (not= 0 (mod year 100)))))

(leap-year? 100)
(leap-year? 200)
(leap-year? 400)
(leap-year? 12)
(leap-year? 20)
(leap-year? 15)

; '_______'

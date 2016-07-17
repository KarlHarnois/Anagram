(ns anagram
  (:require [clojure.string :as str]))

(defn anagrams-for [word coll]
  (->> coll
       (remove #(= (str/lower-case word) (str/lower-case %)))
       (filter #(= (frequencies (str/lower-case word))
                   (frequencies (str/lower-case %))))))

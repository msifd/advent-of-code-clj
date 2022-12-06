(ns advent.core
  (:require [clojure.java.io :as io]
            [clojure.string :as str])
  (:gen-class))

(defn get-input-lines
  [path]
  (str/split-lines (slurp (io/resource path))))

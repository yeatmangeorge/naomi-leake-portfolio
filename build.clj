(ns build
  (:require
   [home :as home]))

(require '[babashka.fs :as fs])

(fs/delete-tree "public")
(fs/create-dirs "public")

(defn write! [url html]
  (let [out (str "public/" url "/index.html")]
    (fs/create-dirs (fs/parent out))
    (spit out html)))

(write! home/url home/page)
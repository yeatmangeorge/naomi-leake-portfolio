(ns build
  (:require
   [babashka.fs :as fs]
   [home]
   [not-found]))


(fs/delete-tree "public")
(fs/create-dirs "public")

(defn write! [url html]
  (let [out (str "public/"
                 (case url
                   "404" "404.html"
                   (str url "/index.html")))]
    (fs/create-dirs (fs/parent out))
    (spit out html)))

(write! home/url home/page)
(write! not-found/url not-found/page)
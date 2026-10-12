(ns build
  (:require
   [babashka.fs :as fs]
   [gallery]
   [home]
   [not-found]
   [routes]))

(fs/delete-tree "public")
(fs/create-dirs "public")

(def out-path "public/")

(fs/copy-tree "static" out-path)


(defn write! [url html]
  (let [out (str out-path
                 (case url
                   "/404" "404.html"
                   (str url "/index.html")))]
    (fs/create-dirs (fs/parent out))
    (spit out html)))

(write! routes/home home/page)
(write! routes/not-found not-found/page)
(write! routes/gallery gallery/page)
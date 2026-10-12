(ns gallery
  (:require
   [page :as p]
   [routes]))

(def page (p/page routes/gallery "Gallery" [:h1 "Gallery"]
                  [:div.gallery-item  (p/image "test" "") [:p "hello"]]))
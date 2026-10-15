(ns gallery
  (:require
   [page :as p]
   [routes]
   [strings]))

(def page (p/page
           routes/gallery
           (strings/gallery-page-title)
           [:h1 (strings/gallery-page-title)]
           [:div.gallery-item  (p/image "test" "") [:p "hello"]]))
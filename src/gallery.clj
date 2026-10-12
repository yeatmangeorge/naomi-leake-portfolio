(ns gallery 
  (:require
    [page :as p]))

(def url "gallery")
(def page (p/page url "Gallery" [:h1 "Gallery"]
                  [:div.gallery-item "hello"]))
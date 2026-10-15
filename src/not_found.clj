(ns not-found
  (:require [page :as p]
            [routes]
            [strings]))

(def page
  (p/page
   routes/not-found
   (strings/not-found-page-title)
   [:h1 (strings/not-found-page-body)]
   [:p (strings/not-found-page-body)]))
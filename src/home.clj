(ns home
  (:require [page :as p]
            [routes]
            [strings]))

(def page
  (p/page routes/home (strings/home-page-title)))
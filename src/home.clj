(ns home
  (:require [page :as p]
            [routes]))


(def page
  (p/page routes/home "Naomi Leake"
          [:h1 "Hello, World!"]))
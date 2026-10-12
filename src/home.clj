(ns home
  (:require [page :as p]))

(def url "")

(def page
  (p/page url "Naomi Leake"
          [:h1 "Hello, World!"]))
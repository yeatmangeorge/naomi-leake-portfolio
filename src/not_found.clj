(ns not-found
  (:require [page :as p]))

(def url "404")

(def page
  (p/page url "Not Found" [:h1 "Not Found"]))
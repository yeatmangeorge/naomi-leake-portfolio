(ns page
  (:require 
   [navbar]
   [hiccup2.core :as h]))

(defn page [url title & body]
  (str "<!doctype html>"
       (h/html
        [:html {:lang "en"}
         [:head
          [:meta {:charset "utf-8"}]
          [:meta {:name "viewport"
                  :content "width=device-width, initial-scale=1"}]
          [:title title]
          [:link {:rel "stylesheet"
                  :href "/style/style.css"}]]
         (into [:body]
               (concat [(navbar/navbar url)] body))])))

(defn image [name description]
  [:img {:src (str "image/" name ".webp") :alt description}])
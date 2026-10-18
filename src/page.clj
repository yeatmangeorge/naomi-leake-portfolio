(ns page
  (:require
   [hiccup2.core :as h]
   [navbar]
   [routes]))

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
                  :href "https://fonts.googleapis.com/css2?family=Cormorant+Garamond:wght@300..700&display=swap"}]
          [:link {:rel "stylesheet"
                  :href (str routes/base-path "/style/style.css")}]]
         [:body
          (navbar/navbar url)
          (into [:div.main] body)
          [:script {:src (str routes/base-path "/js/slideshow.js")
                    :defer true}]]])))

(defn image [name description]
  [:img {:src (str routes/base-path "/image/" name ".webp") :alt description}])

(defn slideshow [& image-urls]
  [:div.slideshow
   (for [[idx url] (map-indexed vector image-urls)]
     [:img.slideshow-image
      {:src url
       :class (when (zero? idx) "active")
       :alt ""}])])
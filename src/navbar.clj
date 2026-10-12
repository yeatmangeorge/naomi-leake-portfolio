(ns navbar
  (:require
   [routes]))

(defn navbar-item [url title selected?]
  [:a {:href url}
   [:div.navbar-item
    {:class (when selected? "selected")}
    title]])

(defn navbar-items [current-page-url]
  (map (fn [[url title]]
         (navbar-item url title (= url current-page-url)))
       [[routes/home "Home"]
        [routes/gallery "Gallery"]]))

(defn navbar [current-page-url]
  [:div.navbar
   (navbar-items current-page-url)])
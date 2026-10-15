
(ns navbar
  (:require
   [routes]
   [strings]))

(defn navbar-item [url title selected?]
  [:a.navbar-item
   {:href url
    :class (when selected? "selected")}
   title])

(defn navbar-items [current-page-url]
  (map (fn [[url title]]
         (navbar-item url title (= url current-page-url)))
       [[routes/home (strings/home-page-title)]
        [routes/gallery (strings/gallery-page-title)]
        [routes/bio (strings/bio-page-title)]
        [routes/contact (strings/contact-page-title)]]))

(defn navbar [current-page-url]
  [:nav.navbar
   [:a.navbar-brand
    {:href routes/home
     :aria-label (strings/home-page-title)}
    (strings/website-title)]

   [:div.navbar-links
    (navbar-items current-page-url)]

   [:details.navbar-mobile
    [:summary.navbar-toggle
     {:aria-label (strings/toggle-navigation-msg)}
     [:span]
     [:span]
     [:span]]

    [:div.navbar-mobile-links
     (navbar-items current-page-url)]]])

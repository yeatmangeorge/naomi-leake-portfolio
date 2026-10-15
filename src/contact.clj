(ns contact
  (:require
   [page]
   [routes]
   [strings]))

(def page (page/page
           routes/contact
           (strings/contact-page-title)
           [:h1 (strings/contact-page-title)]
           [:h2 (strings/phone-number-title)]
           [:p (strings/phone-number)]
           [:h2 (strings/email-title)]
           [:p (strings/email)]))
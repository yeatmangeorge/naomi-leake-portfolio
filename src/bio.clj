(ns bio
  (:require
   [page]
   [routes]
   [strings]))

(def page (page/page
           routes/bio
           (strings/bio-page-title)
           [:h1 (strings/bio-page-title)]
           [:p "Over the years my work has evolved and changed from the more traditional production of artefacts, such as public sculpture, into collaborative projects that provoke understanding of and engagement with regenerative social and environmental cultures."]
           [:h2 "Ongoing Projects"]
           [:h3 "Co-founder of Grow Lewisham"]
           [:p
            [:a {:href "https://www.growlewisham.com"} "Grow Lewisham Website"]
            " ~ "
            [:a {:href "https://www.instagram.com/growlewisham"}  "Grow Lewisham Instagram"]]
           [:p "A collective of Lewisham residents concerned about the climate crisis and it’s impact on food security."]
           [:p "We develop and increase regenerative growing spaces across the borough of Lewisham to ensure ALL Lewisham residents have access to these spaces locally so we can educate, feed and strengthen our communities. We currently have three sites and are discussing three more with the council. We host free and affordable workshops by skilled local practitioners. We use the permaculture principles of Earth Care, People Care and Fair Share in every project."]
           [:p "We featured in the art show " [:a {:href "https://www.southbankcentre.co.uk/whats-on/art-exhibitions/dear-earth-art-and-hope-time-crisis?eventId=930988"} "Dear Earth at the Hayward Gallery"]]))

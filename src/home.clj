(ns home
  (:require [page :as p]
            [routes]
            [strings]))

(def page
  (p/page
   routes/home
   (strings/home-page-title)
   (p/slideshow
    "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%2Fid%2FOIP.GHoWmmJt1ekYMUyg4DHo5wHaE8%3Fr%3D0%26pid%3DApi&f=1&ipt=7c6120e402bc44d722f45eb371d1d29b99cdd559b883cd74e92c16c46492ef31&ipo=images"
    "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%2Fid%2FOIP.sOu1bKZ1cvjl4vPEqN8KzQHaJ4%3Fr%3D0%26pid%3DApi&f=1&ipt=8f57c1ba32e0778ed9b7d7a788413df06c4af8131daaec98b48a6129fc08abbd&ipo=images")))
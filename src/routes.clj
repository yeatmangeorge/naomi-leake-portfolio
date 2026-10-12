(ns routes)

(def base-path (or (System/getenv "BASE_PATH") ""))

(defmacro defurl [name path]
  `(def ~name (str base-path ~path)))

(defn relative-path [url]
  (subs url (count base-path)))

(defurl gallery "/gallery")
(defurl home "/")
(defurl not-found "/404")
(defurl bio "/meet-naomi")
(defurl contact "/contact")
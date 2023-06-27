(ns user
  (:require [nextjournal.clerk :as clerk]))

(clerk/serve! {:port 6655 :browse true})
(clerk/show! "README.md")

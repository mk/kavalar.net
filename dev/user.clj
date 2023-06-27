(ns user
  (:require [nextjournal.clerk :as clerk]
            [babashka.fs :as fs]))

(clerk/serve! {:port 6655 :browse true})
(clerk/show! "README.md")


#_(.stop server 0)

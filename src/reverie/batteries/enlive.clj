(ns reverie.batteries.enlive
  "render-fn for enlive/hiccup mix"
  (:require
   [hiccup.compiler        :refer [render-html]]
   [net.cgrand.enlive-html :refer [emit*]]))

(defn render-fn [data]
  (cond
    ;; enlive data?
    (and (map? data)
         (contains? data :tag)
         (contains? data :attrs)
         (contains? data :content)) (emit* data)

    ;; assume hiccup data
    :else (render-html data)))

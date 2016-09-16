(ns reverie.batteries.enlive
  "render-fn for enlive/hiccup mix"
  (:require
   [net.cgrand.enlive-html :refer [emit*]]
   [reverie.render :refer [get-render-fn]]))



(defmethod get-render-fn :enlive [_]
  net.cgrand.enlive-html/emit*)

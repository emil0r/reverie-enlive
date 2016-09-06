# reverie-enlive

Render function for reverie/CMS that supports enlive.

## Usage


```clojure
   [reverie-enlive "0.1.0]
```

```clojure

(ns your-site.init
  (:require
    ;; imports here
    [reverie.batteries.enlive :refer [render-fn]]
    ;; more imports here...
    ))
        
(defn system-map [{:keys [render-fn
                         ;; more variables here...
                         ]}]
                         
                         (component/system-map
                         
                           ;; other components
                           
                           ;; site component... send in the render-fn here
                           :site (component/using (site/site {:host-names host-names
                                        :render-fn render-fn})
                            [:database :cachemanager])
                         ))
                         
                         
                         
(defn init [settings-path]
 ;; stuff done
 
  (reset! system (component/start
                    (system-map
                     {;; stuff
                      :render-fn render-fn
                      ;; more stuff
                      }))))
```


## License

Copyright © 2016 Emil Bengtsson

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

---

Coram Deo

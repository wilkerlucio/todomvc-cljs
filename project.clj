(defproject todomvc-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [org.clojure/clojurescript "1.9.456"]
                 [figwheel-sidecar "0.5.9"]
                 [binaryage/devtools "0.9.0"]]

  :figwheel {:css-dirs ["resources/public/css"]}

  :cljsbuild {:builds [{:id           "dev"
                        :figwheel     true
                        :source-paths ["src"]
                        :compiler     {:main                 todomvc-cljs.core
                                       :output-to            "resources/public/js/todomvc.js"
                                       :output-dir           "resources/public/js/dev"
                                       :asset-path           "js/dev"
                                       :source-map-timestamp true
                                       :preloads             [devtools.preload]
                                       :optimizations        :none}}]})

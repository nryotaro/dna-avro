(defproject rna "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha20"]
                 [com.damballa/abracad "0.4.13"]
                 [clj-time "0.14.0"]
                 [cheshire "5.8.0"]]
  :profiles {:dev {:resource-paths ["dev-resources"]}})

(defproject rna "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha20"]
                 [com.damballa/abracad "0.4.13"]
                 [me.raynes/fs "1.4.6"]
                 [clj-time "0.14.0"]
                 [cheshire "5.8.0"]
                 [org.clojure/data.csv "0.1.4"]
                 [http-kit "2.2.0"]]
  :profiles {:dev {:resource-paths ["dev-resources"]}})

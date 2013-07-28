(ns cljs.sample)

(defn xs  
  "It's gooooooooooooood"
  [x]
  {1 2, 3 4})
(def xs2 {1 2, 3 4})

; (deftest pairs-of-values
;    (let [args ["--server" "localhost"
;                "--port" "8080"
;                "--environment" "production"]]
;       (is (= {:server "localhost"
;               :port "8080"
;               :environment "production"}
;               (parse-args args)))))

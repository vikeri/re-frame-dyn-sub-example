(ns re-frame-testing.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame :refer [subscribe]]))

(re-frame/reg-sub
 :count
 (fn [db]
   (println "Count: " db)
   db))

(re-frame/reg-sub
  :times-ten
  :<- [:count]
  (fn [count2 _ [count]]
    (println "Times-ten Dynamic: " count " Input: " count2)
    (* 10 count)))

(re-frame/reg-sub
  :composed
  (fn [_ _]
    (subscribe [:times-ten] [(subscribe [:count])]))
  (fn [times-ten _]
    (println "Composed" (inc times-ten))
    (inc times-ten)))
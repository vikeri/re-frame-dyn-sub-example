(ns re-frame-testing.views
    (:require [re-frame.core :as re-frame]))

(defn main-panel []
  (let [count (re-frame/subscribe [:composed])]
    (fn []
      [:div {:on-click #(re-frame/dispatch [:inc])} "Count: " @count])))

(ns re-frame-testing.handlers
    (:require [re-frame.core :as re-frame]
              [re-frame-testing.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
  :inc
  (fn [db _]
    (inc db)))

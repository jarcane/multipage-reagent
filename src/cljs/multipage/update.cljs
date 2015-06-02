(ns multipage.update
  (:require [reagent.core :as reagent :refer [atom]]
            [multipage.appdb :refer [appdb]]))

(defn input-data []
  [:input {:type "text"
           :value @appdb
           :on-change #(reset! appdb (-> % .-target .-value))}])

(defn home-page []
  [:div [:h2 "Welcome to multipage"]
   [:div [:p "This is the data: " @appdb]]
   [:div [:p "Change the data: " [input-data]]]
   [:div [:a {:href "#/view1"} "go to view1 page"]]
   [:div [:a {:href "#/view2"} "go to view2 page"]]])
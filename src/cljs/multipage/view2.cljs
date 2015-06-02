(ns multipage.view2
  (:require [reagent.core :as reagent :refer [atom]]
            [multipage.appdb :refer [appdb]]))

(defn view2 []
  [:div [:h2 "About multipage"]
   [:div [:p "This is the data: " @appdb]]
   [:div [:a {:href "#/"} "go to the home page"]]])
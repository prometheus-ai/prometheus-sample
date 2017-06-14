(ns prometheus-sample.messages
  (:gen-class)
  (:require [fb-messenger.send :as send]
            [fb-messenger.templates :as templates]))

(defn postback-fallback
  [sender-id]
  (send/send-message sender-id (templates/text-message "Sorry, I don't know how to handle that postback")))

(defn referral-fallback
  [sender-id]
  (send/send-message sender-id (templates/text-message "Sorry, I don't know how to handle that referral")))

(defn text-fallback
  [sender-id]
  (send/send-message sender-id (templates/text-message "Hello World!")))

(defn image
  [sender-id]
  (send/send-message sender-id (templates/image-message "https://images.unsplash.com/photo-1461053148709-c980d9e5d8d9")))

(defn attachment-fallback
  [sender-id]
  (send/send-message sender-id (templates/text-message "Thanks for your attachment.")))

(defn quick-reply-fallback
  [sender-id]
  (send/send-message sender-id (templates/text-message "Sorry, I don't know how to handle that quick reply")))

(ns onyx.compression.nippy
  (:require [taoensso.nippy :as nippy]))

(defn compress [x]
  (nippy/freeze x {:compressor nil}))

(defn decompress [x]
  (nippy/thaw x {:v1-compatibility? false}))


(ns cljs-web3.async.eth
  (:refer-clojure :exclude [filter])
  (:require
    [cljs-web3.eth :as web3-eth]
    [cljs-web3.utils :as u]))

(def default-account web3-eth/default-account)
(def set-default-account! web3-eth/set-default-account!)
(def default-block web3-eth/default-block)
(def set-default-block! web3-eth/set-default-block!)
(def syncing (u/create-async-fn web3-eth/syncing))
(def syncing? (u/create-async-fn web3-eth/syncing?))
(def coinbase (u/create-async-fn web3-eth/coinbase))
(def mining? (u/create-async-fn web3-eth/mining?))
(def gas-price (u/create-async-fn web3-eth/gas-price))
(def accounts (u/create-async-fn web3-eth/accounts))
(def block-number (u/create-async-fn web3-eth/block-number))
(def register (u/create-async-fn web3-eth/register))
(def unregister (u/create-async-fn web3-eth/unregister))
(def get-balance (u/create-async-fn web3-eth/get-balance))
(def get-storage-at (u/create-async-fn web3-eth/get-storage-at))
(def get-code (u/create-async-fn web3-eth/get-code))
(def get-block (u/create-async-fn web3-eth/get-block))
(def get-block-transaction-count (u/create-async-fn web3-eth/get-block-transaction-count))
(def get-uncle (u/create-async-fn web3-eth/get-uncle))
(def get-transaction (u/create-async-fn web3-eth/get-transaction))
(def get-transaction-from-block (u/create-async-fn web3-eth/get-transaction-from-block))
(def get-transaction-receipt (u/create-async-fn web3-eth/get-transaction-receipt))
(def get-transaction-count (u/create-async-fn web3-eth/get-transaction-count))
(def send-transaction! (u/create-async-fn web3-eth/send-transaction!))
(def send-raw-transaction! (u/create-async-fn web3-eth/send-raw-transaction!))
(def send-iban-transaction! (u/create-async-fn web3-eth/send-iban-transaction!))
(def sign (u/create-async-fn web3-eth/sign))
(def sign-transaction (u/create-async-fn web3-eth/sign-transaction))
(def call! (u/create-async-fn web3-eth/call!))
(def estimate-gas (u/create-async-fn web3-eth/estimate-gas))
(def filter (u/create-async-fn web3-eth/filter))
(def get-compilers (u/create-async-fn web3-eth/get-compilers))
(def compile-solidity (u/create-async-fn web3-eth/compile-solidity))
(def compile-lll (u/create-async-fn web3-eth/compile-lll))
(def compile-serpent (u/create-async-fn web3-eth/compile-serpent))
(def namereg web3-eth/namereg)
(def contract web3-eth/contract)
(def contract-at web3-eth/contract-at)
(def contract-new (u/create-async-fn web3-eth/contract-new))
(def contract-call (u/create-async-fn web3-eth/contract-call))
(def stop-watching! (u/create-async-fn web3-eth/stop-watching!))
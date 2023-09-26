package com.coin.price.checker;

import org.jsoup.Jsoup;

import java.io.IOException;

public class CoinPrice {
    public static void main(String[] args) {
        System.out.println("Welcome to digital coin price checker");

        final String BTC = "https://api.coinbase.com/v2/prices/BTC-USD/spot";
        try {
            String val = Jsoup.connect(BTC).ignoreContentType(true).execute().body();
            System.out.println(val);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

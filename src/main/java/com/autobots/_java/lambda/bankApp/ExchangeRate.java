package com.autobots._java.lambda.bankApp;

import java.util.Map;

public class ExchangeRate {
   public static double convert(double amount, Currency from, Currency to){
       if(from == to) return amount;
       Map<Currency, Double> toUsd = Map.of(
               Currency.USD, 1.0,
               Currency.EUR, 1.1,
               Currency.KGS, 0.011
       );
       double usd = amount * toUsd.get(from);
       return usd/toUsd.get(to);

   }
}

package com.github.alphacode.alphacore.api.algorithm;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author AlphaCode:JasonAlpha
 * 本部分功能未完成
 */
public class MainAlgorithm {
    public <BidDecimal> void HighAccuracy(double x) {
        final double DEF_DIV_SCALE = x;
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = (BigDecimal) scanner.nextBigDecimal();
        BidDecimal b = (BidDecimal) scanner.nextBigDecimal();
        System.out.println(a.add((BigDecimal) b));
    }

}

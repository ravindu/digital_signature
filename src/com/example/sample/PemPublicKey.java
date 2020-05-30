package com.example.sample;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class PemPublicKey {

    public static void main(String[] args) throws InvalidKeySpecException, NoSuchAlgorithmException {

        String samplePublicKeyText = "-----BEGIN PUBLIC KEY-----\n" +
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1WiUCkXnnUGIP3tbQaIB\n" +
                "4R6qzF7kqYNz2WFIne78ICfwzsKtPuKzpRoAkjo+HQnTN8NMqFg++YFNn7ZNc9Ch\n" +
                "I/He5pW83+N5ejrgavWWCih3WveMxObOCl53BGZPEVka8v26XjZimS71O3dXG14F\n" +
                "OVBnFySqilUDTJ8Tq7BLBjoBWDqOnONJ53lxNzp+tIhcoT0Nb8X75GvD4MMPdIBH\n" +
                "8U7WlWGlpCrjA1SY1jKro6tTF4X7c2+/b/P+vU5Ki5Cz6c99o1SPXBJo5ohUZ/SR\n" +
                "nn+EiXHT/4whEervZRq1TNb2YezrhDHbjb5JuMv007w85xoefBoEmXnlLLW+/wjD\n" +
                "iQIDAQAB\n" +
                "-----END PUBLIC KEY-----";

        samplePublicKeyText = samplePublicKeyText.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");;

        KeyFactory kf = KeyFactory.getInstance("RSA");

        X509EncodedKeySpec keySpecX509 = new X509EncodedKeySpec(Base64.getDecoder().decode(samplePublicKeyText));
        RSAPublicKey pubKey = (RSAPublicKey) kf.generatePublic(keySpecX509);

        System.out.println(pubKey.toString());
    }
}

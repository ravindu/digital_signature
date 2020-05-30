package com.example.sample;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import org.apache.commons.codec.binary.Base64;


public class RSAPrivateKey {

    public static void main(String [] args) throws NoSuchAlgorithmException, InvalidKeySpecException {

        String samplePrivateKeyText ="-----BEGIN PRIVATE KEY-----\n" +
                "vnjdkfjHSMv+aAEBuXjOPmtNZcbrurH3aYMeFUsiOjMf+ToIshYafMy\n" +
                "xn0p01GCVAvAyaghu7/pB84HH5Xhx8bA5EiI+2NDPn2FHW+rkGlwSzkcphvVEois\n" +
                "Fw4xb7DWjkCBzmsZuc83awJL8Eryxug+3oyGZcIvFD4uMJRI8lPBFwOeHHNaAvZv\n" +
                "9m2fiM8iXoDFBHJDVDVDBHVJBfVywSXqnmTZCeU2gQKBgQDynKCZ9qlrhaqekAjP\n" +
                "4bbMYkxKWrthhN7b9phGmTRuyplbPDRc07nJx0FBd0s20wFMq8e0W2+GXE5Mi1Sf\n" +
                "xG4OnGJNRIOVJRVRNVRKJRVNRJKKVCv7Geq0Hm0MVfeHg9J+KntzMHib9pPEcAhu\n" +
                "IkiGZy7hpAc9YmK7tEaTFGOQsyIpf8BsI27onJ/VN2yeyLpE3qa7JfF4hkcAGCb4\n" +
                "T+B8dRh3krBegg4vM0NToN09NN/TNkTh9QXu8FvigCsyVCCkLWTRCJboVG2Z45tf\n" +
                "Q94Lam8vnsw+jddcF1CEp6L7/Q==\n" +
                "-----END PRIVATE KEY-----";

        samplePrivateKeyText = samplePrivateKeyText.replaceAll("\\n", "").replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "");

        KeyFactory kf = KeyFactory.getInstance("RSA");

        PKCS8EncodedKeySpec keySpecPKCS8 = new PKCS8EncodedKeySpec(Base64.decodeBase64(samplePrivateKeyText));
        PrivateKey privKey = kf.generatePrivate(keySpecPKCS8);
        System.out.println(privKey);
    }
}

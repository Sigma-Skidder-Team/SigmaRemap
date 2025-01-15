// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.logging.log4j.Logger;

public class Class9359
{
    private static final Logger field40143;
    
    public static SecretKey method34697() {
        try {
            final KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            return instance.generateKey();
        }
        catch (final NoSuchAlgorithmException cause) {
            throw new Error(cause);
        }
    }
    
    public static KeyPair method34698() {
        try {
            final KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(1024);
            return instance.generateKeyPair();
        }
        catch (final NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            Class9359.field40143.error("Key pair generation failed!");
            return null;
        }
    }
    
    public static byte[] method34699(final String s, final PublicKey publicKey, final SecretKey secretKey) {
        try {
            return method34700("SHA-1", new byte[][] { s.getBytes("ISO_8859_1"), secretKey.getEncoded(), publicKey.getEncoded() });
        }
        catch (final UnsupportedEncodingException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static byte[] method34700(final String algorithm, final byte[]... array) {
        try {
            final MessageDigest instance = MessageDigest.getInstance(algorithm);
            for (int length = array.length, i = 0; i < length; ++i) {
                instance.update(array[i]);
            }
            return instance.digest();
        }
        catch (final NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static PublicKey method34701(final byte[] encodedKey) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(encodedKey));
        }
        catch (final NoSuchAlgorithmException ex) {}
        catch (final InvalidKeySpecException ex2) {}
        Class9359.field40143.error("Public key reconstitute failed!");
        return null;
    }
    
    public static SecretKey method34702(final PrivateKey privateKey, final byte[] array) {
        return new SecretKeySpec(method34704(privateKey, array), "AES");
    }
    
    public static byte[] method34703(final Key key, final byte[] array) {
        return method34705(1, key, array);
    }
    
    public static byte[] method34704(final Key key, final byte[] array) {
        return method34705(2, key, array);
    }
    
    private static byte[] method34705(final int n, final Key key, final byte[] input) {
        try {
            return method34706(n, key.getAlgorithm(), key).doFinal(input);
        }
        catch (final IllegalBlockSizeException ex) {
            ex.printStackTrace();
        }
        catch (final BadPaddingException ex2) {
            ex2.printStackTrace();
        }
        Class9359.field40143.error("Cipher data failed!");
        return null;
    }
    
    private static Cipher method34706(final int opmode, final String transformation, final Key key) {
        try {
            final Cipher instance = Cipher.getInstance(transformation);
            instance.init(opmode, key);
            return instance;
        }
        catch (final InvalidKeyException ex) {
            ex.printStackTrace();
        }
        catch (final NoSuchAlgorithmException ex2) {
            ex2.printStackTrace();
        }
        catch (final NoSuchPaddingException ex3) {
            ex3.printStackTrace();
        }
        Class9359.field40143.error("Cipher creation failed!");
        return null;
    }
    
    public static Cipher method34707(final int opmode, final Key key) {
        try {
            final Cipher instance = Cipher.getInstance("AES/CFB8/NoPadding");
            instance.init(opmode, key, new IvParameterSpec(key.getEncoded()));
            return instance;
        }
        catch (final GeneralSecurityException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    static {
        field40143 = LogManager.getLogger();
    }
}

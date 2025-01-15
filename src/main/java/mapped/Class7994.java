// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class Class7994
{
    public String field32930;
    public String field32931;
    public String field32932;
    
    public Class7994(final String field32930, final String field32931, final String field32932) {
        this.field32930 = field32930;
        this.field32931 = field32931;
        this.field32932 = field32932;
    }
    
    public Class7994(final byte[] input) {
        final byte[] copy = Arrays.copyOf(Class7977.method25920("mcAzMFSvCM6wFCHcgzOn"), 16);
        final byte[] bytes = "jelloconnectvect".getBytes();
        final SecretKeySpec key = new SecretKeySpec(copy, "AES");
        try {
            final Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(2, key, new IvParameterSpec(bytes));
            final Class4405 class4405 = new Class4405(new String(instance.doFinal(input)));
            if (class4405.method13269("username")) {
                this.field32930 = class4405.method13268("username");
            }
            if (class4405.method13269("authToken")) {
                this.field32931 = class4405.method13268("authToken");
            }
            if (class4405.method13269("agoraToken")) {
                this.field32932 = class4405.method13268("agoraToken");
            }
        }
        catch (final InvalidKeyException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchPaddingException | Class2381 | IllegalBlockSizeException | BadPaddingException ex) {}
    }
    
    public byte[] method26158() {
        final byte[] copy = Arrays.copyOf(Class7977.method25920("mcAzMFSvCM6wFCHcgzOn"), 16);
        final byte[] bytes = "jelloconnectvect".getBytes();
        final SecretKeySpec key = new SecretKeySpec(copy, "AES");
        try {
            final Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(1, key, new IvParameterSpec(bytes));
            return instance.doFinal(this.method26159().toString().getBytes());
        }
        catch (final NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException ex) {
            ((Throwable)ex).printStackTrace();
            return null;
        }
    }
    
    public Class4405 method26159() {
        final Class4405 class4405 = new Class4405();
        class4405.method13301("username", this.field32930);
        class4405.method13301("authToken", this.field32931);
        class4405.method13301("agoraToken", this.field32932);
        return class4405;
    }
}

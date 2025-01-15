// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import java.security.MessageDigest;

public final class Class1708 extends Class1703
{
    private final MessageDigest field9595;
    private final Mac field9596;
    
    public static Class1708 method6058(final Class1676 class1676) {
        return new Class1708(class1676, "MD5");
    }
    
    public static Class1708 method6059(final Class1676 class1676) {
        return new Class1708(class1676, "SHA-1");
    }
    
    public static Class1708 method6060(final Class1676 class1676) {
        return new Class1708(class1676, "SHA-256");
    }
    
    public static Class1708 method6061(final Class1676 class1676) {
        return new Class1708(class1676, "SHA-512");
    }
    
    public static Class1708 method6062(final Class1676 class1676, final Class1929 class1677) {
        return new Class1708(class1676, class1677, "HmacSHA1");
    }
    
    public static Class1708 method6063(final Class1676 class1676, final Class1929 class1677) {
        return new Class1708(class1676, class1677, "HmacSHA256");
    }
    
    public static Class1708 method6064(final Class1676 class1676, final Class1929 class1677) {
        return new Class1708(class1676, class1677, "HmacSHA512");
    }
    
    private Class1708(final Class1676 class1676, final String algorithm) {
        super(class1676);
        try {
            this.field9595 = MessageDigest.getInstance(algorithm);
            this.field9596 = null;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError();
        }
    }
    
    private Class1708(final Class1676 class1676, final Class1929 class1677, final String s) {
        super(class1676);
        try {
            (this.field9596 = Mac.getInstance(s)).init(new SecretKeySpec(class1677.method7767(), s));
            this.field9595 = null;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError();
        }
        catch (final InvalidKeyException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    @Override
    public void method5920(final Class1680 class1680, final long n) throws IOException {
        Class9476.method35277(class1680.field9512, 0L, n);
        long n2 = 0L;
        int n3;
        for (Class9258 class1681 = class1680.field9511; n2 < n; n2 += n3, class1681 = class1681.field39718) {
            n3 = (int)Math.min(n - n2, class1681.field39715 - class1681.field39714);
            if (this.field9595 == null) {
                this.field9596.update(class1681.field39713, class1681.field39714, n3);
            }
            else {
                this.field9595.update(class1681.field39713, class1681.field39714, n3);
            }
        }
        super.method5920(class1680, n);
    }
    
    public Class1929 method6065() {
        return Class1929.method7738((this.field9595 == null) ? this.field9596.doFinal() : this.field9595.digest());
    }
}

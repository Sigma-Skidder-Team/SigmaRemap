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

public final class Class1694 extends Class1692
{
    private final MessageDigest field9558;
    private final Mac field9559;
    
    public static Class1694 method6049(final Class1682 class1682) {
        return new Class1694(class1682, "MD5");
    }
    
    public static Class1694 method6050(final Class1682 class1682) {
        return new Class1694(class1682, "SHA-1");
    }
    
    public static Class1694 method6051(final Class1682 class1682) {
        return new Class1694(class1682, "SHA-256");
    }
    
    public static Class1694 method6052(final Class1682 class1682, final Class1929 class1683) {
        return new Class1694(class1682, class1683, "HmacSHA1");
    }
    
    public static Class1694 method6053(final Class1682 class1682, final Class1929 class1683) {
        return new Class1694(class1682, class1683, "HmacSHA256");
    }
    
    private Class1694(final Class1682 class1682, final String algorithm) {
        super(class1682);
        try {
            this.field9558 = MessageDigest.getInstance(algorithm);
            this.field9559 = null;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError();
        }
    }
    
    private Class1694(final Class1682 class1682, final Class1929 class1683, final String s) {
        super(class1682);
        try {
            (this.field9559 = Mac.getInstance(s)).init(new SecretKeySpec(class1683.method7767(), s));
            this.field9558 = null;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError();
        }
        catch (final InvalidKeyException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        final long method6014 = super.method6014(class1680, n);
        if (method6014 != -1L) {
            long n2;
            long field9512;
            Class9258 class1681;
            for (n2 = class1680.field9512 - method6014, field9512 = class1680.field9512, class1681 = class1680.field9511; field9512 > n2; field9512 -= class1681.field39715 - class1681.field39714) {
                class1681 = class1681.field39719;
            }
            while (field9512 < class1680.field9512) {
                final int n3 = (int)(class1681.field39714 + n2 - field9512);
                if (this.field9558 == null) {
                    this.field9559.update(class1681.field39713, n3, class1681.field39715 - n3);
                }
                else {
                    this.field9558.update(class1681.field39713, n3, class1681.field39715 - n3);
                }
                field9512 = (n2 = field9512 + (class1681.field39715 - class1681.field39714));
                class1681 = class1681.field39718;
            }
        }
        return method6014;
    }
    
    public Class1929 method6054() {
        return Class1929.method7738((this.field9558 == null) ? this.field9559.doFinal() : this.field9558.digest());
    }
}

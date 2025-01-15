// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.Charset;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;
import java.io.Reader;
import java.io.Closeable;

public abstract class Class1760 implements Closeable
{
    private Reader field9805;
    
    @Nullable
    public abstract Class8991 method6282();
    
    public abstract long method6283();
    
    public final InputStream method6284() {
        return this.method6285().method5954();
    }
    
    public abstract Class1681 method6285();
    
    public final byte[] method6286() throws IOException {
        final long method6283 = this.method6283();
        if (method6283 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + method6283);
        }
        final Class1681 method6284 = this.method6285();
        byte[] method6285;
        try {
            method6285 = method6284.method5989();
        }
        finally {
            Class7690.method24432(method6284);
        }
        if (method6283 != -1L && method6283 != method6285.length) {
            throw new IOException("Content-Length (" + method6283 + ") and stream length (" + method6285.length + ") disagree");
        }
        return method6285;
    }
    
    public final Reader method6287() {
        final Reader field9805 = this.field9805;
        return (field9805 == null) ? (this.field9805 = new Class1764(this.method6285(), this.method6289())) : field9805;
    }
    
    public final String method6288() throws IOException {
        final Class1681 method6285 = this.method6285();
        try {
            return method6285.method5982(Class7690.method24457(method6285, this.method6289()));
        }
        finally {
            Class7690.method24432(method6285);
        }
    }
    
    private Charset method6289() {
        final Class8991 method6282 = this.method6282();
        return (method6282 == null) ? Class7690.field30549 : method6282.method32081(Class7690.field30549);
    }
    
    @Override
    public void close() {
        Class7690.method24432(this.method6285());
    }
    
    public static Class1760 method6290(Class8991 method32077, final String s) {
        Charset charset = Class7690.field30549;
        if (method32077 != null) {
            charset = method32077.method32080();
            if (charset == null) {
                charset = Class7690.field30549;
                method32077 = Class8991.method32077(method32077 + "; charset=utf-8");
            }
        }
        final Class1680 method32078 = new Class1680().method6000(s, charset);
        return method6292(method32077, method32078.method5949(), method32078);
    }
    
    public static Class1760 method6291(final Class8991 class8991, final byte[] array) {
        return method6292(class8991, array.length, new Class1680().method6002(array));
    }
    
    public static Class1760 method6292(final Class8991 class8991, final long n, final Class1681 class8992) {
        if (class8992 != null) {
            return new Class1762(class8991, n, class8992);
        }
        throw new NullPointerException("source == null");
    }
}

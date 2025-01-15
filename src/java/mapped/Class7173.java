// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.File;
import java.nio.charset.Charset;
import java.io.IOException;
import javax.annotation.Nullable;

public abstract class Class7173
{
    @Nullable
    public abstract Class8991 method21939();
    
    public long method21940() throws IOException {
        return -1L;
    }
    
    public abstract void method21941(final Class1679 p0) throws IOException;
    
    public static Class7173 method21943(Class8991 method32077, final String s) {
        Charset charset = Class7690.field30549;
        if (method32077 != null) {
            charset = method32077.method32080();
            if (charset == null) {
                charset = Class7690.field30549;
                method32077 = Class8991.method32077(method32077 + "; charset=utf-8");
            }
        }
        return method21945(method32077, s.getBytes(charset));
    }
    
    public static Class7173 method21944(final Class8991 class8991, final Class1929 class8992) {
        return new Class7175(class8991, class8992);
    }
    
    public static Class7173 method21945(final Class8991 class8991, final byte[] array) {
        return method21946(class8991, array, 0, array.length);
    }
    
    public static Class7173 method21946(final Class8991 class8991, final byte[] array, final int n, final int n2) {
        if (array != null) {
            Class7690.method24430(array.length, n, n2);
            return new Class7176(class8991, n2, array, n);
        }
        throw new NullPointerException("content == null");
    }
    
    public static Class7173 method21947(final Class8991 class8991, final File file) {
        if (file != null) {
            return new Class7174(class8991, file);
        }
        throw new NullPointerException("content == null");
    }
}

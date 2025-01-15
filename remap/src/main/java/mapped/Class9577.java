// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class9577
{
    public static Class7776 method35873(final String s, final InputStream inputStream) throws IOException {
        return method35876(s, inputStream, false, 9729);
    }
    
    public static Class7776 method35874(final String s, final InputStream inputStream, final boolean b) throws IOException {
        return method35876(s, inputStream, b, 9729);
    }
    
    public static Class7776 method35875(final String s, final InputStream inputStream, final int n) throws IOException {
        return method35876(s, inputStream, false, n);
    }
    
    public static Class7776 method35876(final String str, final InputStream inputStream, final boolean b, final int n) throws IOException {
        return Class7649.method24214().method24226(inputStream, inputStream.toString() + "." + str, b, n);
    }
}

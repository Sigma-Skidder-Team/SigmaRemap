// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class Class7632
{
    private Class7632() {
    }
    
    public static String method23986(final String s, final String s2) {
        return method23987(s, s2, StandardCharsets.ISO_8859_1);
    }
    
    public static String method23987(final String str, final String str2, final Charset charset) {
        return "Basic " + Class1929.method7738((str + ":" + str2).getBytes(charset)).method7745();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.UnsupportedEncodingException;

public class Class2364 extends RuntimeException
{
    private static String[] field14152;
    private final UnsupportedEncodingException field14153;
    
    public Class2364(final UnsupportedEncodingException field14153) {
        if (field14153 != null) {
            this.field14153 = field14153;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public UnsupportedEncodingException method9499() {
        return this.field14153;
    }
}

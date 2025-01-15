// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.cache.CacheLoader;

public class Class6047 extends CacheLoader<Class354, Class7990>
{
    private static String[] field24597;
    private final Class1852 field24598;
    private final boolean field24599;
    
    public Class6047(final Class1852 field24598, final boolean field24599) {
        this.field24598 = field24598;
        this.field24599 = field24599;
    }
    
    public Class7990 load(final Class354 class354) throws Exception {
        return new Class7990(this.field24598, class354, this.field24599);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataOutput;

public interface Class41
{
    public static final Class2116 field98 = Class2116.field12320;
    public static final Class2116 field99 = Class2116.field12319;
    public static final Class2116 field100 = Class2116.field12315;
    public static final Class2116 field101 = Class2116.field12321;
    
    void method259(final DataOutput p0) throws IOException;
    
    String toString();
    
    byte method260();
    
    Class6068<?> method261();
    
    Class41 method265();
    
    default String method267() {
        return this.toString();
    }
    
    default Class2250 method268() {
        return this.method263("", 0);
    }
    
    Class2250 method263(final String p0, final int p1);
}

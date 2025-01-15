// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.File;

public class Class8852
{
    private static String[] field37229;
    public final File field37230;
    public final File field37231;
    public final File field37232;
    public final String field37233;
    
    public Class8852(final File field37230, final File field37231, final File field37232, final String field37233) {
        this.field37230 = field37230;
        this.field37231 = field37231;
        this.field37232 = field37232;
        this.field37233 = field37233;
    }
    
    public Class8175 method31008() {
        return (this.field37233 != null) ? new Class8175(this.field37232, this.field37233) : new Class8174(this.field37232);
    }
}

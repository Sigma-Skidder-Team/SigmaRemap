// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class9533
{
    private static String[] field41029;
    private final int field41030;
    private final Class301[] field41031;
    public final /* synthetic */ Class7402 field41032;
    
    private Class9533(final Class7402 field41032, final int field41033) {
        this.field41032 = field41032;
        this.field41030 = field41033;
        final int n = Class7402.method22742(field41032).method11534()[field41033];
        final ArrayList list = new ArrayList();
        for (int i = 0; i < 9; ++i) {
            if ((n >> 8 - i & 0x1) == 0x1) {
                list.add(Class301.values()[i]);
            }
        }
        this.field41031 = (Class301[])list.toArray(new Class301[list.size()]);
    }
    
    public int method35587() {
        return Class7402.method22742(this.field41032).method11528()[this.field41030];
    }
    
    public int method35588() {
        return Class7402.method22742(this.field41032).method11529()[this.field41030];
    }
    
    public int method35589() {
        return Class7402.method22742(this.field41032).method11530()[this.field41030];
    }
    
    public int method35590() {
        return Class7402.method22742(this.field41032).method11531()[this.field41030];
    }
    
    public boolean method35591() {
        return Class7402.method22742(this.field41032).method11532()[this.field41030];
    }
    
    public Class301[] method35592() {
        return this.field41031;
    }
}

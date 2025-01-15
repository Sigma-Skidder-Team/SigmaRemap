// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public final class Class97 implements Iterable
{
    private static String[] field265;
    public final /* synthetic */ Class354 field266;
    public final /* synthetic */ Class354 field267;
    
    public Class97(final Class354 field266, final Class354 field267) {
        this.field266 = field266;
        this.field267 = field267;
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)new Class7247(this);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class7241 implements Iterator<Class7576>
{
    private static String[] field28060;
    public final /* synthetic */ Class8828 field28061;
    public final /* synthetic */ Class6873 field28062;
    
    public Class7241(final Class6873 field28062, final Class8828 field28063) {
        this.field28062 = field28062;
        this.field28061 = field28063;
    }
    
    @Override
    public boolean hasNext() {
        return this.field28061.method30801();
    }
    
    @Override
    public Class7576 next() {
        return this.field28061.method30802();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

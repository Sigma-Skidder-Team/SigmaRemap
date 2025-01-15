// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class7243 implements Iterator<Object>
{
    private static String[] field28067;
    public final /* synthetic */ Class6873 field28068;
    
    public Class7243(final Class6873 field28068) {
        this.field28068 = field28068;
    }
    
    @Override
    public boolean hasNext() {
        return this.field28068.field26926.method19978();
    }
    
    @Override
    public Object next() {
        return this.field28068.field26926.method19979();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

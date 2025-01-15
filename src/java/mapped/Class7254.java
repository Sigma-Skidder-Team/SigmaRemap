// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class7254 implements Iterator<Class6287>
{
    private static String[] field28125;
    public final /* synthetic */ Class7509 field28126;
    public final /* synthetic */ Class6873 field28127;
    
    public Class7254(final Class6873 field28127, final Class7509 field28128) {
        this.field28127 = field28127;
        this.field28126 = field28128;
    }
    
    @Override
    public boolean hasNext() {
        return this.field28126.method23423() != null;
    }
    
    @Override
    public Class6287 next() {
        return this.field28126.method23424();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

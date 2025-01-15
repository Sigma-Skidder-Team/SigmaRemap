// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public interface Class6068<T extends Class41>
{
    T method18123(final DataInput p0, final int p1, final Class7553 p2) throws IOException;
    
    default boolean method18122() {
        return false;
    }
    
    String method18120();
    
    String method18121();
    
    default Class6068<Class42> method18124(final int n) {
        return new Class6071(n);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import it.unimi.dsi.fastutil.Hash$Strategy;

public enum Class1997 implements Hash$Strategy<Class6333>
{
    field11184;
    
    public int hashCode(final Class6333 class6333) {
        return (class6333 != null) ? Class6333.method18830(class6333) : 0;
    }
    
    public boolean equals(final Class6333 class6333, final Class6333 class6334) {
        return class6333 == class6334 || (class6333 != null && class6334 != null && Objects.equals(Class6333.method18831(class6333), Class6333.method18831(class6334)));
    }
}

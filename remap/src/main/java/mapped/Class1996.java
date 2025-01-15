// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.Hash$Strategy;

public enum Class1996 implements Hash$Strategy<Object>
{
    field11182;
    
    public int hashCode(final Object o) {
        return System.identityHashCode(o);
    }
    
    public boolean equals(final Object o, final Object o2) {
        return o == o2;
    }
}

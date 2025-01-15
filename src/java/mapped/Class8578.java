// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.List;

public class Class8578
{
    public final List<Class6387> field36061;
    
    public Class8578(final List<Class6387> field36061) {
        this.field36061 = field36061;
    }
    
    @Override
    public String toString() {
        return "Line{segments=" + this.field36061 + '}';
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.field36061, ((Class8578)o).field36061));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field36061);
    }
}

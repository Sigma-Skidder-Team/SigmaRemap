// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.function.Function;

public class Class3687
{
    private final Class1932 field16992;
    private final Class1932 field16993;
    private Class6332 field16994;
    
    public Class3687(final Class1932 field16992, final Class1932 field16993) {
        this.field16992 = field16992;
        this.field16993 = field16993;
    }
    
    public Class1932 method11330() {
        return this.field16992;
    }
    
    public Class1932 method11331() {
        return this.field16993;
    }
    
    public Class1912 method11332() {
        return Class869.method5277().method5296(this.method11330()).apply(this.method11331());
    }
    
    public Class6332 method11333(final Function<Class1932, Class6332> function) {
        if (this.field16994 == null) {
            this.field16994 = function.apply(this.field16992);
        }
        return this.field16994;
    }
    
    public Class4150 method11334(final Class7807 class7807, final Function<Class1932, Class6332> function) {
        return this.method11332().method7512(class7807.method25214(this.method11333(function)));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class3687 class3687 = (Class3687)o;
            return this.field16992.equals(class3687.field16992) && this.field16993.equals(class3687.field16993);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field16992, this.field16993);
    }
    
    @Override
    public String toString() {
        return "Material{atlasLocation=" + this.field16992 + ", texture=" + this.field16993 + '}';
    }
}

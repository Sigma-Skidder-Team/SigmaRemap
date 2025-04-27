// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class341 implements Class326
{
    private final Class305 field2103;
    private final Class327[] field2104;
    
    public Class341(final Class305 field2103, final Class327[] field2104) {
        this.field2103 = field2103;
        this.field2104 = field2104;
    }
    
    @Override
    public boolean method1006() {
        return this.field2103.method972(this.field2104);
    }
    
    @Override
    public String toString() {
        return this.field2103 + "()";
    }
}

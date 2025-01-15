// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4746<T extends Class759, M extends Class5853<T>> extends Class4712<T, M>
{
    private static final Class1932 field20368;
    
    public Class4746(final Class8551 class8551, final M m, final float n) {
        super(class8551, m, n);
        this.method13978(new Class1831<T, M>(this));
        this.method13978(new Class1801<T, M>(this));
        this.method13978(new Class1823<T, M>(this));
    }
    
    public Class1932 method14080(final T t) {
        return Class4746.field20368;
    }
    
    static {
        field20368 = new Class1932("textures/entity/steve.png");
    }
}

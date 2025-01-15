// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8803<T extends Class4220>
{
    private static String[] field37000;
    private final T field37001;
    private final Class8863 field37002;
    private final String field37003;
    
    public Class8803(final T field37001, final Class8863 field37002, final String field37003) {
        this.field37001 = field37001;
        this.field37002 = field37002;
        this.field37003 = field37003;
    }
    
    public T method30715() {
        return this.field37001;
    }
    
    public void method30716(final Class7012 class7012) {
        class7012.method21464(this.field37002, this.field37003);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class8803 class8803 = (Class8803)o;
            return this.field37001.equals(class8803.field37001) && this.field37002.equals(class8803.field37002) && this.field37003.equals(class8803.field37003);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * this.field37001.hashCode() + this.field37002.hashCode()) + this.field37003.hashCode();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;

public abstract class Class7110<T extends Comparable<T>> implements IProperty<T>
{
    private final Class<T> field27738;
    private final String field27739;
    private Integer field27740;
    
    public Class7110(final String field27739, final Class<T> field27740) {
        this.field27738 = field27740;
        this.field27739 = field27739;
    }
    
    @Override
    public String getName() {
        return this.field27739;
    }
    
    @Override
    public Class<T> getValueClass() {
        return this.field27738;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("name", this.field27739).add("clazz", this.field27738).add("values", this.getAllowedValues()).toString();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class7110) {
            final Class7110 class7110 = (Class7110)o;
            return this.field27738.equals(class7110.field27738) && this.field27739.equals(class7110.field27739);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.field27740 == null) {
            this.field27740 = this.method21828();
        }
        return this.field27740;
    }
    
    public int method21828() {
        return 31 * this.field27738.hashCode() + this.field27739.hashCode();
    }
}

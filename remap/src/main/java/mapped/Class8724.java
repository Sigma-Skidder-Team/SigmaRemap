// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public abstract class Class8724 implements Class8725
{
    private final Class8725 field36645;
    private final String field36646;
    private final double field36647;
    private boolean field36648;
    
    public Class8724(final Class8725 field36645, final String field36646, final double field36647) {
        this.field36645 = field36645;
        this.field36646 = field36646;
        this.field36647 = field36647;
        if (field36646 != null) {
            return;
        }
        throw new IllegalArgumentException("Name cannot be null!");
    }
    
    @Override
    public String method29978() {
        return this.field36646;
    }
    
    @Override
    public double method29979() {
        return this.field36647;
    }
    
    @Override
    public boolean method29980() {
        return this.field36648;
    }
    
    public Class8724 method29981(final boolean field36648) {
        this.field36648 = field36648;
        return this;
    }
    
    @Nullable
    @Override
    public Class8725 method29982() {
        return this.field36645;
    }
    
    @Override
    public int hashCode() {
        return this.field36646.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class8725 && this.field36646.equals(((Class8725)o).method29978());
    }
}

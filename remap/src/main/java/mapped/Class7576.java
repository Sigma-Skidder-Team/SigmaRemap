// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class7576
{
    private Class8542 field30047;
    private final Class2314 field30048;
    public Class2314 field30049;
    private Class<?> field30050;
    private boolean field30051;
    public boolean field30052;
    public Boolean field30053;
    
    public Class7576(final Class8542 class8542, final Class2314 field30048, final Class2314 field30049) {
        this.method23848(class8542);
        this.field30048 = field30048;
        this.field30049 = field30049;
        this.field30050 = Object.class;
        this.field30051 = false;
        this.field30052 = true;
        this.field30053 = null;
    }
    
    public Class8542 method23845() {
        return this.field30047;
    }
    
    public Class2314 method23846() {
        return this.field30049;
    }
    
    public abstract Class2085 method23834();
    
    public Class2314 method23847() {
        return this.field30048;
    }
    
    public void method23848(final Class8542 field30047) {
        if (field30047 != null) {
            this.field30047 = field30047;
            return;
        }
        throw new NullPointerException("tag in a Node is required.");
    }
    
    @Override
    public final boolean equals(final Object obj) {
        return super.equals(obj);
    }
    
    public Class<?> method23849() {
        return this.field30050;
    }
    
    public void method23850(final Class<?> field30050) {
        if (!field30050.isAssignableFrom(this.field30050)) {
            this.field30050 = field30050;
        }
    }
    
    public void method23851(final boolean field30051) {
        this.field30051 = field30051;
    }
    
    public boolean method23852() {
        return this.field30051;
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    public boolean method23853() {
        if (this.field30053 != null) {
            return this.field30053;
        }
        if (!this.field30047.method28656()) {
            if (this.field30052) {
                if (!Object.class.equals(this.field30050)) {
                    if (!this.field30047.equals(Class8542.field35874)) {
                        return true;
                    }
                }
            }
        }
        return this.field30047.method28660(this.method23849());
    }
    
    public void method23854(final Boolean field30053) {
        this.field30053 = field30053;
    }
}

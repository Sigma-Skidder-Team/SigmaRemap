// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class7267 extends Class7266
{
    private String field28158;
    
    public Class7267(final Class7267 class7267) {
        super(class7267);
        this.method22263(class7267.method22262());
    }
    
    public Class7267 method22261() {
        return new Class7267(this);
    }
    
    @Override
    public void method22217(final StringBuilder sb) {
        sb.append(this.field28158);
        super.method22217(sb);
    }
    
    public String method22262() {
        return this.field28158;
    }
    
    public void method22263(final String field28158) {
        this.field28158 = field28158;
    }
    
    @Override
    public String toString() {
        return "SelectorComponent(selector=" + this.method22262() + ")";
    }
    
    public Class7267(final String field28158) {
        this.field28158 = field28158;
    }
}

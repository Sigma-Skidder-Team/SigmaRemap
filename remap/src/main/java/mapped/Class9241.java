// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9241
{
    private String field39626;
    private String field39627;
    private Class330 field39628;
    private Class328 field39629;
    
    public boolean method34071(final Class5108 class5108) {
        this.field39628 = class5108.method16007(this.field39626);
        if (this.field39628 == null) {
            Config.warn("Model variable not found: " + this.field39626);
            return false;
        }
        try {
            this.field39629 = new Class7186(class5108).method22030(this.field39627);
            return true;
        }
        catch (final Class2327 class5109) {
            Config.warn("Error parsing expression: " + this.field39627);
            Config.warn(class5109.getClass().getName() + ": " + class5109.getMessage());
            return false;
        }
    }
    
    public Class9241(final String field39626, final String field39627) {
        this.field39626 = field39626;
        this.field39627 = field39627;
    }
    
    public void method34072() {
        this.field39628.method1012(this.field39629.method1009());
    }
}

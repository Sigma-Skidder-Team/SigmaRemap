// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9284
{
    private Class9366 field39819;
    private Class8750 field39820;
    private Class6791 field39821;
    private Class7091 field39822;
    
    public Class9284 method34267(final Class9366 field39819) {
        this.field39819 = field39819;
        return this;
    }
    
    public Class9284 method34268(final Class8750 field39820) {
        this.field39820 = field39820;
        return this;
    }
    
    public Class9284 method34269(final Class6791 field39821) {
        this.field39821 = field39821;
        return this;
    }
    
    public Class9284 method34270(final Class7091 field39822) {
        this.field39822 = field39822;
        return this;
    }
    
    public Class9183 method34271() {
        return new Class9183(this.field39819, this.field39820, this.field39821, this.field39822);
    }
    
    @Override
    public String toString() {
        return "ViaManager.ViaManagerBuilder(platform=" + this.field39819 + ", injector=" + this.field39820 + ", commandHandler=" + this.field39821 + ", loader=" + this.field39822 + ")";
    }
}

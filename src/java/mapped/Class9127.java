// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9127
{
    private final Class7096 field38681;
    private final int field38682;
    private int field38683;
    
    public Class9127(final int field38682, final Class3833 class3833) {
        this.field38682 = field38682;
        this.field38681 = class3833.method11878();
    }
    
    public int method33114() {
        return this.field38682;
    }
    
    public Class7096 method33115() {
        return this.field38681;
    }
    
    public int method33116() {
        return this.field38683;
    }
    
    public void method33117(final int field38683) {
        this.field38683 = field38683;
    }
    
    @Override
    public String toString() {
        return ((this.field38682 == 1) ? "" : (this.field38682 + "*")) + Class90.field208.method503(this.field38681.method21696());
    }
}

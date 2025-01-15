// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6828 extends Class6826
{
    public final Class7499<?> field26820;
    public final int field26821;
    public final int field26822;
    
    public Class6828(final Class7499<?> field26820, final int n, final int field26821, final int field26822) {
        super(n);
        this.field26820 = field26820;
        this.field26821 = field26821;
        this.field26822 = field26822;
    }
    
    @Override
    public String toString() {
        return Class7499.method23354(this.field26820) + "*(" + this.field26821 + "-" + this.field26822 + "):" + this.field26816;
    }
}

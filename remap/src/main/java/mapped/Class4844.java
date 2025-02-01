// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4844 extends Class4841
{
    public Class4824 field20756;
    
    public Class4844(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.addVisualThing(this.field20756 = new Class4824(this, "messages", 0, 114, n3, n4 - 114));
    }
    
    public void method14522(final String s) {
        this.field20756.method14450(new Class8592(s, true));
    }
    
    public void method14523(final String s) {
        this.field20756.method14450(new Class8592(s, false));
    }
    
    @Override
    public void draw(final float n) {
        super.method14227();
        super.method14228();
        super.draw(n);
    }
}

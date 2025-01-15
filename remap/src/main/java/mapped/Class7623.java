// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7623 implements Class7622
{
    private static String[] field30194;
    private final Class756 field30195;
    private final Class1784 field30196;
    private int field30197;
    
    public Class7623(final Class756 field30195, final Class1784 field30196) {
        this.field30197 = 0;
        this.field30195 = field30195;
        this.field30196 = field30196;
    }
    
    @Override
    public void method23959() {
        --this.field30197;
        if (this.field30197 <= 0) {
            if (this.field30195.method1712()) {
                final float nextFloat = this.field30195.world.field10062.nextFloat();
                if (nextFloat >= 1.0E-4f) {
                    if (nextFloat >= 0.001f) {
                        if (nextFloat < 0.01f) {
                            this.field30197 = 0;
                            this.field30196.method6422(new Class6840(this.field30195, Class8520.field34968));
                        }
                    }
                    else {
                        this.field30197 = 0;
                        this.field30196.method6422(new Class6840(this.field30195, Class8520.field34969));
                    }
                }
                else {
                    this.field30197 = 0;
                    this.field30196.method6422(new Class6840(this.field30195, Class8520.field34970));
                }
            }
        }
    }
}

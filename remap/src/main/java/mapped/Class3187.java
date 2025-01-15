// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3187 extends Class3167
{
    private int field15588;
    private double field15589;
    private boolean field15590;
    
    public Class3187() {
        super(Class8013.field32990, "SlowHop", "SlowHop speed");
        this.method9881(new Class4999("AutoJump", "Automatically jumps for you.", true));
    }
    
    @Override
    public void method9879() {
        this.field15589 = Class7482.method23136();
        this.field15588 = 2;
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(Class7482.method23136());
    }
    
    @Class6753
    public void method10000(final Class5717 class5717) {
        if (this.method9906()) {
            this.method9883("AutoJump");
            final double method23136 = Class7482.method23136();
            Class6430.method19114();
            if (!Class3187.field15514.field4684.field2404) {
                ++this.field15588;
                this.field15589 = 0.36 - this.field15588 / 250.0;
                if (this.field15589 < method23136) {
                    this.field15589 = method23136;
                }
                Class7482.method23149(class5717, this.field15589);
            }
            else {
                this.field15588 = 0;
                Class3187.field15514.field4684.method2725();
                class5717.method16975(Class3187.field15514.field4684.method1935().y);
            }
        }
    }
    
    @Class6753
    public void method10001(final Class5722 class5722) {
        if (this.method9906()) {
            class5722.method16995(0.407 + 0.1 * Class7482.method23140());
            this.field15588 = 0;
            class5722.method16996(1.8);
        }
    }
}

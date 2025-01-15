// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class536 extends Class535
{
    public Class536() {
        super("");
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 - 40, 200, 20, Class8822.method30773("multiplayer.stopSleeping", new Object[0]), class654 -> this.method3093()));
    }
    
    @Override
    public void method3028() {
        this.method3093();
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (n != 256) {
            if (n == 257 || n == 335) {
                final String trim = this.field3192.method3378().trim();
                if (!trim.isEmpty()) {
                    this.field3150.field4684.method4114(trim);
                }
                this.field3192.method3377("");
                this.field3150.field4647.method3807().method3767();
                return true;
            }
        }
        else {
            this.method3093();
        }
        return super.method2972(n, n2, n3);
    }
    
    private void method3093() {
        this.field3150.field4684.field4069.method17292(new Class4336(this.field3150.field4684, Class287.field1593));
    }
}

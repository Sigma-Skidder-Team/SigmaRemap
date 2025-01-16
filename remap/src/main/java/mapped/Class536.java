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
    public void init() {
        super.init();
        this.method3029(new Class654(this.width / 2 - 100, this.height - 40, 200, 20, Class8822.method30773("multiplayer.stopSleeping", new Object[0]), class654 -> this.method3093()));
    }
    
    @Override
    public void method3028() {
        this.method3093();
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            if (n == 257 || n == 335) {
                final String trim = this.field3192.method3378().trim();
                if (!trim.isEmpty()) {
                    this.minecraft.field4684.method4114(trim);
                }
                this.field3192.method3377("");
                this.minecraft.field4647.method3807().method3767();
                return true;
            }
        }
        else {
            this.method3093();
        }
        return super.keyPressed(n, n2, n3);
    }
    
    private void method3093() {
        this.minecraft.field4684.field4069.method17292(new Class4336(this.minecraft.field4684, Class287.field1593));
    }
}

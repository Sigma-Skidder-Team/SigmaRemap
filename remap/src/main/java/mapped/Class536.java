// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class536 extends ChatScreen
{
    public Class536() {
        super("");
    }
    
    @Override
    public void init() {
        super.init();
        this.addButton(new Class654(this.width / 2 - 100, this.height - 40, 200, 20, Class8822.method30773("multiplayer.stopSleeping", new Object[0]), class654 -> this.method3093()));
    }
    
    @Override
    public void onClose() {
        this.method3093();
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        if (keyCode != 256) {
            if (keyCode == 257 || keyCode == 335) {
                final String trim = this.field3192.method3378().trim();
                if (!trim.isEmpty()) {
                    this.minecraft.player.method4114(trim);
                }
                this.field3192.method3377("");
                this.minecraft.field4647.method3807().method3767();
                return true;
            }
        }
        else {
            this.method3093();
        }
        return super.keyPressed(keyCode, n2, n3);
    }
    
    private void method3093() {
        this.minecraft.player.field4069.method17292(new Class4336(this.minecraft.player, Class287.field1593));
    }
}

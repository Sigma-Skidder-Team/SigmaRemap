// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class5052 extends RealmsScreen
{
    private static String[] field21700;
    private Screen field21701;
    
    public void method15490(final Screen field21701) {
        this.field21701 = field21701;
        Realms.setScreen(new Class5079(this));
    }
    
    @Nullable
    public RealmsScreenProxy method15491(final Screen field21701) {
        this.field21701 = field21701;
        return new Class5072(this).getProxy();
    }
    
    @Override
    public void init() {
        Minecraft.method5277().displayGuiScreen(this.field21701);
    }
}

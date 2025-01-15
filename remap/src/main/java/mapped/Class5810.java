// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class5810 implements Class5809
{
    private static final ITextComponent field23844;
    private final Class394 field23845;
    private final NetworkManager field23846;
    private boolean field23847;
    
    public Class5810(final Class394 field23845, final NetworkManager field23846) {
        this.field23845 = field23845;
        this.field23846 = field23846;
    }
    
    @Override
    public void onDisconnect(final ITextComponent class2250) {
    }
    
    @Override
    public NetworkManager getNetworkManager() {
        return this.field23846;
    }
    
    @Override
    public void method17414(final Class4392 class4392) {
        if (!this.field23847) {
            this.field23847 = true;
            this.field23846.method11174(new Class4403(this.field23845.method1557()));
        }
        else {
            this.field23846.method11181(Class5810.field23844);
        }
    }
    
    @Override
    public void method17413(final Class4319 class4319) {
        this.field23846.method11174(new Class4274(class4319.method12980()));
        this.field23846.method11181(Class5810.field23844);
    }
    
    static {
        field23844 = new Class2259("multiplayer.status.request_handled", new Object[0]);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class5806 implements Class5804
{
    private static String[] field23835;
    private final MinecraftServer field23836;
    private final NetworkManager field23837;
    
    public Class5806(final MinecraftServer field23836, final NetworkManager field23837) {
        this.field23836 = field23836;
        this.field23837 = field23837;
    }
    
    @Override
    public void method17403(final Class4398 class4398) {
        this.field23837.method11171(class4398.method13235());
        this.field23837.method11173(new Class5803(this.field23836, this.field23837));
    }
    
    @Override
    public void onDisconnect(final ITextComponent class2250) {
    }
    
    @Override
    public NetworkManager getNetworkManager() {
        return this.field23837;
    }
}
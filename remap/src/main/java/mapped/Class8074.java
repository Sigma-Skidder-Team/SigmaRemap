// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

public class Class8074
{
    private static String[] field33263;
    private Minecraft field33264;
    
    public Class8074() {
        this.field33264 = Minecraft.getInstance();
    }
    
    public void method26494() {
        Client.getInstance().getEventBus().register2(this);
    }
    
    @EventListener
    private void method26495(final Class5743 class5743) {
    }
}

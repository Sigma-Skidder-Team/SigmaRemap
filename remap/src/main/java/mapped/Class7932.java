// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.impl.misc.FakeForge;

public class Class7932
{
    public static String method25729() {
        return (Client.getInstance().moduleManager() != null && Client.getInstance().moduleManager().getModuleByClass(FakeForge.class).isEnabled()) ? Client.getInstance().moduleManager().getModuleByClass(FakeForge.class).getStringSettingValueByName("Client Brand") : "vanilla";
    }
}

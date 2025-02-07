// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.impl.misc.FakeForge;

public class Class7932
{
    public static String method25729() {
        return (Client.getInstance().method35189() != null && Client.getInstance().method35189().getModuleByClass(FakeForge.class).isEnabled()) ? Client.getInstance().method35189().getModuleByClass(FakeForge.class).getStringSettingValueByName("Client Brand") : "vanilla";
    }
}

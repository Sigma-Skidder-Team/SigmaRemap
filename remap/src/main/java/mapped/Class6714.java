// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;
import com.mojang.bridge.game.GameSession;

public class Class6714 implements GameSession
{
    private final int field26446;
    private final boolean field26447;
    private final String field26448;
    private final String field26449;
    private final UUID field26450;
    
    public Class6714(final ClientWorld clientWorld, final ClientPlayerEntity class1849, final Class5799 class1850) {
        this.field26446 = class1850.method17370().size();
        this.field26447 = !class1850.getNetworkManager().method11182();
        this.field26448 = clientWorld.method6954().method8239();
        final Class9081 method17371 = class1850.method17371(class1849.method1865());
        if (method17371 == null) {
            this.field26449 = "unknown";
        }
        else {
            this.field26449 = method17371.method32720().method586();
        }
        this.field26450 = class1850.method17379();
    }
    
    public int getPlayerCount() {
        return this.field26446;
    }
    
    public boolean isRemoteServer() {
        return this.field26447;
    }
    
    public String getDifficulty() {
        return this.field26448;
    }
    
    public String getGameMode() {
        return this.field26449;
    }
    
    public UUID getSessionId() {
        return this.field26450;
    }
}

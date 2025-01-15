// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.network.datasync.EntityDataManager;

import java.io.IOException;
import java.util.List;

public class Class4268 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19146;
    private int field19147;
    private List<Class9369<?>> field19148;
    
    public Class4268() {
    }
    
    public Class4268(final int field19147, final EntityDataManager class9184, final boolean b) {
        this.field19147 = field19147;
        if (!b) {
            this.field19148 = class9184.method33572();
        }
        else {
            this.field19148 = class9184.method33573();
            class9184.method33580();
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19147 = class8654.readVarInt();
        this.field19148 = EntityDataManager.method33575(class8654);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19147);
        EntityDataManager.method33571(this.field19148, class8654);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17278(this);
    }
    
    public List<Class9369<?>> method12810() {
        return this.field19148;
    }
    
    public int method12811() {
        return this.field19147;
    }
}

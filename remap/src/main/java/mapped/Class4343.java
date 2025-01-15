// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4343 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19457;
    public int field19458;
    
    public Class4343() {
    }
    
    public Class4343(final Entity class399) {
        this.field19458 = class399.getEntityId();
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19458 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19458);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17336(this);
    }
    
    @Nullable
    public Entity method13045(final World class1847) {
        return class1847.getEntityByID(this.field19458);
    }
}

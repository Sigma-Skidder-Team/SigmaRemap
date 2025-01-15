// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4295 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19259;
    private int field19260;
    private Class5328 field19261;
    
    public Class4295() {
    }
    
    public Class4295(final int field19260, final Class5328 field19261) {
        this.field19260 = field19260;
        this.field19261 = field19261;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19260 = class8654.readVarInt();
        this.field19261 = Class5328.method16450(class8654.readUnsignedByte());
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19260);
        class8654.writeByte(Class5328.method16451(this.field19261));
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17340(this);
    }
    
    @Nullable
    public Entity method12900(final World class1847) {
        return class1847.getEntityByID(this.field19260);
    }
    
    @Nullable
    public Class5328 method12901() {
        return this.field19261;
    }
}

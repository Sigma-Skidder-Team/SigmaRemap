// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;

public class Class4305 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19305;
    private int field19306;
    private int field19307;
    
    public Class4305() {
    }
    
    public Class4305(final Entity class399, final Entity class400) {
        this.field19306 = class399.getEntityId();
        this.field19307 = ((class400 == null) ? 0 : class400.getEntityId());
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19306 = class8654.readInt();
        this.field19307 = class8654.readInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeInt(this.field19306);
        class8654.writeInt(this.field19307);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17300(this);
    }
    
    public int method12946() {
        return this.field19306;
    }
    
    public int method12947() {
        return this.field19307;
    }
}

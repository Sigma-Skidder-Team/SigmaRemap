// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.LightningBoltEntity;

import java.io.IOException;

public class Class4318 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19347;
    private int field19348;
    private double field19349;
    private double field19350;
    private double field19351;
    private int field19352;
    
    public Class4318() {
    }
    
    public Class4318(final Entity class399) {
        this.field19348 = class399.getEntityId();
        this.field19349 = class399.getPosX();
        this.field19350 = class399.getPosY();
        this.field19351 = class399.getPosZ();
        if (class399 instanceof LightningBoltEntity) {
            this.field19352 = 1;
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19348 = class8654.readVarInt();
        this.field19352 = class8654.readByte();
        this.field19349 = class8654.readDouble();
        this.field19350 = class8654.readDouble();
        this.field19351 = class8654.readDouble();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19348);
        class8654.writeByte(this.field19352);
        class8654.writeDouble(this.field19349);
        class8654.writeDouble(this.field19350);
        class8654.writeDouble(this.field19351);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17275(this);
    }
    
    public int method12974() {
        return this.field19348;
    }
    
    public double method12975() {
        return this.field19349;
    }
    
    public double method12976() {
        return this.field19350;
    }
    
    public double method12977() {
        return this.field19351;
    }
    
    public int method12978() {
        return this.field19352;
    }
}

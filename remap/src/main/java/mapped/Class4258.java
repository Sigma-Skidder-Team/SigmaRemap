// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;

public class Class4258 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19103;
    private int field19104;
    private double field19105;
    private double field19106;
    private double field19107;
    private byte field19108;
    private byte field19109;
    private boolean field19110;
    
    public Class4258() {
    }
    
    public Class4258(final Entity class399) {
        this.field19104 = class399.getEntityId();
        this.field19105 = class399.getPosX();
        this.field19106 = class399.getPosY();
        this.field19107 = class399.getPosZ();
        this.field19108 = (byte)(class399.rotationYaw * 256.0f / 360.0f);
        this.field19109 = (byte)(class399.rotationPitch * 256.0f / 360.0f);
        this.field19110 = class399.onGround;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19104 = class8654.readVarInt();
        this.field19105 = class8654.readDouble();
        this.field19106 = class8654.readDouble();
        this.field19107 = class8654.readDouble();
        this.field19108 = class8654.readByte();
        this.field19109 = class8654.readByte();
        this.field19110 = class8654.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19104);
        class8654.writeDouble(this.field19105);
        class8654.writeDouble(this.field19106);
        class8654.writeDouble(this.field19107);
        class8654.writeByte(this.field19108);
        class8654.writeByte(this.field19109);
        class8654.writeBoolean(this.field19110);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17280(this);
    }
    
    public int method12781() {
        return this.field19104;
    }
    
    public double method12782() {
        return this.field19105;
    }
    
    public double method12783() {
        return this.field19106;
    }
    
    public double method12784() {
        return this.field19107;
    }
    
    public byte method12785() {
        return this.field19108;
    }
    
    public byte method12786() {
        return this.field19109;
    }
    
    public boolean method12787() {
        return this.field19110;
    }
}

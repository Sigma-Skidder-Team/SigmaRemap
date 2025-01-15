// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.io.IOException;
import java.util.UUID;

public class Class4276 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19173;
    private int field19174;
    private UUID field19175;
    private int field19176;
    private double field19177;
    private double field19178;
    private double field19179;
    private int field19180;
    private int field19181;
    private int field19182;
    private byte field19183;
    private byte field19184;
    private byte field19185;
    
    public Class4276() {
    }
    
    public Class4276(final LivingEntity class511) {
        this.field19174 = class511.getEntityId();
        this.field19175 = class511.method1865();
        this.field19176 = Class90.field210.method504(class511.getType());
        this.field19177 = class511.getPosX();
        this.field19178 = class511.getPosY();
        this.field19179 = class511.getPosZ();
        this.field19183 = (byte)(class511.rotationYaw * 256.0f / 360.0f);
        this.field19184 = (byte)(class511.rotationPitch * 256.0f / 360.0f);
        this.field19185 = (byte)(class511.field2953 * 256.0f / 360.0f);
        final Vec3d method1935 = class511.getMotion();
        final double method1936 = MathHelper.clamp(method1935.x, -3.9, 3.9);
        final double method1937 = MathHelper.clamp(method1935.y, -3.9, 3.9);
        final double method1938 = MathHelper.clamp(method1935.z, -3.9, 3.9);
        this.field19180 = (int)(method1936 * 8000.0);
        this.field19181 = (int)(method1937 * 8000.0);
        this.field19182 = (int)(method1938 * 8000.0);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19174 = class8654.readVarInt();
        this.field19175 = class8654.method29504();
        this.field19176 = class8654.readVarInt();
        this.field19177 = class8654.readDouble();
        this.field19178 = class8654.readDouble();
        this.field19179 = class8654.readDouble();
        this.field19183 = class8654.readByte();
        this.field19184 = class8654.readByte();
        this.field19185 = class8654.readByte();
        this.field19180 = class8654.readShort();
        this.field19181 = class8654.readShort();
        this.field19182 = class8654.readShort();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19174);
        class8654.method29503(this.field19175);
        class8654.writeVarInt(this.field19176);
        class8654.writeDouble(this.field19177);
        class8654.writeDouble(this.field19178);
        class8654.writeDouble(this.field19179);
        class8654.writeByte(this.field19183);
        class8654.writeByte(this.field19184);
        class8654.writeByte(this.field19185);
        class8654.writeShort(this.field19180);
        class8654.writeShort(this.field19181);
        class8654.writeShort(this.field19182);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17296(this);
    }
    
    public int method12829() {
        return this.field19174;
    }
    
    public UUID method12830() {
        return this.field19175;
    }
    
    public int method12831() {
        return this.field19176;
    }
    
    public double method12832() {
        return this.field19177;
    }
    
    public double method12833() {
        return this.field19178;
    }
    
    public double method12834() {
        return this.field19179;
    }
    
    public int method12835() {
        return this.field19180;
    }
    
    public int method12836() {
        return this.field19181;
    }
    
    public int method12837() {
        return this.field19182;
    }
    
    public byte method12838() {
        return this.field19183;
    }
    
    public byte method12839() {
        return this.field19184;
    }
    
    public byte method12840() {
        return this.field19185;
    }
}

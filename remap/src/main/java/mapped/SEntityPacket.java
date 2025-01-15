// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.io.IOException;

public class SEntityPacket implements IPacket<IClientPlayNetHandler>
{
    public int entityId;
    public short posX;
    public short posY;
    public short posZ;
    public byte yaw;
    public byte pitch;
    public boolean onGround;
    public boolean rotating;
    public boolean isMovePacket;
    
    public static long func_218743_a(final double n) {
        return MathHelper.lfloor(n * 4096.0);
    }
    
    public static Vec3d func_218744_a(final long n, final long n2, final long n3) {
        return new Vec3d((double)n, (double)n2, (double)n3).scale(2.44140625E-4);
    }
    
    public SEntityPacket() {
    }
    
    public SEntityPacket(final int field19569) {
        this.entityId = field19569;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.entityId = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.entityId);
    }
    
    public void processPacket(final IClientPlayNetHandler class5800) {
        class5800.handleEntityMovement(this);
    }
    
    @Override
    public String toString() {
        return "Entity_" + super.toString();
    }
    
    public Entity getEntity(final World class1847) {
        return class1847.getEntityByID(this.entityId);
    }
    
    public short getX() {
        return this.posX;
    }
    
    public short getY() {
        return this.posY;
    }
    
    public short getZ() {
        return this.posZ;
    }
    
    public byte getYaw() {
        return this.yaw;
    }
    
    public byte getPitch() {
        return this.pitch;
    }
    
    public boolean isRotating() {
        return this.rotating;
    }
    
    public boolean getIsMovePacket() {
        return this.isMovePacket;
    }
    
    public boolean getOnGround() {
        return this.onGround;
    }
}

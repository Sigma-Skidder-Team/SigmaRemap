// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.io.IOException;

public class Class4273 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19163;
    private int field19164;
    public int field19165;
    public int field19166;
    public int field19167;
    
    public Class4273() {
    }
    
    public Class4273(final Entity class399) {
        this(class399.getEntityId(), class399.getMotion());
    }
    
    public Class4273(final int field19164, final Vec3d class5487) {
        this.field19164 = field19164;
        final double method35654 = MathHelper.clamp(class5487.x, -3.9, 3.9);
        final double method35655 = MathHelper.clamp(class5487.y, -3.9, 3.9);
        final double method35656 = MathHelper.clamp(class5487.z, -3.9, 3.9);
        this.field19165 = (int)(method35654 * 8000.0);
        this.field19166 = (int)(method35655 * 8000.0);
        this.field19167 = (int)(method35656 * 8000.0);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19164 = class8654.readVarInt();
        this.field19165 = class8654.readShort();
        this.field19166 = class8654.readShort();
        this.field19167 = class8654.readShort();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19164);
        class8654.writeShort(this.field19165);
        class8654.writeShort(this.field19166);
        class8654.writeShort(this.field19167);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17277(this);
    }
    
    public int method12822() {
        return this.field19164;
    }
    
    public int method12823() {
        return this.field19165;
    }
    
    public int method12824() {
        return this.field19166;
    }
    
    public int method12825() {
        return this.field19167;
    }
}

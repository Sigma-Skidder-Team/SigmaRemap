// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import java.io.IOException;

public class Class4342 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19449;
    public Class1932 field19450;
    private Class286 field19451;
    private int field19452;
    private int field19453;
    private int field19454;
    private float field19455;
    private float field19456;
    
    public Class4342() {
        this.field19453 = Integer.MAX_VALUE;
    }
    
    public Class4342(final Class1932 field19450, final Class286 field19451, final Vec3d class5487, final float field19452, final float field19453) {
        this.field19453 = Integer.MAX_VALUE;
        this.field19450 = field19450;
        this.field19451 = field19451;
        this.field19452 = (int)(class5487.x * 8.0);
        this.field19453 = (int)(class5487.y * 8.0);
        this.field19454 = (int)(class5487.z * 8.0);
        this.field19455 = field19452;
        this.field19456 = field19453;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19450 = class8654.method29516();
        this.field19451 = class8654.method29499(Class286.class);
        this.field19452 = class8654.readInt();
        this.field19453 = class8654.readInt();
        this.field19454 = class8654.readInt();
        this.field19455 = class8654.readFloat();
        this.field19456 = class8654.readFloat();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29517(this.field19450);
        class8654.method29500(this.field19451);
        class8654.writeInt(this.field19452);
        class8654.writeInt(this.field19453);
        class8654.writeInt(this.field19454);
        class8654.writeFloat(this.field19455);
        class8654.writeFloat(this.field19456);
    }
    
    public Class1932 method13038() {
        return this.field19450;
    }
    
    public Class286 method13039() {
        return this.field19451;
    }
    
    public double method13040() {
        return this.field19452 / 8.0f;
    }
    
    public double method13041() {
        return this.field19453 / 8.0f;
    }
    
    public double method13042() {
        return this.field19454 / 8.0f;
    }
    
    public float method13043() {
        return this.field19455;
    }
    
    public float method13044() {
        return this.field19456;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17346(this);
    }
}

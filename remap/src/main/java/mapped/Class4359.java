// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.dimension.DimensionType;

import java.io.IOException;

public class Class4359 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19520;
    private DimensionType field19521;
    private long field19522;
    private Class101 field19523;
    private Class9505 field19524;
    
    public Class4359() {
    }
    
    public Class4359(final DimensionType field19521, final long field19522, final Class9505 field19523, final Class101 field19524) {
        this.field19521 = field19521;
        this.field19522 = field19522;
        this.field19523 = field19524;
        this.field19524 = field19523;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17305(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19521 = DimensionType.method1274(class8654.readInt());
        this.field19522 = class8654.readLong();
        this.field19523 = Class101.method592(class8654.readUnsignedByte());
        this.field19524 = Class9505.method35410(class8654.method29513(16));
        if (this.field19524 == null) {
            this.field19524 = Class9505.field40892;
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeInt(this.field19521.method1270());
        class8654.writeLong(this.field19522);
        class8654.writeByte(this.field19523.method585());
        class8654.method29514(this.field19524.method35398());
    }
    
    public DimensionType method13097() {
        return this.field19521;
    }
    
    public long method13098() {
        return this.field19522;
    }
    
    public Class101 method13099() {
        return this.field19523;
    }
    
    public Class9505 method13100() {
        return this.field19524;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.dimension.DimensionType;

import java.io.IOException;

public class Class4383 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19629;
    private int field19630;
    private long field19631;
    private boolean field19632;
    private Class101 field19633;
    private DimensionType field19634;
    private int field19635;
    private Class9505 field19636;
    private int field19637;
    private boolean field19638;
    private boolean field19639;
    
    public Class4383() {
    }
    
    public Class4383(final int field19630, final Class101 field19631, final long field19632, final boolean field19633, final DimensionType field19634, final int field19635, final Class9505 field19636, final int field19637, final boolean field19638, final boolean field19639) {
        this.field19630 = field19630;
        this.field19634 = field19634;
        this.field19631 = field19632;
        this.field19633 = field19631;
        this.field19635 = field19635;
        this.field19632 = field19633;
        this.field19636 = field19636;
        this.field19637 = field19637;
        this.field19638 = field19638;
        this.field19639 = field19639;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19630 = class8654.readInt();
        final short unsignedByte = class8654.readUnsignedByte();
        this.field19632 = ((unsignedByte & 0x8) == 0x8);
        this.field19633 = Class101.method592(unsignedByte & 0xFFFFFFF7);
        this.field19634 = DimensionType.method1274(class8654.readInt());
        this.field19631 = class8654.readLong();
        this.field19635 = class8654.readUnsignedByte();
        this.field19636 = Class9505.method35410(class8654.method29513(16));
        if (this.field19636 == null) {
            this.field19636 = Class9505.field40892;
        }
        this.field19637 = class8654.readVarInt();
        this.field19638 = class8654.readBoolean();
        this.field19639 = class8654.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeInt(this.field19630);
        int method585 = this.field19633.method585();
        if (this.field19632) {
            method585 |= 0x8;
        }
        class8654.writeByte(method585);
        class8654.writeInt(this.field19634.method1270());
        class8654.writeLong(this.field19631);
        class8654.writeByte(this.field19635);
        class8654.method29514(this.field19636.method35398());
        class8654.writeVarInt(this.field19637);
        class8654.writeBoolean(this.field19638);
        class8654.writeBoolean(this.field19639);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17272(this);
    }
    
    public int method13176() {
        return this.field19630;
    }
    
    public long method13177() {
        return this.field19631;
    }
    
    public boolean method13178() {
        return this.field19632;
    }
    
    public Class101 method13179() {
        return this.field19633;
    }
    
    public DimensionType method13180() {
        return this.field19634;
    }
    
    public Class9505 method13181() {
        return this.field19636;
    }
    
    public int method13182() {
        return this.field19637;
    }
    
    public boolean method13183() {
        return this.field19638;
    }
    
    public boolean method13184() {
        return this.field19639;
    }
}

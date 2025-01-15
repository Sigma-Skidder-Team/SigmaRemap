// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4306 implements IPacket<IClientPlayNetHandler>
{
    public static final String[] field19308;
    private int field19309;
    private float field19310;
    
    public Class4306() {
    }
    
    public Class4306(final int field19309, final float field19310) {
        this.field19309 = field19309;
        this.field19310 = field19310;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19309 = class8654.readUnsignedByte();
        this.field19310 = class8654.readFloat();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19309);
        class8654.writeFloat(this.field19310);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17319(this);
    }
    
    public int method12948() {
        return this.field19309;
    }
    
    public float method12949() {
        return this.field19310;
    }
    
    static {
        field19308 = new String[] { "block.minecraft.bed.not_valid" };
    }
}

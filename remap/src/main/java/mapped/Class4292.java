// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4292 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19247;
    private float field19248;
    private int field19249;
    private float field19250;
    
    public Class4292() {
    }
    
    public Class4292(final float field19248, final int field19249, final float field19250) {
        this.field19248 = field19248;
        this.field19249 = field19249;
        this.field19250 = field19250;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19248 = class8654.readFloat();
        this.field19249 = class8654.readVarInt();
        this.field19250 = class8654.readFloat();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeFloat(this.field19248);
        class8654.writeVarInt(this.field19249);
        class8654.writeFloat(this.field19250);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17303(this);
    }
    
    public float method12891() {
        return this.field19248;
    }
    
    public int method12892() {
        return this.field19249;
    }
    
    public float method12893() {
        return this.field19250;
    }
}
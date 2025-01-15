// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4313 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19332;
    private float field19333;
    private int field19334;
    private int field19335;
    
    public Class4313() {
    }
    
    public Class4313(final float field19333, final int field19334, final int field19335) {
        this.field19333 = field19333;
        this.field19334 = field19334;
        this.field19335 = field19335;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19333 = class8654.readFloat();
        this.field19335 = class8654.readVarInt();
        this.field19334 = class8654.readVarInt();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeFloat(this.field19333);
        class8654.writeVarInt(this.field19335);
        class8654.writeVarInt(this.field19334);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17304(this);
    }
    
    public float method12964() {
        return this.field19333;
    }
    
    public int method12965() {
        return this.field19334;
    }
    
    public int method12966() {
        return this.field19335;
    }
}

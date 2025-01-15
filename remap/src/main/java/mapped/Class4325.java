// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4325 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19369;
    private int[] field19370;
    
    public Class4325() {
    }
    
    public Class4325(final int... field19370) {
        this.field19370 = field19370;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19370 = new int[class8654.readVarInt()];
        for (int i = 0; i < this.field19370.length; ++i) {
            this.field19370[i] = class8654.readVarInt();
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeVarInt(this.field19370.length);
        final int[] field19370 = this.field19370;
        for (int length = field19370.length, i = 0; i < length; ++i) {
            class8654.writeVarInt(field19370[i]);
        }
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17284(this);
    }
    
    public int[] method12989() {
        return this.field19370;
    }
}

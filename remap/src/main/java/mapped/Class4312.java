// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4312 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19329;
    public Class7859 field19330;
    public Class7870[] field19331;
    
    public Class4312() {
    }
    
    public Class4312(final int n, final short[] array, final Class1862 class1862) {
        this.field19330 = class1862.method7019();
        this.field19331 = new Class7870[n];
        for (int i = 0; i < this.field19331.length; ++i) {
            this.field19331[i] = new Class7870(this, array[i], class1862);
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19330 = new Class7859(class8654.readInt(), class8654.readInt());
        this.field19331 = new Class7870[class8654.readVarInt()];
        for (int i = 0; i < this.field19331.length; ++i) {
            this.field19331[i] = new Class7870(this, class8654.readShort(), Block.field17391.method499(class8654.readVarInt()));
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeInt(this.field19330.field32290);
        class8654.writeInt(this.field19330.field32291);
        class8654.writeVarInt(this.field19331.length);
        for (final Class7870 class8655 : this.field19331) {
            class8654.writeShort(class8655.method25490());
            class8654.writeVarInt(Block.method11774(class8655.method25491()));
        }
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17286(this);
    }
    
    public Class7870[] method12963() {
        return this.field19331;
    }
}

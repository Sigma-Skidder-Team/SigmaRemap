// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;

public class Class4262 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19123;
    private ITextComponent field19124;
    
    public Class4262() {
    }
    
    public Class4262(final ITextComponent field19124) {
        this.field19124 = field19124;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19124 = class8654.method29497();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29498(this.field19124);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17290(this);
    }
    
    public ITextComponent method12793() {
        return this.field19124;
    }
}

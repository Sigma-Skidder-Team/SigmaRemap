// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;

public class Class4374 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19581;
    private ITextComponent field19582;
    private ITextComponent field19583;
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19582 = class8654.method29497();
        this.field19583 = class8654.method29497();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29498(this.field19582);
        class8654.method29498(this.field19583);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17339(this);
    }
    
    public ITextComponent method13151() {
        return this.field19582;
    }
    
    public ITextComponent method13152() {
        return this.field19583;
    }
}

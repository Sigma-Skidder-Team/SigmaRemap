// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;

public class Class4378 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19613;
    private ITextComponent field19614;
    private Class285 field19615;
    
    public Class4378() {
    }
    
    public Class4378(final ITextComponent class2250) {
        this(class2250, Class285.field1573);
    }
    
    public Class4378(final ITextComponent field19614, final Class285 field19615) {
        this.field19614 = field19614;
        this.field19615 = field19615;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19614 = class8654.method29497();
        this.field19615 = Class285.method933(class8654.readByte());
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29498(this.field19614);
        class8654.writeByte(this.field19615.method932());
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17294(this);
    }
    
    public ITextComponent method13164() {
        return this.field19614;
    }
    
    public boolean method13165() {
        return this.field19615 == Class285.field1573 || this.field19615 == Class285.field1574;
    }
    
    public Class285 method13166() {
        return this.field19615;
    }
    
    @Override
    public boolean shouldSkipErrors() {
        return true;
    }
}

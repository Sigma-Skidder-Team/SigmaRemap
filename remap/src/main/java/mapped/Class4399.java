// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.io.IOException;

public class Class4399 implements IPacket<Class5813>
{
    private static String[] field19708;
    private BlockPos field19709;
    private Direction field19710;
    private Class2003 field19711;
    
    public Class4399() {
    }
    
    public Class4399(final Class2003 field19711, final BlockPos class354, final Direction field19712) {
        this.field19711 = field19711;
        this.field19709 = class354.toImmutable();
        this.field19710 = field19712;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19711 = class8654.method29499(Class2003.class);
        this.field19709 = class8654.method29494();
        this.field19710 = Direction.byIndex(class8654.readUnsignedByte());
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29500(this.field19711);
        class8654.method29495(this.field19709);
        class8654.writeByte(this.field19710.getIndex());
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17431(this);
    }
    
    public BlockPos method13237() {
        return this.field19709;
    }
    
    public Direction method13238() {
        return this.field19710;
    }
    
    public Class2003 method13239() {
        return this.field19711;
    }
}

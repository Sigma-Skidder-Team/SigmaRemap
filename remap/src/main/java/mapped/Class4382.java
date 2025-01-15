// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4382 implements IPacket<IClientPlayNetHandler>
{
    private static String[] field19626;
    private Class1932 field19627;
    private Class286 field19628;
    
    public Class4382() {
    }
    
    public Class4382(final Class1932 field19627, final Class286 field19628) {
        this.field19627 = field19627;
        this.field19628 = field19628;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        class8654.readByte();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        if (this.field19628 == null) {
            if (this.field19627 == null) {
                class8654.writeByte(0);
            }
            else {
                class8654.writeByte(2);
                class8654.method29517(this.field19627);
            }
        }
        else if (this.field19627 == null) {
            class8654.writeByte(1);
            class8654.method29500(this.field19628);
        }
        else {
            class8654.writeByte(3);
            class8654.method29500(this.field19628);
            class8654.method29517(this.field19627);
        }
    }
    
    @Nullable
    public Class1932 method13174() {
        return this.field19627;
    }
    
    @Nullable
    public Class286 method13175() {
        return this.field19628;
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17325(this);
    }
}

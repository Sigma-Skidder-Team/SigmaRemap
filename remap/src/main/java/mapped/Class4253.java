// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Objects;
import java.io.IOException;

public class Class4253 implements IPacket<IClientPlayNetHandler>
{
    private int field19082;
    private String field19083;
    
    public Class4253() {
    }
    
    public Class4253(final int field19082, final Class9290 class9290) {
        this.field19082 = field19082;
        if (class9290 != null) {
            this.field19083 = class9290.method34312();
        }
        else {
            this.field19083 = "";
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19082 = class8654.readByte();
        this.field19083 = class8654.method29513(16);
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeByte(this.field19082);
        class8654.method29514(this.field19083);
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17358(this);
    }
    
    public int method12765() {
        return this.field19082;
    }
    
    @Nullable
    public String method12766() {
        return Objects.equals(this.field19083, "") ? null : this.field19083;
    }
}

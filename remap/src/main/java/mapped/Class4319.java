// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4319 implements IPacket<Class5809>
{
    private static String[] field19353;
    private long field19354;
    
    public Class4319() {
    }
    
    public Class4319(final long field19354) {
        this.field19354 = field19354;
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19354 = class8654.readLong();
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.writeLong(this.field19354);
    }
    
    public void method12979(final Class5809 class5809) {
        class5809.method17413(this);
    }
    
    public long method12980() {
        return this.field19354;
    }
}

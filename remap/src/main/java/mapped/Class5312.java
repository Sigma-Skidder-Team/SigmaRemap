// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5312 extends Class5260<Class8322>
{
    public Class5312() {
        super(Class8322.class);
    }
    
    public Class8322 method16412(final ByteBuf byteBuf) {
        final long long1 = byteBuf.readLong();
        return new Class8322(long1 >> 38, long1 << 52 >> 52, long1 << 26 >> 38);
    }
    
    public void method16413(final ByteBuf byteBuf, final Class8322 class8322) {
        byteBuf.writeLong((class8322.method27704() & 0x3FFFFFFL) << 38 | (class8322.method27705() & 0xFFFL) | (class8322.method27706() & 0x3FFFFFFL) << 12);
    }
}

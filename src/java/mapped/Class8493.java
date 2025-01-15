// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import com.google.common.collect.Lists;
import java.nio.ByteBuffer;
import java.util.List;

public class Class8493
{
    private static String[] field34873;
    private final List<ByteBuffer> field34874;
    private final int field34875;
    private int field34876;
    private ByteBuffer field34877;
    
    public Class8493(final int n) {
        this.field34874 = Lists.newArrayList();
        this.field34875 = (n + 1 & 0xFFFFFFFE);
        this.method28379();
    }
    
    private void method28379() {
        this.field34877 = BufferUtils.createByteBuffer(this.field34875);
    }
    
    public void method28380(final float n) {
        if (this.field34877.remaining() == 0) {
            this.field34877.flip();
            this.field34874.add(this.field34877);
            this.method28379();
        }
        this.field34877.putShort((short)Class9546.method35651((int)(n * 32767.5f - 0.5f), -32768, 32767));
        this.field34876 += 2;
    }
    
    public ByteBuffer method28381() {
        this.field34877.flip();
        if (!this.field34874.isEmpty()) {
            final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(this.field34876);
            this.field34874.forEach(byteBuffer::put);
            byteBuffer.put(this.field34877);
            byteBuffer.flip();
            return byteBuffer;
        }
        return this.field34877;
    }
}

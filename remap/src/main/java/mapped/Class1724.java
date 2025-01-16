// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.ByteArrayOutputStream;

public class Class1724 extends ByteArrayOutputStream
{
    private static String[] field9643;
    private final ChunkPos field9644;
    public final /* synthetic */ Class1924 field9645;
    
    public Class1724(final Class1924 field9645, final ChunkPos field9646) {
        this.field9645 = field9645;
        super(8096);
        super.write(0);
        super.write(0);
        super.write(0);
        super.write(0);
        super.write(Class1924.method7661(field9645).method26432());
        this.field9644 = field9646;
    }
    
    @Override
    public void close() throws IOException {
        final ByteBuffer wrap = ByteBuffer.wrap(this.buf, 0, this.count);
        wrap.putInt(0, this.count - 5 + 1);
        this.field9645.method7651(this.field9644, wrap);
    }
}

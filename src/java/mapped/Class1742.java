// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import java.io.Closeable;

public interface Class1742 extends Closeable
{
    AudioFormat method6169();
    
    ByteBuffer method6170() throws IOException;
    
    @Nullable
    ByteBuffer method6171(final int p0) throws IOException;
}

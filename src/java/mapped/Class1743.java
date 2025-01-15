// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.nio.FloatBuffer;
import org.lwjgl.PointerBuffer;
import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.stb.STBVorbisAlloc;
import java.io.IOException;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import java.nio.ByteBuffer;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;

public class Class1743 implements Class1742
{
    private long field9712;
    private final AudioFormat field9713;
    private final InputStream field9714;
    private ByteBuffer field9715;
    
    public Class1743(final InputStream field9714) throws IOException {
        this.field9715 = MemoryUtil.memAlloc(8192);
        this.field9714 = field9714;
        this.field9715.limit();
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            final IntBuffer mallocInt = stackPush.mallocInt(1);
            final IntBuffer mallocInt2 = stackPush.mallocInt(1);
            while (this.field9712 == 0L) {
                if (!this.method6172()) {
                    throw new IOException("Failed to find Ogg header");
                }
                final int position = this.field9715.position();
                this.field9715.position();
                this.field9712 = STBVorbis.stb_vorbis_open_pushdata(this.field9715, mallocInt, mallocInt2, (STBVorbisAlloc)null);
                this.field9715.position();
                final int value = mallocInt2.get(0);
                if (value == 1) {
                    this.method6173();
                }
                else {
                    if (value != 0) {
                        throw new IOException("Failed to read Ogg file " + value);
                    }
                    continue;
                }
            }
            this.field9715.position();
            final STBVorbisInfo mallocStack = STBVorbisInfo.mallocStack(stackPush);
            STBVorbis.stb_vorbis_get_info(this.field9712, mallocStack);
            this.field9713 = new AudioFormat((float)mallocStack.sample_rate(), 16, mallocStack.channels(), true, false);
        }
    }
    
    private boolean method6172() throws IOException {
        final int limit = this.field9715.limit();
        final int n = this.field9715.capacity() - limit;
        if (n == 0) {
            return true;
        }
        final byte[] array = new byte[n];
        final int read = this.field9714.read(array);
        if (read != -1) {
            final int position = this.field9715.position();
            this.field9715.limit();
            this.field9715.position();
            this.field9715.put(array, 0, read);
            this.field9715.position();
            return true;
        }
        return false;
    }
    
    private void method6173() {
        final boolean b = this.field9715.position() == 0;
        if (this.field9715.position() == this.field9715.limit() && !b) {
            this.field9715.position();
            this.field9715.limit();
        }
        else {
            final ByteBuffer memAlloc = MemoryUtil.memAlloc(b ? (2 * this.field9715.capacity()) : this.field9715.capacity());
            memAlloc.put(this.field9715);
            MemoryUtil.memFree((Buffer)this.field9715);
            memAlloc.flip();
            this.field9715 = memAlloc;
        }
    }
    
    private boolean method6174(final Class8493 class8493) throws IOException {
        if (this.field9712 == 0L) {
            return false;
        }
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            final PointerBuffer mallocPointer = stackPush.mallocPointer(1);
            final IntBuffer mallocInt = stackPush.mallocInt(1);
            final IntBuffer mallocInt2 = stackPush.mallocInt(1);
            while (true) {
                this.field9715.position();
                final int stb_vorbis_get_error = STBVorbis.stb_vorbis_get_error(this.field9712);
                if (stb_vorbis_get_error == 1) {
                    this.method6173();
                    if (!this.method6172()) {
                        return false;
                    }
                    continue;
                }
                else {
                    if (stb_vorbis_get_error != 0) {
                        throw new IOException("Failed to read Ogg file " + stb_vorbis_get_error);
                    }
                    final int value = mallocInt2.get(0);
                    if (value == 0) {
                        continue;
                    }
                    final int value2 = mallocInt.get(0);
                    final PointerBuffer pointerBuffer = mallocPointer.getPointerBuffer(value2);
                    if (value2 == 1) {
                        this.method6175(pointerBuffer.getFloatBuffer(0, value), class8493);
                        return true;
                    }
                    if (value2 == 2) {
                        this.method6176(pointerBuffer.getFloatBuffer(0, value), pointerBuffer.getFloatBuffer(1, value), class8493);
                        return true;
                    }
                    throw new IllegalStateException("Invalid number of channels: " + value2);
                }
            }
        }
    }
    
    private void method6175(final FloatBuffer floatBuffer, final Class8493 class8493) {
        while (floatBuffer.hasRemaining()) {
            class8493.method28380(floatBuffer.get());
        }
    }
    
    private void method6176(final FloatBuffer floatBuffer, final FloatBuffer floatBuffer2, final Class8493 class8493) {
        while (floatBuffer.hasRemaining() && floatBuffer2.hasRemaining()) {
            class8493.method28380(floatBuffer.get());
            class8493.method28380(floatBuffer2.get());
        }
    }
    
    @Override
    public void close() throws IOException {
        if (this.field9712 != 0L) {
            STBVorbis.stb_vorbis_close(this.field9712);
            this.field9712 = 0L;
        }
        MemoryUtil.memFree((Buffer)this.field9715);
        this.field9714.close();
    }
    
    @Override
    public AudioFormat method6169() {
        return this.field9713;
    }
    
    @Nullable
    @Override
    public ByteBuffer method6171(final int n) throws IOException {
        final Class8493 class8493 = new Class8493(n + 8192);
        while (this.method6174(class8493) && Class8493.method28382(class8493) < n) {}
        return class8493.method28381();
    }
    
    @Override
    public ByteBuffer method6170() throws IOException {
        final Class8493 class8493 = new Class8493(16384);
        while (this.method6174(class8493)) {}
        return class8493.method28381();
    }
}

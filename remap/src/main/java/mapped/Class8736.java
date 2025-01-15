// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.io.FileInputStream;
import java.nio.IntBuffer;
import java.io.IOException;
import org.lwjgl.stb.STBImage;
import org.lwjgl.stb.STBIEOFCallbackI;
import org.lwjgl.stb.STBISkipCallbackI;
import org.lwjgl.stb.STBIReadCallbackI;
import org.lwjgl.stb.STBIIOCallbacks;
import org.lwjgl.stb.STBIEOFCallback;
import org.lwjgl.stb.STBISkipCallback;
import org.lwjgl.stb.STBIReadCallback;
import org.lwjgl.system.MemoryStack;
import java.io.InputStream;

public class Class8736
{
    public final int field36713;
    public final int field36714;
    private static final Object field36715;
    
    public Class8736(final String str, final InputStream inputStream) throws IOException {
        synchronized (Class8736.field36715) {
            try (final MemoryStack stackPush = MemoryStack.stackPush();
                 final Class1915 method30184 = method30184(inputStream);
                 final STBIReadCallback create = STBIReadCallback.create(method30184::method7581);
                 final STBISkipCallback create2 = STBISkipCallback.create(method30184::method7582);
                 final STBIEOFCallback create3 = STBIEOFCallback.create(method30184::method7583)) {
                final STBIIOCallbacks mallocStack = STBIIOCallbacks.mallocStack(stackPush);
                mallocStack.read((STBIReadCallbackI)create);
                mallocStack.skip((STBISkipCallbackI)create2);
                mallocStack.eof((STBIEOFCallbackI)create3);
                final IntBuffer mallocInt = stackPush.mallocInt(1);
                final IntBuffer mallocInt2 = stackPush.mallocInt(1);
                if (!STBImage.stbi_info_from_callbacks(mallocStack, 0L, mallocInt, mallocInt2, stackPush.mallocInt(1))) {
                    throw new IOException("Could not read info from the PNG file " + str + " " + STBImage.stbi_failure_reason());
                }
                this.field36713 = mallocInt.get(0);
                this.field36714 = mallocInt2.get(0);
            }
        }
    }
    
    @Override
    public String toString() {
        return "" + this.field36713 + " x " + this.field36714;
    }
    
    private static Class1915 method30184(final InputStream in) {
        return (in instanceof FileInputStream) ? new Class1917(((FileInputStream)in).getChannel(), null) : new Class1916(Channels.newChannel(in), null);
    }
    
    static {
        field36715 = new Object();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;
import java.nio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.Channels;
import org.lwjgl.system.MemoryUtil;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.nio.IntBuffer;
import org.apache.logging.log4j.Logger;

public class Class8995
{
    private static String[] field37951;
    private static final Logger field37952;
    
    public static int method32101() {
        RenderSystem.method29989(RenderSystem::method29985);
        return Class8933.method31615();
    }
    
    public static void method32102(final int n) {
        RenderSystem.method29989(RenderSystem::method29985);
        Class8933.method31616(n);
    }
    
    public static void method32103(final int n, final int n2, final int n3) {
        method32106(Class2063.field11809, n, 0, n2, n3);
    }
    
    public static void method32104(final Class2063 class2063, final int n, final int n2, final int n3) {
        method32106(class2063, n, 0, n2, n3);
    }
    
    public static void method32105(final int n, final int n2, final int n3, final int n4) {
        method32106(Class2063.field11809, n, n2, n3, n4);
    }
    
    public static void method32106(final Class2063 class2063, final int n, final int n2, final int n3, final int n4) {
        RenderSystem.method29989(RenderSystem::method29985);
        method32107(n);
        if (n2 >= 0) {
            Class8933.method31613(3553, 33085, n2);
            Class8933.method31613(3553, 33082, 0);
            Class8933.method31613(3553, 33083, n2);
            Class8933.method31612(3553, 34049, 0.0f);
        }
        for (int i = 0; i <= n2; ++i) {
            Class8933.method31618(3553, i, class2063.method8152(), n3 >> i, n4 >> i, 0, 6408, 5121, null);
        }
    }
    
    private static void method32107(final int n) {
        RenderSystem.method29989(RenderSystem::method29985);
        Class8933.method31617(n);
    }
    
    public static ByteBuffer method32108(final InputStream in) throws IOException {
        ByteBuffer byteBuffer;
        if (!(in instanceof FileInputStream)) {
            byteBuffer = MemoryUtil.memAlloc(8192);
            while (Channels.newChannel(in).read(byteBuffer) != -1) {
                if (byteBuffer.remaining() != 0) {
                    continue;
                }
                byteBuffer = MemoryUtil.memRealloc(byteBuffer, byteBuffer.capacity() * 2);
            }
        }
        else {
            final FileChannel channel = ((FileInputStream)in).getChannel();
            byteBuffer = MemoryUtil.memAlloc((int)channel.size() + 1);
            while (channel.read(byteBuffer) != -1) {}
        }
        return byteBuffer;
    }
    
    public static String method32109(final InputStream inputStream) {
        RenderSystem.method29989(RenderSystem::method29984);
        ByteBuffer method32108 = null;
        try {
            method32108 = method32108(inputStream);
            final int position = method32108.position();
            method32108.rewind();
            return MemoryUtil.memASCII(method32108, position);
        }
        catch (final IOException ex) {}
        finally {
            if (method32108 != null) {
                MemoryUtil.memFree(method32108);
            }
        }
        return null;
    }
    
    public static void method32110(final IntBuffer intBuffer, final int n, final int n2) {
        RenderSystem.method29989(RenderSystem::method29984);
        GL11.glPixelStorei(3312, 0);
        GL11.glPixelStorei(3313, 0);
        GL11.glPixelStorei(3314, 0);
        GL11.glPixelStorei(3315, 0);
        GL11.glPixelStorei(3316, 0);
        GL11.glPixelStorei(3317, 4);
        GL11.glTexImage2D(3553, 0, 6408, n, n2, 0, 32993, 33639, intBuffer);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        GL11.glTexParameteri(3553, 10240, 9728);
        GL11.glTexParameteri(3553, 10241, 9729);
    }
    
    static {
        field37952 = LogManager.getLogger();
    }
}

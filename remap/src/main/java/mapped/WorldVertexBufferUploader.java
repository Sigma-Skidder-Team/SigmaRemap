// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.system.MemoryUtil;
import com.mojang.datafixers.util.Pair;
import java.nio.ByteBuffer;

public class WorldVertexBufferUploader
{
    private static String[] field34786;
    
    public static void draw(final BufferBuilder class4148) {
        if (RenderSystem.method29984()) {
            final Pair<Class8127, ByteBuffer> method12401 = class4148.method12401();
            final Class8127 class4149 = method12401.getFirst();
            method28283(method12401.getSecond(), class4149.method26772(), class4149.method26770(), class4149.method26771());
        }
        else {
            if (class4148.method12417() == 7) {
                if (Config.method29021()) {
                    class4148.method12416();
                }
            }
            RenderSystem.method29991(() -> {
                final Pair<Class8127, ByteBuffer> method12401 = class4148.method12401();
                final Class8127 class4149 = method12401.getFirst();
                method28283(method12401.getSecond(), class4149.method26772(), class4149.method26770(), class4149.method26771());
            });
        }
    }
    
    private static void method28283(final ByteBuffer byteBuffer, final int n, final Class9272 class9272, final int n2) {
        RenderSystem.method29989(RenderSystem::method29984);
        byteBuffer.clear();
        if (n2 > 0) {
            class9272.method34196(MemoryUtil.memAddress(byteBuffer));
            Class8933.method31657(n, 0, n2);
            class9272.method34197();
        }
    }
}

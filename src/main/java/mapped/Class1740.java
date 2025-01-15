// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.Buffer;
import org.lwjgl.system.MemoryUtil;
import javax.annotation.Nullable;
import java.nio.IntBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.stb.STBTruetype;
import it.unimi.dsi.fastutil.chars.CharArraySet;
import it.unimi.dsi.fastutil.chars.CharSet;
import org.lwjgl.stb.STBTTFontinfo;
import java.nio.ByteBuffer;

public class Class1740 implements Class1737
{
    private static String[] field9698;
    private final ByteBuffer field9699;
    private final STBTTFontinfo field9700;
    private final float field9701;
    private final CharSet field9702;
    private final float field9703;
    private final float field9704;
    private final float field9705;
    private final float field9706;
    
    public Class1740(final ByteBuffer field9699, final STBTTFontinfo field9700, final float n, final float field9701, final float n2, final float n3, final String s) {
        this.field9702 = (CharSet)new CharArraySet();
        this.field9699 = field9699;
        this.field9700 = field9700;
        this.field9701 = field9701;
        s.chars().forEach(n5 -> this.field9702.add((char)(n5 & 0xFFFF)));
        this.field9703 = n2 * field9701;
        this.field9704 = n3 * field9701;
        this.field9705 = STBTruetype.stbtt_ScaleForPixelHeight(field9700, n * field9701);
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            final IntBuffer mallocInt = stackPush.mallocInt(1);
            STBTruetype.stbtt_GetFontVMetrics(field9700, mallocInt, stackPush.mallocInt(1), stackPush.mallocInt(1));
            this.field9706 = mallocInt.get(0) * this.field9705;
        }
    }
    
    @Nullable
    public Class2028 method6156(final char c) {
        if (this.field9702.contains(c)) {
            return null;
        }
        Class2028 class2028;
        try (final MemoryStack stackPush = MemoryStack.stackPush()) {
            final IntBuffer mallocInt = stackPush.mallocInt(1);
            final IntBuffer mallocInt2 = stackPush.mallocInt(1);
            final IntBuffer mallocInt3 = stackPush.mallocInt(1);
            final IntBuffer mallocInt4 = stackPush.mallocInt(1);
            final int stbtt_FindGlyphIndex = STBTruetype.stbtt_FindGlyphIndex(this.field9700, (int)c);
            if (stbtt_FindGlyphIndex == 0) {
                class2028 = null;
                return class2028;
            }
            STBTruetype.stbtt_GetGlyphBitmapBoxSubpixel(this.field9700, stbtt_FindGlyphIndex, this.field9705, this.field9705, this.field9703, this.field9704, mallocInt, mallocInt2, mallocInt3, mallocInt4);
            final int n = mallocInt3.get(0) - mallocInt.get(0);
            final int n2 = mallocInt4.get(0) - mallocInt2.get(0);
            if (n != 0 && n2 != 0) {
                final IntBuffer mallocInt5 = stackPush.mallocInt(1);
                final IntBuffer mallocInt6 = stackPush.mallocInt(1);
                STBTruetype.stbtt_GetGlyphHMetrics(this.field9700, stbtt_FindGlyphIndex, mallocInt5, mallocInt6);
                return new Class2028(this, mallocInt.get(0), mallocInt3.get(0), -mallocInt2.get(0), -mallocInt4.get(0), mallocInt5.get(0) * this.field9705, mallocInt6.get(0) * this.field9705, stbtt_FindGlyphIndex, null);
            }
            return null;
        }
        return class2028;
    }
    
    @Override
    public void close() {
        this.field9700.free();
        MemoryUtil.memFree((Buffer)this.field9699);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import java.util.ArrayList;
import java.awt.Dimension;
import java.nio.IntBuffer;

public class Class8409
{
    private final String field34526;
    private final int field34527;
    private final int field34528;
    private final int[] field34529;
    private final boolean field34530;
    private int[][] field34531;
    private IntBuffer[] field34532;
    private Dimension[] field34533;
    
    public Class8409(final String field34526, final int field34527, final int field34528, final int[] field34529, final boolean field34530) {
        this.field34526 = field34526;
        this.field34527 = field34527;
        this.field34528 = field34528;
        this.field34529 = field34529;
        this.field34530 = field34530;
        this.field34533 = method28065(field34527, field34528, field34526);
        this.field34531 = method28066(field34529, field34527, field34528, this.field34533);
        if (field34530) {
            this.field34532 = method28070(this.field34533, this.field34531);
        }
    }
    
    public static Dimension[] method28065(final int i, final int j, final String str) {
        final int method31820 = Class8969.method31820(i);
        final int method31821 = Class8969.method31820(j);
        if (method31820 == i && method31821 == j) {
            final ArrayList list = new ArrayList();
            int width = method31820;
            int height = method31821;
            while (true) {
                width /= 2;
                height /= 2;
                if (width <= 0 && height <= 0) {
                    break;
                }
                if (width <= 0) {
                    width = 1;
                }
                if (height <= 0) {
                    height = 1;
                }
                list.add(new Dimension(width, height));
            }
            return (Dimension[])list.toArray(new Dimension[list.size()]);
        }
        Class8571.method28848("Mipmaps not possible (power of 2 dimensions needed), texture: " + str + ", dim: " + i + "x" + j);
        return new Dimension[0];
    }
    
    public static int[][] method28066(final int[] array, final int n, final int n2, final Dimension[] array2) {
        int[] array3 = array;
        int n3 = n;
        int n4 = 1;
        final int[][] array4 = new int[array2.length][];
        for (int i = 0; i < array2.length; ++i) {
            final Dimension dimension = array2[i];
            final int width = dimension.width;
            final int height = dimension.height;
            final int[] array5 = new int[width * height];
            array4[i] = array5;
            if (n4 != 0) {
                for (int j = 0; j < width; ++j) {
                    for (int k = 0; k < height; ++k) {
                        array5[j + k * width] = method28067(array3[j * 2 + 0 + (k * 2 + 0) * n3], array3[j * 2 + 1 + (k * 2 + 0) * n3], array3[j * 2 + 1 + (k * 2 + 1) * n3], array3[j * 2 + 0 + (k * 2 + 1) * n3]);
                    }
                }
            }
            array3 = array5;
            n3 = width;
            if (width <= 1 || height <= 1) {
                n4 = 0;
            }
        }
        return array4;
    }
    
    public static int method28067(final int n, final int n2, final int n3, final int n4) {
        return method28068(method28068(n, n2), method28068(n3, n4));
    }
    
    private static int method28068(int n, int n2) {
        int n3 = (n & 0xFF000000) >> 24 & 0xFF;
        int n4 = (n2 & 0xFF000000) >> 24 & 0xFF;
        int n5 = (n3 + n4) / 2;
        if (n3 == 0 && n4 == 0) {
            n3 = 1;
            n4 = 1;
        }
        else {
            if (n3 == 0) {
                n = n2;
                n5 /= 2;
            }
            if (n4 == 0) {
                n2 = n;
                n5 /= 2;
            }
        }
        return n5 << 24 | ((n >> 16 & 0xFF) * n3 + (n2 >> 16 & 0xFF) * n4) / (n3 + n4) << 16 | ((n >> 8 & 0xFF) * n3 + (n2 >> 8 & 0xFF) * n4) / (n3 + n4) << 8 | ((n & 0xFF) * n3 + (n2 & 0xFF) * n4) / (n3 + n4);
    }
    
    private int method28069(final int n, final int n2) {
        return (((n & 0xFF000000) >> 24 & 0xFF) + ((n2 & 0xFF000000) >> 24 & 0xFF) >> 1 << 24) + ((n & 0xFEFEFE) + (n2 & 0xFEFEFE) >> 1);
    }
    
    public static IntBuffer[] method28070(final Dimension[] array, final int[][] array2) {
        if (array != null) {
            final IntBuffer[] array3 = new IntBuffer[array.length];
            for (int i = 0; i < array.length; ++i) {
                final Dimension dimension = array[i];
                final IntBuffer method29016 = Class8571.method29016(dimension.width * dimension.height);
                final int[] src = array2[i];
                method29016.clear();
                method29016.put(src);
                method29016.clear();
                array3[i] = method29016;
            }
            return array3;
        }
        return null;
    }
    
    public static void method28071(final int n, final int n2, final String s) {
        final Dimension[] method28065 = method28065(n, n2, s);
        for (int i = 0; i < method28065.length; ++i) {
            final Dimension dimension = method28065[i];
            GL11.glTexImage2D(3553, i + 1, 6408, dimension.width, dimension.height, 0, 32993, 33639, (IntBuffer)null);
        }
    }
}

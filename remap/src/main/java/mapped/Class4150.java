// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Class4150 extends Class4152
{
    Logger field18475 = LogManager.getLogger();
    ThreadLocal<Class9145> field18506 = ThreadLocal.withInitial(() -> {
        new Class9145(Blocks.AIR.getDefaultState(), new BlockPos(0, 0, 0));
        return;
    });
    boolean field18507 = Class9570.field41282.method22623();
    
    default Class9145 method12414(final BlockState class7096, final BlockPos class7097) {
        final Class9145 class7098 = Class4150.field18506.get();
        class7098.method33373(class7096, class7097);
        return class7098;
    }
    
    default Class6332 method12415() {
        return null;
    }
    
    default boolean method12408() {
        return false;
    }
    
    default boolean method12438() {
        return false;
    }
    
    Class4150 pos(final double p0, final double p1, final double p2);
    
    Class4150 method12399(final int p0, final int p1, final int p2, final int p3);
    
    Class4150 tex(final float p0, final float p1);
    
    Class4150 method12433(final int p0, final int p1);
    
    Class4150 method12434(final int p0, final int p1);
    
    Class4150 method12436(final float p0, final float p1, final float p2);
    
    void endVertex();
    
    default void method12400(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final int n10, final int n11, final float n12, final float n13, final float n14) {
        this.pos(n, n2, n3);
        this.color(n4, n5, n6, n7);
        this.tex(n8, n9);
        this.method12441(n10);
        this.method12440(n11);
        this.method12436(n12, n13, n14);
        this.endVertex();
    }
    
    default Class4150 color(final float n, final float n2, final float n3, final float n4) {
        return this.method12399((int)(n * 255.0f), (int)(n2 * 255.0f), (int)(n3 * 255.0f), (int)(n4 * 255.0f));
    }
    
    default Class4150 method12440(final int n) {
        return this.method12434(n & 0xFFFF, n >> 16 & 0xFFFF);
    }
    
    default Class4150 method12441(final int n) {
        return this.method12433(n & 0xFFFF, n >> 16 & 0xFFFF);
    }
    
    default void method12442(final Class8996 class8996, final Class8754 class8997, final float n, final float n2, final float n3, final int n4, final int n5) {
        this.method12443(class8996, class8997, this.method12421(1.0f, 1.0f, 1.0f, 1.0f), n, n2, n3, this.method12422(n4, n4, n4, n4), n5, false);
    }
    
    default void method12443(final Class8996 class8996, final Class8754 class8997, final float[] array, final float n, final float n2, final float n3, final int[] array2, final int n4, final boolean b) {
        final int[] array3 = this.method12408() ? class8997.method30296() : class8997.method30291();
        this.method12406(class8997.method30295());
        final boolean method12438 = this.method12438();
        final Vec3i method12439 = class8997.method30294().getDirectionVec();
        final float n5 = (float)method12439.getX();
        final float n6 = (float)method12439.getY();
        final float n7 = (float)method12439.getZ();
        final Matrix4f method12440 = class8996.getMatrix();
        final Matrix3f method12441 = class8996.method32112();
        float n8 = method12441.getTransformX(n5, n6, n7);
        float n9 = method12441.getTransformY(n5, n6, n7);
        float n10 = method12441.getTransformZ(n5, n6, n7);
        final int method12442 = DefaultVertexFormats.field39607.method34193();
        for (int n11 = array3.length / method12442, i = 0; i < n11; ++i) {
            final int n12 = i * method12442;
            final float intBitsToFloat = Float.intBitsToFloat(array3[n12]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array3[n12 + 1]);
            final float intBitsToFloat3 = Float.intBitsToFloat(array3[n12 + 2]);
            final float n13 = method12438 ? 1.0f : array[i];
            float n14;
            float n15;
            float n16;
            if (!b) {
                n14 = n13 * n;
                n15 = n13 * n2;
                n16 = n13 * n3;
            }
            else {
                final int n17 = array3[n12 + 3];
                final float n18 = (n17 & 0xFF) / 255.0f;
                final float n19 = (n17 >> 8 & 0xFF) / 255.0f;
                final float n20 = (n17 >> 16 & 0xFF) / 255.0f;
                n14 = n18 * n13 * n;
                n15 = n19 * n13 * n2;
                n16 = n20 * n13 * n3;
            }
            int method12443 = array2[i];
            if (Class4150.field18507) {
                method12443 = this.method12446(array2[i], array3, n12);
            }
            final float intBitsToFloat4 = Float.intBitsToFloat(array3[n12 + 4]);
            final float intBitsToFloat5 = Float.intBitsToFloat(array3[n12 + 5]);
            final float method12444 = method12440.method20761(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, 1.0f);
            final float method12445 = method12440.method20762(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, 1.0f);
            final float method12446 = method12440.method20763(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, 1.0f);
            if (Class4150.field18507) {
                final Vector3f method12447 = this.method12448(array3, n12, class8996.method32112());
                if (method12447 != null) {
                    n8 = method12447.getX();
                    n9 = method12447.getY();
                    n10 = method12447.getZ();
                }
            }
            if (!method12438) {
                this.method12400(method12444, method12445, method12446, n14, n15, n16, 1.0f, intBitsToFloat4, intBitsToFloat5, n4, method12443, n8, n9, n10);
            }
            else {
                this.method12400(method12444, method12445, method12446, n14, n15, n16, array[i], intBitsToFloat4, intBitsToFloat5, n4, method12443, n8, n9, n10);
            }
        }
    }
    
    default Class4150 pos(final Matrix4f class6789, final float n, final float n2, final float n3) {
        return this.pos(class6789.method20761(n, n2, n3, 1.0f), class6789.method20762(n, n2, n3, 1.0f), class6789.method20763(n, n2, n3, 1.0f));
    }
    
    default Class4150 method12445(final Matrix3f class9429, final float n, final float n2, final float n3) {
        return this.method12436(class9429.getTransformX(n, n2, n3), class9429.getTransformY(n, n2, n3), class9429.getTransformZ(n, n2, n3));
    }
    
    default void method12406(final TextureAtlasSprite class1912) {
    }
    
    default void method12407(final TextureAtlasSprite class1912) {
    }
    
    default void method12412(final Class6332 class6332) {
    }
    
    default Vector3f method12419(final Vector3f class9138) {
        return class9138.copy();
    }
    
    default Vector3f method12420(final float n, final float n2, final float n3) {
        return new Vector3f(n, n2, n3);
    }
    
    default float[] method12421(final float n, final float n2, final float n3, final float n4) {
        return new float[] { n, n2, n3, n4 };
    }
    
    default int[] method12422(final int n, final int n2, final int n3, final int n4) {
        return new int[] { n, n2, n3, n4 };
    }
    
    default int method12446(final int n, final int[] array, final int n2) {
        final int method12447 = method12447(0);
        final int method12448 = Class392.method1423(array[n2 + method12447]);
        final int method12449 = Class392.method1424(array[n2 + method12447]);
        if (method12448 == 0 && method12449 == 0) {
            return n;
        }
        return Class392.method1422(Math.max(Class392.method1423(n), method12448), Math.max(Class392.method1424(n), method12449));
    }
    
    default int method12447(final int n) {
        return n * 8 + 6;
    }
    
    default Vector3f method12448(final int[] array, final int n, final Matrix3f class9429) {
        final int n2 = array[n + 7];
        final byte b = (byte)(n2 >> 0 & 0xFF);
        final byte b2 = (byte)(n2 >> 8 & 0xFF);
        final byte b3 = (byte)(n2 >> 16 & 0xFF);
        if (b == 0) {
            if (b2 == 0) {
                if (b3 == 0) {
                    return null;
                }
            }
        }
        final Vector3f method12420 = this.method12420(b / 127.0f, b2 / 127.0f, b3 / 127.0f);
        method12420.transform(class9429);
        return method12420;
    }
}

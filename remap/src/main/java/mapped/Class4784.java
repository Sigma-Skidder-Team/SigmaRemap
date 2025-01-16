// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.entity.effect.LightningBoltEntity;

import java.util.Random;

public class Class4784 extends Class4703<LightningBoltEntity>
{
    private static String[] field20417;
    
    public Class4784(final Class8551 class8551) {
        super(class8551);
    }
    
    public void method14149(final LightningBoltEntity class422, final float n, final float n2, final Class7351 class423, final Class7807 class424, final int n3) {
        final float[] array = new float[8];
        final float[] array2 = new float[8];
        float n4 = 0.0f;
        float n5 = 0.0f;
        final Random random = new Random(class422.field2538);
        for (int i = 7; i >= 0; --i) {
            array[i] = n4;
            array2[i] = n5;
            n4 += random.nextInt(11) - 5;
            n5 += random.nextInt(11) - 5;
        }
        final Class4150 method25214 = class424.method25214(Class6332.method18789());
        final Matrix4f method25215 = class423.method22569().method32111();
        for (int j = 0; j < 4; ++j) {
            final Random random2 = new Random(class422.field2538);
            for (int k = 0; k < 3; ++k) {
                int n6 = 7;
                int n7 = 0;
                if (k > 0) {
                    n6 = 7 - k;
                }
                if (k > 0) {
                    n7 = n6 - 2;
                }
                float n8 = array[n6] - n4;
                float n9 = array2[n6] - n5;
                for (int l = n6; l >= n7; --l) {
                    final float n10 = n8;
                    final float n11 = n9;
                    if (k != 0) {
                        n8 += random2.nextInt(31) - 15;
                        n9 += random2.nextInt(31) - 15;
                    }
                    else {
                        n8 += random2.nextInt(11) - 5;
                        n9 += random2.nextInt(11) - 5;
                    }
                    float n12 = 0.1f + j * 0.2f;
                    if (k == 0) {
                        n12 *= (float)(l * 0.1 + 1.0);
                    }
                    float n13 = 0.1f + j * 0.2f;
                    if (k == 0) {
                        n13 *= (l - 1) * 0.1f + 1.0f;
                    }
                    method14150(method25215, method25214, n8, n9, l, n10, n11, 0.45f, 0.45f, 0.5f, n12, n13, false, false, true, false);
                    method14150(method25215, method25214, n8, n9, l, n10, n11, 0.45f, 0.45f, 0.5f, n12, n13, true, false, true, true);
                    method14150(method25215, method25214, n8, n9, l, n10, n11, 0.45f, 0.45f, 0.5f, n12, n13, true, true, false, true);
                    method14150(method25215, method25214, n8, n9, l, n10, n11, 0.45f, 0.45f, 0.5f, n12, n13, false, true, false, false);
                }
            }
        }
    }
    
    private static void method14150(final Matrix4f class6789, final Class4150 class6790, final float n, final float n2, final int n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        class6790.method12444(class6789, n + (b ? n10 : (-n10)), (float)(n3 * 16), n2 + (b2 ? n10 : (-n10))).method12439(n6, n7, n8, 0.3f).method12397();
        class6790.method12444(class6789, n4 + (b ? n9 : (-n9)), (float)((n3 + 1) * 16), n5 + (b2 ? n9 : (-n9))).method12439(n6, n7, n8, 0.3f).method12397();
        class6790.method12444(class6789, n4 + (b3 ? n9 : (-n9)), (float)((n3 + 1) * 16), n5 + (b4 ? n9 : (-n9))).method12439(n6, n7, n8, 0.3f).method12397();
        class6790.method12444(class6789, n + (b3 ? n10 : (-n10)), (float)(n3 * 16), n2 + (b4 ? n10 : (-n10))).method12439(n6, n7, n8, 0.3f).method12397();
    }
    
    public ResourceLocation method14151(final LightningBoltEntity class422) {
        return Class1774.field9853;
    }
}

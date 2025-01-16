// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.util.Direction;

import java.util.stream.IntStream;
import java.util.List;
import java.util.Random;

public class Class4171<T extends Class489> extends Class4158<T>
{
    public static final ResourceLocation field18584;
    public static final ResourceLocation field18585;
    private static final Random field18586;
    private static final List<Class6332> field18587;
    
    public Class4171(final Class9550 class9550) {
        super(class9550);
    }
    
    public void method12489(final T t, final float n, final Class7351 class7351, final Class7807 class7352, final int n2, final int n3) {
        if (!Config.method28955() || !Class7778.method24970(t, n, this.method12493(), class7351, class7352, n2, n3)) {
            Class4171.field18586.setSeed(31100L);
            final int method12492 = this.method12492(t.getPos().distanceSq(this.field18539.field41131.method18161(), true));
            final float method12493 = this.method12493();
            final Matrix4f method12494 = class7351.method22569().method32111();
            this.method12490(t, method12493, 0.15f, method12494, class7352.method25214(Class4171.field18587.get(0)));
            for (int i = 1; i < method12492; ++i) {
                this.method12490(t, method12493, 2.0f / (18 - i), method12494, class7352.method25214(Class4171.field18587.get(i)));
            }
        }
    }
    
    private void method12490(final T t, final float n, final float n2, final Matrix4f class6789, final Class4150 class6790) {
        final float n3 = (Class4171.field18586.nextFloat() * 0.5f + 0.1f) * n2;
        final float n4 = (Class4171.field18586.nextFloat() * 0.5f + 0.4f) * n2;
        final float n5 = (Class4171.field18586.nextFloat() * 0.5f + 0.5f) * n2;
        this.method12491(t, class6789, class6790, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, n3, n4, n5, Direction.SOUTH);
        this.method12491(t, class6789, class6790, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, n3, n4, n5, Direction.NORTH);
        this.method12491(t, class6789, class6790, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, n3, n4, n5, Direction.EAST);
        this.method12491(t, class6789, class6790, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, n3, n4, n5, Direction.WEST);
        this.method12491(t, class6789, class6790, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n3, n4, n5, Direction.DOWN);
        this.method12491(t, class6789, class6790, 0.0f, 1.0f, n, n, 1.0f, 1.0f, 0.0f, 0.0f, n3, n4, n5, Direction.UP);
    }
    
    private void method12491(final T t, final Matrix4f class6789, final Class4150 class6790, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final float n11, final Direction class6791) {
        if (t.method2444(class6791)) {
            class6790.method12444(class6789, n, n3, n5).method12439(n9, n10, n11, 1.0f).method12397();
            class6790.method12444(class6789, n2, n3, n6).method12439(n9, n10, n11, 1.0f).method12397();
            class6790.method12444(class6789, n2, n4, n7).method12439(n9, n10, n11, 1.0f).method12397();
            class6790.method12444(class6789, n, n4, n8).method12439(n9, n10, n11, 1.0f).method12397();
        }
    }
    
    public int method12492(final double n) {
        if (n > 36864.0) {
            return 1;
        }
        if (n > 25600.0) {
            return 3;
        }
        if (n > 16384.0) {
            return 5;
        }
        if (n > 9216.0) {
            return 7;
        }
        if (n > 4096.0) {
            return 9;
        }
        if (n > 1024.0) {
            return 11;
        }
        if (n <= 576.0) {
            return (n <= 256.0) ? 15 : 14;
        }
        return 13;
    }
    
    public float method12493() {
        return 0.75f;
    }
    
    static {
        field18584 = new ResourceLocation("textures/environment/end_sky.png");
        field18585 = new ResourceLocation("textures/entity/end_portal.png");
        field18586 = new Random(31100L);
        field18587 = IntStream.range(0, 16).mapToObj(n -> Class6332.method18790(n + 1)).collect((Collector<? super Object, Object, List<Class6332>>)ImmutableList.toImmutableList());
    }
}

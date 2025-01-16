// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class9356
{
    private static String[] field40137;
    private final TextureAtlasSprite[] field40138;
    private final TextureAtlasSprite[] field40139;
    private TextureAtlasSprite field40140;
    
    public Class9356() {
        this.field40138 = new TextureAtlasSprite[2];
        this.field40139 = new TextureAtlasSprite[2];
    }
    
    public void method34678() {
        this.field40138[0] = Minecraft.method5277().method5322().method6453().method35428(Class7521.field29174.getDefaultState()).method18696();
        this.field40138[1] = Class7637.field30239.method11332();
        this.field40139[0] = Minecraft.method5277().method5322().method6453().method35428(Class7521.field29173.getDefaultState()).method18696();
        this.field40139[1] = Class7637.field30240.method11332();
        this.field40140 = Class7637.field30241.method11332();
    }
    
    private static boolean method34679(final IBlockReader class1855, final BlockPos class1856, final Direction class1857, final IFluidState class1858) {
        return class1855.getFluidState(class1856.method1149(class1857)).getFluid().isEquivalentTo(class1858.getFluid());
    }
    
    private static boolean method34680(final IBlockReader class1855, final BlockPos class1856, final Direction class1857, final float n) {
        final BlockPos method1149 = class1856.method1149(class1857);
        final BlockState method1150 = class1855.getBlockState(method1149);
        return method1150.isSolid() && VoxelShapes.method24502(VoxelShapes.method24488(0.0, 0.0, 0.0, 1.0, n, 1.0), method1150.getRenderShape(class1855, method1149), class1857);
    }
    
    public boolean method34681(final Class1856 class1856, final BlockPos class1857, final Class4150 class1858, final IFluidState class1859) {
        final BlockState method21791 = class1859.getBlockState();
        boolean b7;
        try {
            if (Config.method28955()) {
                Class8900.method31337(method21791, class1858);
            }
            final boolean method21792 = class1859.isTagged(Class7324.field28320);
            TextureAtlasSprite[] array = method21792 ? this.field40138 : this.field40139;
            if (Class9570.field41292.method22605()) {
                final TextureAtlasSprite[] array2 = (TextureAtlasSprite[])Class9570.method35818(Class9570.field41292, class1856, class1857, class1859);
                if (array2 != null) {
                    array = array2;
                }
            }
            final Class9145 method21793 = class1858.method12414(method21791, class1857);
            int n = -1;
            float n2 = 1.0f;
            if (Class9570.field41250.method22605()) {
                final Object method21794 = Class9570.method35826(class1859.getFluid(), Class9570.field41250, new Object[0]);
                if (method21794 != null && Class9570.field41257.method22605()) {
                    n = Class9570.method35821(method21794, Class9570.field41257, class1856, class1857);
                    n2 = (n >> 24 & 0xFF) / 255.0f;
                }
            }
            if (n < 0) {
                n = Class8763.method30340(class1856, method21791, class1857, method21793);
            }
            final float n3 = (n >> 16 & 0xFF) / 255.0f;
            final float n4 = (n >> 8 & 0xFF) / 255.0f;
            final float n5 = (n & 0xFF) / 255.0f;
            final boolean b = !method34679(class1856, class1857, Direction.UP, class1859);
            final boolean b2 = !method34679(class1856, class1857, Direction.DOWN, class1859) && !method34680(class1856, class1857, Direction.DOWN, 0.8888889f);
            final boolean b3 = !method34679(class1856, class1857, Direction.NORTH, class1859);
            final boolean b4 = !method34679(class1856, class1857, Direction.SOUTH, class1859);
            final boolean b5 = !method34679(class1856, class1857, Direction.WEST, class1859);
            final boolean b6 = !method34679(class1856, class1857, Direction.EAST, class1859);
            if (b || b2 || b6 || b5 || b3 || b4) {
                b7 = false;
                float method21795 = this.method34685(class1856, class1857, class1859.getFluid());
                float method21796 = this.method34685(class1856, class1857.method1143(), class1859.getFluid());
                float method21797 = this.method34685(class1856, class1857.method1147().method1143(), class1859.getFluid());
                float method21798 = this.method34685(class1856, class1857.method1147(), class1859.getFluid());
                final double n6 = class1857.getX() & 0xF;
                final double n7 = class1857.getY() & 0xF;
                final double n8 = class1857.getZ() & 0xF;
                final float n9 = 0.001f;
                final float n10 = b2 ? 0.001f : 0.0f;
                if (b && !method34680(class1856, class1857, Direction.UP, Math.min(Math.min(method21795, method21796), Math.min(method21797, method21798)))) {
                    b7 = true;
                    method21795 -= 0.001f;
                    method21796 -= 0.001f;
                    method21797 -= 0.001f;
                    method21798 -= 0.001f;
                    final Vec3d method21799 = class1859.getFlow(class1856, class1857);
                    float n11;
                    float n12;
                    float method21800;
                    float n13;
                    float n14;
                    float method21801;
                    float method21802;
                    float method21803;
                    if (method21799.x == 0.0 && method21799.z == 0.0) {
                        final TextureAtlasSprite class1860 = array[0];
                        class1858.method12407(class1860);
                        n11 = class1860.method7499(0.0);
                        n12 = class1860.method7502(0.0);
                        method21800 = n11;
                        n13 = class1860.method7502(16.0);
                        n14 = class1860.method7499(16.0);
                        method21801 = n13;
                        method21802 = n14;
                        method21803 = n12;
                    }
                    else {
                        final TextureAtlasSprite class1861 = array[1];
                        class1858.method12407(class1861);
                        final float n15 = (float) MathHelper.method35693(method21799.z, method21799.x) - 1.5707964f;
                        final float n16 = MathHelper.sin(n15) * 0.25f;
                        final float n17 = MathHelper.cos(n15) * 0.25f;
                        n11 = class1861.method7499(8.0f + (-n17 - n16) * 16.0f);
                        n12 = class1861.method7502(8.0f + (-n17 + n16) * 16.0f);
                        method21800 = class1861.method7499(8.0f + (-n17 + n16) * 16.0f);
                        n13 = class1861.method7502(8.0f + (n17 + n16) * 16.0f);
                        n14 = class1861.method7499(8.0f + (n17 + n16) * 16.0f);
                        method21801 = class1861.method7502(8.0f + (n17 - n16) * 16.0f);
                        method21802 = class1861.method7499(8.0f + (n17 - n16) * 16.0f);
                        method21803 = class1861.method7502(8.0f + (-n17 - n16) * 16.0f);
                    }
                    final float n18 = (n11 + method21800 + n14 + method21802) / 4.0f;
                    final float n19 = (n12 + n13 + method21801 + method21803) / 4.0f;
                    final float n20 = 4.0f / Math.max(array[0].method7496() / (array[0].method7501() - array[0].method7500()), array[0].method7495() / (array[0].method7498() - array[0].method7497()));
                    final float method21804 = MathHelper.method35700(n20, n11, n18);
                    final float method21805 = MathHelper.method35700(n20, method21800, n18);
                    final float method21806 = MathHelper.method35700(n20, n14, n18);
                    final float method21807 = MathHelper.method35700(n20, method21802, n18);
                    final float method21808 = MathHelper.method35700(n20, n12, n19);
                    final float method21809 = MathHelper.method35700(n20, n13, n19);
                    final float method21810 = MathHelper.method35700(n20, method21801, n19);
                    final float method21811 = MathHelper.method35700(n20, method21803, n19);
                    final int method21812 = this.method34684(class1856, class1857);
                    final float n21 = 1.0f * n3;
                    final float n22 = 1.0f * n4;
                    final float n23 = 1.0f * n5;
                    this.method34683(class1858, n6 + 0.0, n7 + method21795, n8 + 0.0, n21, n22, n23, n2, method21804, method21808, method21812);
                    this.method34683(class1858, n6 + 0.0, n7 + method21796, n8 + 1.0, n21, n22, n23, n2, method21805, method21809, method21812);
                    this.method34683(class1858, n6 + 1.0, n7 + method21797, n8 + 1.0, n21, n22, n23, n2, method21806, method21810, method21812);
                    this.method34683(class1858, n6 + 1.0, n7 + method21798, n8 + 0.0, n21, n22, n23, n2, method21807, method21811, method21812);
                    if (class1859.shouldRenderSides(class1856, class1857.method1137())) {
                        this.method34683(class1858, n6 + 0.0, n7 + method21795, n8 + 0.0, n21, n22, n23, n2, method21804, method21808, method21812);
                        this.method34683(class1858, n6 + 1.0, n7 + method21798, n8 + 0.0, n21, n22, n23, n2, method21807, method21811, method21812);
                        this.method34683(class1858, n6 + 1.0, n7 + method21797, n8 + 1.0, n21, n22, n23, n2, method21806, method21810, method21812);
                        this.method34683(class1858, n6 + 0.0, n7 + method21796, n8 + 1.0, n21, n22, n23, n2, method21805, method21809, method21812);
                    }
                }
                if (b2) {
                    class1858.method12407(array[0]);
                    final float method21813 = array[0].method7497();
                    final float method21814 = array[0].method7498();
                    final float method21815 = array[0].method7500();
                    final float method21816 = array[0].method7501();
                    final int method21817 = this.method34684(class1856, class1857.method1139());
                    final float method21818 = Class6225.method18523(Direction.DOWN);
                    final float n24 = method21818 * n3;
                    final float n25 = method21818 * n4;
                    final float n26 = method21818 * n5;
                    this.method34683(class1858, n6, n7 + n10, n8 + 1.0, n24, n25, n26, n2, method21813, method21816, method21817);
                    this.method34683(class1858, n6, n7 + n10, n8, n24, n25, n26, n2, method21813, method21815, method21817);
                    this.method34683(class1858, n6 + 1.0, n7 + n10, n8, n24, n25, n26, n2, method21814, method21815, method21817);
                    this.method34683(class1858, n6 + 1.0, n7 + n10, n8 + 1.0, n24, n25, n26, n2, method21814, method21816, method21817);
                    b7 = true;
                }
                for (int i = 0; i < 4; ++i) {
                    float n27;
                    float n28;
                    double n29;
                    double n30;
                    double n31;
                    double n32;
                    Direction class1862;
                    boolean b8;
                    if (i == 0) {
                        n27 = method21795;
                        n28 = method21798;
                        n29 = n6;
                        n30 = n6 + 1.0;
                        n31 = n8 + 0.0010000000474974513;
                        n32 = n8 + 0.0010000000474974513;
                        class1862 = Direction.NORTH;
                        b8 = b3;
                    }
                    else if (i == 1) {
                        n27 = method21797;
                        n28 = method21796;
                        n29 = n6 + 1.0;
                        n30 = n6;
                        n31 = n8 + 1.0 - 0.0010000000474974513;
                        n32 = n8 + 1.0 - 0.0010000000474974513;
                        class1862 = Direction.SOUTH;
                        b8 = b4;
                    }
                    else if (i == 2) {
                        n27 = method21796;
                        n28 = method21795;
                        n29 = n6 + 0.0010000000474974513;
                        n30 = n6 + 0.0010000000474974513;
                        n31 = n8 + 1.0;
                        n32 = n8;
                        class1862 = Direction.WEST;
                        b8 = b5;
                    }
                    else {
                        n27 = method21798;
                        n28 = method21797;
                        n29 = n6 + 1.0 - 0.0010000000474974513;
                        n30 = n6 + 1.0 - 0.0010000000474974513;
                        n31 = n8;
                        n32 = n8 + 1.0;
                        class1862 = Direction.EAST;
                        b8 = b6;
                    }
                    if (b8 && !method34680(class1856, class1857, class1862, Math.max(n27, n28))) {
                        b7 = true;
                        final BlockPos method21819 = class1857.method1149(class1862);
                        TextureAtlasSprite field40140 = array[1];
                        float a = 0.0f;
                        float a2 = 0.0f;
                        boolean b9 = !method21792;
                        if (Class9570.field41248.method22605()) {
                            b9 = (array[2] != null);
                        }
                        if (b9) {
                            final BlockState method21820 = class1856.getBlockState(method21819);
                            final Block method21821 = method21820.getBlock();
                            boolean method21822 = false;
                            if (Class9570.field41248.method22605()) {
                                method21822 = Class9570.method35820(method21820, Class9570.field41248, class1856, method21819, class1859);
                            }
                            if (method21822 || method21821 == Class7521.field29213 || method21821 instanceof Class3844 || method21821 == Class7521.field29417 || method21821 == Class7521.field29516) {
                                field40140 = this.field40140;
                            }
                            if (method21821 == Class7521.field29298 || method21821 == Class7521.field29637) {
                                a = 0.9375f;
                                a2 = 0.9375f;
                            }
                            if (method21821 instanceof Class3921) {
                                final Class3921 class1863 = (Class3921)method21821;
                                if (method21820.get(Class3921.field17777) == Class186.field599) {
                                    a = 0.5f;
                                    a2 = 0.5f;
                                }
                            }
                        }
                        class1858.method12407(field40140);
                        if (n27 > a || n28 > a2) {
                            float min = Math.min(a, n27);
                            float min2 = Math.min(a2, n28);
                            if (min > n9) {
                                min -= n9;
                            }
                            if (min2 > n9) {
                                min2 -= n9;
                            }
                            final float method21823 = field40140.method7502((1.0f - min) * 16.0f * 0.5f);
                            final float method21824 = field40140.method7502((1.0f - min2) * 16.0f * 0.5f);
                            final float method21825 = field40140.method7499(0.0);
                            final float method21826 = field40140.method7499(8.0);
                            final float method21827 = field40140.method7502((1.0f - n27) * 16.0f * 0.5f);
                            final float method21828 = field40140.method7502((1.0f - n28) * 16.0f * 0.5f);
                            field40140.method7502(8.0);
                            final int method21829 = this.method34684(class1856, method21819);
                            final float n33 = (i < 2) ? Class6225.method18523(Direction.NORTH) : Class6225.method18523(Direction.WEST);
                            final float n34 = 1.0f * n33 * n3;
                            final float n35 = 1.0f * n33 * n4;
                            final float n36 = 1.0f * n33 * n5;
                            this.method34683(class1858, n29, n7 + n27, n31, n34, n35, n36, n2, method21825, method21827, method21829);
                            this.method34683(class1858, n30, n7 + n28, n32, n34, n35, n36, n2, method21826, method21828, method21829);
                            this.method34683(class1858, n30, n7 + n10, n32, n34, n35, n36, n2, method21826, method21824, method21829);
                            this.method34683(class1858, n29, n7 + n10, n31, n34, n35, n36, n2, method21825, method21823, method21829);
                            if (field40140 != this.field40140) {
                                this.method34683(class1858, n29, n7 + n10, n31, n34, n35, n36, n2, method21825, method21823, method21829);
                                this.method34683(class1858, n30, n7 + n10, n32, n34, n35, n36, n2, method21826, method21824, method21829);
                                this.method34683(class1858, n30, n7 + n28, n32, n34, n35, n36, n2, method21826, method21828, method21829);
                                this.method34683(class1858, n29, n7 + n27, n31, n34, n35, n36, n2, method21825, method21827, method21829);
                            }
                        }
                    }
                }
                class1858.method12407(null);
                return b7;
            }
            b7 = false;
        }
        finally {
            if (Config.method28955()) {
                Class8900.method31338(class1858);
            }
        }
        return b7;
    }
    
    private void method34682(final Class4150 class4150, final double n, final double n2, final double n3, final float n4, final float n5, final float n6, final float n7, final float n8, final int n9) {
        class4150.pos(n, n2, n3).color(n4, n5, n6, 1.0f).tex(n7, n8).method12440(n9).method12436(0.0f, 1.0f, 0.0f).endVertex();
    }
    
    private void method34683(final Class4150 class4150, final double n, final double n2, final double n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final int n10) {
        class4150.pos(n, n2, n3).color(n4, n5, n6, n7).tex(n8, n9).method12440(n10).method12436(0.0f, 1.0f, 0.0f).endVertex();
    }
    
    private int method34684(final Class1856 class1856, final BlockPos class1857) {
        final int method5776 = Class1656.method5776(class1856, class1857);
        final int method5777 = Class1656.method5776(class1856, class1857.method1137());
        final int n = method5776 & 0xFF;
        final int n2 = method5777 & 0xFF;
        final int n3 = method5776 >> 16 & 0xFF;
        final int n4 = method5777 >> 16 & 0xFF;
        return ((n <= n2) ? n2 : n) | ((n3 <= n4) ? n4 : n3) << 16;
    }
    
    private float method34685(final IBlockReader class1855, final BlockPos class1856, final Fluid class1857) {
        int n = 0;
        float n2 = 0.0f;
        for (int i = 0; i < 4; ++i) {
            final BlockPos method1134 = class1856.add(-(i & 0x1), 0, -(i >> 1 & 0x1));
            if (class1855.getFluidState(method1134.method1137()).getFluid().isEquivalentTo(class1857)) {
                return 1.0f;
            }
            final IFluidState method1135 = class1855.getFluidState(method1134);
            if (!method1135.getFluid().isEquivalentTo(class1857)) {
                if (!class1855.getBlockState(method1134).getMaterial().method26439()) {
                    ++n;
                }
            }
            else {
                final float method1136 = method1135.getActualHeight(class1855, method1134);
                if (method1136 < 0.8f) {
                    n2 += method1136;
                    ++n;
                }
                else {
                    n2 += method1136 * 10.0f;
                    n += 10;
                }
            }
        }
        return n2 / n;
    }
}

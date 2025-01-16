// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.Random;

public class Class4518 extends Class4515
{
    private final Class1957 field19925;
    private final float field19926;
    private final ResourceLocation field19927;
    private final Class2052 field19928;
    private final boolean field19929;
    
    public Class4518(final Class1795 class1795, final ResourceLocation field19927, final BlockPos field19928, final Class2052 field19929, final float field19930, final Class1957 field19931, final boolean field19932) {
        super(Class9520.field40978, 0);
        this.field19927 = field19927;
        this.field19920 = field19928;
        this.field19928 = field19929;
        this.field19926 = field19930;
        this.field19925 = field19931;
        this.field19929 = field19932;
        this.method13514(class1795);
    }
    
    public Class4518(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40978, class1796);
        this.field19927 = new ResourceLocation(class1796.method323("Template"));
        this.field19928 = Class2052.valueOf(class1796.method323("Rot"));
        this.field19926 = class1796.method321("Integrity");
        this.field19925 = Class1957.valueOf(class1796.method323("BiomeType"));
        this.field19929 = class1796.method329("IsLarge");
        this.method13514(class1795);
    }
    
    private void method13514(final Class1795 class1795) {
        this.method13510(class1795.method6518(this.field19927), this.field19920, new Class9092().method32845(this.field19928).method32844(Class2181.field12917).method32853(Class4106.field18209));
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method306("Template", this.field19927.toString());
        class51.method306("Rot", this.field19928.name());
        class51.method304("Integrity", this.field19926);
        class51.method306("BiomeType", this.field19925.toString());
        class51.method312("IsLarge", this.field19929);
    }
    
    @Override
    public void method13511(final String s, final BlockPos class354, final Class1851 class355, final Random random, final MutableBoundingBox class356) {
        if (!"chest".equals(s)) {
            if ("drowned".equals(s)) {
                final Class830 class357 = EntityType.field28973.method23371(class355.method6744());
                class357.method4190();
                class357.method1729(class354, 0.0f, 0.0f);
                class357.method4188(class355, class355.method6784(class354), Class2101.field12177, null, null);
                class355.method6886(class357);
                if (class354.getY() <= class355.method6743()) {
                    class355.setBlockState(class354, Class7521.field29173.getDefaultState(), 2);
                }
                else {
                    class355.setBlockState(class354, Class7521.field29147.getDefaultState(), 2);
                }
            }
        }
        else {
            class355.setBlockState(class354, ((StateHolder<O, BlockState>)Class7521.field29292.getDefaultState()).with((IProperty<Comparable>)Class3865.field17499, class355.method6702(class354).method21793(Class7324.field28319)), 2);
            final TileEntity method6727 = class355.method6727(class354);
            if (method6727 instanceof Class475) {
                ((Class475)method6727).method2327(this.field19929 ? Class9020.field38094 : Class9020.field38093, random.nextLong());
            }
        }
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        this.field19919.method32852().method32853(new Class4108(this.field19926)).method32853(Class4106.field18209);
        this.field19920 = new BlockPos(this.field19920.getX(), class1851.method6699(Class2020.field11523, this.field19920.getX(), this.field19920.getZ()), this.field19920.getZ());
        this.field19920 = new BlockPos(this.field19920.getX(), this.method13515(this.field19920, class1851, Class6585.method19962(new BlockPos(this.field19918.method19945().getX() - 1, 0, this.field19918.method19945().getZ() - 1), Class2181.field12917, this.field19928, BlockPos.ZERO).add(this.field19920)), this.field19920.getZ());
        return super.method13421(class1851, class1852, random, class1853, class1854);
    }
    
    private int method13515(final BlockPos class354, final Class1855 class355, final BlockPos class356) {
        int method1075 = class354.getY();
        int min = 512;
        final int n = method1075 - 1;
        int n2 = 0;
    Label_0152_Outer:
        for (final BlockPos class357 : BlockPos.getAllInBoxMutable(class354, class356)) {
            final int method1076 = class357.getX();
            final int method1077 = class357.getZ();
            int b = class354.getY() - 1;
            final Mutable class358 = new Mutable(method1076, b, method1077);
            BlockState class359 = class355.getBlockState(class358);
            Class7099 class360 = class355.method6702(class358);
            while (true) {
                if (!class359.method21706()) {
                    if (!class360.method21793(Class7324.field28319)) {
                        if (!class359.getBlock().method11785(Class7188.field27917)) {
                            break;
                        }
                    }
                }
                if (b <= 1) {
                    break;
                }
                --b;
                class358.setPos(method1076, b, method1077);
                class359 = class355.getBlockState(class358);
                class360 = class355.method6702(class358);
            }
            while (true) {
                min = Math.min(min, b);
                if (b >= n - 2) {
                    continue Label_0152_Outer;
                }
                ++n2;
                continue Label_0152_Outer;
                continue;
            }
        }
        final int abs = Math.abs(class354.getX() - class356.getX());
        if (n - min > 2) {
            if (n2 > abs - 2) {
                method1075 = min + 1;
            }
        }
        return method1075;
    }
}

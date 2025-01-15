// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class4516 extends Class4515
{
    private final Class1932 field19921;
    private final Class2052 field19922;
    
    public Class4516(final Class1795 class1795, final Class1932 field19921, final BlockPos class1796, final Class2052 field19922, final int n) {
        super(Class9520.field40979, 0);
        this.field19921 = field19921;
        final BlockPos class1797 = Class5172.method16138().get(field19921);
        this.field19920 = class1796.add(class1797.getX(), class1797.getY() - n, class1797.getZ());
        this.field19922 = field19922;
        this.method13512(class1795);
    }
    
    public Class4516(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40979, class1796);
        this.field19921 = new Class1932(class1796.method323("Template"));
        this.field19922 = Class2052.valueOf(class1796.method323("Rot"));
        this.method13512(class1795);
    }
    
    private void method13512(final Class1795 class1795) {
        this.method13510(class1795.method6518(this.field19921), this.field19920, new Class9092().method32845(this.field19922).method32844(Class2181.field12917).method32846(Class5172.method16139().get(this.field19921)).method32853(Class4106.field18207));
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method306("Template", this.field19921.toString());
        class51.method306("Rot", this.field19922.name());
    }
    
    @Override
    public void method13511(final String anObject, final BlockPos class354, final Class1851 class355, final Random random, final MutableBoundingBox class356) {
        if ("chest".equals(anObject)) {
            class355.method6688(class354, Class7521.field29147.method11878(), 3);
            final TileEntity method6727 = class355.method6727(class354.method1139());
            if (method6727 instanceof Class475) {
                ((Class475)method6727).method2327(Class9020.field38091, random.nextLong());
            }
        }
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        final Class9092 method32853 = new Class9092().method32845(this.field19922).method32844(Class2181.field12917).method32846(Class5172.method16139().get(this.field19921)).method32853(Class4106.field18207);
        final BlockPos class1855 = Class5172.method16138().get(this.field19921);
        final BlockPos method32854 = this.field19920.add(Class6585.method19953(method32853, new BlockPos(3 - class1855.getX(), 0, 0 - class1855.getZ())));
        final int method32855 = class1851.method6699(Class2020.field11521, method32854.getX(), method32854.getZ());
        final BlockPos field19920 = this.field19920;
        this.field19920 = this.field19920.add(0, method32855 - 90 - 1, 0);
        final boolean method32856 = super.method13421(class1851, class1852, random, class1853, class1854);
        if (this.field19921.equals(Class5172.method16140())) {
            final BlockPos method32857 = this.field19920.add(Class6585.method19953(method32853, new BlockPos(3, 0, 5)));
            final BlockState method32858 = class1851.method6701(method32857.method1139());
            if (!method32858.method21706()) {
                if (method32858.method21696() != Class7521.field29307) {
                    class1851.method6688(method32857, Class7521.field29331.method11878(), 3);
                }
            }
        }
        this.field19920 = field19920;
        return method32856;
    }
}

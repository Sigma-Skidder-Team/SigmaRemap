// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class4519 extends Class4515
{
    private final Class2052 field19930;
    private final Class1932 field19931;
    private final boolean field19932;
    
    public Class4519(final Class1795 class1795, final Class1932 field19931, final BlockPos field19932, final Class2052 field19933, final boolean field19934) {
        super(Class9520.field40997, 0);
        this.field19920 = field19932;
        this.field19930 = field19933;
        this.field19931 = field19931;
        this.field19932 = field19934;
        this.method13516(class1795);
    }
    
    public Class4519(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40997, class1796);
        this.field19931 = new Class1932(class1796.method323("Template"));
        this.field19932 = class1796.method329("isBeached");
        this.field19930 = Class2052.valueOf(class1796.method323("Rot"));
        this.method13516(class1795);
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method306("Template", this.field19931.toString());
        class51.method312("isBeached", this.field19932);
        class51.method306("Rot", this.field19930.name());
    }
    
    private void method13516(final Class1795 class1795) {
        this.method13510(class1795.method6518(this.field19931), this.field19920, new Class9092().method32845(this.field19930).method32844(Class2181.field12917).method32846(Class6449.method19303()).method32853(Class4106.field18209));
    }
    
    @Override
    public void method13511(final String anObject, final BlockPos class354, final Class1851 class355, final Random random, final MutableBoundingBox class356) {
        if (!"map_chest".equals(anObject)) {
            if (!"treasure_chest".equals(anObject)) {
                if ("supply_chest".equals(anObject)) {
                    Class456.method2323(class355, random, class354.method1139(), Class9020.field38097);
                }
            }
            else {
                Class456.method2323(class355, random, class354.method1139(), Class9020.field38098);
            }
        }
        else {
            Class456.method2323(class355, random, class354.method1139(), Class9020.field38096);
        }
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        int min = 256;
        int n = 0;
        final BlockPos method19945 = this.field19918.method19945();
        final Class2020 class1855 = this.field19932 ? Class2020.field11521 : Class2020.field11523;
        final int n2 = method19945.getX() * method19945.getZ();
        if (n2 != 0) {
            for (final BlockPos class1856 : BlockPos.getAllInBoxMutable(this.field19920, this.field19920.add(method19945.getX() - 1, 0, method19945.getZ() - 1))) {
                final int method19946 = class1851.method6699(class1855, class1856.getX(), class1856.getZ());
                n += method19946;
                min = Math.min(min, method19946);
            }
            final int method19947 = n / n2;
        }
        else {
            final int method19947 = class1851.method6699(class1855, this.field19920.getX(), this.field19920.getZ());
        }
        int method19947;
        this.field19920 = new BlockPos(this.field19920.getX(), this.field19932 ? (min - method19945.getY() / 2 - random.nextInt(3)) : method19947, this.field19920.getZ());
        return super.method13421(class1851, class1852, random, class1853, class1854);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class835 extends Class834
{
    private static final Class8810<Integer> field4447;
    private static final Class1932[] field4448;
    private static final Class1932[] field4449;
    private static final Class1932[] field4450;
    public static final int[] field4451;
    private boolean field4452;
    
    private static int method4972(final Class296 class296, final Class181 class297, final Class181 class298) {
        return (class296.method947() & 0xFF) | (class296.method948() & 0xFF) << 8 | (class297.method813() & 0xFF) << 16 | (class298.method813() & 0xFF) << 24;
    }
    
    public Class835(final Class7499<? extends Class835> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4452 = true;
    }
    
    public static String method4973(final int i) {
        return "entity.minecraft.tropical_fish.predefined." + i;
    }
    
    public static Class181 method4974(final int n) {
        return Class181.method819(method4979(n));
    }
    
    public static Class181 method4975(final int n) {
        return Class181.method819(method4981(n));
    }
    
    public static String method4976(final int n) {
        return "entity.minecraft.tropical_fish.type." + Class296.method949(method4983(n), method4985(n));
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class835.field4447, 0);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("Variant", this.method4978());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4977(class51.method319("Variant"));
    }
    
    public void method4977(final int i) {
        this.field2432.method33569(Class835.field4447, i);
    }
    
    @Override
    public boolean method4182(final int n) {
        return !this.field4452;
    }
    
    public int method4978() {
        return this.field2432.method33568(Class835.field4447);
    }
    
    @Override
    public void method4955(final Class8321 class8321) {
        super.method4955(class8321);
        class8321.method27658().method298("BucketVariantTag", this.method4978());
    }
    
    @Override
    public Class8321 method4956() {
        return new Class8321(Class7739.field31362);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35646;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35647;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35649;
    }
    
    @Override
    public Class7795 method4958() {
        return Class8520.field35648;
    }
    
    private static int method4979(final int n) {
        return (n & 0xFF0000) >> 16;
    }
    
    public float[] method4980() {
        return Class181.method819(method4979(this.method4978())).method815();
    }
    
    private static int method4981(final int n) {
        return (n & 0xFF000000) >> 24;
    }
    
    public float[] method4982() {
        return Class181.method819(method4981(this.method4978())).method815();
    }
    
    public static int method4983(final int n) {
        return Math.min(n & 0xFF, 1);
    }
    
    public int method4984() {
        return method4983(this.method4978());
    }
    
    private static int method4985(final int n) {
        return Math.min((n & 0xFF00) >> 8, 5);
    }
    
    public Class1932 method4986() {
        return (method4983(this.method4978()) != 0) ? Class835.field4450[method4985(this.method4978())] : Class835.field4449[method4985(this.method4978())];
    }
    
    public Class1932 method4987() {
        return Class835.field4448[method4983(this.method4978())];
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 method4188, final Class51 class1854) {
        method4188 = super.method4188(class1851, class1852, class1853, method4188, class1854);
        if (class1854 != null && class1854.method316("BucketVariantTag", 3)) {
            this.method4977(class1854.method319("BucketVariantTag"));
            return method4188;
        }
        int n;
        int n2;
        int n3;
        int n4;
        if (!(method4188 instanceof Class5504)) {
            if (this.field2423.nextFloat() >= 0.9) {
                this.field4452 = false;
                n = this.field2423.nextInt(2);
                n2 = this.field2423.nextInt(6);
                n3 = this.field2423.nextInt(15);
                n4 = this.field2423.nextInt(15);
            }
            else {
                final int n5 = Class835.field4451[this.field2423.nextInt(Class835.field4451.length)];
                n = (n5 & 0xFF);
                n2 = (n5 & 0xFF00) >> 8;
                n3 = (n5 & 0xFF0000) >> 16;
                n4 = (n5 & 0xFF000000) >> 24;
                method4188 = new Class5504(this, n, n2, n3, n4, null);
            }
        }
        else {
            final Class5504 class1855 = (Class5504)method4188;
            n = Class5504.method16805(class1855);
            n2 = Class5504.method16806(class1855);
            n3 = Class5504.method16807(class1855);
            n4 = Class5504.method16808(class1855);
        }
        this.method4977(n | n2 << 8 | n3 << 16 | n4 << 24);
        return method4188;
    }
    
    static {
        field4447 = Class9184.method33564(Class835.class, Class7709.field30654);
        field4448 = new Class1932[] { new Class1932("textures/entity/fish/tropical_a.png"), new Class1932("textures/entity/fish/tropical_b.png") };
        field4449 = new Class1932[] { new Class1932("textures/entity/fish/tropical_a_pattern_1.png"), new Class1932("textures/entity/fish/tropical_a_pattern_2.png"), new Class1932("textures/entity/fish/tropical_a_pattern_3.png"), new Class1932("textures/entity/fish/tropical_a_pattern_4.png"), new Class1932("textures/entity/fish/tropical_a_pattern_5.png"), new Class1932("textures/entity/fish/tropical_a_pattern_6.png") };
        field4450 = new Class1932[] { new Class1932("textures/entity/fish/tropical_b_pattern_1.png"), new Class1932("textures/entity/fish/tropical_b_pattern_2.png"), new Class1932("textures/entity/fish/tropical_b_pattern_3.png"), new Class1932("textures/entity/fish/tropical_b_pattern_4.png"), new Class1932("textures/entity/fish/tropical_b_pattern_5.png"), new Class1932("textures/entity/fish/tropical_b_pattern_6.png") };
        field4451 = new int[] { method4972(Class296.field1691, Class181.field538, Class181.field544), method4972(Class296.field1690, Class181.field544, Class181.field544), method4972(Class296.field1690, Class181.field544, Class181.field548), method4972(Class296.field1695, Class181.field537, Class181.field544), method4972(Class296.field1685, Class181.field548, Class181.field544), method4972(Class296.field1684, Class181.field538, Class181.field537), method4972(Class296.field1689, Class181.field543, Class181.field540), method4972(Class296.field1693, Class181.field547, Class181.field541), method4972(Class296.field1695, Class181.field537, Class181.field551), method4972(Class296.field1689, Class181.field537, Class181.field541), method4972(Class296.field1692, Class181.field537, Class181.field544), method4972(Class296.field1695, Class181.field537, Class181.field538), method4972(Class296.field1687, Class181.field546, Class181.field543), method4972(Class296.field1688, Class181.field542, Class181.field540), method4972(Class296.field1694, Class181.field551, Class181.field537), method4972(Class296.field1686, Class181.field544, Class181.field551), method4972(Class296.field1693, Class181.field551, Class181.field537), method4972(Class296.field1690, Class181.field537, Class181.field541), method4972(Class296.field1684, Class181.field551, Class181.field537), method4972(Class296.field1685, Class181.field544, Class181.field537), method4972(Class296.field1687, Class181.field546, Class181.field541), method4972(Class296.field1690, Class181.field541, Class181.field541) };
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class384 extends Class354
{
    private static String[] field2171;
    private int field2232;
    private int field2233;
    private int field2234;
    private int field2235;
    private Class384[] field2236;
    private boolean field2237;
    
    public Class384() {
        this(0, 0, 0, 0);
    }
    
    public Class384(final int n, final int n2, final int n3) {
        this(n, n2, n3, 0);
    }
    
    public Class384(final double n, final double n2, final double n3) {
        this(Class9546.method35644(n), Class9546.method35644(n2), Class9546.method35644(n3));
    }
    
    public Class384(final int field2232, final int field2233, final int field2234, final int field2235) {
        super(0, 0, 0);
        this.field2232 = field2232;
        this.field2233 = field2233;
        this.field2234 = field2234;
        this.field2235 = field2235;
    }
    
    @Override
    public int method1074() {
        return this.field2232;
    }
    
    @Override
    public int method1075() {
        return this.field2233;
    }
    
    @Override
    public int method1076() {
        return this.field2234;
    }
    
    public void method1279(final int field2232, final int field2233, final int field2234) {
        this.field2232 = field2232;
        this.field2233 = field2233;
        this.field2234 = field2234;
        this.field2237 = true;
    }
    
    public void method1280(final double n, final double n2, final double n3) {
        this.method1279(Class9546.method35644(n), Class9546.method35644(n2), Class9546.method35644(n3));
    }
    
    @Override
    public Class354 method1149(final Class179 class179) {
        if (this.field2235 > 0) {
            if (this.field2236 == null) {
                this.field2236 = new Class384[Class179.field524.length];
            }
            if (this.field2237) {
                this.method1283();
            }
            final int method779 = class179.method779();
            Class384 class180 = this.field2236[method779];
            if (class180 == null) {
                class180 = new Class384(this.field2232 + class179.method785(), this.field2233 + class179.method786(), this.field2234 + class179.method787(), this.field2235 - 1);
                this.field2236[method779] = class180;
            }
            return class180;
        }
        return super.method1150(class179, 1).method1153();
    }
    
    @Override
    public Class354 method1150(final Class179 class179, final int n) {
        return (n != 1) ? super.method1150(class179, n).method1153() : this.method1149(class179);
    }
    
    public void method1281(final Class354 class354, final Class179 class355) {
        this.field2232 = class354.method1074() + class355.method785();
        this.field2233 = class354.method1075() + class355.method786();
        this.field2234 = class354.method1076() + class355.method787();
    }
    
    public void method1282(final Class354 class354, final Class179 class355, final Class179 class356) {
        this.field2232 = class354.method1074() + class355.method785() + class356.method785();
        this.field2233 = class354.method1075() + class355.method786() + class356.method786();
        this.field2234 = class354.method1076() + class355.method787() + class356.method787();
    }
    
    private void method1283() {
        for (int i = 0; i < 6; ++i) {
            final Class384 class384 = this.field2236[i];
            if (class384 != null) {
                final Class179 class385 = Class179.field524[i];
                class384.method1279(this.field2232 + class385.method785(), this.field2233 + class385.method786(), this.field2234 + class385.method787());
            }
        }
        this.field2237 = false;
    }
    
    @Override
    public Class354 method1153() {
        return new Class354(this.field2232, this.field2233, this.field2234);
    }
    
    public static Iterable<Class354> method1154(final Class354 class354, final Class354 class355) {
        return new Class97(new Class354(Math.min(class354.method1074(), class355.method1074()), Math.min(class354.method1075(), class355.method1075()), Math.min(class354.method1076(), class355.method1076())), new Class354(Math.max(class354.method1074(), class355.method1074()), Math.max(class354.method1075(), class355.method1075()), Math.max(class354.method1076(), class355.method1076())));
    }
}

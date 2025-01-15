// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class849 extends Class763
{
    private static String[] field4514;
    private float field4515;
    private int field4516;
    private static final Class8810<Byte> field4517;
    
    public Class849(final EntityType<? extends Class849> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4515 = 0.5f;
        this.method4145(Class257.field1211, -1.0f);
        this.method4145(Class257.field1210, 8.0f);
        this.method4145(Class257.field1214, 0.0f);
        this.method4145(Class257.field1215, 0.0f);
        this.field4108 = 10;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(4, new Class3599(this));
        this.field4114.method22062(5, new Class3489(this, 1.0));
        this.field4114.method22062(7, new Class3517(this, 1.0, 0.0f));
        this.field4114.method22062(8, new Class3628(this, Class512.class, 8.0f));
        this.field4114.method22062(8, new Class3503(this));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[0]).method11100((Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, Class512.class, true));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33410).method23941(6.0);
        this.method2710(Class8107.field33408).method23941(0.23000000417232513);
        this.method2710(Class8107.field33406).method23941(48.0);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class849.field4517, (Byte)0);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35027;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35030;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35029;
    }
    
    @Override
    public float method1726() {
        return 1.0f;
    }
    
    @Override
    public void method2736() {
        if (!this.field2404) {
            if (this.method1935().y < 0.0) {
                this.method1936(this.method1935().mul(1.0, 0.6, 1.0));
            }
        }
        if (this.field2391.field10067) {
            if (this.field2423.nextInt(24) == 0) {
                if (!this.method1696()) {
                    this.field2391.method6708(this.getPosX() + 0.5, this.getPosY() + 0.5, this.getPosZ() + 0.5, Class8520.field35028, this.method1922(), 1.0f + this.field2423.nextFloat(), this.field2423.nextFloat() * 0.7f + 0.3f, false);
                }
            }
            for (int i = 0; i < 2; ++i) {
                this.field2391.method6709(Class8432.field34632, this.method1940(0.5), this.method1943(), this.method1947(0.5), 0.0, 0.0, 0.0);
            }
        }
        super.method2736();
    }
    
    @Override
    public void method4172() {
        if (this.method1710()) {
            this.method1740(Class7929.field32569, 1.0f);
        }
        --this.field4516;
        if (this.field4516 <= 0) {
            this.field4516 = 100;
            this.field4515 = 0.5f + (float)this.field2423.nextGaussian() * 3.0f;
        }
        final Class511 method4152 = this.method4152();
        if (method4152 != null) {
            if (method4152.method1944() > this.method1944() + this.field4515) {
                if (this.method2646(method4152)) {
                    this.method1936(this.method1935().add(0.0, (0.30000001192092896 - this.method1935().y) * 0.30000001192092896, 0.0));
                    this.field2448 = true;
                }
            }
        }
        super.method4172();
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public boolean method1804() {
        return this.method5071();
    }
    
    private boolean method5071() {
        return (this.field2432.method33568(Class849.field4517) & 0x1) != 0x0;
    }
    
    private void method5072(final boolean b) {
        final byte byteValue = this.field2432.method33568(Class849.field4517);
        byte b2;
        if (!b) {
            b2 = (byte)(byteValue & 0xFFFFFFFE);
        }
        else {
            b2 = (byte)(byteValue | 0x1);
        }
        this.field2432.method33569(Class849.field4517, b2);
    }
    
    static {
        field4517 = Class9184.method33564(Class849.class, Class7709.field30653);
    }
}

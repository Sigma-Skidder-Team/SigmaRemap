// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2402 extends Class2400
{
    private Class2412 field14228;
    private Class2412 field14229;
    private Class2412 field14230;
    private float field14231;
    private Class2412 field14232;
    private Class2412 field14233;
    private Class2412 field14234;
    private Class2412 field14235;
    private Class2412 field14236;
    private Class2412 field14237;
    private boolean field14238;
    private boolean field14239;
    
    public Class2402(final float n, final float n2, final boolean b, final boolean b2) {
        this(0.0f, 0.0f, n, n2);
    }
    
    public Class2402(final float n, final float n2) {
        this(n, n2, true, true);
    }
    
    public Class2402(final float n, final float n2, final float n3, final float n4) {
        this(new Class2412(n, n2), new Class2412(n3, n4));
    }
    
    public Class2402(final float n, final float n2, final float n3, final float n4, final boolean b) {
        this(new Class2412(n, n2), new Class2412(n + n3, n2 + n4));
    }
    
    public Class2402(final float[] array, final float[] array2) {
        this.field14232 = new Class2412(0.0f, 0.0f);
        this.field14233 = new Class2412(0.0f, 0.0f);
        this.field14234 = new Class2412(0.0f, 0.0f);
        this.field14235 = new Class2412(0.0f, 0.0f);
        this.field14236 = new Class2412(0.0f, 0.0f);
        this.field14237 = new Class2412(0.0f, 0.0f);
        this.field14238 = true;
        this.field14239 = true;
        this.method9567(array, array2);
    }
    
    public Class2402(final Class2412 class2412, final Class2412 class2413) {
        this.field14232 = new Class2412(0.0f, 0.0f);
        this.field14233 = new Class2412(0.0f, 0.0f);
        this.field14234 = new Class2412(0.0f, 0.0f);
        this.field14235 = new Class2412(0.0f, 0.0f);
        this.field14236 = new Class2412(0.0f, 0.0f);
        this.field14237 = new Class2412(0.0f, 0.0f);
        this.field14238 = true;
        this.field14239 = true;
        this.method9572(class2412, class2413);
    }
    
    public void method9567(final float[] array, final float[] array2) {
        this.method9573(array[0], array[1], array2[0], array2[1]);
    }
    
    public Class2412 method9568() {
        return this.field14228;
    }
    
    public Class2412 method9569() {
        return this.field14229;
    }
    
    public float method9570() {
        return this.field14230.method9646();
    }
    
    public float method9571() {
        return this.field14230.method9645();
    }
    
    public void method9572(final Class2412 class2412, final Class2412 class2413) {
        super.field14221 = true;
        if (this.field14228 == null) {
            this.field14228 = new Class2412();
        }
        this.field14228.method9633(class2412);
        if (this.field14229 == null) {
            this.field14229 = new Class2412();
        }
        this.field14229.method9633(class2413);
        (this.field14230 = new Class2412(class2413)).method9641(class2412);
        this.field14231 = this.field14230.method9645();
    }
    
    public void method9573(final float n, final float n2, final float n3, final float n4) {
        super.field14221 = true;
        this.field14228.method9635(n, n2);
        this.field14229.method9635(n3, n4);
        final float n5 = n3 - n;
        final float n6 = n4 - n2;
        this.field14230.method9635(n5, n6);
        this.field14231 = n5 * n5 + n6 * n6;
    }
    
    public float method9574() {
        return this.field14229.method9631() - this.field14228.method9631();
    }
    
    public float method9575() {
        return this.field14229.method9632() - this.field14228.method9632();
    }
    
    @Override
    public float method9521() {
        return this.method9576();
    }
    
    @Override
    public float method9524() {
        return this.method9577();
    }
    
    public float method9576() {
        return this.field14228.method9631();
    }
    
    public float method9577() {
        return this.field14228.method9632();
    }
    
    public float method9578() {
        return this.field14229.method9631();
    }
    
    public float method9579() {
        return this.field14229.method9632();
    }
    
    public float method9580(final Class2412 class2412) {
        return (float)Math.sqrt(this.method9582(class2412));
    }
    
    public boolean method9581(final Class2412 class2412) {
        this.method9583(class2412, this.field14236);
        return class2412.equals(this.field14236);
    }
    
    public float method9582(final Class2412 class2412) {
        this.method9583(class2412, this.field14236);
        this.field14236.method9641(class2412);
        return this.field14236.method9645();
    }
    
    public void method9583(final Class2412 class2412, final Class2412 class2413) {
        this.field14232.method9633(class2412);
        this.field14232.method9641(this.field14228);
        final float n = this.field14230.method9634(this.field14232) / this.field14230.method9645();
        if (n < 0.0f) {
            class2413.method9633(this.field14228);
            return;
        }
        if (n <= 1.0f) {
            class2413.field14278 = this.field14228.method9631() + n * this.field14230.method9631();
            class2413.field14279 = this.field14228.method9632() + n * this.field14230.method9632();
            return;
        }
        class2413.method9633(this.field14229);
    }
    
    @Override
    public String toString() {
        return "[Line " + this.field14228 + "," + this.field14229 + "]";
    }
    
    public Class2412 method9584(final Class2402 class2402) {
        return this.method9585(class2402, false);
    }
    
    public Class2412 method9585(final Class2402 class2402, final boolean b) {
        final Class2412 class2403 = new Class2412();
        if (this.method9586(class2402, b, class2403)) {
            return class2403;
        }
        return null;
    }
    
    public boolean method9586(final Class2402 class2402, final boolean b, final Class2412 class2403) {
        final float n = this.field14229.method9631() - this.field14228.method9631();
        final float n2 = class2402.field14229.method9631() - class2402.field14228.method9631();
        final float n3 = this.field14229.method9632() - this.field14228.method9632();
        final float n4 = class2402.field14229.method9632() - class2402.field14228.method9632();
        final float n5 = n4 * n - n2 * n3;
        if (n5 != 0.0f) {
            final float n6 = (n2 * (this.field14228.method9632() - class2402.field14228.method9632()) - n4 * (this.field14228.method9631() - class2402.field14228.method9631())) / n5;
            final float n7 = (n * (this.field14228.method9632() - class2402.field14228.method9632()) - n3 * (this.field14228.method9631() - class2402.field14228.method9631())) / n5;
            Label_0184: {
                if (b) {
                    if (n6 >= 0.0f) {
                        if (n6 <= 1.0f) {
                            if (n7 >= 0.0f) {
                                if (n7 <= 1.0f) {
                                    break Label_0184;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            final float n8 = n6;
            class2403.method9635(this.field14228.method9631() + n8 * (this.field14229.method9631() - this.field14228.method9631()), this.field14228.method9632() + n8 * (this.field14229.method9632() - this.field14228.method9632()));
            return true;
        }
        return false;
    }
    
    @Override
    public void method9520() {
        (this.field14212 = new float[4])[0] = this.method9576();
        this.field14212[1] = this.method9577();
        this.field14212[2] = this.method9578();
        this.field14212[3] = this.method9579();
    }
    
    @Override
    public Class2400 method9519(final Class7310 class7310) {
        final float[] array = new float[4];
        this.method9520();
        class7310.method22419(this.field14212, 0, array, 0, 2);
        return new Class2402(array[0], array[1], array[2], array[3]);
    }
    
    @Override
    public boolean method9554() {
        return false;
    }
    
    @Override
    public boolean method9545(final Class2400 class2400) {
        if (!(class2400 instanceof Class2407)) {
            return super.method9545(class2400);
        }
        return class2400.method9545(this);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7470 implements Class7471
{
    private static String[] field28853;
    private Class2412 field28854;
    private Class2412 field28855;
    private Class2412 field28856;
    private Class2427 field28857;
    private Class2427 field28858;
    private boolean field28859;
    
    public Class7470(final float n, final float n2, final Class2427 class2427, final float n3, final float n4, final Class2427 class2428) {
        this(n, n2, class2427, n3, n4, class2428, false);
    }
    
    public Class7470(final float n, final float n2, final Class2427 class2427, final float n3, final float n4, final Class2427 class2428, final boolean b) {
        this(new Class2412(n, n2), class2427, new Class2412(n3, n4), class2428, b);
    }
    
    public Class7470(final Class2412 class2412, final Class2427 class2413, final Class2412 class2414, final Class2427 class2415, final boolean field28859) {
        this.field28854 = new Class2412(0.0f, 0.0f);
        this.field28859 = false;
        this.field28855 = new Class2412(class2412);
        this.field28856 = new Class2412(class2414);
        this.field28857 = new Class2427(class2413);
        this.field28858 = new Class2427(class2415);
        this.field28859 = field28859;
    }
    
    public Class7470 method23059() {
        return new Class7470(this.field28855, this.field28858, this.field28856, this.field28857, this.field28859);
    }
    
    public void method23060(final boolean field28859) {
        this.field28859 = field28859;
    }
    
    public Class2412 method23061() {
        return this.field28855;
    }
    
    public Class2412 method23062() {
        return this.field28856;
    }
    
    public Class2427 method23063() {
        return this.field28857;
    }
    
    public Class2427 method23064() {
        return this.field28858;
    }
    
    public void method23065(final float n, final float n2) {
        this.method23066(new Class2412(n, n2));
    }
    
    public void method23066(final Class2412 class2412) {
        this.field28855 = new Class2412(class2412);
    }
    
    public void method23067(final float n, final float n2) {
        this.method23068(new Class2412(n, n2));
    }
    
    public void method23068(final Class2412 class2412) {
        this.field28856 = new Class2412(class2412);
    }
    
    public void method23069(final Class2427 class2427) {
        this.field28857 = new Class2427(class2427);
    }
    
    public void method23070(final Class2427 class2427) {
        this.field28858 = new Class2427(class2427);
    }
    
    @Override
    public Class2427 method23071(final Class2400 class2400, final float n, final float n2) {
        if (!this.field28859) {
            return this.method23072(n, n2);
        }
        return this.method23072(n - class2400.method9526(), n2 - class2400.method9528());
    }
    
    public Class2427 method23072(final float n, final float n2) {
        final float n3 = this.field28856.method9631() - this.field28855.method9631();
        final float n4 = this.field28856.method9632() - this.field28855.method9632();
        final float n5 = -n4;
        final float n6 = n3;
        final float n7 = n6 * n3 - n5 * n4;
        if (n7 != 0.0f) {
            final float n8 = (n5 * (this.field28855.method9632() - n2) - n6 * (this.field28855.method9631() - n)) / n7;
            final float n9 = (n3 * (this.field28855.method9632() - n2) - n4 * (this.field28855.method9631() - n)) / n7;
            float n10 = n8;
            if (n10 < 0.0f) {
                n10 = 0.0f;
            }
            if (n10 > 1.0f) {
                n10 = 1.0f;
            }
            final float n11 = 1.0f - n10;
            final Class2427 class2427 = new Class2427(1, 1, 1, 1);
            class2427.field14368 = n10 * this.field28858.field14368 + n11 * this.field28857.field14368;
            class2427.field14370 = n10 * this.field28858.field14370 + n11 * this.field28857.field14370;
            class2427.field14369 = n10 * this.field28858.field14369 + n11 * this.field28857.field14369;
            class2427.field14371 = n10 * this.field28858.field14371 + n11 * this.field28857.field14371;
            return class2427;
        }
        return Class2427.field14360;
    }
    
    @Override
    public Class2412 method23073(final Class2400 class2400, final float n, final float n2) {
        return this.field28854;
    }
}
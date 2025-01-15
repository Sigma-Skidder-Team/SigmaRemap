// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2421 implements Serializable
{
    private static String[] field14321;
    public Class2412 field14322;
    public Class2421 field14323;
    public Class2421 field14324;
    public double field14325;
    public double field14326;
    public double field14327;
    public double field14328;
    
    public Class2421(final Class2412 field14322) {
        this.field14322 = field14322;
    }
    
    public void method9724() {
        this.field14323.field14324 = this.field14324;
        this.field14324.field14323 = this.field14323;
        this.field14324 = null;
        this.field14323 = null;
    }
    
    public void method9725(final Class2421 class2421) {
        this.field14323.field14324 = class2421;
        class2421.field14323 = this.field14323;
        class2421.field14324 = this;
        this.field14323 = class2421;
    }
    
    public void method9726(final Class2421 class2421) {
        this.field14324.field14323 = class2421;
        class2421.field14323 = this;
        class2421.field14324 = this.field14324;
        this.field14324 = class2421;
    }
    
    private double method9727(final double n, final double n2) {
        return Math.sqrt(n * n + n2 * n2);
    }
    
    public void method9728() {
        if (this.field14323.field14322.equals(this.field14322)) {
            final Class2412 field14322 = this.field14322;
            field14322.field14278 += 0.01f;
        }
        final double n = this.field14322.field14278 - this.field14323.field14322.field14278;
        final double n2 = this.field14322.field14279 - this.field14323.field14322.field14279;
        final double method9727 = this.method9727(n, n2);
        final double field14323 = n / method9727;
        final double n3 = n2 / method9727;
        if (this.field14324.field14322.equals(this.field14322)) {
            final Class2412 field14324 = this.field14322;
            field14324.field14279 += 0.01f;
        }
        final double n4 = this.field14324.field14322.field14278 - this.field14322.field14278;
        final double n5 = this.field14324.field14322.field14279 - this.field14322.field14279;
        final double method9728 = this.method9727(n4, n5);
        final double n6 = n4 / method9728;
        final double field14325 = n5 / method9728;
        final double n7 = -n3;
        final double n8 = field14323;
        this.field14325 = (n7 - field14325) * 0.5;
        this.field14326 = (n8 + n6) * 0.5;
        if (this.field14325 * this.field14325 + this.field14326 * this.field14326 >= 1.0E-5) {
            this.field14327 = this.field14325 * n6 + this.field14326 * field14325;
        }
        else {
            this.field14325 = field14323;
            this.field14326 = field14325;
            this.field14327 = 1.0;
            if (field14323 * n6 + n3 * field14325 > 0.0) {
                this.field14325 = -field14323;
                this.field14326 = -n3;
            }
        }
    }
    
    public double method9729(final Class2421 class2421) {
        final double n = class2421.field14322.field14278 - this.field14322.field14278;
        final double n2 = class2421.field14322.field14279 - this.field14322.field14279;
        return (this.field14325 * n + this.field14326 * n2) / this.method9727(n, n2);
    }
    
    public boolean method9730() {
        return this.field14327 < 0.0;
    }
    
    public boolean method9731(final double n, final double n2) {
        final boolean b = (this.field14323.field14322.field14279 - this.field14322.field14279) * n + (this.field14322.field14278 - this.field14323.field14322.field14278) * n2 >= 0.0;
        final boolean b2 = (this.field14322.field14279 - this.field14324.field14322.field14279) * n + (this.field14324.field14322.field14278 - this.field14322.field14278) * n2 >= 0.0;
        return (this.field14327 >= 0.0) ? (b & b2) : (b | b2);
    }
    
    public boolean method9732(final Class2421 class2421) {
        return this.method9731(class2421.field14322.field14278 - this.field14322.field14278, class2421.field14322.field14279 - this.field14322.field14279);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2313 implements Serializable
{
    private static String[] field14032;
    public Class2421 field14033;
    public Class2313 field14034;
    public final /* synthetic */ Class2424 field14035;
    
    public Class2313(final Class2424 field14035) {
        this.field14035 = field14035;
    }
    
    public void method9420() {
        if (this.field14033 != null) {
            Class2424.method9746(this.field14035, this.field14033);
            this.field14033 = null;
        }
    }
    
    public void method9421(final Class2421 field14323) {
        if (this.field14033 == null) {
            this.field14033 = field14323;
            field14323.field14324 = field14323;
            field14323.field14323 = field14323;
        }
        else {
            this.field14033.method9725(field14323);
        }
    }
    
    public void method9422() {
        if (this.field14033 != null) {
            Class2421 class2421 = this.field14033;
            do {
                class2421.method9728();
            } while ((class2421 = class2421.field14324) != this.field14033);
        }
    }
    
    public boolean method9423(final Class2412 class2412, final Class2412 class2413) {
        final double n = class2413.field14278 - class2412.field14278;
        final double n2 = class2413.field14279 - class2412.field14279;
        Class2421 field14033 = this.field14033;
        while (true) {
            final Class2421 field14034 = field14033.field14324;
            if (field14033.field14322 != class2412) {
                if (field14034.field14322 != class2412) {
                    if (field14033.field14322 != class2413) {
                        if (field14034.field14322 != class2413) {
                            final double n3 = field14034.field14322.field14278 - field14033.field14322.field14278;
                            final double n4 = field14034.field14322.field14279 - field14033.field14322.field14279;
                            final double a = n * n4 - n2 * n3;
                            if (Math.abs(a) > 1.0E-5) {
                                final double n5 = field14033.field14322.field14278 - class2412.field14278;
                                final double n6 = field14033.field14322.field14279 - class2412.field14279;
                                final double n7 = (n4 * n5 - n3 * n6) / a;
                                final double n8 = (n2 * n5 - n * n6) / a;
                                if (n7 >= 0.0) {
                                    if (n7 <= 1.0) {
                                        if (n8 >= 0.0) {
                                            if (n8 <= 1.0) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (field14034 == this.field14033) {
                return false;
            }
            field14033 = field14034;
        }
    }
    
    public int method9424() {
        if (this.field14033 != null) {
            int n = 0;
            Class2421 class2421 = this.field14033;
            do {
                ++n;
            } while ((class2421 = class2421.field14324) != this.field14033);
            return n;
        }
        return 0;
    }
    
    public boolean method9425(final Class2412 class2412) {
        return this.field14033 != null && (this.field14033.field14323.field14322.equals(class2412) || this.field14033.field14322.equals(class2412));
    }
}

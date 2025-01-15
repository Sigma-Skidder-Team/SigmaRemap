// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;

public class Class6997
{
    public int field27293;
    public int field27294;
    public int field27295;
    public int field27296;
    public int field27297;
    public int field27298;
    
    public Class6997() {
    }
    
    public Class6997(final int[] array) {
        if (array.length == 6) {
            this.field27293 = array[0];
            this.field27294 = array[1];
            this.field27295 = array[2];
            this.field27296 = array[3];
            this.field27297 = array[4];
            this.field27298 = array[5];
        }
    }
    
    public static Class6997 method21407() {
        return new Class6997(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public static Class6997 method21408(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final Class179 class179) {
        switch (Class8926.field37517[class179.ordinal()]) {
            case 1: {
                return new Class6997(n + n4, n2 + n5, n3 - n9 + 1 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n6);
            }
            case 2: {
                return new Class6997(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
            case 3: {
                return new Class6997(n - n9 + 1 + n6, n2 + n5, n3 + n4, n + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            case 4: {
                return new Class6997(n + n6, n2 + n5, n3 + n4, n + n9 - 1 + n6, n2 + n8 - 1 + n5, n3 + n7 - 1 + n4);
            }
            default: {
                return new Class6997(n + n4, n2 + n5, n3 + n6, n + n7 - 1 + n4, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6);
            }
        }
    }
    
    public static Class6997 method21409(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return new Class6997(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6), Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
    }
    
    public Class6997(final Class6997 class6997) {
        this.field27293 = class6997.field27293;
        this.field27294 = class6997.field27294;
        this.field27295 = class6997.field27295;
        this.field27296 = class6997.field27296;
        this.field27297 = class6997.field27297;
        this.field27298 = class6997.field27298;
    }
    
    public Class6997(final int field27293, final int field27294, final int field27295, final int field27296, final int field27297, final int field27298) {
        this.field27293 = field27293;
        this.field27294 = field27294;
        this.field27295 = field27295;
        this.field27296 = field27296;
        this.field27297 = field27297;
        this.field27298 = field27298;
    }
    
    public Class6997(final Class352 class352, final Class352 class353) {
        this.field27293 = Math.min(class352.method1074(), class353.method1074());
        this.field27294 = Math.min(class352.method1075(), class353.method1075());
        this.field27295 = Math.min(class352.method1076(), class353.method1076());
        this.field27296 = Math.max(class352.method1074(), class353.method1074());
        this.field27297 = Math.max(class352.method1075(), class353.method1075());
        this.field27298 = Math.max(class352.method1076(), class353.method1076());
    }
    
    public Class6997(final int field27293, final int field27294, final int field27295, final int field27296) {
        this.field27293 = field27293;
        this.field27295 = field27294;
        this.field27296 = field27295;
        this.field27298 = field27296;
        this.field27294 = 1;
        this.field27297 = 512;
    }
    
    public boolean method21410(final Class6997 class6997) {
        if (this.field27296 >= class6997.field27293) {
            if (this.field27293 <= class6997.field27296) {
                if (this.field27298 >= class6997.field27295) {
                    if (this.field27295 <= class6997.field27298) {
                        if (this.field27297 >= class6997.field27294) {
                            if (this.field27294 <= class6997.field27297) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method21411(final int n, final int n2, final int n3, final int n4) {
        if (this.field27296 >= n) {
            if (this.field27293 <= n3) {
                if (this.field27298 >= n2) {
                    if (this.field27295 <= n4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void method21412(final Class6997 class6997) {
        this.field27293 = Math.min(this.field27293, class6997.field27293);
        this.field27294 = Math.min(this.field27294, class6997.field27294);
        this.field27295 = Math.min(this.field27295, class6997.field27295);
        this.field27296 = Math.max(this.field27296, class6997.field27296);
        this.field27297 = Math.max(this.field27297, class6997.field27297);
        this.field27298 = Math.max(this.field27298, class6997.field27298);
    }
    
    public void method21413(final int n, final int n2, final int n3) {
        this.field27293 += n;
        this.field27294 += n2;
        this.field27295 += n3;
        this.field27296 += n;
        this.field27297 += n2;
        this.field27298 += n3;
    }
    
    public Class6997 method21414(final int n, final int n2, final int n3) {
        return new Class6997(this.field27293 + n, this.field27294 + n2, this.field27295 + n3, this.field27296 + n, this.field27297 + n2, this.field27298 + n3);
    }
    
    public boolean method21415(final Class352 class352) {
        if (class352.method1074() >= this.field27293) {
            if (class352.method1074() <= this.field27296) {
                if (class352.method1076() >= this.field27295) {
                    if (class352.method1076() <= this.field27298) {
                        if (class352.method1075() >= this.field27294) {
                            if (class352.method1075() <= this.field27297) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public Class352 method21416() {
        return new Class352(this.field27296 - this.field27293, this.field27297 - this.field27294, this.field27298 - this.field27295);
    }
    
    public int method21417() {
        return this.field27296 - this.field27293 + 1;
    }
    
    public int method21418() {
        return this.field27297 - this.field27294 + 1;
    }
    
    public int method21419() {
        return this.field27298 - this.field27295 + 1;
    }
    
    public Class352 method21420() {
        return new Class354(this.field27293 + (this.field27296 - this.field27293 + 1) / 2, this.field27294 + (this.field27297 - this.field27294 + 1) / 2, this.field27295 + (this.field27298 - this.field27295 + 1) / 2);
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x0", this.field27293).add("y0", this.field27294).add("z0", this.field27295).add("x1", this.field27296).add("y1", this.field27297).add("z1", this.field27298).toString();
    }
    
    public Class53 method21421() {
        return new Class53(new int[] { this.field27293, this.field27294, this.field27295, this.field27296, this.field27297, this.field27298 });
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class9106
{
    private final Class869 field38573;
    private Class7079 field38574;
    
    public Class9106(final Class869 field38573) {
        this.field38573 = field38573;
    }
    
    public void method32917(final Class6093 class6093) {
        if (this.field38574 != null) {
            this.field38574.method21657(class6093);
        }
    }
    
    public void method32918(final double n, final double n2) {
        if (this.field38574 != null) {
            this.field38574.method21658(n, n2);
        }
    }
    
    public void method32919(final Class1848 class1848, final Class7006 class1849) {
        if (this.field38574 != null) {
            if (class1849 != null) {
                if (class1848 != null) {
                    this.field38574.method21659(class1848, class1849);
                }
            }
        }
    }
    
    public void method32920(final Class1848 class1848, final BlockPos class1849, final Class7096 class1850, final float n) {
        if (this.field38574 != null) {
            this.field38574.method21660(class1848, class1849, class1850, n);
        }
    }
    
    public void method32921() {
        if (this.field38574 != null) {
            this.field38574.method21661();
        }
    }
    
    public void method32922(final ItemStack class8321) {
        if (this.field38574 != null) {
            this.field38574.method21662(class8321);
        }
    }
    
    public void method32923() {
        if (this.field38574 != null) {
            this.field38574.method21656();
            this.field38574 = null;
        }
    }
    
    public void method32924() {
        if (this.field38574 != null) {
            this.method32923();
        }
        this.field38574 = this.field38573.field4648.field23409.method8052(this);
    }
    
    public void method32925() {
        if (this.field38574 == null) {
            if (this.field38573.field4683 != null) {
                this.method32924();
            }
        }
        else if (this.field38573.field4683 == null) {
            this.method32923();
        }
        else {
            this.field38574.method21655();
        }
    }
    
    public void method32926(final Class2012 field23409) {
        this.field38573.field4648.field23409 = field23409;
        this.field38573.field4648.method17121();
        if (this.field38574 != null) {
            this.field38574.method21656();
            this.field38574 = field23409.method8052(this);
        }
    }
    
    public Class869 method32927() {
        return this.field38573;
    }
    
    public Class101 method32928() {
        return (this.field38573.field4682 != null) ? this.field38573.field4682.method27336() : Class101.field297;
    }
    
    public static ITextComponent method32929(final String str) {
        return new Class2261("key." + str).method8469(Class2116.field12326);
    }
}

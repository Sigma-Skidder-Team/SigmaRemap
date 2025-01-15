// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import java.util.Random;
import org.apache.logging.log4j.Logger;

public abstract class Class4515 extends Class4473
{
    private static final Logger field19917;
    public Class6585 field19918;
    public Class9092 field19919;
    public Class354 field19920;
    
    public Class4515(final Class9520 class9520, final int n) {
        super(class9520, n);
    }
    
    public Class4515(final Class9520 class9520, final Class51 class9521) {
        super(class9520, class9521);
        this.field19920 = new Class354(class9521.method319("TPX"), class9521.method319("TPY"), class9521.method319("TPZ"));
    }
    
    public void method13510(final Class6585 field19918, final Class354 field19919, final Class9092 field19920) {
        this.field19918 = field19918;
        this.method13456(Class179.field513);
        this.field19920 = field19919;
        this.field19919 = field19920;
        this.field19849 = field19918.method19966(field19920, field19919);
    }
    
    @Override
    public void method13415(final Class51 class51) {
        class51.method298("TPX", this.field19920.method1074());
        class51.method298("TPY", this.field19920.method1075());
        class51.method298("TPZ", this.field19920.method1076());
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        this.field19919.method32849(class1853);
        this.field19849 = this.field19918.method19966(this.field19919, this.field19920);
        if (this.field19918.method19956(class1851, this.field19920, this.field19919, 2)) {
            for (final Class9038 class1855 : this.field19918.method19950(this.field19920, this.field19919, Class7521.field29820)) {
                if (class1855.field38250 != null && Class102.valueOf(class1855.field38250.method323("mode")) == Class102.field308) {
                    this.method13511(class1855.field38250.method323("metadata"), class1855.field38248, class1851, random, class1853);
                }
            }
            for (final Class9038 class1856 : this.field19918.method19950(this.field19920, this.field19919, Class7521.field29821)) {
                if (class1856.field38250 != null) {
                    final String method323 = class1856.field38250.method323("final_state");
                    final Class7572 class1857 = new Class7572(new StringReader(method323), false);
                    Class7096 method324 = Class7521.field29147.method11878();
                    try {
                        class1857.method23802(true);
                        final Class7096 method325 = class1857.method23799();
                        if (method325 != null) {
                            method324 = method325;
                        }
                        else {
                            Class4515.field19917.error("Error while parsing blockstate {} in jigsaw block @ {}", (Object)method323, (Object)class1856.field38248);
                        }
                    }
                    catch (final CommandSyntaxException ex) {
                        Class4515.field19917.error("Error while parsing blockstate {} in jigsaw block @ {}", (Object)method323, (Object)class1856.field38248);
                    }
                    class1851.method6688(class1856.field38248, method324, 3);
                }
            }
        }
        return true;
    }
    
    public abstract void method13511(final String p0, final Class354 p1, final Class1851 p2, final Random p3, final Class6997 p4);
    
    @Override
    public void method13454(final int n, final int n2, final int n3) {
        super.method13454(n, n2, n3);
        this.field19920 = this.field19920.method1134(n, n2, n3);
    }
    
    @Override
    public Class2052 method13457() {
        return this.field19919.method32856();
    }
    
    static {
        field19917 = LogManager.getLogger();
    }
}

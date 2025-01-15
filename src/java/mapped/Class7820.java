// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;

public class Class7820
{
    private final Class354 field32030;
    private final Class179 field32031;
    private final Class179 field32032;
    private final LoadingCache<Class354, Class7990> field32033;
    private final int field32034;
    private final int field32035;
    private final int field32036;
    
    public Class7820(final Class354 field32030, final Class179 field32031, final Class179 field32032, final LoadingCache<Class354, Class7990> field32033, final int field32034, final int field32035, final int field32036) {
        this.field32030 = field32030;
        this.field32031 = field32031;
        this.field32032 = field32032;
        this.field32033 = field32033;
        this.field32034 = field32034;
        this.field32035 = field32035;
        this.field32036 = field32036;
    }
    
    public Class354 method25265() {
        return this.field32030;
    }
    
    public Class179 method25266() {
        return this.field32031;
    }
    
    public Class179 method25267() {
        return this.field32032;
    }
    
    public int method25268() {
        return this.field32034;
    }
    
    public int method25269() {
        return this.field32035;
    }
    
    public Class7990 method25270(final int n, final int n2, final int n3) {
        return (Class7990)this.field32033.getUnchecked((Object)Class8691.method29798(this.field32030, this.method25266(), this.method25267(), n, n2, n3));
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("up", (Object)this.field32032).add("forwards", (Object)this.field32031).add("frontTopLeft", (Object)this.field32030).toString();
    }
    
    public Class9402 method25271(final Class179 class179, final Class354 class180, final double n, final Class5487 class181, final double n2) {
        final Class179 method25266 = this.method25266();
        final Class179 method25267 = method25266.method783();
        final double n3 = this.method25265().method1075() + 1 - n * this.method25269();
        double n4;
        double n5;
        if (method25267 != Class179.field513) {
            if (method25267 != Class179.field514) {
                if (method25267 != Class179.field515) {
                    n4 = this.method25265().method1074() + (1.0 - n2) * this.method25268();
                    n5 = class180.method1076() + 0.5;
                }
                else {
                    n4 = this.method25265().method1074() + 1 - (1.0 - n2) * this.method25268();
                    n5 = class180.method1076() + 0.5;
                }
            }
            else {
                n4 = class180.method1074() + 0.5;
                n5 = this.method25265().method1076() + (1.0 - n2) * this.method25268();
            }
        }
        else {
            n4 = class180.method1074() + 0.5;
            n5 = this.method25265().method1076() + 1 - (1.0 - n2) * this.method25268();
        }
        double n6;
        double n7;
        if (method25266.method782() != class179) {
            if (method25266.method782() != class179.method782()) {
                if (method25266.method782() != class179.method783()) {
                    n6 = class181.field22772;
                    n7 = -class181.field22770;
                }
                else {
                    n6 = -class181.field22772;
                    n7 = class181.field22770;
                }
            }
            else {
                n6 = -class181.field22770;
                n7 = -class181.field22772;
            }
        }
        else {
            n6 = class181.field22770;
            n7 = class181.field22772;
        }
        return new Class9402(new Class5487(n4, n3, n5), new Class5487(n6, class181.field22771, n7), (method25266.method780() - class179.method782().method780()) * 90);
    }
}

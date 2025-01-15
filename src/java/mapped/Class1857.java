// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class1857 implements Class1856
{
    private static String[] field10110;
    private final Class1858 field10111;
    private final int field10112;
    private final int field10113;
    private final int field10114;
    private final int field10115;
    private final int field10116;
    private final int field10117;
    private final int field10118;
    private int[] field10119;
    private int[] field10120;
    private Class7096[] field10121;
    private final int field10122;
    private Class9145 field10123;
    private static final Class8888 field10124;
    private static final Class8888 field10125;
    private static final Class8888 field10126;
    
    public Class1857(final Class1858 field10111, final Class354 class354, final Class354 class355, final int n) {
        this.field10111 = field10111;
        final int n2 = class354.method1074() - n >> 4;
        final int n3 = class354.method1075() - n >> 4;
        final int n4 = class354.method1076() - n >> 4;
        final int n5 = class355.method1074() + n >> 4;
        final int n6 = class355.method1075() + n >> 4;
        final int n7 = class355.method1076() + n >> 4;
        this.field10115 = n5 - n2 + 1 << 4;
        this.field10116 = n6 - n3 + 1 << 4;
        this.field10117 = n7 - n4 + 1 << 4;
        this.field10118 = this.field10115 * this.field10116;
        this.field10122 = this.field10115 * this.field10116 * this.field10117;
        this.field10112 = n2 << 4;
        this.field10113 = n3 << 4;
        this.field10114 = n4 << 4;
    }
    
    private int method6995(final Class354 class354) {
        final int n = class354.method1074() - this.field10112;
        if (n < 0 || n >= this.field10115) {
            return -1;
        }
        final int n2 = class354.method1075() - this.field10113;
        if (n2 >= 0 && n2 < this.field10116) {
            final int n3 = class354.method1076() - this.field10114;
            return (n3 >= 0 && n3 < this.field10117) ? (n3 * this.field10118 + n2 * this.field10115 + n) : -1;
        }
        return -1;
    }
    
    @Override
    public int method6992(final Class237 class237, final Class354 class238) {
        int[] array;
        if (class237 != Class237.field911) {
            if (class237 != Class237.field912) {
                return this.method6996(class237, class238);
            }
            array = this.field10120;
        }
        else {
            array = this.field10119;
        }
        final int method6995 = this.method6995(class238);
        if (method6995 >= 0) {
            if (method6995 < this.field10122) {
                if (array != null) {
                    int method6996 = array[method6995];
                    if (method6996 == -1) {
                        method6996 = this.method6996(class237, class238);
                        array[method6995] = method6996;
                    }
                    return method6996;
                }
            }
        }
        return this.method6996(class237, class238);
    }
    
    private int method6996(final Class237 class237, final Class354 class238) {
        return this.field10111.method6992(class237, class238);
    }
    
    @Override
    public Class7096 method6701(final Class354 class354) {
        final int method6995 = this.method6995(class354);
        if (method6995 >= 0) {
            if (method6995 < this.field10122) {
                if (this.field10121 != null) {
                    Class7096 method6996 = this.field10121[method6995];
                    if (method6996 == null) {
                        method6996 = this.field10111.method6701(class354);
                        this.field10121[method6995] = method6996;
                    }
                    return method6996;
                }
            }
        }
        return this.field10111.method6701(class354);
    }
    
    public void method6997() {
        if (this.field10119 == null) {
            this.field10119 = (int[])Class1857.field10124.method31284(this.field10122);
        }
        if (this.field10120 == null) {
            this.field10120 = (int[])Class1857.field10125.method31284(this.field10122);
        }
        Arrays.fill(this.field10119, -1);
        Arrays.fill(this.field10120, -1);
        if (this.field10121 == null) {
            this.field10121 = (Class7096[])Class1857.field10126.method31284(this.field10122);
        }
        Arrays.fill(this.field10121, null);
    }
    
    public void method6998() {
        Class1857.field10124.method31285(this.field10119);
        this.field10119 = null;
        Class1857.field10125.method31285(this.field10120);
        this.field10120 = null;
        Class1857.field10126.method31285(this.field10121);
        this.field10121 = null;
    }
    
    public Class3090 method6999(final Class354 class354) {
        return this.field10111.method7007(class354);
    }
    
    @Override
    public Class436 method6727(final Class354 class354) {
        return this.field10111.method7000(class354, Class2079.field12022);
    }
    
    public Class436 method7000(final Class354 class354, final Class2079 class355) {
        return this.field10111.method7000(class354, class355);
    }
    
    @Override
    public boolean method6994(final Class354 class354) {
        return this.field10111.method6994(class354);
    }
    
    @Override
    public Class7099 method6702(final Class354 class354) {
        return this.method6701(class354).method21756();
    }
    
    @Override
    public int method6849(final Class354 class354, final Class8895 class355) {
        return this.field10111.method6849(class354, class355);
    }
    
    @Override
    public Class1886 method6700() {
        return this.field10111.method6700();
    }
    
    public Class9145 method7001() {
        return this.field10123;
    }
    
    public void method7002(final Class9145 field10123) {
        this.field10123 = field10123;
    }
    
    static {
        field10124 = new Class8888(Integer.TYPE, 16);
        field10125 = new Class8888(Integer.TYPE, 16);
        field10126 = new Class8888(Class7096.class, 16);
    }
}

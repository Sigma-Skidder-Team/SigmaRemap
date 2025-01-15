// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5869 extends Class5846<Class796>
{
    private static String[] field24044;
    private final Class6300 field24045;
    private final Class6300 field24046;
    private final Class6300 field24047;
    private final Class6300 field24048;
    private final Class6300 field24049;
    private final Class6300 field24050;
    private final Class6300 field24051;
    private final Class6300 field24052;
    private final Class6300 field24053;
    private final Class6300 field24054;
    private final Class6300 field24055;
    
    public Class5869() {
        this.field24269 = 32;
        this.field24270 = 32;
        (this.field24045 = new Class6300(this, 2, 8)).method18636(-1.5f, 0.0f, -1.5f, 3.0f, 6.0f, 3.0f);
        this.field24045.method18642(0.0f, 16.5f, -3.0f);
        (this.field24046 = new Class6300(this, 22, 1)).method18636(-1.5f, -1.0f, -1.0f, 3.0f, 4.0f, 1.0f);
        this.field24046.method18642(0.0f, 21.07f, 1.16f);
        (this.field24047 = new Class6300(this, 19, 8)).method18636(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f);
        this.field24047.method18642(1.5f, 16.94f, -2.76f);
        (this.field24048 = new Class6300(this, 19, 8)).method18636(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f);
        this.field24048.method18642(-1.5f, 16.94f, -2.76f);
        (this.field24049 = new Class6300(this, 2, 2)).method18636(-1.0f, -1.5f, -1.0f, 2.0f, 3.0f, 2.0f);
        this.field24049.method18642(0.0f, 15.69f, -2.76f);
        (this.field24050 = new Class6300(this, 10, 0)).method18636(-1.0f, -0.5f, -2.0f, 2.0f, 1.0f, 4.0f);
        this.field24050.method18642(0.0f, -2.0f, -1.0f);
        this.field24049.method18633(this.field24050);
        (this.field24051 = new Class6300(this, 11, 7)).method18636(-0.5f, -1.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        this.field24051.method18642(0.0f, -0.5f, -1.5f);
        this.field24049.method18633(this.field24051);
        (this.field24052 = new Class6300(this, 16, 7)).method18636(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        this.field24052.method18642(0.0f, -1.75f, -2.45f);
        this.field24049.method18633(this.field24052);
        (this.field24053 = new Class6300(this, 2, 18)).method18636(0.0f, -4.0f, -2.0f, 0.0f, 5.0f, 4.0f);
        this.field24053.method18642(0.0f, -2.15f, 0.15f);
        this.field24049.method18633(this.field24053);
        (this.field24054 = new Class6300(this, 14, 18)).method18636(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        this.field24054.method18642(1.0f, 22.0f, -1.05f);
        (this.field24055 = new Class6300(this, 14, 18)).method18636(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        this.field24055.method18642(-1.0f, 22.0f, -1.05f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24045, (Object)this.field24047, (Object)this.field24048, (Object)this.field24046, (Object)this.field24049, (Object)this.field24054, (Object)this.field24055);
    }
    
    public void method17604(final Class796 class796, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.method17607(method17609(class796), class796.field2424, n, n2, n3, n4, n5);
    }
    
    public void method17605(final Class796 class796, final float n, final float n2, final float n3) {
        this.method17608(method17609(class796));
    }
    
    public void method17606(final Class7351 class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6, final int n7) {
        this.method17608(Class319.field1892);
        this.method17607(Class319.field1892, n7, n3, n4, 0.0f, n5, n6);
        this.method17570().forEach(class7355 -> class7355.method18643(class7353, class7354, n8, n9));
    }
    
    private void method17607(final Class319 class319, final int n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.field24049.field25183 = n6 * 0.017453292f;
        this.field24049.field25184 = n5 * 0.017453292f;
        this.field24049.field25185 = 0.0f;
        this.field24049.field25180 = 0.0f;
        this.field24045.field25180 = 0.0f;
        this.field24046.field25180 = 0.0f;
        this.field24048.field25180 = -1.5f;
        this.field24047.field25180 = 1.5f;
        switch (Class8351.field34276[class319.ordinal()]) {
            case 1: {
                return;
            }
            case 2: {
                final float method35639 = Class9546.method35639((float)n);
                final float method35640 = Class9546.method35638((float)n);
                this.field24049.field25180 = method35639;
                this.field24049.field25181 = 15.69f + method35640;
                this.field24049.field25183 = 0.0f;
                this.field24049.field25184 = 0.0f;
                this.field24049.field25185 = Class9546.method35638((float)n) * 0.4f;
                this.field24045.field25180 = method35639;
                this.field24045.field25181 = 16.5f + method35640;
                this.field24047.field25185 = -0.0873f - n4;
                this.field24047.field25180 = 1.5f + method35639;
                this.field24047.field25181 = 16.94f + method35640;
                this.field24048.field25185 = 0.0873f + n4;
                this.field24048.field25180 = -1.5f + method35639;
                this.field24048.field25181 = 16.94f + method35640;
                this.field24046.field25180 = method35639;
                this.field24046.field25181 = 21.07f + method35640;
                return;
            }
            case 3: {
                final Class6300 field24054 = this.field24054;
                field24054.field25183 += Class9546.method35639(n2 * 0.6662f) * 1.4f * n3;
                final Class6300 field24055 = this.field24055;
                field24055.field25183 += Class9546.method35639(n2 * 0.6662f + 3.1415927f) * 1.4f * n3;
                break;
            }
        }
        final float n7 = n4 * 0.3f;
        this.field24049.field25181 = 15.69f + n7;
        this.field24046.field25183 = 1.015f + Class9546.method35639(n2 * 0.6662f) * 0.3f * n3;
        this.field24046.field25181 = 21.07f + n7;
        this.field24045.field25181 = 16.5f + n7;
        this.field24047.field25185 = -0.0873f - n4;
        this.field24047.field25181 = 16.94f + n7;
        this.field24048.field25185 = 0.0873f + n4;
        this.field24048.field25181 = 16.94f + n7;
        this.field24054.field25181 = 22.0f + n7;
        this.field24055.field25181 = 22.0f + n7;
    }
    
    private void method17608(final Class319 class319) {
        this.field24053.field25183 = -0.2214f;
        this.field24045.field25183 = 0.4937f;
        this.field24047.field25183 = -0.6981f;
        this.field24047.field25184 = -3.1415927f;
        this.field24048.field25183 = -0.6981f;
        this.field24048.field25184 = -3.1415927f;
        this.field24054.field25183 = -0.0299f;
        this.field24055.field25183 = -0.0299f;
        this.field24054.field25181 = 22.0f;
        this.field24055.field25181 = 22.0f;
        this.field24054.field25185 = 0.0f;
        this.field24055.field25185 = 0.0f;
        switch (Class8351.field34276[class319.ordinal()]) {
            case 1: {
                this.field24049.field25181 = 17.59f;
                this.field24046.field25183 = 1.5388988f;
                this.field24046.field25181 = 22.97f;
                this.field24045.field25181 = 18.4f;
                this.field24047.field25185 = -0.0873f;
                this.field24047.field25181 = 18.84f;
                this.field24048.field25185 = 0.0873f;
                this.field24048.field25181 = 18.84f;
                final Class6300 field24054 = this.field24054;
                ++field24054.field25181;
                final Class6300 field24055 = this.field24055;
                ++field24055.field25181;
                final Class6300 field24056 = this.field24054;
                ++field24056.field25183;
                final Class6300 field24057 = this.field24055;
                ++field24057.field25183;
                break;
            }
            case 2: {
                this.field24054.field25185 = -0.34906584f;
                this.field24055.field25185 = 0.34906584f;
                break;
            }
            case 4: {
                final Class6300 field24058 = this.field24054;
                field24058.field25183 += 0.6981317f;
                final Class6300 field24059 = this.field24055;
                field24059.field25183 += 0.6981317f;
                break;
            }
        }
    }
    
    private static Class319 method17609(final Class796 class796) {
        if (class796.method4494()) {
            return Class319.field1891;
        }
        if (!class796.method4483()) {
            return class796.method4504() ? Class319.field1888 : Class319.field1889;
        }
        return Class319.field1890;
    }
}

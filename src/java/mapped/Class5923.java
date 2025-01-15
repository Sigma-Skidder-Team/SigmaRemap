// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5923<T extends Class511> extends Class5844<T>
{
    private static String[] field24335;
    private final Class6300 field24336;
    private final Class6300 field24337;
    
    public Class5923() {
        (this.field24337 = new Class6300(this, 22, 0)).method18638(-10.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, 1.0f);
        this.field24336 = new Class6300(this, 22, 0);
        this.field24336.field25186 = true;
        this.field24336.method18638(0.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, 1.0f);
    }
    
    @Override
    public Iterable<Class6300> method17559() {
        return (Iterable<Class6300>)ImmutableList.of();
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24337, (Object)this.field24336);
    }
    
    public void method17580(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        float field25183 = 0.2617994f;
        float field25184 = -0.2617994f;
        float field25185 = 0.0f;
        float field25186 = 0.0f;
        if (!t.method2773()) {
            if (t.method1814()) {
                field25183 = 0.6981317f;
                field25184 = -0.7853982f;
                field25185 = 3.0f;
                field25186 = 0.08726646f;
            }
        }
        else {
            float n6 = 1.0f;
            final Class5487 method1935 = t.method1935();
            if (method1935.field22771 < 0.0) {
                n6 = 1.0f - (float)Math.pow(-method1935.method16738().field22771, 1.5);
            }
            field25183 = n6 * 0.34906584f + (1.0f - n6) * field25183;
            field25184 = n6 * -1.5707964f + (1.0f - n6) * field25184;
        }
        this.field24337.field25180 = 5.0f;
        this.field24337.field25181 = field25185;
        if (!(t instanceof Class754)) {
            this.field24337.field25183 = field25183;
            this.field24337.field25185 = field25184;
            this.field24337.field25184 = field25186;
        }
        else {
            final Class754 class754 = (Class754)t;
            class754.field4057 += (float)((field25183 - class754.field4057) * 0.1);
            class754.field4058 += (float)((field25186 - class754.field4058) * 0.1);
            class754.field4059 += (float)((field25184 - class754.field4059) * 0.1);
            this.field24337.field25183 = class754.field4057;
            this.field24337.field25184 = class754.field4058;
            this.field24337.field25185 = class754.field4059;
        }
        this.field24336.field25180 = -this.field24337.field25180;
        this.field24336.field25184 = -this.field24337.field25184;
        this.field24336.field25181 = this.field24337.field25181;
        this.field24336.field25183 = this.field24337.field25183;
        this.field24336.field25185 = -this.field24337.field25185;
    }
}

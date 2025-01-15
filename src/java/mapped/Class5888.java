// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList$Builder;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;

public class Class5888 extends Class5846<Class423>
{
    private static String[] field24164;
    private final Class6300[] field24165;
    private final Class6300 field24166;
    private final ImmutableList<Class6300> field24167;
    
    public Class5888() {
        this.field24165 = new Class6300[2];
        final Class6300[] a = { new Class6300(this, 0, 0).method18647(128, 64), new Class6300(this, 0, 19).method18647(128, 64), new Class6300(this, 0, 27).method18647(128, 64), new Class6300(this, 0, 35).method18647(128, 64), new Class6300(this, 0, 43).method18647(128, 64) };
        a[0].method18638(-14.0f, -9.0f, -3.0f, 28.0f, 16.0f, 3.0f, 0.0f);
        a[0].method18642(0.0f, 3.0f, 1.0f);
        a[1].method18638(-13.0f, -7.0f, -1.0f, 18.0f, 6.0f, 2.0f, 0.0f);
        a[1].method18642(-15.0f, 4.0f, 4.0f);
        a[2].method18638(-8.0f, -7.0f, -1.0f, 16.0f, 6.0f, 2.0f, 0.0f);
        a[2].method18642(15.0f, 4.0f, 0.0f);
        a[3].method18638(-14.0f, -7.0f, -1.0f, 28.0f, 6.0f, 2.0f, 0.0f);
        a[3].method18642(0.0f, 4.0f, -9.0f);
        a[4].method18638(-14.0f, -7.0f, -1.0f, 28.0f, 6.0f, 2.0f, 0.0f);
        a[4].method18642(0.0f, 4.0f, 9.0f);
        a[0].field25183 = 1.5707964f;
        a[1].field25184 = 4.712389f;
        a[2].field25184 = 1.5707964f;
        a[3].field25184 = 3.1415927f;
        (this.field24165[0] = this.method17632(true)).method18642(3.0f, -5.0f, 9.0f);
        (this.field24165[1] = this.method17632(false)).method18642(3.0f, -5.0f, -9.0f);
        this.field24165[1].field25184 = 3.1415927f;
        this.field24165[0].field25185 = 0.19634955f;
        this.field24165[1].field25185 = 0.19634955f;
        (this.field24166 = new Class6300(this, 0, 0).method18647(128, 64)).method18638(-14.0f, -9.0f, -3.0f, 28.0f, 16.0f, 3.0f, 0.0f);
        this.field24166.method18642(0.0f, -3.0f, 1.0f);
        this.field24166.field25183 = 1.5707964f;
        final ImmutableList$Builder builder = ImmutableList.builder();
        builder.addAll((Iterable)Arrays.asList(a));
        builder.addAll((Iterable)Arrays.asList(this.field24165));
        this.field24167 = (ImmutableList<Class6300>)builder.build();
    }
    
    public void method17630(final Class423 class423, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.method17633(class423, 0, n);
        this.method17633(class423, 1, n);
    }
    
    public ImmutableList<Class6300> method17611() {
        return this.field24167;
    }
    
    public Class6300 method17631() {
        return this.field24166;
    }
    
    public Class6300 method17632(final boolean b) {
        final Class6300 method18647 = new Class6300(this, 62, b ? 0 : 20).method18647(128, 64);
        method18647.method18636(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f);
        method18647.method18636(b ? -1.001f : 0.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f);
        return method18647;
    }
    
    public void method17633(final Class423 class423, final int n, final float n2) {
        final float method2045 = class423.method2045(n, n2);
        final Class6300 class424 = this.field24165[n];
        class424.field25183 = (float)Class9546.method35655(-1.0471975803375244, -0.2617993950843811, (Class9546.method35638(-method2045) + 1.0f) / 2.0f);
        class424.field25184 = (float)Class9546.method35655(-0.7853981852531433, 0.7853981852531433, (Class9546.method35638(-method2045 + 1.0f) + 1.0f) / 2.0f);
        if (n == 1) {
            class424.field25184 = 3.1415927f - class424.field25184;
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList$Builder;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;

public class Class5895<T extends Class399> extends Class5846<T>
{
    private static String[] field24208;
    private final Class6300 field24209;
    private final Class6300[] field24210;
    private final ImmutableList<Class6300> field24211;
    
    public Class5895() {
        this.field24210 = new Class6300[8];
        (this.field24209 = new Class6300(this, 0, 0)).method18636(-6.0f, -8.0f, -6.0f, 12.0f, 16.0f, 12.0f);
        final Class6300 field24209 = this.field24209;
        field24209.field25181 += 8.0f;
        for (int i = 0; i < this.field24210.length; ++i) {
            this.field24210[i] = new Class6300(this, 48, 0);
            final double n = i * 3.141592653589793 * 2.0 / this.field24210.length;
            final float field24210 = (float)Math.cos(n) * 5.0f;
            final float field24211 = (float)Math.sin(n) * 5.0f;
            this.field24210[i].method18636(-1.0f, 0.0f, -1.0f, 2.0f, 18.0f, 2.0f);
            this.field24210[i].field25180 = field24210;
            this.field24210[i].field25182 = field24211;
            this.field24210[i].field25181 = 15.0f;
            this.field24210[i].field25184 = (float)(i * 3.141592653589793 * -2.0 / this.field24210.length + 1.5707963267948966);
        }
        final ImmutableList$Builder builder = ImmutableList.builder();
        builder.add((Object)this.field24209);
        builder.addAll((Iterable)Arrays.asList(this.field24210));
        this.field24211 = (ImmutableList<Class6300>)builder.build();
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float field25183, final float n3, final float n4) {
        final Class6300[] field25184 = this.field24210;
        for (int length = field25184.length, i = 0; i < length; ++i) {
            field25184[i].field25183 = field25183;
        }
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)this.field24211;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList$Builder;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;

public class Class5872<T extends Class767> extends Class5846<T>
{
    private static String[] field24063;
    private final Class6300[] field24064;
    private final Class6300[] field24065;
    private final ImmutableList<Class6300> field24066;
    
    public Class5872(final float n) {
        this.field24269 = 64;
        this.field24270 = 64;
        this.field24064 = new Class6300[3];
        (this.field24064[0] = new Class6300(this, 0, 16)).method18638(-10.0f, 3.9f, -0.5f, 20.0f, 3.0f, 3.0f, n);
        (this.field24064[1] = new Class6300(this).method18647(this.field24269, this.field24270)).method18642(-2.0f, 6.9f, -0.5f);
        this.field24064[1].method18634(0, 22).method18638(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f, n);
        this.field24064[1].method18634(24, 22).method18638(-4.0f, 1.5f, 0.5f, 11.0f, 2.0f, 2.0f, n);
        this.field24064[1].method18634(24, 22).method18638(-4.0f, 4.0f, 0.5f, 11.0f, 2.0f, 2.0f, n);
        this.field24064[1].method18634(24, 22).method18638(-4.0f, 6.5f, 0.5f, 11.0f, 2.0f, 2.0f, n);
        (this.field24064[2] = new Class6300(this, 12, 22)).method18638(0.0f, 0.0f, 0.0f, 3.0f, 6.0f, 3.0f, n);
        this.field24065 = new Class6300[3];
        (this.field24065[0] = new Class6300(this, 0, 0)).method18638(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f, n);
        (this.field24065[1] = new Class6300(this, 32, 0)).method18638(-4.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, n);
        this.field24065[1].field25180 = -8.0f;
        this.field24065[1].field25181 = 4.0f;
        (this.field24065[2] = new Class6300(this, 32, 0)).method18638(-4.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, n);
        this.field24065[2].field25180 = 10.0f;
        this.field24065[2].field25181 = 4.0f;
        final ImmutableList$Builder builder = ImmutableList.builder();
        builder.addAll((Iterable)Arrays.asList(this.field24065));
        builder.addAll((Iterable)Arrays.asList(this.field24064));
        this.field24066 = (ImmutableList<Class6300>)builder.build();
    }
    
    public ImmutableList<Class6300> method17611() {
        return this.field24066;
    }
    
    public void method17612(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        final float method35639 = Class9546.method35639(n3 * 0.1f);
        this.field24064[1].field25183 = (0.065f + 0.05f * method35639) * 3.1415927f;
        this.field24064[2].method18642(-2.0f, 6.9f + Class9546.method35639(this.field24064[1].field25183) * 10.0f, -0.5f + Class9546.method35638(this.field24064[1].field25183) * 10.0f);
        this.field24064[2].field25183 = (0.265f + 0.1f * method35639) * 3.1415927f;
        this.field24065[0].field25184 = n4 * 0.017453292f;
        this.field24065[0].field25183 = n5 * 0.017453292f;
    }
    
    public void method17613(final T t, final float n, final float n2, final float n3) {
        for (int i = 1; i < 3; ++i) {
            this.field24065[i].field25184 = (t.method4253(i - 1) - t.field2951) * 0.017453292f;
            this.field24065[i].field25183 = t.method4254(i - 1) * 0.017453292f;
        }
    }
}

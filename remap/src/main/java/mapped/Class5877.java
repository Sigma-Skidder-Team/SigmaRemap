// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5877<T extends Entity> extends Class5846<T>
{
    private static String[] field24089;
    private final Class6300 field24090;
    private final Class6300 field24091;
    private final Class6300 field24092;
    private final Class6300 field24093;
    private final Class6300 field24094;
    
    public Class5877() {
        this.field24269 = 32;
        this.field24270 = 32;
        (this.field24090 = new Class6300(this, 0, 0)).method18636(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f);
        this.field24090.method18642(0.0f, 20.0f, 0.0f);
        (this.field24091 = new Class6300(this, 0, 13)).method18636(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f);
        this.field24091.method18642(0.0f, 20.0f, 8.0f);
        (this.field24092 = new Class6300(this, 22, 0)).method18636(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f);
        this.field24092.method18642(0.0f, 20.0f, 0.0f);
        final Class6300 class6300 = new Class6300(this, 20, 10);
        class6300.method18636(0.0f, -2.5f, 0.0f, 0.0f, 5.0f, 6.0f);
        class6300.method18642(0.0f, 0.0f, 8.0f);
        this.field24091.method18633(class6300);
        final Class6300 class6301 = new Class6300(this, 2, 1);
        class6301.method18636(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 3.0f);
        class6301.method18642(0.0f, -4.5f, 5.0f);
        this.field24090.method18633(class6301);
        final Class6300 class6302 = new Class6300(this, 0, 2);
        class6302.method18636(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 4.0f);
        class6302.method18642(0.0f, -4.5f, -1.0f);
        this.field24091.method18633(class6302);
        (this.field24093 = new Class6300(this, -4, 0)).method18636(-2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f);
        this.field24093.method18642(-1.5f, 21.5f, 0.0f);
        this.field24093.field25185 = -0.7853982f;
        (this.field24094 = new Class6300(this, 0, 0)).method18636(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f);
        this.field24094.method18642(1.5f, 21.5f, 0.0f);
        this.field24094.field25185 = 0.7853982f;
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of(this.field24090, this.field24091, this.field24092, this.field24093, (Object)this.field24094);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        float n6 = 1.0f;
        float n7 = 1.0f;
        if (!t.method1706()) {
            n6 = 1.3f;
            n7 = 1.7f;
        }
        this.field24091.field25184 = -n6 * 0.25f * MathHelper.sin(n7 * 0.6f * n3);
    }
}

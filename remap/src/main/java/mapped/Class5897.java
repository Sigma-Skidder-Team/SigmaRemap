// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5897<T extends Entity> extends Class5846<T>
{
    private static String[] field24219;
    private final Class6300 field24220;
    private final Class6300 field24221;
    private final Class6300 field24222;
    
    public Class5897() {
        (this.field24220 = new Class6300(this, 0, 0)).method18642(-5.0f, 22.0f, -5.0f);
        this.field24220.method18636(0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 10.0f);
        (this.field24221 = new Class6300(this, 40, 0)).method18642(1.5f, 22.0f, -4.0f);
        this.field24221.method18636(0.0f, 0.0f, 0.0f, 4.0f, 14.0f, 8.0f);
        (this.field24222 = new Class6300(this, 40, 0)).method18642(-1.5f, 22.0f, 4.0f);
        this.field24222.method18636(0.0f, 0.0f, 0.0f, 4.0f, 14.0f, 8.0f);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        float n6 = n * 2.0f;
        if (n6 > 1.0f) {
            n6 = 1.0f;
        }
        final float n7 = 1.0f - n6 * n6 * n6;
        this.field24221.field25185 = 3.1415927f - n7 * 0.35f * 3.1415927f;
        this.field24222.field25185 = 3.1415927f + n7 * 0.35f * 3.1415927f;
        this.field24222.field25184 = 3.1415927f;
        this.field24221.field25181 = 24.0f - (n + MathHelper.sin(n * 2.7f)) * 0.6f * 12.0f;
        this.field24222.field25181 = this.field24221.field25181;
        this.field24220.field25181 = this.field24221.field25181;
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24220, (Object)this.field24221, (Object)this.field24222);
    }
}

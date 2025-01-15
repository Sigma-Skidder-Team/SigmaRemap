// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5876<T extends Class841> extends Class5846<T>
{
    private static String[] field24085;
    private final Class6300 field24086;
    private final Class6300 field24087;
    private final Class6300 field24088;
    
    public Class5876() {
        this.field24087 = new Class6300(64, 64, 0, 0);
        this.field24086 = new Class6300(64, 64, 0, 28);
        this.field24088 = new Class6300(64, 64, 0, 52);
        this.field24087.method18636(-8.0f, -16.0f, -8.0f, 16.0f, 12.0f, 16.0f);
        this.field24087.method18642(0.0f, 24.0f, 0.0f);
        this.field24086.method18636(-8.0f, -8.0f, -8.0f, 16.0f, 8.0f, 16.0f);
        this.field24086.method18642(0.0f, 24.0f, 0.0f);
        this.field24088.method18636(-3.0f, 0.0f, -3.0f, 6.0f, 6.0f, 6.0f);
        this.field24088.method18642(0.0f, 12.0f, 0.0f);
    }
    
    public void method17621(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        final float n6 = n3 - t.ticksExisted;
        final float n7 = (0.5f + t.method5023(n6)) * 3.1415927f;
        final float n8 = -1.0f + MathHelper.sin(n7);
        float n9 = 0.0f;
        if (n7 > 3.1415927f) {
            n9 = MathHelper.sin(n3 * 0.1f) * 0.7f;
        }
        this.field24087.method18642(0.0f, 16.0f + MathHelper.sin(n7) * 8.0f + n9, 0.0f);
        if (t.method5023(n6) <= 0.3f) {
            this.field24087.field25184 = 0.0f;
        }
        else {
            this.field24087.field25184 = n8 * n8 * n8 * n8 * 3.1415927f * 0.125f;
        }
        this.field24088.field25183 = n5 * 0.017453292f;
        this.field24088.field25184 = n4 * 0.017453292f;
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24086, (Object)this.field24087);
    }
    
    public Class6300 method17622() {
        return this.field24086;
    }
    
    public Class6300 method17623() {
        return this.field24087;
    }
    
    public Class6300 method17624() {
        return this.field24088;
    }
}

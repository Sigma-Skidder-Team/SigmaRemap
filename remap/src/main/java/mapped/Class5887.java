// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;

public class Class5887<T extends Entity> extends Class5846<T>
{
    private static String[] field24162;
    private final Class6300 field24163;
    
    public Class5887() {
        this.field24269 = 64;
        this.field24270 = 32;
        this.field24163 = new Class6300(this);
        this.field24163.method18634(0, 0).method18638(-4.0f, -4.0f, -1.0f, 8.0f, 8.0f, 2.0f, 0.0f);
        this.field24163.method18634(0, 10).method18638(-1.0f, -4.0f, -4.0f, 2.0f, 8.0f, 8.0f, 0.0f);
        this.field24163.method18634(20, 0).method18638(-4.0f, -1.0f, -4.0f, 8.0f, 2.0f, 8.0f, 0.0f);
        this.field24163.method18642(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24163);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24163.field25184 = n4 * 0.017453292f;
        this.field24163.field25183 = n5 * 0.017453292f;
    }
}

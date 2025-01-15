// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5930<T extends Entity> extends Class5844<T>
{
    private static String[] field24391;
    private final Class6300 field24392;
    private final Class6300 field24393;
    private final Class6300 field24394;
    private final Class6300 field24395;
    private final Class6300 field24396;
    private final Class6300 field24397;
    private final Class6300 field24398;
    private final Class6300 field24399;
    
    public Class5930() {
        (this.field24392 = new Class6300(this, 0, 0)).method18638(-2.0f, -6.0f, -2.0f, 4.0f, 6.0f, 3.0f, 0.0f);
        this.field24392.method18642(0.0f, 15.0f, -4.0f);
        (this.field24398 = new Class6300(this, 14, 0)).method18638(-2.0f, -4.0f, -4.0f, 4.0f, 2.0f, 2.0f, 0.0f);
        this.field24398.method18642(0.0f, 15.0f, -4.0f);
        (this.field24399 = new Class6300(this, 14, 4)).method18638(-1.0f, -2.0f, -3.0f, 2.0f, 2.0f, 2.0f, 0.0f);
        this.field24399.method18642(0.0f, 15.0f, -4.0f);
        (this.field24393 = new Class6300(this, 0, 9)).method18638(-3.0f, -4.0f, -3.0f, 6.0f, 8.0f, 6.0f, 0.0f);
        this.field24393.method18642(0.0f, 16.0f, 0.0f);
        (this.field24394 = new Class6300(this, 26, 0)).method18636(-1.0f, 0.0f, -3.0f, 3.0f, 5.0f, 3.0f);
        this.field24394.method18642(-2.0f, 19.0f, 1.0f);
        (this.field24395 = new Class6300(this, 26, 0)).method18636(-1.0f, 0.0f, -3.0f, 3.0f, 5.0f, 3.0f);
        this.field24395.method18642(1.0f, 19.0f, 1.0f);
        (this.field24396 = new Class6300(this, 24, 13)).method18636(0.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f);
        this.field24396.method18642(-4.0f, 13.0f, 0.0f);
        (this.field24397 = new Class6300(this, 24, 13)).method18636(-1.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f);
        this.field24397.method18642(4.0f, 13.0f, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17559() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24392, (Object)this.field24398, (Object)this.field24399);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24393, (Object)this.field24394, (Object)this.field24395, (Object)this.field24396, (Object)this.field24397);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float field25185, final float n3, final float n4) {
        this.field24392.field25183 = n4 * 0.017453292f;
        this.field24392.field25184 = n3 * 0.017453292f;
        this.field24398.field25183 = this.field24392.field25183;
        this.field24398.field25184 = this.field24392.field25184;
        this.field24399.field25183 = this.field24392.field25183;
        this.field24399.field25184 = this.field24392.field25184;
        this.field24393.field25183 = 1.5707964f;
        this.field24394.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
        this.field24395.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.field24396.field25185 = field25185;
        this.field24397.field25185 = -field25185;
    }
}

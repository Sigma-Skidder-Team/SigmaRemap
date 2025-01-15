// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5867 extends Class5866
{
    private static String[] field24036;
    private final Class6300 field24037;
    private final Class6300 field24038;
    private final Class6300 field24039;
    private final Class6300 field24040;
    
    public Class5867() {
        this(0.0f);
    }
    
    public Class5867(final float n) {
        super(n, 64, 64);
        (this.field23993 = new Class6300(this, 0, 0)).method18638(-1.0f, -7.0f, -1.0f, 2.0f, 7.0f, 2.0f, n);
        this.field23993.method18642(0.0f, 0.0f, 0.0f);
        (this.field23995 = new Class6300(this, 0, 26)).method18638(-6.0f, 0.0f, -1.5f, 12.0f, 3.0f, 3.0f, n);
        this.field23995.method18642(0.0f, 0.0f, 0.0f);
        (this.field23996 = new Class6300(this, 24, 0)).method18638(-2.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f, n);
        this.field23996.method18642(-5.0f, 2.0f, 0.0f);
        this.field23997 = new Class6300(this, 32, 16);
        this.field23997.field25186 = true;
        this.field23997.method18638(0.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f, n);
        this.field23997.method18642(5.0f, 2.0f, 0.0f);
        (this.field23998 = new Class6300(this, 8, 0)).method18638(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f, n);
        this.field23998.method18642(-1.9f, 12.0f, 0.0f);
        this.field23999 = new Class6300(this, 40, 16);
        this.field23999.field25186 = true;
        this.field23999.method18638(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f, n);
        this.field23999.method18642(1.9f, 12.0f, 0.0f);
        (this.field24037 = new Class6300(this, 16, 0)).method18638(-3.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f, n);
        this.field24037.method18642(0.0f, 0.0f, 0.0f);
        this.field24037.field25187 = true;
        (this.field24038 = new Class6300(this, 48, 16)).method18638(1.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f, n);
        this.field24038.method18642(0.0f, 0.0f, 0.0f);
        (this.field24039 = new Class6300(this, 0, 48)).method18638(-4.0f, 10.0f, -1.0f, 8.0f, 2.0f, 2.0f, n);
        this.field24039.method18642(0.0f, 0.0f, 0.0f);
        (this.field24040 = new Class6300(this, 0, 32)).method18638(-6.0f, 11.0f, -6.0f, 12.0f, 1.0f, 12.0f, n);
        this.field24040.method18642(0.0f, 12.0f, 0.0f);
        this.field23994.field25187 = false;
    }
    
    public void method17603(final Class857 class857, final float n, final float n2, final float n3) {
        this.field24040.field25183 = 0.0f;
        this.field24040.field25184 = 0.017453292f * -MathHelper.method35706(n3, class857.field2401, class857.field2399);
        this.field24040.field25185 = 0.0f;
    }
    
    @Override
    public void method17602(final Class857 class857, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17602(class857, n, n2, n3, n4, n5);
        this.field23997.field25187 = class857.method5162();
        this.field23996.field25187 = class857.method5162();
        this.field24040.field25187 = !class857.method5164();
        this.field23999.method18642(1.9f, 12.0f, 0.0f);
        this.field23998.method18642(-1.9f, 12.0f, 0.0f);
        this.field24037.field25183 = 0.017453292f * class857.method5175().method27997();
        this.field24037.field25184 = 0.017453292f * class857.method5175().method27998();
        this.field24037.field25185 = 0.017453292f * class857.method5175().method27999();
        this.field24038.field25183 = 0.017453292f * class857.method5175().method27997();
        this.field24038.field25184 = 0.017453292f * class857.method5175().method27998();
        this.field24038.field25185 = 0.017453292f * class857.method5175().method27999();
        this.field24039.field25183 = 0.017453292f * class857.method5175().method27997();
        this.field24039.field25184 = 0.017453292f * class857.method5175().method27998();
        this.field24039.field25185 = 0.017453292f * class857.method5175().method27999();
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return Iterables.concat((Iterable)super.method17560(), (Iterable)ImmutableList.of((Object)this.field24037, (Object)this.field24038, (Object)this.field24039, (Object)this.field24040));
    }
    
    @Override
    public void method17578(final Class2226 class2226, final Class7351 class2227) {
        final Class6300 method17585 = this.method17585(class2226);
        final boolean field25187 = method17585.field25187;
        method17585.field25187 = true;
        super.method17578(class2226, class2227);
        method17585.field25187 = field25187;
    }
}

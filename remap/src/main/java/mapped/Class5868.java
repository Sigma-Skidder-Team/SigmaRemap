// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class5868<T extends LivingEntity> extends Class5853<T>
{
    private static String[] field24041;
    public boolean field24042;
    public boolean field24043;
    
    public Class5868(final float n) {
        super(0.0f, -14.0f, 64, 32);
        (this.field23994 = new Class6300(this, 0, 16)).method18638(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, n - 0.5f);
        this.field23994.method18642(0.0f, -14.0f, 0.0f);
        (this.field23995 = new Class6300(this, 32, 16)).method18638(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, n);
        this.field23995.method18642(0.0f, -14.0f, 0.0f);
        (this.field23996 = new Class6300(this, 56, 0)).method18638(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f, n);
        this.field23996.method18642(-3.0f, -12.0f, 0.0f);
        this.field23997 = new Class6300(this, 56, 0);
        this.field23997.field25186 = true;
        this.field23997.method18638(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f, n);
        this.field23997.method18642(5.0f, -12.0f, 0.0f);
        (this.field23998 = new Class6300(this, 56, 0)).method18638(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f, n);
        this.field23998.method18642(-2.0f, -2.0f, 0.0f);
        this.field23999 = new Class6300(this, 56, 0);
        this.field23999.field25186 = true;
        this.field23999.method18638(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f, n);
        this.field23999.method18642(2.0f, -2.0f, 0.0f);
    }
    
    @Override
    public void method17580(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17580(t, n, n2, n3, n4, n5);
        this.field23993.field25187 = true;
        this.field23995.field25183 = 0.0f;
        this.field23995.field25181 = -14.0f;
        this.field23995.field25182 = -0.0f;
        final Class6300 field23998 = this.field23998;
        field23998.field25183 -= 0.0f;
        final Class6300 field23999 = this.field23999;
        field23999.field25183 -= 0.0f;
        this.field23996.field25183 *= 0.5;
        this.field23997.field25183 *= 0.5;
        this.field23998.field25183 *= 0.5;
        this.field23999.field25183 *= 0.5;
        if (this.field23996.field25183 > 0.4f) {
            this.field23996.field25183 = 0.4f;
        }
        if (this.field23997.field25183 > 0.4f) {
            this.field23997.field25183 = 0.4f;
        }
        if (this.field23996.field25183 < -0.4f) {
            this.field23996.field25183 = -0.4f;
        }
        if (this.field23997.field25183 < -0.4f) {
            this.field23997.field25183 = -0.4f;
        }
        if (this.field23998.field25183 > 0.4f) {
            this.field23998.field25183 = 0.4f;
        }
        if (this.field23999.field25183 > 0.4f) {
            this.field23999.field25183 = 0.4f;
        }
        if (this.field23998.field25183 < -0.4f) {
            this.field23998.field25183 = -0.4f;
        }
        if (this.field23999.field25183 < -0.4f) {
            this.field23999.field25183 = -0.4f;
        }
        if (this.field24042) {
            this.field23996.field25183 = -0.5f;
            this.field23997.field25183 = -0.5f;
            this.field23996.field25185 = 0.05f;
            this.field23997.field25185 = -0.05f;
        }
        this.field23996.field25182 = 0.0f;
        this.field23997.field25182 = 0.0f;
        this.field23998.field25182 = 0.0f;
        this.field23999.field25182 = 0.0f;
        this.field23998.field25181 = -5.0f;
        this.field23999.field25181 = -5.0f;
        this.field23993.field25182 = -0.0f;
        this.field23993.field25181 = -13.0f;
        this.field23994.field25180 = this.field23993.field25180;
        this.field23994.field25181 = this.field23993.field25181;
        this.field23994.field25182 = this.field23993.field25182;
        this.field23994.field25183 = this.field23993.field25183;
        this.field23994.field25184 = this.field23993.field25184;
        this.field23994.field25185 = this.field23993.field25185;
        if (this.field24043) {
            final Class6300 field24000 = this.field23993;
            field24000.field25181 -= 5.0f;
        }
        this.field23996.method18642(-5.0f, -12.0f, 0.0f);
        this.field23997.method18642(5.0f, -12.0f, 0.0f);
    }
}

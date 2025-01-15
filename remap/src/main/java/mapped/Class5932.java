// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5932<T extends Class793> extends Class5839<T>
{
    private static String[] field24401;
    private final Class6300 field24402;
    
    public Class5932(final float n) {
        super(12, n, true, 120.0f, 0.0f, 9.0f, 6.0f, 120);
        this.field24269 = 128;
        this.field24270 = 64;
        (this.field23936 = new Class6300(this, 3, 0)).method18638(-3.0f, -1.0f, -3.0f, 6.0f, 5.0f, 6.0f, 0.0f);
        this.field23936.method18642(0.0f, 19.0f, -10.0f);
        this.field23937 = new Class6300(this);
        this.field23937.method18634(7, 37).method18638(-9.5f, 3.0f, -10.0f, 19.0f, 20.0f, 6.0f, 0.0f);
        this.field23937.method18634(31, 1).method18638(-5.5f, 3.0f, -13.0f, 11.0f, 18.0f, 3.0f, 0.0f);
        this.field23937.method18642(0.0f, 11.0f, -10.0f);
        this.field24402 = new Class6300(this);
        this.field24402.method18634(70, 33).method18638(-4.5f, 3.0f, -14.0f, 9.0f, 18.0f, 1.0f, 0.0f);
        this.field24402.method18642(0.0f, 11.0f, -10.0f);
        (this.field23938 = new Class6300(this, 1, 23)).method18638(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f, 0.0f);
        this.field23938.method18642(-3.5f, 22.0f, 11.0f);
        (this.field23939 = new Class6300(this, 1, 12)).method18638(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f, 0.0f);
        this.field23939.method18642(3.5f, 22.0f, 11.0f);
        (this.field23940 = new Class6300(this, 27, 30)).method18638(-13.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f, 0.0f);
        this.field23940.method18642(-5.0f, 21.0f, -4.0f);
        (this.field23941 = new Class6300(this, 27, 24)).method18638(0.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f, 0.0f);
        this.field23941.method18642(5.0f, 21.0f, -4.0f);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return Iterables.concat((Iterable)super.method17560(), (Iterable)ImmutableList.of((Object)this.field24402));
    }
    
    public void method17804(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17557(t, n, n2, n3, n4, n5);
        this.field23938.field25183 = MathHelper.cos(n * 0.6662f * 0.6f) * 0.5f * n2;
        this.field23939.field25183 = MathHelper.cos(n * 0.6662f * 0.6f + 3.1415927f) * 0.5f * n2;
        this.field23940.field25185 = MathHelper.cos(n * 0.6662f * 0.6f + 3.1415927f) * 0.5f * n2;
        this.field23941.field25185 = MathHelper.cos(n * 0.6662f * 0.6f) * 0.5f * n2;
        this.field23940.field25183 = 0.0f;
        this.field23941.field25183 = 0.0f;
        this.field23940.field25184 = 0.0f;
        this.field23941.field25184 = 0.0f;
        this.field23938.field25184 = 0.0f;
        this.field23939.field25184 = 0.0f;
        this.field24402.field25183 = 1.5707964f;
        if (!t.method1706()) {
            if (t.onGround) {
                final float n6 = t.method4458() ? 4.0f : 1.0f;
                final float n7 = t.method4458() ? 2.0f : 1.0f;
                this.field23940.field25184 = MathHelper.cos(n6 * n * 5.0f + 3.1415927f) * 8.0f * n2 * n7;
                this.field23940.field25185 = 0.0f;
                this.field23941.field25184 = MathHelper.cos(n6 * n * 5.0f) * 8.0f * n2 * n7;
                this.field23941.field25185 = 0.0f;
                this.field23938.field25184 = MathHelper.cos(n * 5.0f + 3.1415927f) * 3.0f * n2;
                this.field23938.field25183 = 0.0f;
                this.field23939.field25184 = MathHelper.cos(n * 5.0f) * 3.0f * n2;
                this.field23939.field25183 = 0.0f;
            }
        }
        this.field24402.field25187 = (!this.field23957 && t.method4456());
    }
    
    @Override
    public void method17564(final Class7351 class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        final boolean field25187 = this.field24402.field25187;
        if (field25187) {
            class7351.method22567();
            class7351.method22564(0.0, -0.07999999821186066, 0.0);
        }
        super.method17564(class7351, class7352, n, n2, n3, n4, n5, n6);
        if (field25187) {
            class7351.method22568();
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5861 extends Class5853<Class843>
{
    private static String[] field24030;
    private final Class6300 field24031;
    private final Class6300 field24032;
    
    public Class5861() {
        super(0.0f, 0.0f, 64, 64);
        this.field23999.field25187 = false;
        this.field23994.field25187 = false;
        (this.field23998 = new Class6300(this, 32, 0)).method18638(-1.0f, -1.0f, -2.0f, 6.0f, 10.0f, 4.0f, 0.0f);
        this.field23998.method18642(-1.9f, 12.0f, 0.0f);
        (this.field24032 = new Class6300(this, 0, 32)).method18636(-20.0f, 0.0f, 0.0f, 20.0f, 12.0f, 1.0f);
        this.field24031 = new Class6300(this, 0, 32);
        this.field24031.field25186 = true;
        this.field24031.method18636(0.0f, 0.0f, 0.0f, 20.0f, 12.0f, 1.0f);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return Iterables.concat((Iterable)super.method17560(), (Iterable)ImmutableList.of((Object)this.field24032, (Object)this.field24031));
    }
    
    public void method17596(final Class843 class843, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17580(class843, n, n2, n3, n4, n5);
        if (class843.method5041()) {
            if (class843.method2755() != Class2226.field13698) {
                this.field23997.field25183 = 3.7699115f;
            }
            else {
                this.field23996.field25183 = 3.7699115f;
            }
        }
        final Class6300 field23998 = this.field23998;
        field23998.field25183 += 0.62831855f;
        this.field24032.field25182 = 2.0f;
        this.field24031.field25182 = 2.0f;
        this.field24032.field25181 = 1.0f;
        this.field24031.field25181 = 1.0f;
        this.field24032.field25184 = 0.47123894f + MathHelper.cos(n3 * 0.8f) * 3.1415927f * 0.05f;
        this.field24031.field25184 = -this.field24032.field25184;
        this.field24031.field25185 = -0.47123894f;
        this.field24031.field25183 = 0.47123894f;
        this.field24032.field25183 = 0.47123894f;
        this.field24032.field25185 = 0.47123894f;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class5840<T extends Class791> extends Class5839<T>
{
    private static String[] field23942;
    private float field23943;
    private float field23944;
    private float field23945;
    
    public Class5840(final int n, final float n2) {
        super(n, n2, true, 23.0f, 4.8f, 2.7f, 3.0f, 49);
        this.field24269 = 64;
        this.field24270 = 64;
        (this.field23936 = new Class6300(this, 0, 6)).method18636(-6.5f, -5.0f, -4.0f, 13.0f, 10.0f, 9.0f);
        this.field23936.method18642(0.0f, 11.5f, -17.0f);
        this.field23936.method18634(45, 16).method18636(-3.5f, 0.0f, -6.0f, 7.0f, 5.0f, 2.0f);
        this.field23936.method18634(52, 25).method18636(-8.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f);
        this.field23936.method18634(52, 25).method18636(3.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f);
        (this.field23937 = new Class6300(this, 0, 25)).method18636(-9.5f, -13.0f, -6.5f, 19.0f, 26.0f, 13.0f);
        this.field23937.method18642(0.0f, 10.0f, 0.0f);
        (this.field23938 = new Class6300(this, 40, 0)).method18636(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        this.field23938.method18642(-5.5f, 15.0f, 9.0f);
        (this.field23939 = new Class6300(this, 40, 0)).method18636(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        this.field23939.method18642(5.5f, 15.0f, 9.0f);
        (this.field23940 = new Class6300(this, 40, 0)).method18636(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        this.field23940.method18642(-5.5f, 15.0f, -9.0f);
        (this.field23941 = new Class6300(this, 40, 0)).method18636(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        this.field23941.method18642(5.5f, 15.0f, -9.0f);
    }
    
    public void method17561(final T t, final float n, final float n2, final float n3) {
        super.method17558(t, n, n2, n3);
        this.field23943 = t.method4404(n3);
        this.field23944 = t.method4405(n3);
        this.field23945 = (t.method2625() ? 0.0f : t.method4406(n3));
    }
    
    public void method17562(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17557(t, n, n2, n3, n4, n5);
        final boolean b = t.method4371() > 0;
        final boolean method4373 = t.method4373();
        final int method4374 = t.method4383();
        final boolean method4375 = t.method4378();
        final boolean method4376 = t.method4398();
        if (!b) {
            this.field23936.field25185 = 0.0f;
        }
        else {
            this.field23936.field25184 = 0.35f * MathHelper.sin(0.6f * n3);
            this.field23936.field25185 = 0.35f * MathHelper.sin(0.6f * n3);
            this.field23940.field25183 = -0.75f * MathHelper.sin(0.3f * n3);
            this.field23941.field25183 = 0.75f * MathHelper.sin(0.3f * n3);
        }
        if (method4373) {
            if (method4374 >= 15) {
                if (method4374 < 20) {
                    this.field23936.field25183 = -0.7853982f + 0.7853982f * ((method4374 - 15) / 5);
                }
            }
            else {
                this.field23936.field25183 = -0.7853982f * method4374 / 14.0f;
            }
        }
        if (this.field23943 <= 0.0f) {
            this.field23938.field25185 = 0.0f;
            this.field23939.field25185 = 0.0f;
            this.field23940.field25185 = 0.0f;
            this.field23941.field25185 = 0.0f;
        }
        else {
            this.field23937.field25183 = Class9102.method32896(this.field23937.field25183, 1.7407963f, this.field23943);
            this.field23936.field25183 = Class9102.method32896(this.field23936.field25183, 1.5707964f, this.field23943);
            this.field23940.field25185 = -0.27079642f;
            this.field23941.field25185 = 0.27079642f;
            this.field23938.field25185 = 0.5707964f;
            this.field23939.field25185 = -0.5707964f;
            if (method4375) {
                this.field23936.field25183 = 1.5707964f + 0.2f * MathHelper.sin(n3 * 0.6f);
                this.field23940.field25183 = -0.4f - 0.2f * MathHelper.sin(n3 * 0.6f);
                this.field23941.field25183 = -0.4f - 0.2f * MathHelper.sin(n3 * 0.6f);
            }
            if (method4376) {
                this.field23936.field25183 = 2.1707964f;
                this.field23940.field25183 = -0.9f;
                this.field23941.field25183 = -0.9f;
            }
        }
        if (this.field23944 > 0.0f) {
            this.field23938.field25183 = -0.6f * MathHelper.sin(n3 * 0.15f);
            this.field23939.field25183 = 0.6f * MathHelper.sin(n3 * 0.15f);
            this.field23940.field25183 = 0.3f * MathHelper.sin(n3 * 0.25f);
            this.field23941.field25183 = -0.3f * MathHelper.sin(n3 * 0.25f);
            this.field23936.field25183 = Class9102.method32896(this.field23936.field25183, 1.5707964f, this.field23944);
        }
        if (this.field23945 > 0.0f) {
            this.field23936.field25183 = Class9102.method32896(this.field23936.field25183, 2.0561945f, this.field23945);
            this.field23938.field25183 = -0.5f * MathHelper.sin(n3 * 0.5f);
            this.field23939.field25183 = 0.5f * MathHelper.sin(n3 * 0.5f);
            this.field23940.field25183 = 0.5f * MathHelper.sin(n3 * 0.5f);
            this.field23941.field25183 = -0.5f * MathHelper.sin(n3 * 0.5f);
        }
    }
}

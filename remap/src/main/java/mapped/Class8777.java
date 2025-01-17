// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Color;
import slick2d.Renderer;

public class Class8777
{
    public static SGL field36893;
    public static final int field36894 = 1;
    public static final int field36895 = 2;
    public static final int field36896 = 3;
    public float field36897;
    public float field36898;
    public float field36899;
    public float field36900;
    public float field36901;
    public Color field36902;
    public float field36903;
    public float field36904;
    private Class8014 field36905;
    private Class7394 field36906;
    public Class7764 field36907;
    public int field36908;
    public int field36909;
    public boolean field36910;
    public float field36911;
    
    public Class8777(final Class8014 field36905) {
        this.field36901 = 10.0f;
        this.field36902 = Color.field14355;
        this.field36909 = 1;
        this.field36910 = false;
        this.field36911 = 1.0f;
        this.field36905 = field36905;
    }
    
    public float method30482() {
        return this.field36897;
    }
    
    public float method30483() {
        return this.field36898;
    }
    
    public void method30484(final float n, final float n2) {
        this.field36897 += n;
        this.field36898 += n2;
    }
    
    public float method30485() {
        return this.field36901;
    }
    
    public Color method30486() {
        return this.field36902;
    }
    
    public void method30487(final Class7764 field36907) {
        this.field36907 = field36907;
    }
    
    public float method30488() {
        return this.field36904;
    }
    
    public float method30489() {
        return this.field36903;
    }
    
    public boolean method30490() {
        return this.field36903 > 0.0f;
    }
    
    public void method30491() {
        if ((!this.field36905.method26235() || this.field36909 != 1) && this.field36909 != 2) {
            if (!this.field36910 && this.field36911 == 1.0f) {
                this.field36902.bind();
                this.field36907.method24816((float)(int)(this.field36897 - this.field36901 / 2.0f), (float)(int)(this.field36898 - this.field36901 / 2.0f), (float)(int)this.field36901, (float)(int)this.field36901);
            }
            else {
                Class8777.field36893.method19269();
                Class8777.field36893.method19274(this.field36897, this.field36898, 0.0f);
                if (this.field36910) {
                    Class8777.field36893.method19270((float)(Math.atan2(this.field36898, this.field36897) * 180.0 / 3.141592653589793), 0.0f, 0.0f, 1.0f);
                }
                Class8777.field36893.method19271(1.0f, this.field36911, 1.0f);
                this.field36907.method24778((float)(int)(-(this.field36901 / 2.0f)), (float)(int)(-(this.field36901 / 2.0f)), (float)(int)this.field36901, (float)(int)this.field36901, this.field36902);
                Class8777.field36893.method19268();
            }
        }
        else {
            Class7777.method24930();
            Class8777.field36893.method19265(2832);
            Class8777.field36893.method19267(this.field36901 / 2.0f);
            this.field36902.bind();
            Class8777.field36893.glBegin(0);
            Class8777.field36893.glVertex2f(this.field36897, this.field36898);
            Class8777.field36893.method19253();
        }
    }
    
    public void method30492(final int n) {
        this.field36906.method22698(this, n);
        this.field36903 -= n;
        if (this.field36903 <= 0.0f) {
            this.field36905.method26254(this);
        }
        else {
            this.field36897 += n * this.field36899;
            this.field36898 += n * this.field36900;
        }
    }
    
    public void method30493(final Class7394 field36906, final float n) {
        this.field36897 = 0.0f;
        this.field36906 = field36906;
        this.field36898 = 0.0f;
        this.field36899 = 0.0f;
        this.field36900 = 0.0f;
        this.field36901 = 10.0f;
        this.field36908 = 0;
        this.field36903 = n;
        this.field36904 = n;
        this.field36910 = false;
        this.field36911 = 1.0f;
    }
    
    public void method30494(final int field36908) {
        this.field36908 = field36908;
    }
    
    public void method30495(final int field36909) {
        this.field36909 = field36909;
    }
    
    public int method30496() {
        return this.field36908;
    }
    
    public void method30497(final float field36901) {
        this.field36901 = field36901;
    }
    
    public void method30498(final float n) {
        this.field36901 += n;
        this.field36901 = Math.max(0.0f, this.field36901);
    }
    
    public void method30499(final float field36903) {
        this.field36903 = field36903;
    }
    
    public void method30500(final float n) {
        this.field36903 += n;
    }
    
    public void method30501() {
        this.field36903 = 1.0f;
    }
    
    public void method30502(final float field14368, final float field14369, final float field14370, final float field14371) {
        if (this.field36902 != Color.field14355) {
            this.field36902.field14368 = field14368;
            this.field36902.field14369 = field14369;
            this.field36902.field14370 = field14370;
            this.field36902.field14371 = field14371;
        }
        else {
            this.field36902 = new Color(field14368, field14369, field14370, field14371);
        }
    }
    
    public void method30503(final float field36897, final float field36898) {
        this.field36897 = field36897;
        this.field36898 = field36898;
    }
    
    public void method30504(final float n, final float n2, final float n3) {
        this.field36899 = n * n3;
        this.field36900 = n2 * n3;
    }
    
    public void method30505(final float n) {
        final float n2 = (float)Math.sqrt(this.field36899 * this.field36899 + this.field36900 * this.field36900);
        this.field36899 *= n;
        this.field36900 *= n;
        this.field36899 /= n2;
        this.field36900 /= n2;
    }
    
    public void method30506(final float n, final float n2) {
        this.method30504(n, n2, 1.0f);
    }
    
    public void method30507(final float n, final float n2) {
        this.field36897 += n;
        this.field36898 += n2;
    }
    
    public void method30508(final float n, final float n2, final float n3, final float n4) {
        if (this.field36902 == Color.field14355) {
            this.field36902 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        }
        final Color field36902 = this.field36902;
        field36902.field14368 += n;
        final Color field36903 = this.field36902;
        field36903.field14369 += n2;
        final Color field36904 = this.field36902;
        field36904.field14370 += n3;
        final Color field36905 = this.field36902;
        field36905.field14371 += n4;
    }
    
    public void method30509(final int n, final int n2, final int n3, final int n4) {
        if (this.field36902 == Color.field14355) {
            this.field36902 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        }
        final Color field36902 = this.field36902;
        field36902.field14368 += n / 255.0f;
        final Color field36903 = this.field36902;
        field36903.field14369 += n2 / 255.0f;
        final Color field36904 = this.field36902;
        field36904.field14370 += n3 / 255.0f;
        final Color field36905 = this.field36902;
        field36905.field14371 += n4 / 255.0f;
    }
    
    public void method30510(final float n, final float n2) {
        this.field36899 += n;
        this.field36900 += n2;
    }
    
    public Class7394 method30511() {
        return this.field36906;
    }
    
    @Override
    public String toString() {
        return super.toString() + " : " + this.field36903;
    }
    
    public boolean method30512() {
        return this.field36910;
    }
    
    public void method30513(final boolean field36910) {
        this.field36910 = field36910;
    }
    
    public float method30514() {
        return this.field36911;
    }
    
    public void method30515(final float field36911) {
        this.field36911 = field36911;
    }
    
    static {
        Class8777.field36893 = Renderer.get();
    }
}

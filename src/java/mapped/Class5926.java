// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5926<T extends Class800> extends Class5925<T>
{
    private static String[] field24358;
    private float field24359;
    private float field24360;
    private float field24361;
    
    public Class5926(final float n) {
        super(n);
    }
    
    public void method17796(final T t, final float n, final float n2, final float n3) {
        this.field24359 = t.method4620(n3);
        this.field24360 = t.method4621(n3);
        this.field24361 = t.method4622(n3);
        if (this.field24359 <= 0.0f) {
            this.field24355.field25183 = 0.0f;
            this.field24355.field25185 = 0.0f;
            this.field24351.field25183 = 0.0f;
            this.field24351.field25185 = 0.0f;
            this.field24352.field25183 = 0.0f;
            this.field24352.field25185 = 0.0f;
            this.field24352.field25180 = -1.2f;
            this.field24349.field25183 = 0.0f;
            this.field24350.field25183 = 0.0f;
            this.field24350.field25185 = 0.0f;
            this.field24350.field25180 = -1.1f;
            this.field24350.field25181 = 18.0f;
        }
        super.method17558(t, n, n2, n3);
        if (t.method4483()) {
            this.field24356.field25183 = 0.7853982f;
            final Class6300 field24356 = this.field24356;
            field24356.field25181 -= 4.0f;
            final Class6300 field24357 = this.field24356;
            field24357.field25182 += 5.0f;
            final Class6300 field24358 = this.field24355;
            field24358.field25181 -= 3.3f;
            final Class6300 field24359 = this.field24355;
            ++field24359.field25182;
            final Class6300 field24360 = this.field24353;
            field24360.field25181 += 8.0f;
            final Class6300 field24361 = this.field24353;
            field24361.field25182 -= 2.0f;
            final Class6300 field24362 = this.field24354;
            field24362.field25181 += 2.0f;
            final Class6300 field24363 = this.field24354;
            field24363.field25182 -= 0.8f;
            this.field24353.field25183 = 1.7278761f;
            this.field24354.field25183 = 2.670354f;
            this.field24351.field25183 = -0.15707964f;
            this.field24351.field25181 = 16.1f;
            this.field24351.field25182 = -7.0f;
            this.field24352.field25183 = -0.15707964f;
            this.field24352.field25181 = 16.1f;
            this.field24352.field25182 = -7.0f;
            this.field24349.field25183 = -1.5707964f;
            this.field24349.field25181 = 21.0f;
            this.field24349.field25182 = 1.0f;
            this.field24350.field25183 = -1.5707964f;
            this.field24350.field25181 = 21.0f;
            this.field24350.field25182 = 1.0f;
            this.field24357 = 3;
        }
    }
    
    public void method17797(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17557(t, n, n2, n3, n4, n5);
        if (this.field24359 > 0.0f) {
            this.field24355.field25185 = Class9102.method32896(this.field24355.field25185, -1.2707963f, this.field24359);
            this.field24355.field25184 = Class9102.method32896(this.field24355.field25184, 1.2707963f, this.field24359);
            this.field24351.field25183 = -1.2707963f;
            this.field24352.field25183 = -0.47079635f;
            this.field24352.field25185 = -0.2f;
            this.field24352.field25180 = -0.2f;
            this.field24349.field25183 = -0.4f;
            this.field24350.field25183 = 0.5f;
            this.field24350.field25185 = -0.5f;
            this.field24350.field25180 = -0.3f;
            this.field24350.field25181 = 20.0f;
            this.field24353.field25183 = Class9102.method32896(this.field24353.field25183, 0.8f, this.field24360);
            this.field24354.field25183 = Class9102.method32896(this.field24354.field25183, -0.4f, this.field24360);
        }
        if (this.field24361 > 0.0f) {
            this.field24355.field25183 = Class9102.method32896(this.field24355.field25183, -0.58177644f, this.field24361);
        }
    }
}

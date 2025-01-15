// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5843<T extends Class790> extends Class5839<T>
{
    private static String[] field23935;
    
    public Class5843() {
        super(12, 0.0f, true, 16.0f, 4.0f, 2.25f, 2.0f, 24);
        this.field24269 = 128;
        this.field24270 = 64;
        (this.field23936 = new Class6300(this, 0, 0)).method18638(-3.5f, -3.0f, -3.0f, 7.0f, 7.0f, 7.0f, 0.0f);
        this.field23936.method18642(0.0f, 10.0f, -16.0f);
        this.field23936.method18634(0, 44).method18638(-2.5f, 1.0f, -6.0f, 5.0f, 3.0f, 3.0f, 0.0f);
        this.field23936.method18634(26, 0).method18638(-4.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f, 0.0f);
        final Class6300 method18634 = this.field23936.method18634(26, 0);
        method18634.field25186 = true;
        method18634.method18638(2.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f, 0.0f);
        this.field23937 = new Class6300(this);
        this.field23937.method18634(0, 19).method18638(-5.0f, -13.0f, -7.0f, 14.0f, 14.0f, 11.0f, 0.0f);
        this.field23937.method18634(39, 0).method18638(-4.0f, -25.0f, -7.0f, 12.0f, 12.0f, 10.0f, 0.0f);
        this.field23937.method18642(-2.0f, 9.0f, 12.0f);
        (this.field23938 = new Class6300(this, 50, 22)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 8.0f, 0.0f);
        this.field23938.method18642(-3.5f, 14.0f, 6.0f);
        (this.field23939 = new Class6300(this, 50, 22)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 8.0f, 0.0f);
        this.field23939.method18642(3.5f, 14.0f, 6.0f);
        (this.field23940 = new Class6300(this, 50, 40)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 6.0f, 0.0f);
        this.field23940.method18642(-2.5f, 14.0f, -7.0f);
        (this.field23941 = new Class6300(this, 50, 40)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 6.0f, 0.0f);
        this.field23941.method18642(2.5f, 14.0f, -7.0f);
        final Class6300 field23938 = this.field23938;
        --field23938.field25180;
        final Class6300 field23939 = this.field23939;
        ++field23939.field25180;
        final Class6300 field23940 = this.field23938;
        field23940.field25182 += 0.0f;
        final Class6300 field23941 = this.field23939;
        field23941.field25182 += 0.0f;
        final Class6300 field23942 = this.field23940;
        --field23942.field25180;
        final Class6300 field23943 = this.field23941;
        ++field23943.field25180;
        final Class6300 field23944 = this.field23940;
        --field23944.field25182;
        final Class6300 field23945 = this.field23941;
        --field23945.field25182;
    }
    
    public void method17563(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17557(t, n, n2, n3, n4, n5);
        final float method4370 = t.method4370(n3 - t.field2424);
        final float n6 = method4370 * method4370;
        final float n7 = 1.0f - n6;
        this.field23937.field25183 = 1.5707964f - n6 * 3.1415927f * 0.35f;
        this.field23937.field25181 = 9.0f * n7 + 11.0f * n6;
        this.field23940.field25181 = 14.0f * n7 - 6.0f * n6;
        this.field23940.field25182 = -8.0f * n7 - 4.0f * n6;
        final Class6300 field23940 = this.field23940;
        field23940.field25183 -= n6 * 3.1415927f * 0.45f;
        this.field23941.field25181 = this.field23940.field25181;
        this.field23941.field25182 = this.field23940.field25182;
        final Class6300 field23941 = this.field23941;
        field23941.field25183 -= n6 * 3.1415927f * 0.45f;
        if (!this.field23957) {
            this.field23936.field25181 = 10.0f * n7 - 14.0f * n6;
            this.field23936.field25182 = -16.0f * n7 - 3.0f * n6;
        }
        else {
            this.field23936.field25181 = 10.0f * n7 - 9.0f * n6;
            this.field23936.field25182 = -16.0f * n7 - 7.0f * n6;
        }
        final Class6300 field23942 = this.field23936;
        field23942.field25183 += n6 * 3.1415927f * 0.15f;
    }
}

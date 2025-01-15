// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5857<T extends Class399> extends Class5856<T>
{
    private static String[] field24006;
    private boolean field24016;
    private final Class6300 field24017;
    
    public Class5857(final float n) {
        super(n, 64, 128);
        (this.field24017 = new Class6300(this).method18647(64, 128)).method18642(0.0f, -2.0f, 0.0f);
        this.field24017.method18634(0, 0).method18638(0.0f, 3.0f, -6.75f, 1.0f, 1.0f, 1.0f, -0.25f);
        this.field24015.method18633(this.field24017);
        (this.field24007 = new Class6300(this).method18647(64, 128)).method18642(0.0f, 0.0f, 0.0f);
        this.field24007.method18634(0, 0).method18638(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, n);
        (this.field24008 = new Class6300(this).method18647(64, 128)).method18642(-5.0f, -10.03125f, -5.0f);
        this.field24008.method18634(0, 64).method18636(0.0f, 0.0f, 0.0f, 10.0f, 2.0f, 10.0f);
        this.field24007.method18633(this.field24008);
        this.field24007.method18633(this.field24015);
        final Class6300 method18647 = new Class6300(this).method18647(64, 128);
        method18647.method18642(1.75f, -4.0f, 2.0f);
        method18647.method18634(0, 76).method18636(0.0f, 0.0f, 0.0f, 7.0f, 4.0f, 7.0f);
        method18647.field25183 = -0.05235988f;
        method18647.field25185 = 0.02617994f;
        this.field24008.method18633(method18647);
        final Class6300 method18648 = new Class6300(this).method18647(64, 128);
        method18648.method18642(1.75f, -4.0f, 2.0f);
        method18648.method18634(0, 87).method18636(0.0f, 0.0f, 0.0f, 4.0f, 4.0f, 4.0f);
        method18648.field25183 = -0.10471976f;
        method18648.field25185 = 0.05235988f;
        method18647.method18633(method18648);
        final Class6300 method18649 = new Class6300(this).method18647(64, 128);
        method18649.method18642(1.75f, -2.0f, 2.0f);
        method18649.method18634(0, 95).method18638(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f, 0.25f);
        method18649.field25183 = -0.20943952f;
        method18649.field25185 = 0.10471976f;
        method18648.method18633(method18649);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17557(t, n, n2, n3, n4, n5);
        this.field24015.method18642(0.0f, -2.0f, 0.0f);
        final float n6 = 0.01f * (t.method1643() % 10);
        this.field24015.field25183 = Class9546.method35638(t.field2424 * n6) * 4.5f * 0.017453292f;
        this.field24015.field25184 = 0.0f;
        this.field24015.field25185 = Class9546.method35639(t.field2424 * n6) * 2.5f * 0.017453292f;
        if (this.field24016) {
            this.field24015.method18642(0.0f, 1.0f, -1.5f);
            this.field24015.field25183 = -0.9f;
        }
    }
    
    public Class6300 method17590() {
        return this.field24015;
    }
    
    public void method17591(final boolean field24016) {
        this.field24016 = field24016;
    }
}

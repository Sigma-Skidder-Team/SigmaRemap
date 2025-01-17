// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4923 extends Class4825
{
    private static String[] field20591;
    public Class8592 field21058;
    private int field21059;
    private int field21060;
    
    public Class4923(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class8592 field21058) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field21059 = -2434342;
        this.field21060 = -6505234;
        this.field21058 = field21058;
    }
    
    @Override
    public void method14205(final float n) {
        int n2 = this.field20478 + 20;
        final int n3 = this.field20479 + 5;
        final int method29097 = this.field21058.method29097();
        final int n4 = this.field20481 - 10 - Class4824.method14454();
        int n5 = Class6430.method19118(this.field21059, n);
        int n6 = Class6430.method19118(Class265.field1273.field1292, n);
        if (this.field21058.field36094) {
            n5 = Class6430.method19118(-15038729, n);
            n2 += 402 - method29097;
            n6 = Class6430.method19118(Class265.field1278.field1292, n);
        }
        Class8154.method26924((float)n2, (float)n3, (float)method29097, (float)n4, 9.0f, n5);
        int n7 = 0;
        final String[] field36095 = this.field21058.field36095;
        for (int length = field36095.length, i = 0; i < length; ++i) {
            Class8154.method26889(ClientFonts.JelloLight18, (float)(n2 + 10), (float)(n3 + 5 + n7 * ClientFonts.JelloLight18.getHeight()), field36095[i], n6);
            ++n7;
        }
        super.method14205(n);
    }
}

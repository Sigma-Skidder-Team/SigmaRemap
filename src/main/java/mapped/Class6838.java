// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6838 extends Class6831
{
    private static String[] field26849;
    private final Class399 field26850;
    
    public Class6838(final Class7795 class7795, final Class286 class7796, final Class399 class7797) {
        this(class7795, class7796, 1.0f, 1.0f, class7797);
    }
    
    public Class6838(final Class7795 class7795, final Class286 class7796, final float field26835, final float field26836, final Class399 field26837) {
        super(class7795, class7796);
        this.field26835 = field26835;
        this.field26836 = field26836;
        this.field26850 = field26837;
        this.field26837 = (float)this.field26850.method1938();
        this.field26838 = (float)this.field26850.method1941();
        this.field26839 = (float)this.field26850.method1945();
    }
    
    @Override
    public void method20918() {
        if (!this.field26850.field2410) {
            this.field26837 = (float)this.field26850.method1938();
            this.field26838 = (float)this.field26850.method1941();
            this.field26839 = (float)this.field26850.method1945();
        }
        else {
            this.field26827 = true;
        }
    }
}

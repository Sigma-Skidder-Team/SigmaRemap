// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6841 extends Class6831
{
    private static String[] field26856;
    private final Class844 field26857;
    
    public Class6841(final Class844 field26857) {
        super(Class8520.field35258, Class286.field1583);
        this.field26857 = field26857;
        this.field26842 = Class229.field809;
        this.field26840 = true;
        this.field26841 = 0;
    }
    
    @Override
    public void method20918() {
        if (!this.field26857.field2410 && this.field26857.method4152() == null) {
            this.field26837 = (float)this.field26857.getPosX();
            this.field26838 = (float)this.field26857.getPosY();
            this.field26839 = (float)this.field26857.getPosZ();
            final float method5063 = this.field26857.method5063(0.0f);
            this.field26835 = 0.0f + 1.0f * method5063 * method5063;
            this.field26836 = 0.7f + 0.5f * method5063;
        }
        else {
            this.field26827 = true;
        }
    }
}

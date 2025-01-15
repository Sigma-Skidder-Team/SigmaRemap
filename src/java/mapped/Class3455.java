// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3455 extends Class3446
{
    private static String[] field16295;
    private int field16296;
    public final /* synthetic */ Class841 field16297;
    
    private Class3455(final Class841 field16297) {
        this.field16297 = field16297;
    }
    
    @Override
    public boolean method11013() {
        return this.field16297.method4152() == null && Class841.method5031(this.field16297).nextInt(40) == 0;
    }
    
    @Override
    public boolean method11017() {
        return this.field16297.method4152() == null && this.field16296 > 0;
    }
    
    @Override
    public void method11015() {
        this.field16296 = 20 * (1 + Class841.method5032(this.field16297).nextInt(3));
        this.field16297.method5022(30);
    }
    
    @Override
    public void method11018() {
        if (this.field16297.method4152() == null) {
            this.field16297.method5022(0);
        }
    }
    
    @Override
    public void method11016() {
        --this.field16296;
    }
}

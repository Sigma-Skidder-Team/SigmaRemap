// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3590 extends Class3587
{
    private static String[] field16717;
    public final /* synthetic */ Class803 field16729;
    
    public Class3590(final Class803 field16729, final double n) {
        this.field16729 = field16729;
        super(field16729, n);
    }
    
    @Override
    public void method11015() {
        Class803.method4691((Class803)this.field16719);
        Class803.method4691((Class803)this.field16722);
        super.method11015();
    }
    
    @Override
    public void method11119() {
        final Class803 class803 = (Class803)this.field16719.method4349(this.field16722);
        if (class803 != null) {
            final Class513 method4362 = this.field16719.method4362();
            final Class513 method4363 = this.field16722.method4362();
            Class513 class804;
            if ((class804 = method4362) == null) {
                class804 = method4363;
            }
            else {
                Class803.method4695(class803, method4362.getUniqueID());
            }
            if (method4363 != null) {
                if (method4362 != method4363) {
                    Class803.method4695(class803, method4363.getUniqueID());
                }
            }
            if (class804 != null) {
                class804.method2857(Class8276.field34018);
                Class7770.field31789.method13804(class804, this.field16719, this.field16722, class803);
            }
            this.field16719.method4354(6000);
            this.field16722.method4354(6000);
            this.field16719.method4364();
            this.field16722.method4364();
            class803.method4354(-24000);
            class803.method1730(this.field16719.getPosX(), this.field16719.getPosY(), this.field16719.getPosZ(), 0.0f, 0.0f);
            this.field16721.method6886(class803);
            this.field16721.method6761(this.field16719, (byte)18);
            if (this.field16721.method6765().method31216(Class8878.field37319)) {
                this.field16721.method6886(new Class508(this.field16721, this.field16719.getPosX(), this.field16719.getPosY(), this.field16719.getPosZ(), this.field16719.method2633().nextInt(7) + 1));
            }
        }
    }
}

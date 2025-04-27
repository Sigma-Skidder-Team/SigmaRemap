// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1816 extends Class1799<Class835, Class5845<Class835>>
{
    private static String[] field9993;
    private final Class5849<Class835> field9994;
    private final Class5848<Class835> field9995;
    
    public Class1816(final Class4778<Class835, Class5845<Class835>> class4778) {
        super(class4778);
        this.field9994 = new Class5849<Class835>(0.008f);
        this.field9995 = new Class5848<Class835>(0.008f);
    }
    
    public void method6578(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Class835 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final Class5901 class7354 = (class7353.method4984() != 0) ? this.field9995 : this.field9994;
        final float[] method4982 = class7353.method4982();
        Class1799.method6557(this.method6559(), (Class5845<Class835>)class7354, class7353.method4986(), class7351, class7352, n, class7353, n2, n3, n5, n6, n7, n4, method4982[0], method4982[1], method4982[2]);
    }
}

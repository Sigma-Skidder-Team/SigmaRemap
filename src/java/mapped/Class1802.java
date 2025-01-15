// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1802 extends Class1799<Class799, Class5922<Class799>>
{
    private static final Class1932 field9970;
    
    public Class1802(final Class4778<Class799, Class5922<Class799>> class4778) {
        super(class4778);
    }
    
    public void method6562(final Class7351 class7351, final Class7807 class7352, final int n, final Class799 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (class7353.method4480()) {
            if (!class7353.method1823()) {
                float[] array = class7353.method4599().method815();
                if (Class8571.method28945()) {
                    array = Class8763.method30369(class7353.method4599(), array);
                }
                Class1799.method6558(((Class1799<T, Class5845<Class799>>)this).method6559(), Class1802.field9970, class7351, class7352, n, class7353, array[0], array[1], array[2]);
            }
        }
    }
    
    static {
        field9970 = new Class1932("textures/entity/wolf/wolf_collar.png");
    }
}

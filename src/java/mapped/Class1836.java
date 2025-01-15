// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1836 extends Class1799<Class802, Class5838<Class802>>
{
    private static final Class1932 field10018;
    public Class5841<Class802> field10019;
    
    public Class1836(final Class4778<Class802, Class5838<Class802>> class4778) {
        super(class4778);
        this.field10019 = new Class5841<Class802>();
    }
    
    public void method6605(final Class7351 class7351, final Class7807 class7352, final int n, final Class802 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!class7353.method4636()) {
            if (!class7353.method1823()) {
                float n12;
                float n13;
                float n14;
                if (class7353.method1874() && "jeb_".equals(class7353.method1841().method8459())) {
                    final int n8 = class7353.field2424 / 25 + class7353.method1643();
                    final int length = Class181.values().length;
                    final int n9 = n8 % length;
                    final int n10 = (n8 + 1) % length;
                    final float n11 = (class7353.field2424 % 25 + n4) / 25.0f;
                    float[] array = Class802.method4630(Class181.method819(n9));
                    float[] array2 = Class802.method4630(Class181.method819(n10));
                    if (Class8571.method28945()) {
                        array = Class8763.method30370(Class181.method819(n9), array);
                        array2 = Class8763.method30370(Class181.method819(n10), array2);
                    }
                    n12 = array[0] * (1.0f - n11) + array2[0] * n11;
                    n13 = array[1] * (1.0f - n11) + array2[1] * n11;
                    n14 = array[2] * (1.0f - n11) + array2[2] * n11;
                }
                else {
                    float[] array3 = Class802.method4630(class7353.method4634());
                    if (Class8571.method28945()) {
                        array3 = Class8763.method30370(class7353.method4634(), array3);
                    }
                    n12 = array3[0];
                    n13 = array3[1];
                    n14 = array3[2];
                }
                Class1799.method6557(((Class1799<T, Class5845<Class802>>)this).method6559(), this.field10019, Class1836.field10018, class7351, class7352, n, class7353, n2, n3, n5, n6, n7, n4, n12, n13, n14);
            }
        }
    }
    
    static {
        field10018 = new Class1932("textures/entity/sheep/sheep_fur.png");
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1830 extends Class1799<Class840, Class5882<Class840>>
{
    private static String[] field10011;
    
    public Class1830(final Class4778<Class840, Class5882<Class840>> class4778) {
        super(class4778);
    }
    
    public void method6593(final Class7351 class7351, final Class7807 class7352, final int n, final Class840 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final boolean b = class7353.method2755() == Class2226.field13698;
        class7351.method22567();
        final float n8 = Class9546.method35647(class7353.field2400) / 60.0f;
        if (class7353.field2400 >= 0.0f) {
            class7351.method22564(0.0, 1.0f + n8 * 0.8f, -1.0f + n8 * 0.2f);
        }
        else {
            class7351.method22564(0.0, 1.0f - n8 * 0.5f, -1.0f + n8 * 0.5f);
        }
        Class869.method5277().method5308().method35143(class7353, b ? class7353.method2713() : class7353.method2714(), Class2016.field11493, false, class7351, class7352, n);
        class7351.method22568();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class606 extends Class605<Class622>
{
    private static String[] field3557;
    
    public Class606(final Minecraft class869, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(class869, n, n2, n3, n4, n5);
        this.field3549 = false;
    }
    
    public int method3565(final Class6469 class6469) {
        return this.method3536(Class622.method3620(this.field3540.gameSettings, this.field3543, class6469));
    }
    
    public void method3566(final Class6469 class6469, final Class6469 class6470) {
        this.method3536(Class622.method3621(this.field3540.gameSettings, this.field3543, class6469, class6470));
    }
    
    public void method3567(final Class6469[] array) {
        for (int i = 0; i < array.length; i += 2) {
            this.method3566(array[i], (i >= array.length - 1) ? null : array[i + 1]);
        }
    }
    
    @Override
    public int method3529() {
        return 400;
    }
    
    @Override
    public int method3555() {
        return super.method3555() + 32;
    }
}

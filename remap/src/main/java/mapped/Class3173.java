// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3173 extends Class3167
{
    private static int field15534;
    
    public Class3173() {
        super(Class8013.field32986, "AAC 4", "Criticals for aac 4.*");
    }
    
    @Override
    public void method9879() {
        Class3173.field15534 = 0;
    }
    
    @Class6753
    @Class6759
    private void method9939(final Class5745 class5745) {
        if (this.method9906() && class5745.method17049() >= 0.625) {
            Class3173.field15534 = 0;
        }
    }
    
    @Class6753
    private void method9940(final Class5722 class5722) {
        if (Class3173.field15534 == 2) {
            class5722.method16961(true);
        }
    }
    
    @Class6753
    @Class6757
    private void method9941(final Class5744 class5744) {
        if (!this.method9906() || Class9463.method35173().method35189().method21551(Class3256.class).method9906()) {
            Class3173.field15534 = 0;
            return;
        }
        if (class5744.method17046()) {
            if (Class3173.field15514.field4682.method27337()) {
                Class3173.field15534 = 0;
            }
            if (Class3173.field15514.field4684.onGround && Class3173.field15514.field4684.collidedVertically) {
                ++Class3173.field15534;
                Class3173.field15514.field4684.field4075 = 0.0;
                if (Class3173.field15534 != 2) {
                    if (Class3173.field15534 >= 3) {
                        class5744.method17037(class5744.method17036() + 0.001);
                        class5744.method17045(false);
                    }
                }
                else {
                    class5744.method17037(class5744.method17036() + 0.00101);
                    class5744.method17045(false);
                }
            }
            else {
                Class3173.field15534 = 0;
            }
        }
    }
    
    public static boolean method9942() {
        return Class3173.field15534 == 2;
    }
}

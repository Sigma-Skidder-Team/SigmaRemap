// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3339 extends Class3167
{
    private int field15940;
    
    public Class3339() {
        super(Class8013.field32986, "AutoClicker", "Longpress your attack keybind to hit entities automaticly");
    }
    
    @Class6753
    private void method10568(final Class5743 class5743) {
        if (this.method9906()) {
            ++this.field15940;
            final Random random = new Random();
            final int n = 2;
            final int n2 = random.nextInt(4 - n) + n;
            if (Class3339.field15514.field4648.field23446.method1056()) {
                if (this.field15940 >= n2) {
                    Class3339.field15514.field4684.method2707(Class316.field1877);
                    this.field15940 = 0;
                    if (Class6430.method19141(Class3339.field15514.field4684.rotationYaw, Class3339.field15514.field4684.rotationPitch, 4.6f, 0.0) != null) {
                        Class3339.field15514.method5269().method17292(new Class4381(Class6430.method19141(Class3339.field15514.field4684.rotationYaw, Class3339.field15514.field4684.rotationPitch, 4.6f, 0.0)));
                        Class3339.field15514.field4684.method2707(Class316.field1877);
                    }
                }
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class5502 implements ILivingEntityData
{
    private static String[] field22794;
    public Class5328 field22795;
    
    public void method16804(final Random random) {
        final int nextInt = random.nextInt(5);
        if (nextInt > 1) {
            if (nextInt > 2) {
                if (nextInt > 3) {
                    if (nextInt <= 4) {
                        this.field22795 = Class9439.field40487;
                    }
                }
                else {
                    this.field22795 = Class9439.field40483;
                }
            }
            else {
                this.field22795 = Class9439.field40478;
            }
        }
        else {
            this.field22795 = Class9439.field40474;
        }
    }
}

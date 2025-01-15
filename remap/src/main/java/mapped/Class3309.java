// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class3309 extends Class3167
{
    private int field15888;
    
    public Class3309() {
        super(Class8013.field32986, "FastBow", "Shoots arrows faster");
    }
    
    @Class6753
    private void method10472(final Class5743 class5743) {
        if (this.method9906()) {
            if (Class3309.field15514.field4684.method2713() != null) {
                if (Class3309.field15514.field4684.method2713().method27622() instanceof Class4087) {
                    if (Class3309.field15514.field4684.onGround) {
                        for (int i = 0; i < 25; ++i) {
                            Class3309.field15514.method5269().method17292(new Class4353(true));
                        }
                        Class3309.field15514.method5269().method17292(new Class4399(Class2003.field11245, BlockPos.ZERO, Direction.DOWN));
                    }
                }
            }
        }
    }
}

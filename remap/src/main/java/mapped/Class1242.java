// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.world.AutoFarm;

public class Class1242 implements Runnable
{
    private static String[] field6757;
    public final /* synthetic */ float[] field6758;
    public final /* synthetic */ AutoFarm field6759;
    
    public Class1242(final AutoFarm field6759, final float[] field6760) {
        this.field6759 = field6759;
        this.field6758 = field6760;
    }
    
    @Override
    public void run() {
        AutoFarm.method10346().method5269().method17292(new Class4329(Class316.field1877, Class4609.method13697(this.field6758[0], this.field6758[1], 4.5f)));
        AutoFarm.method10347().method5269().method17292(new Class4380(Class316.field1877));
    }
}

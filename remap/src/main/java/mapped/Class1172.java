// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.world.AutoFarm;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

public class Class1172 implements Runnable
{
    private static String[] field6352;
    public final /* synthetic */ BlockPos field6353;
    public final /* synthetic */ AutoFarm field6354;
    
    public Class1172(final AutoFarm field6354, final BlockPos field6355) {
        this.field6354 = field6354;
        this.field6353 = field6355;
    }
    
    @Override
    public void run() {
        AutoFarm.method10348().method5269().method17292(new Class4399(Class2003.field11240, this.field6353, Direction.UP));
        AutoFarm.method10349().method5269().method17292(new Class4399(Class2003.field11242, this.field6353, Direction.UP));
        AutoFarm.method10350().method5269().method17292(new Class4380(Class316.field1877));
    }
}

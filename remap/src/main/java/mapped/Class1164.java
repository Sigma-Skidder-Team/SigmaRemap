// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class1164 implements Runnable
{
    private static String[] field6316;
    public final /* synthetic */ BlockPos field6317;
    public final /* synthetic */ Class3281 field6318;
    
    public Class1164(final Class3281 field6318, final BlockPos field6319) {
        this.field6318 = field6318;
        this.field6317 = field6319;
    }
    
    @Override
    public void run() {
        Class3281.method10359().method5269().method17292(new Class4399(Class2003.field11240, this.field6317.method1137(), Direction.UP));
        Class3281.method10360().method5269().method17292(new Class4399(Class2003.field11242, this.field6317.method1137(), Direction.UP));
        Class3281.method10361().method5269().method17292(new Class4380(Class316.field1877));
    }
}

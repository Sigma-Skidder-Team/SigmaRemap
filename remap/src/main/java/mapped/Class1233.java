// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class1233 implements Runnable
{
    private static String[] field6705;
    public final /* synthetic */ BlockPos field6706;
    public final /* synthetic */ Class3281 field6707;
    
    public Class1233(final Class3281 field6707, final BlockPos field6708) {
        this.field6707 = field6707;
        this.field6706 = field6708;
    }
    
    @Override
    public void run() {
        Class3281.method10356().method5269().method17292(new Class4399(Class2003.field11240, this.field6706.method1137(), Direction.UP));
        Class3281.method10357().method5269().method17292(new Class4399(Class2003.field11242, this.field6706.method1137(), Direction.UP));
        Class3281.method10358().method5269().method17292(new Class4380(Class316.field1877));
    }
}
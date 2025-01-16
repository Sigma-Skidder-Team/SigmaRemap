// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util2.Direction;

import java.util.List;

public class Class3352 extends Class3167
{
    private BlockPos field15977;
    private List<BlockPos> field15978;
    
    public Class3352() {
        super(Class8013.field32987, "Nuker", "Destroys blocks around you");
        this.method9881(new Class4996("Range", "Range value for nuker", 6.0f, Float.class, 2.0f, 10.0f, 1.0f));
        this.method9881(new Class5001("Mode", "Mode", 0, new String[] { "All", "One hit", "Bed", "Egg" }));
        this.method9881(new Class4999("NoSwing", "Removes the swing animation.", false));
        this.method9881(new Class5000("Blocks", "Blocks to destroy", true, new String[0]));
    }
    
    @Class6753
    private void method10609(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            this.field15978 = this.method10612(this.method9886("Range") / 2.0f);
            if (this.field15978.isEmpty()) {
                this.field15977 = null;
            }
            else if (Class3352.field15514.field4682.method27336() != Class101.field299) {
                if (this.field15977 != null) {
                    if (Class3352.field15514.field4683.getBlockState(this.field15977).method21706() || Math.sqrt(Class3352.field15514.field4684.method1733(this.field15977.getX() + 0.5, this.field15977.getY() + 0.5, this.field15977.getZ() + 0.5)) > 6.0) {
                        this.field15977 = this.field15978.get(0);
                    }
                    final float[] method30919 = Class8845.method30919(this.field15977.getX(), this.field15977.getZ(), this.field15977.getY());
                    class5744.method17043(method30919[0]);
                    class5744.method17041(method30919[1]);
                    Class9463.method35173().method35188().method21097(new Class5752(0, false, this.field15977));
                    Class3352.field15514.field4682.method27314(this.field15977, Class4609.method13710(this.field15977));
                    if (!this.method9883("NoSwing")) {
                        Class3352.field15514.field4684.method2707(Class316.field1877);
                    }
                    else {
                        Class3352.field15514.method5269().method17292(new Class4380(Class316.field1877));
                    }
                }
                else {
                    this.field15977 = this.field15978.get(0);
                    final float[] method30920 = Class8845.method30919(this.field15977.getX(), this.field15977.getZ(), this.field15977.getY());
                    class5744.method17043(method30920[0]);
                    class5744.method17041(method30920[1]);
                    Class9463.method35173().method35188().method21097(new Class5752(0, false, this.field15977));
                    Class3352.field15514.field4682.method27314(this.field15977, Class4609.method13710(this.field15977));
                    if (!this.method9883("NoSwing")) {
                        Class3352.field15514.field4684.method2707(Class316.field1877);
                    }
                    else {
                        Class3352.field15514.method5269().method17292(new Class4380(Class316.field1877));
                    }
                }
            }
            else {
                for (final BlockPos class5745 : this.field15978) {
                    Class3352.field15514.method5269().method17292(new Class4399(Class2003.field11240, class5745, Class4609.method13710(class5745)));
                    if (!this.method9883("NoSwing")) {
                        Class3352.field15514.field4684.method2707(Class316.field1877);
                    }
                    else {
                        Class3352.field15514.method5269().method17292(new Class4380(Class316.field1877));
                    }
                }
            }
        }
    }
    
    public static void method10610(final BlockPos class354) {
        Class3352.field15514.method5269().method17292(new Class4399(Class2003.field11240, class354, Direction.UP));
        Class3352.field15514.method5269().method17292(new Class4399(Class2003.field11242, class354, Direction.UP));
        Class3352.field15514.field4683.method6692(class354, new BlockState(Class7521.field29147, (ImmutableMap<IProperty<?>, Comparable<?>>)ImmutableMap.builder().build()));
    }
    
    private boolean method10611(final BlockPos class354) {
        final Block method21696 = Class3352.field15514.field4683.getBlockState(class354).method21696();
        return Class3352.field15514.field4683.getBlockState(class354).method21697().method26442() || method21696 instanceof Class3874;
    }
    
    private List<BlockPos> method10612(final float n) {
        final ArrayList list = new ArrayList();
        for (float n2 = n + 2.0f; n2 >= -n + 1.0f; --n2) {
            for (float n3 = -n; n3 <= n; ++n3) {
                for (float n4 = -n; n4 <= n; ++n4) {
                    final BlockPos class354 = new BlockPos(Class3352.field15514.field4684.posX + n3, Class3352.field15514.field4684.posY + n2, Class3352.field15514.field4684.posZ + n4);
                    if (!Class3352.field15514.field4683.getBlockState(class354).method21706() && Class3352.field15514.field4683.getBlockState(class354).method21756().method21781() && Math.sqrt(Class3352.field15514.field4684.method1733(class354.getX() + 0.5, class354.getY() + 0.5, class354.getZ() + 0.5)) < n) {
                        final String method9887 = this.method9887("Mode");
                        switch (method9887) {
                            case "One hit": {
                                if (!this.method10611(class354)) {
                                    continue;
                                }
                                break;
                            }
                            case "Bed": {
                                if (!(Class3352.field15514.field4683.getBlockState(class354).method21696() instanceof Class3900)) {
                                    continue;
                                }
                                break;
                            }
                            case "Egg": {
                                if (!(Class3352.field15514.field4683.getBlockState(class354).method21696() instanceof Class3987)) {
                                    continue;
                                }
                                break;
                            }
                        }
                        list.add(class354);
                    }
                }
            }
        }
        return list;
    }
}

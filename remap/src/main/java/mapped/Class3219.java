// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Class3219 extends Class3167
{
    public static BlockPos field15674;
    
    public Class3219() {
        super(Class8013.field32987, "CakeEater", "Automatically eats cake");
        this.method9881(new Class4999("No Swing", "Removes the swing animation.", true));
        this.method9881(new Class4999("Mineplex", "Mineplex mode.", true));
    }
    
    @Override
    public void method9897() {
        Class3219.field15674 = null;
    }
    
    @Class6753
    private void method10145(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4378) {
                if (((Class4378)class5723.method16998()).method13164().getFormattedText().equals("§9Game> §r§7You cannot eat your own cake!§r")) {
                    class5723.method16961(true);
                }
            }
        }
    }
    
    @Class6753
    @Class6757
    private void method10146(final Class5744 class5744) {
        if (!this.method9906()) {
            return;
        }
        final Class3247 class5745 = (Class3247)Class9463.method35173().method35189().method21551(Class3259.class);
        if (class5745.method10260() instanceof Class3358 && ((Class3358)class5745.method10260()).method10632()) {
            return;
        }
        if (!class5744.method17046()) {
            if (Class3219.field15674 != null) {
                if (this.method9883("No Swing") && !this.method9883("Mineplex")) {
                    Class3219.field15514.method5269().method17292(new Class4380(Class316.field1877));
                }
                else if (!this.method9883("No Swing")) {
                    Class3219.field15514.field4684.method2707(Class316.field1877);
                }
                Class3219.field15514.method5269().method17292(new Class4329(Class316.field1877, new BlockRayTraceResult(new Vec3d(Class3219.field15674.getX() + 0.4 + Math.random() * 0.2, Class3219.field15674.getY() + 0.5, Class3219.field15674.getZ() + 0.4 + Math.random() * 0.2), Direction.UP, Class3219.field15674, false)));
            }
        }
        else {
            final List<BlockPos> method10147 = this.method10147(this.method9883("Mineplex") ? 6.0f : Class3219.field15514.field4682.method27315());
            if (method10147.isEmpty()) {
                Class3219.field15674 = null;
            }
            else {
                Collections.sort((List<Object>)method10147, (Comparator<? super Object>)new Class4468(this));
                Class3219.field15674 = method10147.get(0);
                if (!this.method9883("Mineplex")) {
                    final float[] method10148 = Class8845.method30919(Class3219.field15674.getX() + 0.5, Class3219.field15674.getZ() + 0.5, Class3219.field15674.getY());
                    class5744.method17043(method10148[0]);
                    class5744.method17041(method10148[1]);
                }
            }
        }
    }
    
    private List<BlockPos> method10147(final float n) {
        final ArrayList list = new ArrayList();
        for (float n2 = n + 2.0f; n2 >= -n + 1.0f; --n2) {
            for (float n3 = -n; n3 <= n; ++n3) {
                for (float n4 = -n; n4 <= n; ++n4) {
                    final BlockPos class354 = new BlockPos(Class3219.field15514.field4684.posX + n3, Class3219.field15514.field4684.posY + n2, Class3219.field15514.field4684.posZ + n4);
                    if (Class3219.field15514.field4683.getBlockState(class354).method21696() instanceof Class3963) {
                        if (Math.sqrt(Class3219.field15514.field4684.method1733(class354.getX() + 0.5, class354.getY() + 0.5, class354.getZ() + 0.5)) < n) {
                            list.add(class354);
                        }
                    }
                }
            }
        }
        return list;
    }
}

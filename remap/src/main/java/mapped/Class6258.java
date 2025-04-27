// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.World;

public class Class6258 extends Class6257
{
    private static String[] field25120;
    
    public Class6258(final Class2233 class2233, final Class2215... array) {
        super(class2233, Class242.field1192, array);
    }
    
    @Override
    public int method18586(final int n) {
        return n * 10;
    }
    
    @Override
    public int method18587(final int n) {
        return this.method18586(n) + 15;
    }
    
    @Override
    public boolean method18603() {
        return true;
    }
    
    @Override
    public int method18588() {
        return 2;
    }
    
    public static void method18605(final LivingEntity class511, final World class512, final BlockPos class513, final int n) {
        if (class511.onGround) {
            final BlockState method11878 = Blocks.FROSTED_ICE.getDefaultState();
            final float n2 = (float)Math.min(16, 2 + n);
            final Mutable class514 = new Mutable();
            for (final BlockPos class515 : BlockPos.getAllInBoxMutable(class513.add(-n2, -1.0, -n2), class513.add(n2, -1.0, n2))) {
                if (!class515.withinDistance(class511.method1934(), n2)) {
                    continue;
                }
                class514.setPos(class515.getX(), class515.getY() + 1, class515.getZ());
                if (!class512.getBlockState(class514).method21706()) {
                    continue;
                }
                final BlockState method11879 = class512.getBlockState(class515);
                if (method11879.getMaterial() != Material.WATER) {
                    continue;
                }
                if (method11879.get(Class3859.field17480) != 0) {
                    continue;
                }
                if (!method11878.method21752(class512, class515)) {
                    continue;
                }
                if (!class512.method6974(method11878, class515, ISelectionContext.dummy())) {
                    continue;
                }
                class512.method6692(class515, method11878);
                class512.method6833().method21345(class515, Blocks.FROSTED_ICE, MathHelper.method35658(class511.method2633(), 60, 120));
            }
        }
    }
    
    @Override
    public boolean method18589(final Class6257 class6257) {
        return super.method18589(class6257) && class6257 != Class7882.field32355;
    }
}

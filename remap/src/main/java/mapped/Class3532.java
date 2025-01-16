// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class3532 extends Class3531
{
    private static String[] field16563;
    public final /* synthetic */ Class771 field16564;
    
    private Class3532(final Class771 field16564) {
        this.field16564 = field16564;
        super(field16564);
    }
    
    @Override
    public int method11084() {
        return 40;
    }
    
    @Override
    public int method11085() {
        return 100;
    }
    
    @Override
    public void method11082() {
        final LivingEntity method4152 = this.field16564.method4152();
        final double min = Math.min(method4152.getPosY(), this.field16564.getPosY());
        final double n = Math.max(method4152.getPosY(), this.field16564.getPosY()) + 1.0;
        final float n2 = (float) MathHelper.method35693(method4152.getPosZ() - this.field16564.getPosZ(), method4152.getPosX() - this.field16564.getPosX());
        if (this.field16564.method1734(method4152) >= 9.0) {
            for (int i = 0; i < 16; ++i) {
                final double n3 = 1.25 * (i + 1);
                this.method11088(this.field16564.getPosX() + MathHelper.cos(n2) * n3, this.field16564.getPosZ() + MathHelper.sin(n2) * n3, min, n, n2, 1 * i);
            }
        }
        else {
            for (int j = 0; j < 5; ++j) {
                final float n4 = n2 + j * 3.1415927f * 0.4f;
                this.method11088(this.field16564.getPosX() + MathHelper.cos(n4) * 1.5, this.field16564.getPosZ() + MathHelper.sin(n4) * 1.5, min, n, n4, 0);
            }
            for (int k = 0; k < 8; ++k) {
                final float n5 = n2 + k * 3.1415927f * 2.0f / 8.0f + 1.2566371f;
                this.method11088(this.field16564.getPosX() + MathHelper.cos(n5) * 2.5, this.field16564.getPosZ() + MathHelper.sin(n5) * 2.5, min, n, n5, 3);
            }
        }
    }
    
    private void method11088(final double n, final double n2, final double n3, final double n4, final float n5, final int n6) {
        BlockPos method1139 = new BlockPos(n, n4, n2);
        boolean b = false;
        double method1140 = 0.0;
        do {
            final BlockPos method1141 = method1139.method1139();
            if (this.field16564.world.getBlockState(method1141).method21761(this.field16564.world, method1141, Direction.UP)) {
                if (!this.field16564.world.method6961(method1139)) {
                    final VoxelShape method1142 = this.field16564.world.getBlockState(method1139).method21727(this.field16564.world, method1139);
                    if (!method1142.isEmpty()) {
                        method1140 = method1142.getEnd(Direction.Axis.Y);
                    }
                }
                b = true;
                break;
            }
            method1139 = method1139.method1139();
        } while (method1139.getY() >= MathHelper.floor(n3) - 1);
        if (b) {
            this.field16564.world.method6886(new Class507(this.field16564.world, n, method1139.getY() + method1140, n2, n5, n6, this.field16564));
        }
    }
    
    @Override
    public Class7795 method11086() {
        return Class8520.field35182;
    }
    
    @Override
    public Class2107 method11087() {
        return Class2107.field12215;
    }
}

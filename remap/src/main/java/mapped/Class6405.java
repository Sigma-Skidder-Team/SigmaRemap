// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public class Class6405 extends Class6404
{
    private static String[] field25523;
    private final Class6404 field25524;
    private final Class241 field25525;
    
    public Class6405(final Class241 field25525) {
        this.field25524 = new Class6404();
        this.field25525 = field25525;
    }
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final Direction class5493 = class5491.method16765().get((IProperty<Direction>)Class3955.field17859);
        final World method16763 = class5491.method16763();
        final double n = class5491.getX() + class5493.getXOffset() * 1.125f;
        final double n2 = class5491.getY() + class5493.getYOffset() * 1.125f;
        final double n3 = class5491.getZ() + class5493.getZOffset() * 1.125f;
        final BlockPos method16764 = class5491.method16764().method1149(class5493);
        double n4;
        if (!method16763.getFluidState(method16764).isTagged(Class7324.field28319)) {
            if (!method16763.getBlockState(method16764).method21706() || !method16763.getFluidState(method16764.method1139()).isTagged(Class7324.field28319)) {
                return this.field25524.method19090(class5491, class5492);
            }
            n4 = 0.0;
        }
        else {
            n4 = 1.0;
        }
        final Class423 class5494 = new Class423(method16763, n, n2 + n4, n3);
        class5494.method2064(this.field25525);
        class5494.rotationYaw = class5493.getHorizontalAngle();
        method16763.method6886(class5494);
        class5492.method27693(1);
        return class5492;
    }
    
    @Override
    public void method19088(final Class5491 class5491) {
        class5491.method16763().method6955(1000, class5491.method16764(), 0);
    }
}

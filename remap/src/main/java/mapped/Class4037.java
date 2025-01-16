// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class4037 extends Class4036
{
    public Class4037(final Block class3833, final Class8959 class3834) {
        super(class3833, class3834);
    }
    
    @Nullable
    @Override
    public Class7074 method12231(final Class7074 class7074) {
        final BlockPos method21639 = class7074.method21639();
        final World method21640 = class7074.method21654();
        if (method21640.getBlockState(method21639).method21696() == this.method12240()) {
            Direction class7075;
            if (!class7074.method21645()) {
                class7075 = ((class7074.method21648() != Direction.UP) ? Direction.UP : class7074.method21644());
            }
            else {
                class7075 = (class7074.method21650() ? class7074.method21648().getOpposite() : class7074.method21648());
            }
            int i = 0;
            final Mutable method21641 = new Mutable(method21639).method1290(class7075);
            while (i < 7) {
                if (!method21640.isRemote && !World.method6682(method21641)) {
                    final Class512 method21642 = class7074.method21652();
                    final int method21643 = method21640.method6986();
                    if (!(method21642 instanceof Class513)) {
                        break;
                    }
                    if (method21641.getY() < method21643) {
                        break;
                    }
                    ((Class513)method21642).field3039.method17469(new Class4378(new Class2259("build.tooHigh", new Object[] { method21643 }).applyTextStyle(TextFormatting.RED), Class285.field1574));
                    break;
                }
                else {
                    final Class7096 method21644 = method21640.getBlockState(method21641);
                    if (method21644.method21696() == this.method12240()) {
                        method21641.method1290(class7075);
                        if (!class7075.getAxis().isHorizontal()) {
                            continue;
                        }
                        ++i;
                    }
                    else {
                        if (!method21644.method21750(class7074)) {
                            break;
                        }
                        return Class7074.method21647(class7074, method21641, class7075);
                    }
                }
            }
            return null;
        }
        return (Class3920.method12036(method21640, method21639) != 7) ? class7074 : null;
    }
    
    @Override
    public boolean method12237() {
        return false;
    }
}

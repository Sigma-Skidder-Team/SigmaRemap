// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public final class Class6420 extends Class6404
{
    private static String[] field25523;
    private final Class6404 field25529;
    
    public Class6420() {
        this.field25529 = new Class6404();
    }
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final World method16763 = class5491.method16763();
        final BlockPos method16764 = class5491.method16764().method1149(class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859));
        final BlockState method16765 = method16763.method6701(method16764);
        final Class3833 method16766 = method16765.method21696();
        if (!(method16766 instanceof Class3857)) {
            return super.method19087(class5491, class5492);
        }
        final Class7255 method16767 = ((Class3857)method16766).method11922(method16763, method16764, method16765);
        if (!(method16767 instanceof Class7257)) {
            return super.method19087(class5491, class5492);
        }
        final Item method16768 = method16767.method22149();
        class5492.method27693(1);
        if (!class5492.method27620()) {
            if (class5491.method16766().method2334(new ItemStack(method16768)) < 0) {
                this.field25529.method19090(class5491, new ItemStack(method16768));
            }
            return class5492;
        }
        return new ItemStack(method16768);
    }
}

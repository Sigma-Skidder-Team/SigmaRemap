// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public final class Class6402 extends Class6397
{
    private static String[] field25520;
    private final Class6404 field25521;
    
    public Class6402() {
        this.field25521 = new Class6404();
    }
    
    private ItemStack method19089(final Class5491 class5491, final ItemStack class5492, final ItemStack class5493) {
        class5492.method27693(1);
        if (!class5492.method27620()) {
            if (class5491.method16766().method2334(class5493.method27641()) < 0) {
                this.field25521.method19090(class5491, class5493.method27641());
            }
            return class5492;
        }
        return class5493.method27641();
    }
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        this.field25515 = false;
        final World method16763 = class5491.method16763();
        final BlockPos method16764 = class5491.method16764().method1149(class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859));
        final Class7096 method16765 = method16763.method6701(method16764);
        if (method16765.method21696().method11785(Class7188.field27931) && method16765.method21772((Class7111<Integer>)Class3961.field17902) >= 5) {
            ((Class3961)method16765.method21696()).method12085(method16763.method6744(), method16765, method16764, null, Class2144.field12625);
            this.field25515 = true;
            return this.method19089(class5491, class5492, new ItemStack(Class7739.field31635));
        }
        if (!method16763.method6702(method16764).method21793(Class7324.field28319)) {
            return super.method19087(class5491, class5492);
        }
        this.field25515 = true;
        return this.method19089(class5491, class5492, Class5333.method16476(new ItemStack(Class7739.field31441), Class8644.field36251));
    }
}

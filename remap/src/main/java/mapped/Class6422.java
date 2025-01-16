// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public final class Class6422 extends Class6404
{
    private static String[] field25523;
    private final Class6404 field25531;
    
    public Class6422() {
        this.field25531 = new Class6404();
    }
    
    @Override
    public ItemStack method19087(final Class5491 class5491, final ItemStack class5492) {
        final Class3821 class5493 = (Class3821)class5492.getItem();
        final BlockPos method1149 = class5491.method16764().method1149(class5491.method16765().get((IProperty<Direction>)Class3955.field17859));
        final World method1150 = class5491.method16763();
        if (!class5493.method11755(null, method1150, method1149, null)) {
            return this.field25531.method19090(class5491, class5492);
        }
        class5493.method11753(method1150, class5492, method1149);
        return new ItemStack(Items.field31349);
    }
}

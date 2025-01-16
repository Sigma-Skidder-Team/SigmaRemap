// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public class Class3846 extends Block
{
    private static String[] field17455;
    
    public Class3846(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public boolean method11807(final BlockState class7096, final BlockState class7097, final Direction class7098) {
        return class7097.getBlock() == this || super.method11807(class7096, class7097, class7098);
    }
}

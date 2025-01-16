// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Iterator;

public final class Class97 implements Iterable
{
    private static String[] field265;
    public final /* synthetic */ BlockPos field266;
    public final /* synthetic */ BlockPos field267;
    
    public Class97(final BlockPos field266, final BlockPos field267) {
        this.field266 = field266;
        this.field267 = field267;
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)new Class7247(this);
    }
}

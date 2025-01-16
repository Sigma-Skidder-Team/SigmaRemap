// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import net.minecraft.dispenser.IPosition;
import net.minecraft.util.math.BlockPos;

import java.util.Set;
import java.util.List;
import java.util.UUID;

public class Class8665
{
    private static String[] field36431;
    public final UUID field36432;
    public final int field36433;
    public final IPosition field36434;
    public final Class9468 field36435;
    public final BlockPos field36436;
    public final BlockPos field36437;
    public final int field36438;
    public final List<String> field36439;
    public final Set<BlockPos> field36440;
    
    public Class8665(final UUID field36432, final int field36433, final IPosition field36434, final Class9468 field36435, final BlockPos field36436, final BlockPos field36437, final int field36438) {
        this.field36439 = Lists.newArrayList();
        this.field36440 = Sets.newHashSet();
        this.field36432 = field36432;
        this.field36433 = field36433;
        this.field36434 = field36434;
        this.field36435 = field36435;
        this.field36436 = field36436;
        this.field36437 = field36437;
        this.field36438 = field36438;
    }
    
    public boolean method29668(final BlockPos class354) {
        return this.field36436 != null && this.field36436.equals(class354);
    }
    
    public UUID method29669() {
        return this.field36432;
    }
    
    public String method29670() {
        return Class8956.method31774(this.field36432);
    }
    
    @Override
    public String toString() {
        return this.method29670();
    }
    
    public boolean method29671() {
        return this.field36437 != null;
    }
}

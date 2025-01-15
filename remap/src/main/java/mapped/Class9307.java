// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import net.minecraft.dispenser.IPosition;

import java.util.Set;
import java.util.List;
import java.util.UUID;

public class Class9307
{
    private static String[] field39932;
    public final UUID field39933;
    public final int field39934;
    public final String field39935;
    public final String field39936;
    public final int field39937;
    public final IPosition field39938;
    public final String field39939;
    public final Class9468 field39940;
    public final boolean field39941;
    public final List<String> field39942;
    public final List<String> field39943;
    public final List<String> field39944;
    public final List<String> field39945;
    public final Set<BlockPos> field39946;
    
    public Class9307(final UUID field39933, final int field39934, final String field39935, final String field39936, final int field39937, final IPosition field39938, final String field39939, final Class9468 field39940, final boolean field39941) {
        this.field39942 = Lists.newArrayList();
        this.field39943 = Lists.newArrayList();
        this.field39944 = Lists.newArrayList();
        this.field39945 = Lists.newArrayList();
        this.field39946 = Sets.newHashSet();
        this.field39933 = field39933;
        this.field39934 = field39934;
        this.field39935 = field39935;
        this.field39936 = field39936;
        this.field39937 = field39937;
        this.field39938 = field39938;
        this.field39939 = field39939;
        this.field39940 = field39940;
        this.field39941 = field39941;
    }
    
    private boolean method34423(final BlockPos class354) {
        return this.field39946.stream().anyMatch(class354::equals);
    }
    
    public UUID method34424() {
        return this.field39933;
    }
}

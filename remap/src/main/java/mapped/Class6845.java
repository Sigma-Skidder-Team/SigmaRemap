// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;

import java.util.Arrays;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.List;
import com.mojang.datafixers.DataFix;

public class Class6845 extends DataFix
{
    private static final List<String> field26862;
    
    public Class6845(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return null;
    }
    
    static {
        field26862 = Lists.newArrayList(Arrays.toString(new String[] {"MinecartChest", "MinecartFurnace"}));
    }
}

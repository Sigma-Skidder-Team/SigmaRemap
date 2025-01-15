// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.schemas.Schema;

public class Class5477 extends Class5476
{
    public Class5477(final Schema schema) {
        super(schema, false);
    }
    
    @Override
    public String method16719(final String s) {
        return s.equals("minecraft:bee_hive") ? "minecraft:beehive" : s;
    }
}

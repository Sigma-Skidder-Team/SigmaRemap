// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DSL$TypeReference;
import com.mojang.datafixers.DataFix;

public class Class7593 extends DataFix
{
    private static String[] field30115;
    private final String field30116;
    private final DSL$TypeReference field30117;
    
    public Class7593(final Schema schema, final String field30116, final DSL$TypeReference field30117) {
        super(schema, true);
        this.field30116 = field30116;
        this.field30117 = field30117;
    }
    
    public TypeRewriteRule makeRule() {
        return this.writeAndRead(this.field30116, this.getInputSchema().getType(this.field30117), this.getOutputSchema().getType(this.field30117));
    }
}

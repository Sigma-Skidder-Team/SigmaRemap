// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DSL$TypeReference;
import com.mojang.datafixers.DataFix;

public abstract class Class6132 extends DataFix
{
    private final String field24877;
    private final String field24878;
    private final DSL$TypeReference field24879;
    
    public Class6132(final Schema schema, final boolean b, final String field24877, final DSL$TypeReference field24878, final String field24879) {
        super(schema, b);
        this.field24877 = field24877;
        this.field24879 = field24878;
        this.field24878 = field24879;
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.field24877, this.getInputSchema().getType(this.field24879), this.getOutputSchema().getType(this.field24879), typed -> {
            DSL.namedChoice(this.field24878, this.getInputSchema().getChoiceType(this.field24879, this.field24878));
            return typed.updateTyped(opticFinder, this.getOutputSchema().getChoiceType(this.field24879, this.field24878), (Function)this::method18357);
        });
    }
    
    public abstract Typed<?> method18357(final Typed<?> p0);
}

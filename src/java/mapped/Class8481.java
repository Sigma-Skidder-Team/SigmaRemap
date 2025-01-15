// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import java.util.function.Function;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DSL$TypeReference;
import com.mojang.datafixers.DataFix;

public class Class8481 extends DataFix
{
    private final String field34801;
    private final DSL$TypeReference field34802;
    
    public Class8481(final Schema schema, final String field34801, final DSL$TypeReference field34802) {
        super(schema, true);
        this.field34801 = field34801;
        this.field34802 = field34802;
    }
    
    public TypeRewriteRule makeRule() {
        return this.method28313(this.field34801, (com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType<Object>)this.getInputSchema().findChoiceType(this.field34802), (TaggedChoice$TaggedChoiceType<?>)this.getOutputSchema().findChoiceType(this.field34802));
    }
    
    public final <K> TypeRewriteRule method28313(final String s, final TaggedChoice$TaggedChoiceType<K> taggedChoice$TaggedChoiceType, final TaggedChoice$TaggedChoiceType<?> taggedChoice$TaggedChoiceType2) {
        if (taggedChoice$TaggedChoiceType.getKeyType() == taggedChoice$TaggedChoiceType2.getKeyType()) {
            return this.fixTypeEverywhere(s, (Type)taggedChoice$TaggedChoiceType, (Type)taggedChoice$TaggedChoiceType2, p1 -> pair -> {
                if (taggedChoice$TaggedChoiceType3.hasType(pair.getFirst())) {
                    return pair;
                }
                else {
                    new IllegalArgumentException(String.format("Unknown type %s in %s ", pair.getFirst(), this.field34802));
                    throw;
                }
            });
        }
        throw new IllegalStateException("Could not inject: key type is not the same");
    }
}

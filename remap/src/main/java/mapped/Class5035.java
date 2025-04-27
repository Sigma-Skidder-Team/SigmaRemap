// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public abstract class Class5035 extends DataFix
{
    public final String field21580;
    
    public Class5035(final String field21580, final Schema schema, final boolean b) {
        super(schema, b);
        this.field21580 = field21580;
    }
    
    public TypeRewriteRule makeRule() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   mapped/Class5035.getInputSchema:()Lcom/mojang/datafixers/schemas/Schema;
        //     4: getstatic       mapped/Class9451.field40626:Lcom/mojang/datafixers/DSL$TypeReference;
        //     7: invokevirtual   com/mojang/datafixers/schemas/Schema.findChoiceType:(Lcom/mojang/datafixers/DSL$TypeReference;)Lcom/mojang/datafixers/types/templates/TaggedChoice$TaggedChoiceType;
        //    10: astore_3       
        //    11: aload_0        
        //    12: invokevirtual   mapped/Class5035.getOutputSchema:()Lcom/mojang/datafixers/schemas/Schema;
        //    15: getstatic       mapped/Class9451.field40626:Lcom/mojang/datafixers/DSL$TypeReference;
        //    18: invokevirtual   com/mojang/datafixers/schemas/Schema.findChoiceType:(Lcom/mojang/datafixers/DSL$TypeReference;)Lcom/mojang/datafixers/types/templates/TaggedChoice$TaggedChoiceType;
        //    21: astore          4
        //    23: aload_0        
        //    24: aload_0        
        //    25: getfield        mapped/Class5035.field21580:Ljava/lang/String;
        //    28: aload_3        
        //    29: aload           4
        //    31: aload_0        
        //    32: aload_3        
        //    33: aload           4
        //    35: invokedynamic   BootstrapMethod #0, apply:(Lmapped/Class5035;Lcom/mojang/datafixers/types/templates/TaggedChoice$TaggedChoiceType;Lcom/mojang/datafixers/types/templates/TaggedChoice$TaggedChoiceType;)Ljava/util/function/Function;
        //    40: invokevirtual   mapped/Class5035.fixTypeEverywhere:(Ljava/lang/String;Lcom/mojang/datafixers/types/Type;Lcom/mojang/datafixers/types/Type;Ljava/util/function/Function;)Lcom/mojang/datafixers/TypeRewriteRule;
        //    43: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Could not infer any expression.
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:382)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private <A> Typed<A> method15325(final Object o, final DynamicOps<?> dynamicOps, final Type<A> type) {
        return (Typed<A>)new Typed(type, dynamicOps, o);
    }
    
    public abstract Pair<String, Typed<?>> method15324(final String p0, final Typed<?> p1);
}

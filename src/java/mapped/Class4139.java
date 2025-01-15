// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import java.util.function.Function;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public abstract class Class4139 extends DataFix
{
    private final String field18261;
    
    public Class4139(final String field18261, final Schema schema, final boolean b) {
        super(schema, b);
        this.field18261 = field18261;
    }
    
    public TypeRewriteRule makeRule() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   mapped/Class4139.getInputSchema:()Lcom/mojang/datafixers/schemas/Schema;
        //     4: getstatic       mapped/Class9451.field40626:Lcom/mojang/datafixers/DSL$TypeReference;
        //     7: invokevirtual   com/mojang/datafixers/schemas/Schema.findChoiceType:(Lcom/mojang/datafixers/DSL$TypeReference;)Lcom/mojang/datafixers/types/templates/TaggedChoice$TaggedChoiceType;
        //    10: astore_3       
        //    11: aload_0        
        //    12: invokevirtual   mapped/Class4139.getOutputSchema:()Lcom/mojang/datafixers/schemas/Schema;
        //    15: getstatic       mapped/Class9451.field40626:Lcom/mojang/datafixers/DSL$TypeReference;
        //    18: invokevirtual   com/mojang/datafixers/schemas/Schema.findChoiceType:(Lcom/mojang/datafixers/DSL$TypeReference;)Lcom/mojang/datafixers/types/templates/TaggedChoice$TaggedChoiceType;
        //    21: astore          4
        //    23: getstatic       mapped/Class9451.field40624:Lcom/mojang/datafixers/DSL$TypeReference;
        //    26: invokeinterface com/mojang/datafixers/DSL$TypeReference.typeName:()Ljava/lang/String;
        //    31: invokestatic    com/mojang/datafixers/DSL.namespacedString:()Lcom/mojang/datafixers/types/Type;
        //    34: invokestatic    com/mojang/datafixers/DSL.named:(Ljava/lang/String;Lcom/mojang/datafixers/types/Type;)Lcom/mojang/datafixers/types/Type;
        //    37: astore          5
        //    39: aload_0        
        //    40: invokevirtual   mapped/Class4139.getOutputSchema:()Lcom/mojang/datafixers/schemas/Schema;
        //    43: getstatic       mapped/Class9451.field40624:Lcom/mojang/datafixers/DSL$TypeReference;
        //    46: invokevirtual   com/mojang/datafixers/schemas/Schema.getType:(Lcom/mojang/datafixers/DSL$TypeReference;)Lcom/mojang/datafixers/types/Type;
        //    49: aload           5
        //    51: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    54: ifeq            116
        //    57: aload_0        
        //    58: aload_0        
        //    59: getfield        mapped/Class4139.field18261:Ljava/lang/String;
        //    62: aload_3        
        //    63: aload           4
        //    65: aload_0        
        //    66: aload_3        
        //    67: aload           4
        //    69: invokedynamic   BootstrapMethod #0, apply:(Lmapped/Class4139;Lcom/mojang/datafixers/types/templates/TaggedChoice$TaggedChoiceType;Lcom/mojang/datafixers/types/templates/TaggedChoice$TaggedChoiceType;)Ljava/util/function/Function;
        //    74: invokevirtual   mapped/Class4139.fixTypeEverywhere:(Ljava/lang/String;Lcom/mojang/datafixers/types/Type;Lcom/mojang/datafixers/types/Type;Ljava/util/function/Function;)Lcom/mojang/datafixers/TypeRewriteRule;
        //    77: aload_0        
        //    78: new             Ljava/lang/StringBuilder;
        //    81: dup            
        //    82: invokespecial   java/lang/StringBuilder.<init>:()V
        //    85: aload_0        
        //    86: getfield        mapped/Class4139.field18261:Ljava/lang/String;
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: ldc             " for entity name"
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   100: aload           5
        //   102: aload_0        
        //   103: invokedynamic   BootstrapMethod #1, apply:(Lmapped/Class4139;)Ljava/util/function/Function;
        //   108: invokevirtual   mapped/Class4139.fixTypeEverywhere:(Ljava/lang/String;Lcom/mojang/datafixers/types/Type;Ljava/util/function/Function;)Lcom/mojang/datafixers/TypeRewriteRule;
        //   111: invokestatic    com/mojang/datafixers/TypeRewriteRule.seq:(Lcom/mojang/datafixers/TypeRewriteRule;Lcom/mojang/datafixers/TypeRewriteRule;)Lcom/mojang/datafixers/TypeRewriteRule;
        //   114: areturn        
        //   115: athrow         
        //   116: new             Ljava/lang/IllegalStateException;
        //   119: dup            
        //   120: ldc             "Entity name type is not what was expected."
        //   122: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   125: athrow         
        //   126: athrow         
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
    
    public abstract String method12372(final String p0);
}

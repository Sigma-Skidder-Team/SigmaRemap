// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7030 extends Class7020<Class154>
{
    public Class7030() {
        super(new ResourceLocation("block_state_property"), Class154.class);
    }
    
    public void method21505(final JsonObject jsonObject, final Class154 class154, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("block", Registry.BLOCK.getKey(Class154.method740(class154)).toString());
        jsonObject.add("properties", Class154.method741(class154).method34693());
    }
    
    public Class154 method21506(final JsonObject p0, final JsonDeserializationContext p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: ldc             "block"
        //     7: invokestatic    mapped/Class9583.method35895:(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
        //    10: invokespecial   mapped/Class1932.<init>:(Ljava/lang/String;)V
        //    13: astore          5
        //    15: getstatic       mapped/Class90.field208:Lmapped/Class93;
        //    18: aload           5
        //    20: invokevirtual   mapped/Class93.method506:(Lmapped/Class1932;)Ljava/util/Optional;
        //    23: aload           5
        //    25: invokedynamic   BootstrapMethod #0, get:(Lmapped/Class1932;)Ljava/util/function/Supplier;
        //    30: invokevirtual   java/util/Optional.orElseThrow:(Ljava/util/function/Supplier;)Ljava/lang/Object;
        //    33: checkcast       Lmapped/Class3833;
        //    36: astore          6
        //    38: aload_1        
        //    39: ldc             "properties"
        //    41: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    44: invokestatic    mapped/Class9357.method34692:(Lcom/google/gson/JsonElement;)Lmapped/Class9357;
        //    47: astore          7
        //    49: aload           7
        //    51: aload           6
        //    53: invokevirtual   mapped/Class3833.method11876:()Lmapped/Class9104;
        //    56: aload           6
        //    58: invokedynamic   BootstrapMethod #1, accept:(Lmapped/Class3833;)Ljava/util/function/Consumer;
        //    63: invokevirtual   mapped/Class9357.method34691:(Lmapped/Class9104;Ljava/util/function/Consumer;)V
        //    66: new             Lmapped/Class154;
        //    69: dup            
        //    70: aload           6
        //    72: aload           7
        //    74: aconst_null    
        //    75: invokespecial   mapped/Class154.<init>:(Lmapped/Class3833;Lmapped/Class9357;Lmapped/Class9048;)V
        //    78: areturn        
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
}

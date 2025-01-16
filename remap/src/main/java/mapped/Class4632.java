// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class4632 extends Class4611<Class4236>
{
    private static final ResourceLocation field20098;
    
    @Override
    public ResourceLocation method13717() {
        return Class4632.field20098;
    }
    
    public Class4236 method13811(final JsonObject p0, final JsonDeserializationContext p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    mapped/Class4632.method13812:(Lcom/google/gson/JsonObject;)Lmapped/Class3833;
        //     4: astore          5
        //     6: aload_1        
        //     7: ldc             "state"
        //     9: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    12: invokestatic    mapped/Class9357.method34692:(Lcom/google/gson/JsonElement;)Lmapped/Class9357;
        //    15: astore          6
        //    17: aload           5
        //    19: ifnonnull       35
        //    22: new             Lmapped/Class4236;
        //    25: dup            
        //    26: aload           5
        //    28: aload           6
        //    30: invokespecial   mapped/Class4236.<init>:(Lmapped/Class3833;Lmapped/Class9357;)V
        //    33: areturn        
        //    34: athrow         
        //    35: aload           6
        //    37: aload           5
        //    39: invokevirtual   mapped/Class3833.method11876:()Lmapped/Class9104;
        //    42: aload           5
        //    44: invokedynamic   BootstrapMethod #0, accept:(Lmapped/Class3833;)Ljava/util/function/Consumer;
        //    49: invokevirtual   mapped/Class9357.method34691:(Lmapped/Class9104;Ljava/util/function/Consumer;)V
        //    52: goto            22
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
    
    @Nullable
    private static Block method13812(final JsonObject jsonObject) {
        if (!jsonObject.has("block")) {
            return null;
        }
        return Registry.BLOCK.method506(new ResourceLocation(Class9583.method35895(jsonObject, "block"))).orElseThrow(() -> {
            new JsonSyntaxException("Unknown block type '" + obj + "'");
            return;
        });
    }
    
    public void method13813(final Class513 class513, final BlockState class514) {
        this.method13726(class513.method2957(), class516 -> class516.method12738(class515));
    }
    
    static {
        field20098 = new ResourceLocation("enter_block");
    }
}

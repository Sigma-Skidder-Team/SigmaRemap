// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class4637 extends Class4611<Class4235>
{
    private static final Class1932 field20104;
    
    @Override
    public Class1932 method13717() {
        return Class4637.field20104;
    }
    
    public Class4235 method13834(final JsonObject p0, final JsonDeserializationContext p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    mapped/Class4637.method13835:(Lcom/google/gson/JsonObject;)Lmapped/Class3833;
        //     4: astore          5
        //     6: aload_1        
        //     7: ldc             "state"
        //     9: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    12: invokestatic    mapped/Class9357.method34692:(Lcom/google/gson/JsonElement;)Lmapped/Class9357;
        //    15: astore          6
        //    17: aload           5
        //    19: ifnonnull       61
        //    22: aload_1        
        //    23: ldc             "location"
        //    25: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    28: invokestatic    mapped/Class8697.method29814:(Lcom/google/gson/JsonElement;)Lmapped/Class8697;
        //    31: astore          7
        //    33: aload_1        
        //    34: ldc             "item"
        //    36: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    39: invokestatic    mapped/Class9342.method34628:(Lcom/google/gson/JsonElement;)Lmapped/Class9342;
        //    42: astore          8
        //    44: new             Lmapped/Class4235;
        //    47: dup            
        //    48: aload           5
        //    50: aload           6
        //    52: aload           7
        //    54: aload           8
        //    56: invokespecial   mapped/Class4235.<init>:(Lmapped/Class3833;Lmapped/Class9357;Lmapped/Class8697;Lmapped/Class9342;)V
        //    59: areturn        
        //    60: athrow         
        //    61: aload           6
        //    63: aload           5
        //    65: invokevirtual   mapped/Class3833.method11876:()Lmapped/Class9104;
        //    68: aload           5
        //    70: invokedynamic   BootstrapMethod #0, accept:(Lmapped/Class3833;)Ljava/util/function/Consumer;
        //    75: invokevirtual   mapped/Class9357.method34691:(Lmapped/Class9104;Ljava/util/function/Consumer;)V
        //    78: goto            22
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
    private static Class3833 method13835(final JsonObject jsonObject) {
        if (!jsonObject.has("block")) {
            return null;
        }
        return Class90.field208.method506(new Class1932(Class9583.method35895(jsonObject, "block"))).orElseThrow(() -> {
            new JsonSyntaxException("Unknown block type '" + obj + "'");
            return;
        });
    }
    
    public void method13836(final Class513 class517, final BlockPos class514, final ItemStack class515) {
        this.method13726(class517.method2957(), class522 -> {
            class517.method2940().method6701(class519);
            return class522.method12736(class516, class518, class520.method2940(), class521);
        });
    }
    
    static {
        field20104 = new Class1932("placed_block");
    }
}

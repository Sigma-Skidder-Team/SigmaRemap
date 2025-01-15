// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.ITextComponent;

public class Class6517
{
    private static final SimpleCommandExceptionType field25937;
    
    public static void method19665(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)Class7788.method25001("tm").redirect((CommandNode)commandDispatcher.register((LiteralArgumentBuilder)Class7788.method25001("teammsg").then(Class7788.method25002("message", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8695.method29806()).executes(commandContext -> method19666((Class7492)commandContext.getSource(), Class8695.method29807((CommandContext<Class7492>)commandContext, "message")))))));
    }
    
    private static int method19666(final Class7492 p0, final ITextComponent p1) throws CommandSyntaxException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   mapped/Class7492.method23252:()Lmapped/Class399;
        //     4: astore          4
        //     6: aload           4
        //     8: invokevirtual   mapped/Class399.method1825:()Lmapped/Class6750;
        //    11: checkcast       Lmapped/Class6749;
        //    14: astore          5
        //    16: aload           5
        //    18: ifnull          60
        //    21: invokedynamic   BootstrapMethod #1, accept:()Ljava/util/function/Consumer;
        //    26: astore          6
        //    28: aload           5
        //    30: invokevirtual   mapped/Class6749.method20541:()Lmapped/Class2250;
        //    33: aload           6
        //    35: invokeinterface mapped/Class2250.method8467:(Ljava/util/function/Consumer;)Lmapped/Class2250;
        //    40: astore          7
        //    42: aload           7
        //    44: invokeinterface mapped/Class2250.method8462:()Ljava/util/List;
        //    49: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    54: astore          8
        //    56: goto            68
        //    59: athrow         
        //    60: getstatic       mapped/Class6517.field25937:Lcom/mojang/brigadier/exceptions/SimpleCommandExceptionType;
        //    63: invokevirtual   com/mojang/brigadier/exceptions/SimpleCommandExceptionType.create:()Lcom/mojang/brigadier/exceptions/CommandSyntaxException;
        //    66: athrow         
        //    67: athrow         
        //    68: aload           8
        //    70: invokeinterface java/util/Iterator.hasNext:()Z
        //    75: ifne            103
        //    78: aload_0        
        //    79: invokevirtual   mapped/Class7492.method23255:()Lmapped/Class394;
        //    82: invokevirtual   mapped/Class394.method1537:()Lmapped/Class6765;
        //    85: invokevirtual   mapped/Class6765.method20623:()Ljava/util/List;
        //    88: astore          8
        //    90: aload           8
        //    92: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    97: astore          9
        //    99: goto            129
        //   102: athrow         
        //   103: aload           8
        //   105: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   110: checkcast       Lmapped/Class2250;
        //   113: astore          9
        //   115: aload           9
        //   117: aload           6
        //   119: invokeinterface mapped/Class2250.method8467:(Ljava/util/function/Consumer;)Lmapped/Class2250;
        //   124: pop            
        //   125: goto            68
        //   128: athrow         
        //   129: aload           9
        //   131: invokeinterface java/util/Iterator.hasNext:()Z
        //   136: ifne            148
        //   139: aload           8
        //   141: invokeinterface java/util/List.size:()I
        //   146: ireturn        
        //   147: athrow         
        //   148: aload           9
        //   150: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   155: checkcast       Lmapped/Class513;
        //   158: astore          10
        //   160: aload           10
        //   162: aload           4
        //   164: if_acmpeq       181
        //   167: aload           10
        //   169: invokevirtual   mapped/Class513.method1825:()Lmapped/Class6750;
        //   172: aload           5
        //   174: if_acmpeq       224
        //   177: goto            129
        //   180: athrow         
        //   181: aload           10
        //   183: new             Lmapped/Class2259;
        //   186: dup            
        //   187: ldc             "chat.type.team.sent"
        //   189: iconst_3       
        //   190: anewarray       Ljava/lang/Object;
        //   193: dup            
        //   194: iconst_0       
        //   195: aload           7
        //   197: aastore        
        //   198: dup            
        //   199: iconst_1       
        //   200: aload_0        
        //   201: invokevirtual   mapped/Class7492.method23247:()Lmapped/Class2250;
        //   204: aastore        
        //   205: dup            
        //   206: iconst_2       
        //   207: aload_1        
        //   208: invokeinterface mapped/Class2250.method8466:()Lmapped/Class2250;
        //   213: aastore        
        //   214: invokespecial   mapped/Class2259.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   217: invokevirtual   mapped/Class513.method1494:(Lmapped/Class2250;)V
        //   220: goto            177
        //   223: athrow         
        //   224: aload           10
        //   226: new             Lmapped/Class2259;
        //   229: dup            
        //   230: ldc             "chat.type.team.text"
        //   232: iconst_3       
        //   233: anewarray       Ljava/lang/Object;
        //   236: dup            
        //   237: iconst_0       
        //   238: aload           7
        //   240: aastore        
        //   241: dup            
        //   242: iconst_1       
        //   243: aload_0        
        //   244: invokevirtual   mapped/Class7492.method23247:()Lmapped/Class2250;
        //   247: aastore        
        //   248: dup            
        //   249: iconst_2       
        //   250: aload_1        
        //   251: invokeinterface mapped/Class2250.method8466:()Lmapped/Class2250;
        //   256: aastore        
        //   257: invokespecial   mapped/Class2259.<init>:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   260: invokevirtual   mapped/Class513.method1494:(Lmapped/Class2250;)V
        //   263: goto            177
        //    Exceptions:
        //  throws com.mojang.brigadier.exceptions.CommandSyntaxException
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
    
    static {
        field25937 = new SimpleCommandExceptionType((Message)new Class2259("commands.teammsg.failed.noteam", new Object[0]));
    }
}

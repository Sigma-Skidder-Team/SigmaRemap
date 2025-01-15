// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;
import java.util.Map;
import java.lang.reflect.InvocationHandler;

public class CallbackReference$NativeFunctionHandler implements InvocationHandler
{
    private final Function function;
    private final Map<String, ?> options;
    
    public CallbackReference$NativeFunctionHandler(final Pointer address, final int callingConvention, final Map<String, ?> options) {
        this.options = options;
        this.function = new Function(address, callingConvention, (String)options.get("string-encoding"));
    }
    
    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_2         /* method */
        //     4: invokevirtual   java/lang/reflect/Method.equals:(Ljava/lang/Object;)Z
        //     7: ifeq            98
        //    10: new             Ljava/lang/StringBuilder;
        //    13: dup            
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: ldc             "Proxy interface to "
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: aload_0         /* this */
        //    23: getfield        com/sun/jna/CallbackReference$NativeFunctionHandler.function:Lcom/sun/jna/Function;
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    29: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    32: astore          6
        //    34: aload_0         /* this */
        //    35: getfield        com/sun/jna/CallbackReference$NativeFunctionHandler.options:Ljava/util/Map;
        //    38: ldc             "invoking-method"
        //    40: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    45: checkcast       Ljava/lang/reflect/Method;
        //    48: astore          7
        //    50: aload           7
        //    52: invokevirtual   java/lang/reflect/Method.getDeclaringClass:()Ljava/lang/Class;
        //    55: invokestatic    com/sun/jna/CallbackReference.findCallbackClass:(Ljava/lang/Class;)Ljava/lang/Class;
        //    58: astore          8
        //    60: new             Ljava/lang/StringBuilder;
        //    63: dup            
        //    64: invokespecial   java/lang/StringBuilder.<init>:()V
        //    67: aload           m
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: ldc             " ("
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: aload           8
        //    79: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: ldc             ")"
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    93: astore          m
        //    95: aload           m
        //    97: areturn        
        //    98: getstatic       com/sun/jna/Library$Handler.OBJECT_HASHCODE:Ljava/lang/reflect/Method;
        //   101: aload_2         /* method */
        //   102: invokevirtual   java/lang/reflect/Method.equals:(Ljava/lang/Object;)Z
        //   105: ifeq            116
        //   108: aload_0         /* this */
        //   109: invokevirtual   java/lang/Object.hashCode:()I
        //   112: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   115: areturn        
        //   116: getstatic       com/sun/jna/Library$Handler.OBJECT_EQUALS:Ljava/lang/reflect/Method;
        //   119: aload_2         /* method */
        //   120: invokevirtual   java/lang/reflect/Method.equals:(Ljava/lang/Object;)Z
        //   123: ifeq            169
        //   126: aload_3         /* args */
        //   127: iconst_0       
        //   128: aaload         
        //   129: astore          6
        //   131: aload           6
        //   133: ifnull          165
        //   136: aload           6
        //   138: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   141: invokestatic    java/lang/reflect/Proxy.isProxyClass:(Ljava/lang/Class;)Z
        //   144: ifeq            165
        //   147: aload           6
        //   149: invokestatic    java/lang/reflect/Proxy.getInvocationHandler:(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
        //   152: aload_0         /* this */
        //   153: if_acmpne       160
        //   156: iconst_1       
        //   157: goto            161
        //   160: iconst_0       
        //   161: invokestatic    com/sun/jna/Function.valueOf:(Z)Ljava/lang/Boolean;
        //   164: areturn        
        //   165: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   168: areturn        
        //   169: aload_2         /* method */
        //   170: invokestatic    com/sun/jna/Function.isVarArgs:(Ljava/lang/reflect/Method;)Z
        //   173: ifeq            181
        //   176: aload_3         /* args */
        //   177: invokestatic    com/sun/jna/Function.concatenateVarArgs:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   180: astore_3        /* args */
        //   181: aload_0         /* this */
        //   182: getfield        com/sun/jna/CallbackReference$NativeFunctionHandler.function:Lcom/sun/jna/Function;
        //   185: aload_2         /* method */
        //   186: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   189: aload_3         /* args */
        //   190: aload_0         /* this */
        //   191: getfield        com/sun/jna/CallbackReference$NativeFunctionHandler.options:Ljava/util/Map;
        //   194: invokevirtual   com/sun/jna/Function.invoke:(Ljava/lang/Class;[Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
        //   197: areturn        
        //    Exceptions:
        //  throws java.lang.Throwable
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Cannot read field "references" because "newVariable" is null
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2945)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public Pointer getPointer() {
        return this.function;
    }
}

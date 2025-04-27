// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;

public class CallbackReference$DefaultCallbackProxy implements CallbackProxy
{
    private final Method callbackMethod;
    private final ToNativeConverter toNative;
    private final FromNativeConverter[] fromNative;
    private final String encoding;
    public final /* synthetic */ CallbackReference this$0;
    
    public CallbackReference$DefaultCallbackProxy(final CallbackReference p0, final Method callbackMethod, final TypeMapper mapper, final String encoding) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: putfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.this$0:Lcom/sun/jna/CallbackReference;
        //     5: aload_0         /* this */
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_0         /* this */
        //    10: aload_2         /* callbackMethod */
        //    11: putfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.callbackMethod:Ljava/lang/reflect/Method;
        //    14: aload_0         /* this */
        //    15: aload           encoding
        //    17: putfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.encoding:Ljava/lang/String;
        //    20: aload_2         /* callbackMethod */
        //    21: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //    24: astore          7
        //    26: aload_2         /* callbackMethod */
        //    27: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //    30: astore          8
        //    32: aload_0         /* this */
        //    33: aload           returnType
        //    35: arraylength    
        //    36: anewarray       Lcom/sun/jna/FromNativeConverter;
        //    39: putfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.fromNative:[Lcom/sun/jna/FromNativeConverter;
        //    42: ldc             Lcom/sun/jna/NativeMapped;.class
        //    44: aload           8
        //    46: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    49: ifeq            64
        //    52: aload_0         /* this */
        //    53: aload           8
        //    55: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //    58: putfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.toNative:Lcom/sun/jna/ToNativeConverter;
        //    61: goto            80
        //    64: aload_3         /* mapper */
        //    65: ifnull          80
        //    68: aload_0         /* this */
        //    69: aload_3         /* mapper */
        //    70: aload           8
        //    72: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //    77: putfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.toNative:Lcom/sun/jna/ToNativeConverter;
        //    80: iconst_0       
        //    81: istore          9
        //    83: iload           9
        //    85: aload_0         /* this */
        //    86: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.fromNative:[Lcom/sun/jna/FromNativeConverter;
        //    89: arraylength    
        //    90: if_icmpge       156
        //    93: ldc             Lcom/sun/jna/NativeMapped;.class
        //    95: aload           returnType
        //    97: iload           9
        //    99: aaload         
        //   100: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   103: ifeq            128
        //   106: aload_0         /* this */
        //   107: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.fromNative:[Lcom/sun/jna/FromNativeConverter;
        //   110: iload           9
        //   112: new             Lcom/sun/jna/NativeMappedConverter;
        //   115: dup            
        //   116: aload           returnType
        //   118: iload           9
        //   120: aaload         
        //   121: invokespecial   com/sun/jna/NativeMappedConverter.<init>:(Ljava/lang/Class;)V
        //   124: aastore        
        //   125: goto            150
        //   128: aload_3         /* mapper */
        //   129: ifnull          150
        //   132: aload_0         /* this */
        //   133: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.fromNative:[Lcom/sun/jna/FromNativeConverter;
        //   136: iload           9
        //   138: aload_3         /* mapper */
        //   139: aload           returnType
        //   141: iload           9
        //   143: aaload         
        //   144: invokeinterface com/sun/jna/TypeMapper.getFromNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/FromNativeConverter;
        //   149: aastore        
        //   150: iinc            9, 1
        //   153: goto            83
        //   156: aload_2         /* callbackMethod */
        //   157: invokevirtual   java/lang/reflect/Method.isAccessible:()Z
        //   160: ifne            200
        //   163: aload_2         /* callbackMethod */
        //   164: iconst_1       
        //   165: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //   168: goto            200
        //   171: astore          9
        //   173: new             Ljava/lang/IllegalArgumentException;
        //   176: dup            
        //   177: new             Ljava/lang/StringBuilder;
        //   180: dup            
        //   181: invokespecial   java/lang/StringBuilder.<init>:()V
        //   184: ldc             "Callback method is inaccessible, make sure the interface is public: "
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: aload_2         /* callbackMethod */
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   193: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   196: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   199: athrow         
        //   200: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  163    168    171    200    Ljava/lang/SecurityException;
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public Callback getCallback() {
        return CallbackReference.access$000(this.this$0);
    }
    
    private Object invokeCallback(final Object[] args) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.callbackMethod:Ljava/lang/reflect/Method;
        //     4: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //     7: astore          4
        //     9: aload_1         /* args */
        //    10: arraylength    
        //    11: anewarray       Ljava/lang/Object;
        //    14: astore          5
        //    16: iconst_0       
        //    17: istore          6
        //    19: iload           6
        //    21: aload_1         /* args */
        //    22: arraylength    
        //    23: if_icmpge       110
        //    26: aload           callbackArgs
        //    28: iload           6
        //    30: aaload         
        //    31: astore          7
        //    33: aload_1         /* args */
        //    34: iload           type
        //    36: aaload         
        //    37: astore          8
        //    39: aload_0         /* this */
        //    40: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.fromNative:[Lcom/sun/jna/FromNativeConverter;
        //    43: iload           type
        //    45: aaload         
        //    46: ifnull          91
        //    49: new             Lcom/sun/jna/CallbackParameterContext;
        //    52: dup            
        //    53: aload           arg
        //    55: aload_0         /* this */
        //    56: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.callbackMethod:Ljava/lang/reflect/Method;
        //    59: aload_1         /* args */
        //    60: iload           type
        //    62: invokespecial   com/sun/jna/CallbackParameterContext.<init>:(Ljava/lang/Class;Ljava/lang/reflect/Method;[Ljava/lang/Object;I)V
        //    65: astore          9
        //    67: aload           i
        //    69: iload           type
        //    71: aload_0         /* this */
        //    72: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.fromNative:[Lcom/sun/jna/FromNativeConverter;
        //    75: iload           type
        //    77: aaload         
        //    78: aload           context
        //    80: aload           9
        //    82: invokeinterface com/sun/jna/FromNativeConverter.fromNative:(Ljava/lang/Object;Lcom/sun/jna/FromNativeContext;)Ljava/lang/Object;
        //    87: aastore        
        //    88: goto            104
        //    91: aload           i
        //    93: iload           type
        //    95: aload_0         /* this */
        //    96: aload           8
        //    98: aload           arg
        //   100: invokespecial   com/sun/jna/CallbackReference$DefaultCallbackProxy.convertArgument:(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
        //   103: aastore        
        //   104: iinc            type, 1
        //   107: goto            19
        //   110: aconst_null    
        //   111: astore          6
        //   113: aload_0         /* this */
        //   114: invokevirtual   com/sun/jna/CallbackReference$DefaultCallbackProxy.getCallback:()Lcom/sun/jna/Callback;
        //   117: astore          7
        //   119: aload           7
        //   121: ifnull          195
        //   124: aload_0         /* this */
        //   125: aload_0         /* this */
        //   126: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.callbackMethod:Ljava/lang/reflect/Method;
        //   129: aload           7
        //   131: aload           result
        //   133: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   136: invokespecial   com/sun/jna/CallbackReference$DefaultCallbackProxy.convertResult:(Ljava/lang/Object;)Ljava/lang/Object;
        //   139: astore          cb
        //   141: goto            195
        //   144: astore          8
        //   146: invokestatic    com/sun/jna/Native.getCallbackExceptionHandler:()Lcom/sun/jna/Callback$UncaughtExceptionHandler;
        //   149: aload           e
        //   151: aload           8
        //   153: invokeinterface com/sun/jna/Callback$UncaughtExceptionHandler.uncaughtException:(Lcom/sun/jna/Callback;Ljava/lang/Throwable;)V
        //   158: goto            195
        //   161: astore          8
        //   163: invokestatic    com/sun/jna/Native.getCallbackExceptionHandler:()Lcom/sun/jna/Callback$UncaughtExceptionHandler;
        //   166: aload           e
        //   168: aload           8
        //   170: invokeinterface com/sun/jna/Callback$UncaughtExceptionHandler.uncaughtException:(Lcom/sun/jna/Callback;Ljava/lang/Throwable;)V
        //   175: goto            195
        //   178: astore          8
        //   180: invokestatic    com/sun/jna/Native.getCallbackExceptionHandler:()Lcom/sun/jna/Callback$UncaughtExceptionHandler;
        //   183: aload           e
        //   185: aload           8
        //   187: invokevirtual   java/lang/reflect/InvocationTargetException.getTargetException:()Ljava/lang/Throwable;
        //   190: invokeinterface com/sun/jna/Callback$UncaughtExceptionHandler.uncaughtException:(Lcom/sun/jna/Callback;Ljava/lang/Throwable;)V
        //   195: iconst_0       
        //   196: istore          8
        //   198: iload           8
        //   200: aload           result
        //   202: arraylength    
        //   203: if_icmpge       245
        //   206: aload           result
        //   208: iload           8
        //   210: aaload         
        //   211: instanceof      Lcom/sun/jna/Structure;
        //   214: ifeq            239
        //   217: aload           result
        //   219: iload           8
        //   221: aaload         
        //   222: instanceof      Lcom/sun/jna/Structure$ByValue;
        //   225: ifne            239
        //   228: aload           result
        //   230: iload           8
        //   232: aaload         
        //   233: checkcast       Lcom/sun/jna/Structure;
        //   236: invokevirtual   com/sun/jna/Structure.autoWrite:()V
        //   239: iinc            8, 1
        //   242: goto            198
        //   245: aload           cb
        //   247: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  124    141    144    161    Ljava/lang/IllegalArgumentException;
        //  124    141    161    178    Ljava/lang/IllegalAccessException;
        //  124    141    178    195    Ljava/lang/reflect/InvocationTargetException;
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
    
    @Override
    public Object callback(final Object[] args) {
        try {
            return this.invokeCallback(args);
        }
        catch (final Throwable t) {
            Native.getCallbackExceptionHandler().uncaughtException(this.getCallback(), t);
            return null;
        }
    }
    
    private Object convertArgument(final Object value, final Class<?> dstType) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lcom/sun/jna/Pointer;
        //     4: ifeq            209
        //     7: aload_2         /* dstType */
        //     8: ldc             Ljava/lang/String;.class
        //    10: if_acmpne       29
        //    13: aload_1         /* value */
        //    14: checkcast       Lcom/sun/jna/Pointer;
        //    17: lconst_0       
        //    18: aload_0         /* this */
        //    19: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.encoding:Ljava/lang/String;
        //    22: invokevirtual   com/sun/jna/Pointer.getString:(JLjava/lang/String;)Ljava/lang/String;
        //    25: astore_1        /* value */
        //    26: goto            249
        //    29: aload_2         /* dstType */
        //    30: ldc             Lcom/sun/jna/WString;.class
        //    32: if_acmpne       54
        //    35: new             Lcom/sun/jna/WString;
        //    38: dup            
        //    39: aload_1         /* value */
        //    40: checkcast       Lcom/sun/jna/Pointer;
        //    43: lconst_0       
        //    44: invokevirtual   com/sun/jna/Pointer.getWideString:(J)Ljava/lang/String;
        //    47: invokespecial   com/sun/jna/WString.<init>:(Ljava/lang/String;)V
        //    50: astore_1        /* value */
        //    51: goto            249
        //    54: aload_2         /* dstType */
        //    55: ldc             [Ljava/lang/String;.class
        //    57: if_acmpne       76
        //    60: aload_1         /* value */
        //    61: checkcast       Lcom/sun/jna/Pointer;
        //    64: lconst_0       
        //    65: aload_0         /* this */
        //    66: getfield        com/sun/jna/CallbackReference$DefaultCallbackProxy.encoding:Ljava/lang/String;
        //    69: invokevirtual   com/sun/jna/Pointer.getStringArray:(JLjava/lang/String;)[Ljava/lang/String;
        //    72: astore_1        /* value */
        //    73: goto            249
        //    76: aload_2         /* dstType */
        //    77: ldc             [Lcom/sun/jna/WString;.class
        //    79: if_acmpne       94
        //    82: aload_1         /* value */
        //    83: checkcast       Lcom/sun/jna/Pointer;
        //    86: lconst_0       
        //    87: invokevirtual   com/sun/jna/Pointer.getWideStringArray:(J)[Ljava/lang/String;
        //    90: astore_1        /* value */
        //    91: goto            249
        //    94: ldc             Lcom/sun/jna/Callback;.class
        //    96: aload_2         /* dstType */
        //    97: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   100: ifeq            115
        //   103: aload_2         /* dstType */
        //   104: aload_1         /* value */
        //   105: checkcast       Lcom/sun/jna/Pointer;
        //   108: invokestatic    com/sun/jna/CallbackReference.getCallback:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Callback;
        //   111: astore_1        /* value */
        //   112: goto            249
        //   115: ldc             Lcom/sun/jna/Structure;.class
        //   117: aload_2         /* dstType */
        //   118: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   121: ifeq            249
        //   124: ldc             Lcom/sun/jna/Structure$ByValue;.class
        //   126: aload_2         /* dstType */
        //   127: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   130: ifeq            188
        //   133: aload_2         /* dstType */
        //   134: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;)Lcom/sun/jna/Structure;
        //   137: astore          5
        //   139: aload           5
        //   141: invokevirtual   com/sun/jna/Structure.size:()I
        //   144: newarray        B
        //   146: astore          6
        //   148: aload_1         /* value */
        //   149: checkcast       Lcom/sun/jna/Pointer;
        //   152: lconst_0       
        //   153: aload           6
        //   155: iconst_0       
        //   156: aload           6
        //   158: arraylength    
        //   159: invokevirtual   com/sun/jna/Pointer.read:(J[BII)V
        //   162: aload           buf
        //   164: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //   167: lconst_0       
        //   168: aload           6
        //   170: iconst_0       
        //   171: aload           6
        //   173: arraylength    
        //   174: invokevirtual   com/sun/jna/Pointer.write:(J[BII)V
        //   177: aload           buf
        //   179: invokevirtual   com/sun/jna/Structure.read:()V
        //   182: aload           buf
        //   184: astore_1        /* value */
        //   185: goto            249
        //   188: aload_2         /* dstType */
        //   189: aload_1         /* value */
        //   190: checkcast       Lcom/sun/jna/Pointer;
        //   193: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //   196: astore          5
        //   198: aload           5
        //   200: invokevirtual   com/sun/jna/Structure.conditionalAutoRead:()V
        //   203: aload           5
        //   205: astore_1        /* value */
        //   206: goto            249
        //   209: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   212: aload_2         /* dstType */
        //   213: if_acmpeq       223
        //   216: ldc_w           Ljava/lang/Boolean;.class
        //   219: aload_2         /* dstType */
        //   220: if_acmpne       249
        //   223: aload_1         /* value */
        //   224: instanceof      Ljava/lang/Number;
        //   227: ifeq            249
        //   230: aload_1         /* value */
        //   231: checkcast       Ljava/lang/Number;
        //   234: invokevirtual   java/lang/Number.intValue:()I
        //   237: ifeq            244
        //   240: iconst_1       
        //   241: goto            245
        //   244: iconst_0       
        //   245: invokestatic    com/sun/jna/Function.valueOf:(Z)Ljava/lang/Boolean;
        //   248: astore_1        /* value */
        //   249: aload_1         /* value */
        //   250: areturn        
        //    Signature:
        //  (Ljava/lang/Object;Ljava/lang/Class<*>;)Ljava/lang/Object;
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
    
    private Object convertResult(Object value) {
        if (this.toNative != null) {
            value = this.toNative.toNative(value, new CallbackResultContext(this.callbackMethod));
        }
        if (value == null) {
            return null;
        }
        final Class<?> class1 = value.getClass();
        if (Structure.class.isAssignableFrom(class1)) {
            if (Structure$ByValue.class.isAssignableFrom(class1)) {
                return value;
            }
            return ((Structure)value).getPointer();
        }
        else {
            if (class1 == Boolean.TYPE || class1 == Boolean.class) {
                return Boolean.TRUE.equals(value) ? Function.INTEGER_TRUE : Function.INTEGER_FALSE;
            }
            if (class1 == String.class || class1 == WString.class) {
                return CallbackReference.access$100(value, class1 == WString.class);
            }
            if (class1 == String[].class || class1 == WString.class) {
                final StringArray stringArray = (class1 == String[].class) ? new StringArray((String[])value, this.encoding) : new StringArray((WString[])value);
                CallbackReference.allocations.put(value, stringArray);
                return stringArray;
            }
            if (Callback.class.isAssignableFrom(class1)) {
                return CallbackReference.getFunctionPointer((Callback)value);
            }
            return value;
        }
    }
    
    @Override
    public Class<?>[] getParameterTypes() {
        return this.callbackMethod.getParameterTypes();
    }
    
    @Override
    public Class<?> getReturnType() {
        return this.callbackMethod.getReturnType();
    }
}

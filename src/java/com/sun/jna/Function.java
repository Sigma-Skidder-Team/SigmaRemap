// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

public class Function extends Pointer
{
    public static final int MAX_NARGS = 256;
    public static final int C_CONVENTION = 0;
    public static final int ALT_CONVENTION = 63;
    private static final int MASK_CC = 63;
    public static final int THROW_LAST_ERROR = 64;
    public static final int USE_VARARGS = 384;
    public static final Integer INTEGER_TRUE;
    public static final Integer INTEGER_FALSE;
    private NativeLibrary library;
    private final String functionName;
    public final String encoding;
    public final int callFlags;
    public final Map<String, ?> options;
    public static final String OPTION_INVOKING_METHOD = "invoking-method";
    private static final VarArgsChecker IS_VARARGS;
    
    public static Function getFunction(final String libraryName, final String functionName) {
        return NativeLibrary.getInstance(libraryName).getFunction(functionName);
    }
    
    public static Function getFunction(final String libraryName, final String functionName, final int callFlags) {
        return NativeLibrary.getInstance(libraryName).getFunction(functionName, callFlags, null);
    }
    
    public static Function getFunction(final String libraryName, final String functionName, final int callFlags, final String encoding) {
        return NativeLibrary.getInstance(libraryName).getFunction(functionName, callFlags, encoding);
    }
    
    public static Function getFunction(final Pointer p) {
        return getFunction(p, 0, null);
    }
    
    public static Function getFunction(final Pointer p, final int callFlags) {
        return getFunction(p, callFlags, null);
    }
    
    public static Function getFunction(final Pointer p, final int callFlags, final String encoding) {
        return new Function(p, callFlags, encoding);
    }
    
    public Function(final NativeLibrary library, final String functionName, final int callFlags, final String encoding) {
        this.checkCallingConvention(callFlags & 0x3F);
        if (functionName == null) {
            throw new NullPointerException("Function name must not be null");
        }
        this.library = library;
        this.functionName = functionName;
        this.callFlags = callFlags;
        this.options = library.options;
        this.encoding = ((encoding != null) ? encoding : Native.getDefaultStringEncoding());
        try {
            this.peer = library.getSymbolAddress(functionName);
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            throw new UnsatisfiedLinkError("Error looking up function '" + functionName + "': " + unsatisfiedLinkError.getMessage());
        }
    }
    
    public Function(final Pointer functionAddress, final int callFlags, final String encoding) {
        this.checkCallingConvention(callFlags & 0x3F);
        if (functionAddress == null || functionAddress.peer == 0L) {
            throw new NullPointerException("Function address may not be null");
        }
        this.functionName = functionAddress.toString();
        this.callFlags = callFlags;
        this.peer = functionAddress.peer;
        this.options = Collections.EMPTY_MAP;
        this.encoding = ((encoding != null) ? encoding : Native.getDefaultStringEncoding());
    }
    
    private void checkCallingConvention(final int convention) throws IllegalArgumentException {
        if ((convention & 0x3F) != convention) {
            throw new IllegalArgumentException("Unrecognized calling convention: " + convention);
        }
    }
    
    public String getName() {
        return this.functionName;
    }
    
    public int getCallingConvention() {
        return this.callFlags & 0x3F;
    }
    
    public Object invoke(final Class<?> returnType, final Object[] inArgs) {
        return this.invoke(returnType, inArgs, this.options);
    }
    
    public Object invoke(final Class<?> returnType, final Object[] inArgs, final Map<String, ?> options) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "invoking-method"
        //     3: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //     8: checkcast       Ljava/lang/reflect/Method;
        //    11: astore          6
        //    13: aload           6
        //    15: ifnull          26
        //    18: aload           6
        //    20: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //    23: goto            27
        //    26: aconst_null    
        //    27: astore          7
        //    29: aload_0         /* this */
        //    30: aload           paramTypes
        //    32: aload           7
        //    34: aload_1         /* returnType */
        //    35: aload_2         /* inArgs */
        //    36: aload_3         /* options */
        //    37: invokevirtual   com/sun/jna/Function.invoke:(Ljava/lang/reflect/Method;[Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
        //    40: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;[Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;*>;)Ljava/lang/Object;
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
    
    public Object invoke(final Method invokingMethod, final Class<?>[] paramTypes, final Class<?> returnType, final Object[] inArgs, final Map<String, ?> options) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: anewarray       Ljava/lang/Object;
        //     4: astore          8
        //     6: aload           inArgs
        //     8: ifnull          50
        //    11: aload           inArgs
        //    13: arraylength    
        //    14: sipush          256
        //    17: if_icmple       30
        //    20: new             Ljava/lang/UnsupportedOperationException;
        //    23: dup            
        //    24: ldc             "Maximum argument count is 256"
        //    26: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //    29: athrow         
        //    30: aload           inArgs
        //    32: arraylength    
        //    33: anewarray       Ljava/lang/Object;
        //    36: astore          8
        //    38: aload           inArgs
        //    40: iconst_0       
        //    41: aload           8
        //    43: iconst_0       
        //    44: aload           8
        //    46: arraylength    
        //    47: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    50: aload           options
        //    52: ldc             "type-mapper"
        //    54: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    59: checkcast       Lcom/sun/jna/TypeMapper;
        //    62: astore          9
        //    64: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    67: aload           options
        //    69: ldc             "allow-objects"
        //    71: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    76: invokevirtual   java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        //    79: istore          10
        //    81: aload           mapper
        //    83: arraylength    
        //    84: ifle            98
        //    87: aload_1         /* invokingMethod */
        //    88: ifnull          98
        //    91: aload_1         /* invokingMethod */
        //    92: invokestatic    com/sun/jna/Function.isVarArgs:(Ljava/lang/reflect/Method;)Z
        //    95: goto            99
        //    98: iconst_0       
        //    99: istore          11
        //   101: aload           mapper
        //   103: arraylength    
        //   104: ifle            118
        //   107: aload_1         /* invokingMethod */
        //   108: ifnull          118
        //   111: aload_1         /* invokingMethod */
        //   112: invokestatic    com/sun/jna/Function.fixedArgs:(Ljava/lang/reflect/Method;)I
        //   115: goto            119
        //   118: iconst_0       
        //   119: istore          12
        //   121: iconst_0       
        //   122: istore          13
        //   124: iload           13
        //   126: aload           mapper
        //   128: arraylength    
        //   129: if_icmpge       198
        //   132: aload_1         /* invokingMethod */
        //   133: ifnull          169
        //   136: iload           fixedArgs
        //   138: ifeq            162
        //   141: iload           13
        //   143: aload_2         /* paramTypes */
        //   144: arraylength    
        //   145: iconst_1       
        //   146: isub           
        //   147: if_icmplt       162
        //   150: aload_2         /* paramTypes */
        //   151: aload_2         /* paramTypes */
        //   152: arraylength    
        //   153: iconst_1       
        //   154: isub           
        //   155: aaload         
        //   156: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   159: goto            170
        //   162: aload_2         /* paramTypes */
        //   163: iload           13
        //   165: aaload         
        //   166: goto            170
        //   169: aconst_null    
        //   170: astore          14
        //   172: aload           mapper
        //   174: iload           paramType
        //   176: aload_0         /* this */
        //   177: aload           mapper
        //   179: iload           paramType
        //   181: aload_1         /* invokingMethod */
        //   182: aload           allowObjects
        //   184: iload           isVarArgs
        //   186: aload           14
        //   188: invokespecial   com/sun/jna/Function.convertArgument:([Ljava/lang/Object;ILjava/lang/reflect/Method;Lcom/sun/jna/TypeMapper;ZLjava/lang/Class;)Ljava/lang/Object;
        //   191: aastore        
        //   192: iinc            paramType, 1
        //   195: goto            124
        //   198: aload_3         /* returnType */
        //   199: astore          13
        //   201: aconst_null    
        //   202: astore          14
        //   204: ldc             Lcom/sun/jna/NativeMapped;.class
        //   206: aload_3         /* returnType */
        //   207: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   210: ifeq            233
        //   213: aload_3         /* returnType */
        //   214: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   217: astore          15
        //   219: aload           15
        //   221: astore          tc
        //   223: aload           15
        //   225: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   228: astore          resultConverter
        //   230: goto            262
        //   233: aload           allowObjects
        //   235: ifnull          262
        //   238: aload           allowObjects
        //   240: aload_3         /* returnType */
        //   241: invokeinterface com/sun/jna/TypeMapper.getFromNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/FromNativeConverter;
        //   246: astore          14
        //   248: aload           14
        //   250: ifnull          262
        //   253: aload           14
        //   255: invokeinterface com/sun/jna/FromNativeConverter.nativeType:()Ljava/lang/Class;
        //   260: astore          resultConverter
        //   262: aload_0         /* this */
        //   263: aload           mapper
        //   265: aload           resultConverter
        //   267: iload           isVarArgs
        //   269: iload           nativeReturnType
        //   271: invokevirtual   com/sun/jna/Function.invoke:([Ljava/lang/Object;Ljava/lang/Class;ZI)Ljava/lang/Object;
        //   274: astore          15
        //   276: aload           result
        //   278: ifnull          328
        //   281: aload_1         /* invokingMethod */
        //   282: ifnull          302
        //   285: new             Lcom/sun/jna/MethodResultContext;
        //   288: dup            
        //   289: aload_3         /* returnType */
        //   290: aload_0         /* this */
        //   291: aload           inArgs
        //   293: aload_1         /* invokingMethod */
        //   294: invokespecial   com/sun/jna/MethodResultContext.<init>:(Ljava/lang/Class;Lcom/sun/jna/Function;[Ljava/lang/Object;Ljava/lang/reflect/Method;)V
        //   297: astore          16
        //   299: goto            315
        //   302: new             Lcom/sun/jna/FunctionResultContext;
        //   305: dup            
        //   306: aload_3         /* returnType */
        //   307: aload_0         /* this */
        //   308: aload           inArgs
        //   310: invokespecial   com/sun/jna/FunctionResultContext.<init>:(Ljava/lang/Class;Lcom/sun/jna/Function;[Ljava/lang/Object;)V
        //   313: astore          16
        //   315: aload           result
        //   317: aload           context
        //   319: aload           16
        //   321: invokeinterface com/sun/jna/FromNativeConverter.fromNative:(Ljava/lang/Object;Lcom/sun/jna/FromNativeContext;)Ljava/lang/Object;
        //   326: astore          context
        //   328: aload           inArgs
        //   330: ifnull          547
        //   333: iconst_0       
        //   334: istore          16
        //   336: iload           16
        //   338: aload           inArgs
        //   340: arraylength    
        //   341: if_icmpge       547
        //   344: aload           inArgs
        //   346: iload           16
        //   348: aaload         
        //   349: astore          17
        //   351: aload           17
        //   353: ifnonnull       359
        //   356: goto            541
        //   359: aload           17
        //   361: instanceof      Lcom/sun/jna/Structure;
        //   364: ifeq            386
        //   367: aload           17
        //   369: instanceof      Lcom/sun/jna/Structure$ByValue;
        //   372: ifne            541
        //   375: aload           17
        //   377: checkcast       Lcom/sun/jna/Structure;
        //   380: invokevirtual   com/sun/jna/Structure.autoRead:()V
        //   383: goto            541
        //   386: aload           mapper
        //   388: iload           inArg
        //   390: aaload         
        //   391: instanceof      Lcom/sun/jna/Function$PostCallRead;
        //   394: ifeq            516
        //   397: aload           mapper
        //   399: iload           inArg
        //   401: aaload         
        //   402: checkcast       Lcom/sun/jna/Function$PostCallRead;
        //   405: invokeinterface com/sun/jna/Function$PostCallRead.read:()V
        //   410: aload           mapper
        //   412: iload           inArg
        //   414: aaload         
        //   415: instanceof      Lcom/sun/jna/Function$PointerArray;
        //   418: ifeq            541
        //   421: aload           mapper
        //   423: iload           inArg
        //   425: aaload         
        //   426: checkcast       Lcom/sun/jna/Function$PointerArray;
        //   429: astore          18
        //   431: ldc_w           [Lcom/sun/jna/Structure$ByReference;.class
        //   434: aload           array
        //   436: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   439: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   442: ifeq            513
        //   445: aload           array
        //   447: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   450: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   453: astore          19
        //   455: aload           array
        //   457: checkcast       [Lcom/sun/jna/Structure;
        //   460: checkcast       [Lcom/sun/jna/Structure;
        //   463: astore          20
        //   465: iconst_0       
        //   466: istore          21
        //   468: iload           21
        //   470: aload           si
        //   472: arraylength    
        //   473: if_icmpge       513
        //   476: aload           type
        //   478: getstatic       com/sun/jna/Pointer.SIZE:I
        //   481: iload           21
        //   483: imul           
        //   484: i2l            
        //   485: invokevirtual   com/sun/jna/Function$PointerArray.getPointer:(J)Lcom/sun/jna/Pointer;
        //   488: astore          22
        //   490: aload           si
        //   492: iload           p
        //   494: aload           ss
        //   496: aload           si
        //   498: iload           p
        //   500: aaload         
        //   501: aload           22
        //   503: invokestatic    com/sun/jna/Structure.updateStructureByReference:(Ljava/lang/Class;Lcom/sun/jna/Structure;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //   506: aastore        
        //   507: iinc            p, 1
        //   510: goto            468
        //   513: goto            541
        //   516: ldc_w           [Lcom/sun/jna/Structure;.class
        //   519: aload           17
        //   521: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   524: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   527: ifeq            541
        //   530: aload           17
        //   532: checkcast       [Lcom/sun/jna/Structure;
        //   535: checkcast       [Lcom/sun/jna/Structure;
        //   538: invokestatic    com/sun/jna/Structure.autoRead:([Lcom/sun/jna/Structure;)V
        //   541: iinc            inArg, 1
        //   544: goto            336
        //   547: aload           i
        //   549: areturn        
        //    Signature:
        //  (Ljava/lang/reflect/Method;[Ljava/lang/Class<*>;Ljava/lang/Class<*>;[Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;*>;)Ljava/lang/Object;
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
    
    public Object invoke(final Object[] args, final Class<?> returnType, final boolean allowObjects) {
        return this.invoke(args, returnType, allowObjects, 0);
    }
    
    public Object invoke(final Object[] args, final Class<?> returnType, final boolean allowObjects, final int fixedArgs) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          7
        //     3: aload_0         /* this */
        //     4: getfield        com/sun/jna/Function.callFlags:I
        //     7: iload           fixedArgs
        //     9: iconst_3       
        //    10: iand           
        //    11: bipush          7
        //    13: ishl           
        //    14: ior            
        //    15: istore          8
        //    17: aload_2         /* returnType */
        //    18: ifnull          35
        //    21: aload_2         /* returnType */
        //    22: getstatic       java/lang/Void.TYPE:Ljava/lang/Class;
        //    25: if_acmpeq       35
        //    28: aload_2         /* returnType */
        //    29: ldc_w           Ljava/lang/Void;.class
        //    32: if_acmpne       52
        //    35: aload_0         /* this */
        //    36: aload_0         /* this */
        //    37: getfield        com/sun/jna/Function.peer:J
        //    40: iload           8
        //    42: aload_1         /* args */
        //    43: invokestatic    com/sun/jna/Native.invokeVoid:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)V
        //    46: aconst_null    
        //    47: astore          callFlags
        //    49: goto            786
        //    52: aload_2         /* returnType */
        //    53: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    56: if_acmpeq       65
        //    59: aload_2         /* returnType */
        //    60: ldc             Ljava/lang/Boolean;.class
        //    62: if_acmpne       92
        //    65: aload_0         /* this */
        //    66: aload_0         /* this */
        //    67: getfield        com/sun/jna/Function.peer:J
        //    70: iload           8
        //    72: aload_1         /* args */
        //    73: invokestatic    com/sun/jna/Native.invokeInt:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I
        //    76: ifeq            83
        //    79: iconst_1       
        //    80: goto            84
        //    83: iconst_0       
        //    84: invokestatic    com/sun/jna/Function.valueOf:(Z)Ljava/lang/Boolean;
        //    87: astore          callFlags
        //    89: goto            786
        //    92: aload_2         /* returnType */
        //    93: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //    96: if_acmpeq       106
        //    99: aload_2         /* returnType */
        //   100: ldc_w           Ljava/lang/Byte;.class
        //   103: if_acmpne       126
        //   106: aload_0         /* this */
        //   107: aload_0         /* this */
        //   108: getfield        com/sun/jna/Function.peer:J
        //   111: iload           8
        //   113: aload_1         /* args */
        //   114: invokestatic    com/sun/jna/Native.invokeInt:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I
        //   117: i2b            
        //   118: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //   121: astore          callFlags
        //   123: goto            786
        //   126: aload_2         /* returnType */
        //   127: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //   130: if_acmpeq       140
        //   133: aload_2         /* returnType */
        //   134: ldc_w           Ljava/lang/Short;.class
        //   137: if_acmpne       160
        //   140: aload_0         /* this */
        //   141: aload_0         /* this */
        //   142: getfield        com/sun/jna/Function.peer:J
        //   145: iload           8
        //   147: aload_1         /* args */
        //   148: invokestatic    com/sun/jna/Native.invokeInt:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I
        //   151: i2s            
        //   152: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //   155: astore          callFlags
        //   157: goto            786
        //   160: aload_2         /* returnType */
        //   161: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //   164: if_acmpeq       174
        //   167: aload_2         /* returnType */
        //   168: ldc_w           Ljava/lang/Character;.class
        //   171: if_acmpne       194
        //   174: aload_0         /* this */
        //   175: aload_0         /* this */
        //   176: getfield        com/sun/jna/Function.peer:J
        //   179: iload           8
        //   181: aload_1         /* args */
        //   182: invokestatic    com/sun/jna/Native.invokeInt:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I
        //   185: i2c            
        //   186: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   189: astore          callFlags
        //   191: goto            786
        //   194: aload_2         /* returnType */
        //   195: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   198: if_acmpeq       208
        //   201: aload_2         /* returnType */
        //   202: ldc_w           Ljava/lang/Integer;.class
        //   205: if_acmpne       227
        //   208: aload_0         /* this */
        //   209: aload_0         /* this */
        //   210: getfield        com/sun/jna/Function.peer:J
        //   213: iload           8
        //   215: aload_1         /* args */
        //   216: invokestatic    com/sun/jna/Native.invokeInt:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)I
        //   219: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   222: astore          callFlags
        //   224: goto            786
        //   227: aload_2         /* returnType */
        //   228: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   231: if_acmpeq       241
        //   234: aload_2         /* returnType */
        //   235: ldc_w           Ljava/lang/Long;.class
        //   238: if_acmpne       260
        //   241: aload_0         /* this */
        //   242: aload_0         /* this */
        //   243: getfield        com/sun/jna/Function.peer:J
        //   246: iload           8
        //   248: aload_1         /* args */
        //   249: invokestatic    com/sun/jna/Native.invokeLong:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)J
        //   252: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   255: astore          callFlags
        //   257: goto            786
        //   260: aload_2         /* returnType */
        //   261: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   264: if_acmpeq       274
        //   267: aload_2         /* returnType */
        //   268: ldc_w           Ljava/lang/Float;.class
        //   271: if_acmpne       293
        //   274: aload_0         /* this */
        //   275: aload_0         /* this */
        //   276: getfield        com/sun/jna/Function.peer:J
        //   279: iload           8
        //   281: aload_1         /* args */
        //   282: invokestatic    com/sun/jna/Native.invokeFloat:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)F
        //   285: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   288: astore          callFlags
        //   290: goto            786
        //   293: aload_2         /* returnType */
        //   294: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   297: if_acmpeq       307
        //   300: aload_2         /* returnType */
        //   301: ldc_w           Ljava/lang/Double;.class
        //   304: if_acmpne       326
        //   307: aload_0         /* this */
        //   308: aload_0         /* this */
        //   309: getfield        com/sun/jna/Function.peer:J
        //   312: iload           8
        //   314: aload_1         /* args */
        //   315: invokestatic    com/sun/jna/Native.invokeDouble:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)D
        //   318: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   321: astore          callFlags
        //   323: goto            786
        //   326: aload_2         /* returnType */
        //   327: ldc_w           Ljava/lang/String;.class
        //   330: if_acmpne       346
        //   333: aload_0         /* this */
        //   334: iload           8
        //   336: aload_1         /* args */
        //   337: iconst_0       
        //   338: invokespecial   com/sun/jna/Function.invokeString:(I[Ljava/lang/Object;Z)Ljava/lang/String;
        //   341: astore          callFlags
        //   343: goto            786
        //   346: aload_2         /* returnType */
        //   347: ldc_w           Lcom/sun/jna/WString;.class
        //   350: if_acmpne       382
        //   353: aload_0         /* this */
        //   354: iload           8
        //   356: aload_1         /* args */
        //   357: iconst_1       
        //   358: invokespecial   com/sun/jna/Function.invokeString:(I[Ljava/lang/Object;Z)Ljava/lang/String;
        //   361: astore          9
        //   363: aload           9
        //   365: ifnull          379
        //   368: new             Lcom/sun/jna/WString;
        //   371: dup            
        //   372: aload           9
        //   374: invokespecial   com/sun/jna/WString.<init>:(Ljava/lang/String;)V
        //   377: astore          callFlags
        //   379: goto            786
        //   382: ldc             Lcom/sun/jna/Pointer;.class
        //   384: aload_2         /* returnType */
        //   385: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   388: ifeq            399
        //   391: aload_0         /* this */
        //   392: iload           8
        //   394: aload_1         /* args */
        //   395: invokespecial   com/sun/jna/Function.invokePointer:(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   398: areturn        
        //   399: ldc_w           Lcom/sun/jna/Structure;.class
        //   402: aload_2         /* returnType */
        //   403: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   406: ifeq            485
        //   409: ldc_w           Lcom/sun/jna/Structure$ByValue;.class
        //   412: aload_2         /* returnType */
        //   413: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   416: ifeq            448
        //   419: aload_0         /* this */
        //   420: aload_0         /* this */
        //   421: getfield        com/sun/jna/Function.peer:J
        //   424: iload           8
        //   426: aload_1         /* args */
        //   427: aload_2         /* returnType */
        //   428: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;)Lcom/sun/jna/Structure;
        //   431: invokestatic    com/sun/jna/Native.invokeStructure:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;Lcom/sun/jna/Structure;)Lcom/sun/jna/Structure;
        //   434: astore          9
        //   436: aload           9
        //   438: invokevirtual   com/sun/jna/Structure.autoRead:()V
        //   441: aload           9
        //   443: astore          callFlags
        //   445: goto            786
        //   448: aload_0         /* this */
        //   449: iload           8
        //   451: aload_1         /* args */
        //   452: invokespecial   com/sun/jna/Function.invokePointer:(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   455: astore          callFlags
        //   457: aload           callFlags
        //   459: ifnull          786
        //   462: aload_2         /* returnType */
        //   463: aload           callFlags
        //   465: checkcast       Lcom/sun/jna/Pointer;
        //   468: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //   471: astore          9
        //   473: aload           9
        //   475: invokevirtual   com/sun/jna/Structure.conditionalAutoRead:()V
        //   478: aload           9
        //   480: astore          callFlags
        //   482: goto            786
        //   485: ldc_w           Lcom/sun/jna/Callback;.class
        //   488: aload_2         /* returnType */
        //   489: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   492: ifeq            523
        //   495: aload_0         /* this */
        //   496: iload           8
        //   498: aload_1         /* args */
        //   499: invokespecial   com/sun/jna/Function.invokePointer:(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   502: astore          callFlags
        //   504: aload           callFlags
        //   506: ifnull          786
        //   509: aload_2         /* returnType */
        //   510: aload           callFlags
        //   512: checkcast       Lcom/sun/jna/Pointer;
        //   515: invokestatic    com/sun/jna/CallbackReference.getCallback:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Callback;
        //   518: astore          callFlags
        //   520: goto            786
        //   523: aload_2         /* returnType */
        //   524: ldc_w           [Ljava/lang/String;.class
        //   527: if_acmpne       559
        //   530: aload_0         /* this */
        //   531: iload           8
        //   533: aload_1         /* args */
        //   534: invokespecial   com/sun/jna/Function.invokePointer:(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   537: astore          9
        //   539: aload           9
        //   541: ifnull          556
        //   544: aload           9
        //   546: lconst_0       
        //   547: aload_0         /* this */
        //   548: getfield        com/sun/jna/Function.encoding:Ljava/lang/String;
        //   551: invokevirtual   com/sun/jna/Pointer.getStringArray:(JLjava/lang/String;)[Ljava/lang/String;
        //   554: astore          callFlags
        //   556: goto            786
        //   559: aload_2         /* returnType */
        //   560: ldc_w           [Lcom/sun/jna/WString;.class
        //   563: if_acmpne       637
        //   566: aload_0         /* this */
        //   567: iload           8
        //   569: aload_1         /* args */
        //   570: invokespecial   com/sun/jna/Function.invokePointer:(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   573: astore          9
        //   575: aload           9
        //   577: ifnull          634
        //   580: aload           9
        //   582: lconst_0       
        //   583: invokevirtual   com/sun/jna/Pointer.getWideStringArray:(J)[Ljava/lang/String;
        //   586: astore          10
        //   588: aload           10
        //   590: arraylength    
        //   591: anewarray       Lcom/sun/jna/WString;
        //   594: astore          11
        //   596: iconst_0       
        //   597: istore          12
        //   599: iload           12
        //   601: aload           warr
        //   603: arraylength    
        //   604: if_icmpge       630
        //   607: aload           i
        //   609: iload           12
        //   611: new             Lcom/sun/jna/WString;
        //   614: dup            
        //   615: aload           warr
        //   617: iload           12
        //   619: aaload         
        //   620: invokespecial   com/sun/jna/WString.<init>:(Ljava/lang/String;)V
        //   623: aastore        
        //   624: iinc            12, 1
        //   627: goto            599
        //   630: aload           i
        //   632: astore          callFlags
        //   634: goto            786
        //   637: aload_2         /* returnType */
        //   638: ldc_w           [Lcom/sun/jna/Pointer;.class
        //   641: if_acmpne       669
        //   644: aload_0         /* this */
        //   645: iload           8
        //   647: aload_1         /* args */
        //   648: invokespecial   com/sun/jna/Function.invokePointer:(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //   651: astore          9
        //   653: aload           9
        //   655: ifnull          666
        //   658: aload           9
        //   660: lconst_0       
        //   661: invokevirtual   com/sun/jna/Pointer.getPointerArray:(J)[Lcom/sun/jna/Pointer;
        //   664: astore          callFlags
        //   666: goto            786
        //   669: iload_3         /* allowObjects */
        //   670: ifeq            745
        //   673: aload_0         /* this */
        //   674: aload_0         /* this */
        //   675: getfield        com/sun/jna/Function.peer:J
        //   678: iload           8
        //   680: aload_1         /* args */
        //   681: invokestatic    com/sun/jna/Native.invokeObject:(Lcom/sun/jna/Function;JI[Ljava/lang/Object;)Ljava/lang/Object;
        //   684: astore          callFlags
        //   686: aload           callFlags
        //   688: ifnull          786
        //   691: aload_2         /* returnType */
        //   692: aload           callFlags
        //   694: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   697: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   700: ifne            786
        //   703: new             Ljava/lang/ClassCastException;
        //   706: dup            
        //   707: new             Ljava/lang/StringBuilder;
        //   710: dup            
        //   711: invokespecial   java/lang/StringBuilder.<init>:()V
        //   714: ldc_w           "Return type "
        //   717: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   720: aload_2         /* returnType */
        //   721: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   724: ldc_w           " does not match result "
        //   727: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   730: aload           callFlags
        //   732: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   735: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   738: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   741: invokespecial   java/lang/ClassCastException.<init>:(Ljava/lang/String;)V
        //   744: athrow         
        //   745: new             Ljava/lang/IllegalArgumentException;
        //   748: dup            
        //   749: new             Ljava/lang/StringBuilder;
        //   752: dup            
        //   753: invokespecial   java/lang/StringBuilder.<init>:()V
        //   756: ldc_w           "Unsupported return type "
        //   759: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   762: aload_2         /* returnType */
        //   763: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   766: ldc_w           " in function "
        //   769: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   772: aload_0         /* this */
        //   773: invokevirtual   com/sun/jna/Function.getName:()Ljava/lang/String;
        //   776: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   779: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   782: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   785: athrow         
        //   786: aload           callFlags
        //   788: areturn        
        //    Signature:
        //  ([Ljava/lang/Object;Ljava/lang/Class<*>;ZI)Ljava/lang/Object;
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
    
    private Pointer invokePointer(final int callFlags, final Object[] args) {
        final long invokePointer = Native.invokePointer(this, this.peer, callFlags, args);
        return (invokePointer == 0L) ? null : new Pointer(invokePointer);
    }
    
    private Object convertArgument(final Object[] args, final int index, final Method invokingMethod, final TypeMapper mapper, final boolean allowObjects, final Class<?> expectedType) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_2         /* index */
        //     2: aaload         
        //     3: astore          9
        //     5: aload           9
        //     7: ifnull          106
        //    10: aload           9
        //    12: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    15: astore          10
        //    17: aconst_null    
        //    18: astore          11
        //    20: ldc             Lcom/sun/jna/NativeMapped;.class
        //    22: aload           converter
        //    24: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    27: ifeq            40
        //    30: aload           converter
        //    32: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //    35: astore          11
        //    37: goto            56
        //    40: aload           mapper
        //    42: ifnull          56
        //    45: aload           mapper
        //    47: aload           converter
        //    49: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //    54: astore          11
        //    56: aload           11
        //    58: ifnull          106
        //    61: aload_3         /* invokingMethod */
        //    62: ifnull          81
        //    65: new             Lcom/sun/jna/MethodParameterContext;
        //    68: dup            
        //    69: aload_0         /* this */
        //    70: aload_1         /* args */
        //    71: iload_2         /* index */
        //    72: aload_3         /* invokingMethod */
        //    73: invokespecial   com/sun/jna/MethodParameterContext.<init>:(Lcom/sun/jna/Function;[Ljava/lang/Object;ILjava/lang/reflect/Method;)V
        //    76: astore          12
        //    78: goto            93
        //    81: new             Lcom/sun/jna/FunctionParameterContext;
        //    84: dup            
        //    85: aload_0         /* this */
        //    86: aload_1         /* args */
        //    87: iload_2         /* index */
        //    88: invokespecial   com/sun/jna/FunctionParameterContext.<init>:(Lcom/sun/jna/Function;[Ljava/lang/Object;I)V
        //    91: astore          12
        //    93: aload           context
        //    95: aload           type
        //    97: aload           12
        //    99: invokeinterface com/sun/jna/ToNativeConverter.toNative:(Ljava/lang/Object;Lcom/sun/jna/ToNativeContext;)Ljava/lang/Object;
        //   104: astore          type
        //   106: aload           type
        //   108: ifnull          123
        //   111: aload_0         /* this */
        //   112: aload           9
        //   114: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   117: invokespecial   com/sun/jna/Function.isPrimitiveArray:(Ljava/lang/Class;)Z
        //   120: ifeq            126
        //   123: aload           9
        //   125: areturn        
        //   126: aload           9
        //   128: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   131: astore          10
        //   133: aload           argClass
        //   135: instanceof      Lcom/sun/jna/Structure;
        //   138: ifeq            259
        //   141: aload           argClass
        //   143: checkcast       Lcom/sun/jna/Structure;
        //   146: astore          11
        //   148: aload           11
        //   150: invokevirtual   com/sun/jna/Structure.autoWrite:()V
        //   153: aload           11
        //   155: instanceof      Lcom/sun/jna/Structure$ByValue;
        //   158: ifeq            253
        //   161: aload           11
        //   163: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   166: astore          12
        //   168: aload_3         /* invokingMethod */
        //   169: ifnull          239
        //   172: aload_3         /* invokingMethod */
        //   173: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //   176: astore          13
        //   178: getstatic       com/sun/jna/Function.IS_VARARGS:Lcom/sun/jna/VarArgsChecker;
        //   181: aload_3         /* invokingMethod */
        //   182: invokevirtual   com/sun/jna/VarArgsChecker.isVarArgs:(Ljava/lang/reflect/Method;)Z
        //   185: ifeq            233
        //   188: iload_2         /* index */
        //   189: aload           13
        //   191: arraylength    
        //   192: iconst_1       
        //   193: isub           
        //   194: if_icmpge       206
        //   197: aload           13
        //   199: iload_2         /* index */
        //   200: aaload         
        //   201: astore          ptypes
        //   203: goto            239
        //   206: aload           13
        //   208: aload           13
        //   210: arraylength    
        //   211: iconst_1       
        //   212: isub           
        //   213: aaload         
        //   214: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   217: astore          14
        //   219: aload           14
        //   221: ldc             Ljava/lang/Object;.class
        //   223: if_acmpeq       230
        //   226: aload           14
        //   228: astore          ptypes
        //   230: goto            239
        //   233: aload           13
        //   235: iload_2         /* index */
        //   236: aaload         
        //   237: astore          ptypes
        //   239: ldc_w           Lcom/sun/jna/Structure$ByValue;.class
        //   242: aload           12
        //   244: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   247: ifeq            253
        //   250: aload           ptype
        //   252: areturn        
        //   253: aload           ptype
        //   255: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //   258: areturn        
        //   259: aload           argClass
        //   261: instanceof      Lcom/sun/jna/Callback;
        //   264: ifeq            276
        //   267: aload           argClass
        //   269: checkcast       Lcom/sun/jna/Callback;
        //   272: invokestatic    com/sun/jna/CallbackReference.getFunctionPointer:(Lcom/sun/jna/Callback;)Lcom/sun/jna/Pointer;
        //   275: areturn        
        //   276: aload           argClass
        //   278: instanceof      Ljava/lang/String;
        //   281: ifeq            301
        //   284: new             Lcom/sun/jna/NativeString;
        //   287: dup            
        //   288: aload           argClass
        //   290: checkcast       Ljava/lang/String;
        //   293: iconst_0       
        //   294: invokespecial   com/sun/jna/NativeString.<init>:(Ljava/lang/String;Z)V
        //   297: invokevirtual   com/sun/jna/NativeString.getPointer:()Lcom/sun/jna/Pointer;
        //   300: areturn        
        //   301: aload           argClass
        //   303: instanceof      Lcom/sun/jna/WString;
        //   306: ifeq            326
        //   309: new             Lcom/sun/jna/NativeString;
        //   312: dup            
        //   313: aload           argClass
        //   315: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   318: iconst_1       
        //   319: invokespecial   com/sun/jna/NativeString.<init>:(Ljava/lang/String;Z)V
        //   322: invokevirtual   com/sun/jna/NativeString.getPointer:()Lcom/sun/jna/Pointer;
        //   325: areturn        
        //   326: aload           argClass
        //   328: instanceof      Ljava/lang/Boolean;
        //   331: ifeq            355
        //   334: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   337: aload           argClass
        //   339: invokevirtual   java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        //   342: ifeq            351
        //   345: getstatic       com/sun/jna/Function.INTEGER_TRUE:Ljava/lang/Integer;
        //   348: goto            354
        //   351: getstatic       com/sun/jna/Function.INTEGER_FALSE:Ljava/lang/Integer;
        //   354: areturn        
        //   355: ldc_w           [Ljava/lang/String;.class
        //   358: aload           10
        //   360: if_acmpne       383
        //   363: new             Lcom/sun/jna/StringArray;
        //   366: dup            
        //   367: aload           argClass
        //   369: checkcast       [Ljava/lang/String;
        //   372: checkcast       [Ljava/lang/String;
        //   375: aload_0         /* this */
        //   376: getfield        com/sun/jna/Function.encoding:Ljava/lang/String;
        //   379: invokespecial   com/sun/jna/StringArray.<init>:([Ljava/lang/String;Ljava/lang/String;)V
        //   382: areturn        
        //   383: ldc_w           [Lcom/sun/jna/WString;.class
        //   386: aload           10
        //   388: if_acmpne       407
        //   391: new             Lcom/sun/jna/StringArray;
        //   394: dup            
        //   395: aload           argClass
        //   397: checkcast       [Lcom/sun/jna/WString;
        //   400: checkcast       [Lcom/sun/jna/WString;
        //   403: invokespecial   com/sun/jna/StringArray.<init>:([Lcom/sun/jna/WString;)V
        //   406: areturn        
        //   407: ldc_w           [Lcom/sun/jna/Pointer;.class
        //   410: aload           10
        //   412: if_acmpne       431
        //   415: new             Lcom/sun/jna/Function$PointerArray;
        //   418: dup            
        //   419: aload           argClass
        //   421: checkcast       [Lcom/sun/jna/Pointer;
        //   424: checkcast       [Lcom/sun/jna/Pointer;
        //   427: invokespecial   com/sun/jna/Function$PointerArray.<init>:([Lcom/sun/jna/Pointer;)V
        //   430: areturn        
        //   431: ldc_w           [Lcom/sun/jna/NativeMapped;.class
        //   434: aload           10
        //   436: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   439: ifeq            458
        //   442: new             Lcom/sun/jna/Function$NativeMappedArray;
        //   445: dup            
        //   446: aload           argClass
        //   448: checkcast       [Lcom/sun/jna/NativeMapped;
        //   451: checkcast       [Lcom/sun/jna/NativeMapped;
        //   454: invokespecial   com/sun/jna/Function$NativeMappedArray.<init>:([Lcom/sun/jna/NativeMapped;)V
        //   457: areturn        
        //   458: ldc_w           [Lcom/sun/jna/Structure;.class
        //   461: aload           10
        //   463: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   466: ifeq            789
        //   469: aload           argClass
        //   471: checkcast       [Lcom/sun/jna/Structure;
        //   474: checkcast       [Lcom/sun/jna/Structure;
        //   477: astore          11
        //   479: aload           ss
        //   481: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   484: astore          12
        //   486: ldc_w           Lcom/sun/jna/Structure$ByReference;.class
        //   489: aload           12
        //   491: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   494: istore          13
        //   496: aload           expectedType
        //   498: ifnull          661
        //   501: ldc_w           [Lcom/sun/jna/Structure$ByReference;.class
        //   504: aload           expectedType
        //   506: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   509: ifne            661
        //   512: iload           13
        //   514: ifeq            575
        //   517: new             Ljava/lang/IllegalArgumentException;
        //   520: dup            
        //   521: new             Ljava/lang/StringBuilder;
        //   524: dup            
        //   525: invokespecial   java/lang/StringBuilder.<init>:()V
        //   528: ldc_w           "Function "
        //   531: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   534: aload_0         /* this */
        //   535: invokevirtual   com/sun/jna/Function.getName:()Ljava/lang/String;
        //   538: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   541: ldc_w           " declared Structure[] at parameter "
        //   544: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   547: iload_2         /* index */
        //   548: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   551: ldc_w           " but array of "
        //   554: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   557: aload           byRef
        //   559: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   562: ldc_w           " was passed"
        //   565: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   568: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   571: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   574: athrow         
        //   575: iconst_0       
        //   576: istore          14
        //   578: iload           14
        //   580: aload           type
        //   582: arraylength    
        //   583: if_icmpge       661
        //   586: aload           type
        //   588: iload           14
        //   590: aaload         
        //   591: instanceof      Lcom/sun/jna/Structure$ByReference;
        //   594: ifeq            655
        //   597: new             Ljava/lang/IllegalArgumentException;
        //   600: dup            
        //   601: new             Ljava/lang/StringBuilder;
        //   604: dup            
        //   605: invokespecial   java/lang/StringBuilder.<init>:()V
        //   608: ldc_w           "Function "
        //   611: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   614: aload_0         /* this */
        //   615: invokevirtual   com/sun/jna/Function.getName:()Ljava/lang/String;
        //   618: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   621: ldc_w           " declared Structure[] at parameter "
        //   624: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   627: iload_2         /* index */
        //   628: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   631: ldc_w           " but element "
        //   634: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   637: iload           14
        //   639: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   642: ldc_w           " is of Structure.ByReference type"
        //   645: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   648: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   651: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   654: athrow         
        //   655: iinc            14, 1
        //   658: goto            578
        //   661: iload           i
        //   663: ifeq            733
        //   666: aload           type
        //   668: invokestatic    com/sun/jna/Structure.autoWrite:([Lcom/sun/jna/Structure;)V
        //   671: aload           type
        //   673: arraylength    
        //   674: iconst_1       
        //   675: iadd           
        //   676: anewarray       Lcom/sun/jna/Pointer;
        //   679: astore          14
        //   681: iconst_0       
        //   682: istore          15
        //   684: iload           15
        //   686: aload           type
        //   688: arraylength    
        //   689: if_icmpge       723
        //   692: aload           i
        //   694: iload           15
        //   696: aload           type
        //   698: iload           15
        //   700: aaload         
        //   701: ifnull          715
        //   704: aload           type
        //   706: iload           15
        //   708: aaload         
        //   709: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //   712: goto            716
        //   715: aconst_null    
        //   716: aastore        
        //   717: iinc            15, 1
        //   720: goto            684
        //   723: new             Lcom/sun/jna/Function$PointerArray;
        //   726: dup            
        //   727: aload           14
        //   729: invokespecial   com/sun/jna/Function$PointerArray.<init>:([Lcom/sun/jna/Pointer;)V
        //   732: areturn        
        //   733: aload           type
        //   735: arraylength    
        //   736: ifne            750
        //   739: new             Ljava/lang/IllegalArgumentException;
        //   742: dup            
        //   743: ldc_w           "Structure array must have non-zero length"
        //   746: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   749: athrow         
        //   750: aload           type
        //   752: iconst_0       
        //   753: aaload         
        //   754: ifnonnull       776
        //   757: aload           byRef
        //   759: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;)Lcom/sun/jna/Structure;
        //   762: aload           type
        //   764: invokevirtual   com/sun/jna/Structure.toArray:([Lcom/sun/jna/Structure;)[Lcom/sun/jna/Structure;
        //   767: pop            
        //   768: aload           type
        //   770: iconst_0       
        //   771: aaload         
        //   772: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //   775: areturn        
        //   776: aload           type
        //   778: invokestatic    com/sun/jna/Structure.autoWrite:([Lcom/sun/jna/Structure;)V
        //   781: aload           type
        //   783: iconst_0       
        //   784: aaload         
        //   785: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //   788: areturn        
        //   789: aload           ss
        //   791: invokevirtual   java/lang/Class.isArray:()Z
        //   794: ifeq            829
        //   797: new             Ljava/lang/IllegalArgumentException;
        //   800: dup            
        //   801: new             Ljava/lang/StringBuilder;
        //   804: dup            
        //   805: invokespecial   java/lang/StringBuilder.<init>:()V
        //   808: ldc_w           "Unsupported array argument type: "
        //   811: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   814: aload           10
        //   816: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   819: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   822: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   825: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   828: athrow         
        //   829: iload           allowObjects
        //   831: ifeq            837
        //   834: aload           argClass
        //   836: areturn        
        //   837: aload           argClass
        //   839: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   842: invokestatic    com/sun/jna/Native.isSupportedNativeType:(Ljava/lang/Class;)Z
        //   845: ifne            906
        //   848: new             Ljava/lang/IllegalArgumentException;
        //   851: dup            
        //   852: new             Ljava/lang/StringBuilder;
        //   855: dup            
        //   856: invokespecial   java/lang/StringBuilder.<init>:()V
        //   859: ldc_w           "Unsupported argument type "
        //   862: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   865: aload           argClass
        //   867: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   870: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   873: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   876: ldc_w           " at parameter "
        //   879: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   882: iload_2         /* index */
        //   883: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   886: ldc_w           " of function "
        //   889: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   892: aload_0         /* this */
        //   893: invokevirtual   com/sun/jna/Function.getName:()Ljava/lang/String;
        //   896: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   899: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   902: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   905: athrow         
        //   906: aload           argClass
        //   908: areturn        
        //    Signature:
        //  ([Ljava/lang/Object;ILjava/lang/reflect/Method;Lcom/sun/jna/TypeMapper;ZLjava/lang/Class<*>;)Ljava/lang/Object;
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
    
    private boolean isPrimitiveArray(final Class<?> argClass) {
        return argClass.isArray() && argClass.getComponentType().isPrimitive();
    }
    
    public void invoke(final Object[] args) {
        this.invoke(Void.class, args);
    }
    
    private String invokeString(final int callFlags, final Object[] args, final boolean wide) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_1         /* callFlags */
        //     2: aload_2         /* args */
        //     3: invokespecial   com/sun/jna/Function.invokePointer:(I[Ljava/lang/Object;)Lcom/sun/jna/Pointer;
        //     6: astore          6
        //     8: aconst_null    
        //     9: astore          7
        //    11: aload           s
        //    13: ifnull          43
        //    16: iload_3         /* wide */
        //    17: ifeq            31
        //    20: aload           s
        //    22: lconst_0       
        //    23: invokevirtual   com/sun/jna/Pointer.getWideString:(J)Ljava/lang/String;
        //    26: astore          7
        //    28: goto            43
        //    31: aload           s
        //    33: lconst_0       
        //    34: aload_0         /* this */
        //    35: getfield        com/sun/jna/Function.encoding:Ljava/lang/String;
        //    38: invokevirtual   com/sun/jna/Pointer.getString:(JLjava/lang/String;)Ljava/lang/String;
        //    41: astore          7
        //    43: aload           7
        //    45: areturn        
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
    public String toString() {
        if (this.library != null) {
            return "native function " + this.functionName + "(" + this.library.getName() + ")@0x" + Long.toHexString(this.peer);
        }
        return "native function@0x" + Long.toHexString(this.peer);
    }
    
    public Object invokeObject(final Object[] args) {
        return this.invoke(Object.class, args);
    }
    
    public Pointer invokePointer(final Object[] args) {
        return (Pointer)this.invoke(Pointer.class, args);
    }
    
    public String invokeString(final Object[] args, final boolean wide) {
        final Object invoke = this.invoke((Class<?>)(wide ? WString.class : String.class), args);
        return (invoke != null) ? invoke.toString() : null;
    }
    
    public int invokeInt(final Object[] args) {
        return (int)this.invoke(Integer.class, args);
    }
    
    public long invokeLong(final Object[] args) {
        return (long)this.invoke(Long.class, args);
    }
    
    public float invokeFloat(final Object[] args) {
        return (float)this.invoke(Float.class, args);
    }
    
    public double invokeDouble(final Object[] args) {
        return (double)this.invoke(Double.class, args);
    }
    
    public void invokeVoid(final Object[] args) {
        this.invoke(Void.class, args);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() == this.getClass()) {
            final Function function = (Function)o;
            return function.callFlags == this.callFlags && function.options.equals(this.options) && function.peer == this.peer;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.callFlags + this.options.hashCode() + super.hashCode();
    }
    
    public static Object[] concatenateVarArgs(final Object[] inArgs) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          150
        //     4: aload_0         /* inArgs */
        //     5: arraylength    
        //     6: ifle            150
        //     9: aload_0         /* inArgs */
        //    10: aload_0         /* inArgs */
        //    11: arraylength    
        //    12: iconst_1       
        //    13: isub           
        //    14: aaload         
        //    15: astore_3       
        //    16: aload_3        
        //    17: ifnull          27
        //    20: aload_3        
        //    21: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    24: goto            28
        //    27: aconst_null    
        //    28: astore          4
        //    30: aload           4
        //    32: ifnull          150
        //    35: aload           4
        //    37: invokevirtual   java/lang/Class.isArray:()Z
        //    40: ifeq            150
        //    43: aload_3         /* argType */
        //    44: checkcast       [Ljava/lang/Object;
        //    47: checkcast       [Ljava/lang/Object;
        //    50: astore          5
        //    52: iconst_0       
        //    53: istore          6
        //    55: iload           6
        //    57: aload           i
        //    59: arraylength    
        //    60: if_icmpge       100
        //    63: aload           i
        //    65: iload           6
        //    67: aaload         
        //    68: instanceof      Ljava/lang/Float;
        //    71: ifeq            94
        //    74: aload           i
        //    76: iload           6
        //    78: aload           i
        //    80: iload           6
        //    82: aaload         
        //    83: checkcast       Ljava/lang/Float;
        //    86: invokevirtual   java/lang/Float.floatValue:()F
        //    89: f2d            
        //    90: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    93: aastore        
        //    94: iinc            6, 1
        //    97: goto            55
        //   100: aload_0         /* inArgs */
        //   101: arraylength    
        //   102: aload           5
        //   104: arraylength    
        //   105: iadd           
        //   106: anewarray       Ljava/lang/Object;
        //   109: astore          6
        //   111: aload_0         /* inArgs */
        //   112: iconst_0       
        //   113: aload           6
        //   115: iconst_0       
        //   116: aload_0         /* inArgs */
        //   117: arraylength    
        //   118: iconst_1       
        //   119: isub           
        //   120: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   123: aload           fullArgs
        //   125: iconst_0       
        //   126: aload           6
        //   128: aload_0         /* inArgs */
        //   129: arraylength    
        //   130: iconst_1       
        //   131: isub           
        //   132: aload           fullArgs
        //   134: arraylength    
        //   135: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   138: aload           6
        //   140: aload           6
        //   142: arraylength    
        //   143: iconst_1       
        //   144: isub           
        //   145: aconst_null    
        //   146: aastore        
        //   147: aload           6
        //   149: astore_0        /* inArgs */
        //   150: aload_0         /* inArgs */
        //   151: areturn        
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
    
    public static boolean isVarArgs(final Method m) {
        return Function.IS_VARARGS.isVarArgs(m);
    }
    
    public static int fixedArgs(final Method m) {
        return Function.IS_VARARGS.fixedArgs(m);
    }
    
    public static Boolean valueOf(final boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
    
    static {
        INTEGER_TRUE = -1;
        INTEGER_FALSE = 0;
        IS_VARARGS = VarArgsChecker.create();
    }
}

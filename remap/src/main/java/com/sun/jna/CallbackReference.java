// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Collections;
import java.util.WeakHashMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import java.lang.reflect.Method;
import java.lang.ref.Reference;
import java.util.Map;
import java.lang.ref.WeakReference;

public class CallbackReference extends WeakReference<Callback>
{
    public static final Map<Callback, CallbackReference> callbackMap;
    public static final Map<Callback, CallbackReference> directCallbackMap;
    public static final Map<Pointer, Reference<Callback>> pointerCallbackMap;
    public static final Map<Object, Object> allocations;
    private static final Map<CallbackReference, Reference<CallbackReference>> allocatedMemory;
    private static final Method PROXY_CALLBACK_METHOD;
    private static final Map<Callback, CallbackThreadInitializer> initializers;
    public Pointer cbstruct;
    public Pointer trampoline;
    public CallbackProxy proxy;
    public Method method;
    public int callingConvention;
    
    public static CallbackThreadInitializer setCallbackThreadInitializer(final Callback cb, final CallbackThreadInitializer initializer) {
        synchronized (CallbackReference.initializers) {
            if (initializer != null) {
                return CallbackReference.initializers.put(cb, initializer);
            }
            return CallbackReference.initializers.remove(cb);
        }
    }
    
    private static ThreadGroup initializeThread(Callback cb, final CallbackReference$AttachOptions args) {
        if (cb instanceof CallbackReference$DefaultCallbackProxy) {
            cb = ((CallbackReference$DefaultCallbackProxy)cb).getCallback();
        }
        synchronized (CallbackReference.initializers) {
            final CallbackThreadInitializer callbackThreadInitializer = CallbackReference.initializers.get(cb);
        }
        ThreadGroup threadGroup = null;
        final ThreadGroup group;
        if (group != null) {
            threadGroup = ((CallbackThreadInitializer)group).getThreadGroup(cb);
            args.name = ((CallbackThreadInitializer)group).getName(cb);
            args.daemon = ((CallbackThreadInitializer)group).isDaemon(cb);
            args.detach = ((CallbackThreadInitializer)group).detach(cb);
            args.write();
        }
        return threadGroup;
    }
    
    public static Callback getCallback(final Class<?> type, final Pointer p) {
        return getCallback(type, p, false);
    }
    
    private static Callback getCallback(final Class<?> type, final Pointer p, final boolean direct) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: aload_0         /* type */
        //     7: invokevirtual   java/lang/Class.isInterface:()Z
        //    10: ifne            23
        //    13: new             Ljava/lang/IllegalArgumentException;
        //    16: dup            
        //    17: ldc             "Callback type must be an interface"
        //    19: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    22: athrow         
        //    23: iload_2         /* direct */
        //    24: ifeq            33
        //    27: getstatic       com/sun/jna/CallbackReference.directCallbackMap:Ljava/util/Map;
        //    30: goto            36
        //    33: getstatic       com/sun/jna/CallbackReference.callbackMap:Ljava/util/Map;
        //    36: astore          5
        //    38: getstatic       com/sun/jna/CallbackReference.pointerCallbackMap:Ljava/util/Map;
        //    41: dup            
        //    42: astore          6
        //    44: monitorenter   
        //    45: aconst_null    
        //    46: astore          7
        //    48: getstatic       com/sun/jna/CallbackReference.pointerCallbackMap:Ljava/util/Map;
        //    51: aload_1         /* p */
        //    52: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    57: checkcast       Ljava/lang/ref/Reference;
        //    60: astore          8
        //    62: aload           8
        //    64: ifnull          142
        //    67: aload           8
        //    69: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    72: checkcast       Lcom/sun/jna/Callback;
        //    75: astore          ref
        //    77: aload           ref
        //    79: ifnull          136
        //    82: aload_0         /* type */
        //    83: aload           ref
        //    85: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    88: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    91: ifne            136
        //    94: new             Ljava/lang/IllegalStateException;
        //    97: dup            
        //    98: new             Ljava/lang/StringBuilder;
        //   101: dup            
        //   102: invokespecial   java/lang/StringBuilder.<init>:()V
        //   105: ldc             "Pointer "
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: aload_1         /* p */
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   114: ldc             " already mapped to "
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: aload           ref
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   124: ldc             ".\nNative code may be re-using a default function pointer, in which case you may need to use a common Callback class wherever the function pointer is reused."
        //   126: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   129: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   132: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   135: athrow         
        //   136: aload           ref
        //   138: aload           cb
        //   140: monitorexit    
        //   141: areturn        
        //   142: ldc             Lcom/sun/jna/AltCallingConvention;.class
        //   144: aload_0         /* type */
        //   145: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   148: ifeq            156
        //   151: bipush          63
        //   153: goto            157
        //   156: iconst_0       
        //   157: istore          9
        //   159: new             Ljava/util/HashMap;
        //   162: dup            
        //   163: aload_0         /* type */
        //   164: invokestatic    com/sun/jna/Native.getLibraryOptions:(Ljava/lang/Class;)Ljava/util/Map;
        //   167: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   170: astore          10
        //   172: aload           10
        //   174: ldc             "invoking-method"
        //   176: aload_0         /* type */
        //   177: invokestatic    com/sun/jna/CallbackReference.getCallbackMethod:(Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   180: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   185: pop            
        //   186: new             Lcom/sun/jna/CallbackReference$NativeFunctionHandler;
        //   189: dup            
        //   190: aload_1         /* p */
        //   191: iload           foptions
        //   193: aload           10
        //   195: invokespecial   com/sun/jna/CallbackReference$NativeFunctionHandler.<init>:(Lcom/sun/jna/Pointer;ILjava/util/Map;)V
        //   198: astore          11
        //   200: aload_0         /* type */
        //   201: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   204: iconst_1       
        //   205: anewarray       Ljava/lang/Class;
        //   208: dup            
        //   209: iconst_0       
        //   210: aload_0         /* type */
        //   211: aastore        
        //   212: aload           11
        //   214: invokestatic    java/lang/reflect/Proxy.newProxyInstance:(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
        //   217: checkcast       Lcom/sun/jna/Callback;
        //   220: astore          ref
        //   222: aload           5
        //   224: aload           ref
        //   226: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   231: pop            
        //   232: getstatic       com/sun/jna/CallbackReference.pointerCallbackMap:Ljava/util/Map;
        //   235: aload_1         /* p */
        //   236: new             Ljava/lang/ref/WeakReference;
        //   239: dup            
        //   240: aload           ref
        //   242: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //   245: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   250: pop            
        //   251: aload           ref
        //   253: aload           cb
        //   255: monitorexit    
        //   256: areturn        
        //   257: astore          12
        //   259: aload           6
        //   261: monitorexit    
        //   262: aload           12
        //   264: athrow         
        //    Signature:
        //  (Ljava/lang/Class<*>;Lcom/sun/jna/Pointer;Z)Lcom/sun/jna/Callback;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  45     141    257    265    Any
        //  142    256    257    265    Any
        //  257    262    257    265    Any
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
    
    private CallbackReference(final Callback callback, final int callingConvention, final boolean direct) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1         /* callback */
        //     2: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //     5: aload_1         /* callback */
        //     6: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     9: invokestatic    com/sun/jna/Native.getTypeMapper:(Ljava/lang/Class;)Lcom/sun/jna/TypeMapper;
        //    12: astore          6
        //    14: aload_0         /* this */
        //    15: iload_2         /* callingConvention */
        //    16: putfield        com/sun/jna/CallbackReference.callingConvention:I
        //    19: invokestatic    com/sun/jna/Platform.isPPC:()Z
        //    22: istore          7
        //    24: iload_3         /* direct */
        //    25: ifeq            137
        //    28: aload_1         /* callback */
        //    29: invokestatic    com/sun/jna/CallbackReference.getCallbackMethod:(Lcom/sun/jna/Callback;)Ljava/lang/reflect/Method;
        //    32: astore          8
        //    34: aload           8
        //    36: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //    39: astore          9
        //    41: iconst_0       
        //    42: istore          10
        //    44: iload           10
        //    46: aload           i
        //    48: arraylength    
        //    49: if_icmpge       115
        //    52: iload           m
        //    54: ifeq            84
        //    57: aload           i
        //    59: iload           10
        //    61: aaload         
        //    62: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //    65: if_acmpeq       79
        //    68: aload           i
        //    70: iload           10
        //    72: aaload         
        //    73: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //    76: if_acmpne       84
        //    79: iconst_0       
        //    80: istore_3        /* direct */
        //    81: goto            115
        //    84: aload           ppc
        //    86: ifnull          109
        //    89: aload           ppc
        //    91: aload           i
        //    93: iload           10
        //    95: aaload         
        //    96: invokeinterface com/sun/jna/TypeMapper.getFromNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/FromNativeConverter;
        //   101: ifnull          109
        //   104: iconst_0       
        //   105: istore_3        /* direct */
        //   106: goto            115
        //   109: iinc            10, 1
        //   112: goto            44
        //   115: aload           ppc
        //   117: ifnull          137
        //   120: aload           ppc
        //   122: aload           ptypes
        //   124: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   127: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //   132: ifnull          137
        //   135: iconst_0       
        //   136: istore_3        /* direct */
        //   137: aload_1         /* callback */
        //   138: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   141: invokestatic    com/sun/jna/Native.getStringEncoding:(Ljava/lang/Class;)Ljava/lang/String;
        //   144: astore          8
        //   146: lconst_0       
        //   147: lstore          11
        //   149: iload_3         /* direct */
        //   150: ifeq            217
        //   153: aload_0         /* this */
        //   154: aload_1         /* callback */
        //   155: invokestatic    com/sun/jna/CallbackReference.getCallbackMethod:(Lcom/sun/jna/Callback;)Ljava/lang/reflect/Method;
        //   158: putfield        com/sun/jna/CallbackReference.method:Ljava/lang/reflect/Method;
        //   161: aload_0         /* this */
        //   162: getfield        com/sun/jna/CallbackReference.method:Ljava/lang/reflect/Method;
        //   165: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //   168: astore          13
        //   170: aload_0         /* this */
        //   171: getfield        com/sun/jna/CallbackReference.method:Ljava/lang/reflect/Method;
        //   174: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   177: astore          14
        //   179: iconst_1       
        //   180: istore          15
        //   182: aload_1         /* callback */
        //   183: instanceof      Lcom/sun/jna/win32/DLLCallback;
        //   186: ifeq            195
        //   189: iload           15
        //   191: iconst_2       
        //   192: ior            
        //   193: istore          15
        //   195: aload_1         /* callback */
        //   196: aload_0         /* this */
        //   197: getfield        com/sun/jna/CallbackReference.method:Ljava/lang/reflect/Method;
        //   200: aload           returnType
        //   202: aload           flags
        //   204: iload_2         /* callingConvention */
        //   205: iload           15
        //   207: aload           8
        //   209: invokestatic    com/sun/jna/Native.createNativeCallback:(Lcom/sun/jna/Callback;Ljava/lang/reflect/Method;[Ljava/lang/Class;Ljava/lang/Class;IILjava/lang/String;)J
        //   212: lstore          11
        //   214: goto            529
        //   217: aload_1         /* callback */
        //   218: instanceof      Lcom/sun/jna/CallbackProxy;
        //   221: ifeq            235
        //   224: aload_0         /* this */
        //   225: aload_1         /* callback */
        //   226: checkcast       Lcom/sun/jna/CallbackProxy;
        //   229: putfield        com/sun/jna/CallbackReference.proxy:Lcom/sun/jna/CallbackProxy;
        //   232: goto            255
        //   235: aload_0         /* this */
        //   236: new             Lcom/sun/jna/CallbackReference$DefaultCallbackProxy;
        //   239: dup            
        //   240: aload_0         /* this */
        //   241: aload_1         /* callback */
        //   242: invokestatic    com/sun/jna/CallbackReference.getCallbackMethod:(Lcom/sun/jna/Callback;)Ljava/lang/reflect/Method;
        //   245: aload           ppc
        //   247: aload           8
        //   249: invokespecial   com/sun/jna/CallbackReference$DefaultCallbackProxy.<init>:(Lcom/sun/jna/CallbackReference;Ljava/lang/reflect/Method;Lcom/sun/jna/TypeMapper;Ljava/lang/String;)V
        //   252: putfield        com/sun/jna/CallbackReference.proxy:Lcom/sun/jna/CallbackProxy;
        //   255: aload_0         /* this */
        //   256: getfield        com/sun/jna/CallbackReference.proxy:Lcom/sun/jna/CallbackProxy;
        //   259: invokeinterface com/sun/jna/CallbackProxy.getParameterTypes:()[Ljava/lang/Class;
        //   264: astore          13
        //   266: aload_0         /* this */
        //   267: getfield        com/sun/jna/CallbackReference.proxy:Lcom/sun/jna/CallbackProxy;
        //   270: invokeinterface com/sun/jna/CallbackProxy.getReturnType:()Ljava/lang/Class;
        //   275: astore          14
        //   277: aload           ppc
        //   279: ifnull          355
        //   282: iconst_0       
        //   283: istore          15
        //   285: iload           15
        //   287: aload           returnType
        //   289: arraylength    
        //   290: if_icmpge       330
        //   293: aload           ppc
        //   295: aload           returnType
        //   297: iload           15
        //   299: aaload         
        //   300: invokeinterface com/sun/jna/TypeMapper.getFromNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/FromNativeConverter;
        //   305: astore          16
        //   307: aload           16
        //   309: ifnull          324
        //   312: aload           returnType
        //   314: iload           rc
        //   316: aload           16
        //   318: invokeinterface com/sun/jna/FromNativeConverter.nativeType:()Ljava/lang/Class;
        //   323: aastore        
        //   324: iinc            rc, 1
        //   327: goto            285
        //   330: aload           ppc
        //   332: aload           14
        //   334: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //   339: astore          15
        //   341: aload           15
        //   343: ifnull          355
        //   346: aload           15
        //   348: invokeinterface com/sun/jna/ToNativeConverter.nativeType:()Ljava/lang/Class;
        //   353: astore          tn
        //   355: iconst_0       
        //   356: istore          15
        //   358: iload           15
        //   360: aload           returnType
        //   362: arraylength    
        //   363: if_icmpge       439
        //   366: aload           returnType
        //   368: iload           15
        //   370: aload_0         /* this */
        //   371: aload           returnType
        //   373: iload           15
        //   375: aaload         
        //   376: invokespecial   com/sun/jna/CallbackReference.getNativeType:(Ljava/lang/Class;)Ljava/lang/Class;
        //   379: aastore        
        //   380: aload           returnType
        //   382: iload           15
        //   384: aaload         
        //   385: invokestatic    com/sun/jna/CallbackReference.isAllowableNativeType:(Ljava/lang/Class;)Z
        //   388: ifne            433
        //   391: new             Ljava/lang/StringBuilder;
        //   394: dup            
        //   395: invokespecial   java/lang/StringBuilder.<init>:()V
        //   398: ldc_w           "Callback argument "
        //   401: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   404: aload           returnType
        //   406: iload           15
        //   408: aaload         
        //   409: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   412: ldc_w           " requires custom type conversion"
        //   415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   418: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   421: astore          16
        //   423: new             Ljava/lang/IllegalArgumentException;
        //   426: dup            
        //   427: aload           16
        //   429: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   432: athrow         
        //   433: iinc            msg, 1
        //   436: goto            358
        //   439: aload_0         /* this */
        //   440: aload           14
        //   442: invokespecial   com/sun/jna/CallbackReference.getNativeType:(Ljava/lang/Class;)Ljava/lang/Class;
        //   445: astore          14
        //   447: aload           14
        //   449: invokestatic    com/sun/jna/CallbackReference.isAllowableNativeType:(Ljava/lang/Class;)Z
        //   452: ifne            494
        //   455: new             Ljava/lang/StringBuilder;
        //   458: dup            
        //   459: invokespecial   java/lang/StringBuilder.<init>:()V
        //   462: ldc_w           "Callback return type "
        //   465: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   468: aload           14
        //   470: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   473: ldc_w           " requires custom type conversion"
        //   476: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   479: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   482: astore          15
        //   484: new             Ljava/lang/IllegalArgumentException;
        //   487: dup            
        //   488: aload           15
        //   490: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   493: athrow         
        //   494: aload_1         /* callback */
        //   495: instanceof      Lcom/sun/jna/win32/DLLCallback;
        //   498: ifeq            505
        //   501: iconst_2       
        //   502: goto            506
        //   505: iconst_0       
        //   506: istore          15
        //   508: aload_0         /* this */
        //   509: getfield        com/sun/jna/CallbackReference.proxy:Lcom/sun/jna/CallbackProxy;
        //   512: getstatic       com/sun/jna/CallbackReference.PROXY_CALLBACK_METHOD:Ljava/lang/reflect/Method;
        //   515: aload           returnType
        //   517: aload           flags
        //   519: iload_2         /* callingConvention */
        //   520: iload           15
        //   522: aload           8
        //   524: invokestatic    com/sun/jna/Native.createNativeCallback:(Lcom/sun/jna/Callback;Ljava/lang/reflect/Method;[Ljava/lang/Class;Ljava/lang/Class;IILjava/lang/String;)J
        //   527: lstore          11
        //   529: aload_0         /* this */
        //   530: lload           11
        //   532: lconst_0       
        //   533: lcmp           
        //   534: ifeq            549
        //   537: new             Lcom/sun/jna/Pointer;
        //   540: dup            
        //   541: lload           11
        //   543: invokespecial   com/sun/jna/Pointer.<init>:(J)V
        //   546: goto            550
        //   549: aconst_null    
        //   550: putfield        com/sun/jna/CallbackReference.cbstruct:Lcom/sun/jna/Pointer;
        //   553: getstatic       com/sun/jna/CallbackReference.allocatedMemory:Ljava/util/Map;
        //   556: aload_0         /* this */
        //   557: new             Ljava/lang/ref/WeakReference;
        //   560: dup            
        //   561: aload_0         /* this */
        //   562: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //   565: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   570: pop            
        //   571: return         
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
    
    private Class<?> getNativeType(final Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls)) {
            Structure.validate(cls);
            if (!Structure$ByValue.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        }
        else {
            if (NativeMapped.class.isAssignableFrom(cls)) {
                return NativeMappedConverter.getInstance(cls).nativeType();
            }
            if (cls == String.class || cls == WString.class || cls == String[].class || cls == WString[].class || Callback.class.isAssignableFrom(cls)) {
                return Pointer.class;
            }
        }
        return cls;
    }
    
    private static Method checkMethod(final Method m) {
        if (m.getParameterTypes().length > 256) {
            throw new UnsupportedOperationException("Method signature exceeds the maximum parameter count: " + m);
        }
        return m;
    }
    
    public static Class<?> findCallbackClass(final Class<?> type) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_0         /* type */
        //     3: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //     6: ifne            40
        //     9: new             Ljava/lang/IllegalArgumentException;
        //    12: dup            
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: aload_0         /* type */
        //    21: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: ldc_w           " is not derived from com.sun.jna.Callback"
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    36: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    39: athrow         
        //    40: aload_0         /* type */
        //    41: invokevirtual   java/lang/Class.isInterface:()Z
        //    44: ifeq            49
        //    47: aload_0         /* type */
        //    48: areturn        
        //    49: aload_0         /* type */
        //    50: invokevirtual   java/lang/Class.getInterfaces:()[Ljava/lang/Class;
        //    53: astore_3       
        //    54: iconst_0       
        //    55: istore          4
        //    57: iload           4
        //    59: aload_3         /* i */
        //    60: arraylength    
        //    61: if_icmpge       100
        //    64: ldc             Lcom/sun/jna/Callback;.class
        //    66: aload_3         /* i */
        //    67: iload           4
        //    69: aaload         
        //    70: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    73: ifeq            94
        //    76: aload_3         /* i */
        //    77: iload           4
        //    79: aaload         
        //    80: invokestatic    com/sun/jna/CallbackReference.getCallbackMethod:(Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    83: pop            
        //    84: aload_3         /* i */
        //    85: iload           4
        //    87: aaload         
        //    88: areturn        
        //    89: astore          5
        //    91: goto            100
        //    94: iinc            e, 1
        //    97: goto            57
        //   100: ldc             Lcom/sun/jna/Callback;.class
        //   102: aload_0         /* type */
        //   103: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //   106: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   109: ifeq            120
        //   112: aload_0         /* type */
        //   113: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //   116: invokestatic    com/sun/jna/CallbackReference.findCallbackClass:(Ljava/lang/Class;)Ljava/lang/Class;
        //   119: areturn        
        //   120: aload_0         /* type */
        //   121: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;)Ljava/lang/Class<*>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  76     88     89     94     Ljava/lang/IllegalArgumentException;
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
    
    private static Method getCallbackMethod(final Callback callback) {
        return getCallbackMethod(findCallbackClass(callback.getClass()));
    }
    
    private static Method getCallbackMethod(final Class<?> cls) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Class.getDeclaredMethods:()[Ljava/lang/reflect/Method;
        //     4: astore_3       
        //     5: aload_0         /* cls */
        //     6: invokevirtual   java/lang/Class.getMethods:()[Ljava/lang/reflect/Method;
        //     9: astore          4
        //    11: new             Ljava/util/HashSet;
        //    14: dup            
        //    15: aload_3         /* classMethods */
        //    16: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //    19: invokespecial   java/util/HashSet.<init>:(Ljava/util/Collection;)V
        //    22: astore          5
        //    24: aload           5
        //    26: aload           pmethods
        //    28: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //    31: invokeinterface java/util/Set.retainAll:(Ljava/util/Collection;)Z
        //    36: pop            
        //    37: aload           5
        //    39: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    44: astore          6
        //    46: aload           6
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            94
        //    56: aload           6
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: checkcast       Ljava/lang/reflect/Method;
        //    66: astore          7
        //    68: getstatic       com/sun/jna/Callback.FORBIDDEN_NAMES:Ljava/util/List;
        //    71: aload           7
        //    73: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //    76: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //    81: ifeq            91
        //    84: aload           m
        //    86: invokeinterface java/util/Iterator.remove:()V
        //    91: goto            46
        //    94: aload           i
        //    96: aload           5
        //    98: invokeinterface java/util/Set.size:()I
        //   103: anewarray       Ljava/lang/reflect/Method;
        //   106: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   111: checkcast       [Ljava/lang/reflect/Method;
        //   114: astore          6
        //   116: aload           6
        //   118: arraylength    
        //   119: iconst_1       
        //   120: if_icmpne       131
        //   123: aload           6
        //   125: iconst_0       
        //   126: aaload         
        //   127: invokestatic    com/sun/jna/CallbackReference.checkMethod:(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;
        //   130: areturn        
        //   131: iconst_0       
        //   132: istore          7
        //   134: iload           7
        //   136: aload           i
        //   138: arraylength    
        //   139: if_icmpge       175
        //   142: aload           i
        //   144: iload           7
        //   146: aaload         
        //   147: astore          8
        //   149: ldc_w           "callback"
        //   152: aload           8
        //   154: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //   157: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   160: ifeq            169
        //   163: aload           8
        //   165: invokestatic    com/sun/jna/CallbackReference.checkMethod:(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;
        //   168: areturn        
        //   169: iinc            m, 1
        //   172: goto            134
        //   175: ldc_w           "Callback must implement a single public method, or one public method named 'callback'"
        //   178: astore          7
        //   180: new             Ljava/lang/IllegalArgumentException;
        //   183: dup            
        //   184: aload           7
        //   186: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   189: athrow         
        //    Signature:
        //  (Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;
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
    
    private void setCallbackOptions(final int options) {
        this.cbstruct.setInt(Pointer.SIZE, options);
    }
    
    public Pointer getTrampoline() {
        if (this.trampoline == null) {
            this.trampoline = this.cbstruct.getPointer(0L);
        }
        return this.trampoline;
    }
    
    protected void finalize() {
        this.dispose();
    }
    
    public synchronized void dispose() {
        if (this.cbstruct != null) {
            try {
                Native.freeNativeCallback(this.cbstruct.peer);
            }
            finally {
                this.cbstruct.peer = 0L;
                this.cbstruct = null;
                CallbackReference.allocatedMemory.remove(this);
            }
        }
    }
    
    public static void disposeAll() {
        final Iterator iterator = new LinkedList(CallbackReference.allocatedMemory.keySet()).iterator();
        while (iterator.hasNext()) {
            ((CallbackReference)iterator.next()).dispose();
        }
    }
    
    private Callback getCallback() {
        return this.get();
    }
    
    private static Pointer getNativeFunctionPointer(final Callback cb) {
        if (Proxy.isProxyClass(cb.getClass())) {
            final InvocationHandler invocationHandler = Proxy.getInvocationHandler(cb);
            if (invocationHandler instanceof CallbackReference$NativeFunctionHandler) {
                return ((CallbackReference$NativeFunctionHandler)invocationHandler).getPointer();
            }
        }
        return null;
    }
    
    public static Pointer getFunctionPointer(final Callback cb) {
        return getFunctionPointer(cb, false);
    }
    
    private static Pointer getFunctionPointer(final Callback cb, final boolean direct) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: aload_0         /* cb */
        //     4: ifnonnull       9
        //     7: aconst_null    
        //     8: areturn        
        //     9: aload_0         /* cb */
        //    10: invokestatic    com/sun/jna/CallbackReference.getNativeFunctionPointer:(Lcom/sun/jna/Callback;)Lcom/sun/jna/Pointer;
        //    13: dup            
        //    14: astore          4
        //    16: ifnull          22
        //    19: aload           4
        //    21: areturn        
        //    22: aload_0         /* cb */
        //    23: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    26: invokestatic    com/sun/jna/Native.getLibraryOptions:(Ljava/lang/Class;)Ljava/util/Map;
        //    29: astore          5
        //    31: aload_0         /* cb */
        //    32: instanceof      Lcom/sun/jna/AltCallingConvention;
        //    35: ifeq            43
        //    38: bipush          63
        //    40: goto            81
        //    43: aload           5
        //    45: ifnull          80
        //    48: aload           5
        //    50: ldc_w           "calling-convention"
        //    53: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    58: ifeq            80
        //    61: aload           5
        //    63: ldc_w           "calling-convention"
        //    66: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    71: checkcast       Ljava/lang/Integer;
        //    74: invokevirtual   java/lang/Integer.intValue:()I
        //    77: goto            81
        //    80: iconst_0       
        //    81: istore          6
        //    83: iload_1         /* direct */
        //    84: ifeq            93
        //    87: getstatic       com/sun/jna/CallbackReference.directCallbackMap:Ljava/util/Map;
        //    90: goto            96
        //    93: getstatic       com/sun/jna/CallbackReference.callbackMap:Ljava/util/Map;
        //    96: astore          7
        //    98: getstatic       com/sun/jna/CallbackReference.pointerCallbackMap:Ljava/util/Map;
        //   101: dup            
        //   102: astore          8
        //   104: monitorenter   
        //   105: aload           7
        //   107: aload_0         /* cb */
        //   108: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   113: checkcast       Lcom/sun/jna/CallbackReference;
        //   116: astore          9
        //   118: aload           9
        //   120: ifnonnull       187
        //   123: new             Lcom/sun/jna/CallbackReference;
        //   126: dup            
        //   127: aload_0         /* cb */
        //   128: iload           map
        //   130: iload_1         /* direct */
        //   131: invokespecial   com/sun/jna/CallbackReference.<init>:(Lcom/sun/jna/Callback;IZ)V
        //   134: astore          9
        //   136: aload           7
        //   138: aload_0         /* cb */
        //   139: aload           9
        //   141: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   146: pop            
        //   147: getstatic       com/sun/jna/CallbackReference.pointerCallbackMap:Ljava/util/Map;
        //   150: aload           9
        //   152: invokevirtual   com/sun/jna/CallbackReference.getTrampoline:()Lcom/sun/jna/Pointer;
        //   155: new             Ljava/lang/ref/WeakReference;
        //   158: dup            
        //   159: aload_0         /* cb */
        //   160: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //   163: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   168: pop            
        //   169: getstatic       com/sun/jna/CallbackReference.initializers:Ljava/util/Map;
        //   172: aload_0         /* cb */
        //   173: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   178: ifeq            187
        //   181: aload           9
        //   183: iconst_1       
        //   184: invokespecial   com/sun/jna/CallbackReference.setCallbackOptions:(I)V
        //   187: aload           9
        //   189: invokevirtual   com/sun/jna/CallbackReference.getTrampoline:()Lcom/sun/jna/Pointer;
        //   192: aload           cbref
        //   194: monitorexit    
        //   195: areturn        
        //   196: astore          10
        //   198: aload           8
        //   200: monitorexit    
        //   201: aload           10
        //   203: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  105    195    196    204    Any
        //  196    201    196    204    Any
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
    
    private static boolean isAllowableNativeType(final Class<?> cls) {
        return cls == Void.TYPE || cls == Void.class || cls == Boolean.TYPE || cls == Boolean.class || cls == Byte.TYPE || cls == Byte.class || cls == Short.TYPE || cls == Short.class || cls == Character.TYPE || cls == Character.class || cls == Integer.TYPE || cls == Integer.class || cls == Long.TYPE || cls == Long.class || cls == Float.TYPE || cls == Float.class || cls == Double.TYPE || cls == Double.class || (Structure$ByValue.class.isAssignableFrom(cls) && Structure.class.isAssignableFrom(cls)) || Pointer.class.isAssignableFrom(cls);
    }
    
    private static Pointer getNativeString(final Object value, final boolean wide) {
        if (value != null) {
            final NativeString nativeString = new NativeString(value.toString(), wide);
            CallbackReference.allocations.put(value, nativeString);
            return nativeString.getPointer();
        }
        return null;
    }
    
    static {
        callbackMap = new WeakHashMap<Callback, CallbackReference>();
        directCallbackMap = new WeakHashMap<Callback, CallbackReference>();
        pointerCallbackMap = new WeakHashMap<Pointer, Reference<Callback>>();
        allocations = new WeakHashMap<Object, Object>();
        allocatedMemory = Collections.synchronizedMap(new WeakHashMap<CallbackReference, Reference<CallbackReference>>());
        try {
            PROXY_CALLBACK_METHOD = CallbackProxy.class.getMethod("callback", Object[].class);
        }
        catch (final Exception ex) {
            throw new Error("Error looking up CallbackProxy.callback() method");
        }
        initializers = new WeakHashMap<Callback, CallbackThreadInitializer>();
    }
}

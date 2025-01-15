// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

public class Library$Handler implements InvocationHandler
{
    public static final Method OBJECT_TOSTRING;
    public static final Method OBJECT_HASHCODE;
    public static final Method OBJECT_EQUALS;
    private final NativeLibrary nativeLibrary;
    private final Class<?> interfaceClass;
    private final Map<String, Object> options;
    private final InvocationMapper invocationMapper;
    private final Map<Method, Library$Handler$FunctionInfo> functions;
    
    public Library$Handler(final String libname, final Class<?> interfaceClass, final Map<String, ?> options) {
        this.functions = new WeakHashMap<Method, Library$Handler$FunctionInfo>();
        if (libname != null && "".equals(libname.trim())) {
            throw new IllegalArgumentException("Invalid library name \"" + libname + "\"");
        }
        if (!interfaceClass.isInterface()) {
            throw new IllegalArgumentException(libname + " does not implement an interface: " + interfaceClass.getName());
        }
        this.interfaceClass = interfaceClass;
        this.options = new HashMap<String, Object>(options);
        final int i = AltCallingConvention.class.isAssignableFrom(interfaceClass) ? 63 : 0;
        if (this.options.get("calling-convention") == null) {
            this.options.put("calling-convention", i);
        }
        if (this.options.get("classloader") == null) {
            this.options.put("classloader", interfaceClass.getClassLoader());
        }
        this.nativeLibrary = NativeLibrary.getInstance(libname, this.options);
        this.invocationMapper = this.options.get("invocation-mapper");
    }
    
    public NativeLibrary getNativeLibrary() {
        return this.nativeLibrary;
    }
    
    public String getLibraryName() {
        return this.nativeLibrary.getName();
    }
    
    public Class<?> getInterfaceClass() {
        return this.interfaceClass;
    }
    
    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] inArgs) throws Throwable {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_2         /* method */
        //     4: invokevirtual   java/lang/reflect/Method.equals:(Ljava/lang/Object;)Z
        //     7: ifeq            33
        //    10: new             Ljava/lang/StringBuilder;
        //    13: dup            
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: ldc             "Proxy interface to "
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: aload_0         /* this */
        //    23: getfield        com/sun/jna/Library$Handler.nativeLibrary:Lcom/sun/jna/NativeLibrary;
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    29: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    32: areturn        
        //    33: getstatic       com/sun/jna/Library$Handler.OBJECT_HASHCODE:Ljava/lang/reflect/Method;
        //    36: aload_2         /* method */
        //    37: invokevirtual   java/lang/reflect/Method.equals:(Ljava/lang/Object;)Z
        //    40: ifeq            51
        //    43: aload_0         /* this */
        //    44: invokevirtual   java/lang/Object.hashCode:()I
        //    47: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    50: areturn        
        //    51: getstatic       com/sun/jna/Library$Handler.OBJECT_EQUALS:Ljava/lang/reflect/Method;
        //    54: aload_2         /* method */
        //    55: invokevirtual   java/lang/reflect/Method.equals:(Ljava/lang/Object;)Z
        //    58: ifeq            104
        //    61: aload_3         /* inArgs */
        //    62: iconst_0       
        //    63: aaload         
        //    64: astore          6
        //    66: aload           6
        //    68: ifnull          100
        //    71: aload           6
        //    73: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    76: invokestatic    java/lang/reflect/Proxy.isProxyClass:(Ljava/lang/Class;)Z
        //    79: ifeq            100
        //    82: aload           6
        //    84: invokestatic    java/lang/reflect/Proxy.getInvocationHandler:(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
        //    87: aload_0         /* this */
        //    88: if_acmpne       95
        //    91: iconst_1       
        //    92: goto            96
        //    95: iconst_0       
        //    96: invokestatic    com/sun/jna/Function.valueOf:(Z)Ljava/lang/Boolean;
        //    99: areturn        
        //   100: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   103: areturn        
        //   104: aload_0         /* this */
        //   105: getfield        com/sun/jna/Library$Handler.functions:Ljava/util/Map;
        //   108: aload_2         /* method */
        //   109: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   114: checkcast       Lcom/sun/jna/Library$Handler$FunctionInfo;
        //   117: astore          6
        //   119: aload           6
        //   121: ifnonnull       288
        //   124: aload_0         /* this */
        //   125: getfield        com/sun/jna/Library$Handler.functions:Ljava/util/Map;
        //   128: dup            
        //   129: astore          7
        //   131: monitorenter   
        //   132: aload_0         /* this */
        //   133: getfield        com/sun/jna/Library$Handler.functions:Ljava/util/Map;
        //   136: aload_2         /* method */
        //   137: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   142: checkcast       Lcom/sun/jna/Library$Handler$FunctionInfo;
        //   145: astore          6
        //   147: aload           6
        //   149: ifnonnull       274
        //   152: aload_2         /* method */
        //   153: invokestatic    com/sun/jna/Function.isVarArgs:(Ljava/lang/reflect/Method;)Z
        //   156: istore          8
        //   158: aconst_null    
        //   159: astore          9
        //   161: aload_0         /* this */
        //   162: getfield        com/sun/jna/Library$Handler.invocationMapper:Lcom/sun/jna/InvocationMapper;
        //   165: ifnull          184
        //   168: aload_0         /* this */
        //   169: getfield        com/sun/jna/Library$Handler.invocationMapper:Lcom/sun/jna/InvocationMapper;
        //   172: aload_0         /* this */
        //   173: getfield        com/sun/jna/Library$Handler.nativeLibrary:Lcom/sun/jna/NativeLibrary;
        //   176: aload_2         /* method */
        //   177: invokeinterface com/sun/jna/InvocationMapper.getInvocationHandler:(Lcom/sun/jna/NativeLibrary;Ljava/lang/reflect/Method;)Ljava/lang/reflect/InvocationHandler;
        //   182: astore          9
        //   184: aconst_null    
        //   185: astore          10
        //   187: aconst_null    
        //   188: astore          11
        //   190: aconst_null    
        //   191: astore          12
        //   193: aload           function
        //   195: ifnonnull       242
        //   198: aload_0         /* this */
        //   199: getfield        com/sun/jna/Library$Handler.nativeLibrary:Lcom/sun/jna/NativeLibrary;
        //   202: aload_2         /* method */
        //   203: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //   206: aload_2         /* method */
        //   207: invokevirtual   com/sun/jna/NativeLibrary.getFunction:(Ljava/lang/String;Ljava/lang/reflect/Method;)Lcom/sun/jna/Function;
        //   210: astore          parameterTypes
        //   212: aload_2         /* method */
        //   213: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //   216: astore          options
        //   218: new             Ljava/util/HashMap;
        //   221: dup            
        //   222: aload_0         /* this */
        //   223: getfield        com/sun/jna/Library$Handler.options:Ljava/util/Map;
        //   226: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   229: astore          12
        //   231: aload           12
        //   233: ldc             "invoking-method"
        //   235: aload_2         /* method */
        //   236: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   241: pop            
        //   242: new             Lcom/sun/jna/Library$Handler$FunctionInfo;
        //   245: dup            
        //   246: aload           function
        //   248: aload           parameterTypes
        //   250: aload           options
        //   252: iload           handler
        //   254: aload           12
        //   256: invokespecial   com/sun/jna/Library$Handler$FunctionInfo.<init>:(Ljava/lang/reflect/InvocationHandler;Lcom/sun/jna/Function;[Ljava/lang/Class;ZLjava/util/Map;)V
        //   259: astore          6
        //   261: aload_0         /* this */
        //   262: getfield        com/sun/jna/Library$Handler.functions:Ljava/util/Map;
        //   265: aload_2         /* method */
        //   266: aload           6
        //   268: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   273: pop            
        //   274: aload           isVarArgs
        //   276: monitorexit    
        //   277: goto            288
        //   280: astore          13
        //   282: aload           7
        //   284: monitorexit    
        //   285: aload           13
        //   287: athrow         
        //   288: aload           6
        //   290: getfield        com/sun/jna/Library$Handler$FunctionInfo.isVarArgs:Z
        //   293: ifeq            301
        //   296: aload_3         /* inArgs */
        //   297: invokestatic    com/sun/jna/Function.concatenateVarArgs:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   300: astore_3        /* inArgs */
        //   301: aload           6
        //   303: getfield        com/sun/jna/Library$Handler$FunctionInfo.handler:Ljava/lang/reflect/InvocationHandler;
        //   306: ifnull          323
        //   309: aload           6
        //   311: getfield        com/sun/jna/Library$Handler$FunctionInfo.handler:Ljava/lang/reflect/InvocationHandler;
        //   314: aload_1         /* proxy */
        //   315: aload_2         /* method */
        //   316: aload_3         /* inArgs */
        //   317: invokeinterface java/lang/reflect/InvocationHandler.invoke:(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
        //   322: areturn        
        //   323: aload           6
        //   325: getfield        com/sun/jna/Library$Handler$FunctionInfo.function:Lcom/sun/jna/Function;
        //   328: aload_2         /* method */
        //   329: aload           6
        //   331: getfield        com/sun/jna/Library$Handler$FunctionInfo.parameterTypes:[Ljava/lang/Class;
        //   334: aload_2         /* method */
        //   335: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   338: aload_3         /* inArgs */
        //   339: aload           6
        //   341: getfield        com/sun/jna/Library$Handler$FunctionInfo.options:Ljava/util/Map;
        //   344: invokevirtual   com/sun/jna/Function.invoke:(Ljava/lang/reflect/Method;[Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
        //   347: areturn        
        //    Exceptions:
        //  throws java.lang.Throwable
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  132    277    280    288    Any
        //  280    285    280    288    Any
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
    
    static {
        try {
            OBJECT_TOSTRING = Object.class.getMethod("toString", (Class<?>[])new Class[0]);
            OBJECT_HASHCODE = Object.class.getMethod("hashCode", (Class<?>[])new Class[0]);
            OBJECT_EQUALS = Object.class.getMethod("equals", Object.class);
        }
        catch (final Exception ex) {
            throw new Error("Error retrieving Object.toString() method");
        }
    }
}

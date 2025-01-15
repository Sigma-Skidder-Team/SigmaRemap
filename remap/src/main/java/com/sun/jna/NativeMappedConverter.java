// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.WeakHashMap;
import java.lang.ref.Reference;
import java.util.Map;

public class NativeMappedConverter implements TypeConverter
{
    private static final Map<Class<?>, Reference<NativeMappedConverter>> converters;
    private final Class<?> type;
    private final Class<?> nativeType;
    private final NativeMapped instance;
    
    public static NativeMappedConverter getInstance(final Class<?> cls) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: astore_3       
        //     5: monitorenter   
        //     6: getstatic       com/sun/jna/NativeMappedConverter.converters:Ljava/util/Map;
        //     9: aload_0         /* cls */
        //    10: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    15: checkcast       Ljava/lang/ref/Reference;
        //    18: astore          4
        //    20: aload           4
        //    22: ifnull          36
        //    25: aload           4
        //    27: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    30: checkcast       Lcom/sun/jna/NativeMappedConverter;
        //    33: goto            37
        //    36: aconst_null    
        //    37: astore          5
        //    39: aload           5
        //    41: ifnonnull       73
        //    44: new             Lcom/sun/jna/NativeMappedConverter;
        //    47: dup            
        //    48: aload_0         /* cls */
        //    49: invokespecial   com/sun/jna/NativeMappedConverter.<init>:(Ljava/lang/Class;)V
        //    52: astore          5
        //    54: getstatic       com/sun/jna/NativeMappedConverter.converters:Ljava/util/Map;
        //    57: aload_0         /* cls */
        //    58: new             Ljava/lang/ref/SoftReference;
        //    61: dup            
        //    62: aload           5
        //    64: invokespecial   java/lang/ref/SoftReference.<init>:(Ljava/lang/Object;)V
        //    67: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    72: pop            
        //    73: aload           5
        //    75: aload_3        
        //    76: monitorexit    
        //    77: areturn        
        //    78: astore          6
        //    80: aload_3        
        //    81: monitorexit    
        //    82: aload           6
        //    84: athrow         
        //    Signature:
        //  (Ljava/lang/Class<*>;)Lcom/sun/jna/NativeMappedConverter;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  6      77     78     85     Any
        //  78     82     78     85     Any
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
    
    public NativeMappedConverter(final Class<?> type) {
        if (!NativeMapped.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException("Type must derive from " + NativeMapped.class);
        }
        this.type = type;
        this.instance = this.defaultValue();
        this.nativeType = this.instance.nativeType();
    }
    
    public NativeMapped defaultValue() {
        try {
            return (NativeMapped)this.type.newInstance();
        }
        catch (final InstantiationException obj) {
            throw new IllegalArgumentException("Can't create an instance of " + this.type + ", requires a no-arg constructor: " + obj);
        }
        catch (final IllegalAccessException obj2) {
            throw new IllegalArgumentException("Not allowed to create an instance of " + this.type + ", requires a public, no-arg constructor: " + obj2);
        }
    }
    
    @Override
    public Object fromNative(final Object nativeValue, final FromNativeContext context) {
        return this.instance.fromNative(nativeValue, context);
    }
    
    @Override
    public Class<?> nativeType() {
        return this.nativeType;
    }
    
    @Override
    public Object toNative(Object value, final ToNativeContext context) {
        if (value == null) {
            if (Pointer.class.isAssignableFrom(this.nativeType)) {
                return null;
            }
            value = this.defaultValue();
        }
        return ((NativeMapped)value).toNative();
    }
    
    static {
        converters = new WeakHashMap<Class<?>, Reference<NativeMappedConverter>>();
    }
}

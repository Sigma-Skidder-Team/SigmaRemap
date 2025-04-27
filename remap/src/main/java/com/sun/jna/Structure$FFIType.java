// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.WeakHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Map;

public class Structure$FFIType extends Structure
{
    private static final Map<Object, Object> typeInfoMap;
    private static final int FFI_TYPE_STRUCT = 13;
    public Structure$FFIType$size_t size;
    public short alignment;
    public short type;
    public Pointer elements;
    
    private Structure$FFIType(final Structure ref) {
        this.type = 13;
        Structure.access$1900(ref, true);
        Pointer[] els2;
        if (ref instanceof Union) {
            final Structure$StructField typeInfoField = ref.typeInfoField();
            els2 = new Pointer[] { get(ref.getFieldValue(typeInfoField.field), typeInfoField.type), null };
        }
        else {
            els2 = new Pointer[ref.fields().size() + 1];
            Pointer[] els = (Object)0;
            final Iterator<Structure$StructField> iterator = ref.fields().values().iterator();
            while (iterator.hasNext()) {
                els2[els++] = ref.getFieldTypeInfo(iterator.next());
            }
        }
        this.init(els2);
    }
    
    private Structure$FFIType(final Object array, final Class<?> type) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/sun/jna/Structure.<init>:()V
        //     4: aload_0         /* this */
        //     5: bipush          13
        //     7: putfield        com/sun/jna/Structure$FFIType.type:S
        //    10: aload_1         /* array */
        //    11: invokestatic    java/lang/reflect/Array.getLength:(Ljava/lang/Object;)I
        //    14: istore          5
        //    16: iload           5
        //    18: iconst_1       
        //    19: iadd           
        //    20: anewarray       Lcom/sun/jna/Pointer;
        //    23: astore          6
        //    25: aconst_null    
        //    26: aload_2         /* type */
        //    27: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //    30: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;Ljava/lang/Class;)Lcom/sun/jna/Pointer;
        //    33: astore          7
        //    35: iconst_0       
        //    36: istore          8
        //    38: iload           8
        //    40: iload           els
        //    42: if_icmpge       58
        //    45: aload           p
        //    47: iload           8
        //    49: aload           i
        //    51: aastore        
        //    52: iinc            8, 1
        //    55: goto            38
        //    58: aload_0         /* this */
        //    59: aload           p
        //    61: invokespecial   com/sun/jna/Structure$FFIType.init:([Lcom/sun/jna/Pointer;)V
        //    64: return         
        //    Signature:
        //  (Ljava/lang/Object;Ljava/lang/Class<*>;)V
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
    
    @Override
    public List<String> getFieldOrder() {
        return Arrays.asList("size", "alignment", "type", "elements");
    }
    
    private void init(final Pointer[] els) {
        (this.elements = new Memory((long) Pointer.SIZE * els.length)).write(0L, els, 0, els.length);
        this.write();
    }
    
    public static Pointer get(final Object obj) {
        if (obj == null) {
            return Structure$FFIType$FFITypes.access$1800();
        }
        if (obj instanceof Class) {
            return get(null, (Class<?>)obj);
        }
        return get(obj, obj.getClass());
    }
    
    private static Pointer get(final Object obj, final Class<?> cls) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    com/sun/jna/Native.getTypeMapper:(Ljava/lang/Class;)Lcom/sun/jna/TypeMapper;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          34
        //    11: aload           4
        //    13: aload_1         /* cls */
        //    14: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //    19: astore          5
        //    21: aload           5
        //    23: ifnull          34
        //    26: aload           5
        //    28: invokeinterface com/sun/jna/ToNativeConverter.nativeType:()Ljava/lang/Class;
        //    33: astore_1        /* cls */
        //    34: getstatic       com/sun/jna/Structure$FFIType.typeInfoMap:Ljava/util/Map;
        //    37: dup            
        //    38: astore          5
        //    40: monitorenter   
        //    41: getstatic       com/sun/jna/Structure$FFIType.typeInfoMap:Ljava/util/Map;
        //    44: aload_1         /* cls */
        //    45: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    50: astore          6
        //    52: aload           6
        //    54: instanceof      Lcom/sun/jna/Pointer;
        //    57: ifeq            69
        //    60: aload           6
        //    62: checkcast       Lcom/sun/jna/Pointer;
        //    65: aload           o
        //    67: monitorexit    
        //    68: areturn        
        //    69: aload           6
        //    71: instanceof      Lcom/sun/jna/Structure$FFIType;
        //    74: ifeq            89
        //    77: aload           6
        //    79: checkcast       Lcom/sun/jna/Structure$FFIType;
        //    82: invokevirtual   com/sun/jna/Structure$FFIType.getPointer:()Lcom/sun/jna/Pointer;
        //    85: aload           o
        //    87: monitorexit    
        //    88: areturn        
        //    89: getstatic       com/sun/jna/Platform.HAS_BUFFERS:Z
        //    92: ifeq            104
        //    95: ldc             Ljava/nio/Buffer;.class
        //    97: aload_1         /* cls */
        //    98: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   101: ifne            113
        //   104: ldc             Lcom/sun/jna/Callback;.class
        //   106: aload_1         /* cls */
        //   107: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   110: ifeq            133
        //   113: getstatic       com/sun/jna/Structure$FFIType.typeInfoMap:Ljava/util/Map;
        //   116: aload_1         /* cls */
        //   117: invokestatic    com/sun/jna/Structure$FFIType$FFITypes.access$1800:()Lcom/sun/jna/Pointer;
        //   120: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   125: pop            
        //   126: invokestatic    com/sun/jna/Structure$FFIType$FFITypes.access$1800:()Lcom/sun/jna/Pointer;
        //   129: aload           o
        //   131: monitorexit    
        //   132: areturn        
        //   133: ldc             Lcom/sun/jna/Structure;.class
        //   135: aload_1         /* cls */
        //   136: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   139: ifeq            217
        //   142: aload_0         /* obj */
        //   143: ifnonnull       154
        //   146: aload_1         /* cls */
        //   147: invokestatic    com/sun/jna/Structure.access$2000:()Lcom/sun/jna/Pointer;
        //   150: invokestatic    com/sun/jna/Structure$FFIType.newInstance:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //   153: astore_0        /* obj */
        //   154: ldc             Lcom/sun/jna/Structure$ByReference;.class
        //   156: aload_1         /* cls */
        //   157: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   160: ifeq            183
        //   163: getstatic       com/sun/jna/Structure$FFIType.typeInfoMap:Ljava/util/Map;
        //   166: aload_1         /* cls */
        //   167: invokestatic    com/sun/jna/Structure$FFIType$FFITypes.access$1800:()Lcom/sun/jna/Pointer;
        //   170: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   175: pop            
        //   176: invokestatic    com/sun/jna/Structure$FFIType$FFITypes.access$1800:()Lcom/sun/jna/Pointer;
        //   179: aload           o
        //   181: monitorexit    
        //   182: areturn        
        //   183: new             Lcom/sun/jna/Structure$FFIType;
        //   186: dup            
        //   187: aload_0         /* obj */
        //   188: checkcast       Lcom/sun/jna/Structure;
        //   191: invokespecial   com/sun/jna/Structure$FFIType.<init>:(Lcom/sun/jna/Structure;)V
        //   194: astore          7
        //   196: getstatic       com/sun/jna/Structure$FFIType.typeInfoMap:Ljava/util/Map;
        //   199: aload_1         /* cls */
        //   200: aload           7
        //   202: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   207: pop            
        //   208: aload           7
        //   210: invokevirtual   com/sun/jna/Structure$FFIType.getPointer:()Lcom/sun/jna/Pointer;
        //   213: aload           o
        //   215: monitorexit    
        //   216: areturn        
        //   217: ldc             Lcom/sun/jna/NativeMapped;.class
        //   219: aload_1         /* cls */
        //   220: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   223: ifeq            257
        //   226: aload_1         /* cls */
        //   227: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   230: astore          7
        //   232: aload           7
        //   234: aload_0         /* obj */
        //   235: new             Lcom/sun/jna/ToNativeContext;
        //   238: dup            
        //   239: invokespecial   com/sun/jna/ToNativeContext.<init>:()V
        //   242: invokevirtual   com/sun/jna/NativeMappedConverter.toNative:(Ljava/lang/Object;Lcom/sun/jna/ToNativeContext;)Ljava/lang/Object;
        //   245: aload           7
        //   247: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   250: invokestatic    com/sun/jna/Structure$FFIType.get:(Ljava/lang/Object;Ljava/lang/Class;)Lcom/sun/jna/Pointer;
        //   253: aload           o
        //   255: monitorexit    
        //   256: areturn        
        //   257: aload_1         /* cls */
        //   258: invokevirtual   java/lang/Class.isArray:()Z
        //   261: ifeq            296
        //   264: new             Lcom/sun/jna/Structure$FFIType;
        //   267: dup            
        //   268: aload_0         /* obj */
        //   269: aload_1         /* cls */
        //   270: invokespecial   com/sun/jna/Structure$FFIType.<init>:(Ljava/lang/Object;Ljava/lang/Class;)V
        //   273: astore          7
        //   275: getstatic       com/sun/jna/Structure$FFIType.typeInfoMap:Ljava/util/Map;
        //   278: aload_0         /* obj */
        //   279: aload           7
        //   281: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   286: pop            
        //   287: aload           7
        //   289: invokevirtual   com/sun/jna/Structure$FFIType.getPointer:()Lcom/sun/jna/Pointer;
        //   292: aload           o
        //   294: monitorexit    
        //   295: areturn        
        //   296: new             Ljava/lang/IllegalArgumentException;
        //   299: dup            
        //   300: new             Ljava/lang/StringBuilder;
        //   303: dup            
        //   304: invokespecial   java/lang/StringBuilder.<init>:()V
        //   307: ldc             "Unsupported type "
        //   309: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   312: aload_1         /* cls */
        //   313: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   316: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   319: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   322: athrow         
        //   323: astore          8
        //   325: aload           5
        //   327: monitorexit    
        //   328: aload           8
        //   330: athrow         
        //    Signature:
        //  (Ljava/lang/Object;Ljava/lang/Class<*>;)Lcom/sun/jna/Pointer;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  41     68     323    331    Any
        //  69     88     323    331    Any
        //  89     132    323    331    Any
        //  133    182    323    331    Any
        //  183    216    323    331    Any
        //  217    256    323    331    Any
        //  257    295    323    331    Any
        //  296    328    323    331    Any
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
        typeInfoMap = new WeakHashMap<Object, Object>();
        if (Native.POINTER_SIZE == 0) {
            throw new Error("Native library not initialized");
        }
        if (Structure$FFIType$FFITypes.access$900() == null) {
            throw new Error("FFI types not initialized");
        }
        Structure$FFIType.typeInfoMap.put(Void.TYPE, Structure$FFIType$FFITypes.access$900());
        Structure$FFIType.typeInfoMap.put(Void.class, Structure$FFIType$FFITypes.access$900());
        Structure$FFIType.typeInfoMap.put(Float.TYPE, Structure$FFIType$FFITypes.access$1000());
        Structure$FFIType.typeInfoMap.put(Float.class, Structure$FFIType$FFITypes.access$1000());
        Structure$FFIType.typeInfoMap.put(Double.TYPE, Structure$FFIType$FFITypes.access$1100());
        Structure$FFIType.typeInfoMap.put(Double.class, Structure$FFIType$FFITypes.access$1100());
        Structure$FFIType.typeInfoMap.put(Long.TYPE, Structure$FFIType$FFITypes.access$1200());
        Structure$FFIType.typeInfoMap.put(Long.class, Structure$FFIType$FFITypes.access$1200());
        Structure$FFIType.typeInfoMap.put(Integer.TYPE, Structure$FFIType$FFITypes.access$1300());
        Structure$FFIType.typeInfoMap.put(Integer.class, Structure$FFIType$FFITypes.access$1300());
        Structure$FFIType.typeInfoMap.put(Short.TYPE, Structure$FFIType$FFITypes.access$1400());
        Structure$FFIType.typeInfoMap.put(Short.class, Structure$FFIType$FFITypes.access$1400());
        final Pointer pointer = (Native.WCHAR_SIZE == 2) ? Structure$FFIType$FFITypes.access$1500() : Structure$FFIType$FFITypes.access$1600();
        Structure$FFIType.typeInfoMap.put(Character.TYPE, pointer);
        Structure$FFIType.typeInfoMap.put(Character.class, pointer);
        Structure$FFIType.typeInfoMap.put(Byte.TYPE, Structure$FFIType$FFITypes.access$1700());
        Structure$FFIType.typeInfoMap.put(Byte.class, Structure$FFIType$FFITypes.access$1700());
        Structure$FFIType.typeInfoMap.put(Pointer.class, Structure$FFIType$FFITypes.access$1800());
        Structure$FFIType.typeInfoMap.put(String.class, Structure$FFIType$FFITypes.access$1800());
        Structure$FFIType.typeInfoMap.put(WString.class, Structure$FFIType$FFITypes.access$1800());
        Structure$FFIType.typeInfoMap.put(Boolean.TYPE, Structure$FFIType$FFITypes.access$1600());
        Structure$FFIType.typeInfoMap.put(Boolean.class, Structure$FFIType$FFITypes.access$1600());
    }
}

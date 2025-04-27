// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.WeakHashMap;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.Map;

public abstract class Structure
{
    public static final int ALIGN_DEFAULT = 0;
    public static final int ALIGN_NONE = 1;
    public static final int ALIGN_GNUC = 2;
    public static final int ALIGN_MSVC = 3;
    public static final int CALCULATE_SIZE = -1;
    public static final Map<Class<?>, Structure$LayoutInfo> layoutInfo;
    public static final Map<Class<?>, List<String>> fieldOrder;
    private Pointer memory;
    private int size;
    private int alignType;
    private String encoding;
    private int actualAlignType;
    private int structAlignment;
    private Map<String, Structure$StructField> structFields;
    private final Map<String, Object> nativeStrings;
    private TypeMapper typeMapper;
    private long typeInfo;
    private boolean autoRead;
    private boolean autoWrite;
    private Structure[] array;
    private boolean readCalled;
    private static final ThreadLocal<Map<Pointer, Structure>> reads;
    private static final ThreadLocal<Set<Structure>> busy;
    private static final Pointer PLACEHOLDER_MEMORY;
    
    public Structure() {
        this(0);
    }
    
    public Structure(final TypeMapper mapper) {
        this(null, 0, mapper);
    }
    
    public Structure(final int alignType) {
        this(null, alignType);
    }
    
    public Structure(final int alignType, final TypeMapper mapper) {
        this(null, alignType, mapper);
    }
    
    public Structure(final Pointer p) {
        this(p, 0);
    }
    
    public Structure(final Pointer p, final int alignType) {
        this(p, alignType, null);
    }
    
    public Structure(final Pointer p, final int alignType, final TypeMapper mapper) {
        this.size = -1;
        this.nativeStrings = new HashMap<String, Object>();
        this.autoRead = true;
        this.autoWrite = true;
        this.setAlignType(alignType);
        this.setStringEncoding(Native.getStringEncoding(this.getClass()));
        this.initializeTypeMapper(mapper);
        this.validateFields();
        if (p != null) {
            this.useMemory(p, 0, true);
        }
        else {
            this.allocateMemory(-1);
        }
        this.initializeFields();
    }
    
    public Map<String, Structure$StructField> fields() {
        return this.structFields;
    }
    
    public TypeMapper getTypeMapper() {
        return this.typeMapper;
    }
    
    private void initializeTypeMapper(TypeMapper mapper) {
        if (mapper == null) {
            mapper = Native.getTypeMapper(this.getClass());
        }
        this.typeMapper = mapper;
        this.layoutChanged();
    }
    
    private void layoutChanged() {
        if (this.size != -1) {
            this.size = -1;
            if (this.memory instanceof Structure$AutoAllocated) {
                this.memory = null;
            }
            this.ensureAllocated();
        }
    }
    
    public void setStringEncoding(final String encoding) {
        this.encoding = encoding;
    }
    
    public String getStringEncoding() {
        return this.encoding;
    }
    
    public void setAlignType(int alignType) {
        this.alignType = alignType;
        if (alignType == 0) {
            alignType = Native.getStructureAlignment(this.getClass());
            if (alignType == 0) {
                if (Platform.isWindows()) {
                    alignType = 3;
                }
                else {
                    alignType = 2;
                }
            }
        }
        this.actualAlignType = alignType;
        this.layoutChanged();
    }
    
    public Memory autoAllocate(final int size) {
        return new Structure$AutoAllocated(size);
    }
    
    public void useMemory(final Pointer m) {
        this.useMemory(m, 0);
    }
    
    public void useMemory(final Pointer m, final int offset) {
        this.useMemory(m, offset, false);
    }
    
    public void useMemory(final Pointer m, final int offset, final boolean force) {
        try {
            this.nativeStrings.clear();
            if (this instanceof Structure$ByValue && !force) {
                final byte[] array = new byte[this.size()];
                m.read(0L, array, 0, array.length);
                this.memory.write(0L, array, 0, array.length);
            }
            else {
                this.memory = m.share(offset);
                if (this.size == -1) {
                    this.size = this.calculateSize(false);
                }
                if (this.size != -1) {
                    this.memory = m.share(offset, this.size);
                }
            }
            this.array = null;
            this.readCalled = false;
        }
        catch (final IndexOutOfBoundsException cause) {
            throw new IllegalArgumentException("Structure exceeds provided memory bounds", cause);
        }
    }
    
    public void ensureAllocated() {
        this.ensureAllocated(false);
    }
    
    private void ensureAllocated(final boolean avoidFFIType) {
        if (this.memory == null) {
            this.allocateMemory(avoidFFIType);
        }
        else if (this.size == -1) {
            this.size = this.calculateSize(true, avoidFFIType);
            if (!(this.memory instanceof Structure$AutoAllocated)) {
                try {
                    this.memory = this.memory.share(0L, this.size);
                }
                catch (final IndexOutOfBoundsException cause) {
                    throw new IllegalArgumentException("Structure exceeds provided memory bounds", cause);
                }
            }
        }
    }
    
    public void allocateMemory() {
        this.allocateMemory(false);
    }
    
    private void allocateMemory(final boolean avoidFFIType) {
        this.allocateMemory(this.calculateSize(true, avoidFFIType));
    }
    
    public void allocateMemory(int size) {
        if (size == -1) {
            size = this.calculateSize(false);
        }
        else if (size <= 0) {
            throw new IllegalArgumentException("Structure size must be greater than zero: " + size);
        }
        if (size != -1) {
            if (this.memory == null || this.memory instanceof Structure$AutoAllocated) {
                this.memory = this.autoAllocate(size);
            }
            this.size = size;
        }
    }
    
    public int size() {
        this.ensureAllocated();
        return this.size;
    }
    
    public void clear() {
        this.ensureAllocated();
        this.memory.clear(this.size());
    }
    
    public Pointer getPointer() {
        this.ensureAllocated();
        return this.memory;
    }
    
    public static Set<Structure> busy() {
        return Structure.busy.get();
    }
    
    public static Map<Pointer, Structure> reading() {
        return Structure.reads.get();
    }
    
    public void conditionalAutoRead() {
        if (!this.readCalled) {
            this.autoRead();
        }
    }
    
    public void read() {
        if (this.memory == Structure.PLACEHOLDER_MEMORY) {
            return;
        }
        this.readCalled = true;
        this.ensureAllocated();
        if (busy().contains(this)) {
            return;
        }
        busy().add(this);
        if (this instanceof Structure$ByReference) {
            reading().put(this.getPointer(), this);
        }
        try {
            final Iterator<Structure$StructField> iterator = this.fields().values().iterator();
            while (iterator.hasNext()) {
                this.readField(iterator.next());
            }
        }
        finally {
            busy().remove(this);
            if (reading().get(this.getPointer()) == this) {
                reading().remove(this.getPointer());
            }
        }
    }
    
    public int fieldOffset(final String name) {
        this.ensureAllocated();
        final Structure$StructField structure$StructField = this.fields().get(name);
        if (structure$StructField == null) {
            throw new IllegalArgumentException("No such field: " + name);
        }
        return structure$StructField.offset;
    }
    
    public Object readField(final String name) {
        this.ensureAllocated();
        final Structure$StructField structField = this.fields().get(name);
        if (structField == null) {
            throw new IllegalArgumentException("No such field: " + name);
        }
        return this.readField(structField);
    }
    
    public Object getFieldValue(final Field field) {
        try {
            return field.get(this);
        }
        catch (final Exception cause) {
            throw new Error("Exception reading field '" + field.getName() + "' in " + this.getClass(), cause);
        }
    }
    
    public void setFieldValue(final Field field, final Object value) {
        this.setFieldValue(field, value, false);
    }
    
    private void setFieldValue(final Field field, final Object value, final boolean overrideFinal) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0         /* this */
        //     2: aload_2         /* value */
        //     3: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     6: goto            173
        //     9: astore          6
        //    11: aload_1         /* field */
        //    12: invokevirtual   java/lang/reflect/Field.getModifiers:()I
        //    15: istore          7
        //    17: iload           7
        //    19: invokestatic    java/lang/reflect/Modifier.isFinal:(I)Z
        //    22: ifeq            127
        //    25: iload_3         /* overrideFinal */
        //    26: ifeq            81
        //    29: new             Ljava/lang/UnsupportedOperationException;
        //    32: dup            
        //    33: new             Ljava/lang/StringBuilder;
        //    36: dup            
        //    37: invokespecial   java/lang/StringBuilder.<init>:()V
        //    40: ldc_w           "This VM does not support Structures with final fields (field '"
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: aload_1         /* field */
        //    47: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //    50: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    53: ldc_w           "' within "
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: aload_0         /* this */
        //    60: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    66: ldc_w           ")"
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    75: aload           modifiers
        //    77: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    80: athrow         
        //    81: new             Ljava/lang/UnsupportedOperationException;
        //    84: dup            
        //    85: new             Ljava/lang/StringBuilder;
        //    88: dup            
        //    89: invokespecial   java/lang/StringBuilder.<init>:()V
        //    92: ldc_w           "Attempt to write to read-only field '"
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: aload_1         /* field */
        //    99: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: ldc_w           "' within "
        //   108: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   111: aload_0         /* this */
        //   112: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   118: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   121: aload           modifiers
        //   123: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   126: athrow         
        //   127: new             Ljava/lang/Error;
        //   130: dup            
        //   131: new             Ljava/lang/StringBuilder;
        //   134: dup            
        //   135: invokespecial   java/lang/StringBuilder.<init>:()V
        //   138: ldc_w           "Unexpectedly unable to write to field '"
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: aload_1         /* field */
        //   145: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: ldc_w           "' within "
        //   154: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   157: aload_0         /* this */
        //   158: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   167: aload           modifiers
        //   169: invokespecial   java/lang/Error.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   172: athrow         
        //   173: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      6      9      173    Ljava/lang/IllegalAccessException;
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
    
    public static Structure updateStructureByReference(final Class<?> type, Structure s, final Pointer address) {
        if (address == null) {
            s = null;
        }
        else if (s == null || !address.equals(s.getPointer())) {
            final Structure structure = reading().get(address);
            if (structure != null && type.equals(structure.getClass())) {
                s = structure;
                s.autoRead();
            }
            else {
                s = newInstance(type, address);
                s.conditionalAutoRead();
            }
        }
        else {
            s.autoRead();
        }
        return s;
    }
    
    public Object readField(final Structure$StructField structField) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/Structure$StructField.offset:I
        //     4: istore          4
        //     6: aload_1         /* structField */
        //     7: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //    10: astore          5
        //    12: aload_1         /* structField */
        //    13: getfield        com/sun/jna/Structure$StructField.readConverter:Lcom/sun/jna/FromNativeConverter;
        //    16: astore          6
        //    18: aload           6
        //    20: ifnull          32
        //    23: aload           6
        //    25: invokeinterface com/sun/jna/FromNativeConverter.nativeType:()Ljava/lang/Class;
        //    30: astore          readConverter
        //    32: ldc             Lcom/sun/jna/Structure;.class
        //    34: aload           readConverter
        //    36: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    39: ifne            99
        //    42: ldc_w           Lcom/sun/jna/Callback;.class
        //    45: aload           readConverter
        //    47: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    50: ifne            99
        //    53: getstatic       com/sun/jna/Platform.HAS_BUFFERS:Z
        //    56: ifeq            70
        //    59: ldc_w           Ljava/nio/Buffer;.class
        //    62: aload           readConverter
        //    64: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    67: ifne            99
        //    70: ldc             Lcom/sun/jna/Pointer;.class
        //    72: aload           readConverter
        //    74: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    77: ifne            99
        //    80: ldc_w           Lcom/sun/jna/NativeMapped;.class
        //    83: aload           readConverter
        //    85: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    88: ifne            99
        //    91: aload           readConverter
        //    93: invokevirtual   java/lang/Class.isArray:()Z
        //    96: ifeq            110
        //    99: aload_0         /* this */
        //   100: aload_1         /* structField */
        //   101: getfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //   104: invokevirtual   com/sun/jna/Structure.getFieldValue:(Ljava/lang/reflect/Field;)Ljava/lang/Object;
        //   107: goto            111
        //   110: aconst_null    
        //   111: astore          7
        //   113: aload           readConverter
        //   115: ldc_w           Ljava/lang/String;.class
        //   118: if_acmpne       157
        //   121: aload_0         /* this */
        //   122: getfield        com/sun/jna/Structure.memory:Lcom/sun/jna/Pointer;
        //   125: iload           fieldType
        //   127: i2l            
        //   128: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //   131: astore          8
        //   133: aload           8
        //   135: ifnonnull       142
        //   138: aconst_null    
        //   139: goto            152
        //   142: aload           8
        //   144: lconst_0       
        //   145: aload_0         /* this */
        //   146: getfield        com/sun/jna/Structure.encoding:Ljava/lang/String;
        //   149: invokevirtual   com/sun/jna/Pointer.getString:(JLjava/lang/String;)Ljava/lang/String;
        //   152: astore          9
        //   154: goto            173
        //   157: aload_0         /* this */
        //   158: getfield        com/sun/jna/Structure.memory:Lcom/sun/jna/Pointer;
        //   161: iload           fieldType
        //   163: i2l            
        //   164: aload           readConverter
        //   166: aload           7
        //   168: invokevirtual   com/sun/jna/Pointer.getValue:(JLjava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
        //   171: astore          9
        //   173: aload           currentValue
        //   175: ifnull          212
        //   178: aload           currentValue
        //   180: aload           9
        //   182: aload_1         /* structField */
        //   183: getfield        com/sun/jna/Structure$StructField.context:Lcom/sun/jna/FromNativeContext;
        //   186: invokeinterface com/sun/jna/FromNativeConverter.fromNative:(Ljava/lang/Object;Lcom/sun/jna/FromNativeContext;)Ljava/lang/Object;
        //   191: astore          9
        //   193: aload           7
        //   195: ifnull          212
        //   198: aload           7
        //   200: aload           9
        //   202: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   205: ifeq            212
        //   208: aload           7
        //   210: astore          9
        //   212: aload           readConverter
        //   214: ldc_w           Ljava/lang/String;.class
        //   217: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   220: ifne            234
        //   223: aload           readConverter
        //   225: ldc_w           Lcom/sun/jna/WString;.class
        //   228: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   231: ifeq            312
        //   234: aload_0         /* this */
        //   235: getfield        com/sun/jna/Structure.nativeStrings:Ljava/util/Map;
        //   238: new             Ljava/lang/StringBuilder;
        //   241: dup            
        //   242: invokespecial   java/lang/StringBuilder.<init>:()V
        //   245: aload_1         /* structField */
        //   246: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: ldc_w           ".ptr"
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   258: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   261: aload_0         /* this */
        //   262: getfield        com/sun/jna/Structure.memory:Lcom/sun/jna/Pointer;
        //   265: iload           fieldType
        //   267: i2l            
        //   268: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //   271: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   276: pop            
        //   277: aload_0         /* this */
        //   278: getfield        com/sun/jna/Structure.nativeStrings:Ljava/util/Map;
        //   281: new             Ljava/lang/StringBuilder;
        //   284: dup            
        //   285: invokespecial   java/lang/StringBuilder.<init>:()V
        //   288: aload_1         /* structField */
        //   289: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   292: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   295: ldc_w           ".val"
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   304: aload           9
        //   306: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   311: pop            
        //   312: aload_0         /* this */
        //   313: aload_1         /* structField */
        //   314: getfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //   317: aload           9
        //   319: iconst_1       
        //   320: invokespecial   com/sun/jna/Structure.setFieldValue:(Ljava/lang/reflect/Field;Ljava/lang/Object;Z)V
        //   323: aload           9
        //   325: areturn        
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
    
    public void write() {
        if (this.memory == Structure.PLACEHOLDER_MEMORY) {
            return;
        }
        this.ensureAllocated();
        if (this instanceof Structure$ByValue) {
            this.getTypeInfo();
        }
        if (busy().contains(this)) {
            return;
        }
        busy().add(this);
        try {
            for (final Structure$StructField structField : this.fields().values()) {
                if (!structField.isVolatile) {
                    this.writeField(structField);
                }
            }
        }
        finally {
            busy().remove(this);
        }
    }
    
    public void writeField(final String name) {
        this.ensureAllocated();
        final Structure$StructField structField = this.fields().get(name);
        if (structField == null) {
            throw new IllegalArgumentException("No such field: " + name);
        }
        this.writeField(structField);
    }
    
    public void writeField(final String name, final Object value) {
        this.ensureAllocated();
        final Structure$StructField structField = this.fields().get(name);
        if (structField == null) {
            throw new IllegalArgumentException("No such field: " + name);
        }
        this.setFieldValue(structField.field, value);
        this.writeField(structField);
    }
    
    public void writeField(final Structure$StructField structField) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/Structure$StructField.isReadOnly:Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_1         /* structField */
        //     9: getfield        com/sun/jna/Structure$StructField.offset:I
        //    12: istore          4
        //    14: aload_0         /* this */
        //    15: aload_1         /* structField */
        //    16: getfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //    19: invokevirtual   com/sun/jna/Structure.getFieldValue:(Ljava/lang/reflect/Field;)Ljava/lang/Object;
        //    22: astore          5
        //    24: aload_1         /* structField */
        //    25: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //    28: astore          6
        //    30: aload_1         /* structField */
        //    31: getfield        com/sun/jna/Structure$StructField.writeConverter:Lcom/sun/jna/ToNativeConverter;
        //    34: astore          7
        //    36: aload           7
        //    38: ifnull          73
        //    41: aload           7
        //    43: aload           fieldType
        //    45: new             Lcom/sun/jna/StructureWriteContext;
        //    48: dup            
        //    49: aload_0         /* this */
        //    50: aload_1         /* structField */
        //    51: getfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //    54: invokespecial   com/sun/jna/StructureWriteContext.<init>:(Lcom/sun/jna/Structure;Ljava/lang/reflect/Field;)V
        //    57: invokeinterface com/sun/jna/ToNativeConverter.toNative:(Ljava/lang/Object;Lcom/sun/jna/ToNativeContext;)Ljava/lang/Object;
        //    62: astore          fieldType
        //    64: aload           7
        //    66: invokeinterface com/sun/jna/ToNativeConverter.nativeType:()Ljava/lang/Class;
        //    71: astore          converter
        //    73: ldc_w           Ljava/lang/String;.class
        //    76: aload           converter
        //    78: if_acmpeq       89
        //    81: ldc_w           Lcom/sun/jna/WString;.class
        //    84: aload           converter
        //    86: if_acmpne       330
        //    89: aload           converter
        //    91: ldc_w           Lcom/sun/jna/WString;.class
        //    94: if_acmpne       101
        //    97: iconst_1       
        //    98: goto            102
        //   101: iconst_0       
        //   102: istore          8
        //   104: aload           fieldType
        //   106: ifnull          250
        //   109: aload_0         /* this */
        //   110: getfield        com/sun/jna/Structure.nativeStrings:Ljava/util/Map;
        //   113: new             Ljava/lang/StringBuilder;
        //   116: dup            
        //   117: invokespecial   java/lang/StringBuilder.<init>:()V
        //   120: aload_1         /* structField */
        //   121: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: ldc_w           ".ptr"
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   136: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   141: ifeq            185
        //   144: aload           fieldType
        //   146: aload_0         /* this */
        //   147: getfield        com/sun/jna/Structure.nativeStrings:Ljava/util/Map;
        //   150: new             Ljava/lang/StringBuilder;
        //   153: dup            
        //   154: invokespecial   java/lang/StringBuilder.<init>:()V
        //   157: aload_1         /* structField */
        //   158: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: ldc_w           ".val"
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   173: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   178: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   181: ifeq            185
        //   184: return         
        //   185: iload           8
        //   187: ifeq            206
        //   190: new             Lcom/sun/jna/NativeString;
        //   193: dup            
        //   194: aload           fieldType
        //   196: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   199: iconst_1       
        //   200: invokespecial   com/sun/jna/NativeString.<init>:(Ljava/lang/String;Z)V
        //   203: goto            222
        //   206: new             Lcom/sun/jna/NativeString;
        //   209: dup            
        //   210: aload           fieldType
        //   212: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   215: aload_0         /* this */
        //   216: getfield        com/sun/jna/Structure.encoding:Ljava/lang/String;
        //   219: invokespecial   com/sun/jna/NativeString.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   222: astore          9
        //   224: aload_0         /* this */
        //   225: getfield        com/sun/jna/Structure.nativeStrings:Ljava/util/Map;
        //   228: aload_1         /* structField */
        //   229: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   232: aload           9
        //   234: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   239: pop            
        //   240: aload           9
        //   242: invokevirtual   com/sun/jna/NativeString.getPointer:()Lcom/sun/jna/Pointer;
        //   245: astore          fieldType
        //   247: goto            264
        //   250: aload_0         /* this */
        //   251: getfield        com/sun/jna/Structure.nativeStrings:Ljava/util/Map;
        //   254: aload_1         /* structField */
        //   255: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   258: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   263: pop            
        //   264: aload_0         /* this */
        //   265: getfield        com/sun/jna/Structure.nativeStrings:Ljava/util/Map;
        //   268: new             Ljava/lang/StringBuilder;
        //   271: dup            
        //   272: invokespecial   java/lang/StringBuilder.<init>:()V
        //   275: aload_1         /* structField */
        //   276: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   279: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   282: ldc_w           ".ptr"
        //   285: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   288: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   291: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   296: pop            
        //   297: aload_0         /* this */
        //   298: getfield        com/sun/jna/Structure.nativeStrings:Ljava/util/Map;
        //   301: new             Ljava/lang/StringBuilder;
        //   304: dup            
        //   305: invokespecial   java/lang/StringBuilder.<init>:()V
        //   308: aload_1         /* structField */
        //   309: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: ldc_w           ".val"
        //   318: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   321: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   324: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   329: pop            
        //   330: aload_0         /* this */
        //   331: getfield        com/sun/jna/Structure.memory:Lcom/sun/jna/Pointer;
        //   334: iload           value
        //   336: i2l            
        //   337: aload           fieldType
        //   339: aload           converter
        //   341: invokevirtual   com/sun/jna/Pointer.setValue:(JLjava/lang/Object;Ljava/lang/Class;)V
        //   344: goto            450
        //   347: astore          8
        //   349: new             Ljava/lang/StringBuilder;
        //   352: dup            
        //   353: invokespecial   java/lang/StringBuilder.<init>:()V
        //   356: ldc_w           "Structure field \""
        //   359: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   362: aload_1         /* structField */
        //   363: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   366: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   369: ldc_w           "\" was declared as "
        //   372: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   375: aload_1         /* structField */
        //   376: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //   379: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   382: aload_1         /* structField */
        //   383: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //   386: aload           converter
        //   388: if_acmpne       397
        //   391: ldc_w           ""
        //   394: goto            424
        //   397: new             Ljava/lang/StringBuilder;
        //   400: dup            
        //   401: invokespecial   java/lang/StringBuilder.<init>:()V
        //   404: ldc_w           " (native type "
        //   407: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   410: aload           converter
        //   412: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   415: ldc_w           ")"
        //   418: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   421: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   424: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   427: ldc_w           ", which is not supported within a Structure"
        //   430: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   433: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   436: astore          9
        //   438: new             Ljava/lang/IllegalArgumentException;
        //   441: dup            
        //   442: aload           9
        //   444: aload           msg
        //   446: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   449: athrow         
        //   450: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  330    344    347    450    Ljava/lang/IllegalArgumentException;
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
    
    public abstract List<String> getFieldOrder();
    
    @Deprecated
    public final void setFieldOrder(final String[] fields) {
        throw new Error("This method is obsolete, use getFieldOrder() instead");
    }
    
    public void sortFields(final List<Field> fields, final List<String> names) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          5
        //     3: iload           5
        //     5: aload_2         /* names */
        //     6: invokeinterface java/util/List.size:()I
        //    11: if_icmpge       90
        //    14: aload_2         /* names */
        //    15: iload           5
        //    17: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    22: checkcast       Ljava/lang/String;
        //    25: astore          6
        //    27: iconst_0       
        //    28: istore          7
        //    30: iload           7
        //    32: aload_1         /* fields */
        //    33: invokeinterface java/util/List.size:()I
        //    38: if_icmpge       84
        //    41: aload_1         /* fields */
        //    42: iload           7
        //    44: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    49: checkcast       Ljava/lang/reflect/Field;
        //    52: astore          8
        //    54: aload           f
        //    56: aload           8
        //    58: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //    61: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    64: ifeq            78
        //    67: aload_1         /* fields */
        //    68: iload           name
        //    70: iload           field
        //    72: invokestatic    java/util/Collections.swap:(Ljava/util/List;II)V
        //    75: goto            84
        //    78: iinc            field, 1
        //    81: goto            30
        //    84: iinc            name, 1
        //    87: goto            3
        //    90: return         
        //    Signature:
        //  (Ljava/util/List<Ljava/lang/reflect/Field;>;Ljava/util/List<Ljava/lang/String;>;)V
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
    
    public List<Field> getFieldList() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_3       
        //     8: aload_0         /* this */
        //     9: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    12: astore          4
        //    14: aload           4
        //    16: ldc             Lcom/sun/jna/Structure;.class
        //    18: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    21: ifne            119
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: invokespecial   java/util/ArrayList.<init>:()V
        //    31: astore          5
        //    33: aload           classFields
        //    35: invokevirtual   java/lang/Class.getDeclaredFields:()[Ljava/lang/reflect/Field;
        //    38: astore          6
        //    40: iconst_0       
        //    41: istore          7
        //    43: iload           7
        //    45: aload           i
        //    47: arraylength    
        //    48: if_icmpge       99
        //    51: aload           i
        //    53: iload           7
        //    55: aaload         
        //    56: invokevirtual   java/lang/reflect/Field.getModifiers:()I
        //    59: istore          8
        //    61: iload           8
        //    63: invokestatic    java/lang/reflect/Modifier.isStatic:(I)Z
        //    66: ifne            93
        //    69: iload           8
        //    71: invokestatic    java/lang/reflect/Modifier.isPublic:(I)Z
        //    74: ifne            80
        //    77: goto            93
        //    80: aload           fields
        //    82: aload           i
        //    84: iload           modifiers
        //    86: aaload         
        //    87: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    92: pop            
        //    93: iinc            modifiers, 1
        //    96: goto            43
        //    99: aload_3         /* cls */
        //   100: iconst_0       
        //   101: aload           fields
        //   103: invokeinterface java/util/List.addAll:(ILjava/util/Collection;)Z
        //   108: pop            
        //   109: aload           classFields
        //   111: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //   114: astore          4
        //   116: goto            14
        //   119: aload_3         /* cls */
        //   120: areturn        
        //    Signature:
        //  ()Ljava/util/List<Ljava/lang/reflect/Field;>;
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
    
    private List<String> fieldOrder() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     4: astore_3       
        //     5: getstatic       com/sun/jna/Structure.fieldOrder:Ljava/util/Map;
        //     8: dup            
        //     9: astore          4
        //    11: monitorenter   
        //    12: getstatic       com/sun/jna/Structure.fieldOrder:Ljava/util/Map;
        //    15: aload_3        
        //    16: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    21: checkcast       Ljava/util/List;
        //    24: astore          5
        //    26: aload           5
        //    28: ifnonnull       49
        //    31: aload_0         /* this */
        //    32: invokevirtual   com/sun/jna/Structure.getFieldOrder:()Ljava/util/List;
        //    35: astore          5
        //    37: getstatic       com/sun/jna/Structure.fieldOrder:Ljava/util/Map;
        //    40: aload_3        
        //    41: aload           5
        //    43: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    48: pop            
        //    49: aload           5
        //    51: aload           list
        //    53: monitorexit    
        //    54: areturn        
        //    55: astore          6
        //    57: aload           4
        //    59: monitorexit    
        //    60: aload           6
        //    62: athrow         
        //    Signature:
        //  ()Ljava/util/List<Ljava/lang/String;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     54     55     63     Any
        //  55     60     55     63     Any
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
    
    public static List<String> createFieldsOrder(final List<String> baseFields, final String... extraFields) {
        return createFieldsOrder(baseFields, Arrays.asList(extraFields));
    }
    
    public static List<String> createFieldsOrder(final List<String> baseFields, final List<String> extraFields) {
        final ArrayList list = new ArrayList(baseFields.size() + extraFields.size());
        list.addAll(baseFields);
        list.addAll(extraFields);
        return (List<String>)Collections.unmodifiableList((List<?>)list);
    }
    
    public static List<String> createFieldsOrder(final String field) {
        return Collections.unmodifiableList(Collections.singletonList(field));
    }
    
    public static List<String> createFieldsOrder(final String... fields) {
        return Collections.unmodifiableList((List<? extends String>)Arrays.asList((T[])fields));
    }
    
    private static <T extends Comparable<T>> List<T> sort(final Collection<? extends T> c) {
        final ArrayList list = new ArrayList(c);
        Collections.sort((List<Comparable>)list);
        return list;
    }
    
    public List<Field> getFields(final boolean force) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/sun/jna/Structure.getFieldList:()Ljava/util/List;
        //     4: astore          4
        //     6: new             Ljava/util/HashSet;
        //     9: dup            
        //    10: invokespecial   java/util/HashSet.<init>:()V
        //    13: astore          5
        //    15: aload           names
        //    17: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    22: astore          6
        //    24: aload           6
        //    26: invokeinterface java/util/Iterator.hasNext:()Z
        //    31: ifeq            62
        //    34: aload           6
        //    36: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    41: checkcast       Ljava/lang/reflect/Field;
        //    44: astore          7
        //    46: aload           5
        //    48: aload           7
        //    50: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //    53: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    58: pop            
        //    59: goto            24
        //    62: aload_0         /* this */
        //    63: invokespecial   com/sun/jna/Structure.fieldOrder:()Ljava/util/List;
        //    66: astore          6
        //    68: aload           6
        //    70: invokeinterface java/util/List.size:()I
        //    75: aload           names
        //    77: invokeinterface java/util/List.size:()I
        //    82: if_icmpeq       199
        //    85: aload           names
        //    87: invokeinterface java/util/List.size:()I
        //    92: iconst_1       
        //    93: if_icmple       199
        //    96: iload_1         /* force */
        //    97: ifeq            197
        //   100: new             Ljava/lang/Error;
        //   103: dup            
        //   104: new             Ljava/lang/StringBuilder;
        //   107: dup            
        //   108: invokespecial   java/lang/StringBuilder.<init>:()V
        //   111: ldc_w           "Structure.getFieldOrder() on "
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: aload_0         /* this */
        //   118: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   124: ldc_w           " does not provide enough names ["
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: aload           6
        //   132: invokeinterface java/util/List.size:()I
        //   137: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   140: ldc_w           "] ("
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: aload           6
        //   148: invokestatic    com/sun/jna/Structure.sort:(Ljava/util/Collection;)Ljava/util/List;
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   154: ldc_w           ") to match declared fields ["
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   160: aload           names
        //   162: invokeinterface java/util/List.size:()I
        //   167: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   170: ldc_w           "] ("
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: aload           fieldOrder
        //   178: invokestatic    com/sun/jna/Structure.sort:(Ljava/util/Collection;)Ljava/util/List;
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   184: ldc_w           ")"
        //   187: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: invokespecial   java/lang/Error.<init>:(Ljava/lang/String;)V
        //   196: athrow         
        //   197: aconst_null    
        //   198: areturn        
        //   199: new             Ljava/util/HashSet;
        //   202: dup            
        //   203: aload           6
        //   205: invokespecial   java/util/HashSet.<init>:(Ljava/util/Collection;)V
        //   208: astore          7
        //   210: aload           7
        //   212: aload           fieldOrder
        //   214: invokeinterface java/util/Set.equals:(Ljava/lang/Object;)Z
        //   219: ifne            287
        //   222: new             Ljava/lang/Error;
        //   225: dup            
        //   226: new             Ljava/lang/StringBuilder;
        //   229: dup            
        //   230: invokespecial   java/lang/StringBuilder.<init>:()V
        //   233: ldc_w           "Structure.getFieldOrder() on "
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: aload_0         /* this */
        //   240: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   246: ldc_w           " returns names ("
        //   249: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   252: aload           orderedNames
        //   254: invokestatic    com/sun/jna/Structure.sort:(Ljava/util/Collection;)Ljava/util/List;
        //   257: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   260: ldc_w           ") which do not match declared field names ("
        //   263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   266: aload           fieldOrder
        //   268: invokestatic    com/sun/jna/Structure.sort:(Ljava/util/Collection;)Ljava/util/List;
        //   271: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   274: ldc_w           ")"
        //   277: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   280: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   283: invokespecial   java/lang/Error.<init>:(Ljava/lang/String;)V
        //   286: athrow         
        //   287: aload_0         /* this */
        //   288: aload           names
        //   290: aload           orderedNames
        //   292: invokevirtual   com/sun/jna/Structure.sortFields:(Ljava/util/List;Ljava/util/List;)V
        //   295: aload           names
        //   297: areturn        
        //    Signature:
        //  (Z)Ljava/util/List<Ljava/lang/reflect/Field;>;
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
    
    public int calculateSize(final boolean force) {
        return this.calculateSize(force, false);
    }
    
    public static int size(final Class<?> type) {
        return size(type, null);
    }
    
    public static int size(final Class<?> type, final Structure value) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: astore          4
        //     6: monitorenter   
        //     7: getstatic       com/sun/jna/Structure.layoutInfo:Ljava/util/Map;
        //    10: aload_0         /* type */
        //    11: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    16: checkcast       Lcom/sun/jna/Structure$LayoutInfo;
        //    19: astore          5
        //    21: aload           info
        //    23: monitorexit    
        //    24: goto            35
        //    27: astore          6
        //    29: aload           4
        //    31: monitorexit    
        //    32: aload           6
        //    34: athrow         
        //    35: aload           5
        //    37: ifnull          56
        //    40: aload           5
        //    42: invokestatic    com/sun/jna/Structure$LayoutInfo.access$000:(Lcom/sun/jna/Structure$LayoutInfo;)Z
        //    45: ifne            56
        //    48: aload           5
        //    50: invokestatic    com/sun/jna/Structure$LayoutInfo.access$100:(Lcom/sun/jna/Structure$LayoutInfo;)I
        //    53: goto            57
        //    56: iconst_m1      
        //    57: istore          info
        //    59: iload           info
        //    61: iconst_m1      
        //    62: if_icmpne       83
        //    65: aload_1         /* value */
        //    66: ifnonnull       77
        //    69: aload_0         /* type */
        //    70: getstatic       com/sun/jna/Structure.PLACEHOLDER_MEMORY:Lcom/sun/jna/Pointer;
        //    73: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //    76: astore_1        /* value */
        //    77: aload_1         /* value */
        //    78: invokevirtual   com/sun/jna/Structure.size:()I
        //    81: istore          info
        //    83: iload           info
        //    85: ireturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;Lcom/sun/jna/Structure;)I
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      24     27     35     Any
        //  27     32     27     35     Any
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
    
    public int calculateSize(final boolean force, final boolean avoidFFIType) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          5
        //     3: aload_0         /* this */
        //     4: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     7: astore          6
        //     9: getstatic       com/sun/jna/Structure.layoutInfo:Ljava/util/Map;
        //    12: dup            
        //    13: astore          7
        //    15: monitorenter   
        //    16: getstatic       com/sun/jna/Structure.layoutInfo:Ljava/util/Map;
        //    19: aload           6
        //    21: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    26: checkcast       Lcom/sun/jna/Structure$LayoutInfo;
        //    29: astore          8
        //    31: aload           info
        //    33: monitorexit    
        //    34: goto            45
        //    37: astore          9
        //    39: aload           7
        //    41: monitorexit    
        //    42: aload           9
        //    44: athrow         
        //    45: aload           8
        //    47: ifnull          74
        //    50: aload_0         /* this */
        //    51: getfield        com/sun/jna/Structure.alignType:I
        //    54: aload           8
        //    56: invokestatic    com/sun/jna/Structure$LayoutInfo.access$200:(Lcom/sun/jna/Structure$LayoutInfo;)I
        //    59: if_icmpne       74
        //    62: aload_0         /* this */
        //    63: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //    66: aload           8
        //    68: invokestatic    com/sun/jna/Structure$LayoutInfo.access$300:(Lcom/sun/jna/Structure$LayoutInfo;)Lcom/sun/jna/TypeMapper;
        //    71: if_acmpeq       82
        //    74: aload_0         /* this */
        //    75: iload_1         /* force */
        //    76: iload_2         /* avoidFFIType */
        //    77: invokespecial   com/sun/jna/Structure.deriveLayout:(ZZ)Lcom/sun/jna/Structure$LayoutInfo;
        //    80: astore          8
        //    82: aload           8
        //    84: ifnull          181
        //    87: aload_0         /* this */
        //    88: aload           8
        //    90: invokestatic    com/sun/jna/Structure$LayoutInfo.access$400:(Lcom/sun/jna/Structure$LayoutInfo;)I
        //    93: putfield        com/sun/jna/Structure.structAlignment:I
        //    96: aload_0         /* this */
        //    97: aload           8
        //    99: invokestatic    com/sun/jna/Structure$LayoutInfo.access$500:(Lcom/sun/jna/Structure$LayoutInfo;)Ljava/util/Map;
        //   102: putfield        com/sun/jna/Structure.structFields:Ljava/util/Map;
        //   105: aload           8
        //   107: invokestatic    com/sun/jna/Structure$LayoutInfo.access$000:(Lcom/sun/jna/Structure$LayoutInfo;)Z
        //   110: ifne            174
        //   113: getstatic       com/sun/jna/Structure.layoutInfo:Ljava/util/Map;
        //   116: dup            
        //   117: astore          info
        //   119: monitorenter   
        //   120: getstatic       com/sun/jna/Structure.layoutInfo:Ljava/util/Map;
        //   123: aload           6
        //   125: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   130: ifeq            147
        //   133: aload_0         /* this */
        //   134: getfield        com/sun/jna/Structure.alignType:I
        //   137: ifne            147
        //   140: aload_0         /* this */
        //   141: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //   144: ifnull          160
        //   147: getstatic       com/sun/jna/Structure.layoutInfo:Ljava/util/Map;
        //   150: aload           6
        //   152: aload           8
        //   154: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   159: pop            
        //   160: aload           info
        //   162: monitorexit    
        //   163: goto            174
        //   166: astore          10
        //   168: aload           info
        //   170: monitorexit    
        //   171: aload           10
        //   173: athrow         
        //   174: aload           8
        //   176: invokestatic    com/sun/jna/Structure$LayoutInfo.access$100:(Lcom/sun/jna/Structure$LayoutInfo;)I
        //   179: istore          clazz
        //   181: iload           clazz
        //   183: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  16     34     37     45     Any
        //  37     42     37     45     Any
        //  120    163    166    174    Any
        //  166    171    166    174    Any
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
    
    private void validateField(final String name, final Class<?> type) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //     4: ifnull          37
        //     7: aload_0         /* this */
        //     8: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //    11: aload_2         /* type */
        //    12: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //    17: astore          5
        //    19: aload           5
        //    21: ifnull          37
        //    24: aload_0         /* this */
        //    25: aload_1         /* name */
        //    26: aload           5
        //    28: invokeinterface com/sun/jna/ToNativeConverter.nativeType:()Ljava/lang/Class;
        //    33: invokespecial   com/sun/jna/Structure.validateField:(Ljava/lang/String;Ljava/lang/Class;)V
        //    36: return         
        //    37: aload_2         /* type */
        //    38: invokevirtual   java/lang/Class.isArray:()Z
        //    41: ifeq            56
        //    44: aload_0         /* this */
        //    45: aload_1         /* name */
        //    46: aload_2         /* type */
        //    47: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //    50: invokespecial   com/sun/jna/Structure.validateField:(Ljava/lang/String;Ljava/lang/Class;)V
        //    53: goto            138
        //    56: aload_0         /* this */
        //    57: aload_2         /* type */
        //    58: invokevirtual   com/sun/jna/Structure.getNativeSize:(Ljava/lang/Class;)I
        //    61: pop            
        //    62: goto            138
        //    65: astore          5
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: invokespecial   java/lang/StringBuilder.<init>:()V
        //    74: ldc_w           "Invalid Structure field in "
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: aload_0         /* this */
        //    81: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    87: ldc_w           ", field name '"
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: aload_1         /* name */
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: ldc_w           "' ("
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: aload_2         /* type */
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   107: ldc_w           "): "
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: aload           5
        //   115: invokevirtual   java/lang/IllegalArgumentException.getMessage:()Ljava/lang/String;
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   124: astore          6
        //   126: new             Ljava/lang/IllegalArgumentException;
        //   129: dup            
        //   130: aload           6
        //   132: aload           msg
        //   134: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   137: athrow         
        //   138: return         
        //    Signature:
        //  (Ljava/lang/String;Ljava/lang/Class<*>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  56     62     65     138    Ljava/lang/IllegalArgumentException;
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
    
    private void validateFields() {
        for (final Field field : this.getFieldList()) {
            this.validateField(field.getName(), field.getType());
        }
    }
    
    private Structure$LayoutInfo deriveLayout(final boolean force, final boolean avoidFFIType) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          5
        //     3: aload_0         /* this */
        //     4: iload_1         /* force */
        //     5: invokevirtual   com/sun/jna/Structure.getFields:(Z)Ljava/util/List;
        //     8: astore          6
        //    10: aload           6
        //    12: ifnonnull       17
        //    15: aconst_null    
        //    16: areturn        
        //    17: new             Lcom/sun/jna/Structure$LayoutInfo;
        //    20: dup            
        //    21: aconst_null    
        //    22: invokespecial   com/sun/jna/Structure$LayoutInfo.<init>:(Lcom/sun/jna/Structure$1;)V
        //    25: astore          7
        //    27: aload           7
        //    29: aload_0         /* this */
        //    30: getfield        com/sun/jna/Structure.alignType:I
        //    33: invokestatic    com/sun/jna/Structure$LayoutInfo.access$202:(Lcom/sun/jna/Structure$LayoutInfo;I)I
        //    36: pop            
        //    37: aload           7
        //    39: aload_0         /* this */
        //    40: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //    43: invokestatic    com/sun/jna/Structure$LayoutInfo.access$302:(Lcom/sun/jna/Structure$LayoutInfo;Lcom/sun/jna/TypeMapper;)Lcom/sun/jna/TypeMapper;
        //    46: pop            
        //    47: iconst_1       
        //    48: istore          8
        //    50: aload           info
        //    52: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    57: astore          9
        //    59: aload           9
        //    61: invokeinterface java/util/Iterator.hasNext:()Z
        //    66: ifeq            962
        //    69: aload           9
        //    71: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    76: checkcast       Ljava/lang/reflect/Field;
        //    79: astore          10
        //    81: aload           10
        //    83: invokevirtual   java/lang/reflect/Field.getModifiers:()I
        //    86: istore          11
        //    88: aload           modifiers
        //    90: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //    93: astore          12
        //    95: aload           12
        //    97: invokevirtual   java/lang/Class.isArray:()Z
        //   100: ifeq            110
        //   103: aload           firstField
        //   105: iconst_1       
        //   106: invokestatic    com/sun/jna/Structure$LayoutInfo.access$002:(Lcom/sun/jna/Structure$LayoutInfo;Z)Z
        //   109: pop            
        //   110: new             Lcom/sun/jna/Structure$StructField;
        //   113: dup            
        //   114: invokespecial   com/sun/jna/Structure$StructField.<init>:()V
        //   117: astore          13
        //   119: aload           13
        //   121: iload           type
        //   123: invokestatic    java/lang/reflect/Modifier.isVolatile:(I)Z
        //   126: putfield        com/sun/jna/Structure$StructField.isVolatile:Z
        //   129: aload           13
        //   131: iload           type
        //   133: invokestatic    java/lang/reflect/Modifier.isFinal:(I)Z
        //   136: putfield        com/sun/jna/Structure$StructField.isReadOnly:Z
        //   139: aload           13
        //   141: getfield        com/sun/jna/Structure$StructField.isReadOnly:Z
        //   144: ifeq            210
        //   147: getstatic       com/sun/jna/Platform.RO_FIELDS:Z
        //   150: ifne            204
        //   153: new             Ljava/lang/IllegalArgumentException;
        //   156: dup            
        //   157: new             Ljava/lang/StringBuilder;
        //   160: dup            
        //   161: invokespecial   java/lang/StringBuilder.<init>:()V
        //   164: ldc_w           "This VM does not support read-only fields (field '"
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: aload           modifiers
        //   172: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: ldc_w           "' within "
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: aload_0         /* this */
        //   185: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   191: ldc_w           ")"
        //   194: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   197: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   200: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   203: athrow         
        //   204: aload           modifiers
        //   206: iconst_1       
        //   207: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   210: aload           13
        //   212: aload           modifiers
        //   214: putfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //   217: aload           13
        //   219: aload           modifiers
        //   221: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   224: putfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   227: aload           13
        //   229: aload           structField
        //   231: putfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //   234: ldc_w           Lcom/sun/jna/Callback;.class
        //   237: aload           structField
        //   239: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   242: ifeq            291
        //   245: aload           structField
        //   247: invokevirtual   java/lang/Class.isInterface:()Z
        //   250: ifne            291
        //   253: new             Ljava/lang/IllegalArgumentException;
        //   256: dup            
        //   257: new             Ljava/lang/StringBuilder;
        //   260: dup            
        //   261: invokespecial   java/lang/StringBuilder.<init>:()V
        //   264: ldc_w           "Structure Callback field '"
        //   267: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   270: aload           modifiers
        //   272: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   275: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   278: ldc_w           "' must be an interface"
        //   281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   284: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   287: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   290: athrow         
        //   291: aload           structField
        //   293: invokevirtual   java/lang/Class.isArray:()Z
        //   296: ifeq            327
        //   299: ldc             Lcom/sun/jna/Structure;.class
        //   301: aload           structField
        //   303: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   306: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   309: ifeq            327
        //   312: ldc_w           "Nested Structure arrays must use a derived Structure type so that the size of the elements can be determined"
        //   315: astore          14
        //   317: new             Ljava/lang/IllegalArgumentException;
        //   320: dup            
        //   321: aload           14
        //   323: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   326: athrow         
        //   327: iconst_1       
        //   328: istore          14
        //   330: aload           modifiers
        //   332: invokevirtual   java/lang/reflect/Field.getModifiers:()I
        //   335: invokestatic    java/lang/reflect/Modifier.isPublic:(I)Z
        //   338: ifne            344
        //   341: goto            956
        //   344: aload_0         /* this */
        //   345: aload           fieldAlignment
        //   347: getfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //   350: invokevirtual   com/sun/jna/Structure.getFieldValue:(Ljava/lang/reflect/Field;)Ljava/lang/Object;
        //   353: astore          15
        //   355: aload           15
        //   357: ifnonnull       385
        //   360: aload           structField
        //   362: invokevirtual   java/lang/Class.isArray:()Z
        //   365: ifeq            385
        //   368: iload_1         /* force */
        //   369: ifeq            383
        //   372: new             Ljava/lang/IllegalStateException;
        //   375: dup            
        //   376: ldc_w           "Array fields must be initialized"
        //   379: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   382: athrow         
        //   383: aconst_null    
        //   384: areturn        
        //   385: aload           structField
        //   387: astore          16
        //   389: ldc_w           Lcom/sun/jna/NativeMapped;.class
        //   392: aload           structField
        //   394: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   397: ifeq            446
        //   400: aload           structField
        //   402: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   405: astore          17
        //   407: aload           17
        //   409: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   412: astore          tc
        //   414: aload           fieldAlignment
        //   416: aload           17
        //   418: putfield        com/sun/jna/Structure$StructField.writeConverter:Lcom/sun/jna/ToNativeConverter;
        //   421: aload           fieldAlignment
        //   423: aload           17
        //   425: putfield        com/sun/jna/Structure$StructField.readConverter:Lcom/sun/jna/FromNativeConverter;
        //   428: aload           fieldAlignment
        //   430: new             Lcom/sun/jna/StructureReadContext;
        //   433: dup            
        //   434: aload_0         /* this */
        //   435: aload           modifiers
        //   437: invokespecial   com/sun/jna/StructureReadContext.<init>:(Lcom/sun/jna/Structure;Ljava/lang/reflect/Field;)V
        //   440: putfield        com/sun/jna/Structure$StructField.context:Lcom/sun/jna/FromNativeContext;
        //   443: goto            605
        //   446: aload_0         /* this */
        //   447: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //   450: ifnull          605
        //   453: aload_0         /* this */
        //   454: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //   457: aload           structField
        //   459: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //   464: astore          17
        //   466: aload_0         /* this */
        //   467: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //   470: aload           structField
        //   472: invokeinterface com/sun/jna/TypeMapper.getFromNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/FromNativeConverter;
        //   477: astore          18
        //   479: aload           readConverter
        //   481: ifnull          562
        //   484: aload           18
        //   486: ifnull          562
        //   489: aload           readConverter
        //   491: aload           nativeType
        //   493: new             Lcom/sun/jna/StructureWriteContext;
        //   496: dup            
        //   497: aload_0         /* this */
        //   498: aload           fieldAlignment
        //   500: getfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //   503: invokespecial   com/sun/jna/StructureWriteContext.<init>:(Lcom/sun/jna/Structure;Ljava/lang/reflect/Field;)V
        //   506: invokeinterface com/sun/jna/ToNativeConverter.toNative:(Ljava/lang/Object;Lcom/sun/jna/ToNativeContext;)Ljava/lang/Object;
        //   511: astore          nativeType
        //   513: aload           nativeType
        //   515: ifnull          526
        //   518: aload           nativeType
        //   520: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   523: goto            528
        //   526: ldc             Lcom/sun/jna/Pointer;.class
        //   528: astore          writeConverter
        //   530: aload           fieldAlignment
        //   532: aload           readConverter
        //   534: putfield        com/sun/jna/Structure$StructField.writeConverter:Lcom/sun/jna/ToNativeConverter;
        //   537: aload           fieldAlignment
        //   539: aload           18
        //   541: putfield        com/sun/jna/Structure$StructField.readConverter:Lcom/sun/jna/FromNativeConverter;
        //   544: aload           fieldAlignment
        //   546: new             Lcom/sun/jna/StructureReadContext;
        //   549: dup            
        //   550: aload_0         /* this */
        //   551: aload           modifiers
        //   553: invokespecial   com/sun/jna/StructureReadContext.<init>:(Lcom/sun/jna/Structure;Ljava/lang/reflect/Field;)V
        //   556: putfield        com/sun/jna/Structure$StructField.context:Lcom/sun/jna/FromNativeContext;
        //   559: goto            605
        //   562: aload           readConverter
        //   564: ifnonnull       572
        //   567: aload           18
        //   569: ifnull          605
        //   572: new             Ljava/lang/StringBuilder;
        //   575: dup            
        //   576: invokespecial   java/lang/StringBuilder.<init>:()V
        //   579: ldc_w           "Structures require bidirectional type conversion for "
        //   582: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   585: aload           structField
        //   587: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   590: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   593: astore          19
        //   595: new             Ljava/lang/IllegalArgumentException;
        //   598: dup            
        //   599: aload           19
        //   601: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   604: athrow         
        //   605: aload           nativeType
        //   607: ifnonnull       623
        //   610: aload_0         /* this */
        //   611: aload           fieldAlignment
        //   613: getfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //   616: aload           structField
        //   618: invokespecial   com/sun/jna/Structure.initializeField:(Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/Object;
        //   621: astore          nativeType
        //   623: aload           fieldAlignment
        //   625: aload_0         /* this */
        //   626: aload           16
        //   628: aload           nativeType
        //   630: invokevirtual   com/sun/jna/Structure.getNativeSize:(Ljava/lang/Class;Ljava/lang/Object;)I
        //   633: putfield        com/sun/jna/Structure$StructField.size:I
        //   636: aload_0         /* this */
        //   637: aload           16
        //   639: aload           nativeType
        //   641: iload           i
        //   643: invokevirtual   com/sun/jna/Structure.getNativeAlignment:(Ljava/lang/Class;Ljava/lang/Object;Z)I
        //   646: istore          value
        //   648: goto            745
        //   651: astore          17
        //   653: iload_1         /* force */
        //   654: ifne            666
        //   657: aload_0         /* this */
        //   658: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //   661: ifnonnull       666
        //   664: aconst_null    
        //   665: areturn        
        //   666: new             Ljava/lang/StringBuilder;
        //   669: dup            
        //   670: invokespecial   java/lang/StringBuilder.<init>:()V
        //   673: ldc_w           "Invalid Structure field in "
        //   676: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   679: aload_0         /* this */
        //   680: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   683: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   686: ldc_w           ", field name '"
        //   689: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   692: aload           fieldAlignment
        //   694: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   697: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   700: ldc_w           "' ("
        //   703: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   706: aload           fieldAlignment
        //   708: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //   711: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   714: ldc_w           "): "
        //   717: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   720: aload           17
        //   722: invokevirtual   java/lang/IllegalArgumentException.getMessage:()Ljava/lang/String;
        //   725: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   728: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   731: astore          18
        //   733: new             Ljava/lang/IllegalArgumentException;
        //   736: dup            
        //   737: aload           18
        //   739: aload           msg
        //   741: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   744: athrow         
        //   745: iload           value
        //   747: ifne            795
        //   750: new             Ljava/lang/Error;
        //   753: dup            
        //   754: new             Ljava/lang/StringBuilder;
        //   757: dup            
        //   758: invokespecial   java/lang/StringBuilder.<init>:()V
        //   761: ldc_w           "Field alignment is zero for field '"
        //   764: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   767: aload           fieldAlignment
        //   769: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   772: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   775: ldc_w           "' within "
        //   778: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   781: aload_0         /* this */
        //   782: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   785: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   788: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   791: invokespecial   java/lang/Error.<init>:(Ljava/lang/String;)V
        //   794: athrow         
        //   795: aload           firstField
        //   797: aload           firstField
        //   799: invokestatic    com/sun/jna/Structure$LayoutInfo.access$400:(Lcom/sun/jna/Structure$LayoutInfo;)I
        //   802: iload           value
        //   804: invokestatic    java/lang/Math.max:(II)I
        //   807: invokestatic    com/sun/jna/Structure$LayoutInfo.access$402:(Lcom/sun/jna/Structure$LayoutInfo;I)I
        //   810: pop            
        //   811: iload           fields
        //   813: iload           value
        //   815: irem           
        //   816: ifeq            832
        //   819: iload           fields
        //   821: iload           value
        //   823: iload           fields
        //   825: iload           value
        //   827: irem           
        //   828: isub           
        //   829: iadd           
        //   830: istore          fields
        //   832: aload_0         /* this */
        //   833: instanceof      Lcom/sun/jna/Union;
        //   836: ifeq            860
        //   839: aload           fieldAlignment
        //   841: iconst_0       
        //   842: putfield        com/sun/jna/Structure$StructField.offset:I
        //   845: iload           fields
        //   847: aload           fieldAlignment
        //   849: getfield        com/sun/jna/Structure$StructField.size:I
        //   852: invokestatic    java/lang/Math.max:(II)I
        //   855: istore          fields
        //   857: goto            877
        //   860: aload           fieldAlignment
        //   862: iload           fields
        //   864: putfield        com/sun/jna/Structure$StructField.offset:I
        //   867: iload           fields
        //   869: aload           fieldAlignment
        //   871: getfield        com/sun/jna/Structure$StructField.size:I
        //   874: iadd           
        //   875: istore          fields
        //   877: aload           firstField
        //   879: invokestatic    com/sun/jna/Structure$LayoutInfo.access$500:(Lcom/sun/jna/Structure$LayoutInfo;)Ljava/util/Map;
        //   882: aload           fieldAlignment
        //   884: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   887: aload           fieldAlignment
        //   889: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   894: pop            
        //   895: aload           firstField
        //   897: invokestatic    com/sun/jna/Structure$LayoutInfo.access$700:(Lcom/sun/jna/Structure$LayoutInfo;)Lcom/sun/jna/Structure$StructField;
        //   900: ifnull          948
        //   903: aload           firstField
        //   905: invokestatic    com/sun/jna/Structure$LayoutInfo.access$700:(Lcom/sun/jna/Structure$LayoutInfo;)Lcom/sun/jna/Structure$StructField;
        //   908: getfield        com/sun/jna/Structure$StructField.size:I
        //   911: aload           fieldAlignment
        //   913: getfield        com/sun/jna/Structure$StructField.size:I
        //   916: if_icmplt       948
        //   919: aload           firstField
        //   921: invokestatic    com/sun/jna/Structure$LayoutInfo.access$700:(Lcom/sun/jna/Structure$LayoutInfo;)Lcom/sun/jna/Structure$StructField;
        //   924: getfield        com/sun/jna/Structure$StructField.size:I
        //   927: aload           fieldAlignment
        //   929: getfield        com/sun/jna/Structure$StructField.size:I
        //   932: if_icmpne       956
        //   935: ldc             Lcom/sun/jna/Structure;.class
        //   937: aload           fieldAlignment
        //   939: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //   942: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   945: ifeq            956
        //   948: aload           firstField
        //   950: aload           fieldAlignment
        //   952: invokestatic    com/sun/jna/Structure$LayoutInfo.access$702:(Lcom/sun/jna/Structure$LayoutInfo;Lcom/sun/jna/Structure$StructField;)Lcom/sun/jna/Structure$StructField;
        //   955: pop            
        //   956: iconst_0       
        //   957: istore          i
        //   959: goto            59
        //   962: iload           fields
        //   964: ifle            1007
        //   967: aload_0         /* this */
        //   968: iload           fields
        //   970: aload           firstField
        //   972: invokestatic    com/sun/jna/Structure$LayoutInfo.access$400:(Lcom/sun/jna/Structure$LayoutInfo;)I
        //   975: invokespecial   com/sun/jna/Structure.addPadding:(II)I
        //   978: istore          9
        //   980: aload_0         /* this */
        //   981: instanceof      Lcom/sun/jna/Structure$ByValue;
        //   984: ifeq            996
        //   987: iload_2         /* avoidFFIType */
        //   988: ifne            996
        //   991: aload_0         /* this */
        //   992: invokevirtual   com/sun/jna/Structure.getTypeInfo:()Lcom/sun/jna/Pointer;
        //   995: pop            
        //   996: aload           firstField
        //   998: iload           9
        //  1000: invokestatic    com/sun/jna/Structure$LayoutInfo.access$102:(Lcom/sun/jna/Structure$LayoutInfo;I)I
        //  1003: pop            
        //  1004: aload           firstField
        //  1006: areturn        
        //  1007: new             Ljava/lang/IllegalArgumentException;
        //  1010: dup            
        //  1011: new             Ljava/lang/StringBuilder;
        //  1014: dup            
        //  1015: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1018: ldc_w           "Structure "
        //  1021: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1024: aload_0         /* this */
        //  1025: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1028: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1031: ldc_w           " has unknown or zero size (ensure all fields are public)"
        //  1034: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1037: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1040: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //  1043: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  623    648    651    745    Ljava/lang/IllegalArgumentException;
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
    
    private void initializeFields() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/sun/jna/Structure.getFieldList:()Ljava/util/List;
        //     4: astore_3       
        //     5: aload_3        
        //     6: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    11: astore          4
        //    13: aload           4
        //    15: invokeinterface java/util/Iterator.hasNext:()Z
        //    20: ifeq            115
        //    23: aload           4
        //    25: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    30: checkcast       Ljava/lang/reflect/Field;
        //    33: astore          5
        //    35: aload           5
        //    37: aload_0         /* this */
        //    38: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    41: astore          6
        //    43: aload           6
        //    45: ifnonnull       60
        //    48: aload_0         /* this */
        //    49: aload           o
        //    51: aload           o
        //    53: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //    56: invokespecial   com/sun/jna/Structure.initializeField:(Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/Object;
        //    59: pop            
        //    60: goto            112
        //    63: astore          6
        //    65: new             Ljava/lang/Error;
        //    68: dup            
        //    69: new             Ljava/lang/StringBuilder;
        //    72: dup            
        //    73: invokespecial   java/lang/StringBuilder.<init>:()V
        //    76: ldc_w           "Exception reading field '"
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: aload           e
        //    84: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: ldc_w           "' in "
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: aload_0         /* this */
        //    97: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   103: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   106: aload           6
        //   108: invokespecial   java/lang/Error.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   111: athrow         
        //   112: goto            13
        //   115: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  35     60     63     112    Ljava/lang/Exception;
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
    
    private Object initializeField(final Field field, final Class<?> type) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          5
        //     3: ldc             Lcom/sun/jna/Structure;.class
        //     5: aload_2         /* type */
        //     6: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //     9: ifeq            60
        //    12: ldc_w           Lcom/sun/jna/Structure$ByReference;.class
        //    15: aload_2         /* type */
        //    16: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    19: ifne            60
        //    22: aload_2         /* type */
        //    23: getstatic       com/sun/jna/Structure.PLACEHOLDER_MEMORY:Lcom/sun/jna/Pointer;
        //    26: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //    29: astore          5
        //    31: aload_0         /* this */
        //    32: aload_1         /* field */
        //    33: aload           5
        //    35: invokevirtual   com/sun/jna/Structure.setFieldValue:(Ljava/lang/reflect/Field;Ljava/lang/Object;)V
        //    38: goto            90
        //    41: astore          6
        //    43: ldc_w           "Can't determine size of nested structure"
        //    46: astore          7
        //    48: new             Ljava/lang/IllegalArgumentException;
        //    51: dup            
        //    52: aload           7
        //    54: aload           msg
        //    56: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    59: athrow         
        //    60: ldc_w           Lcom/sun/jna/NativeMapped;.class
        //    63: aload_2         /* type */
        //    64: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    67: ifeq            90
        //    70: aload_2         /* type */
        //    71: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //    74: astore          6
        //    76: aload           6
        //    78: invokevirtual   com/sun/jna/NativeMappedConverter.defaultValue:()Lcom/sun/jna/NativeMapped;
        //    81: astore          tc
        //    83: aload_0         /* this */
        //    84: aload_1         /* field */
        //    85: aload           tc
        //    87: invokevirtual   com/sun/jna/Structure.setFieldValue:(Ljava/lang/reflect/Field;Ljava/lang/Object;)V
        //    90: aload           tc
        //    92: areturn        
        //    Signature:
        //  (Ljava/lang/reflect/Field;Ljava/lang/Class<*>;)Ljava/lang/Object;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  22     38     41     60     Ljava/lang/IllegalArgumentException;
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
    
    private int addPadding(final int calculatedSize) {
        return this.addPadding(calculatedSize, this.structAlignment);
    }
    
    private int addPadding(int calculatedSize, final int alignment) {
        if (this.actualAlignType != 1 && calculatedSize % alignment != 0) {
            calculatedSize += alignment - calculatedSize % alignment;
        }
        return calculatedSize;
    }
    
    public int getStructAlignment() {
        if (this.size == -1) {
            this.calculateSize(true);
        }
        return this.structAlignment;
    }
    
    public int getNativeAlignment(Class<?> type, Object value, final boolean isFirstElement) {
        if (NativeMapped.class.isAssignableFrom(type)) {
            final NativeMappedConverter instance = NativeMappedConverter.getInstance(type);
            type = instance.nativeType();
            value = instance.toNative(value, new ToNativeContext());
        }
        final int nativeSize = Native.getNativeSize(type, value);
        int size;
        if (type.isPrimitive() || Long.class == type || Integer.class == type || Short.class == type || Character.class == type || Byte.class == type || Boolean.class == type || Float.class == type || Double.class == type) {
            size = nativeSize;
        }
        else if ((Pointer.class.isAssignableFrom(type) && !Function.class.isAssignableFrom(type)) || (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(type)) || Callback.class.isAssignableFrom(type) || WString.class == type || String.class == type) {
            size = Pointer.SIZE;
        }
        else if (Structure.class.isAssignableFrom(type)) {
            if (Structure$ByReference.class.isAssignableFrom(type)) {
                size = Pointer.SIZE;
            }
            else {
                if (value == null) {
                    value = newInstance(type, Structure.PLACEHOLDER_MEMORY);
                }
                size = ((Structure)value).getStructAlignment();
            }
        }
        else {
            if (!type.isArray()) {
                throw new IllegalArgumentException("Type " + type + " has unknown native alignment");
            }
            size = this.getNativeAlignment(type.getComponentType(), null, isFirstElement);
        }
        if (this.actualAlignType == 1) {
            size = 1;
        }
        else if (this.actualAlignType == 3) {
            size = Math.min(8, size);
        }
        else if (this.actualAlignType == 2) {
            if (!isFirstElement || !Platform.isMac() || !Platform.isPPC()) {
                size = Math.min(Native.MAX_ALIGNMENT, size);
            }
            if (!isFirstElement && Platform.isAIX() && (type == Double.TYPE || type == Double.class)) {
                size = 4;
            }
        }
        return size;
    }
    
    @Override
    public String toString() {
        return this.toString(Boolean.getBoolean("jna.dump_memory"));
    }
    
    public String toString(final boolean debug) {
        return this.toString(0, true, debug);
    }
    
    private String format(final Class<?> type) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //     4: astore          4
        //     6: aload           4
        //     8: ldc_w           "."
        //    11: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //    14: istore          5
        //    16: aload           dot
        //    18: iload           5
        //    20: iconst_1       
        //    21: iadd           
        //    22: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    25: areturn        
        //    Signature:
        //  (Ljava/lang/Class<*>;)Ljava/lang/String;
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
    
    private String toString(final int indent, final boolean showContents, final boolean dumpMemory) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/sun/jna/Structure.ensureAllocated:()V
        //     4: ldc_w           "line.separator"
        //     7: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    10: astore          6
        //    12: new             Ljava/lang/StringBuilder;
        //    15: dup            
        //    16: invokespecial   java/lang/StringBuilder.<init>:()V
        //    19: aload_0         /* this */
        //    20: aload_0         /* this */
        //    21: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    24: invokespecial   com/sun/jna/Structure.format:(Ljava/lang/Class;)Ljava/lang/String;
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: ldc_w           "("
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    36: aload_0         /* this */
        //    37: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    43: ldc_w           ")"
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    49: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    52: astore          7
        //    54: aload_0         /* this */
        //    55: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //    58: instanceof      Lcom/sun/jna/Memory;
        //    61: ifne            100
        //    64: new             Ljava/lang/StringBuilder;
        //    67: dup            
        //    68: invokespecial   java/lang/StringBuilder.<init>:()V
        //    71: aload           7
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    76: ldc_w           " ("
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: aload_0         /* this */
        //    83: invokevirtual   com/sun/jna/Structure.size:()I
        //    86: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    89: ldc_w           " bytes)"
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    98: astore          7
        //   100: ldc_w           ""
        //   103: astore          8
        //   105: iconst_0       
        //   106: istore          9
        //   108: iload           9
        //   110: iload_1         /* indent */
        //   111: if_icmpge       143
        //   114: new             Ljava/lang/StringBuilder;
        //   117: dup            
        //   118: invokespecial   java/lang/StringBuilder.<init>:()V
        //   121: aload           idx
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: ldc_w           "  "
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   135: astore          idx
        //   137: iinc            9, 1
        //   140: goto            108
        //   143: aload           name
        //   145: astore          9
        //   147: iload_2         /* showContents */
        //   148: ifne            159
        //   151: ldc_w           "...}"
        //   154: astore          9
        //   156: goto            689
        //   159: aload_0         /* this */
        //   160: invokevirtual   com/sun/jna/Structure.fields:()Ljava/util/Map;
        //   163: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   168: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   173: astore          10
        //   175: aload           10
        //   177: invokeinterface java/util/Iterator.hasNext:()Z
        //   182: ifeq            689
        //   185: aload           10
        //   187: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   192: checkcast       Lcom/sun/jna/Structure$StructField;
        //   195: astore          11
        //   197: aload_0         /* this */
        //   198: aload           11
        //   200: getfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //   203: invokevirtual   com/sun/jna/Structure.getFieldValue:(Ljava/lang/reflect/Field;)Ljava/lang/Object;
        //   206: astore          12
        //   208: aload_0         /* this */
        //   209: aload           value
        //   211: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //   214: invokespecial   com/sun/jna/Structure.format:(Ljava/lang/Class;)Ljava/lang/String;
        //   217: astore          13
        //   219: ldc_w           ""
        //   222: astore          14
        //   224: new             Ljava/lang/StringBuilder;
        //   227: dup            
        //   228: invokespecial   java/lang/StringBuilder.<init>:()V
        //   231: aload           i
        //   233: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   236: aload           contents
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   244: astore          i
        //   246: aload           value
        //   248: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //   251: invokevirtual   java/lang/Class.isArray:()Z
        //   254: ifeq            308
        //   257: aload           type
        //   259: ifnull          308
        //   262: aload_0         /* this */
        //   263: aload           value
        //   265: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //   268: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   271: invokespecial   com/sun/jna/Structure.format:(Ljava/lang/Class;)Ljava/lang/String;
        //   274: astore          index
        //   276: new             Ljava/lang/StringBuilder;
        //   279: dup            
        //   280: invokespecial   java/lang/StringBuilder.<init>:()V
        //   283: ldc_w           "["
        //   286: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   289: aload           type
        //   291: invokestatic    java/lang/reflect/Array.getLength:(Ljava/lang/Object;)I
        //   294: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   297: ldc_w           "]"
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   303: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   306: astore          14
        //   308: new             Ljava/lang/StringBuilder;
        //   311: dup            
        //   312: invokespecial   java/lang/StringBuilder.<init>:()V
        //   315: aload           i
        //   317: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   320: ldc_w           "  "
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: aload           index
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: ldc_w           " "
        //   334: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   337: aload           value
        //   339: getfield        com/sun/jna/Structure$StructField.name:Ljava/lang/String;
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: aload           14
        //   347: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   350: ldc_w           "@"
        //   353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   356: aload           value
        //   358: getfield        com/sun/jna/Structure$StructField.offset:I
        //   361: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   364: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   367: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   370: astore          i
        //   372: aload           type
        //   374: instanceof      Lcom/sun/jna/Structure;
        //   377: ifeq            407
        //   380: aload           type
        //   382: checkcast       Lcom/sun/jna/Structure;
        //   385: iload_1         /* indent */
        //   386: iconst_1       
        //   387: iadd           
        //   388: aload           type
        //   390: instanceof      Lcom/sun/jna/Structure$ByReference;
        //   393: ifne            400
        //   396: iconst_1       
        //   397: goto            401
        //   400: iconst_0       
        //   401: iload_3         /* dumpMemory */
        //   402: invokespecial   com/sun/jna/Structure.toString:(IZZ)Ljava/lang/String;
        //   405: astore          type
        //   407: new             Ljava/lang/StringBuilder;
        //   410: dup            
        //   411: invokespecial   java/lang/StringBuilder.<init>:()V
        //   414: aload           i
        //   416: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   419: ldc_w           "="
        //   422: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   425: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   428: astore          i
        //   430: aload           type
        //   432: instanceof      Ljava/lang/Long;
        //   435: ifeq            472
        //   438: new             Ljava/lang/StringBuilder;
        //   441: dup            
        //   442: invokespecial   java/lang/StringBuilder.<init>:()V
        //   445: aload           i
        //   447: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   450: aload           type
        //   452: checkcast       Ljava/lang/Long;
        //   455: invokevirtual   java/lang/Long.longValue:()J
        //   458: invokestatic    java/lang/Long.toHexString:(J)Ljava/lang/String;
        //   461: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   464: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   467: astore          i
        //   469: goto            626
        //   472: aload           type
        //   474: instanceof      Ljava/lang/Integer;
        //   477: ifeq            514
        //   480: new             Ljava/lang/StringBuilder;
        //   483: dup            
        //   484: invokespecial   java/lang/StringBuilder.<init>:()V
        //   487: aload           i
        //   489: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   492: aload           type
        //   494: checkcast       Ljava/lang/Integer;
        //   497: invokevirtual   java/lang/Integer.intValue:()I
        //   500: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   503: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   506: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   509: astore          i
        //   511: goto            626
        //   514: aload           type
        //   516: instanceof      Ljava/lang/Short;
        //   519: ifeq            556
        //   522: new             Ljava/lang/StringBuilder;
        //   525: dup            
        //   526: invokespecial   java/lang/StringBuilder.<init>:()V
        //   529: aload           i
        //   531: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   534: aload           type
        //   536: checkcast       Ljava/lang/Short;
        //   539: invokevirtual   java/lang/Short.shortValue:()S
        //   542: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   545: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   548: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   551: astore          i
        //   553: goto            626
        //   556: aload           type
        //   558: instanceof      Ljava/lang/Byte;
        //   561: ifeq            598
        //   564: new             Ljava/lang/StringBuilder;
        //   567: dup            
        //   568: invokespecial   java/lang/StringBuilder.<init>:()V
        //   571: aload           i
        //   573: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   576: aload           type
        //   578: checkcast       Ljava/lang/Byte;
        //   581: invokevirtual   java/lang/Byte.byteValue:()B
        //   584: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   587: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   590: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   593: astore          i
        //   595: goto            626
        //   598: new             Ljava/lang/StringBuilder;
        //   601: dup            
        //   602: invokespecial   java/lang/StringBuilder.<init>:()V
        //   605: aload           i
        //   607: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   610: aload           type
        //   612: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   615: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   618: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   621: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   624: astore          i
        //   626: new             Ljava/lang/StringBuilder;
        //   629: dup            
        //   630: invokespecial   java/lang/StringBuilder.<init>:()V
        //   633: aload           i
        //   635: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   638: aload           name
        //   640: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   643: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   646: astore          i
        //   648: aload           sf
        //   650: invokeinterface java/util/Iterator.hasNext:()Z
        //   655: ifne            686
        //   658: new             Ljava/lang/StringBuilder;
        //   661: dup            
        //   662: invokespecial   java/lang/StringBuilder.<init>:()V
        //   665: aload           i
        //   667: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   670: aload           contents
        //   672: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   675: ldc_w           "}"
        //   678: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   681: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   684: astore          i
        //   686: goto            175
        //   689: iload_1         /* indent */
        //   690: ifne            936
        //   693: iload_3         /* dumpMemory */
        //   694: ifeq            936
        //   697: iconst_4       
        //   698: istore          10
        //   700: new             Ljava/lang/StringBuilder;
        //   703: dup            
        //   704: invokespecial   java/lang/StringBuilder.<init>:()V
        //   707: aload           BYTES_PER_ROW
        //   709: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   712: aload           name
        //   714: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   717: ldc_w           "memory dump"
        //   720: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   723: aload           name
        //   725: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   728: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   731: astore          BYTES_PER_ROW
        //   733: aload_0         /* this */
        //   734: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //   737: lconst_0       
        //   738: aload_0         /* this */
        //   739: invokevirtual   com/sun/jna/Structure.size:()I
        //   742: invokevirtual   com/sun/jna/Pointer.getByteArray:(JI)[B
        //   745: astore          11
        //   747: iconst_0       
        //   748: istore          12
        //   750: iload           12
        //   752: aload           i
        //   754: arraylength    
        //   755: if_icmpge       913
        //   758: iload           12
        //   760: iconst_4       
        //   761: irem           
        //   762: ifne            788
        //   765: new             Ljava/lang/StringBuilder;
        //   768: dup            
        //   769: invokespecial   java/lang/StringBuilder.<init>:()V
        //   772: aload           BYTES_PER_ROW
        //   774: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   777: ldc_w           "["
        //   780: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   783: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   786: astore          BYTES_PER_ROW
        //   788: aload           i
        //   790: iload           12
        //   792: baload         
        //   793: iflt            829
        //   796: aload           i
        //   798: iload           12
        //   800: baload         
        //   801: bipush          16
        //   803: if_icmpge       829
        //   806: new             Ljava/lang/StringBuilder;
        //   809: dup            
        //   810: invokespecial   java/lang/StringBuilder.<init>:()V
        //   813: aload           BYTES_PER_ROW
        //   815: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   818: ldc_w           "0"
        //   821: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   824: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   827: astore          BYTES_PER_ROW
        //   829: new             Ljava/lang/StringBuilder;
        //   832: dup            
        //   833: invokespecial   java/lang/StringBuilder.<init>:()V
        //   836: aload           BYTES_PER_ROW
        //   838: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   841: aload           i
        //   843: iload           12
        //   845: baload         
        //   846: sipush          255
        //   849: iand           
        //   850: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   853: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   856: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   859: astore          BYTES_PER_ROW
        //   861: iload           12
        //   863: iconst_4       
        //   864: irem           
        //   865: iconst_3       
        //   866: if_icmpne       907
        //   869: iload           12
        //   871: aload           i
        //   873: arraylength    
        //   874: iconst_1       
        //   875: isub           
        //   876: if_icmpge       907
        //   879: new             Ljava/lang/StringBuilder;
        //   882: dup            
        //   883: invokespecial   java/lang/StringBuilder.<init>:()V
        //   886: aload           BYTES_PER_ROW
        //   888: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   891: ldc_w           "]"
        //   894: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   897: aload           name
        //   899: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   902: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   905: astore          BYTES_PER_ROW
        //   907: iinc            12, 1
        //   910: goto            750
        //   913: new             Ljava/lang/StringBuilder;
        //   916: dup            
        //   917: invokespecial   java/lang/StringBuilder.<init>:()V
        //   920: aload           BYTES_PER_ROW
        //   922: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   925: ldc_w           "]"
        //   928: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   931: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   934: astore          BYTES_PER_ROW
        //   936: new             Ljava/lang/StringBuilder;
        //   939: dup            
        //   940: invokespecial   java/lang/StringBuilder.<init>:()V
        //   943: aload           prefix
        //   945: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   948: ldc_w           " {"
        //   951: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   954: aload           9
        //   956: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   959: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   962: areturn        
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
    
    public Structure[] toArray(final Structure[] array) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/sun/jna/Structure.ensureAllocated:()V
        //     4: aload_0         /* this */
        //     5: getfield        com/sun/jna/Structure.memory:Lcom/sun/jna/Pointer;
        //     8: instanceof      Lcom/sun/jna/Structure$AutoAllocated;
        //    11: ifeq            54
        //    14: aload_0         /* this */
        //    15: getfield        com/sun/jna/Structure.memory:Lcom/sun/jna/Pointer;
        //    18: checkcast       Lcom/sun/jna/Memory;
        //    21: astore          4
        //    23: aload_1         /* array */
        //    24: arraylength    
        //    25: aload_0         /* this */
        //    26: invokevirtual   com/sun/jna/Structure.size:()I
        //    29: imul           
        //    30: istore          5
        //    32: aload           requiredSize
        //    34: invokevirtual   com/sun/jna/Memory.size:()J
        //    37: iload           5
        //    39: i2l            
        //    40: lcmp           
        //    41: ifge            54
        //    44: aload_0         /* this */
        //    45: aload_0         /* this */
        //    46: iload           5
        //    48: invokevirtual   com/sun/jna/Structure.autoAllocate:(I)Lcom/sun/jna/Memory;
        //    51: invokevirtual   com/sun/jna/Structure.useMemory:(Lcom/sun/jna/Pointer;)V
        //    54: aload_1         /* array */
        //    55: iconst_0       
        //    56: aload_0         /* this */
        //    57: aastore        
        //    58: aload_0         /* this */
        //    59: invokevirtual   com/sun/jna/Structure.size:()I
        //    62: istore          4
        //    64: iconst_1       
        //    65: istore          5
        //    67: iload           5
        //    69: aload_1         /* array */
        //    70: arraylength    
        //    71: if_icmpge       114
        //    74: aload_1         /* array */
        //    75: iload           5
        //    77: aload_0         /* this */
        //    78: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    81: aload_0         /* this */
        //    82: getfield        com/sun/jna/Structure.memory:Lcom/sun/jna/Pointer;
        //    85: iload           5
        //    87: iload           i
        //    89: imul           
        //    90: i2l            
        //    91: iload           i
        //    93: i2l            
        //    94: invokevirtual   com/sun/jna/Pointer.share:(JJ)Lcom/sun/jna/Pointer;
        //    97: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //   100: aastore        
        //   101: aload_1         /* array */
        //   102: iload           5
        //   104: aaload         
        //   105: invokevirtual   com/sun/jna/Structure.conditionalAutoRead:()V
        //   108: iinc            5, 1
        //   111: goto            67
        //   114: aload_0         /* this */
        //   115: instanceof      Lcom/sun/jna/Structure$ByValue;
        //   118: ifne            126
        //   121: aload_0         /* this */
        //   122: aload_1         /* array */
        //   123: putfield        com/sun/jna/Structure.array:[Lcom/sun/jna/Structure;
        //   126: aload_1         /* array */
        //   127: areturn        
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
    
    public Structure[] toArray(final int size) {
        return this.toArray((Structure[])Array.newInstance(this.getClass(), size));
    }
    
    private Class<?> baseClass() {
        if ((this instanceof Structure$ByReference || this instanceof Structure$ByValue) && Structure.class.isAssignableFrom(this.getClass().getSuperclass())) {
            return this.getClass().getSuperclass();
        }
        return this.getClass();
    }
    
    public boolean dataEquals(final Structure s) {
        return this.dataEquals(s, false);
    }
    
    public boolean dataEquals(final Structure s, final boolean clear) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifeq            36
        //     4: aload_1         /* s */
        //     5: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //     8: aload_1         /* s */
        //     9: invokevirtual   com/sun/jna/Structure.size:()I
        //    12: i2l            
        //    13: invokevirtual   com/sun/jna/Pointer.clear:(J)V
        //    16: aload_1         /* s */
        //    17: invokevirtual   com/sun/jna/Structure.write:()V
        //    20: aload_0         /* this */
        //    21: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //    24: aload_0         /* this */
        //    25: invokevirtual   com/sun/jna/Structure.size:()I
        //    28: i2l            
        //    29: invokevirtual   com/sun/jna/Pointer.clear:(J)V
        //    32: aload_0         /* this */
        //    33: invokevirtual   com/sun/jna/Structure.write:()V
        //    36: aload_1         /* s */
        //    37: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //    40: lconst_0       
        //    41: aload_1         /* s */
        //    42: invokevirtual   com/sun/jna/Structure.size:()I
        //    45: invokevirtual   com/sun/jna/Pointer.getByteArray:(JI)[B
        //    48: astore          5
        //    50: aload_0         /* this */
        //    51: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //    54: lconst_0       
        //    55: aload_0         /* this */
        //    56: invokevirtual   com/sun/jna/Structure.size:()I
        //    59: invokevirtual   com/sun/jna/Pointer.getByteArray:(JI)[B
        //    62: astore          6
        //    64: aload           ref
        //    66: arraylength    
        //    67: aload           6
        //    69: arraylength    
        //    70: if_icmpne       107
        //    73: iconst_0       
        //    74: istore          7
        //    76: iload           7
        //    78: aload           ref
        //    80: arraylength    
        //    81: if_icmpge       105
        //    84: aload           ref
        //    86: iload           7
        //    88: baload         
        //    89: aload           i
        //    91: iload           7
        //    93: baload         
        //    94: if_icmpeq       99
        //    97: iconst_0       
        //    98: ireturn        
        //    99: iinc            7, 1
        //   102: goto            76
        //   105: iconst_1       
        //   106: ireturn        
        //   107: iconst_0       
        //   108: ireturn        
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
    public boolean equals(final Object o) {
        return o instanceof Structure && o.getClass() == this.getClass() && ((Structure)o).getPointer().equals(this.getPointer());
    }
    
    @Override
    public int hashCode() {
        if (this.getPointer() != null) {
            return this.getPointer().hashCode();
        }
        return this.getClass().hashCode();
    }
    
    public void cacheTypeInfo(final Pointer p) {
        this.typeInfo = p.peer;
    }
    
    public Pointer getFieldTypeInfo(final Structure$StructField f) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/Structure$StructField.type:Ljava/lang/Class;
        //     4: astore          4
        //     6: aload_0         /* this */
        //     7: aload_1         /* f */
        //     8: getfield        com/sun/jna/Structure$StructField.field:Ljava/lang/reflect/Field;
        //    11: invokevirtual   com/sun/jna/Structure.getFieldValue:(Ljava/lang/reflect/Field;)Ljava/lang/Object;
        //    14: astore          5
        //    16: aload_0         /* this */
        //    17: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //    20: ifnull          68
        //    23: aload_0         /* this */
        //    24: getfield        com/sun/jna/Structure.typeMapper:Lcom/sun/jna/TypeMapper;
        //    27: aload           value
        //    29: invokeinterface com/sun/jna/TypeMapper.getToNativeConverter:(Ljava/lang/Class;)Lcom/sun/jna/ToNativeConverter;
        //    34: astore          6
        //    36: aload           6
        //    38: ifnull          68
        //    41: aload           6
        //    43: invokeinterface com/sun/jna/ToNativeConverter.nativeType:()Ljava/lang/Class;
        //    48: astore          value
        //    50: aload           6
        //    52: aload           nc
        //    54: new             Lcom/sun/jna/ToNativeContext;
        //    57: dup            
        //    58: invokespecial   com/sun/jna/ToNativeContext.<init>:()V
        //    61: invokeinterface com/sun/jna/ToNativeConverter.toNative:(Ljava/lang/Object;Lcom/sun/jna/ToNativeContext;)Ljava/lang/Object;
        //    66: astore          nc
        //    68: aload           nc
        //    70: aload           value
        //    72: invokestatic    com/sun/jna/Structure$FFIType.access$800:(Ljava/lang/Object;Ljava/lang/Class;)Lcom/sun/jna/Pointer;
        //    75: areturn        
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
    
    public Pointer getTypeInfo() {
        final Pointer typeInfo = getTypeInfo(this);
        this.cacheTypeInfo(typeInfo);
        return typeInfo;
    }
    
    public void setAutoSynch(final boolean auto) {
        this.setAutoRead(auto);
        this.setAutoWrite(auto);
    }
    
    public void setAutoRead(final boolean auto) {
        this.autoRead = auto;
    }
    
    public boolean getAutoRead() {
        return this.autoRead;
    }
    
    public void setAutoWrite(final boolean auto) {
        this.autoWrite = auto;
    }
    
    public boolean getAutoWrite() {
        return this.autoWrite;
    }
    
    public static Pointer getTypeInfo(final Object obj) {
        return Structure$FFIType.get(obj);
    }
    
    private static Structure newInstance(final Class<?> type, final long init) {
        try {
            final Structure instance = newInstance(type, (init == 0L) ? Structure.PLACEHOLDER_MEMORY : new Pointer(init));
            if (init != 0L) {
                instance.conditionalAutoRead();
            }
            return instance;
        }
        catch (final Throwable obj) {
            System.err.println("JNA: Error creating structure: " + obj);
            return null;
        }
    }
    
    public static Structure newInstance(final Class<?> type, final Pointer init) throws IllegalArgumentException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_1       
        //     2: anewarray       Ljava/lang/Class;
        //     5: dup            
        //     6: iconst_0       
        //     7: ldc             Lcom/sun/jna/Pointer;.class
        //     9: aastore        
        //    10: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    13: astore          4
        //    15: aload           4
        //    17: iconst_1       
        //    18: anewarray       Ljava/lang/Object;
        //    21: dup            
        //    22: iconst_0       
        //    23: aload_1         /* init */
        //    24: aastore        
        //    25: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    28: checkcast       Lcom/sun/jna/Structure;
        //    31: areturn        
        //    32: astore          4
        //    34: goto            161
        //    37: astore          4
        //    39: goto            161
        //    42: astore          4
        //    44: new             Ljava/lang/StringBuilder;
        //    47: dup            
        //    48: invokespecial   java/lang/StringBuilder.<init>:()V
        //    51: ldc_w           "Can't instantiate "
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: aload_0         /* type */
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: astore          5
        //    66: new             Ljava/lang/IllegalArgumentException;
        //    69: dup            
        //    70: aload           5
        //    72: aload           msg
        //    74: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    77: athrow         
        //    78: astore          null
        //    80: new             Ljava/lang/StringBuilder;
        //    83: dup            
        //    84: invokespecial   java/lang/StringBuilder.<init>:()V
        //    87: ldc_w           "Instantiation of "
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: aload_0         /* type */
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    97: ldc_w           " (Pointer) not allowed, is it public?"
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   106: astore          5
        //   108: new             Ljava/lang/IllegalArgumentException;
        //   111: dup            
        //   112: aload           5
        //   114: aload           msg
        //   116: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   119: athrow         
        //   120: astore          null
        //   122: new             Ljava/lang/StringBuilder;
        //   125: dup            
        //   126: invokespecial   java/lang/StringBuilder.<init>:()V
        //   129: ldc_w           "Exception thrown while instantiating an instance of "
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: aload_0         /* type */
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   139: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   142: astore          5
        //   144: aload           msg
        //   146: invokevirtual   java/lang/reflect/InvocationTargetException.printStackTrace:()V
        //   149: new             Ljava/lang/IllegalArgumentException;
        //   152: dup            
        //   153: aload           5
        //   155: aload           msg
        //   157: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   160: athrow         
        //   161: aload_0         /* type */
        //   162: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;)Lcom/sun/jna/Structure;
        //   165: astore          4
        //   167: aload_1         /* init */
        //   168: getstatic       com/sun/jna/Structure.PLACEHOLDER_MEMORY:Lcom/sun/jna/Pointer;
        //   171: if_acmpeq       180
        //   174: aload           4
        //   176: aload_1         /* init */
        //   177: invokevirtual   com/sun/jna/Structure.useMemory:(Lcom/sun/jna/Pointer;)V
        //   180: aload           4
        //   182: areturn        
        //    Exceptions:
        //  throws java.lang.IllegalArgumentException
        //    Signature:
        //  (Ljava/lang/Class<*>;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  0      31     32     37     Ljava/lang/NoSuchMethodException;
        //  0      31     37     42     Ljava/lang/SecurityException;
        //  0      31     42     78     Ljava/lang/InstantiationException;
        //  0      31     78     120    Ljava/lang/IllegalAccessException;
        //  0      31     120    161    Ljava/lang/reflect/InvocationTargetException;
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
    
    public static Structure newInstance(final Class<?> type) throws IllegalArgumentException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
        //     4: checkcast       Lcom/sun/jna/Structure;
        //     7: astore_3       
        //     8: aload_3        
        //     9: instanceof      Lcom/sun/jna/Structure$ByValue;
        //    12: ifeq            19
        //    15: aload_3        
        //    16: invokevirtual   com/sun/jna/Structure.allocateMemory:()V
        //    19: aload_3        
        //    20: areturn        
        //    21: astore_3       
        //    22: new             Ljava/lang/StringBuilder;
        //    25: dup            
        //    26: invokespecial   java/lang/StringBuilder.<init>:()V
        //    29: ldc_w           "Can't instantiate "
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    35: aload_0         /* type */
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    39: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    42: astore          4
        //    44: new             Ljava/lang/IllegalArgumentException;
        //    47: dup            
        //    48: aload           4
        //    50: aload_3         /* msg */
        //    51: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    54: athrow         
        //    55: astore_3        /* msg */
        //    56: new             Ljava/lang/StringBuilder;
        //    59: dup            
        //    60: invokespecial   java/lang/StringBuilder.<init>:()V
        //    63: ldc_w           "Instantiation of "
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: aload_0         /* type */
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    73: ldc_w           " not allowed, is it public?"
        //    76: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    79: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    82: astore          4
        //    84: new             Ljava/lang/IllegalArgumentException;
        //    87: dup            
        //    88: aload           4
        //    90: aload_3         /* msg */
        //    91: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    94: athrow         
        //    Exceptions:
        //  throws java.lang.IllegalArgumentException
        //    Signature:
        //  (Ljava/lang/Class<*>;)Lcom/sun/jna/Structure;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      20     21     55     Ljava/lang/InstantiationException;
        //  0      20     55     95     Ljava/lang/IllegalAccessException;
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
    
    public Structure$StructField typeInfoField() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: astore_3       
        //     5: monitorenter   
        //     6: getstatic       com/sun/jna/Structure.layoutInfo:Ljava/util/Map;
        //     9: aload_0         /* this */
        //    10: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    13: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    18: checkcast       Lcom/sun/jna/Structure$LayoutInfo;
        //    21: astore          4
        //    23: aload_3        
        //    24: monitorexit    
        //    25: goto            35
        //    28: astore          5
        //    30: aload_3        
        //    31: monitorexit    
        //    32: aload           5
        //    34: athrow         
        //    35: aload           4
        //    37: ifnull          46
        //    40: aload           4
        //    42: invokestatic    com/sun/jna/Structure$LayoutInfo.access$700:(Lcom/sun/jna/Structure$LayoutInfo;)Lcom/sun/jna/Structure$StructField;
        //    45: areturn        
        //    46: aconst_null    
        //    47: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  6      25     28     35     Any
        //  28     32     28     35     Any
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
    
    private static void structureArrayCheck(final Structure[] ss) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0         /* ss */
        //     4: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //     7: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    10: ifeq            14
        //    13: return         
        //    14: aload_0         /* ss */
        //    15: iconst_0       
        //    16: aaload         
        //    17: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //    20: astore_3       
        //    21: aload_0         /* ss */
        //    22: iconst_0       
        //    23: aaload         
        //    24: invokevirtual   com/sun/jna/Structure.size:()I
        //    27: istore          4
        //    29: iconst_1       
        //    30: istore          5
        //    32: iload           5
        //    34: aload_0         /* ss */
        //    35: arraylength    
        //    36: if_icmpge       109
        //    39: aload_0         /* ss */
        //    40: iload           5
        //    42: aaload         
        //    43: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //    46: getfield        com/sun/jna/Pointer.peer:J
        //    49: aload_3         /* size */
        //    50: getfield        com/sun/jna/Pointer.peer:J
        //    53: iload           si
        //    55: iload           5
        //    57: imul           
        //    58: i2l            
        //    59: ladd           
        //    60: lcmp           
        //    61: ifeq            103
        //    64: new             Ljava/lang/StringBuilder;
        //    67: dup            
        //    68: invokespecial   java/lang/StringBuilder.<init>:()V
        //    71: ldc_w           "Structure array elements must use contiguous memory (bad backing address at Structure array index "
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: iload           5
        //    79: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    82: ldc_w           ")"
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    91: astore          6
        //    93: new             Ljava/lang/IllegalArgumentException;
        //    96: dup            
        //    97: aload           6
        //    99: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   102: athrow         
        //   103: iinc            msg, 1
        //   106: goto            32
        //   109: return         
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
    
    public static void autoRead(final Structure[] ss) {
        structureArrayCheck(ss);
        if (ss[0].array == ss) {
            ss[0].autoRead();
        }
        else {
            for (int i = 0; i < ss.length; ++i) {
                if (ss[i] != null) {
                    ss[i].autoRead();
                }
            }
        }
    }
    
    public void autoRead() {
        if (this.getAutoRead()) {
            this.read();
            if (this.array != null) {
                for (int i = 1; i < this.array.length; ++i) {
                    this.array[i].autoRead();
                }
            }
        }
    }
    
    public static void autoWrite(final Structure[] ss) {
        structureArrayCheck(ss);
        if (ss[0].array == ss) {
            ss[0].autoWrite();
        }
        else {
            for (int i = 0; i < ss.length; ++i) {
                if (ss[i] != null) {
                    ss[i].autoWrite();
                }
            }
        }
    }
    
    public void autoWrite() {
        if (this.getAutoWrite()) {
            this.write();
            if (this.array != null) {
                for (int i = 1; i < this.array.length; ++i) {
                    this.array[i].autoWrite();
                }
            }
        }
    }
    
    public int getNativeSize(final Class<?> nativeType) {
        return this.getNativeSize(nativeType, null);
    }
    
    public int getNativeSize(final Class<?> nativeType, final Object value) {
        return Native.getNativeSize(nativeType, value);
    }
    
    public static void validate(final Class<?> cls) {
        newInstance(cls, Structure.PLACEHOLDER_MEMORY);
    }
    
    static {
        layoutInfo = new WeakHashMap<Class<?>, Structure$LayoutInfo>();
        fieldOrder = new WeakHashMap<Class<?>, List<String>>();
        reads = new Structure$1();
        busy = new Structure$2();
        PLACEHOLDER_MEMORY = new Structure$3(0L);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Iterator;
import java.util.List;

public abstract class Union extends Structure
{
    private Structure$StructField activeField;
    
    public Union() {
    }
    
    public Union(final Pointer p) {
        super(p);
    }
    
    public Union(final Pointer p, final int alignType) {
        super(p, alignType);
    }
    
    public Union(final TypeMapper mapper) {
        super(mapper);
    }
    
    public Union(final Pointer p, final int alignType, final TypeMapper mapper) {
        super(p, alignType, mapper);
    }
    
    @Override
    public List<String> getFieldOrder() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/sun/jna/Union.getFieldList:()Ljava/util/List;
        //     4: astore_3       
        //     5: new             Ljava/util/ArrayList;
        //     8: dup            
        //     9: aload_3        
        //    10: invokeinterface java/util/List.size:()I
        //    15: invokespecial   java/util/ArrayList.<init>:(I)V
        //    18: astore          4
        //    20: aload_3         /* list */
        //    21: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    26: astore          5
        //    28: aload           5
        //    30: invokeinterface java/util/Iterator.hasNext:()Z
        //    35: ifeq            66
        //    38: aload           5
        //    40: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    45: checkcast       Ljava/lang/reflect/Field;
        //    48: astore          6
        //    50: aload           4
        //    52: aload           6
        //    54: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //    57: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    62: pop            
        //    63: goto            28
        //    66: aload           4
        //    68: areturn        
        //    Signature:
        //  ()Ljava/util/List<Ljava/lang/String;>;
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
    
    public void setType(final Class<?> type) {
        this.ensureAllocated();
        for (final Structure$StructField activeField : this.fields().values()) {
            if (activeField.type == type) {
                this.activeField = activeField;
                return;
            }
        }
        throw new IllegalArgumentException("No field of type " + type + " in " + this);
    }
    
    public void setType(final String fieldName) {
        this.ensureAllocated();
        final Structure$StructField activeField = this.fields().get(fieldName);
        if (activeField != null) {
            this.activeField = activeField;
            return;
        }
        throw new IllegalArgumentException("No field named " + fieldName + " in " + this);
    }
    
    @Override
    public Object readField(final String fieldName) {
        this.ensureAllocated();
        this.setType(fieldName);
        return super.readField(fieldName);
    }
    
    @Override
    public void writeField(final String fieldName) {
        this.ensureAllocated();
        this.setType(fieldName);
        super.writeField(fieldName);
    }
    
    @Override
    public void writeField(final String fieldName, final Object value) {
        this.ensureAllocated();
        this.setType(fieldName);
        super.writeField(fieldName, value);
    }
    
    public Object getTypedValue(final Class<?> type) {
        this.ensureAllocated();
        for (final Structure$StructField activeField : this.fields().values()) {
            if (activeField.type == type) {
                this.activeField = activeField;
                this.read();
                return this.getFieldValue(this.activeField.field);
            }
        }
        throw new IllegalArgumentException("No field of type " + type + " in " + this);
    }
    
    public Object setTypedValue(final Object object) {
        final Structure$StructField field = this.findField(object.getClass());
        if (field != null) {
            this.activeField = field;
            this.setFieldValue(field.field, object);
            return this;
        }
        throw new IllegalArgumentException("No field of type " + object.getClass() + " in " + this);
    }
    
    private Structure$StructField findField(final Class<?> type) {
        this.ensureAllocated();
        for (final Structure$StructField structure$StructField : this.fields().values()) {
            if (structure$StructField.type.isAssignableFrom(type)) {
                return structure$StructField;
            }
        }
        return null;
    }
    
    @Override
    public void writeField(final Structure$StructField field) {
        if (field == this.activeField) {
            super.writeField(field);
        }
    }
    
    @Override
    public Object readField(final Structure$StructField field) {
        if (field == this.activeField || (!Structure.class.isAssignableFrom(field.type) && !String.class.isAssignableFrom(field.type) && !WString.class.isAssignableFrom(field.type))) {
            return super.readField(field);
        }
        return null;
    }
    
    @Override
    public int getNativeAlignment(final Class<?> type, final Object value, final boolean isFirstElement) {
        return super.getNativeAlignment(type, value, true);
    }
}

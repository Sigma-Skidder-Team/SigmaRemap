// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.nio.CharBuffer;

public class NativeString implements CharSequence, Comparable
{
    public static final String WIDE_STRING = "--WIDE-STRING--";
    private final Pointer pointer;
    private final String encoding;
    
    public NativeString(final String string) {
        this(string, Native.getDefaultStringEncoding());
    }
    
    public NativeString(final String string, final boolean wide) {
        this(string, wide ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
    }
    
    public NativeString(final WString string) {
        this(string.toString(), "--WIDE-STRING--");
    }
    
    public NativeString(final String string, final String encoding) {
        if (string == null) {
            throw new NullPointerException("String must not be null");
        }
        this.encoding = encoding;
        if ("--WIDE-STRING--".equals(this.encoding)) {
            (this.pointer = new NativeString$StringMemory(this, (long) (string.length() + 1) * Native.WCHAR_SIZE)).setWideString(0L, string);
        }
        else {
            final byte[] bytes = Native.getBytes(string, encoding);
            (this.pointer = new NativeString$StringMemory(this, bytes.length + 1)).write(0L, bytes, 0, bytes.length);
            this.pointer.setByte(bytes.length, (byte)0);
        }
    }
    
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
    
    @Override
    public boolean equals(final Object other) {
        return other instanceof CharSequence && this.compareTo(other) == 0;
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_0         /* this */
        //     3: getfield        com/sun/jna/NativeString.encoding:Ljava/lang/String;
        //     6: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //     9: istore_3       
        //    10: iload_3        
        //    11: ifeq            19
        //    14: ldc             "const wchar_t*"
        //    16: goto            21
        //    19: ldc             "const char*"
        //    21: astore          4
        //    23: new             Ljava/lang/StringBuilder;
        //    26: dup            
        //    27: invokespecial   java/lang/StringBuilder.<init>:()V
        //    30: aload           4
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    35: ldc             "("
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: iload_3        
        //    41: ifeq            55
        //    44: aload_0         /* this */
        //    45: getfield        com/sun/jna/NativeString.pointer:Lcom/sun/jna/Pointer;
        //    48: lconst_0       
        //    49: invokevirtual   com/sun/jna/Pointer.getWideString:(J)Ljava/lang/String;
        //    52: goto            67
        //    55: aload_0         /* this */
        //    56: getfield        com/sun/jna/NativeString.pointer:Lcom/sun/jna/Pointer;
        //    59: lconst_0       
        //    60: aload_0         /* this */
        //    61: getfield        com/sun/jna/NativeString.encoding:Ljava/lang/String;
        //    64: invokevirtual   com/sun/jna/Pointer.getString:(JLjava/lang/String;)Ljava/lang/String;
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: ldc             ")"
        //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    75: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    78: astore          4
        //    80: aload           4
        //    82: areturn        
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
        return this.pointer;
    }
    
    @Override
    public char charAt(final int index) {
        return this.toString().charAt(index);
    }
    
    @Override
    public int length() {
        return this.toString().length();
    }
    
    @Override
    public CharSequence subSequence(final int start, final int end) {
        return CharBuffer.wrap(this.toString()).subSequence(start, end);
    }
    
    @Override
    public int compareTo(final Object other) {
        if (other == null) {
            return 1;
        }
        return this.toString().compareTo(other.toString());
    }
}

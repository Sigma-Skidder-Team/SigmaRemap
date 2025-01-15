// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Arrays;
import java.util.List;

public class StringArray extends Memory implements Function$PostCallRead
{
    private String encoding;
    private List<NativeString> natives;
    private Object[] original;
    
    public StringArray(final String[] strings) {
        this(strings, false);
    }
    
    public StringArray(final String[] strings, final boolean wide) {
        this((Object[])strings, wide ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
    }
    
    public StringArray(final String[] strings, final String encoding) {
        this((Object[])strings, encoding);
    }
    
    public StringArray(final WString[] strings) {
        this(strings, "--WIDE-STRING--");
    }
    
    private StringArray(final Object[] strings, final String encoding) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1         /* strings */
        //     2: arraylength    
        //     3: iconst_1       
        //     4: iadd           
        //     5: getstatic       com/sun/jna/Pointer.SIZE:I
        //     8: imul           
        //     9: i2l            
        //    10: invokespecial   com/sun/jna/Memory.<init>:(J)V
        //    13: aload_0         /* this */
        //    14: new             Ljava/util/ArrayList;
        //    17: dup            
        //    18: invokespecial   java/util/ArrayList.<init>:()V
        //    21: putfield        com/sun/jna/StringArray.natives:Ljava/util/List;
        //    24: aload_0         /* this */
        //    25: aload_1         /* strings */
        //    26: putfield        com/sun/jna/StringArray.original:[Ljava/lang/Object;
        //    29: aload_0         /* this */
        //    30: aload_2         /* encoding */
        //    31: putfield        com/sun/jna/StringArray.encoding:Ljava/lang/String;
        //    34: iconst_0       
        //    35: istore          5
        //    37: iload           5
        //    39: aload_1         /* strings */
        //    40: arraylength    
        //    41: if_icmpge       109
        //    44: aconst_null    
        //    45: astore          6
        //    47: aload_1         /* strings */
        //    48: iload           p
        //    50: aaload         
        //    51: ifnull          90
        //    54: new             Lcom/sun/jna/NativeString;
        //    57: dup            
        //    58: aload_1         /* strings */
        //    59: iload           p
        //    61: aaload         
        //    62: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    65: aload_2         /* encoding */
        //    66: invokespecial   com/sun/jna/NativeString.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    69: astore          7
        //    71: aload_0         /* this */
        //    72: getfield        com/sun/jna/StringArray.natives:Ljava/util/List;
        //    75: aload           7
        //    77: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    82: pop            
        //    83: aload           7
        //    85: invokevirtual   com/sun/jna/NativeString.getPointer:()Lcom/sun/jna/Pointer;
        //    88: astore          ns
        //    90: aload_0         /* this */
        //    91: getstatic       com/sun/jna/Pointer.SIZE:I
        //    94: iload           p
        //    96: imul           
        //    97: i2l            
        //    98: aload           6
        //   100: invokevirtual   com/sun/jna/StringArray.setPointer:(JLcom/sun/jna/Pointer;)V
        //   103: iinc            p, 1
        //   106: goto            37
        //   109: aload_0         /* this */
        //   110: getstatic       com/sun/jna/Pointer.SIZE:I
        //   113: aload_1         /* strings */
        //   114: arraylength    
        //   115: imul           
        //   116: i2l            
        //   117: aconst_null    
        //   118: invokevirtual   com/sun/jna/StringArray.setPointer:(JLcom/sun/jna/Pointer;)V
        //   121: return         
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
    public void read() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sun/jna/StringArray.original:[Ljava/lang/Object;
        //     4: instanceof      [Lcom/sun/jna/WString;
        //     7: istore_3       
        //     8: ldc             "--WIDE-STRING--"
        //    10: aload_0         /* this */
        //    11: getfield        com/sun/jna/StringArray.encoding:Ljava/lang/String;
        //    14: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    17: istore          4
        //    19: iconst_0       
        //    20: istore          5
        //    22: iload           5
        //    24: aload_0         /* this */
        //    25: getfield        com/sun/jna/StringArray.original:[Ljava/lang/Object;
        //    28: arraylength    
        //    29: if_icmpge       112
        //    32: aload_0         /* this */
        //    33: iload           5
        //    35: getstatic       com/sun/jna/Pointer.SIZE:I
        //    38: imul           
        //    39: i2l            
        //    40: invokevirtual   com/sun/jna/StringArray.getPointer:(J)Lcom/sun/jna/Pointer;
        //    43: astore          6
        //    45: aconst_null    
        //    46: astore          7
        //    48: aload           s
        //    50: ifnull          97
        //    53: iload           si
        //    55: ifeq            67
        //    58: aload           s
        //    60: lconst_0       
        //    61: invokevirtual   com/sun/jna/Pointer.getWideString:(J)Ljava/lang/String;
        //    64: goto            77
        //    67: aload           s
        //    69: lconst_0       
        //    70: aload_0         /* this */
        //    71: getfield        com/sun/jna/StringArray.encoding:Ljava/lang/String;
        //    74: invokevirtual   com/sun/jna/Pointer.getString:(JLjava/lang/String;)Ljava/lang/String;
        //    77: astore          7
        //    79: iload_3         /* wide */
        //    80: ifeq            97
        //    83: new             Lcom/sun/jna/WString;
        //    86: dup            
        //    87: aload           7
        //    89: checkcast       Ljava/lang/String;
        //    92: invokespecial   com/sun/jna/WString.<init>:(Ljava/lang/String;)V
        //    95: astore          7
        //    97: aload_0         /* this */
        //    98: getfield        com/sun/jna/StringArray.original:[Ljava/lang/Object;
        //   101: iload           p
        //   103: aload           7
        //   105: aastore        
        //   106: iinc            p, 1
        //   109: goto            22
        //   112: return         
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
        return ("--WIDE-STRING--".equals(this.encoding) ? "const wchar_t*[]" : "const char*[]") + Arrays.asList(this.original);
    }
}

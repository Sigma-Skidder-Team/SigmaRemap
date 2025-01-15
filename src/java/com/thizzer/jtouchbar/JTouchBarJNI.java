// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar;

import java.awt.Component;

public class JTouchBarJNI
{
    public static native void setTouchBar0(final long p0, final JTouchBar p1);
    
    public static native void updateTouchBarItem(final long p0);
    
    public static native void callObjectSelector(final long p0, final String p1, final boolean p2);
    
    public static native int callIntObjectSelector(final long p0, final String p1);
    
    public static native long getAWTViewPointer0(final Component p0);
    
    private static void loadLibraryFromJar(final String path) throws UnsatisfiedLinkError {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_0         /* path */
        //     3: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //     6: astore_3       
        //     7: aconst_null    
        //     8: astore          4
        //    10: aload_0         /* path */
        //    11: ldc             ""
        //    13: invokestatic    java/io/File.createTempFile:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //    16: astore          5
        //    18: sipush          1024
        //    21: newarray        B
        //    23: astore          6
        //    25: iconst_m1      
        //    26: istore          7
        //    28: new             Ljava/io/FileOutputStream;
        //    31: dup            
        //    32: aload           buffer
        //    34: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    37: astore          8
        //    39: aconst_null    
        //    40: astore          9
        //    42: aload_3        
        //    43: aload           read
        //    45: invokevirtual   java/io/InputStream.read:([B)I
        //    48: dup            
        //    49: istore          fileOutputStream
        //    51: iconst_m1      
        //    52: if_icmpeq       68
        //    55: aload           8
        //    57: aload           read
        //    59: iconst_0       
        //    60: iload           fileOutputStream
        //    62: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //    65: goto            42
        //    68: aload           8
        //    70: ifnull          155
        //    73: aload           9
        //    75: ifnull          98
        //    78: aload           8
        //    80: invokevirtual   java/io/FileOutputStream.close:()V
        //    83: goto            155
        //    86: astore          10
        //    88: aload           9
        //    90: aload           10
        //    92: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //    95: goto            155
        //    98: aload           8
        //   100: invokevirtual   java/io/FileOutputStream.close:()V
        //   103: goto            155
        //   106: astore          10
        //   108: aload           10
        //   110: astore          9
        //   112: aload           10
        //   114: athrow         
        //   115: astore          11
        //   117: aload           8
        //   119: ifnull          152
        //   122: aload           9
        //   124: ifnull          147
        //   127: aload           8
        //   129: invokevirtual   java/io/FileOutputStream.close:()V
        //   132: goto            152
        //   135: astore          12
        //   137: aload           9
        //   139: aload           12
        //   141: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   144: goto            152
        //   147: aload           8
        //   149: invokevirtual   java/io/FileOutputStream.close:()V
        //   152: aload           11
        //   154: athrow         
        //   155: aload           buffer
        //   157: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   160: invokestatic    java/lang/System.load:(Ljava/lang/String;)V
        //   163: aload_3        
        //   164: ifnull          244
        //   167: aload           4
        //   169: ifnull          191
        //   172: aload_3        
        //   173: invokevirtual   java/io/InputStream.close:()V
        //   176: goto            244
        //   179: astore          5
        //   181: aload           4
        //   183: aload           5
        //   185: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   188: goto            244
        //   191: aload_3        
        //   192: invokevirtual   java/io/InputStream.close:()V
        //   195: goto            244
        //   198: astore          5
        //   200: aload           5
        //   202: astore          4
        //   204: aload           5
        //   206: athrow         
        //   207: astore          13
        //   209: aload_3        
        //   210: ifnull          241
        //   213: aload           4
        //   215: ifnull          237
        //   218: aload_3        
        //   219: invokevirtual   java/io/InputStream.close:()V
        //   222: goto            241
        //   225: astore          14
        //   227: aload           4
        //   229: aload           14
        //   231: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   234: goto            241
        //   237: aload_3        
        //   238: invokevirtual   java/io/InputStream.close:()V
        //   241: aload           13
        //   243: athrow         
        //   244: goto            280
        //   247: astore_3       
        //   248: new             Ljava/lang/UnsatisfiedLinkError;
        //   251: dup            
        //   252: new             Ljava/lang/StringBuilder;
        //   255: dup            
        //   256: invokespecial   java/lang/StringBuilder.<init>:()V
        //   259: ldc             "Unable to open "
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: aload_0         /* path */
        //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   268: ldc             " from jar file."
        //   270: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   273: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   276: invokespecial   java/lang/UnsatisfiedLinkError.<init>:(Ljava/lang/String;)V
        //   279: athrow         
        //   280: return         
        //    Exceptions:
        //  throws java.lang.UnsatisfiedLinkError
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  78     83     86     98     Ljava/lang/Throwable;
        //  42     68     106    115    Ljava/lang/Throwable;
        //  42     68     115    155    Any
        //  127    132    135    147    Ljava/lang/Throwable;
        //  106    117    115    155    Any
        //  172    176    179    191    Ljava/lang/Throwable;
        //  10     163    198    207    Ljava/lang/Throwable;
        //  10     163    207    244    Any
        //  218    222    225    237    Ljava/lang/Throwable;
        //  198    209    207    244    Any
        //  0      244    247    280    Ljava/lang/Exception;
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
            System.loadLibrary("JTouchBar");
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            loadLibraryFromJar("/lib/libJTouchBar.dylib");
        }
    }
}

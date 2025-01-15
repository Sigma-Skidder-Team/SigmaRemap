// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.common;

import java.io.IOException;
import java.io.InputStream;

public class Image
{
    private String _name;
    private String _path;
    private byte[] _data;
    
    private Image() {
    }
    
    public Image(final String nameOrPath, final boolean isPath) {
        if (isPath) {
            this._path = nameOrPath;
        }
        else {
            this._name = nameOrPath;
        }
    }
    
    public Image(final byte[] data) {
        this._data = data;
    }
    
    public Image(final InputStream dataInputStream) throws IOException {
        this.readFromInputStream(dataInputStream);
    }
    
    public void readFromInputStream(final InputStream dataInputStream) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       12
        //     4: new             Ljava/lang/NullPointerException;
        //     7: dup            
        //     8: invokespecial   java/lang/NullPointerException.<init>:()V
        //    11: athrow         
        //    12: new             Ljava/io/ByteArrayOutputStream;
        //    15: dup            
        //    16: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    19: astore          4
        //    21: aconst_null    
        //    22: astore          5
        //    24: sipush          1024
        //    27: newarray        B
        //    29: astore          6
        //    31: iconst_0       
        //    32: istore          7
        //    34: aload_1         /* dataInputStream */
        //    35: aload           read
        //    37: invokevirtual   java/io/InputStream.read:([B)I
        //    40: dup            
        //    41: istore          7
        //    43: iconst_m1      
        //    44: if_icmpeq       60
        //    47: aload           4
        //    49: aload           read
        //    51: iconst_0       
        //    52: iload           7
        //    54: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //    57: goto            34
        //    60: aload_0         /* this */
        //    61: aload           4
        //    63: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //    66: putfield        com/thizzer/jtouchbar/common/Image._data:[B
        //    69: aload           4
        //    71: ifnull          156
        //    74: aload           5
        //    76: ifnull          99
        //    79: aload           4
        //    81: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //    84: goto            156
        //    87: astore          6
        //    89: aload           5
        //    91: aload           6
        //    93: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //    96: goto            156
        //    99: aload           4
        //   101: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   104: goto            156
        //   107: astore          6
        //   109: aload           6
        //   111: astore          5
        //   113: aload           6
        //   115: athrow         
        //   116: astore          8
        //   118: aload           4
        //   120: ifnull          153
        //   123: aload           5
        //   125: ifnull          148
        //   128: aload           4
        //   130: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   133: goto            153
        //   136: astore          9
        //   138: aload           5
        //   140: aload           9
        //   142: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   145: goto            153
        //   148: aload           4
        //   150: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   153: aload           8
        //   155: athrow         
        //   156: aload_1         /* dataInputStream */
        //   157: invokevirtual   java/io/InputStream.close:()V
        //   160: goto            177
        //   163: astore          4
        //   165: aload           4
        //   167: athrow         
        //   168: astore          10
        //   170: aload_1         /* dataInputStream */
        //   171: invokevirtual   java/io/InputStream.close:()V
        //   174: aload           10
        //   176: athrow         
        //   177: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  79     84     87     99     Ljava/lang/Throwable;
        //  24     69     107    116    Ljava/lang/Throwable;
        //  24     69     116    156    Any
        //  128    133    136    148    Ljava/lang/Throwable;
        //  107    118    116    156    Any
        //  12     156    163    168    Ljava/io/IOException;
        //  12     156    168    177    Any
        //  163    170    168    177    Any
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
    
    public String getName() {
        return this._name;
    }
    
    public void setName(final String name) {
        this._name = name;
    }
    
    public String getPath() {
        return this._path;
    }
    
    public void setPath(final String path) {
        this._path = path;
    }
    
    public byte[] getData() {
        return this._data;
    }
    
    public void getData(final byte[] data) {
        this._data = data;
    }
}

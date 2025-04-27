// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.io.IOException;

public class ELFAnalyser
{
    private static final byte[] ELF_MAGIC;
    private static final int EF_ARM_ABI_FLOAT_HARD = 1024;
    private static final int EF_ARM_ABI_FLOAT_SOFT = 512;
    private static final int EI_DATA_BIG_ENDIAN = 2;
    private static final int E_MACHINE_ARM = 40;
    private static final int EI_CLASS_64BIT = 2;
    private final String filename;
    private final boolean ELF;
    private final boolean _64Bit;
    private final boolean bigEndian;
    private final boolean armHardFloat;
    private final boolean armSoftFloat;
    private final boolean arm;
    
    public static ELFAnalyser analyse(final String filename) throws IOException {
        final ELFAnalyser elfAnalyser = new ELFAnalyser(filename);
        elfAnalyser.runDetection();
        return elfAnalyser;
    }
    
    public boolean isELF() {
        return this.ELF;
    }
    
    public boolean is64Bit() {
        return this._64Bit;
    }
    
    public boolean isBigEndian() {
        return this.bigEndian;
    }
    
    public String getFilename() {
        return this.filename;
    }
    
    public boolean isArmHardFloat() {
        return this.armHardFloat;
    }
    
    public boolean isArmSoftFloat() {
        return this.armSoftFloat;
    }
    
    public boolean isArm() {
        return this.arm;
    }
    
    private ELFAnalyser(final String filename) {
        this.ELF = false;
        this._64Bit = false;
        this.bigEndian = false;
        this.armHardFloat = false;
        this.armSoftFloat = false;
        this.arm = false;
        this.filename = filename;
    }
    
    private void runDetection() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0         /* this */
        //     5: getfield        com/sun/jna/ELFAnalyser.filename:Ljava/lang/String;
        //     8: ldc             "r"
        //    10: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    13: astore_3       
        //    14: aload_3        
        //    15: invokevirtual   java/io/RandomAccessFile.length:()J
        //    18: ldc2_w          4
        //    21: lcmp           
        //    22: ifle            58
        //    25: iconst_4       
        //    26: newarray        B
        //    28: astore          4
        //    30: aload_3         /* magic */
        //    31: lconst_0       
        //    32: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //    35: aload_3         /* magic */
        //    36: aload           4
        //    38: invokevirtual   java/io/RandomAccessFile.read:([B)I
        //    41: pop            
        //    42: aload           4
        //    44: getstatic       com/sun/jna/ELFAnalyser.ELF_MAGIC:[B
        //    47: invokestatic    java/util/Arrays.equals:([B[B)Z
        //    50: ifeq            58
        //    53: aload_0         /* this */
        //    54: iconst_1       
        //    55: putfield        com/sun/jna/ELFAnalyser.ELF:Z
        //    58: aload_0         /* this */
        //    59: getfield        com/sun/jna/ELFAnalyser.ELF:Z
        //    62: ifne            66
        //    65: return         
        //    66: aload_3        
        //    67: ldc2_w          4
        //    70: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //    73: aload_3        
        //    74: invokevirtual   java/io/RandomAccessFile.readByte:()B
        //    77: istore          4
        //    79: aload_0         /* this */
        //    80: iload           4
        //    82: iconst_2       
        //    83: if_icmpne       90
        //    86: iconst_1       
        //    87: goto            91
        //    90: iconst_0       
        //    91: putfield        com/sun/jna/ELFAnalyser._64Bit:Z
        //    94: aload_3         /* sizeIndicator */
        //    95: lconst_0       
        //    96: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //    99: aload_0         /* this */
        //   100: getfield        com/sun/jna/ELFAnalyser._64Bit:Z
        //   103: ifeq            111
        //   106: bipush          64
        //   108: goto            113
        //   111: bipush          52
        //   113: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //   116: astore          5
        //   118: aload_3         /* sizeIndicator */
        //   119: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //   122: aload           5
        //   124: lconst_0       
        //   125: invokevirtual   java/nio/channels/FileChannel.read:(Ljava/nio/ByteBuffer;J)I
        //   128: pop            
        //   129: aload_0         /* this */
        //   130: aload           5
        //   132: iconst_5       
        //   133: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //   136: iconst_2       
        //   137: if_icmpne       144
        //   140: iconst_1       
        //   141: goto            145
        //   144: iconst_0       
        //   145: putfield        com/sun/jna/ELFAnalyser.bigEndian:Z
        //   148: aload           5
        //   150: aload_0         /* this */
        //   151: getfield        com/sun/jna/ELFAnalyser.bigEndian:Z
        //   154: ifeq            163
        //   157: getstatic       java/nio/ByteOrder.BIG_ENDIAN:Ljava/nio/ByteOrder;
        //   160: goto            166
        //   163: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //   166: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //   169: pop            
        //   170: aload_0         /* this */
        //   171: aload           5
        //   173: bipush          18
        //   175: invokevirtual   java/nio/ByteBuffer.get:(I)B
        //   178: bipush          40
        //   180: if_icmpne       187
        //   183: iconst_1       
        //   184: goto            188
        //   187: iconst_0       
        //   188: putfield        com/sun/jna/ELFAnalyser.arm:Z
        //   191: aload_0         /* this */
        //   192: getfield        com/sun/jna/ELFAnalyser.arm:Z
        //   195: ifeq            261
        //   198: aload           5
        //   200: aload_0         /* this */
        //   201: getfield        com/sun/jna/ELFAnalyser._64Bit:Z
        //   204: ifeq            212
        //   207: bipush          48
        //   209: goto            214
        //   212: bipush          36
        //   214: invokevirtual   java/nio/ByteBuffer.getInt:(I)I
        //   217: istore          6
        //   219: aload_0         /* this */
        //   220: iload           6
        //   222: sipush          512
        //   225: iand           
        //   226: sipush          512
        //   229: if_icmpne       236
        //   232: iconst_1       
        //   233: goto            237
        //   236: iconst_0       
        //   237: putfield        com/sun/jna/ELFAnalyser.armSoftFloat:Z
        //   240: aload_0         /* this */
        //   241: iload           6
        //   243: sipush          1024
        //   246: iand           
        //   247: sipush          1024
        //   250: if_icmpne       257
        //   253: iconst_1       
        //   254: goto            258
        //   257: iconst_0       
        //   258: putfield        com/sun/jna/ELFAnalyser.armHardFloat:Z
        //   261: return         
        //    Exceptions:
        //  throws java.io.IOException
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
        ELF_MAGIC = new byte[] { 127, 69, 76, 70 };
    }
}

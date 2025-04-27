// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class Pointer
{
    public static final int SIZE;
    public static final Pointer NULL;
    public long peer;
    
    public static final Pointer createConstant(final long peer) {
        return new Pointer$Opaque(peer, null);
    }
    
    public static final Pointer createConstant(final int peer) {
        return new Pointer$Opaque((long)peer & -1L, null);
    }
    
    public Pointer() {
    }
    
    public Pointer(final long peer) {
        this.peer = peer;
    }
    
    public Pointer share(final long offset) {
        return this.share(offset, 0L);
    }
    
    public Pointer share(final long offset, final long sz) {
        if (offset == 0L) {
            return this;
        }
        return new Pointer(this.peer + offset);
    }
    
    public void clear(final long size) {
        this.setMemory(0L, size, (byte)0);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o != null && o instanceof Pointer && ((Pointer)o).peer == this.peer);
    }
    
    @Override
    public int hashCode() {
        return (int)((this.peer >>> 32) + (this.peer & -1L));
    }
    
    public long indexOf(final long offset, final byte value) {
        return Native.indexOf(this, this.peer, offset, value);
    }
    
    public void read(final long offset, final byte[] buf, final int index, final int length) {
        Native.read(this, this.peer, offset, buf, index, length);
    }
    
    public void read(final long offset, final short[] buf, final int index, final int length) {
        Native.read(this, this.peer, offset, buf, index, length);
    }
    
    public void read(final long offset, final char[] buf, final int index, final int length) {
        Native.read(this, this.peer, offset, buf, index, length);
    }
    
    public void read(final long offset, final int[] buf, final int index, final int length) {
        Native.read(this, this.peer, offset, buf, index, length);
    }
    
    public void read(final long offset, final long[] buf, final int index, final int length) {
        Native.read(this, this.peer, offset, buf, index, length);
    }
    
    public void read(final long offset, final float[] buf, final int index, final int length) {
        Native.read(this, this.peer, offset, buf, index, length);
    }
    
    public void read(final long offset, final double[] buf, final int index, final int length) {
        Native.read(this, this.peer, offset, buf, index, length);
    }
    
    public void read(final long offset, final Pointer[] buf, final int index, final int length) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          8
        //     3: iload           8
        //     5: iload           length
        //     7: if_icmpge       73
        //    10: aload_0         /* this */
        //    11: lload_1         /* offset */
        //    12: iload           8
        //    14: getstatic       com/sun/jna/Pointer.SIZE:I
        //    17: imul           
        //    18: i2l            
        //    19: ladd           
        //    20: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //    23: astore          9
        //    25: aload_3         /* buf */
        //    26: iload           p
        //    28: iload           index
        //    30: iadd           
        //    31: aaload         
        //    32: astore          10
        //    34: aload           10
        //    36: ifnull          58
        //    39: aload           oldp
        //    41: ifnull          58
        //    44: aload           oldp
        //    46: getfield        com/sun/jna/Pointer.peer:J
        //    49: aload           10
        //    51: getfield        com/sun/jna/Pointer.peer:J
        //    54: lcmp           
        //    55: ifeq            67
        //    58: aload_3         /* buf */
        //    59: iload           p
        //    61: iload           index
        //    63: iadd           
        //    64: aload           oldp
        //    66: aastore        
        //    67: iinc            p, 1
        //    70: goto            3
        //    73: return         
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
    
    public void write(final long offset, final byte[] buf, final int index, final int length) {
        Native.write(this, this.peer, offset, buf, index, length);
    }
    
    public void write(final long offset, final short[] buf, final int index, final int length) {
        Native.write(this, this.peer, offset, buf, index, length);
    }
    
    public void write(final long offset, final char[] buf, final int index, final int length) {
        Native.write(this, this.peer, offset, buf, index, length);
    }
    
    public void write(final long offset, final int[] buf, final int index, final int length) {
        Native.write(this, this.peer, offset, buf, index, length);
    }
    
    public void write(final long offset, final long[] buf, final int index, final int length) {
        Native.write(this, this.peer, offset, buf, index, length);
    }
    
    public void write(final long offset, final float[] buf, final int index, final int length) {
        Native.write(this, this.peer, offset, buf, index, length);
    }
    
    public void write(final long offset, final double[] buf, final int index, final int length) {
        Native.write(this, this.peer, offset, buf, index, length);
    }
    
    public void write(final long bOff, final Pointer[] buf, final int index, final int length) {
        for (int i = 0; i < length; ++i) {
            this.setPointer(bOff + (long) i * Pointer.SIZE, buf[index + i]);
        }
    }
    
    public Object getValue(final long offset, final Class<?> type, final Object currentValue) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          7
        //     3: ldc             Lcom/sun/jna/Structure;.class
        //     5: aload_3         /* type */
        //     6: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //     9: ifeq            65
        //    12: aload           currentValue
        //    14: checkcast       Lcom/sun/jna/Structure;
        //    17: astore          8
        //    19: ldc             Lcom/sun/jna/Structure$ByReference;.class
        //    21: aload_3         /* type */
        //    22: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    25: ifeq            44
        //    28: aload_3         /* type */
        //    29: aload           8
        //    31: aload_0         /* this */
        //    32: lload_1         /* offset */
        //    33: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //    36: invokestatic    com/sun/jna/Structure.updateStructureByReference:(Ljava/lang/Class;Lcom/sun/jna/Structure;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //    39: astore          8
        //    41: goto            58
        //    44: aload           8
        //    46: aload_0         /* this */
        //    47: lload_1         /* offset */
        //    48: l2i            
        //    49: iconst_1       
        //    50: invokevirtual   com/sun/jna/Structure.useMemory:(Lcom/sun/jna/Pointer;IZ)V
        //    53: aload           8
        //    55: invokevirtual   com/sun/jna/Structure.read:()V
        //    58: aload           8
        //    60: astore          s
        //    62: goto            766
        //    65: aload_3         /* type */
        //    66: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    69: if_acmpeq       78
        //    72: aload_3         /* type */
        //    73: ldc             Ljava/lang/Boolean;.class
        //    75: if_acmpne       99
        //    78: aload_0         /* this */
        //    79: lload_1         /* offset */
        //    80: invokevirtual   com/sun/jna/Pointer.getInt:(J)I
        //    83: ifeq            90
        //    86: iconst_1       
        //    87: goto            91
        //    90: iconst_0       
        //    91: invokestatic    com/sun/jna/Function.valueOf:(Z)Ljava/lang/Boolean;
        //    94: astore          7
        //    96: goto            766
        //    99: aload_3         /* type */
        //   100: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //   103: if_acmpeq       112
        //   106: aload_3         /* type */
        //   107: ldc             Ljava/lang/Byte;.class
        //   109: if_acmpne       125
        //   112: aload_0         /* this */
        //   113: lload_1         /* offset */
        //   114: invokevirtual   com/sun/jna/Pointer.getByte:(J)B
        //   117: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //   120: astore          7
        //   122: goto            766
        //   125: aload_3         /* type */
        //   126: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //   129: if_acmpeq       138
        //   132: aload_3         /* type */
        //   133: ldc             Ljava/lang/Short;.class
        //   135: if_acmpne       151
        //   138: aload_0         /* this */
        //   139: lload_1         /* offset */
        //   140: invokevirtual   com/sun/jna/Pointer.getShort:(J)S
        //   143: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //   146: astore          7
        //   148: goto            766
        //   151: aload_3         /* type */
        //   152: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //   155: if_acmpeq       164
        //   158: aload_3         /* type */
        //   159: ldc             Ljava/lang/Character;.class
        //   161: if_acmpne       177
        //   164: aload_0         /* this */
        //   165: lload_1         /* offset */
        //   166: invokevirtual   com/sun/jna/Pointer.getChar:(J)C
        //   169: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   172: astore          7
        //   174: goto            766
        //   177: aload_3         /* type */
        //   178: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   181: if_acmpeq       190
        //   184: aload_3         /* type */
        //   185: ldc             Ljava/lang/Integer;.class
        //   187: if_acmpne       203
        //   190: aload_0         /* this */
        //   191: lload_1         /* offset */
        //   192: invokevirtual   com/sun/jna/Pointer.getInt:(J)I
        //   195: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   198: astore          7
        //   200: goto            766
        //   203: aload_3         /* type */
        //   204: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   207: if_acmpeq       216
        //   210: aload_3         /* type */
        //   211: ldc             Ljava/lang/Long;.class
        //   213: if_acmpne       229
        //   216: aload_0         /* this */
        //   217: lload_1         /* offset */
        //   218: invokevirtual   com/sun/jna/Pointer.getLong:(J)J
        //   221: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   224: astore          7
        //   226: goto            766
        //   229: aload_3         /* type */
        //   230: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   233: if_acmpeq       242
        //   236: aload_3         /* type */
        //   237: ldc             Ljava/lang/Float;.class
        //   239: if_acmpne       255
        //   242: aload_0         /* this */
        //   243: lload_1         /* offset */
        //   244: invokevirtual   com/sun/jna/Pointer.getFloat:(J)F
        //   247: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   250: astore          7
        //   252: goto            766
        //   255: aload_3         /* type */
        //   256: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   259: if_acmpeq       268
        //   262: aload_3         /* type */
        //   263: ldc             Ljava/lang/Double;.class
        //   265: if_acmpne       281
        //   268: aload_0         /* this */
        //   269: lload_1         /* offset */
        //   270: invokevirtual   com/sun/jna/Pointer.getDouble:(J)D
        //   273: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   276: astore          7
        //   278: goto            766
        //   281: ldc             Lcom/sun/jna/Pointer;.class
        //   283: aload_3         /* type */
        //   284: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   287: ifeq            354
        //   290: aload_0         /* this */
        //   291: lload_1         /* offset */
        //   292: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //   295: astore          8
        //   297: aload           8
        //   299: ifnull          351
        //   302: aload           currentValue
        //   304: instanceof      Lcom/sun/jna/Pointer;
        //   307: ifeq            318
        //   310: aload           currentValue
        //   312: checkcast       Lcom/sun/jna/Pointer;
        //   315: goto            319
        //   318: aconst_null    
        //   319: astore          9
        //   321: aload           9
        //   323: ifnull          340
        //   326: aload           oldp
        //   328: getfield        com/sun/jna/Pointer.peer:J
        //   331: aload           9
        //   333: getfield        com/sun/jna/Pointer.peer:J
        //   336: lcmp           
        //   337: ifeq            347
        //   340: aload           oldp
        //   342: astore          p
        //   344: goto            351
        //   347: aload           9
        //   349: astore          p
        //   351: goto            766
        //   354: aload_3         /* type */
        //   355: ldc             Ljava/lang/String;.class
        //   357: if_acmpne       387
        //   360: aload_0         /* this */
        //   361: lload_1         /* offset */
        //   362: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //   365: astore          8
        //   367: aload           8
        //   369: ifnull          381
        //   372: aload           8
        //   374: lconst_0       
        //   375: invokevirtual   com/sun/jna/Pointer.getString:(J)Ljava/lang/String;
        //   378: goto            382
        //   381: aconst_null    
        //   382: astore          p
        //   384: goto            766
        //   387: aload_3         /* type */
        //   388: ldc             Lcom/sun/jna/WString;.class
        //   390: if_acmpne       427
        //   393: aload_0         /* this */
        //   394: lload_1         /* offset */
        //   395: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //   398: astore          8
        //   400: aload           8
        //   402: ifnull          421
        //   405: new             Lcom/sun/jna/WString;
        //   408: dup            
        //   409: aload           8
        //   411: lconst_0       
        //   412: invokevirtual   com/sun/jna/Pointer.getWideString:(J)Ljava/lang/String;
        //   415: invokespecial   com/sun/jna/WString.<init>:(Ljava/lang/String;)V
        //   418: goto            422
        //   421: aconst_null    
        //   422: astore          p
        //   424: goto            766
        //   427: ldc             Lcom/sun/jna/Callback;.class
        //   429: aload_3         /* type */
        //   430: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   433: ifeq            493
        //   436: aload_0         /* this */
        //   437: lload_1         /* offset */
        //   438: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //   441: astore          8
        //   443: aload           8
        //   445: ifnonnull       454
        //   448: aconst_null    
        //   449: astore          fp
        //   451: goto            490
        //   454: aload           currentValue
        //   456: checkcast       Lcom/sun/jna/Callback;
        //   459: astore          9
        //   461: aload           9
        //   463: invokestatic    com/sun/jna/CallbackReference.getFunctionPointer:(Lcom/sun/jna/Callback;)Lcom/sun/jna/Pointer;
        //   466: astore          10
        //   468: aload           cb
        //   470: aload           10
        //   472: invokevirtual   com/sun/jna/Pointer.equals:(Ljava/lang/Object;)Z
        //   475: ifne            486
        //   478: aload_3         /* type */
        //   479: aload           cb
        //   481: invokestatic    com/sun/jna/CallbackReference.getCallback:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Callback;
        //   484: astore          oldfp
        //   486: aload           oldfp
        //   488: astore          fp
        //   490: goto            766
        //   493: getstatic       com/sun/jna/Platform.HAS_BUFFERS:Z
        //   496: ifeq            579
        //   499: ldc_w           Ljava/nio/Buffer;.class
        //   502: aload_3         /* type */
        //   503: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   506: ifeq            579
        //   509: aload_0         /* this */
        //   510: lload_1         /* offset */
        //   511: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //   514: astore          8
        //   516: aload           8
        //   518: ifnonnull       527
        //   521: aconst_null    
        //   522: astore          bp
        //   524: goto            576
        //   527: aload           currentValue
        //   529: ifnonnull       536
        //   532: aconst_null    
        //   533: goto            544
        //   536: aload           currentValue
        //   538: checkcast       Ljava/nio/Buffer;
        //   541: invokestatic    com/sun/jna/Native.getDirectBufferPointer:(Ljava/nio/Buffer;)Lcom/sun/jna/Pointer;
        //   544: astore          9
        //   546: aload           9
        //   548: ifnull          561
        //   551: aload           9
        //   553: aload           oldbp
        //   555: invokevirtual   com/sun/jna/Pointer.equals:(Ljava/lang/Object;)Z
        //   558: ifne            572
        //   561: new             Ljava/lang/IllegalStateException;
        //   564: dup            
        //   565: ldc_w           "Can't autogenerate a direct buffer on memory read"
        //   568: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   571: athrow         
        //   572: aload           currentValue
        //   574: astore          bp
        //   576: goto            766
        //   579: ldc_w           Lcom/sun/jna/NativeMapped;.class
        //   582: aload_3         /* type */
        //   583: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   586: ifeq            691
        //   589: aload           currentValue
        //   591: checkcast       Lcom/sun/jna/NativeMapped;
        //   594: astore          8
        //   596: aload           8
        //   598: ifnull          652
        //   601: aload_0         /* this */
        //   602: lload_1         /* offset */
        //   603: aload           8
        //   605: invokeinterface com/sun/jna/NativeMapped.nativeType:()Ljava/lang/Class;
        //   610: aconst_null    
        //   611: invokevirtual   com/sun/jna/Pointer.getValue:(JLjava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
        //   614: astore          9
        //   616: aload           value
        //   618: aload           9
        //   620: new             Lcom/sun/jna/FromNativeContext;
        //   623: dup            
        //   624: aload_3         /* type */
        //   625: invokespecial   com/sun/jna/FromNativeContext.<init>:(Ljava/lang/Class;)V
        //   628: invokeinterface com/sun/jna/NativeMapped.fromNative:(Ljava/lang/Object;Lcom/sun/jna/FromNativeContext;)Ljava/lang/Object;
        //   633: astore          nm
        //   635: aload           value
        //   637: aload           nm
        //   639: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   642: ifeq            649
        //   645: aload           value
        //   647: astore          nm
        //   649: goto            688
        //   652: aload_3         /* type */
        //   653: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   656: astore          9
        //   658: aload_0         /* this */
        //   659: lload_1         /* offset */
        //   660: aload           9
        //   662: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   665: aconst_null    
        //   666: invokevirtual   com/sun/jna/Pointer.getValue:(JLjava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
        //   669: astore          10
        //   671: aload           value
        //   673: aload           10
        //   675: new             Lcom/sun/jna/FromNativeContext;
        //   678: dup            
        //   679: aload_3         /* type */
        //   680: invokespecial   com/sun/jna/FromNativeContext.<init>:(Ljava/lang/Class;)V
        //   683: invokevirtual   com/sun/jna/NativeMappedConverter.fromNative:(Ljava/lang/Object;Lcom/sun/jna/FromNativeContext;)Ljava/lang/Object;
        //   686: astore          nm
        //   688: goto            766
        //   691: aload_3         /* type */
        //   692: invokevirtual   java/lang/Class.isArray:()Z
        //   695: ifeq            732
        //   698: aload           currentValue
        //   700: astore          7
        //   702: aload           7
        //   704: ifnonnull       718
        //   707: new             Ljava/lang/IllegalStateException;
        //   710: dup            
        //   711: ldc_w           "Need an initialized array"
        //   714: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   717: athrow         
        //   718: aload_0         /* this */
        //   719: lload_1         /* offset */
        //   720: aload           7
        //   722: aload_3         /* type */
        //   723: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   726: invokespecial   com/sun/jna/Pointer.readArray:(JLjava/lang/Object;Ljava/lang/Class;)V
        //   729: goto            766
        //   732: new             Ljava/lang/IllegalArgumentException;
        //   735: dup            
        //   736: new             Ljava/lang/StringBuilder;
        //   739: dup            
        //   740: invokespecial   java/lang/StringBuilder.<init>:()V
        //   743: ldc_w           "Reading \""
        //   746: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   749: aload_3         /* type */
        //   750: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   753: ldc_w           "\" from memory is not supported"
        //   756: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   759: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   762: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   765: athrow         
        //   766: aload           7
        //   768: areturn        
        //    Signature:
        //  (JLjava/lang/Class<*>;Ljava/lang/Object;)Ljava/lang/Object;
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
    
    private void readArray(final long offset, final Object o, final Class<?> cls) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          7
        //     3: aload_3         /* o */
        //     4: invokestatic    java/lang/reflect/Array.getLength:(Ljava/lang/Object;)I
        //     7: istore          7
        //     9: aload_3         /* o */
        //    10: astore          8
        //    12: aload           cls
        //    14: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //    17: if_acmpne       39
        //    20: aload_0         /* this */
        //    21: lload_1         /* offset */
        //    22: aload           8
        //    24: checkcast       [B
        //    27: checkcast       [B
        //    30: iconst_0       
        //    31: iload           result
        //    33: invokevirtual   com/sun/jna/Pointer.read:(J[BII)V
        //    36: goto            592
        //    39: aload           cls
        //    41: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //    44: if_acmpne       66
        //    47: aload_0         /* this */
        //    48: lload_1         /* offset */
        //    49: aload           8
        //    51: checkcast       [S
        //    54: checkcast       [S
        //    57: iconst_0       
        //    58: iload           result
        //    60: invokevirtual   com/sun/jna/Pointer.read:(J[SII)V
        //    63: goto            592
        //    66: aload           cls
        //    68: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //    71: if_acmpne       93
        //    74: aload_0         /* this */
        //    75: lload_1         /* offset */
        //    76: aload           8
        //    78: checkcast       [C
        //    81: checkcast       [C
        //    84: iconst_0       
        //    85: iload           result
        //    87: invokevirtual   com/sun/jna/Pointer.read:(J[CII)V
        //    90: goto            592
        //    93: aload           cls
        //    95: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    98: if_acmpne       120
        //   101: aload_0         /* this */
        //   102: lload_1         /* offset */
        //   103: aload           8
        //   105: checkcast       [I
        //   108: checkcast       [I
        //   111: iconst_0       
        //   112: iload           result
        //   114: invokevirtual   com/sun/jna/Pointer.read:(J[III)V
        //   117: goto            592
        //   120: aload           cls
        //   122: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   125: if_acmpne       147
        //   128: aload_0         /* this */
        //   129: lload_1         /* offset */
        //   130: aload           8
        //   132: checkcast       [J
        //   135: checkcast       [J
        //   138: iconst_0       
        //   139: iload           result
        //   141: invokevirtual   com/sun/jna/Pointer.read:(J[JII)V
        //   144: goto            592
        //   147: aload           cls
        //   149: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   152: if_acmpne       174
        //   155: aload_0         /* this */
        //   156: lload_1         /* offset */
        //   157: aload           8
        //   159: checkcast       [F
        //   162: checkcast       [F
        //   165: iconst_0       
        //   166: iload           result
        //   168: invokevirtual   com/sun/jna/Pointer.read:(J[FII)V
        //   171: goto            592
        //   174: aload           cls
        //   176: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   179: if_acmpne       201
        //   182: aload_0         /* this */
        //   183: lload_1         /* offset */
        //   184: aload           8
        //   186: checkcast       [D
        //   189: checkcast       [D
        //   192: iconst_0       
        //   193: iload           result
        //   195: invokevirtual   com/sun/jna/Pointer.read:(J[DII)V
        //   198: goto            592
        //   201: ldc             Lcom/sun/jna/Pointer;.class
        //   203: aload           cls
        //   205: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   208: ifeq            230
        //   211: aload_0         /* this */
        //   212: lload_1         /* offset */
        //   213: aload           8
        //   215: checkcast       [Lcom/sun/jna/Pointer;
        //   218: checkcast       [Lcom/sun/jna/Pointer;
        //   221: iconst_0       
        //   222: iload           result
        //   224: invokevirtual   com/sun/jna/Pointer.read:(J[Lcom/sun/jna/Pointer;II)V
        //   227: goto            592
        //   230: ldc             Lcom/sun/jna/Structure;.class
        //   232: aload           cls
        //   234: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   237: ifeq            445
        //   240: aload           8
        //   242: checkcast       [Lcom/sun/jna/Structure;
        //   245: checkcast       [Lcom/sun/jna/Structure;
        //   248: astore          9
        //   250: ldc             Lcom/sun/jna/Structure$ByReference;.class
        //   252: aload           cls
        //   254: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   257: ifeq            310
        //   260: aload_0         /* this */
        //   261: lload_1         /* offset */
        //   262: aload           9
        //   264: arraylength    
        //   265: invokevirtual   com/sun/jna/Pointer.getPointerArray:(JI)[Lcom/sun/jna/Pointer;
        //   268: astore          10
        //   270: iconst_0       
        //   271: istore          11
        //   273: iload           11
        //   275: aload           parray
        //   277: arraylength    
        //   278: if_icmpge       307
        //   281: aload           parray
        //   283: iload           11
        //   285: aload           cls
        //   287: aload           parray
        //   289: iload           11
        //   291: aaload         
        //   292: aload           i
        //   294: iload           11
        //   296: aaload         
        //   297: invokestatic    com/sun/jna/Structure.updateStructureByReference:(Ljava/lang/Class;Lcom/sun/jna/Structure;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //   300: aastore        
        //   301: iinc            11, 1
        //   304: goto            273
        //   307: goto            442
        //   310: aload           9
        //   312: iconst_0       
        //   313: aaload         
        //   314: astore          10
        //   316: aload           10
        //   318: ifnonnull       347
        //   321: aload           cls
        //   323: aload_0         /* this */
        //   324: lload_1         /* offset */
        //   325: invokevirtual   com/sun/jna/Pointer.share:(J)Lcom/sun/jna/Pointer;
        //   328: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //   331: astore          10
        //   333: aload           10
        //   335: invokevirtual   com/sun/jna/Structure.conditionalAutoRead:()V
        //   338: aload           first
        //   340: iconst_0       
        //   341: aload           10
        //   343: aastore        
        //   344: goto            361
        //   347: aload           10
        //   349: aload_0         /* this */
        //   350: lload_1         /* offset */
        //   351: l2i            
        //   352: iconst_1       
        //   353: invokevirtual   com/sun/jna/Structure.useMemory:(Lcom/sun/jna/Pointer;IZ)V
        //   356: aload           10
        //   358: invokevirtual   com/sun/jna/Structure.read:()V
        //   361: aload           10
        //   363: aload           first
        //   365: arraylength    
        //   366: invokevirtual   com/sun/jna/Structure.toArray:(I)[Lcom/sun/jna/Structure;
        //   369: astore          11
        //   371: iconst_1       
        //   372: istore          12
        //   374: iload           12
        //   376: aload           first
        //   378: arraylength    
        //   379: if_icmpge       442
        //   382: aload           first
        //   384: iload           12
        //   386: aaload         
        //   387: ifnonnull       403
        //   390: aload           first
        //   392: iload           12
        //   394: aload           i
        //   396: iload           12
        //   398: aaload         
        //   399: aastore        
        //   400: goto            436
        //   403: aload           first
        //   405: iload           12
        //   407: aaload         
        //   408: aload_0         /* this */
        //   409: lload_1         /* offset */
        //   410: iload           12
        //   412: aload           first
        //   414: iload           12
        //   416: aaload         
        //   417: invokevirtual   com/sun/jna/Structure.size:()I
        //   420: imul           
        //   421: i2l            
        //   422: ladd           
        //   423: l2i            
        //   424: iconst_1       
        //   425: invokevirtual   com/sun/jna/Structure.useMemory:(Lcom/sun/jna/Pointer;IZ)V
        //   428: aload           first
        //   430: iload           12
        //   432: aaload         
        //   433: invokevirtual   com/sun/jna/Structure.read:()V
        //   436: iinc            12, 1
        //   439: goto            374
        //   442: goto            592
        //   445: ldc_w           Lcom/sun/jna/NativeMapped;.class
        //   448: aload           cls
        //   450: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   453: ifeq            557
        //   456: aload           8
        //   458: checkcast       [Lcom/sun/jna/NativeMapped;
        //   461: checkcast       [Lcom/sun/jna/NativeMapped;
        //   464: astore          9
        //   466: aload           cls
        //   468: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   471: astore          10
        //   473: aload           array
        //   475: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   478: aload           array
        //   480: invokestatic    com/sun/jna/Native.getNativeSize:(Ljava/lang/Class;Ljava/lang/Object;)I
        //   483: aload           tc
        //   485: arraylength    
        //   486: idiv           
        //   487: istore          11
        //   489: iconst_0       
        //   490: istore          12
        //   492: iload           12
        //   494: aload           tc
        //   496: arraylength    
        //   497: if_icmpge       554
        //   500: aload_0         /* this */
        //   501: lload_1         /* offset */
        //   502: iload           i
        //   504: iload           12
        //   506: imul           
        //   507: i2l            
        //   508: ladd           
        //   509: aload           size
        //   511: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   514: aload           tc
        //   516: iload           12
        //   518: aaload         
        //   519: invokevirtual   com/sun/jna/Pointer.getValue:(JLjava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
        //   522: astore          13
        //   524: aload           tc
        //   526: iload           value
        //   528: aload           size
        //   530: aload           13
        //   532: new             Lcom/sun/jna/FromNativeContext;
        //   535: dup            
        //   536: aload           cls
        //   538: invokespecial   com/sun/jna/FromNativeContext.<init>:(Ljava/lang/Class;)V
        //   541: invokevirtual   com/sun/jna/NativeMappedConverter.fromNative:(Ljava/lang/Object;Lcom/sun/jna/FromNativeContext;)Ljava/lang/Object;
        //   544: checkcast       Lcom/sun/jna/NativeMapped;
        //   547: aastore        
        //   548: iinc            value, 1
        //   551: goto            492
        //   554: goto            592
        //   557: new             Ljava/lang/IllegalArgumentException;
        //   560: dup            
        //   561: new             Ljava/lang/StringBuilder;
        //   564: dup            
        //   565: invokespecial   java/lang/StringBuilder.<init>:()V
        //   568: ldc_w           "Reading array of "
        //   571: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   574: aload           cls
        //   576: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   579: ldc_w           " from memory not supported"
        //   582: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   585: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   588: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   591: athrow         
        //   592: return         
        //    Signature:
        //  (JLjava/lang/Object;Ljava/lang/Class<*>;)V
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
    
    public byte getByte(final long offset) {
        return Native.getByte(this, this.peer, offset);
    }
    
    public char getChar(final long offset) {
        return Native.getChar(this, this.peer, offset);
    }
    
    public short getShort(final long offset) {
        return Native.getShort(this, this.peer, offset);
    }
    
    public int getInt(final long offset) {
        return Native.getInt(this, this.peer, offset);
    }
    
    public long getLong(final long offset) {
        return Native.getLong(this, this.peer, offset);
    }
    
    public NativeLong getNativeLong(final long offset) {
        return new NativeLong((NativeLong.SIZE == 8) ? this.getLong(offset) : this.getInt(offset));
    }
    
    public float getFloat(final long offset) {
        return Native.getFloat(this, this.peer, offset);
    }
    
    public double getDouble(final long offset) {
        return Native.getDouble(this, this.peer, offset);
    }
    
    public Pointer getPointer(final long offset) {
        return Native.getPointer(this.peer + offset);
    }
    
    public ByteBuffer getByteBuffer(final long offset, final long length) {
        return Native.getDirectByteBuffer(this, this.peer, offset, length).order(ByteOrder.nativeOrder());
    }
    
    @Deprecated
    public String getString(final long offset, final boolean wide) {
        return wide ? this.getWideString(offset) : this.getString(offset);
    }
    
    public String getWideString(final long offset) {
        return Native.getWideString(this, this.peer, offset);
    }
    
    public String getString(final long offset) {
        return this.getString(offset, Native.getDefaultStringEncoding());
    }
    
    public String getString(final long offset, final String encoding) {
        return Native.getString(this, offset, encoding);
    }
    
    public byte[] getByteArray(final long offset, final int arraySize) {
        final byte[] buf = new byte[arraySize];
        this.read(offset, buf, 0, arraySize);
        return buf;
    }
    
    public char[] getCharArray(final long offset, final int arraySize) {
        final char[] buf = new char[arraySize];
        this.read(offset, buf, 0, arraySize);
        return buf;
    }
    
    public short[] getShortArray(final long offset, final int arraySize) {
        final short[] buf = new short[arraySize];
        this.read(offset, buf, 0, arraySize);
        return buf;
    }
    
    public int[] getIntArray(final long offset, final int arraySize) {
        final int[] buf = new int[arraySize];
        this.read(offset, buf, 0, arraySize);
        return buf;
    }
    
    public long[] getLongArray(final long offset, final int arraySize) {
        final long[] buf = new long[arraySize];
        this.read(offset, buf, 0, arraySize);
        return buf;
    }
    
    public float[] getFloatArray(final long offset, final int arraySize) {
        final float[] buf = new float[arraySize];
        this.read(offset, buf, 0, arraySize);
        return buf;
    }
    
    public double[] getDoubleArray(final long offset, final int arraySize) {
        final double[] buf = new double[arraySize];
        this.read(offset, buf, 0, arraySize);
        return buf;
    }
    
    public Pointer[] getPointerArray(final long offset) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore          5
        //     9: iconst_0       
        //    10: istore          6
        //    12: aload_0         /* this */
        //    13: lload_1         /* offset */
        //    14: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //    17: astore          7
        //    19: aload           7
        //    21: ifnull          56
        //    24: aload           addOffset
        //    26: aload           7
        //    28: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    33: pop            
        //    34: iload           p
        //    36: getstatic       com/sun/jna/Pointer.SIZE:I
        //    39: iadd           
        //    40: istore          p
        //    42: aload_0         /* this */
        //    43: lload_1         /* offset */
        //    44: iload           p
        //    46: i2l            
        //    47: ladd           
        //    48: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //    51: astore          7
        //    53: goto            19
        //    56: aload           addOffset
        //    58: aload           addOffset
        //    60: invokeinterface java/util/List.size:()I
        //    65: anewarray       Lcom/sun/jna/Pointer;
        //    68: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    73: checkcast       [Lcom/sun/jna/Pointer;
        //    76: areturn        
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
    
    public Pointer[] getPointerArray(final long offset, final int arraySize) {
        final Pointer[] buf = new Pointer[arraySize];
        this.read(offset, buf, 0, arraySize);
        return buf;
    }
    
    public String[] getStringArray(final long offset) {
        return this.getStringArray(offset, -1, Native.getDefaultStringEncoding());
    }
    
    public String[] getStringArray(final long offset, final String encoding) {
        return this.getStringArray(offset, -1, encoding);
    }
    
    public String[] getStringArray(final long offset, final int length) {
        return this.getStringArray(offset, length, Native.getDefaultStringEncoding());
    }
    
    @Deprecated
    public String[] getStringArray(final long offset, final boolean wide) {
        return this.getStringArray(offset, -1, wide);
    }
    
    public String[] getWideStringArray(final long offset) {
        return this.getWideStringArray(offset, -1);
    }
    
    public String[] getWideStringArray(final long offset, final int length) {
        return this.getStringArray(offset, length, "--WIDE-STRING--");
    }
    
    @Deprecated
    public String[] getStringArray(final long offset, final int length, final boolean wide) {
        return this.getStringArray(offset, length, wide ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
    }
    
    public String[] getStringArray(final long offset, final int length, final String encoding) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore          7
        //     9: iconst_0       
        //    10: istore          8
        //    12: iload_3         /* length */
        //    13: iconst_m1      
        //    14: if_icmpeq       120
        //    17: aload_0         /* this */
        //    18: lload_1         /* offset */
        //    19: iload           8
        //    21: i2l            
        //    22: ladd           
        //    23: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //    26: astore          9
        //    28: iconst_0       
        //    29: istore          10
        //    31: iload           10
        //    33: iinc            10, 1
        //    36: iload_3         /* length */
        //    37: if_icmpge       117
        //    40: aload           count
        //    42: ifnonnull       49
        //    45: aconst_null    
        //    46: goto            77
        //    49: ldc_w           "--WIDE-STRING--"
        //    52: aload           encoding
        //    54: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    57: ifeq            69
        //    60: aload           count
        //    62: lconst_0       
        //    63: invokevirtual   com/sun/jna/Pointer.getWideString:(J)Ljava/lang/String;
        //    66: goto            77
        //    69: aload           count
        //    71: lconst_0       
        //    72: aload           encoding
        //    74: invokevirtual   com/sun/jna/Pointer.getString:(JLjava/lang/String;)Ljava/lang/String;
        //    77: astore          11
        //    79: aload           addOffset
        //    81: aload           11
        //    83: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    88: pop            
        //    89: iload           s
        //    91: iload_3         /* length */
        //    92: if_icmpge       114
        //    95: iload           p
        //    97: getstatic       com/sun/jna/Pointer.SIZE:I
        //   100: iadd           
        //   101: istore          p
        //   103: aload_0         /* this */
        //   104: lload_1         /* offset */
        //   105: iload           p
        //   107: i2l            
        //   108: ladd           
        //   109: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //   112: astore          count
        //   114: goto            31
        //   117: goto            195
        //   120: aload_0         /* this */
        //   121: lload_1         /* offset */
        //   122: iload           8
        //   124: i2l            
        //   125: ladd           
        //   126: invokevirtual   com/sun/jna/Pointer.getPointer:(J)Lcom/sun/jna/Pointer;
        //   129: dup            
        //   130: astore          9
        //   132: ifnull          195
        //   135: aload           9
        //   137: ifnonnull       144
        //   140: aconst_null    
        //   141: goto            172
        //   144: ldc_w           "--WIDE-STRING--"
        //   147: aload           encoding
        //   149: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   152: ifeq            164
        //   155: aload           9
        //   157: lconst_0       
        //   158: invokevirtual   com/sun/jna/Pointer.getWideString:(J)Ljava/lang/String;
        //   161: goto            172
        //   164: aload           9
        //   166: lconst_0       
        //   167: aload           encoding
        //   169: invokevirtual   com/sun/jna/Pointer.getString:(JLjava/lang/String;)Ljava/lang/String;
        //   172: astore          10
        //   174: aload           addOffset
        //   176: aload           10
        //   178: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   183: pop            
        //   184: iload           p
        //   186: getstatic       com/sun/jna/Pointer.SIZE:I
        //   189: iadd           
        //   190: istore          p
        //   192: goto            120
        //   195: aload           addOffset
        //   197: aload           addOffset
        //   199: invokeinterface java/util/List.size:()I
        //   204: anewarray       Ljava/lang/String;
        //   207: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   212: checkcast       [Ljava/lang/String;
        //   215: areturn        
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
    
    public void setValue(final long offset, final Object value, final Class<?> type) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //     5: if_acmpeq       15
        //     8: aload           type
        //    10: ldc             Ljava/lang/Boolean;.class
        //    12: if_acmpne       38
        //    15: aload_0         /* this */
        //    16: lload_1         /* offset */
        //    17: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    20: aload_3         /* value */
        //    21: invokevirtual   java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        //    24: ifeq            31
        //    27: iconst_m1      
        //    28: goto            32
        //    31: iconst_0       
        //    32: invokevirtual   com/sun/jna/Pointer.setInt:(JI)V
        //    35: goto            610
        //    38: aload           type
        //    40: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //    43: if_acmpeq       53
        //    46: aload           type
        //    48: ldc             Ljava/lang/Byte;.class
        //    50: if_acmpne       76
        //    53: aload_0         /* this */
        //    54: lload_1         /* offset */
        //    55: aload_3         /* value */
        //    56: ifnonnull       63
        //    59: iconst_0       
        //    60: goto            70
        //    63: aload_3         /* value */
        //    64: checkcast       Ljava/lang/Byte;
        //    67: invokevirtual   java/lang/Byte.byteValue:()B
        //    70: invokevirtual   com/sun/jna/Pointer.setByte:(JB)V
        //    73: goto            610
        //    76: aload           type
        //    78: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //    81: if_acmpeq       91
        //    84: aload           type
        //    86: ldc             Ljava/lang/Short;.class
        //    88: if_acmpne       114
        //    91: aload_0         /* this */
        //    92: lload_1         /* offset */
        //    93: aload_3         /* value */
        //    94: ifnonnull       101
        //    97: iconst_0       
        //    98: goto            108
        //   101: aload_3         /* value */
        //   102: checkcast       Ljava/lang/Short;
        //   105: invokevirtual   java/lang/Short.shortValue:()S
        //   108: invokevirtual   com/sun/jna/Pointer.setShort:(JS)V
        //   111: goto            610
        //   114: aload           type
        //   116: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //   119: if_acmpeq       129
        //   122: aload           type
        //   124: ldc             Ljava/lang/Character;.class
        //   126: if_acmpne       152
        //   129: aload_0         /* this */
        //   130: lload_1         /* offset */
        //   131: aload_3         /* value */
        //   132: ifnonnull       139
        //   135: iconst_0       
        //   136: goto            146
        //   139: aload_3         /* value */
        //   140: checkcast       Ljava/lang/Character;
        //   143: invokevirtual   java/lang/Character.charValue:()C
        //   146: invokevirtual   com/sun/jna/Pointer.setChar:(JC)V
        //   149: goto            610
        //   152: aload           type
        //   154: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   157: if_acmpeq       167
        //   160: aload           type
        //   162: ldc             Ljava/lang/Integer;.class
        //   164: if_acmpne       190
        //   167: aload_0         /* this */
        //   168: lload_1         /* offset */
        //   169: aload_3         /* value */
        //   170: ifnonnull       177
        //   173: iconst_0       
        //   174: goto            184
        //   177: aload_3         /* value */
        //   178: checkcast       Ljava/lang/Integer;
        //   181: invokevirtual   java/lang/Integer.intValue:()I
        //   184: invokevirtual   com/sun/jna/Pointer.setInt:(JI)V
        //   187: goto            610
        //   190: aload           type
        //   192: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   195: if_acmpeq       205
        //   198: aload           type
        //   200: ldc             Ljava/lang/Long;.class
        //   202: if_acmpne       228
        //   205: aload_0         /* this */
        //   206: lload_1         /* offset */
        //   207: aload_3         /* value */
        //   208: ifnonnull       215
        //   211: lconst_0       
        //   212: goto            222
        //   215: aload_3         /* value */
        //   216: checkcast       Ljava/lang/Long;
        //   219: invokevirtual   java/lang/Long.longValue:()J
        //   222: invokevirtual   com/sun/jna/Pointer.setLong:(JJ)V
        //   225: goto            610
        //   228: aload           type
        //   230: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   233: if_acmpeq       243
        //   236: aload           type
        //   238: ldc             Ljava/lang/Float;.class
        //   240: if_acmpne       266
        //   243: aload_0         /* this */
        //   244: lload_1         /* offset */
        //   245: aload_3         /* value */
        //   246: ifnonnull       253
        //   249: fconst_0       
        //   250: goto            260
        //   253: aload_3         /* value */
        //   254: checkcast       Ljava/lang/Float;
        //   257: invokevirtual   java/lang/Float.floatValue:()F
        //   260: invokevirtual   com/sun/jna/Pointer.setFloat:(JF)V
        //   263: goto            610
        //   266: aload           type
        //   268: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   271: if_acmpeq       281
        //   274: aload           type
        //   276: ldc             Ljava/lang/Double;.class
        //   278: if_acmpne       304
        //   281: aload_0         /* this */
        //   282: lload_1         /* offset */
        //   283: aload_3         /* value */
        //   284: ifnonnull       291
        //   287: dconst_0       
        //   288: goto            298
        //   291: aload_3         /* value */
        //   292: checkcast       Ljava/lang/Double;
        //   295: invokevirtual   java/lang/Double.doubleValue:()D
        //   298: invokevirtual   com/sun/jna/Pointer.setDouble:(JD)V
        //   301: goto            610
        //   304: aload           type
        //   306: ldc             Lcom/sun/jna/Pointer;.class
        //   308: if_acmpne       323
        //   311: aload_0         /* this */
        //   312: lload_1         /* offset */
        //   313: aload_3         /* value */
        //   314: checkcast       Lcom/sun/jna/Pointer;
        //   317: invokevirtual   com/sun/jna/Pointer.setPointer:(JLcom/sun/jna/Pointer;)V
        //   320: goto            610
        //   323: aload           type
        //   325: ldc             Ljava/lang/String;.class
        //   327: if_acmpne       342
        //   330: aload_0         /* this */
        //   331: lload_1         /* offset */
        //   332: aload_3         /* value */
        //   333: checkcast       Lcom/sun/jna/Pointer;
        //   336: invokevirtual   com/sun/jna/Pointer.setPointer:(JLcom/sun/jna/Pointer;)V
        //   339: goto            610
        //   342: aload           type
        //   344: ldc             Lcom/sun/jna/WString;.class
        //   346: if_acmpne       361
        //   349: aload_0         /* this */
        //   350: lload_1         /* offset */
        //   351: aload_3         /* value */
        //   352: checkcast       Lcom/sun/jna/Pointer;
        //   355: invokevirtual   com/sun/jna/Pointer.setPointer:(JLcom/sun/jna/Pointer;)V
        //   358: goto            610
        //   361: ldc             Lcom/sun/jna/Structure;.class
        //   363: aload           type
        //   365: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   368: ifeq            436
        //   371: aload_3         /* value */
        //   372: checkcast       Lcom/sun/jna/Structure;
        //   375: astore          7
        //   377: ldc             Lcom/sun/jna/Structure$ByReference;.class
        //   379: aload           type
        //   381: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   384: ifeq            419
        //   387: aload_0         /* this */
        //   388: lload_1         /* offset */
        //   389: aload           7
        //   391: ifnonnull       398
        //   394: aconst_null    
        //   395: goto            403
        //   398: aload           7
        //   400: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //   403: invokevirtual   com/sun/jna/Pointer.setPointer:(JLcom/sun/jna/Pointer;)V
        //   406: aload           7
        //   408: ifnull          433
        //   411: aload           7
        //   413: invokevirtual   com/sun/jna/Structure.autoWrite:()V
        //   416: goto            433
        //   419: aload           7
        //   421: aload_0         /* this */
        //   422: lload_1         /* offset */
        //   423: l2i            
        //   424: iconst_1       
        //   425: invokevirtual   com/sun/jna/Structure.useMemory:(Lcom/sun/jna/Pointer;IZ)V
        //   428: aload           7
        //   430: invokevirtual   com/sun/jna/Structure.write:()V
        //   433: goto            610
        //   436: ldc             Lcom/sun/jna/Callback;.class
        //   438: aload           type
        //   440: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   443: ifeq            461
        //   446: aload_0         /* this */
        //   447: lload_1         /* offset */
        //   448: aload_3         /* value */
        //   449: checkcast       Lcom/sun/jna/Callback;
        //   452: invokestatic    com/sun/jna/CallbackReference.getFunctionPointer:(Lcom/sun/jna/Callback;)Lcom/sun/jna/Pointer;
        //   455: invokevirtual   com/sun/jna/Pointer.setPointer:(JLcom/sun/jna/Pointer;)V
        //   458: goto            610
        //   461: getstatic       com/sun/jna/Platform.HAS_BUFFERS:Z
        //   464: ifeq            505
        //   467: ldc_w           Ljava/nio/Buffer;.class
        //   470: aload           type
        //   472: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   475: ifeq            505
        //   478: aload_3         /* value */
        //   479: ifnonnull       486
        //   482: aconst_null    
        //   483: goto            493
        //   486: aload_3         /* value */
        //   487: checkcast       Ljava/nio/Buffer;
        //   490: invokestatic    com/sun/jna/Native.getDirectBufferPointer:(Ljava/nio/Buffer;)Lcom/sun/jna/Pointer;
        //   493: astore          7
        //   495: aload_0         /* this */
        //   496: lload_1         /* offset */
        //   497: aload           7
        //   499: invokevirtual   com/sun/jna/Pointer.setPointer:(JLcom/sun/jna/Pointer;)V
        //   502: goto            610
        //   505: ldc_w           Lcom/sun/jna/NativeMapped;.class
        //   508: aload           type
        //   510: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   513: ifeq            553
        //   516: aload           type
        //   518: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   521: astore          7
        //   523: aload           7
        //   525: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   528: astore          8
        //   530: aload_0         /* this */
        //   531: lload_1         /* offset */
        //   532: aload           nativeType
        //   534: aload_3         /* value */
        //   535: new             Lcom/sun/jna/ToNativeContext;
        //   538: dup            
        //   539: invokespecial   com/sun/jna/ToNativeContext.<init>:()V
        //   542: invokevirtual   com/sun/jna/NativeMappedConverter.toNative:(Ljava/lang/Object;Lcom/sun/jna/ToNativeContext;)Ljava/lang/Object;
        //   545: aload           8
        //   547: invokevirtual   com/sun/jna/Pointer.setValue:(JLjava/lang/Object;Ljava/lang/Class;)V
        //   550: goto            610
        //   553: aload           type
        //   555: invokevirtual   java/lang/Class.isArray:()Z
        //   558: ifeq            575
        //   561: aload_0         /* this */
        //   562: lload_1         /* offset */
        //   563: aload_3         /* value */
        //   564: aload           type
        //   566: invokevirtual   java/lang/Class.getComponentType:()Ljava/lang/Class;
        //   569: invokespecial   com/sun/jna/Pointer.writeArray:(JLjava/lang/Object;Ljava/lang/Class;)V
        //   572: goto            610
        //   575: new             Ljava/lang/IllegalArgumentException;
        //   578: dup            
        //   579: new             Ljava/lang/StringBuilder;
        //   582: dup            
        //   583: invokespecial   java/lang/StringBuilder.<init>:()V
        //   586: ldc_w           "Writing "
        //   589: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   592: aload           type
        //   594: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   597: ldc_w           " to memory is not supported"
        //   600: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   603: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   606: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   609: athrow         
        //   610: return         
        //    Signature:
        //  (JLjava/lang/Object;Ljava/lang/Class<*>;)V
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
    
    private void writeArray(final long offset, final Object value, final Class<?> cls) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //     5: if_acmpne       31
        //     8: aload_3         /* value */
        //     9: checkcast       [B
        //    12: checkcast       [B
        //    15: astore          7
        //    17: aload_0         /* this */
        //    18: lload_1         /* offset */
        //    19: aload           7
        //    21: iconst_0       
        //    22: aload           7
        //    24: arraylength    
        //    25: invokevirtual   com/sun/jna/Pointer.write:(J[BII)V
        //    28: goto            624
        //    31: aload           cls
        //    33: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //    36: if_acmpne       62
        //    39: aload_3         /* value */
        //    40: checkcast       [S
        //    43: checkcast       [S
        //    46: astore          7
        //    48: aload_0         /* this */
        //    49: lload_1         /* offset */
        //    50: aload           7
        //    52: iconst_0       
        //    53: aload           7
        //    55: arraylength    
        //    56: invokevirtual   com/sun/jna/Pointer.write:(J[SII)V
        //    59: goto            624
        //    62: aload           cls
        //    64: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //    67: if_acmpne       93
        //    70: aload_3         /* value */
        //    71: checkcast       [C
        //    74: checkcast       [C
        //    77: astore          7
        //    79: aload_0         /* this */
        //    80: lload_1         /* offset */
        //    81: aload           7
        //    83: iconst_0       
        //    84: aload           7
        //    86: arraylength    
        //    87: invokevirtual   com/sun/jna/Pointer.write:(J[CII)V
        //    90: goto            624
        //    93: aload           cls
        //    95: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    98: if_acmpne       124
        //   101: aload_3         /* value */
        //   102: checkcast       [I
        //   105: checkcast       [I
        //   108: astore          7
        //   110: aload_0         /* this */
        //   111: lload_1         /* offset */
        //   112: aload           7
        //   114: iconst_0       
        //   115: aload           7
        //   117: arraylength    
        //   118: invokevirtual   com/sun/jna/Pointer.write:(J[III)V
        //   121: goto            624
        //   124: aload           cls
        //   126: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   129: if_acmpne       155
        //   132: aload_3         /* value */
        //   133: checkcast       [J
        //   136: checkcast       [J
        //   139: astore          7
        //   141: aload_0         /* this */
        //   142: lload_1         /* offset */
        //   143: aload           7
        //   145: iconst_0       
        //   146: aload           7
        //   148: arraylength    
        //   149: invokevirtual   com/sun/jna/Pointer.write:(J[JII)V
        //   152: goto            624
        //   155: aload           cls
        //   157: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   160: if_acmpne       186
        //   163: aload_3         /* value */
        //   164: checkcast       [F
        //   167: checkcast       [F
        //   170: astore          7
        //   172: aload_0         /* this */
        //   173: lload_1         /* offset */
        //   174: aload           7
        //   176: iconst_0       
        //   177: aload           7
        //   179: arraylength    
        //   180: invokevirtual   com/sun/jna/Pointer.write:(J[FII)V
        //   183: goto            624
        //   186: aload           cls
        //   188: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   191: if_acmpne       217
        //   194: aload_3         /* value */
        //   195: checkcast       [D
        //   198: checkcast       [D
        //   201: astore          7
        //   203: aload_0         /* this */
        //   204: lload_1         /* offset */
        //   205: aload           7
        //   207: iconst_0       
        //   208: aload           7
        //   210: arraylength    
        //   211: invokevirtual   com/sun/jna/Pointer.write:(J[DII)V
        //   214: goto            624
        //   217: ldc             Lcom/sun/jna/Pointer;.class
        //   219: aload           cls
        //   221: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   224: ifeq            250
        //   227: aload_3         /* value */
        //   228: checkcast       [Lcom/sun/jna/Pointer;
        //   231: checkcast       [Lcom/sun/jna/Pointer;
        //   234: astore          7
        //   236: aload_0         /* this */
        //   237: lload_1         /* offset */
        //   238: aload           7
        //   240: iconst_0       
        //   241: aload           7
        //   243: arraylength    
        //   244: invokevirtual   com/sun/jna/Pointer.write:(J[Lcom/sun/jna/Pointer;II)V
        //   247: goto            624
        //   250: ldc             Lcom/sun/jna/Structure;.class
        //   252: aload           cls
        //   254: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   257: ifeq            486
        //   260: aload_3         /* value */
        //   261: checkcast       [Lcom/sun/jna/Structure;
        //   264: checkcast       [Lcom/sun/jna/Structure;
        //   267: astore          7
        //   269: ldc             Lcom/sun/jna/Structure$ByReference;.class
        //   271: aload           cls
        //   273: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   276: ifeq            356
        //   279: aload           7
        //   281: arraylength    
        //   282: anewarray       Lcom/sun/jna/Pointer;
        //   285: astore          8
        //   287: iconst_0       
        //   288: istore          9
        //   290: iload           9
        //   292: aload           buf
        //   294: arraylength    
        //   295: if_icmpge       342
        //   298: aload           buf
        //   300: iload           9
        //   302: aaload         
        //   303: ifnonnull       315
        //   306: aload           i
        //   308: iload           9
        //   310: aconst_null    
        //   311: aastore        
        //   312: goto            336
        //   315: aload           i
        //   317: iload           9
        //   319: aload           buf
        //   321: iload           9
        //   323: aaload         
        //   324: invokevirtual   com/sun/jna/Structure.getPointer:()Lcom/sun/jna/Pointer;
        //   327: aastore        
        //   328: aload           buf
        //   330: iload           9
        //   332: aaload         
        //   333: invokevirtual   com/sun/jna/Structure.write:()V
        //   336: iinc            9, 1
        //   339: goto            290
        //   342: aload_0         /* this */
        //   343: lload_1         /* offset */
        //   344: aload           8
        //   346: iconst_0       
        //   347: aload           8
        //   349: arraylength    
        //   350: invokevirtual   com/sun/jna/Pointer.write:(J[Lcom/sun/jna/Pointer;II)V
        //   353: goto            483
        //   356: aload           7
        //   358: iconst_0       
        //   359: aaload         
        //   360: astore          8
        //   362: aload           8
        //   364: ifnonnull       388
        //   367: aload           cls
        //   369: aload_0         /* this */
        //   370: lload_1         /* offset */
        //   371: invokevirtual   com/sun/jna/Pointer.share:(J)Lcom/sun/jna/Pointer;
        //   374: invokestatic    com/sun/jna/Structure.newInstance:(Ljava/lang/Class;Lcom/sun/jna/Pointer;)Lcom/sun/jna/Structure;
        //   377: astore          8
        //   379: aload           first
        //   381: iconst_0       
        //   382: aload           8
        //   384: aastore        
        //   385: goto            397
        //   388: aload           8
        //   390: aload_0         /* this */
        //   391: lload_1         /* offset */
        //   392: l2i            
        //   393: iconst_1       
        //   394: invokevirtual   com/sun/jna/Structure.useMemory:(Lcom/sun/jna/Pointer;IZ)V
        //   397: aload           8
        //   399: invokevirtual   com/sun/jna/Structure.write:()V
        //   402: aload           8
        //   404: aload           first
        //   406: arraylength    
        //   407: invokevirtual   com/sun/jna/Structure.toArray:(I)[Lcom/sun/jna/Structure;
        //   410: astore          9
        //   412: iconst_1       
        //   413: istore          10
        //   415: iload           10
        //   417: aload           first
        //   419: arraylength    
        //   420: if_icmpge       483
        //   423: aload           first
        //   425: iload           10
        //   427: aaload         
        //   428: ifnonnull       444
        //   431: aload           first
        //   433: iload           10
        //   435: aload           i
        //   437: iload           10
        //   439: aaload         
        //   440: aastore        
        //   441: goto            469
        //   444: aload           first
        //   446: iload           10
        //   448: aaload         
        //   449: aload_0         /* this */
        //   450: lload_1         /* offset */
        //   451: iload           10
        //   453: aload           first
        //   455: iload           10
        //   457: aaload         
        //   458: invokevirtual   com/sun/jna/Structure.size:()I
        //   461: imul           
        //   462: i2l            
        //   463: ladd           
        //   464: l2i            
        //   465: iconst_1       
        //   466: invokevirtual   com/sun/jna/Structure.useMemory:(Lcom/sun/jna/Pointer;IZ)V
        //   469: aload           first
        //   471: iload           10
        //   473: aaload         
        //   474: invokevirtual   com/sun/jna/Structure.write:()V
        //   477: iinc            10, 1
        //   480: goto            415
        //   483: goto            624
        //   486: ldc_w           Lcom/sun/jna/NativeMapped;.class
        //   489: aload           cls
        //   491: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   494: ifeq            589
        //   497: aload_3         /* value */
        //   498: checkcast       [Lcom/sun/jna/NativeMapped;
        //   501: checkcast       [Lcom/sun/jna/NativeMapped;
        //   504: astore          7
        //   506: aload           cls
        //   508: invokestatic    com/sun/jna/NativeMappedConverter.getInstance:(Ljava/lang/Class;)Lcom/sun/jna/NativeMappedConverter;
        //   511: astore          8
        //   513: aload           8
        //   515: invokevirtual   com/sun/jna/NativeMappedConverter.nativeType:()Ljava/lang/Class;
        //   518: astore          9
        //   520: aload_3         /* value */
        //   521: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   524: aload_3         /* value */
        //   525: invokestatic    com/sun/jna/Native.getNativeSize:(Ljava/lang/Class;Ljava/lang/Object;)I
        //   528: aload           tc
        //   530: arraylength    
        //   531: idiv           
        //   532: istore          10
        //   534: iconst_0       
        //   535: istore          11
        //   537: iload           11
        //   539: aload           tc
        //   541: arraylength    
        //   542: if_icmpge       586
        //   545: aload           nativeType
        //   547: aload           tc
        //   549: iload           11
        //   551: aaload         
        //   552: new             Lcom/sun/jna/ToNativeContext;
        //   555: dup            
        //   556: invokespecial   com/sun/jna/ToNativeContext.<init>:()V
        //   559: invokevirtual   com/sun/jna/NativeMappedConverter.toNative:(Ljava/lang/Object;Lcom/sun/jna/ToNativeContext;)Ljava/lang/Object;
        //   562: astore          12
        //   564: aload_0         /* this */
        //   565: lload_1         /* offset */
        //   566: iload           element
        //   568: iload           i
        //   570: imul           
        //   571: i2l            
        //   572: ladd           
        //   573: aload           12
        //   575: aload           size
        //   577: invokevirtual   com/sun/jna/Pointer.setValue:(JLjava/lang/Object;Ljava/lang/Class;)V
        //   580: iinc            element, 1
        //   583: goto            537
        //   586: goto            624
        //   589: new             Ljava/lang/IllegalArgumentException;
        //   592: dup            
        //   593: new             Ljava/lang/StringBuilder;
        //   596: dup            
        //   597: invokespecial   java/lang/StringBuilder.<init>:()V
        //   600: ldc_w           "Writing array of "
        //   603: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   606: aload           cls
        //   608: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   611: ldc_w           " to memory not supported"
        //   614: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   617: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   620: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   623: athrow         
        //   624: return         
        //    Signature:
        //  (JLjava/lang/Object;Ljava/lang/Class<*>;)V
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
    
    public void setMemory(final long offset, final long length, final byte value) {
        Native.setMemory(this, this.peer, offset, length, value);
    }
    
    public void setByte(final long offset, final byte value) {
        Native.setByte(this, this.peer, offset, value);
    }
    
    public void setShort(final long offset, final short value) {
        Native.setShort(this, this.peer, offset, value);
    }
    
    public void setChar(final long offset, final char value) {
        Native.setChar(this, this.peer, offset, value);
    }
    
    public void setInt(final long offset, final int value) {
        Native.setInt(this, this.peer, offset, value);
    }
    
    public void setLong(final long offset, final long value) {
        Native.setLong(this, this.peer, offset, value);
    }
    
    public void setNativeLong(final long offset, final NativeLong value) {
        if (NativeLong.SIZE == 8) {
            this.setLong(offset, value.longValue());
        }
        else {
            this.setInt(offset, value.intValue());
        }
    }
    
    public void setFloat(final long offset, final float value) {
        Native.setFloat(this, this.peer, offset, value);
    }
    
    public void setDouble(final long offset, final double value) {
        Native.setDouble(this, this.peer, offset, value);
    }
    
    public void setPointer(final long offset, final Pointer value) {
        Native.setPointer(this, this.peer, offset, (value != null) ? value.peer : 0L);
    }
    
    @Deprecated
    public void setString(final long offset, final String value, final boolean wide) {
        if (wide) {
            this.setWideString(offset, value);
        }
        else {
            this.setString(offset, value);
        }
    }
    
    public void setWideString(final long offset, final String value) {
        Native.setWideString(this, this.peer, offset, value);
    }
    
    public void setString(final long offset, final WString value) {
        this.setWideString(offset, (value == null) ? null : value.toString());
    }
    
    public void setString(final long offset, final String value) {
        this.setString(offset, value, Native.getDefaultStringEncoding());
    }
    
    public void setString(final long offset, final String value, final String encoding) {
        final byte[] bytes = Native.getBytes(value, encoding);
        this.write(offset, bytes, 0, bytes.length);
        this.setByte(offset + bytes.length, (byte)0);
    }
    
    public String dump(final long offset, final int size) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          6
        //     3: ldc_w           "memory dump"
        //     6: astore          7
        //     8: new             Ljava/io/StringWriter;
        //    11: dup            
        //    12: ldc_w           "memory dump"
        //    15: invokevirtual   java/lang/String.length:()I
        //    18: iconst_2       
        //    19: iadd           
        //    20: iload_3         /* size */
        //    21: iconst_2       
        //    22: imul           
        //    23: iadd           
        //    24: iload_3         /* size */
        //    25: iconst_4       
        //    26: idiv           
        //    27: iconst_4       
        //    28: imul           
        //    29: iadd           
        //    30: invokespecial   java/io/StringWriter.<init>:(I)V
        //    33: astore          8
        //    35: new             Ljava/io/PrintWriter;
        //    38: dup            
        //    39: aload           8
        //    41: invokespecial   java/io/PrintWriter.<init>:(Ljava/io/Writer;)V
        //    44: astore          9
        //    46: aload           9
        //    48: ldc_w           "memory dump"
        //    51: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //    54: iconst_0       
        //    55: istore          10
        //    57: iload           10
        //    59: iload_3         /* size */
        //    60: if_icmpge       153
        //    63: aload_0         /* this */
        //    64: lload_1         /* offset */
        //    65: iload           10
        //    67: i2l            
        //    68: ladd           
        //    69: invokevirtual   com/sun/jna/Pointer.getByte:(J)B
        //    72: istore          11
        //    74: iload           b
        //    76: iconst_4       
        //    77: irem           
        //    78: ifne            89
        //    81: aload           i
        //    83: ldc_w           "["
        //    86: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    89: iload           11
        //    91: iflt            109
        //    94: iload           11
        //    96: bipush          16
        //    98: if_icmpge       109
        //   101: aload           i
        //   103: ldc_w           "0"
        //   106: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   109: aload           i
        //   111: iload           11
        //   113: sipush          255
        //   116: iand           
        //   117: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   120: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   123: iload           b
        //   125: iconst_4       
        //   126: irem           
        //   127: iconst_3       
        //   128: if_icmpne       147
        //   131: iload           b
        //   133: iload_3         /* size */
        //   134: iconst_1       
        //   135: isub           
        //   136: if_icmpge       147
        //   139: aload           i
        //   141: ldc_w           "]"
        //   144: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   147: iinc            b, 1
        //   150: goto            57
        //   153: aload           out
        //   155: invokevirtual   java/io/StringWriter.getBuffer:()Ljava/lang/StringBuffer;
        //   158: aload           out
        //   160: invokevirtual   java/io/StringWriter.getBuffer:()Ljava/lang/StringBuffer;
        //   163: invokevirtual   java/lang/StringBuffer.length:()I
        //   166: iconst_2       
        //   167: isub           
        //   168: invokevirtual   java/lang/StringBuffer.charAt:(I)C
        //   171: bipush          93
        //   173: if_icmpeq       184
        //   176: aload           9
        //   178: ldc_w           "]"
        //   181: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   184: aload           out
        //   186: invokevirtual   java/io/StringWriter.toString:()Ljava/lang/String;
        //   189: areturn        
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
        return "native@0x" + Long.toHexString(this.peer);
    }
    
    public static long nativeValue(final Pointer p) {
        return (p == null) ? 0L : p.peer;
    }
    
    public static void nativeValue(final Pointer p, final long value) {
        p.peer = value;
    }
    
    static {
        if ((SIZE = Native.POINTER_SIZE) == 0) {
            throw new Error("Native library not initialized");
        }
        NULL = null;
    }
}

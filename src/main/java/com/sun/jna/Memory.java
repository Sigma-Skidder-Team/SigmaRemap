// 
// Decompiled by Procyon v0.6.0
// 

package com.sun.jna;

import java.util.Collections;
import java.util.WeakHashMap;
import java.nio.ByteBuffer;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import java.lang.ref.Reference;
import java.util.Map;

public class Memory extends Pointer
{
    private static final Map<Memory, Reference<Memory>> allocatedMemory;
    private static final WeakMemoryHolder buffers;
    public long size;
    
    public static void purge() {
        Memory.buffers.clean();
    }
    
    public static void disposeAll() {
        final Iterator iterator = new LinkedList(Memory.allocatedMemory.keySet()).iterator();
        while (iterator.hasNext()) {
            ((Memory)iterator.next()).dispose();
        }
    }
    
    public Memory(final long size) {
        this.size = size;
        if (size <= 0L) {
            throw new IllegalArgumentException("Allocation size must be greater than zero");
        }
        this.peer = malloc(size);
        if (this.peer == 0L) {
            throw new OutOfMemoryError("Cannot allocate " + size + " bytes");
        }
        Memory.allocatedMemory.put(this, new WeakReference<Memory>(this));
    }
    
    public Memory() {
    }
    
    @Override
    public Pointer share(final long offset) {
        return this.share(offset, this.size() - offset);
    }
    
    @Override
    public Pointer share(final long offset, final long sz) {
        this.boundsCheck(offset, sz);
        return new Memory$SharedMemory(this, offset, sz);
    }
    
    public Memory align(final int byteBoundary) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifgt            31
        //     4: new             Ljava/lang/IllegalArgumentException;
        //     7: dup            
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: invokespecial   java/lang/StringBuilder.<init>:()V
        //    15: ldc             "Byte boundary must be positive: "
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: iload_1         /* byteBoundary */
        //    21: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    24: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    27: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    30: athrow         
        //    31: iconst_0       
        //    32: istore          4
        //    34: iload           4
        //    36: bipush          32
        //    38: if_icmpge       144
        //    41: iload_1         /* byteBoundary */
        //    42: iconst_1       
        //    43: iload           4
        //    45: ishl           
        //    46: if_icmpne       138
        //    49: iload_1         /* byteBoundary */
        //    50: i2l            
        //    51: lconst_1       
        //    52: lsub           
        //    53: ldc2_w          -1
        //    56: lxor           
        //    57: lstore          5
        //    59: aload_0         /* this */
        //    60: getfield        com/sun/jna/Memory.peer:J
        //    63: lload           5
        //    65: land           
        //    66: aload_0         /* this */
        //    67: getfield        com/sun/jna/Memory.peer:J
        //    70: lcmp           
        //    71: ifeq            136
        //    74: aload_0         /* this */
        //    75: getfield        com/sun/jna/Memory.peer:J
        //    78: iload_1         /* byteBoundary */
        //    79: i2l            
        //    80: ladd           
        //    81: lconst_1       
        //    82: lsub           
        //    83: lload           5
        //    85: land           
        //    86: lstore          7
        //    88: aload_0         /* this */
        //    89: getfield        com/sun/jna/Memory.peer:J
        //    92: aload_0         /* this */
        //    93: getfield        com/sun/jna/Memory.size:J
        //    96: ladd           
        //    97: lload           7
        //    99: lsub           
        //   100: lstore          9
        //   102: lload           9
        //   104: lconst_0       
        //   105: lcmp           
        //   106: ifgt            119
        //   109: new             Ljava/lang/IllegalArgumentException;
        //   112: dup            
        //   113: ldc             "Insufficient memory to align to the requested boundary"
        //   115: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   118: athrow         
        //   119: aload_0         /* this */
        //   120: lload           7
        //   122: aload_0         /* this */
        //   123: getfield        com/sun/jna/Memory.peer:J
        //   126: lsub           
        //   127: lload           9
        //   129: invokevirtual   com/sun/jna/Memory.share:(JJ)Lcom/sun/jna/Pointer;
        //   132: checkcast       Lcom/sun/jna/Memory;
        //   135: areturn        
        //   136: aload_0         /* this */
        //   137: areturn        
        //   138: iinc            mask, 1
        //   141: goto            34
        //   144: new             Ljava/lang/IllegalArgumentException;
        //   147: dup            
        //   148: ldc             "Byte boundary must be a power of two"
        //   150: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   153: athrow         
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
    
    public void finalize() {
        this.dispose();
    }
    
    public synchronized void dispose() {
        try {
            free(this.peer);
        }
        finally {
            Memory.allocatedMemory.remove(this);
            this.peer = 0L;
        }
    }
    
    public void clear() {
        this.clear(this.size);
    }
    
    public boolean valid() {
        return this.peer != 0L;
    }
    
    public long size() {
        return this.size;
    }
    
    public void boundsCheck(final long off, final long sz) {
        if (off < 0L) {
            throw new IndexOutOfBoundsException("Invalid offset: " + off);
        }
        if (off + sz > this.size) {
            throw new IndexOutOfBoundsException("Bounds exceeds available space : size=" + this.size + ", offset=" + (off + sz));
        }
    }
    
    @Override
    public void read(final long bOff, final byte[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 1L);
        super.read(bOff, buf, index, length);
    }
    
    @Override
    public void read(final long bOff, final short[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 2L);
        super.read(bOff, buf, index, length);
    }
    
    @Override
    public void read(final long bOff, final char[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 2L);
        super.read(bOff, buf, index, length);
    }
    
    @Override
    public void read(final long bOff, final int[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 4L);
        super.read(bOff, buf, index, length);
    }
    
    @Override
    public void read(final long bOff, final long[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 8L);
        super.read(bOff, buf, index, length);
    }
    
    @Override
    public void read(final long bOff, final float[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 4L);
        super.read(bOff, buf, index, length);
    }
    
    @Override
    public void read(final long bOff, final double[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 8L);
        super.read(bOff, buf, index, length);
    }
    
    @Override
    public void write(final long bOff, final byte[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 1L);
        super.write(bOff, buf, index, length);
    }
    
    @Override
    public void write(final long bOff, final short[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 2L);
        super.write(bOff, buf, index, length);
    }
    
    @Override
    public void write(final long bOff, final char[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 2L);
        super.write(bOff, buf, index, length);
    }
    
    @Override
    public void write(final long bOff, final int[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 4L);
        super.write(bOff, buf, index, length);
    }
    
    @Override
    public void write(final long bOff, final long[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 8L);
        super.write(bOff, buf, index, length);
    }
    
    @Override
    public void write(final long bOff, final float[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 4L);
        super.write(bOff, buf, index, length);
    }
    
    @Override
    public void write(final long bOff, final double[] buf, final int index, final int length) {
        this.boundsCheck(bOff, length * 8L);
        super.write(bOff, buf, index, length);
    }
    
    @Override
    public byte getByte(final long offset) {
        this.boundsCheck(offset, 1L);
        return super.getByte(offset);
    }
    
    @Override
    public char getChar(final long offset) {
        this.boundsCheck(offset, 1L);
        return super.getChar(offset);
    }
    
    @Override
    public short getShort(final long offset) {
        this.boundsCheck(offset, 2L);
        return super.getShort(offset);
    }
    
    @Override
    public int getInt(final long offset) {
        this.boundsCheck(offset, 4L);
        return super.getInt(offset);
    }
    
    @Override
    public long getLong(final long offset) {
        this.boundsCheck(offset, 8L);
        return super.getLong(offset);
    }
    
    @Override
    public float getFloat(final long offset) {
        this.boundsCheck(offset, 4L);
        return super.getFloat(offset);
    }
    
    @Override
    public double getDouble(final long offset) {
        this.boundsCheck(offset, 8L);
        return super.getDouble(offset);
    }
    
    @Override
    public Pointer getPointer(final long offset) {
        this.boundsCheck(offset, Pointer.SIZE);
        return super.getPointer(offset);
    }
    
    @Override
    public ByteBuffer getByteBuffer(final long offset, final long length) {
        this.boundsCheck(offset, length);
        final ByteBuffer byteBuffer = super.getByteBuffer(offset, length);
        Memory.buffers.put(byteBuffer, this);
        return byteBuffer;
    }
    
    @Override
    public String getString(final long offset, final String encoding) {
        this.boundsCheck(offset, 0L);
        return super.getString(offset, encoding);
    }
    
    @Override
    public String getWideString(final long offset) {
        this.boundsCheck(offset, 0L);
        return super.getWideString(offset);
    }
    
    @Override
    public void setByte(final long offset, final byte value) {
        this.boundsCheck(offset, 1L);
        super.setByte(offset, value);
    }
    
    @Override
    public void setChar(final long offset, final char value) {
        this.boundsCheck(offset, Native.WCHAR_SIZE);
        super.setChar(offset, value);
    }
    
    @Override
    public void setShort(final long offset, final short value) {
        this.boundsCheck(offset, 2L);
        super.setShort(offset, value);
    }
    
    @Override
    public void setInt(final long offset, final int value) {
        this.boundsCheck(offset, 4L);
        super.setInt(offset, value);
    }
    
    @Override
    public void setLong(final long offset, final long value) {
        this.boundsCheck(offset, 8L);
        super.setLong(offset, value);
    }
    
    @Override
    public void setFloat(final long offset, final float value) {
        this.boundsCheck(offset, 4L);
        super.setFloat(offset, value);
    }
    
    @Override
    public void setDouble(final long offset, final double value) {
        this.boundsCheck(offset, 8L);
        super.setDouble(offset, value);
    }
    
    @Override
    public void setPointer(final long offset, final Pointer value) {
        this.boundsCheck(offset, Pointer.SIZE);
        super.setPointer(offset, value);
    }
    
    @Override
    public void setString(final long offset, final String value, final String encoding) {
        this.boundsCheck(offset, Native.getBytes(value, encoding).length + 1L);
        super.setString(offset, value, encoding);
    }
    
    @Override
    public void setWideString(final long offset, final String value) {
        this.boundsCheck(offset, (value.length() + 1L) * Native.WCHAR_SIZE);
        super.setWideString(offset, value);
    }
    
    @Override
    public String toString() {
        return "allocated@0x" + Long.toHexString(this.peer) + " (" + this.size + " bytes)";
    }
    
    public static void free(final long p) {
        if (p != 0L) {
            Native.free(p);
        }
    }
    
    public static long malloc(final long size) {
        return Native.malloc(size);
    }
    
    public String dump() {
        return this.dump(0L, (int)this.size());
    }
    
    static {
        allocatedMemory = Collections.synchronizedMap(new WeakHashMap<Memory, Reference<Memory>>());
        buffers = new WeakMemoryHolder();
    }
}

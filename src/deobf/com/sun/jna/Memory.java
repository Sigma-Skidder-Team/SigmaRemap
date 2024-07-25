package com.sun.jna;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;

public class Memory extends Pointer {
   private static final Map<Memory, Reference<Memory>> allocatedMemory = Collections.<Memory, Reference<Memory>>synchronizedMap(
      new WeakHashMap<Memory, Reference<Memory>>()
   );
   private static final WeakMemoryHolder buffers = new WeakMemoryHolder();
   public long size;

   public static void purge() {
      buffers.clean();
   }

   public static void disposeAll() {
      for (Memory var4 : new LinkedList<Memory>(allocatedMemory.keySet())) {
         var4.dispose();
      }
   }

   public Memory(long size) {
      this.size = size;
      if (size <= 0L) {
         throw new IllegalArgumentException("Allocation size must be greater than zero");
      } else {
         this.peer = malloc(size);
         if (this.peer == 0L) {
            throw new OutOfMemoryError("Cannot allocate " + size + " bytes");
         } else {
            allocatedMemory.put(this, new WeakReference<Memory>(this));
         }
      }
   }

   public Memory() {
   }

   @Override
   public Pointer share(long offset) {
      return this.share(offset, this.size() - offset);
   }

   @Override
   public Pointer share(long offset, long sz) {
      this.boundsCheck(offset, sz);
      return new Memory$class_15(this, offset, sz);
   }

   public Memory align(int byteBoundary) {
      if (byteBoundary <= 0) {
         throw new IllegalArgumentException("Byte boundary must be positive: " + byteBoundary);
      } else {
         for (int mask = 0; mask < 32; mask++) {
            if (byteBoundary == 1 << mask) {
               long var5 = ~((long)byteBoundary - 1L);
               if ((this.peer & var5) != this.peer) {
                  long var7 = this.peer + (long)byteBoundary - 1L & var5;
                  long var9 = this.peer + this.size - var7;
                  if (var9 <= 0L) {
                     throw new IllegalArgumentException("Insufficient memory to align to the requested boundary");
                  }

                  return (Memory)this.share(var7 - this.peer, var9);
               }

               return this;
            }
         }

         throw new IllegalArgumentException("Byte boundary must be a power of two");
      }
   }

   @Override
   public void finalize() {
      this.dispose();
   }

   public synchronized void dispose() {
      try {
         free(this.peer);
      } finally {
         allocatedMemory.remove(this);
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

   public void boundsCheck(long off, long sz) {
      if (off < 0L) {
         throw new IndexOutOfBoundsException("Invalid offset: " + off);
      } else if (off + sz > this.size) {
         String var7 = "Bounds exceeds available space : size=" + this.size + ", offset=" + (off + sz);
         throw new IndexOutOfBoundsException(var7);
      }
   }

   @Override
   public void read(long bOff, byte[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 1L);
      super.read(bOff, buf, index, length);
   }

   @Override
   public void read(long bOff, short[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 2L);
      super.read(bOff, buf, index, length);
   }

   @Override
   public void read(long bOff, char[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 2L);
      super.read(bOff, buf, index, length);
   }

   @Override
   public void read(long bOff, int[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 4L);
      super.read(bOff, buf, index, length);
   }

   @Override
   public void read(long bOff, long[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 8L);
      super.read(bOff, buf, index, length);
   }

   @Override
   public void read(long bOff, float[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 4L);
      super.read(bOff, buf, index, length);
   }

   @Override
   public void read(long bOff, double[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 8L);
      super.read(bOff, buf, index, length);
   }

   @Override
   public void write(long bOff, byte[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 1L);
      super.write(bOff, buf, index, length);
   }

   @Override
   public void write(long bOff, short[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 2L);
      super.write(bOff, buf, index, length);
   }

   @Override
   public void write(long bOff, char[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 2L);
      super.write(bOff, buf, index, length);
   }

   @Override
   public void write(long bOff, int[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 4L);
      super.write(bOff, buf, index, length);
   }

   @Override
   public void write(long bOff, long[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 8L);
      super.write(bOff, buf, index, length);
   }

   @Override
   public void write(long bOff, float[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 4L);
      super.write(bOff, buf, index, length);
   }

   @Override
   public void write(long bOff, double[] buf, int index, int length) {
      this.boundsCheck(bOff, (long)length * 8L);
      super.write(bOff, buf, index, length);
   }

   @Override
   public byte getByte(long offset) {
      this.boundsCheck(offset, 1L);
      return super.getByte(offset);
   }

   @Override
   public char getChar(long offset) {
      this.boundsCheck(offset, 1L);
      return super.getChar(offset);
   }

   @Override
   public short getShort(long offset) {
      this.boundsCheck(offset, 2L);
      return super.getShort(offset);
   }

   @Override
   public int getInt(long offset) {
      this.boundsCheck(offset, 4L);
      return super.getInt(offset);
   }

   @Override
   public long getLong(long offset) {
      this.boundsCheck(offset, 8L);
      return super.getLong(offset);
   }

   @Override
   public float getFloat(long offset) {
      this.boundsCheck(offset, 4L);
      return super.getFloat(offset);
   }

   @Override
   public double getDouble(long offset) {
      this.boundsCheck(offset, 8L);
      return super.getDouble(offset);
   }

   @Override
   public Pointer getPointer(long offset) {
      this.boundsCheck(offset, (long)Pointer.SIZE);
      return super.getPointer(offset);
   }

   @Override
   public ByteBuffer getByteBuffer(long offset, long length) {
      this.boundsCheck(offset, length);
      ByteBuffer var7 = super.getByteBuffer(offset, length);
      buffers.put(var7, this);
      return var7;
   }

   @Override
   public String getString(long offset, String encoding) {
      this.boundsCheck(offset, 0L);
      return super.getString(offset, encoding);
   }

   @Override
   public String getWideString(long offset) {
      this.boundsCheck(offset, 0L);
      return super.getWideString(offset);
   }

   @Override
   public void setByte(long offset, byte value) {
      this.boundsCheck(offset, 1L);
      super.setByte(offset, value);
   }

   @Override
   public void setChar(long offset, char value) {
      this.boundsCheck(offset, (long)Native.WCHAR_SIZE);
      super.setChar(offset, value);
   }

   @Override
   public void setShort(long offset, short value) {
      this.boundsCheck(offset, 2L);
      super.setShort(offset, value);
   }

   @Override
   public void setInt(long offset, int value) {
      this.boundsCheck(offset, 4L);
      super.setInt(offset, value);
   }

   @Override
   public void setLong(long offset, long value) {
      this.boundsCheck(offset, 8L);
      super.setLong(offset, value);
   }

   @Override
   public void setFloat(long offset, float value) {
      this.boundsCheck(offset, 4L);
      super.setFloat(offset, value);
   }

   @Override
   public void setDouble(long offset, double value) {
      this.boundsCheck(offset, 8L);
      super.setDouble(offset, value);
   }

   @Override
   public void setPointer(long offset, Pointer value) {
      this.boundsCheck(offset, (long)Pointer.SIZE);
      super.setPointer(offset, value);
   }

   @Override
   public void setString(long offset, String value, String encoding) {
      this.boundsCheck(offset, (long)Native.getBytes(value, encoding).length + 1L);
      super.setString(offset, value, encoding);
   }

   @Override
   public void setWideString(long offset, String value) {
      this.boundsCheck(offset, ((long)value.length() + 1L) * (long)Native.WCHAR_SIZE);
      super.setWideString(offset, value);
   }

   @Override
   public String toString() {
      return "allocated@0x" + Long.toHexString(this.peer) + " (" + this.size + " bytes)";
   }

   public static void free(long p) {
      if (p != 0L) {
         Native.free(p);
      }
   }

   public static long malloc(long size) {
      return Native.malloc(size);
   }

   public String dump() {
      return this.dump(0L, (int)this.size());
   }
}

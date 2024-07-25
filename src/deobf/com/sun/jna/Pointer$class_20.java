package com.sun.jna;

import java.nio.ByteBuffer;

public class Pointer$class_20 extends Pointer {
   private final String MSG = "This pointer is opaque: " + this;

   private Pointer$class_20(long peer) {
      super(peer);
   }

   @Override
   public Pointer share(long offset, long size) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void clear(long size) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public long indexOf(long offset, byte value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void read(long bOff, byte[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void read(long bOff, char[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void read(long bOff, short[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void read(long bOff, int[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void read(long bOff, long[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void read(long bOff, float[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void read(long bOff, double[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void read(long bOff, Pointer[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void write(long bOff, byte[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void write(long bOff, char[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void write(long bOff, short[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void write(long bOff, int[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void write(long bOff, long[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void write(long bOff, float[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void write(long bOff, double[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void write(long bOff, Pointer[] buf, int index, int length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public ByteBuffer getByteBuffer(long offset, long length) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public byte getByte(long bOff) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public char getChar(long bOff) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public short getShort(long bOff) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public int getInt(long bOff) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public long getLong(long bOff) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public float getFloat(long bOff) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public double getDouble(long bOff) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public Pointer getPointer(long bOff) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public String getString(long bOff, String encoding) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public String getWideString(long bOff) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setByte(long bOff, byte value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setChar(long bOff, char value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setShort(long bOff, short value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setInt(long bOff, int value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setLong(long bOff, long value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setFloat(long bOff, float value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setDouble(long bOff, double value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setPointer(long offset, Pointer value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setString(long offset, String value, String encoding) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setWideString(long offset, String value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public void setMemory(long offset, long size, byte value) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public String dump(long offset, int size) {
      throw new UnsupportedOperationException(this.MSG);
   }

   @Override
   public String toString() {
      return "const@0x" + Long.toHexString(this.peer);
   }
}

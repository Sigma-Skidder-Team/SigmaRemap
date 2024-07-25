package com.sun.jna;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class Pointer {
   public static final int SIZE;
   public static final Pointer NULL;
   public long peer;

   public static final Pointer createConstant(long peer) {
      return new Pointer$class_20(peer, null);
   }

   public static final Pointer createConstant(int peer) {
      return new Pointer$class_20((long)peer & -1L, null);
   }

   public Pointer() {
   }

   public Pointer(long peer) {
      this.peer = peer;
   }

   public Pointer share(long offset) {
      return this.share(offset, 0L);
   }

   public Pointer share(long offset, long sz) {
      return offset == 0L ? this : new Pointer(this.peer + offset);
   }

   public void clear(long size) {
      this.setMemory(0L, size, (byte)0);
   }

   @Override
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else {
         return o == null ? false : o instanceof Pointer && ((Pointer)o).peer == this.peer;
      }
   }

   @Override
   public int hashCode() {
      return (int)((this.peer >>> 32) + (this.peer & -1L));
   }

   public long indexOf(long offset, byte value) {
      return Native.indexOf(this, this.peer, offset, value);
   }

   public void read(long offset, byte[] buf, int index, int length) {
      Native.read(this, this.peer, offset, buf, index, length);
   }

   public void read(long offset, short[] buf, int index, int length) {
      Native.read(this, this.peer, offset, buf, index, length);
   }

   public void read(long offset, char[] buf, int index, int length) {
      Native.read(this, this.peer, offset, buf, index, length);
   }

   public void read(long offset, int[] buf, int index, int length) {
      Native.read(this, this.peer, offset, buf, index, length);
   }

   public void read(long offset, long[] buf, int index, int length) {
      Native.read(this, this.peer, offset, buf, index, length);
   }

   public void read(long offset, float[] buf, int index, int length) {
      Native.read(this, this.peer, offset, buf, index, length);
   }

   public void read(long offset, double[] buf, int index, int length) {
      Native.read(this, this.peer, offset, buf, index, length);
   }

   public void read(long offset, Pointer[] buf, int index, int length) {
      for (int p = 0; p < length; p++) {
         Pointer oldp = this.getPointer(offset + (long)(p * SIZE));
         Pointer var10 = buf[p + index];
         if (var10 == null || oldp == null || oldp.peer != var10.peer) {
            buf[p + index] = oldp;
         }
      }
   }

   public void write(long offset, byte[] buf, int index, int length) {
      Native.write(this, this.peer, offset, buf, index, length);
   }

   public void write(long offset, short[] buf, int index, int length) {
      Native.write(this, this.peer, offset, buf, index, length);
   }

   public void write(long offset, char[] buf, int index, int length) {
      Native.write(this, this.peer, offset, buf, index, length);
   }

   public void write(long offset, int[] buf, int index, int length) {
      Native.write(this, this.peer, offset, buf, index, length);
   }

   public void write(long offset, long[] buf, int index, int length) {
      Native.write(this, this.peer, offset, buf, index, length);
   }

   public void write(long offset, float[] buf, int index, int length) {
      Native.write(this, this.peer, offset, buf, index, length);
   }

   public void write(long offset, double[] buf, int index, int length) {
      Native.write(this, this.peer, offset, buf, index, length);
   }

   public void write(long bOff, Pointer[] buf, int index, int length) {
      for (int var8 = 0; var8 < length; var8++) {
         this.setPointer(bOff + (long)(var8 * SIZE), buf[index + var8]);
      }
   }

   public Object getValue(long offset, Class<?> type, Object currentValue) {
      Object nm = null;
      if (Structure.class.isAssignableFrom(type)) {
         Structure var16 = (Structure)currentValue;
         if (Structure$class_22.class.isAssignableFrom(type)) {
            var16 = Structure.updateStructureByReference(type, var16, this.getPointer(offset));
         } else {
            var16.useMemory(this, (int)offset, true);
            var16.read();
         }

         nm = var16;
      } else if (type == boolean.class || type == Boolean.class) {
         nm = Function.valueOf(this.getInt(offset) != 0);
      } else if (type == byte.class || type == Byte.class) {
         nm = this.getByte(offset);
      } else if (type == short.class || type == Short.class) {
         nm = this.getShort(offset);
      } else if (type == char.class || type == Character.class) {
         nm = this.getChar(offset);
      } else if (type == int.class || type == Integer.class) {
         nm = this.getInt(offset);
      } else if (type == long.class || type == Long.class) {
         nm = this.getLong(offset);
      } else if (type == float.class || type == Float.class) {
         nm = this.getFloat(offset);
      } else if (type == double.class || type == Double.class) {
         nm = this.getDouble(offset);
      } else if (Pointer.class.isAssignableFrom(type)) {
         Pointer var15 = this.getPointer(offset);
         if (var15 != null) {
            Pointer var20 = currentValue instanceof Pointer ? (Pointer)currentValue : null;
            if (var20 != null && var15.peer == var20.peer) {
               nm = var20;
            } else {
               nm = var15;
            }
         }
      } else if (type == String.class) {
         Pointer var14 = this.getPointer(offset);
         nm = var14 != null ? var14.getString(0L) : null;
      } else if (type == WString.class) {
         Pointer var13 = this.getPointer(offset);
         nm = var13 != null ? new WString(var13.getWideString(0L)) : null;
      } else if (Callback.class.isAssignableFrom(type)) {
         Pointer var12 = this.getPointer(offset);
         if (var12 == null) {
            nm = null;
         } else {
            Callback var19 = (Callback)currentValue;
            Pointer var21 = CallbackReference.getFunctionPointer(var19);
            if (!var12.equals(var21)) {
               var19 = CallbackReference.getCallback(type, var12);
            }

            nm = var19;
         }
      } else if (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(type)) {
         Pointer var11 = this.getPointer(offset);
         if (var11 == null) {
            nm = null;
         } else {
            Pointer var18 = currentValue == null ? null : Native.getDirectBufferPointer((Buffer)currentValue);
            if (var18 == null || !var18.equals(var11)) {
               throw new IllegalStateException("Can't autogenerate a direct buffer on memory read");
            }

            nm = currentValue;
         }
      } else if (NativeMapped.class.isAssignableFrom(type)) {
         NativeMapped tc = (NativeMapped)currentValue;
         if (tc != null) {
            Object value = this.getValue(offset, tc.nativeType(), null);
            nm = tc.fromNative(value, new FromNativeContext(type));
            if (tc.equals(nm)) {
               nm = tc;
            }
         } else {
            NativeMappedConverter var17 = NativeMappedConverter.getInstance(type);
            Object var10 = this.getValue(offset, var17.nativeType(), null);
            nm = var17.fromNative(var10, new FromNativeContext(type));
         }
      } else {
         if (!type.isArray()) {
            throw new IllegalArgumentException("Reading \"" + type + "\" from memory is not supported");
         }

         nm = currentValue;
         if (currentValue == null) {
            throw new IllegalStateException("Need an initialized array");
         }

         this.readArray(offset, currentValue, type.getComponentType());
      }

      return nm;
   }

   private void readArray(long offset, Object o, Class<?> cls) {
      int result = 0;
      result = Array.getLength(o);
      if (cls == byte.class) {
         this.read(offset, (byte[])o, 0, result);
      } else if (cls == short.class) {
         this.read(offset, (short[])o, 0, result);
      } else if (cls == char.class) {
         this.read(offset, (char[])o, 0, result);
      } else if (cls == int.class) {
         this.read(offset, (int[])o, 0, result);
      } else if (cls == long.class) {
         this.read(offset, (long[])o, 0, result);
      } else if (cls == float.class) {
         this.read(offset, (float[])o, 0, result);
      } else if (cls == double.class) {
         this.read(offset, (double[])o, 0, result);
      } else if (Pointer.class.isAssignableFrom(cls)) {
         this.read(offset, (Pointer[])o, 0, result);
      } else if (Structure.class.isAssignableFrom(cls)) {
         Structure[] tc = (Structure[])o;
         if (Structure$class_22.class.isAssignableFrom(cls)) {
            Pointer[] size = this.getPointerArray(offset, tc.length);

            for (int i = 0; i < tc.length; i++) {
               tc[i] = Structure.updateStructureByReference(cls, tc[i], size[i]);
            }
         } else {
            Structure var16 = tc[0];
            if (var16 == null) {
               var16 = Structure.newInstance(cls, this.share(offset));
               var16.conditionalAutoRead();
               tc[0] = var16;
            } else {
               var16.useMemory(this, (int)offset, true);
               var16.read();
            }

            Structure[] var18 = var16.toArray(tc.length);

            for (int value = 1; value < tc.length; value++) {
               if (tc[value] == null) {
                  tc[value] = var18[value];
               } else {
                  tc[value].useMemory(this, (int)(offset + (long)(value * tc[value].size())), true);
                  tc[value].read();
               }
            }
         }
      } else {
         if (!NativeMapped.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Reading array of " + cls + " from memory not supported");
         }

         NativeMapped[] var15 = (NativeMapped[])o;
         NativeMappedConverter var17 = NativeMappedConverter.getInstance(cls);
         int var19 = Native.getNativeSize(o.getClass(), o) / var15.length;

         for (int var20 = 0; var20 < var15.length; var20++) {
            Object var13 = this.getValue(offset + (long)(var19 * var20), var17.nativeType(), var15[var20]);
            var15[var20] = (NativeMapped)var17.fromNative(var13, new FromNativeContext(cls));
         }
      }
   }

   public byte getByte(long offset) {
      return Native.getByte(this, this.peer, offset);
   }

   public char getChar(long offset) {
      return Native.getChar(this, this.peer, offset);
   }

   public short getShort(long offset) {
      return Native.getShort(this, this.peer, offset);
   }

   public int getInt(long offset) {
      return Native.getInt(this, this.peer, offset);
   }

   public long getLong(long offset) {
      return Native.getLong(this, this.peer, offset);
   }

   public NativeLong getNativeLong(long offset) {
      return new NativeLong(NativeLong.SIZE == 8 ? this.getLong(offset) : (long)this.getInt(offset));
   }

   public float getFloat(long offset) {
      return Native.getFloat(this, this.peer, offset);
   }

   public double getDouble(long offset) {
      return Native.getDouble(this, this.peer, offset);
   }

   public Pointer getPointer(long offset) {
      return Native.getPointer(this.peer + offset);
   }

   public ByteBuffer getByteBuffer(long offset, long length) {
      return Native.getDirectByteBuffer(this, this.peer, offset, length).order(ByteOrder.nativeOrder());
   }

   @Deprecated
   public String getString(long offset, boolean wide) {
      return wide ? this.getWideString(offset) : this.getString(offset);
   }

   public String getWideString(long offset) {
      return Native.getWideString(this, this.peer, offset);
   }

   public String getString(long offset) {
      return this.getString(offset, Native.getDefaultStringEncoding());
   }

   public String getString(long offset, String encoding) {
      return Native.getString(this, offset, encoding);
   }

   public byte[] getByteArray(long offset, int arraySize) {
      byte[] var6 = new byte[arraySize];
      this.read(offset, var6, 0, arraySize);
      return var6;
   }

   public char[] getCharArray(long offset, int arraySize) {
      char[] var6 = new char[arraySize];
      this.read(offset, var6, 0, arraySize);
      return var6;
   }

   public short[] getShortArray(long offset, int arraySize) {
      short[] var6 = new short[arraySize];
      this.read(offset, var6, 0, arraySize);
      return var6;
   }

   public int[] getIntArray(long offset, int arraySize) {
      int[] var6 = new int[arraySize];
      this.read(offset, var6, 0, arraySize);
      return var6;
   }

   public long[] getLongArray(long offset, int arraySize) {
      long[] var6 = new long[arraySize];
      this.read(offset, var6, 0, arraySize);
      return var6;
   }

   public float[] getFloatArray(long offset, int arraySize) {
      float[] var6 = new float[arraySize];
      this.read(offset, var6, 0, arraySize);
      return var6;
   }

   public double[] getDoubleArray(long offset, int arraySize) {
      double[] var6 = new double[arraySize];
      this.read(offset, var6, 0, arraySize);
      return var6;
   }

   public Pointer[] getPointerArray(long offset) {
      ArrayList addOffset = new ArrayList();
      int p = 0;

      for (Pointer var7 = this.getPointer(offset); var7 != null; var7 = this.getPointer(offset + (long)p)) {
         addOffset.add(var7);
         p += SIZE;
      }

      return addOffset.<Pointer>toArray(new Pointer[addOffset.size()]);
   }

   public Pointer[] getPointerArray(long offset, int arraySize) {
      Pointer[] var6 = new Pointer[arraySize];
      this.read(offset, var6, 0, arraySize);
      return var6;
   }

   public String[] getStringArray(long offset) {
      return this.getStringArray(offset, -1, Native.getDefaultStringEncoding());
   }

   public String[] getStringArray(long offset, String encoding) {
      return this.getStringArray(offset, -1, encoding);
   }

   public String[] getStringArray(long offset, int length) {
      return this.getStringArray(offset, length, Native.getDefaultStringEncoding());
   }

   @Deprecated
   public String[] getStringArray(long offset, boolean wide) {
      return this.getStringArray(offset, -1, wide);
   }

   public String[] getWideStringArray(long offset) {
      return this.getWideStringArray(offset, -1);
   }

   public String[] getWideStringArray(long offset, int length) {
      return this.getStringArray(offset, length, "--WIDE-STRING--");
   }

   @Deprecated
   public String[] getStringArray(long offset, int length, boolean wide) {
      return this.getStringArray(offset, length, wide ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
   }

   public String[] getStringArray(long offset, int length, String encoding) {
      ArrayList addOffset = new ArrayList();
      int p = 0;
      Pointer s;
      if (length != -1) {
         s = this.getPointer(offset + (long)p);
         int var13 = 0;

         while (var13++ < length) {
            String var11 = s == null ? null : ("--WIDE-STRING--".equals(encoding) ? s.getWideString(0L) : s.getString(0L, encoding));
            addOffset.add(var11);
            if (var13 < length) {
               p += SIZE;
               s = this.getPointer(offset + (long)p);
            }
         }
      } else {
         while ((s = this.getPointer(offset + (long)p)) != null) {
            String sx = s == null ? null : ("--WIDE-STRING--".equals(encoding) ? s.getWideString(0L) : s.getString(0L, encoding));
            addOffset.add(sx);
            p += SIZE;
         }
      }

      return addOffset.<String>toArray(new String[addOffset.size()]);
   }

   public void setValue(long offset, Object value, Class<?> type) {
      if (type == boolean.class || type == Boolean.class) {
         this.setInt(offset, Boolean.TRUE.equals(value) ? -1 : 0);
      } else if (type != byte.class && type != Byte.class) {
         if (type != short.class && type != Short.class) {
            if (type != char.class && type != Character.class) {
               if (type != int.class && type != Integer.class) {
                  if (type != long.class && type != Long.class) {
                     if (type != float.class && type != Float.class) {
                        if (type != double.class && type != Double.class) {
                           if (type == Pointer.class) {
                              this.setPointer(offset, (Pointer)value);
                           } else if (type == String.class) {
                              this.setPointer(offset, (Pointer)value);
                           } else if (type == WString.class) {
                              this.setPointer(offset, (Pointer)value);
                           } else if (Structure.class.isAssignableFrom(type)) {
                              Structure nativeType = (Structure)value;
                              if (Structure$class_22.class.isAssignableFrom(type)) {
                                 this.setPointer(offset, nativeType == null ? null : nativeType.getPointer());
                                 if (nativeType != null) {
                                    nativeType.autoWrite();
                                 }
                              } else {
                                 nativeType.useMemory(this, (int)offset, true);
                                 nativeType.write();
                              }
                           } else if (Callback.class.isAssignableFrom(type)) {
                              this.setPointer(offset, CallbackReference.getFunctionPointer((Callback)value));
                           } else if (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(type)) {
                              Pointer var10 = value == null ? null : Native.getDirectBufferPointer((Buffer)value);
                              this.setPointer(offset, var10);
                           } else if (NativeMapped.class.isAssignableFrom(type)) {
                              NativeMappedConverter var9 = NativeMappedConverter.getInstance(type);
                              Class var8 = var9.nativeType();
                              this.setValue(offset, var9.toNative(value, new ToNativeContext()), var8);
                           } else {
                              if (!type.isArray()) {
                                 throw new IllegalArgumentException("Writing " + type + " to memory is not supported");
                              }

                              this.writeArray(offset, value, type.getComponentType());
                           }
                        } else {
                           this.setDouble(offset, value == null ? 0.0 : (Double)value);
                        }
                     } else {
                        this.setFloat(offset, value == null ? 0.0F : (Float)value);
                     }
                  } else {
                     this.setLong(offset, value == null ? 0L : (Long)value);
                  }
               } else {
                  this.setInt(offset, value == null ? 0 : (Integer)value);
               }
            } else {
               this.setChar(offset, value == null ? '\u0000' : (Character)value);
            }
         } else {
            this.setShort(offset, value == null ? 0 : (Short)value);
         }
      } else {
         this.setByte(offset, value == null ? 0 : (Byte)value);
      }
   }

   private void writeArray(long offset, Object value, Class<?> cls) {
      if (cls == byte.class) {
         byte[] tc = (byte[])value;
         this.write(offset, tc, 0, tc.length);
      } else if (cls == short.class) {
         short[] var13 = (short[])value;
         this.write(offset, var13, 0, var13.length);
      } else if (cls == char.class) {
         char[] var14 = (char[])value;
         this.write(offset, var14, 0, var14.length);
      } else if (cls == int.class) {
         int[] var15 = (int[])value;
         this.write(offset, var15, 0, var15.length);
      } else if (cls == long.class) {
         long[] var16 = (long[])value;
         this.write(offset, var16, 0, var16.length);
      } else if (cls == float.class) {
         float[] var17 = (float[])value;
         this.write(offset, var17, 0, var17.length);
      } else if (cls == double.class) {
         double[] var18 = (double[])value;
         this.write(offset, var18, 0, var18.length);
      } else if (Pointer.class.isAssignableFrom(cls)) {
         Pointer[] var19 = (Pointer[])value;
         this.write(offset, var19, 0, var19.length);
      } else if (Structure.class.isAssignableFrom(cls)) {
         Structure[] var20 = (Structure[])value;
         if (Structure$class_22.class.isAssignableFrom(cls)) {
            Pointer[] nativeType = new Pointer[var20.length];

            for (int size = 0; size < var20.length; size++) {
               if (var20[size] == null) {
                  nativeType[size] = null;
               } else {
                  nativeType[size] = var20[size].getPointer();
                  var20[size].write();
               }
            }

            this.write(offset, nativeType, 0, nativeType.length);
         } else {
            Structure var22 = var20[0];
            if (var22 == null) {
               var22 = Structure.newInstance(cls, this.share(offset));
               var20[0] = var22;
            } else {
               var22.useMemory(this, (int)offset, true);
            }

            var22.write();
            Structure[] var24 = var22.toArray(var20.length);

            for (int i = 1; i < var20.length; i++) {
               if (var20[i] == null) {
                  var20[i] = var24[i];
               } else {
                  var20[i].useMemory(this, (int)(offset + (long)(i * var20[i].size())), true);
               }

               var20[i].write();
            }
         }
      } else {
         if (!NativeMapped.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Writing array of " + cls + " to memory not supported");
         }

         NativeMapped[] var21 = (NativeMapped[])value;
         NativeMappedConverter var23 = NativeMappedConverter.getInstance(cls);
         Class var25 = var23.nativeType();
         int var26 = Native.getNativeSize(value.getClass(), value) / var21.length;

         for (int element = 0; element < var21.length; element++) {
            Object var12 = var23.toNative(var21[element], new ToNativeContext());
            this.setValue(offset + (long)(element * var26), var12, var25);
         }
      }
   }

   public void setMemory(long offset, long length, byte value) {
      Native.setMemory(this, this.peer, offset, length, value);
   }

   public void setByte(long offset, byte value) {
      Native.setByte(this, this.peer, offset, value);
   }

   public void setShort(long offset, short value) {
      Native.setShort(this, this.peer, offset, value);
   }

   public void setChar(long offset, char value) {
      Native.setChar(this, this.peer, offset, value);
   }

   public void setInt(long offset, int value) {
      Native.setInt(this, this.peer, offset, value);
   }

   public void setLong(long offset, long value) {
      Native.setLong(this, this.peer, offset, value);
   }

   public void setNativeLong(long offset, NativeLong value) {
      if (NativeLong.SIZE == 8) {
         this.setLong(offset, value.longValue());
      } else {
         this.setInt(offset, value.intValue());
      }
   }

   public void setFloat(long offset, float value) {
      Native.setFloat(this, this.peer, offset, value);
   }

   public void setDouble(long offset, double value) {
      Native.setDouble(this, this.peer, offset, value);
   }

   public void setPointer(long offset, Pointer value) {
      Native.setPointer(this, this.peer, offset, value != null ? value.peer : 0L);
   }

   @Deprecated
   public void setString(long offset, String value, boolean wide) {
      if (wide) {
         this.setWideString(offset, value);
      } else {
         this.setString(offset, value);
      }
   }

   public void setWideString(long offset, String value) {
      Native.setWideString(this, this.peer, offset, value);
   }

   public void setString(long offset, WString value) {
      this.setWideString(offset, value == null ? null : value.toString());
   }

   public void setString(long offset, String value) {
      this.setString(offset, value, Native.getDefaultStringEncoding());
   }

   public void setString(long offset, String value, String encoding) {
      byte[] var7 = Native.getBytes(value, encoding);
      this.write(offset, var7, 0, var7.length);
      this.setByte(offset + (long)var7.length, (byte)0);
   }

   public String dump(long offset, int size) {
      byte TITLE = 4;
      String sw = "memory dump";
      StringWriter out = new StringWriter("memory dump".length() + 2 + size * 2 + size / 4 * 4);
      PrintWriter i = new PrintWriter(out);
      i.println("memory dump");

      for (int b = 0; b < size; b++) {
         byte var11 = this.getByte(offset + (long)b);
         if (b % 4 == 0) {
            i.print("[");
         }

         if (var11 >= 0 && var11 < 16) {
            i.print("0");
         }

         i.print(Integer.toHexString(var11 & 255));
         if (b % 4 == 3 && b < size - 1) {
            i.println("]");
         }
      }

      if (out.getBuffer().charAt(out.getBuffer().length() - 2) != ']') {
         i.println("]");
      }

      return out.toString();
   }

   @Override
   public String toString() {
      return "native@0x" + Long.toHexString(this.peer);
   }

   public static long nativeValue(Pointer p) {
      return p == null ? 0L : p.peer;
   }

   public static void nativeValue(Pointer p, long value) {
      p.peer = value;
   }

   static {
      if ((SIZE = Native.POINTER_SIZE) == 0) {
         throw new Error("Native library not initialized");
      } else {
         NULL = null;
      }
   }
}

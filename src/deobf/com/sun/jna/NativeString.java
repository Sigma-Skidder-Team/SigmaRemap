package com.sun.jna;

import java.nio.CharBuffer;

public class NativeString implements CharSequence, Comparable {
   public static final String WIDE_STRING = "--WIDE-STRING--";
   private Pointer pointer;
   private String encoding;

   public NativeString(String string) {
      this(string, Native.getDefaultStringEncoding());
   }

   public NativeString(String string, boolean wide) {
      this(string, wide ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
   }

   public NativeString(WString string) {
      this(string.toString(), "--WIDE-STRING--");
   }

   public NativeString(String string, String encoding) {
      if (string == null) {
         throw new NullPointerException("String must not be null");
      } else {
         this.encoding = encoding;
         if ("--WIDE-STRING--".equals(this.encoding)) {
            int var5 = (string.length() + 1) * Native.WCHAR_SIZE;
            this.pointer = new NativeString$class_19(this, (long)var5);
            this.pointer.setWideString(0L, string);
         } else {
            byte[] var6 = Native.getBytes(string, encoding);
            this.pointer = new NativeString$class_19(this, (long)(var6.length + 1));
            this.pointer.write(0L, var6, 0, var6.length);
            this.pointer.setByte((long)var6.length, (byte)0);
         }
      }
   }

   @Override
   public int hashCode() {
      return this.toString().hashCode();
   }

   @Override
   public boolean equals(Object other) {
      return other instanceof CharSequence ? this.compareTo(other) == 0 : false;
   }

   @Override
   public String toString() {
      boolean s = "--WIDE-STRING--".equals(this.encoding);
      String var4 = s ? "const wchar_t*" : "const char*";
      return var4 + "(" + (s ? this.pointer.getWideString(0L) : this.pointer.getString(0L, this.encoding)) + ")";
   }

   public Pointer getPointer() {
      return this.pointer;
   }

   @Override
   public char charAt(int index) {
      return this.toString().charAt(index);
   }

   @Override
   public int length() {
      return this.toString().length();
   }

   @Override
   public CharSequence subSequence(int start, int end) {
      return CharBuffer.wrap(this.toString()).subSequence(start, end);
   }

   @Override
   public int compareTo(Object other) {
      return other == null ? 1 : this.toString().compareTo(other.toString());
   }
}

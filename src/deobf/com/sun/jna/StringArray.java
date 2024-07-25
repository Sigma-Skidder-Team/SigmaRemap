package com.sun.jna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArray extends Memory implements Function$class_12 {
   private String encoding;
   private List<NativeString> natives = new ArrayList<NativeString>();
   private Object[] original;

   public StringArray(String[] strings) {
      this(strings, false);
   }

   public StringArray(String[] strings, boolean wide) {
      this(strings, wide ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
   }

   public StringArray(String[] strings, String encoding) {
      this(strings, encoding);
   }

   public StringArray(WString[] strings) {
      this(strings, "--WIDE-STRING--");
   }

   private StringArray(Object[] strings, String encoding) {
      super((long)((strings.length + 1) * Pointer.SIZE));
      this.original = strings;
      this.encoding = encoding;

      for (int p = 0; p < strings.length; p++) {
         Pointer ns = null;
         if (strings[p] != null) {
            NativeString var7 = new NativeString(strings[p].toString(), encoding);
            this.natives.add(var7);
            ns = var7.getPointer();
         }

         this.setPointer((long)(Pointer.SIZE * p), ns);
      }

      this.setPointer((long)(Pointer.SIZE * strings.length), null);
   }

   @Override
   public void read() {
      boolean wide = this.original instanceof WString[];
      boolean si = "--WIDE-STRING--".equals(this.encoding);

      for (int p = 0; p < this.original.length; p++) {
         Pointer s = this.getPointer((long)(p * Pointer.SIZE));
         Object var7 = null;
         if (s != null) {
            var7 = si ? s.getWideString(0L) : s.getString(0L, this.encoding);
            if (wide) {
               var7 = new WString((String)var7);
            }
         }

         this.original[p] = var7;
      }
   }

   @Override
   public String toString() {
      boolean s = "--WIDE-STRING--".equals(this.encoding);
      Object var4 = s ? "const wchar_t*[]" : "const char*[]";
      return var4 + Arrays.<Object>asList(this.original);
   }
}

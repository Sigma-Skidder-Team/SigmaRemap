package com.sun.jna.win32;

import com.sun.jna.DefaultTypeMapper;
import com.sun.jna.TypeMapper;

public class W32APITypeMapper extends DefaultTypeMapper {
   public static final TypeMapper UNICODE = new W32APITypeMapper(true);
   public static final TypeMapper ASCII = new W32APITypeMapper(false);
   public static final TypeMapper DEFAULT = Boolean.getBoolean("w32.ascii") ? ASCII : UNICODE;

   public W32APITypeMapper(boolean unicode) {
      if (unicode) {
         W32APITypeMapper$1 var4 = new W32APITypeMapper$1(this);
         this.addTypeConverter(String.class, var4);
         this.addToNativeConverter(String[].class, var4);
      }

      W32APITypeMapper$2 var5 = new W32APITypeMapper$2(this);
      this.addTypeConverter(Boolean.class, var5);
   }
}

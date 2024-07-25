package com.sun.jna.win32;

import com.sun.jna.FromNativeContext;
import com.sun.jna.StringArray;
import com.sun.jna.ToNativeContext;
import com.sun.jna.TypeConverter;
import com.sun.jna.WString;

public class W32APITypeMapper$1 implements TypeConverter {
   public W32APITypeMapper$1(W32APITypeMapper this$0) {
      this.this$0 = this$0;
   }

   @Override
   public Object toNative(Object value, ToNativeContext context) {
      if (value == null) {
         return null;
      } else {
         return value instanceof String[] ? new StringArray((String[])value, true) : new WString(value.toString());
      }
   }

   @Override
   public Object fromNative(Object value, FromNativeContext context) {
      return value == null ? null : value.toString();
   }

   @Override
   public Class<?> nativeType() {
      return WString.class;
   }
}

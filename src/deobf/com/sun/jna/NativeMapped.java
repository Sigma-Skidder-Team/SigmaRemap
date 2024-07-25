package com.sun.jna;

public interface NativeMapped {
   Object fromNative(Object var1, FromNativeContext var2);

   Object toNative();

   Class<?> nativeType();
}

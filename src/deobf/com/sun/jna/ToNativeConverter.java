package com.sun.jna;

public interface ToNativeConverter {
   Object toNative(Object var1, ToNativeContext var2);

   Class<?> nativeType();
}

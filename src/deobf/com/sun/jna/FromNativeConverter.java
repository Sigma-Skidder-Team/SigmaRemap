package com.sun.jna;

public interface FromNativeConverter {
   Object fromNative(Object var1, FromNativeContext var2);

   Class<?> nativeType();
}

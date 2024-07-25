package com.sun.jna;

public interface TypeMapper {
   FromNativeConverter getFromNativeConverter(Class<?> var1);

   ToNativeConverter getToNativeConverter(Class<?> var1);
}

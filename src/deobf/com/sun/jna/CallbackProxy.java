package com.sun.jna;

public interface CallbackProxy extends Callback {
   Object callback(Object[] var1);

   Class<?>[] getParameterTypes();

   Class<?> getReturnType();
}

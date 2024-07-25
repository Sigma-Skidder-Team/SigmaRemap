package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class Native$3 implements InvocationHandler {
   public Native$3(Library$class_13 var1, Library var2) {
      this.val$handler = var1;
      this.val$library = var2;
   }

   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      synchronized (this.val$handler.getNativeLibrary()) {
         return this.val$handler.invoke(this.val$library, method, args);
      }
   }
}

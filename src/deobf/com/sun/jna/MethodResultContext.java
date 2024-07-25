package com.sun.jna;

import java.lang.reflect.Method;

public class MethodResultContext extends FunctionResultContext {
   private final Method method;

   public MethodResultContext(Class<?> resultClass, Function function, Object[] args, Method method) {
      super(resultClass, function, args);
      this.method = method;
   }

   public Method getMethod() {
      return this.method;
   }
}

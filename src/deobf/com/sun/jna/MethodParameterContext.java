package com.sun.jna;

import java.lang.reflect.Method;

public class MethodParameterContext extends FunctionParameterContext {
   private Method method;

   public MethodParameterContext(Function f, Object[] args, int index, Method m) {
      super(f, args, index);
      this.method = m;
   }

   public Method getMethod() {
      return this.method;
   }
}

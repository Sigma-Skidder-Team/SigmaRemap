package com.sun.jna;

import java.lang.reflect.Method;

public class CallbackParameterContext extends FromNativeContext {
   private Method method;
   private Object[] args;
   private int index;

   public CallbackParameterContext(Class<?> javaType, Method m, Object[] args, int index) {
      super(javaType);
      this.method = m;
      this.args = args;
      this.index = index;
   }

   public Method getMethod() {
      return this.method;
   }

   public Object[] getArguments() {
      return this.args;
   }

   public int getIndex() {
      return this.index;
   }
}

package com.sun.jna;

public class FunctionResultContext extends FromNativeContext {
   private Function function;
   private Object[] args;

   public FunctionResultContext(Class<?> resultClass, Function function, Object[] args) {
      super(resultClass);
      this.function = function;
      this.args = args;
   }

   public Function getFunction() {
      return this.function;
   }

   public Object[] getArguments() {
      return this.args;
   }
}

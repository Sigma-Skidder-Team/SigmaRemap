package com.sun.jna;

public class FromNativeContext {
   private Class<?> type;

   public FromNativeContext(Class<?> javaType) {
      this.type = javaType;
   }

   public Class<?> getTargetType() {
      return this.type;
   }
}

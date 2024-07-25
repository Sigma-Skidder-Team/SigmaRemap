package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.util.Map;

public final class Library$class_13$class_14 {
   public final InvocationHandler handler;
   public final Function function;
   public final boolean isVarArgs;
   public final Map<String, ?> options;
   public final Class<?>[] parameterTypes;

   public Library$class_13$class_14(InvocationHandler handler, Function function, Class<?>[] parameterTypes, boolean isVarArgs, Map<String, ?> options) {
      this.handler = handler;
      this.function = function;
      this.isVarArgs = isVarArgs;
      this.options = options;
      this.parameterTypes = parameterTypes;
   }
}

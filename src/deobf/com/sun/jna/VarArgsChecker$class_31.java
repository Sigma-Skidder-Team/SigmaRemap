package com.sun.jna;

import java.lang.reflect.Method;

public final class VarArgsChecker$class_31 extends VarArgsChecker {
   private VarArgsChecker$class_31() {
   }

   @Override
   public boolean isVarArgs(Method m) {
      return m.isVarArgs();
   }

   @Override
   public int fixedArgs(Method m) {
      return m.isVarArgs() ? m.getParameterTypes().length - 1 : 0;
   }
}

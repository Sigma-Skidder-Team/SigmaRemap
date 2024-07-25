package com.sun.jna;

import java.lang.reflect.Method;

public final class VarArgsChecker$class_30 extends VarArgsChecker {
   private VarArgsChecker$class_30() {
   }

   @Override
   public boolean isVarArgs(Method m) {
      return false;
   }

   @Override
   public int fixedArgs(Method m) {
      return 0;
   }
}

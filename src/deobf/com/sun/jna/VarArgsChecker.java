package com.sun.jna;

import java.lang.reflect.Method;

public abstract class VarArgsChecker {
   private VarArgsChecker() {
   }

   public static VarArgsChecker create() {
      try {
         Method var2 = Method.class.getMethod("isVarArgs");
         return (VarArgsChecker)(var2 != null ? new VarArgsChecker$class_31(null) : new VarArgsChecker$class_30(null));
      } catch (NoSuchMethodException var3) {
         return new VarArgsChecker$class_30(null);
      } catch (SecurityException var4) {
         return new VarArgsChecker$class_30(null);
      }
   }

   public abstract boolean isVarArgs(Method var1);

   public abstract int fixedArgs(Method var1);
}

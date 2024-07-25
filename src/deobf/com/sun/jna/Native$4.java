package com.sun.jna;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;

public final class Native$4 implements PrivilegedAction<Method> {
   public Method run() {
      try {
         Method var3 = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
         var3.setAccessible(true);
         return var3;
      } catch (Exception var4) {
         return null;
      }
   }
}

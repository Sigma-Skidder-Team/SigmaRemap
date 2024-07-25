package com.sun.jna;

import java.lang.reflect.Method;
import java.util.Map;

public class NativeLibrary$1 extends Function {
   public NativeLibrary$1(NativeLibrary this$0, NativeLibrary library, String functionName, int callFlags, String encoding) {
      super(library, functionName, callFlags, encoding);
      this.this$0 = this$0;
   }

   @Override
   public Object invoke(Object[] args, Class<?> returnType, boolean b, int fixedArgs) {
      return Native.getLastError();
   }

   @Override
   public Object invoke(Method invokingMethod, Class<?>[] paramTypes, Class<?> returnType, Object[] inArgs, Map<String, ?> options) {
      return Native.getLastError();
   }
}

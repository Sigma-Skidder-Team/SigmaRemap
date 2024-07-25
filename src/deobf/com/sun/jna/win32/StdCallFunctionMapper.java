package com.sun.jna.win32;

import com.sun.jna.Function;
import com.sun.jna.FunctionMapper;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.NativeMapped;
import com.sun.jna.NativeMappedConverter;
import com.sun.jna.Pointer;
import java.lang.reflect.Method;

public class StdCallFunctionMapper implements FunctionMapper {
   public int getArgumentNativeStackSize(Class<?> cls) {
      if (NativeMapped.class.isAssignableFrom(cls)) {
         cls = NativeMappedConverter.getInstance(cls).nativeType();
      }

      if (cls.isArray()) {
         return Pointer.SIZE;
      } else {
         try {
            return Native.getNativeSize(cls);
         } catch (IllegalArgumentException var5) {
            throw new IllegalArgumentException("Unknown native stack allocation size for " + cls);
         }
      }
   }

   @Override
   public String getFunctionName(NativeLibrary library, Method method) {
      String pop = method.getName();
      int argTypes = 0;
      Class[] decorated = method.getParameterTypes();

      for (Class var11 : decorated) {
         argTypes += this.getArgumentNativeStackSize(var11);
      }

      String var14 = pop + "@" + argTypes;
      byte var15 = 63;

      try {
         Function var16 = library.getFunction(var14, var15);
         pop = var16.getName();
      } catch (UnsatisfiedLinkError var13) {
         try {
            Function var17 = library.getFunction("_" + var14, var15);
            pop = var17.getName();
         } catch (UnsatisfiedLinkError var12) {
         }
      }

      return pop;
   }
}

package com.sun.jna.win32;

import com.sun.jna.FunctionMapper;
import com.sun.jna.NativeLibrary;
import java.lang.reflect.Method;

public class W32APIFunctionMapper implements FunctionMapper {
   public static final FunctionMapper UNICODE = new W32APIFunctionMapper(true);
   public static final FunctionMapper ASCII = new W32APIFunctionMapper(false);
   private final String suffix;

   public W32APIFunctionMapper(boolean unicode) {
      this.suffix = unicode ? "W" : "A";
   }

   @Override
   public String getFunctionName(NativeLibrary library, Method method) {
      String var5 = method.getName();
      if (!var5.endsWith("W") && !var5.endsWith("A")) {
         try {
            var5 = library.getFunction(var5 + this.suffix, 63).getName();
         } catch (UnsatisfiedLinkError var7) {
         }
      }

      return var5;
   }
}

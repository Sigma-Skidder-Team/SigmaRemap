package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class CallbackReference$class_8 implements InvocationHandler {
   private final Function function;
   private final Map<String, ?> options;

   public CallbackReference$class_8(Pointer address, int callingConvention, Map<String, ?> options) {
      this.options = options;
      this.function = new Function(address, callingConvention, (String)options.get("string-encoding"));
   }

   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      if (Library$class_13.OBJECT_TOSTRING.equals(method)) {
         String var9 = "Proxy interface to " + this.function;
         Method cls = (Method)this.options.get("invoking-method");
         Class var8 = CallbackReference.findCallbackClass(cls.getDeclaringClass());
         return var9 + " (" + var8.getName() + ")";
      } else if (Library$class_13.OBJECT_HASHCODE.equals(method)) {
         return this.hashCode();
      } else if (Library$class_13.OBJECT_EQUALS.equals(method)) {
         Object m = args[0];
         return m != null && Proxy.isProxyClass(m.getClass()) ? Function.valueOf(Proxy.getInvocationHandler(m) == this) : Boolean.FALSE;
      } else {
         if (Function.isVarArgs(method)) {
            args = Function.concatenateVarArgs(args);
         }

         return this.function.invoke(method.getReturnType(), args, this.options);
      }
   }

   public Pointer getPointer() {
      return this.function;
   }
}

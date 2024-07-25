package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Library$class_13 implements InvocationHandler {
   public static final Method OBJECT_TOSTRING;
   public static final Method OBJECT_HASHCODE;
   public static final Method OBJECT_EQUALS;
   private final NativeLibrary nativeLibrary;
   private final Class<?> interfaceClass;
   private final Map<String, Object> options;
   private final InvocationMapper invocationMapper;
   private final Map<Method, Library$class_13$class_14> functions = new WeakHashMap<Method, Library$class_13$class_14>();

   public Library$class_13(String libname, Class<?> interfaceClass, Map<String, ?> options) {
      if (libname != null && "".equals(libname.trim())) {
         throw new IllegalArgumentException("Invalid library name \"" + libname + "\"");
      } else if (!interfaceClass.isInterface()) {
         throw new IllegalArgumentException(libname + " does not implement an interface: " + interfaceClass.getName());
      } else {
         this.interfaceClass = interfaceClass;
         this.options = new HashMap<String, Object>((Map<? extends String, ? extends Object>)options);
         int var6 = AltCallingConvention.class.isAssignableFrom(interfaceClass) ? 63 : 0;
         if (this.options.get("calling-convention") == null) {
            this.options.put("calling-convention", var6);
         }

         if (this.options.get("classloader") == null) {
            this.options.put("classloader", interfaceClass.getClassLoader());
         }

         this.nativeLibrary = NativeLibrary.getInstance(libname, this.options);
         this.invocationMapper = (InvocationMapper)this.options.get("invocation-mapper");
      }
   }

   public NativeLibrary getNativeLibrary() {
      return this.nativeLibrary;
   }

   public String getLibraryName() {
      return this.nativeLibrary.getName();
   }

   public Class<?> getInterfaceClass() {
      return this.interfaceClass;
   }

   @Override
   public Object invoke(Object proxy, Method method, Object[] inArgs) throws Throwable {
      if (OBJECT_TOSTRING.equals(method)) {
         return "Proxy interface to " + this.nativeLibrary;
      } else if (OBJECT_HASHCODE.equals(method)) {
         return this.hashCode();
      } else if (OBJECT_EQUALS.equals(method)) {
         Object var15 = inArgs[0];
         return var15 != null && Proxy.isProxyClass(var15.getClass()) ? Function.valueOf(Proxy.getInvocationHandler(var15) == this) : Boolean.FALSE;
      } else {
         Library$class_13$class_14 var6 = this.functions.get(method);
         if (var6 == null) {
            synchronized (this.functions) {
               var6 = this.functions.get(method);
               if (var6 == null) {
                  boolean handler = Function.isVarArgs(method);
                  InvocationHandler function = null;
                  if (this.invocationMapper != null) {
                     function = this.invocationMapper.getInvocationHandler(this.nativeLibrary, method);
                  }

                  Function parameterTypes = null;
                  Class[] options = null;
                  HashMap var12 = null;
                  if (function == null) {
                     parameterTypes = this.nativeLibrary.getFunction(method.getName(), method);
                     options = method.getParameterTypes();
                     var12 = new HashMap<String, Object>(this.options);
                     var12.put("invoking-method", method);
                  }

                  var6 = new Library$class_13$class_14(function, parameterTypes, options, handler, var12);
                  this.functions.put(method, var6);
               }
            }
         }

         if (var6.isVarArgs) {
            inArgs = Function.concatenateVarArgs(inArgs);
         }

         return var6.handler != null
            ? var6.handler.invoke(proxy, method, inArgs)
            : var6.function.invoke(method, var6.parameterTypes, method.getReturnType(), inArgs, var6.options);
      }
   }

   static {
      try {
         OBJECT_TOSTRING = Object.class.getMethod("toString");
         OBJECT_HASHCODE = Object.class.getMethod("hashCode");
         OBJECT_EQUALS = Object.class.getMethod("equals", Object.class);
      } catch (Exception var3) {
         throw new Error("Error retrieving Object.toString() method");
      }
   }
}

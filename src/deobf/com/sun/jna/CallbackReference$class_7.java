package com.sun.jna;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallbackReference$class_7 implements CallbackProxy {
   private final Method callbackMethod;
   private ToNativeConverter toNative;
   private final FromNativeConverter[] fromNative;
   private final String encoding;

   public CallbackReference$class_7(CallbackReference var1, Method callbackMethod, TypeMapper mapper, String encoding) {
      this.this$0 = var1;
      this.callbackMethod = callbackMethod;
      this.encoding = encoding;
      Class[] returnType = callbackMethod.getParameterTypes();
      Class e = callbackMethod.getReturnType();
      this.fromNative = new FromNativeConverter[returnType.length];
      if (NativeMapped.class.isAssignableFrom(e)) {
         this.toNative = NativeMappedConverter.getInstance(e);
      } else if (mapper != null) {
         this.toNative = mapper.getToNativeConverter(e);
      }

      for (int var9 = 0; var9 < this.fromNative.length; var9++) {
         if (NativeMapped.class.isAssignableFrom(returnType[var9])) {
            this.fromNative[var9] = new NativeMappedConverter(returnType[var9]);
         } else if (mapper != null) {
            this.fromNative[var9] = mapper.getFromNativeConverter(returnType[var9]);
         }
      }

      if (!callbackMethod.isAccessible()) {
         try {
            callbackMethod.setAccessible(true);
         } catch (SecurityException var10) {
            throw new IllegalArgumentException("Callback method is inaccessible, make sure the interface is public: " + callbackMethod);
         }
      }
   }

   public Callback getCallback() {
      return CallbackReference.access$000(this.this$0);
   }

   private Object invokeCallback(Object[] args) {
      Class[] callbackArgs = this.callbackMethod.getParameterTypes();
      Object[] result = new Object[args.length];

      for (int cb = 0; cb < args.length; cb++) {
         Class i = callbackArgs[cb];
         Object context = args[cb];
         if (this.fromNative[cb] != null) {
            CallbackParameterContext var9 = new CallbackParameterContext(i, this.callbackMethod, args, cb);
            result[cb] = this.fromNative[cb].fromNative(context, var9);
         } else {
            result[cb] = this.convertArgument(context, i);
         }
      }

      Object var13 = null;
      Callback var14 = this.getCallback();
      if (var14 != null) {
         try {
            var13 = this.convertResult(this.callbackMethod.invoke(var14, result));
         } catch (IllegalArgumentException var10) {
            Native.getCallbackExceptionHandler().uncaughtException(var14, var10);
         } catch (IllegalAccessException var11) {
            Native.getCallbackExceptionHandler().uncaughtException(var14, var11);
         } catch (InvocationTargetException var12) {
            Native.getCallbackExceptionHandler().uncaughtException(var14, var12.getTargetException());
         }
      }

      for (int var15 = 0; var15 < result.length; var15++) {
         if (result[var15] instanceof Structure && !(result[var15] instanceof Structure$class_23)) {
            ((Structure)result[var15]).autoWrite();
         }
      }

      return var13;
   }

   @Override
   public Object callback(Object[] args) {
      try {
         return this.invokeCallback(args);
      } catch (Throwable var5) {
         Native.getCallbackExceptionHandler().uncaughtException(this.getCallback(), var5);
         return null;
      }
   }

   private Object convertArgument(Object value, Class<?> dstType) {
      if (value instanceof Pointer) {
         if (dstType == String.class) {
            value = ((Pointer)value).getString(0L, this.encoding);
         } else if (dstType == WString.class) {
            value = new WString(((Pointer)value).getWideString(0L));
         } else if (dstType == String[].class) {
            value = ((Pointer)value).getStringArray(0L, this.encoding);
         } else if (dstType == WString[].class) {
            value = ((Pointer)value).getWideStringArray(0L);
         } else if (Callback.class.isAssignableFrom(dstType)) {
            value = CallbackReference.getCallback(dstType, (Pointer)value);
         } else if (Structure.class.isAssignableFrom(dstType)) {
            if (Structure$class_23.class.isAssignableFrom(dstType)) {
               Structure buf = Structure.newInstance(dstType);
               byte[] var6 = new byte[buf.size()];
               ((Pointer)value).read(0L, var6, 0, var6.length);
               buf.getPointer().write(0L, var6, 0, var6.length);
               buf.read();
               value = buf;
            } else {
               Structure var7 = Structure.newInstance(dstType, (Pointer)value);
               var7.conditionalAutoRead();
               value = var7;
            }
         }
      } else if ((boolean.class == dstType || Boolean.class == dstType) && value instanceof Number) {
         value = Function.valueOf(((Number)value).intValue() != 0);
      }

      return value;
   }

   private Object convertResult(Object value) {
      if (this.toNative != null) {
         value = this.toNative.toNative(value, new CallbackResultContext(this.callbackMethod));
      }

      if (value == null) {
         return null;
      } else {
         Class sa = value.getClass();
         if (Structure.class.isAssignableFrom(sa)) {
            return Structure$class_23.class.isAssignableFrom(sa) ? value : ((Structure)value).getPointer();
         } else if (sa == boolean.class || sa == Boolean.class) {
            return Boolean.TRUE.equals(value) ? Function.INTEGER_TRUE : Function.INTEGER_FALSE;
         } else if (sa == String.class || sa == WString.class) {
            return CallbackReference.access$100(value, sa == WString.class);
         } else if (sa != String[].class && sa != WString.class) {
            return Callback.class.isAssignableFrom(sa) ? CallbackReference.getFunctionPointer((Callback)value) : value;
         } else {
            StringArray var5 = sa == String[].class ? new StringArray((String[])value, this.encoding) : new StringArray((WString[])value);
            CallbackReference.allocations.put(value, var5);
            return var5;
         }
      }
   }

   @Override
   public Class<?>[] getParameterTypes() {
      return this.callbackMethod.getParameterTypes();
   }

   @Override
   public Class<?> getReturnType() {
      return this.callbackMethod.getReturnType();
   }
}

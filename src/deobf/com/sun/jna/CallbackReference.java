package com.sun.jna;

import com.sun.jna.win32.DLLCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;

public class CallbackReference extends WeakReference<Callback> {
   public static final Map<Callback, CallbackReference> callbackMap = new WeakHashMap<Callback, CallbackReference>();
   public static final Map<Callback, CallbackReference> directCallbackMap = new WeakHashMap<Callback, CallbackReference>();
   public static final Map<Pointer, Reference<Callback>> pointerCallbackMap = new WeakHashMap<Pointer, Reference<Callback>>();
   public static final Map<Object, Object> allocations = new WeakHashMap<Object, Object>();
   private static final Map<CallbackReference, Reference<CallbackReference>> allocatedMemory = Collections.<CallbackReference, Reference<CallbackReference>>synchronizedMap(
      new WeakHashMap<CallbackReference, Reference<CallbackReference>>()
   );
   private static final Method PROXY_CALLBACK_METHOD;
   private static final Map<Callback, CallbackThreadInitializer> initializers;
   public Pointer cbstruct;
   public Pointer trampoline;
   public CallbackProxy proxy;
   public Method method;
   public int callingConvention;

   public static CallbackThreadInitializer setCallbackThreadInitializer(Callback cb, CallbackThreadInitializer initializer) {
      synchronized (initializers) {
         return initializer != null ? initializers.put(cb, initializer) : initializers.remove(cb);
      }
   }

   private static ThreadGroup initializeThread(Callback cb, CallbackReference$class_6 args) {
      CallbackThreadInitializer group = null;
      if (cb instanceof CallbackReference$class_7) {
         cb = ((CallbackReference$class_7)cb).getCallback();
      }

      synchronized (initializers) {
         group = initializers.get(cb);
      }

      ThreadGroup var9 = null;
      if (group != null) {
         var9 = group.getThreadGroup(cb);
         args.name = group.getName(cb);
         args.daemon = group.isDaemon(cb);
         args.detach = group.detach(cb);
         args.write();
      }

      return var9;
   }

   public static Callback getCallback(Class<?> type, Pointer p) {
      return getCallback(type, p, false);
   }

   private static Callback getCallback(Class<?> type, Pointer p, boolean direct) {
      if (p == null) {
         return null;
      } else if (!type.isInterface()) {
         throw new IllegalArgumentException("Callback type must be an interface");
      } else {
         Map var5 = direct ? directCallbackMap : callbackMap;
         synchronized (pointerCallbackMap) {
            Callback ref = null;
            Reference ctype = pointerCallbackMap.get(p);
            if (ctype != null) {
               ref = (Callback)ctype.get();
               if (ref != null && !type.isAssignableFrom(ref.getClass())) {
                  throw new IllegalStateException(
                     "Pointer "
                        + p
                        + " already mapped to "
                        + ref
                        + ".\nNative code may be re-using a default function pointer, in which case you may need to use a common Callback class wherever the function pointer is reused."
                  );
               } else {
                  return ref;
               }
            } else {
               int foptions = AltCallingConvention.class.isAssignableFrom(type) ? 63 : 0;
               HashMap h = new HashMap<String, Object>(Native.getLibraryOptions(type));
               h.put("invoking-method", getCallbackMethod(type));
               CallbackReference$class_8 var11 = new CallbackReference$class_8(p, foptions, h);
               ref = (Callback)Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, var11);
               var5.remove(ref);
               pointerCallbackMap.put(p, new WeakReference<Callback>(ref));
               return ref;
            }
         }
      }
   }

   private CallbackReference(Callback callback, int callingConvention, boolean direct) {
      super(callback);
      TypeMapper ppc = Native.getTypeMapper(callback.getClass());
      this.callingConvention = callingConvention;
      boolean encoding = Platform.isPPC();
      if (direct) {
         Method ptypes = getCallbackMethod(callback);
         Class[] i = ptypes.getParameterTypes();

         for (int peer = 0; peer < i.length; peer++) {
            if (encoding && (i[peer] == float.class || i[peer] == double.class)) {
               direct = false;
               break;
            }

            if (ppc != null && ppc.getFromNativeConverter(i[peer]) != null) {
               direct = false;
               break;
            }
         }

         if (ppc != null && ppc.getToNativeConverter(ptypes.getReturnType()) != null) {
            direct = false;
         }
      }

      String var17 = Native.getStringEncoding(callback.getClass());
      long var11 = 0L;
      if (direct) {
         this.method = getCallbackMethod(callback);
         Class[] returnType = this.method.getParameterTypes();
         Class flags = this.method.getReturnType();
         byte msg = 1;
         if (callback instanceof DLLCallback) {
            msg |= 2;
         }

         var11 = Native.createNativeCallback(callback, this.method, returnType, flags, callingConvention, msg, var17);
      } else {
         if (callback instanceof CallbackProxy) {
            this.proxy = (CallbackProxy)callback;
         } else {
            this.proxy = new CallbackReference$class_7(this, getCallbackMethod(callback), ppc, var17);
         }

         Class[] var19 = this.proxy.getParameterTypes();
         Class var20 = this.proxy.getReturnType();
         if (ppc != null) {
            for (int var22 = 0; var22 < var19.length; var22++) {
               FromNativeConverter var16 = ppc.getFromNativeConverter(var19[var22]);
               if (var16 != null) {
                  var19[var22] = var16.nativeType();
               }
            }

            ToNativeConverter var23 = ppc.getToNativeConverter(var20);
            if (var23 != null) {
               var20 = var23.nativeType();
            }
         }

         for (int var24 = 0; var24 < var19.length; var24++) {
            var19[var24] = this.getNativeType(var19[var24]);
            if (!isAllowableNativeType(var19[var24])) {
               String var27 = "Callback argument " + var19[var24] + " requires custom type conversion";
               throw new IllegalArgumentException(var27);
            }
         }

         var20 = this.getNativeType(var20);
         if (!isAllowableNativeType(var20)) {
            String var26 = "Callback return type " + var20 + " requires custom type conversion";
            throw new IllegalArgumentException(var26);
         }

         int var25 = callback instanceof DLLCallback ? 2 : 0;
         var11 = Native.createNativeCallback(this.proxy, PROXY_CALLBACK_METHOD, var19, var20, callingConvention, var25, var17);
      }

      this.cbstruct = var11 != 0L ? new Pointer(var11) : null;
      allocatedMemory.put(this, new WeakReference<CallbackReference>(this));
   }

   private Class<?> getNativeType(Class<?> cls) {
      if (Structure.class.isAssignableFrom(cls)) {
         Structure.validate(cls);
         if (!Structure$class_23.class.isAssignableFrom(cls)) {
            return Pointer.class;
         }
      } else {
         if (NativeMapped.class.isAssignableFrom(cls)) {
            return NativeMappedConverter.getInstance(cls).nativeType();
         }

         if (cls == String.class || cls == WString.class || cls == String[].class || cls == WString[].class || Callback.class.isAssignableFrom(cls)) {
            return Pointer.class;
         }
      }

      return cls;
   }

   private static Method checkMethod(Method m) {
      if (m.getParameterTypes().length > 256) {
         String var3 = "Method signature exceeds the maximum parameter count: " + m;
         throw new UnsupportedOperationException(var3);
      } else {
         return m;
      }
   }

   public static Class<?> findCallbackClass(Class<?> type) {
      if (!Callback.class.isAssignableFrom(type)) {
         throw new IllegalArgumentException(type.getName() + " is not derived from com.sun.jna.Callback");
      } else if (type.isInterface()) {
         return type;
      } else {
         Class[] i = type.getInterfaces();

         for (int e = 0; e < i.length; e++) {
            if (Callback.class.isAssignableFrom(i[e])) {
               try {
                  getCallbackMethod(i[e]);
                  return i[e];
               } catch (IllegalArgumentException var6) {
                  break;
               }
            }
         }

         return Callback.class.isAssignableFrom(type.getSuperclass()) ? findCallbackClass(type.getSuperclass()) : type;
      }
   }

   private static Method getCallbackMethod(Callback callback) {
      return getCallbackMethod(findCallbackClass(callback.getClass()));
   }

   private static Method getCallbackMethod(Class<?> cls) {
      Method[] classMethods = cls.getDeclaredMethods();
      Method[] pmethods = cls.getMethods();
      HashSet methods = new HashSet<Method>(Arrays.asList(classMethods));
      methods.retainAll(Arrays.<Method>asList(pmethods));
      Iterator msg = methods.iterator();

      while (msg.hasNext()) {
         Method m = (Method)msg.next();
         if (Callback.FORBIDDEN_NAMES.contains(m.getName())) {
            msg.remove();
         }
      }

      Method[] var9 = methods.<Method>toArray(new Method[methods.size()]);
      if (var9.length == 1) {
         return checkMethod(var9[0]);
      } else {
         for (int var10 = 0; var10 < var9.length; var10++) {
            Method var8 = var9[var10];
            if ("callback".equals(var8.getName())) {
               return checkMethod(var8);
            }
         }

         String var11 = "Callback must implement a single public method, or one public method named 'callback'";
         throw new IllegalArgumentException(var11);
      }
   }

   private void setCallbackOptions(int options) {
      this.cbstruct.setInt((long)Pointer.SIZE, options);
   }

   public Pointer getTrampoline() {
      if (this.trampoline == null) {
         this.trampoline = this.cbstruct.getPointer(0L);
      }

      return this.trampoline;
   }

   @Override
   public void finalize() {
      this.dispose();
   }

   public synchronized void dispose() {
      if (this.cbstruct != null) {
         try {
            Native.freeNativeCallback(this.cbstruct.peer);
         } finally {
            this.cbstruct.peer = 0L;
            this.cbstruct = null;
            allocatedMemory.remove(this);
         }
      }
   }

   public static void disposeAll() {
      for (CallbackReference var4 : new LinkedList<CallbackReference>(allocatedMemory.keySet())) {
         var4.dispose();
      }
   }

   private Callback getCallback() {
      return this.get();
   }

   private static Pointer getNativeFunctionPointer(Callback cb) {
      if (Proxy.isProxyClass(cb.getClass())) {
         InvocationHandler var3 = Proxy.getInvocationHandler(cb);
         if (var3 instanceof CallbackReference$class_8) {
            return ((CallbackReference$class_8)var3).getPointer();
         }
      }

      return null;
   }

   public static Pointer getFunctionPointer(Callback cb) {
      return getFunctionPointer(cb, false);
   }

   private static Pointer getFunctionPointer(Callback cb, boolean direct) {
      Pointer options = null;
      if (cb == null) {
         return null;
      } else if ((options = getNativeFunctionPointer(cb)) != null) {
         return options;
      } else {
         Map callingConvention = Native.getLibraryOptions(cb.getClass());
         int map = cb instanceof AltCallingConvention
            ? 63
            : (callingConvention != null && callingConvention.containsKey("calling-convention") ? (Integer)callingConvention.get("calling-convention") : 0);
         Map var7 = direct ? directCallbackMap : callbackMap;
         synchronized (pointerCallbackMap) {
            CallbackReference var9 = (CallbackReference)var7.get(cb);
            if (var9 == null) {
               var9 = new CallbackReference(cb, map, direct);
               var7.put(cb, var9);
               pointerCallbackMap.put(var9.getTrampoline(), new WeakReference<Callback>(cb));
               if (initializers.containsKey(cb)) {
                  var9.setCallbackOptions(1);
               }
            }

            return var9.getTrampoline();
         }
      }
   }

   private static boolean isAllowableNativeType(Class<?> cls) {
      return cls == void.class
         || cls == Void.class
         || cls == boolean.class
         || cls == Boolean.class
         || cls == byte.class
         || cls == Byte.class
         || cls == short.class
         || cls == Short.class
         || cls == char.class
         || cls == Character.class
         || cls == int.class
         || cls == Integer.class
         || cls == long.class
         || cls == Long.class
         || cls == float.class
         || cls == Float.class
         || cls == double.class
         || cls == Double.class
         || Structure$class_23.class.isAssignableFrom(cls) && Structure.class.isAssignableFrom(cls)
         || Pointer.class.isAssignableFrom(cls);
   }

   private static Pointer getNativeString(Object value, boolean wide) {
      if (value != null) {
         NativeString var4 = new NativeString(value.toString(), wide);
         allocations.put(value, var4);
         return var4.getPointer();
      } else {
         return null;
      }
   }

   static {
      try {
         PROXY_CALLBACK_METHOD = CallbackProxy.class.getMethod("callback", Object[].class);
      } catch (Exception var3) {
         throw new Error("Error looking up CallbackProxy.callback() method");
      }

      initializers = new WeakHashMap<Callback, CallbackThreadInitializer>();
   }
}

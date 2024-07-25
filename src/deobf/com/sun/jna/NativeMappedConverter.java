package com.sun.jna;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;

public class NativeMappedConverter implements TypeConverter {
   private static final Map<Class<?>, Reference<NativeMappedConverter>> converters = new WeakHashMap<Class<?>, Reference<NativeMappedConverter>>();
   private final Class<?> type;
   private final Class<?> nativeType;
   private final NativeMapped instance;

   public static NativeMappedConverter getInstance(Class<?> cls) {
      synchronized (converters) {
         Reference nmc = converters.get(cls);
         NativeMappedConverter var5 = nmc != null ? (NativeMappedConverter)nmc.get() : null;
         if (var5 == null) {
            var5 = new NativeMappedConverter(cls);
            converters.put(cls, new SoftReference<NativeMappedConverter>(var5));
         }

         return var5;
      }
   }

   public NativeMappedConverter(Class<?> type) {
      if (!NativeMapped.class.isAssignableFrom(type)) {
         throw new IllegalArgumentException("Type must derive from " + NativeMapped.class);
      } else {
         this.type = type;
         this.instance = this.defaultValue();
         this.nativeType = this.instance.nativeType();
      }
   }

   public NativeMapped defaultValue() {
      try {
         return (NativeMapped)this.type.newInstance();
      } catch (InstantiationException var5) {
         String var7 = "Can't create an instance of " + this.type + ", requires a no-arg constructor: " + var5;
         throw new IllegalArgumentException(var7);
      } catch (IllegalAccessException var6) {
         String var4 = "Not allowed to create an instance of " + this.type + ", requires a public, no-arg constructor: " + var6;
         throw new IllegalArgumentException(var4);
      }
   }

   @Override
   public Object fromNative(Object nativeValue, FromNativeContext context) {
      return this.instance.fromNative(nativeValue, context);
   }

   @Override
   public Class<?> nativeType() {
      return this.nativeType;
   }

   @Override
   public Object toNative(Object value, ToNativeContext context) {
      if (value == null) {
         if (Pointer.class.isAssignableFrom(this.nativeType)) {
            return null;
         }

         value = this.defaultValue();
      }

      return ((NativeMapped)value).toNative();
   }
}

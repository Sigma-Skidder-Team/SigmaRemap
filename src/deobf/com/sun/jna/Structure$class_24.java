package com.sun.jna;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class Structure$class_24 extends Structure {
   private static final Map<Object, Object> typeInfoMap = new WeakHashMap<Object, Object>();
   private static final int FFI_TYPE_STRUCT = 13;
   public Structure$class_24$class_26 size;
   public short alignment;
   public short type = 13;
   public Pointer elements;

   private Structure$class_24(Structure ref) {
      Structure.access$1900(ref, true);
      Pointer[] var5;
      if (ref instanceof Union) {
         Structure$class_28 els = ((Union)ref).typeInfoField();
         var5 = new Pointer[]{get(ref.getFieldValue(els.field), els.type), null};
      } else {
         var5 = new Pointer[ref.fields().size() + 1];
         Pointer[] var8 = 0;

         for (Structure$class_28 var7 : ref.fields().values()) {
            var5[var8++] = ref.getFieldTypeInfo(var7);
         }
      }

      this.init(var5);
   }

   private Structure$class_24(Object array, Class<?> type) {
      int els = Array.getLength(array);
      Pointer[] p = new Pointer[els + 1];
      Pointer i = get(null, type.getComponentType());

      for (int var8 = 0; var8 < els; var8++) {
         p[var8] = i;
      }

      this.init(p);
   }

   @Override
   public List<String> getFieldOrder() {
      return Arrays.<String>asList("size", "alignment", "type", "elements");
   }

   private void init(Pointer[] els) {
      this.elements = new Memory((long)(Pointer.SIZE * els.length));
      this.elements.write(0L, els, 0, els.length);
      this.write();
   }

   public static Pointer get(Object obj) {
      if (obj == null) {
         return Structure$class_24$class_25.access$1800();
      } else {
         return obj instanceof Class ? get(null, (Class<?>)obj) : get(obj, obj.getClass());
      }
   }

   private static Pointer get(Object obj, Class<?> cls) {
      TypeMapper nc = Native.getTypeMapper(cls);
      if (nc != null) {
         ToNativeConverter o = nc.getToNativeConverter(cls);
         if (o != null) {
            cls = o.nativeType();
         }
      }

      synchronized (typeInfoMap) {
         Object type = typeInfoMap.get(cls);
         if (type instanceof Pointer) {
            return (Pointer)type;
         } else if (type instanceof Structure$class_24) {
            return ((Structure$class_24)type).getPointer();
         } else if ((!Platform.HAS_BUFFERS || !Buffer.class.isAssignableFrom(cls)) && !Callback.class.isAssignableFrom(cls)) {
            if (Structure.class.isAssignableFrom(cls)) {
               if (obj == null) {
                  obj = newInstance(cls, Structure.access$2000());
               }

               if (Structure$class_22.class.isAssignableFrom(cls)) {
                  typeInfoMap.put(cls, Structure$class_24$class_25.access$1800());
                  return Structure$class_24$class_25.access$1800();
               } else {
                  Structure$class_24 var12 = new Structure$class_24((Structure)obj);
                  typeInfoMap.put(cls, var12);
                  return var12.getPointer();
               }
            } else if (NativeMapped.class.isAssignableFrom(cls)) {
               NativeMappedConverter var11 = NativeMappedConverter.getInstance(cls);
               return get(var11.toNative(obj, new ToNativeContext()), var11.nativeType());
            } else if (cls.isArray()) {
               Structure$class_24 var7 = new Structure$class_24(obj, cls);
               typeInfoMap.put(obj, var7);
               return var7.getPointer();
            } else {
               throw new IllegalArgumentException("Unsupported type " + cls);
            }
         } else {
            typeInfoMap.put(cls, Structure$class_24$class_25.access$1800());
            return Structure$class_24$class_25.access$1800();
         }
      }
   }

   static {
      if (Native.POINTER_SIZE == 0) {
         throw new Error("Native library not initialized");
      } else if (Structure$class_24$class_25.access$900() == null) {
         throw new Error("FFI types not initialized");
      } else {
         typeInfoMap.put(void.class, Structure$class_24$class_25.access$900());
         typeInfoMap.put(Void.class, Structure$class_24$class_25.access$900());
         typeInfoMap.put(float.class, Structure$class_24$class_25.access$1000());
         typeInfoMap.put(Float.class, Structure$class_24$class_25.access$1000());
         typeInfoMap.put(double.class, Structure$class_24$class_25.access$1100());
         typeInfoMap.put(Double.class, Structure$class_24$class_25.access$1100());
         typeInfoMap.put(long.class, Structure$class_24$class_25.access$1200());
         typeInfoMap.put(Long.class, Structure$class_24$class_25.access$1200());
         typeInfoMap.put(int.class, Structure$class_24$class_25.access$1300());
         typeInfoMap.put(Integer.class, Structure$class_24$class_25.access$1300());
         typeInfoMap.put(short.class, Structure$class_24$class_25.access$1400());
         typeInfoMap.put(Short.class, Structure$class_24$class_25.access$1400());
         Pointer var2 = Native.WCHAR_SIZE == 2 ? Structure$class_24$class_25.access$1500() : Structure$class_24$class_25.access$1600();
         typeInfoMap.put(char.class, var2);
         typeInfoMap.put(Character.class, var2);
         typeInfoMap.put(byte.class, Structure$class_24$class_25.access$1700());
         typeInfoMap.put(Byte.class, Structure$class_24$class_25.access$1700());
         typeInfoMap.put(Pointer.class, Structure$class_24$class_25.access$1800());
         typeInfoMap.put(String.class, Structure$class_24$class_25.access$1800());
         typeInfoMap.put(WString.class, Structure$class_24$class_25.access$1800());
         typeInfoMap.put(boolean.class, Structure$class_24$class_25.access$1600());
         typeInfoMap.put(Boolean.class, Structure$class_24$class_25.access$1600());
      }
   }
}

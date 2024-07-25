package remapped;

import com.github.steveice10.opennbt.conversion.ConversionException;
import com.github.steveice10.opennbt.conversion.ConverterRegisterException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class class_5737 {
   private static final Map<Class<? extends class_5287>, class_1564<? extends class_5287, ?>> field_29076 = new HashMap<Class<? extends class_5287>, class_1564<? extends class_5287, ?>>();
   private static final Map<Class<?>, class_1564<? extends class_5287, ?>> field_29078 = new HashMap<Class<?>, class_1564<? extends class_5287, ?>>();

   public static <T extends class_5287, V> void method_25977(Class<T> var0, Class<V> var1, class_1564<T, V> var2) throws ConverterRegisterException {
      if (!field_29076.containsKey(var0)) {
         if (!field_29078.containsKey(var1)) {
            field_29076.put(var0, var2);
            field_29078.put(var1, var2);
         } else {
            throw new class_5274("Tag conversion to type " + var1.getName() + " is already registered.");
         }
      } else {
         throw new class_5274("Type conversion to tag " + var0.getName() + " is already registered.");
      }
   }

   public static <T extends class_5287, V> void method_25982(Class<T> var0, Class<V> var1) {
      field_29076.remove(var0);
      field_29078.remove(var1);
   }

   public static <T extends class_5287, V> V method_25980(T var0) throws ConversionException {
      if (var0 != null && var0.method_24129() != null) {
         if (field_29076.containsKey(var0.getClass())) {
            class_1564 var3 = field_29076.get(var0.getClass());
            return (V)var3.method_7077(var0);
         } else {
            throw new class_2923("Tag type " + var0.getClass().getName() + " has no converter.");
         }
      } else {
         return null;
      }
   }

   public static <V, T extends class_5287> T method_25979(String var0, V var1) throws ConversionException {
      if (var1 == null) {
         return null;
      } else {
         class_1564 var4 = field_29078.get(var1.getClass());
         if (var4 == null) {
            for (Class var6 : method_25981(var1.getClass())) {
               if (field_29078.containsKey(var6)) {
                  try {
                     var4 = field_29078.get(var6);
                     break;
                  } catch (ClassCastException var8) {
                  }
               }
            }
         }

         if (var4 == null) {
            throw new class_2923("Value type " + var1.getClass().getName() + " has no converter.");
         } else {
            return (T)var4.method_7076(var0, var1);
         }
      }
   }

   private static Set<Class<?>> method_25981(Class<?> var0) {
      LinkedHashSet var3 = new LinkedHashSet();

      for (Class var4 = var0; var4 != null; var4 = var4.getSuperclass()) {
         var3.add(var4);
         var3.addAll(method_25978(var4));
      }

      if (var3.contains(Serializable.class)) {
         var3.remove(Serializable.class);
         var3.add(Serializable.class);
      }

      return var3;
   }

   private static Set<Class<?>> method_25978(Class<?> var0) {
      HashSet var3 = new HashSet();

      for (Class var7 : var0.getInterfaces()) {
         var3.add(var7);
         var3.addAll(method_25978(var7));
      }

      return var3;
   }

   static {
      method_25977(class_1456.class, Byte.class, new class_5538());
      method_25977(class_6733.class, Short.class, new class_4941());
      method_25977(class_5232.class, Integer.class, new class_2029());
      method_25977(class_8735.class, Long.class, new class_2821());
      method_25977(class_520.class, Float.class, new class_2482());
      method_25977(class_7948.class, Double.class, new class_9017());
      method_25977(class_1070.class, byte[].class, new class_8850());
      method_25977(class_887.class, String.class, new class_6320());
      method_25977(class_913.class, List.class, new class_4685());
      method_25977(class_5531.class, Map.class, new class_1145());
      method_25977(class_7356.class, int[].class, new class_5213());
      method_25977(class_6674.class, long[].class, new class_8155());
      method_25977(class_9042.class, double[].class, new class_4449());
      method_25977(class_9502.class, float[].class, new class_1693());
      method_25977(class_5568.class, short[].class, new class_2950());
   }
}

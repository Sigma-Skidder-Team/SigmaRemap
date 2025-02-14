package mapped;


import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class8742 {
   private static final Map<Class<? extends Class61>, Class6926<? extends Class61, ?>> field39419 = new HashMap<Class<? extends Class61>, Class6926<? extends Class61, ?>>();
   private static final Map<Class<?>, Class6926<? extends Class61, ?>> field39420 = new HashMap<Class<?>, Class6926<? extends Class61, ?>>();

   public static <T extends Class61, V> void method31538(Class<T> var0, Class<V> var1, Class6926<T, V> var2) throws Class2501 {
      if (!field39419.containsKey(var0)) {
         if (!field39420.containsKey(var1)) {
            field39419.put(var0, var2);
            field39420.put(var1, var2);
         } else {
            throw new Class2501("Tag conversion to type " + var1.getName() + " is already registered.");
         }
      } else {
         throw new Class2501("Type conversion to tag " + var0.getName() + " is already registered.");
      }
   }

   public static <T extends Class61, V> void method31539(Class<T> var0, Class<V> var1) {
      field39419.remove(var0);
      field39420.remove(var1);
   }

   public static <T extends Class61, V> V method31540(T var0) throws Class2495 {
      if (var0 != null && var0.method205() != null) {
         if (field39419.containsKey(var0.getClass())) {
            Class6926 var3 = field39419.get(var0.getClass());
            return (V)var3.method21342(var0);
         } else {
            throw new Class2495("Tag type " + var0.getClass().getName() + " has no converter.");
         }
      } else {
         return null;
      }
   }

   public static <V, T extends Class61> T method31541(String var0, V var1) throws Class2495 {
      if (var1 == null) {
         return null;
      } else {
         Class6926 var4 = field39420.get(var1.getClass());
         if (var4 == null) {
            for (Class var6 : method31542(var1.getClass())) {
               if (field39420.containsKey(var6)) {
                  try {
                     var4 = field39420.get(var6);
                     break;
                  } catch (ClassCastException var8) {
                  }
               }
            }
         }

         if (var4 == null) {
            throw new Class2495("Value type " + var1.getClass().getName() + " has no converter.");
         } else {
            return (T)var4.method21341(var0, var1);
         }
      }
   }

   private static Set<Class<?>> method31542(Class<?> var0) {
      LinkedHashSet var3 = new LinkedHashSet();

      for (Class var4 = var0; var4 != null; var4 = var4.getSuperclass()) {
         var3.add(var4);
         var3.addAll(method31543(var4));
      }

      if (var3.contains(Serializable.class)) {
         var3.remove(Serializable.class);
         var3.add(Serializable.class);
      }

      return var3;
   }

   private static Set<Class<?>> method31543(Class<?> var0) {
      HashSet var3 = new HashSet();

      for (Class var7 : var0.getInterfaces()) {
         var3.add(var7);
         var3.addAll(method31543(var7));
      }

      return var3;
   }

   static {
      method31538(Class69.class, Byte.class, new Class6940());
      method31538(Class73.class, Short.class, new Class6938());
      method31538(Class66.class, Integer.class, new Class6935());
      method31538(Class75.class, Long.class, new Class6930());
      method31538(Class70.class, Float.class, new Class6928());
      method31538(Class68.class, Double.class, new Class6936());
      method31538(Class63.class, byte[].class, new Class6933());
      method31538(Class71.class, String.class, new Class6939());
      method31538(Class60.class, List.class, new Class6927());
      method31538(Class72.class, Map.class, new Class6925());
      method31538(Class62.class, int[].class, new Class6934());
      method31538(Class65.class, long[].class, new Class6931());
      method31538(Class67.class, double[].class, new Class6937());
      method31538(Class64.class, float[].class, new Class6929());
      method31538(Class74.class, short[].class, new Class6932());
   }
}

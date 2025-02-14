package mapped;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Class9509 {
   private static final Map<Integer, Class<? extends Class61>> field44268 = new HashMap<Integer, Class<? extends Class61>>();
   private static final Map<Class<? extends Class61>, Integer> field44269 = new HashMap<Class<? extends Class61>, Integer>();

   public static void method36722(int var0, Class<? extends Class61> var1) throws Class2497 {
      if (!field44268.containsKey(var0)) {
         if (!field44269.containsKey(var1)) {
            field44268.put(var0, var1);
            field44269.put(var1, var0);
         } else {
            throw new Class2497("Tag \"" + var1.getSimpleName() + "\" is already registered.");
         }
      } else {
         throw new Class2497("Tag ID \"" + var0 + "\" is already in use.");
      }
   }

   public static void method36723(int var0) {
      field44269.remove(method36724(var0));
      field44268.remove(var0);
   }

   public static Class<? extends Class61> method36724(int var0) {
      return field44268.containsKey(var0) ? field44268.get(var0) : null;
   }

   public static int method36725(Class<? extends Class61> var0) {
      return field44269.containsKey(var0) ? field44269.get(var0) : -1;
   }

   public static Class61 method36726(int var0, String var1) throws Class2434 {
      Class var4 = field44268.get(var0);
      if (var4 == null) {
         throw new Class2434("Could not find tag with ID \"" + var0 + "\".");
      } else {
         try {
            Constructor var5 = var4.getDeclaredConstructor(String.class);
            var5.setAccessible(true);
            return (Class61)var5.newInstance(var1);
         } catch (Exception var6) {
            throw new Class2434("Failed to create instance of tag \"" + var4.getSimpleName() + "\".", var6);
         }
      }
   }

   static {
      method36722(1, Class69.class);
      method36722(2, Class73.class);
      method36722(3, Class66.class);
      method36722(4, Class75.class);
      method36722(5, Class70.class);
      method36722(6, Class68.class);
      method36722(7, Class63.class);
      method36722(8, Class71.class);
      method36722(9, Class60.class);
      method36722(10, Class72.class);
      method36722(11, Class62.class);
      method36722(12, Class65.class);
      method36722(60, Class67.class);
      method36722(61, Class64.class);
      method36722(65, Class74.class);
   }
}

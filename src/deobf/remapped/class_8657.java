package remapped;

import com.github.steveice10.opennbt.tag.TagCreateException;
import com.github.steveice10.opennbt.tag.TagRegisterException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class class_8657 {
   private static final Map<Integer, Class<? extends class_5287>> field_44328 = new HashMap<Integer, Class<? extends class_5287>>();
   private static final Map<Class<? extends class_5287>, Integer> field_44330 = new HashMap<Class<? extends class_5287>, Integer>();

   public static void method_39696(int var0, Class<? extends class_5287> var1) throws TagRegisterException {
      if (!field_44328.containsKey(var0)) {
         if (!field_44330.containsKey(var1)) {
            field_44328.put(var0, var1);
            field_44330.put(var1, var0);
         } else {
            throw new class_3356("Tag \"" + var1.getSimpleName() + "\" is already registered.");
         }
      } else {
         throw new class_3356("Tag ID \"" + var0 + "\" is already in use.");
      }
   }

   public static void method_39698(int var0) {
      field_44330.remove(method_39695(var0));
      field_44328.remove(var0);
   }

   public static Class<? extends class_5287> method_39695(int var0) {
      return field_44328.containsKey(var0) ? field_44328.get(var0) : null;
   }

   public static int method_39694(Class<? extends class_5287> var0) {
      return field_44330.containsKey(var0) ? field_44330.get(var0) : -1;
   }

   public static class_5287 method_39693(int var0, String var1) throws TagCreateException {
      Class var4 = field_44328.get(var0);
      if (var4 == null) {
         throw new class_4954("Could not find tag with ID \"" + var0 + "\".");
      } else {
         try {
            Constructor var5 = var4.getDeclaredConstructor(String.class);
            var5.setAccessible(true);
            return (class_5287)var5.newInstance(var1);
         } catch (Exception var6) {
            throw new class_4954("Failed to create instance of tag \"" + var4.getSimpleName() + "\".", var6);
         }
      }
   }

   static {
      method_39696(1, class_1456.class);
      method_39696(2, class_6733.class);
      method_39696(3, class_5232.class);
      method_39696(4, class_8735.class);
      method_39696(5, class_520.class);
      method_39696(6, class_7948.class);
      method_39696(7, class_1070.class);
      method_39696(8, class_887.class);
      method_39696(9, class_913.class);
      method_39696(10, class_5531.class);
      method_39696(11, class_7356.class);
      method_39696(12, class_6674.class);
      method_39696(60, class_9042.class);
      method_39696(61, class_9502.class);
      method_39696(65, class_5568.class);
   }
}

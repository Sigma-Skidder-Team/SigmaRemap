package remapped;

import com.google.gson.GsonBuilder;

public class class_5746 {
   private static String[] field_29090;

   public static GsonBuilder method_26000() {
      return new GsonBuilder()
         .registerTypeAdapter(class_7986.class, new class_1486())
         .registerTypeAdapter(class_1066.class, new class_3273())
         .registerTypeAdapter(class_2728.class, new class_4018())
         .registerTypeHierarchyAdapter(class_7279.class, class_5110.method_23433())
         .registerTypeHierarchyAdapter(class_5848.class, new class_4832());
   }

   public static GsonBuilder method_26001() {
      return method_26000()
         .registerTypeAdapter(class_595.class, new class_1584())
         .registerTypeHierarchyAdapter(class_3765.class, class_5570.method_25290())
         .registerTypeHierarchyAdapter(class_2913.class, class_5116.method_23458());
   }

   public static GsonBuilder method_25999() {
      return method_26001().registerTypeAdapter(class_6282.class, new class_5769()).registerTypeAdapter(class_1758.class, new class_3007());
   }
}

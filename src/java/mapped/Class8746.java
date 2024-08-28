package mapped;

import com.google.gson.GsonBuilder;

public class Class8746 {
   private static String[] field39424;

   public static GsonBuilder method31555() {
      return new GsonBuilder()
         .registerTypeAdapter(Class6872.class, new Class2575())
         .registerTypeAdapter(Class6869.class, new Class2578())
         .registerTypeAdapter(Class6871.class, new Class2555())
         .registerTypeHierarchyAdapter(ILootCondition.class, Class8582.method30664())
         .registerTypeHierarchyAdapter(Class2063.class, new Class8500());
   }

   public static GsonBuilder method31556() {
      return method31555()
         .registerTypeAdapter(Class12.class, new Class2573())
         .registerTypeHierarchyAdapter(Class4688.class, Class8695.method31322())
         .registerTypeHierarchyAdapter(ILootFunction.class, LootFunctionManager.func_237450_a_());
   }

   public static GsonBuilder method31557() {
      return method31556().registerTypeAdapter(Class8894.class, new Class2551()).registerTypeAdapter(Class7318.class, new Class2564());
   }
}

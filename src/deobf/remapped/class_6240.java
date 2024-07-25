package remapped;

import java.util.function.Function;

public enum class_6240 {
   field_31935("movement", class_8603::new),
   field_31930("find_tree", class_8174::new),
   field_31932("punch_tree", class_2647::new),
   field_31933("open_inventory", class_515::new),
   field_31934("craft_planks", class_1700::new),
   field_31929("none", class_2934::new);

   private final String field_31937;
   private final Function<class_8827, ? extends class_2274> field_31938;

   private <T extends class_2274> class_6240(String var3, Function<class_8827, T> var4) {
      this.field_31937 = var3;
      this.field_31938 = var4;
   }

   public class_2274 method_28504(class_8827 var1) {
      return this.field_31938.apply(var1);
   }

   public String method_28503() {
      return this.field_31937;
   }

   public static class_6240 method_28502(String var0) {
      for (class_6240 var6 : values()) {
         if (var6.field_31937.equals(var0)) {
            return var6;
         }
      }

      return field_31929;
   }
}

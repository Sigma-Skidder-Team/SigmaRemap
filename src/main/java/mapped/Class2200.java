package mapped;

import java.util.function.Function;

public enum Class2200 {
   field14376("movement", Class6198::new),
   field14377("find_tree", Class6197::new),
   field14378("punch_tree", Class6199::new),
   field14379("open_inventory", Class6195::new),
   field14380("craft_planks", Class6201::new),
   field14381("none", Class6200::new);

   private final String field14382;
   private final Function<Tutorial, ? extends Class6196> field14383;
   private static final Class2200[] field14384 = new Class2200[]{field14376, field14377, field14378, field14379, field14380, field14381};

   private <T extends Class6196> Class2200(String var3, Function<Tutorial, T> var4) {
      this.field14382 = var3;
      this.field14383 = var4;
   }

   public Class6196 method8915(Tutorial var1) {
      return this.field14383.apply(var1);
   }

   public String method8916() {
      return this.field14382;
   }

   public static Class2200 method8917(String var0) {
      for (Class2200 var6 : values()) {
         if (var6.field14382.equals(var0)) {
            return var6;
         }
      }

      return field14381;
   }
}

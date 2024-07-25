package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public enum class_7063 {
   field_36448("replace"),
   field_36450("append"),
   field_36446("merge");

   private final String field_36449;

   public abstract void method_32535(class_8406 var1, class_9257 var2, List<class_8406> var3) throws CommandSyntaxException;

   private class_7063(String var3) {
      this.field_36449 = var3;
   }

   public static class_7063 method_32534(String var0) {
      for (class_7063 var6 : values()) {
         if (var6.field_36449.equals(var0)) {
            return var6;
         }
      }

      throw new IllegalArgumentException("Invalid merge strategy" + var0);
   }
}

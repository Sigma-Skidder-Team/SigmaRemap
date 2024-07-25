package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public enum class_7667 {
   field_38986("vertex", ".vsh", 35633),
   field_38983("fragment", ".fsh", 35632);

   private final String field_38984;
   private final String field_38980;
   private final int field_38985;
   private final Map<String, class_3710> field_38982 = Maps.newHashMap();

   private class_7667(String var3, String var4, int var5) {
      this.field_38984 = var3;
      this.field_38980 = var4;
      this.field_38985 = var5;
   }

   public String method_34734() {
      return this.field_38984;
   }

   public String method_34737() {
      return this.field_38980;
   }

   private int method_34738() {
      return this.field_38985;
   }

   public Map<String, class_3710> method_34733() {
      return this.field_38982;
   }
}

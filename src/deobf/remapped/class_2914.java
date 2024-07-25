package remapped;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class class_2914 implements class_7978 {
   private final Map<String, Integer> field_14234 = new HashMap<String, Integer>();

   public class_2914() {
      this.method_13323("kebab");
      this.method_13323("aztec");
      this.method_13323("alban");
      this.method_13323("aztec2");
      this.method_13323("bomb");
      this.method_13323("plant");
      this.method_13323("wasteland");
      this.method_13323("pool");
      this.method_13323("courbet");
      this.method_13323("sea");
      this.method_13323("sunset");
      this.method_13323("creebet");
      this.method_13323("wanderer");
      this.method_13323("graham");
      this.method_13323("match");
      this.method_13323("bust");
      this.method_13323("stage");
      this.method_13323("void");
      this.method_13323("skullandroses");
      this.method_13323("wither");
      this.method_13323("fighters");
      this.method_13323("pointer");
      this.method_13323("pigscene");
      this.method_13323("burningskull");
      this.method_13323("skeleton");
      this.method_13323("donkeykong");
   }

   private void method_13323(String var1) {
      this.field_14234.put("minecraft:" + var1, this.field_14234.size());
   }

   public Optional<Integer> method_13322(String var1) {
      if (!var1.startsWith("minecraft:")) {
         var1 = "minecraft:" + var1.toLowerCase(Locale.ROOT);
      }

      return Optional.<Integer>ofNullable(this.field_14234.get(var1));
   }
}

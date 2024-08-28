package mapped;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class Class5403 implements Class5402 {
   private final Map<String, Integer> field24086 = new HashMap<String, Integer>();

   public Class5403() {
      this.method16983("kebab");
      this.method16983("aztec");
      this.method16983("alban");
      this.method16983("aztec2");
      this.method16983("bomb");
      this.method16983("plant");
      this.method16983("wasteland");
      this.method16983("pool");
      this.method16983("courbet");
      this.method16983("sea");
      this.method16983("sunset");
      this.method16983("creebet");
      this.method16983("wanderer");
      this.method16983("graham");
      this.method16983("match");
      this.method16983("bust");
      this.method16983("stage");
      this.method16983("void");
      this.method16983("skullandroses");
      this.method16983("wither");
      this.method16983("fighters");
      this.method16983("pointer");
      this.method16983("pigscene");
      this.method16983("burningskull");
      this.method16983("skeleton");
      this.method16983("donkeykong");
   }

   private void method16983(String var1) {
      this.field24086.put("minecraft:" + var1, this.field24086.size());
   }

   public Optional<Integer> method16984(String var1) {
      if (!var1.startsWith("minecraft:")) {
         var1 = "minecraft:" + var1.toLowerCase(Locale.ROOT);
      }

      return Optional.<Integer>ofNullable(this.field24086.get(var1));
   }
}

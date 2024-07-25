package remapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;

public final class class_6997 extends class_1974 {
   private IntSet field_35920;

   public class_6997(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_9080() {
      this.field_35920 = new IntOpenHashSet();

      for (int var3 = 0; var3 < this.field_10006.size(); var3++) {
         Dynamic var4 = this.field_10006.get(var3);
         String var5 = var4.get("Name").asString("");
         if (Objects.equals(var5, "minecraft:trapped_chest")) {
            this.field_35920.add(var3);
         }
      }

      return this.field_35920.isEmpty();
   }

   public boolean method_31999(int var1) {
      return this.field_35920.contains(var1);
   }
}

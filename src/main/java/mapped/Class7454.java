package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;

public final class Class7454 extends Class7452 {
   private IntSet field32067;

   public Class7454(Typed<?> var1, Schema var2) {
      super(var1, var2);
   }

   @Override
   public boolean method24095() {
      this.field32067 = new IntOpenHashSet();

      for (int var3 = 0; var3 < this.field32061.size(); var3++) {
         Dynamic var4 = this.field32061.get(var3);
         String var5 = var4.get("Name").asString("");
         if (Objects.equals(var5, "minecraft:trapped_chest")) {
            this.field32067.add(var3);
         }
      }

      return this.field32067.isEmpty();
   }

   public boolean method24106(int var1) {
      return this.field32067.contains(var1);
   }
}

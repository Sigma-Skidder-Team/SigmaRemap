package mapped;

import java.util.Map;
import java.util.Map.Entry;

public class Class1503 implements Runnable {
   public final Map<BlockPos, Class8189> field8113;
   public final Map<BlockPos, BlockState> field8114;
   public final Class8982 field8115;

   public Class1503(Class8982 var1, Map var2, Map var3) {
      this.field8115 = var1;
      this.field8113 = var2;
      this.field8114 = var3;
   }

   @Override
   public void run() {
      for (Entry<BlockPos, Class8189> var4 : this.field8113.entrySet()) {
         if (var4.getValue() != null) {
            Minecraft.getInstance().world.method6730(var4.getKey(), var4.getValue().field35208);
         }
      }

      for (Entry<BlockPos, BlockState> var6 : this.field8114.entrySet()) {
         if (var6.getValue() != null) {
            Minecraft.getInstance().world.method6730(var6.getKey(), var6.getValue());
         }
      }
   }
}

package mapped;

import net.minecraft.nbt.CompoundNBT;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6252 implements Class6253 {
   private static final Logger field27741 = LogManager.getLogger();

   @Override
   public CompoundNBT method19217(String var1, CompoundNBT var2) {
      return !var1.startsWith("data/minecraft/structures/") ? var2 : method19219(var1, method19218(var2));
   }

   private static CompoundNBT method19218(CompoundNBT var0) {
      if (!var0.contains("DataVersion", 99)) {
         var0.method102("DataVersion", 500);
      }

      return var0;
   }

   private static CompoundNBT method19219(String var0, CompoundNBT var1) {
      Class8969 var4 = new Class8969();
      int var5 = var1.getInt("DataVersion");
      short var6 = 2532;
      if (var5 < 2532) {
         field27741.warn("SNBT Too old, do not forget to update: " + var5 + " < " + 2532 + ": " + var0);
      }

      CompoundNBT var7 = Class8354.method29289(DataFixesManager.getDataFixer(), Class2108.field13753, var1, var5);
      var4.method32913(var7);
      return var4.method32912(new CompoundNBT());
   }
}

package mapped;

import net.minecraft.entity.Entity;

import javax.annotation.Nullable;
import java.util.Random;

public class Class5393 implements Class5391 {
   private static String[] field24037;
   public final Effect field24038;
   public final int field24039;
   public final int field24040;
   private final float field24041;

   public Class5393(Effect var1, int var2, int var3) {
      this.field24038 = var1;
      this.field24039 = var2;
      this.field24040 = var3;
      this.field24041 = 0.05F;
   }

   @Nullable
   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      ItemStack var5 = new ItemStack(Items.field38149, 1);
      Class3284.method11816(var5, this.field24038, this.field24039);
      return new Class9346(new ItemStack(Items.field38049, 1), var5, 12, this.field24040, this.field24041);
   }
}

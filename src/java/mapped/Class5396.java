package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;

import java.util.Random;

public class Class5396 implements Class5391 {
   private static String[] field24054;
   private final Item field24055;
   private final int field24056;
   private final int field24057;
   private final int field24058;
   private final float field24059;

   public Class5396(IItemProvider var1, int var2, int var3, int var4) {
      this.field24055 = var1.method11581();
      this.field24056 = var2;
      this.field24057 = var3;
      this.field24058 = var4;
      this.field24059 = 0.05F;
   }

   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      ItemStack var5 = new ItemStack(this.field24055, this.field24056);
      return new Class9346(var5, new ItemStack(Items.field38049), this.field24057, this.field24058, this.field24059);
   }
}

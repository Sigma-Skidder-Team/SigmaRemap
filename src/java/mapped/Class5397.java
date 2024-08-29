package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class5397 implements Class5391 {
   private static String[] field24060;
   private final ItemStack field24061;
   private final int field24062;
   private final int field24063;
   private final ItemStack field24064;
   private final int field24065;
   private final int field24066;
   private final int field24067;
   private final float field24068;

   public Class5397(Class3303 var1, int var2, Item var3, int var4, int var5, int var6) {
      this(var1, var2, 1, var3, var4, var5, var6);
   }

   public Class5397(Class3303 var1, int var2, int var3, Item var4, int var5, int var6, int var7) {
      this.field24061 = new ItemStack(var1);
      this.field24062 = var2;
      this.field24063 = var3;
      this.field24064 = new ItemStack(var4);
      this.field24065 = var5;
      this.field24066 = var6;
      this.field24067 = var7;
      this.field24068 = 0.05F;
   }

   @Nullable
   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      return new Class9346(
         new ItemStack(Items.field38049, this.field24063),
         new ItemStack(this.field24061.getItem(), this.field24062),
         new ItemStack(this.field24064.getItem(), this.field24065),
         this.field24066,
         this.field24067,
         this.field24068
      );
   }
}

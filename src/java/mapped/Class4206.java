package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public class Class4206 extends Class4194 {
   private boolean field20513;

   public Class4206(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33444, var1);
      this.method12939(var4);
      this.field20495 = this.method12985(var2);
      this.field20444 = var3;
   }

   public Class4206(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33444, var2);
      this.field20513 = var2.method132("Chest");
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method115("Chest", this.field20513);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12986((Class4196)var1, var2, var3, 1, 1);
   }

   public static Class4206 method12999(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return method12989(var9) && Class4178.method12918(var0, var9) == null ? new Class4206(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12928(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, this.field20495, 1, 1, 0);
      this.method12984(var1, var4, var5, Class2213.field14470, 1, 1, 6);
      this.method12927(var1, var5, 3, 1, 2, 3, 1, 4, Blocks.field36615.method11579(), Blocks.field36615.method11579(), false);
      this.method12923(var1, Blocks.field36852.method11579(), 3, 1, 1, var5);
      this.method12923(var1, Blocks.field36852.method11579(), 3, 1, 5, var5);
      this.method12923(var1, Blocks.field36852.method11579(), 3, 2, 2, var5);
      this.method12923(var1, Blocks.field36852.method11579(), 3, 2, 4, var5);

      for (int var10 = 2; var10 <= 4; var10++) {
         this.method12923(var1, Blocks.field36852.method11579(), 2, 1, var10, var5);
      }

      if (!this.field20513 && var5.method38396(new BlockPos(this.method12920(3, 3), this.method12921(2), this.method12922(3, 3)))) {
         this.field20513 = true;
         this.method12933(var1, var5, var4, 3, 2, 3, Class8793.field39557);
      }

      return true;
   }
}

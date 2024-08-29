package mapped;

import java.util.List;
import java.util.Random;

public class Class4195 extends Class4194 {
   private final boolean field20496;

   public Class4195(Class7792 var1, int var2, Random var3, int var4, int var5) {
      super(var1, var2);
      this.field20496 = true;
      this.method12939(Class76.field161.method247(var3));
      this.field20495 = Class2213.field14470;
      if (this.method12938().method544() != Class113.field415) {
         this.field20444 = new Class9764(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      } else {
         this.field20444 = new Class9764(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      }
   }

   public Class4195(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33453, var1);
      this.field20496 = false;
      this.method12939(var4);
      this.field20495 = this.method12985(var2);
      this.field20444 = var3;
   }

   public Class4195(Class7792 var1, CompoundNBT var2) {
      super(var1, var2);
      this.field20496 = var2.method132("Source");
   }

   public Class4195(Class8761 var1, CompoundNBT var2) {
      this(Class7792.field33453, var2);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method115("Source", this.field20496);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      if (this.field20496) {
         Class9331.method35289(Class4200.class);
      }

      this.method12986((Class4196)var1, var2, var3, 1, 1);
   }

   public static Class4195 method12990(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return method12989(var9) && Class4178.method12918(var0, var9) == null ? new Class4195(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12928(var1, var5, 0, 0, 0, 4, 10, 4, true, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, this.field20495, 1, 7, 0);
      this.method12984(var1, var4, var5, Class2213.field14470, 1, 1, 4);
      this.method12923(var1, Blocks.field36615.method11579(), 2, 6, 1, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 1, 5, 1, var5);
      this.method12923(var1, Blocks.field36846.method11579(), 1, 6, 1, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 1, 5, 2, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 1, 4, 3, var5);
      this.method12923(var1, Blocks.field36846.method11579(), 1, 5, 3, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 2, 4, 3, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 3, 3, 3, var5);
      this.method12923(var1, Blocks.field36846.method11579(), 3, 4, 3, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 3, 3, 2, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 3, 2, 1, var5);
      this.method12923(var1, Blocks.field36846.method11579(), 3, 3, 1, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 2, 2, 1, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 1, 1, 1, var5);
      this.method12923(var1, Blocks.field36846.method11579(), 1, 2, 1, var5);
      this.method12923(var1, Blocks.field36615.method11579(), 1, 1, 2, var5);
      this.method12923(var1, Blocks.field36846.method11579(), 1, 1, 3, var5);
      return true;
   }
}

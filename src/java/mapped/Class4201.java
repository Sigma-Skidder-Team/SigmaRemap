package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;

public class Class4201 extends Class4194 {
   private final boolean field20507;
   private final boolean field20508;

   public Class4201(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33455, var1);
      this.method12939(var4);
      this.field20495 = this.method12985(var2);
      this.field20444 = var3;
      this.field20507 = var2.nextInt(2) == 0;
      this.field20508 = var2.nextInt(2) == 0;
   }

   public Class4201(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33455, var2);
      this.field20507 = var2.getBoolean("Left");
      this.field20508 = var2.getBoolean("Right");
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putBoolean("Left", this.field20507);
      var1.putBoolean("Right", this.field20508);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12986((Class4196)var1, var2, var3, 1, 1);
      if (this.field20507) {
         this.method12987((Class4196)var1, var2, var3, 1, 2);
      }

      if (this.field20508) {
         this.method12988((Class4196)var1, var2, var3, 1, 2);
      }
   }

   public static Class4201 method12994(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return method12989(var9) && Class4178.method12918(var0, var9) == null ? new Class4201(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      this.method12928(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, this.field20495, 1, 1, 0);
      this.method12984(var1, var4, var5, Class2213.field14470, 1, 1, 6);
      BlockState var10 = Blocks.WALL_TORCH.method11579().method23465(Class3382.field18985, Direction.EAST);
      BlockState var11 = Blocks.WALL_TORCH.method11579().method23465(Class3382.field18985, Direction.WEST);
      this.method12930(var1, var5, var4, 0.1F, 1, 2, 1, var10);
      this.method12930(var1, var5, var4, 0.1F, 3, 2, 1, var11);
      this.method12930(var1, var5, var4, 0.1F, 1, 2, 5, var10);
      this.method12930(var1, var5, var4, 0.1F, 3, 2, 5, var11);
      if (this.field20507) {
         this.method12927(var1, var5, 0, 1, 2, 0, 3, 4, field20443, field20443, false);
      }

      if (this.field20508) {
         this.method12927(var1, var5, 4, 1, 2, 4, 3, 4, field20443, field20443, false);
      }

      return true;
   }
}

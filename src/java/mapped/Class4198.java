package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public class Class4198 extends Class4197 {
   private static String[] field20501;

   public Class4198(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33451, var1);
      this.method12939(var4);
      this.field20495 = this.method12985(var2);
      this.field20444 = var3;
   }

   public Class4198(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33451, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      Direction var6 = this.method12938();
      if (var6 != Direction.NORTH && var6 != Direction.EAST) {
         this.method12987((Class4196)var1, var2, var3, 1, 1);
      } else {
         this.method12988((Class4196)var1, var2, var3, 1, 1);
      }
   }

   public static Class4198 method12991(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
      return method12989(var9) && Class4178.method12918(var0, var9) == null ? new Class4198(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12928(var1, var5, 0, 0, 0, 4, 4, 4, true, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, this.field20495, 1, 1, 0);
      Direction var10 = this.method12938();
      if (var10 != Direction.NORTH && var10 != Direction.EAST) {
         this.method12927(var1, var5, 0, 1, 1, 0, 3, 3, field20443, field20443, false);
      } else {
         this.method12927(var1, var5, 4, 1, 1, 4, 3, 3, field20443, field20443, false);
      }

      return true;
   }
}

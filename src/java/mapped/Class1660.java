package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;

public interface Class1660 extends Class1678, Class1661 {
   @Override
   default long method6996() {
      return this.getWorldInfo().method20034();
   }

   Class6802<Block> method6860();

   Class6802<Fluid> method6861();

   Class6612 getWorldInfo();

   Class9755 method6807(BlockPos var1);

   default Class2197 method6997() {
      return this.getWorldInfo().method20047();
   }

   Class1702 getChunkProvider();

   @Override
   default boolean method6843(int var1, int var2) {
      return this.getChunkProvider().method7345(var1, var2);
   }

   Random method6814();

   default void func_230547_a_(BlockPos var1, Block var2) {
   }

   void method6742(PlayerEntity var1, BlockPos var2, Class9455 var3, Class2266 var4, float var5, float var6);

   void method6746(Class7436 var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void method6869(PlayerEntity var1, int var2, BlockPos var3, int var4);

   default int method6998() {
      return this.method6812().getLogicalHeight();
   }

   default void playEvent(int var1, BlockPos var2, int var3) {
      this.method6869((PlayerEntity)null, var1, var2, var3);
   }
}

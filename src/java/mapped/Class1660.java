package mapped;

import java.util.Random;

public interface Class1660 extends Class1678, Class1661 {
   @Override
   default long method6996() {
      return this.method6788().method20034();
   }

   Class6802<Block> method6860();

   Class6802<Class7631> method6861();

   Class6612 method6788();

   Class9755 method6807(BlockPos var1);

   default Class2197 method6997() {
      return this.method6788().method20047();
   }

   Class1702 method6883();

   @Override
   default boolean method6843(int var1, int var2) {
      return this.method6883().method7345(var1, var2);
   }

   Random method6814();

   default void method6964(BlockPos var1, Block var2) {
   }

   void method6742(PlayerEntity var1, BlockPos var2, Class9455 var3, Class2266 var4, float var5, float var6);

   void method6746(Class7436 var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void method6869(PlayerEntity var1, int var2, BlockPos var3, int var4);

   default int method6998() {
      return this.method6812().method36884();
   }

   default void method6999(int var1, BlockPos var2, int var3) {
      this.method6869((PlayerEntity)null, var1, var2, var3);
   }
}

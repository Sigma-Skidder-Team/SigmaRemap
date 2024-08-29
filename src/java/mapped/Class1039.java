package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class1039 extends Class1038 {
   private static String[] field5768;

   public Class1039(EntityType<? extends Class1039> var1, World var2) {
      super(var1, var2);
   }

   public static boolean method4666(EntityType<Class1039> var0, Class1659 var1, Class2202 var2, BlockPos var3, Random var4) {
      return method4341(var0, var1, var2, var3, var4) && (var2 == Class2202.field14393 || var1.method7022(var3));
   }

   @Override
   public boolean method4660() {
      return false;
   }

   @Override
   public Class9455 method4241() {
      return Sounds.field26686;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field26689;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field26688;
   }

   @Override
   public Class9455 method4643() {
      return Sounds.field26690;
   }

   @Override
   public boolean method3114(Entity var1) {
      boolean var4 = super.method3114(var1);
      if (var4 && this.method3090().isEmpty() && var1 instanceof Class880) {
         float var5 = this.world.method6807(this.getPosition()).method38328();
         ((Class880)var1).method3035(new Class2023(Class8254.field35483, 140 * (int)var5));
      }

      return var4;
   }

   @Override
   public boolean method4645() {
      return true;
   }

   @Override
   public void method4658() {
      this.method4659(EntityType.field41107);
      if (!this.method3245()) {
         this.world.method6869((PlayerEntity)null, 1041, this.getPosition(), 0);
      }
   }

   @Override
   public ItemStack method4644() {
      return ItemStack.EMPTY;
   }
}

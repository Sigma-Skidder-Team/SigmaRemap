package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class1083 extends Class1082 {
   private static String[] field5948;

   public Class1083(EntityType<? extends Class1083> var1, World var2) {
      super(var1, var2);
   }

   public static boolean method5033(EntityType<Class1083> var0, Class1659 var1, Class2202 var2, BlockPos var3, Random var4) {
      return method4341(var0, var1, var2, var3, var4) && (var2 == Class2202.field14393 || var1.method7022(var3));
   }

   @Override
   public SoundEvent method4241() {
      return Sounds.field27138;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      return Sounds.field27140;
   }

   @Override
   public SoundEvent method2880() {
      return Sounds.field27139;
   }

   @Override
   public SoundEvent method5030() {
      return Sounds.field27141;
   }

   @Override
   public AbstractArrowEntity method5032(ItemStack var1, float var2) {
      AbstractArrowEntity var5 = super.method5032(var1, var2);
      if (var5 instanceof Class887) {
         ((Class887)var5).method3500(new Class2023(Effects.SLOWNESS, 600));
      }

      return var5;
   }
}

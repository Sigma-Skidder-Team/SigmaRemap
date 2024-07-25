package remapped;

import java.util.Random;
import net.minecraft.util.text.ITextComponent;

public class class_3465 extends class_6414 {
   private static String[] field_16972;
   public static final class_7360<class_9249> field_16975 = class_6023.field_30670;
   public static final class_4190 field_16974 = class_6414.method_29292(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   public static final class_4190 field_16973 = class_6414.method_29292(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   public class_3465(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_16975, class_9249.field_47215));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      switch ((class_9249)var1.method_10313(field_16975)) {
         case field_47219:
            return field_16973;
         case field_47215:
         default:
            return field_16974;
      }
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (var2.method_22572().method_40233() && var2.getGameRules().getBoolean(GameRules.field_1028) && var4.nextInt(2000) < var2.method_43370().method_2097()
         )
       {
         while (var2.method_28262(var3).method_8350(this)) {
            var3 = var3.method_6100();
         }

         if (var2.method_28262(var3).method_8305(var2, var3, EntityType.field_34234)) {
            Entity var7 = EntityType.field_34234
               .method_30478(var2, (CompoundNBT)null, (ITextComponent)null, (PlayerEntity)null, var3.method_6081(), class_2417.field_12033, false, false);
            if (var7 != null) {
               var7.method_37157();
            }
         }
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      class_9249 var9 = var2.method_1029();
      class_9249 var10 = var1.<class_9249>method_10313(field_16975);
      boolean var11 = var10 != var9 && var9.method_42629();
      return !var11 && !var3.method_8350(this) && !new class_2018(var4, var5, var10).method_9372()
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      if (!var4.isPassenger() && !var4.method_37151() && var4.method_37148()) {
         var4.method_37213(var3);
      }
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      if (var4.nextInt(100) == 0) {
         var2.method_29527(
            (double)var3.getX() + 0.5,
            (double)var3.method_12165() + 0.5,
            (double)var3.method_12185() + 0.5,
            SoundEvents.field_2758,
            class_562.field_3322,
            0.5F,
            var4.nextFloat() * 0.4F + 0.8F,
            false
         );
      }

      for (int var7 = 0; var7 < 4; var7++) {
         double var8 = (double)var3.getX() + var4.nextDouble();
         double var10 = (double)var3.method_12165() + var4.nextDouble();
         double var12 = (double)var3.method_12185() + var4.nextDouble();
         double var14 = ((double)var4.nextFloat() - 0.5) * 0.5;
         double var16 = ((double)var4.nextFloat() - 0.5) * 0.5;
         double var18 = ((double)var4.nextFloat() - 0.5) * 0.5;
         int var20 = var4.nextInt(2) * 2 - 1;
         if (!var2.method_28262(var3.method_6108()).method_8350(this) && !var2.method_28262(var3.method_6090()).method_8350(this)) {
            var8 = (double)var3.getX() + 0.5 + 0.25 * (double)var20;
            var14 = (double)(var4.nextFloat() * 2.0F * (float)var20);
         } else {
            var12 = (double)var3.method_12185() + 0.5 + 0.25 * (double)var20;
            var18 = (double)(var4.nextFloat() * 2.0F * (float)var20);
         }

         var2.method_43361(class_3090.field_15356, var8, var10, var12, var14, var16, var18);
      }
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      return ItemStack.EMPTY;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      switch (var2) {
         case field_34335:
         case field_34334:
            switch ((class_9249)var1.method_10313(field_16975)) {
               case field_47219:
                  return var1.method_10308(field_16975, class_9249.field_47215);
               case field_47215:
                  return var1.method_10308(field_16975, class_9249.field_47219);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_16975);
   }
}

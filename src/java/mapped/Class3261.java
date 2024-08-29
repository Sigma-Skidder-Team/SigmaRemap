package mapped;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Class3261 extends Class3262 implements Class3260 {
   private boolean field18746 = false;
   private boolean field18747 = false;

   public Class3261(Class5643 var1) {
      super(var1);
   }

   @Override
   public Predicate<ItemStack> method11751() {
      return field18749;
   }

   @Override
   public Predicate<ItemStack> method11752() {
      return field18748;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      if (!method11755(var6)) {
         if (var2.method2983(var6).isEmpty()) {
            return Class6794.<ItemStack>method20699(var6);
         } else {
            if (!method11755(var6)) {
               this.field18746 = false;
               this.field18747 = false;
               var2.method3154(var3);
            }

            return Class6794.<ItemStack>method20697(var6);
         }
      } else {
         method11763(var1, var2, var3, var6, method11770(var6), 1.0F);
         method11756(var6, false);
         return Class6794.<ItemStack>method20697(var6);
      }
   }

   @Override
   public void method11729(ItemStack var1, World var2, Class880 var3, int var4) {
      int var7 = this.method11728(var1) - var4;
      float var8 = method11769(var7, var1);
      if (var8 >= 1.0F && !method11755(var1) && method11753(var3, var1)) {
         method11756(var1, true);
         Class2266 var9 = !(var3 instanceof PlayerEntity) ? Class2266.field14733 : Class2266.field14735;
         var2.method6743(
            (PlayerEntity)null,
            var3.getPosX(),
            var3.getPosY(),
            var3.getPosZ(),
            Sounds.field26488,
            var9,
            1.0F,
            1.0F / (field18735.nextFloat() * 0.5F + 1.0F) + 0.2F
         );
      }
   }

   private static boolean method11753(Class880 var0, ItemStack var1) {
      int var4 = Class7858.method26311(Class8122.field34929, var1);
      int var5 = var4 != 0 ? 3 : 1;
      boolean var6 = var0 instanceof PlayerEntity && ((PlayerEntity)var0).abilities.isCreativeMode;
      ItemStack var7 = var0.method2983(var1);
      ItemStack var8 = var7.copy();

      for (int var9 = 0; var9 < var5; var9++) {
         if (var9 > 0) {
            var7 = var8.copy();
         }

         if (var7.isEmpty() && var6) {
            var7 = new ItemStack(Items.field37797);
            var8 = var7.copy();
         }

         if (!method11754(var0, var1, var7, var9 > 0, var6)) {
            return false;
         }
      }

      return true;
   }

   private static boolean method11754(Class880 var0, ItemStack var1, ItemStack var2, boolean var3, boolean var4) {
      if (var2.isEmpty()) {
         return false;
      } else {
         boolean var7 = var4 && var2.getItem() instanceof Class3308;
         ItemStack var8;
         if (!var7 && !var4 && !var3) {
            var8 = var2.method32106(1);
            if (var2.isEmpty() && var0 instanceof PlayerEntity) {
               ((PlayerEntity)var0).inventory.method4048(var2);
            }
         } else {
            var8 = var2.copy();
         }

         method11757(var1, var8);
         return true;
      }
   }

   public static boolean method11755(ItemStack var0) {
      CompoundNBT var3 = var0.method32142();
      return var3 != null && var3.method132("Charged");
   }

   public static void method11756(ItemStack var0, boolean var1) {
      CompoundNBT var4 = var0.getOrCreateTag();
      var4.method115("Charged", var1);
   }

   private static void method11757(ItemStack var0, ItemStack var1) {
      CompoundNBT var4 = var0.getOrCreateTag();
      ListNBT var5;
      if (!var4.method119("ChargedProjectiles", 9)) {
         var5 = new ListNBT();
      } else {
         var5 = var4.method131("ChargedProjectiles", 10);
      }

      CompoundNBT var6 = new CompoundNBT();
      var1.method32112(var6);
      var5.add(var6);
      var4.put("ChargedProjectiles", var5);
   }

   private static List<ItemStack> method11758(ItemStack var0) {
      ArrayList var3 = Lists.newArrayList();
      CompoundNBT var4 = var0.method32142();
      if (var4 != null && var4.method119("ChargedProjectiles", 9)) {
         ListNBT var5 = var4.method131("ChargedProjectiles", 10);
         if (var5 != null) {
            for (int var6 = 0; var6 < var5.size(); var6++) {
               CompoundNBT var7 = var5.method153(var6);
               var3.add(ItemStack.method32104(var7));
            }
         }
      }

      return var3;
   }

   private static void method11759(ItemStack var0) {
      CompoundNBT var3 = var0.method32142();
      if (var3 != null) {
         ListNBT var4 = var3.method131("ChargedProjectiles", 9);
         var4.clear();
         var3.put("ChargedProjectiles", var4);
      }
   }

   public static boolean method11760(ItemStack var0, Item var1) {
      return method11758(var0).stream().anyMatch(var1x -> var1x.getItem() == var1);
   }

   private static void method11761(
           World var0, Class880 var1, Hand var2, ItemStack var3, ItemStack var4, float var5, boolean var6, float var7, float var8, float var9
   ) {
      if (!var0.isRemote) {
         boolean var12 = var4.getItem() == Items.field38068;
         Object var13;
         if (!var12) {
            var13 = method11762(var0, var1, var3, var4);
            if (var6 || var9 != 0.0F) {
               ((AbstractArrowEntity)var13).field5102 = Class2192.field14333;
            }
         } else {
            var13 = new Class888(var0, var4, var1, var1.getPosX(), var1.method3442() - 0.15F, var1.getPosZ(), true);
         }

         if (!(var1 instanceof Class1023)) {
            Vector3d var14 = var1.method3284(1.0F);
            Class8661 var15 = new Class8661(new Class7680(var14), var9, true);
            Vector3d var16 = var1.method3281(1.0F);
            Class7680 var17 = new Class7680(var16);
            var17.method25283(var15);
            ((Class882)var13).method3462((double)var17.method25269(), (double)var17.method25270(), (double)var17.method25271(), var7, var8);
         } else {
            Class1023 var18 = (Class1023)var1;
            var18.method4536(var18.method4232(), var3, (Class882)var13, var9);
         }

         var3.method32121(!var12 ? 1 : 3, var1, var1x -> var1x.method3185(var2));
         var0.method6916((Entity)var13);
         var0.method6743((PlayerEntity)null, var1.getPosX(), var1.getPosY(), var1.getPosZ(), Sounds.field26494, Class2266.field14735, 1.0F, var5);
      }
   }

   private static AbstractArrowEntity method11762(World var0, Class880 var1, ItemStack var2, ItemStack var3) {
      Class3308 var6 = (Class3308)(!(var3.getItem() instanceof Class3308) ? Items.field37797 : var3.getItem());
      AbstractArrowEntity var7 = var6.method11850(var0, var3, var1);
      if (var1 instanceof PlayerEntity) {
         var7.method3484(true);
      }

      var7.method3471(Sounds.field26487);
      var7.method3494(true);
      int var8 = Class7858.method26311(Class8122.field34931, var2);
      if (var8 > 0) {
         var7.method3485((byte)var8);
      }

      return var7;
   }

   public static void method11763(World var0, Class880 var1, Hand var2, ItemStack var3, float var4, float var5) {
      List var8 = method11758(var3);
      float[] var9 = method11764(var1.method3013());

      for (int var10 = 0; var10 < var8.size(); var10++) {
         ItemStack var11 = (ItemStack)var8.get(var10);
         boolean var12 = var1 instanceof PlayerEntity && ((PlayerEntity)var1).abilities.isCreativeMode;
         if (!var11.isEmpty()) {
            if (var10 != 0) {
               if (var10 != 1) {
                  if (var10 == 2) {
                     method11761(var0, var1, var2, var3, var11, var9[var10], var12, var4, var5, 10.0F);
                  }
               } else {
                  method11761(var0, var1, var2, var3, var11, var9[var10], var12, var4, var5, -10.0F);
               }
            } else {
               method11761(var0, var1, var2, var3, var11, var9[var10], var12, var4, var5, 0.0F);
            }
         }
      }

      method11766(var0, var1, var3);
   }

   private static float[] method11764(Random var0) {
      boolean var3 = var0.nextBoolean();
      return new float[]{1.0F, method11765(var3), method11765(!var3)};
   }

   private static float method11765(boolean var0) {
      float var3 = !var0 ? 0.43F : 0.63F;
      return 1.0F / (field18735.nextFloat() * 0.5F + 1.8F) + var3;
   }

   private static void method11766(World var0, Class880 var1, ItemStack var2) {
      if (var1 instanceof ServerPlayerEntity) {
         ServerPlayerEntity var5 = (ServerPlayerEntity)var1;
         if (!var0.isRemote) {
            CriteriaTriggers.field44496.method15103(var5, var2);
         }

         var5.method2913(Class8876.field40098.method172(var2.getItem()));
      }

      method11759(var2);
   }

   @Override
   public void method11704(World var1, Class880 var2, ItemStack var3, int var4) {
      if (!var1.isRemote) {
         int var7 = Class7858.method26311(Class8122.field34930, var3);
         Class9455 var8 = this.method11768(var7);
         Class9455 var9 = var7 != 0 ? null : Sounds.field26489;
         float var10 = (float)(var3.method32137() - var4) / (float)method11767(var3);
         if (var10 < 0.2F) {
            this.field18746 = false;
            this.field18747 = false;
         }

         if (var10 >= 0.2F && !this.field18746) {
            this.field18746 = true;
            var1.method6743((PlayerEntity)null, var2.getPosX(), var2.getPosY(), var2.getPosZ(), var8, Class2266.field14735, 0.5F, 1.0F);
         }

         if (var10 >= 0.5F && var9 != null && !this.field18747) {
            this.field18747 = true;
            var1.method6743((PlayerEntity)null, var2.getPosX(), var2.getPosY(), var2.getPosZ(), var9, Class2266.field14735, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int method11728(ItemStack var1) {
      return method11767(var1) + 3;
   }

   public static int method11767(ItemStack var0) {
      int var3 = Class7858.method26311(Class8122.field34930, var0);
      return var3 != 0 ? 25 - 5 * var3 : 25;
   }

   @Override
   public Class2103 method11727(ItemStack var1) {
      return Class2103.field13712;
   }

   private Class9455 method11768(int var1) {
      switch (var1) {
         case 1:
            return Sounds.field26491;
         case 2:
            return Sounds.field26492;
         case 3:
            return Sounds.field26493;
         default:
            return Sounds.field26490;
      }
   }

   private static float method11769(int var0, ItemStack var1) {
      float var4 = (float)var0 / (float)method11767(var1);
      if (var4 > 1.0F) {
         var4 = 1.0F;
      }

      return var4;
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      List var7 = method11758(var1);
      if (method11755(var1) && !var7.isEmpty()) {
         ItemStack var8 = (ItemStack)var7.get(0);
         var3.add(new TranslationTextComponent("item.minecraft.crossbow.projectile").appendString(" ").append(var8.method32173()));
         if (var4.method8944() && var8.getItem() == Items.field38068) {
            ArrayList var9 = Lists.newArrayList();
            Items.field38068.method11730(var8, var2, var9, var4);
            if (!var9.isEmpty()) {
               for (int var10 = 0; var10 < var9.size(); var10++) {
                  var9.set(var10, new StringTextComponent("  ").append((ITextComponent)var9.get(var10)).mergeStyle(TextFormatting.GRAY));
               }

               var3.addAll(var9);
            }
         }
      }
   }

   private static float method11770(ItemStack var0) {
      return var0.getItem() == Items.field38148 && method11760(var0, Items.field38068) ? 1.6F : 3.15F;
   }

   @Override
   public int method11771() {
      return 8;
   }
}

package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Class5843 extends Class5839 {
   private static String[] field25587;
   public final Class2106 field25588;
   public final Class5830 field25589;

   public Class5843(Class5830 var1, Class920 var2, int var3, int var4, int var5, Class2106 var6) {
      super(var2, var3, var4, var5);
      this.field25589 = var1;
      this.field25588 = var6;
   }

   @Override
   public int method18269() {
      return 1;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return this.field25588 == Class1006.method4271(var1);
   }

   @Override
   public boolean method18273(PlayerEntity var1) {
      ItemStack var4 = this.method18265();
      return !var4.isEmpty() && !var1.isCreative() && Class7858.method26334(var4) ? false : super.method18273(var1);
   }

   @Override
   public Pair<ResourceLocation, ResourceLocation> method18271() {
      return Pair.of(Class5830.field25539, Class5830.method18233()[this.field25588.method8773()]);
   }
}

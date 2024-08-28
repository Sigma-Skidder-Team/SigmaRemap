package mapped;

import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class Class5848 extends Class5839 {
   private static String[] field25576;
   private final Class5839 field25596;

   public Class5848(Class5839 var1, int var2, int var3, int var4) {
      super(var1.field25578, var2, var3, var4);
      this.field25596 = var1;
   }

   @Override
   public ItemStack method18264(PlayerEntity var1, ItemStack var2) {
      return this.field25596.method18264(var1, var2);
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return this.field25596.method18259(var1);
   }

   @Override
   public ItemStack method18265() {
      return this.field25596.method18265();
   }

   @Override
   public boolean method18266() {
      return this.field25596.method18266();
   }

   @Override
   public void method18267(ItemStack var1) {
      this.field25596.method18267(var1);
   }

   @Override
   public void method18268() {
      this.field25596.method18268();
   }

   @Override
   public int method18269() {
      return this.field25596.method18269();
   }

   @Override
   public int method18270(ItemStack var1) {
      return this.field25596.method18270(var1);
   }

   @Nullable
   @Override
   public Pair<ResourceLocation, ResourceLocation> method18271() {
      return this.field25596.method18271();
   }

   @Override
   public ItemStack method18272(int var1) {
      return this.field25596.method18272(var1);
   }

   @Override
   public boolean method18274() {
      return this.field25596.method18274();
   }

   @Override
   public boolean method18273(PlayerEntity var1) {
      return this.field25596.method18273(var1);
   }

   // $VF: synthetic method
   public static Class5839 method18276(Class5848 var0) {
      return var0.field25596;
   }
}

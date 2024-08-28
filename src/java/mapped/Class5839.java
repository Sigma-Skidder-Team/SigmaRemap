package mapped;

import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class Class5839 {
   private static String[] field25576;
   private final int field25577;
   public final Class920 field25578;
   public int field25579;
   public final int field25580;
   public final int field25581;

   public Class5839(Class920 var1, int var2, int var3, int var4) {
      this.field25578 = var1;
      this.field25577 = var2;
      this.field25580 = var3;
      this.field25581 = var4;
   }

   public void method18260(ItemStack var1, ItemStack var2) {
      int var5 = var2.method32179() - var1.method32179();
      if (var5 > 0) {
         this.method18261(var2, var5);
      }
   }

   public void method18261(ItemStack var1, int var2) {
   }

   public void method18262(int var1) {
   }

   public void method18263(ItemStack var1) {
   }

   public ItemStack method18264(PlayerEntity var1, ItemStack var2) {
      this.method18268();
      return var2;
   }

   public boolean method18259(ItemStack var1) {
      return true;
   }

   public ItemStack method18265() {
      return this.field25578.method3618(this.field25577);
   }

   public boolean method18266() {
      return !this.method18265().method32105();
   }

   public void method18267(ItemStack var1) {
      this.field25578.method3621(this.field25577, var1);
      this.method18268();
   }

   public void method18268() {
      this.field25578.method3622();
   }

   public int method18269() {
      return this.field25578.method3630();
   }

   public int method18270(ItemStack var1) {
      return this.method18269();
   }

   @Nullable
   public Pair<ResourceLocation, ResourceLocation> method18271() {
      return null;
   }

   public ItemStack method18272(int var1) {
      return this.field25578.method3619(this.field25577, var1);
   }

   public boolean method18273(PlayerEntity var1) {
      return true;
   }

   public boolean method18274() {
      return true;
   }
}

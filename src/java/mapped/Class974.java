package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;
import java.util.function.Predicate;

public class Class974 implements Class920, Class933 {
   public final Class25<ItemStack> field5439 = Class25.<ItemStack>method68(36, ItemStack.EMPTY);
   public final Class25<ItemStack> field5440 = Class25.<ItemStack>method68(4, ItemStack.EMPTY);
   public final Class25<ItemStack> field5441 = Class25.<ItemStack>method68(1, ItemStack.EMPTY);
   private final List<Class25<ItemStack>> field5442 = ImmutableList.of(this.field5439, this.field5440, this.field5441);
   public int field5443;
   public final PlayerEntity field5444;
   private ItemStack field5445 = ItemStack.EMPTY;
   private int field5446;

   public Class974(PlayerEntity var1) {
      this.field5444 = var1;
   }

   public ItemStack method4028() {
      return !method4035(this.field5443) ? ItemStack.EMPTY : this.field5439.get(this.field5443);
   }

   public static int method4029() {
      return 9;
   }

   private boolean method4030(ItemStack var1, ItemStack var2) {
      return !var1.method32105()
         && this.method4031(var1, var2)
         && var1.method32114()
         && var1.method32179() < var1.method32113()
         && var1.method32179() < this.method3630();
   }

   private boolean method4031(ItemStack var1, ItemStack var2) {
      return var1.method32107() == var2.method32107() && ItemStack.method32127(var1, var2);
   }

   public int method4032() {
      for (int var3 = 0; var3 < this.field5439.size(); var3++) {
         if (this.field5439.get(var3).method32105()) {
            return var3;
         }
      }

      return -1;
   }

   public void method4033(ItemStack var1) {
      int var4 = this.method4036(var1);
      if (!method4035(var4)) {
         if (var4 != -1) {
            this.method4034(var4);
         } else {
            this.field5443 = this.method4038();
            if (!this.field5439.get(this.field5443).method32105()) {
               int var5 = this.method4032();
               if (var5 != -1) {
                  this.field5439.set(var5, this.field5439.get(this.field5443));
               }
            }

            this.field5439.set(this.field5443, var1);
         }
      } else {
         this.field5443 = var4;
      }
   }

   public void method4034(int var1) {
      this.field5443 = this.method4038();
      ItemStack var4 = this.field5439.get(this.field5443);
      this.field5439.set(this.field5443, this.field5439.get(var1));
      this.field5439.set(var1, var4);
   }

   public static boolean method4035(int var0) {
      return var0 >= 0 && var0 < 9;
   }

   public int method4036(ItemStack var1) {
      for (int var4 = 0; var4 < this.field5439.size(); var4++) {
         if (!this.field5439.get(var4).method32105() && this.method4031(var1, this.field5439.get(var4))) {
            return var4;
         }
      }

      return -1;
   }

   public int method4037(ItemStack var1) {
      for (int var4 = 0; var4 < this.field5439.size(); var4++) {
         ItemStack var5 = this.field5439.get(var4);
         if (!this.field5439.get(var4).method32105()
            && this.method4031(var1, this.field5439.get(var4))
            && !this.field5439.get(var4).method32116()
            && !var5.method32163()
            && !var5.method32152()) {
            return var4;
         }
      }

      return -1;
   }

   public int method4038() {
      for (int var3 = 0; var3 < 9; var3++) {
         int var4 = (this.field5443 + var3) % 9;
         if (this.field5439.get(var4).method32105()) {
            return var4;
         }
      }

      for (int var5 = 0; var5 < 9; var5++) {
         int var6 = (this.field5443 + var5) % 9;
         if (!this.field5439.get(var6).method32163()) {
            return var6;
         }
      }

      return this.field5443;
   }

   public void method4039(double var1) {
      if (var1 > 0.0) {
         var1 = 1.0;
      }

      if (var1 < 0.0) {
         var1 = -1.0;
      }

      this.field5443 = (int)((double)this.field5443 - var1);

      while (this.field5443 < 0) {
         this.field5443 += 9;
      }

      while (this.field5443 >= 9) {
         this.field5443 -= 9;
      }
   }

   public int method4040(Predicate<ItemStack> var1, int var2, Class920 var3) {
      int var6 = 0;
      boolean var7 = var2 == 0;
      var6 += Class7920.method26568(this, var1, var2 - var6, var7);
      var6 += Class7920.method26568(var3, var1, var2 - var6, var7);
      var6 += Class7920.method26569(this.field5445, var1, var2 - var6, var7);
      if (this.field5445.method32105()) {
         this.field5445 = ItemStack.EMPTY;
      }

      return var6;
   }

   private int method4041(ItemStack var1) {
      int var4 = this.method4043(var1);
      if (var4 == -1) {
         var4 = this.method4032();
      }

      return var4 != -1 ? this.method4042(var4, var1) : var1.method32179();
   }

   private int method4042(int var1, ItemStack var2) {
      Class3257 var5 = var2.method32107();
      int var6 = var2.method32179();
      ItemStack var7 = this.method3618(var1);
      if (var7.method32105()) {
         var7 = new ItemStack(var5, 0);
         if (var2.method32141()) {
            var7.method32148(var2.method32142().method79());
         }

         this.method3621(var1, var7);
      }

      int var8 = var6;
      if (var6 > var7.method32113() - var7.method32179()) {
         var8 = var7.method32113() - var7.method32179();
      }

      if (var8 > this.method3630() - var7.method32179()) {
         var8 = this.method3630() - var7.method32179();
      }

      if (var8 != 0) {
         var6 -= var8;
         var7.method32181(var8);
         var7.method32178(5);
         return var6;
      } else {
         return var6;
      }
   }

   public int method4043(ItemStack var1) {
      if (this.method4030(this.method3618(this.field5443), var1)) {
         return this.field5443;
      } else if (this.method4030(this.method3618(40), var1)) {
         return 40;
      } else {
         for (int var4 = 0; var4 < this.field5439.size(); var4++) {
            if (this.method4030(this.field5439.get(var4), var1)) {
               return var4;
            }
         }

         return -1;
      }
   }

   public void method4044() {
      for (Class25 var4 : this.field5442) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            if (!((ItemStack)var4.get(var5)).method32105()) {
               ((ItemStack)var4.get(var5)).method32135(this.field5444.field5024, this.field5444, var5, this.field5443 == var5);
            }
         }
      }
   }

   public boolean method4045(ItemStack var1) {
      return this.method4046(-1, var1);
   }

   public boolean method4046(int var1, ItemStack var2) {
      if (var2.method32105()) {
         return false;
      } else {
         try {
            if (var2.method32116()) {
               if (var1 == -1) {
                  var1 = this.method4032();
               }

               if (var1 >= 0) {
                  this.field5439.set(var1, var2.copy());
                  this.field5439.get(var1).method32178(5);
                  var2.method32180(0);
                  return true;
               } else if (this.field5444.field4919.field29609) {
                  var2.method32180(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int var5;
               do {
                  var5 = var2.method32179();
                  if (var1 == -1) {
                     var2.method32180(this.method4041(var2));
                  } else {
                     var2.method32180(this.method4042(var1, var2));
                  }
               } while (!var2.method32105() && var2.method32179() < var5);

               if (var2.method32179() == var5 && this.field5444.field4919.field29609) {
                  var2.method32180(0);
                  return true;
               } else {
                  return var2.method32179() < var5;
               }
            }
         } catch (Throwable var8) {
            Class4526 var6 = Class4526.method14413(var8, "Adding item to inventory");
            Class8965 var7 = var6.method14410("Item being added");
            var7.method32807("Item ID", Class3257.method11701(var2.method32107()));
            var7.method32807("Item data", var2.method32117());
            var7.method32806("Item name", () -> var2.method32149().getString());
            throw new Class2506(var6);
         }
      }
   }

   public void method4047(World var1, ItemStack var2) {
      if (!var1.field9020) {
         while (!var2.method32105()) {
            int var5 = this.method4043(var2);
            if (var5 == -1) {
               var5 = this.method4032();
            }

            if (var5 == -1) {
               this.field5444.method2882(var2, false);
               break;
            }

            int var6 = var2.method32113() - this.method3618(var5).method32179();
            if (this.method4046(var5, var2.method32106(var6))) {
               ((ServerPlayerEntity)this.field5444).field4855.sendPacket(new Class5501(-2, var5, this.method3618(var5)));
            }
         }
      }
   }

   @Override
   public ItemStack method3619(int var1, int var2) {
      Class25 var5 = null;

      for (Class25 var7 : this.field5442) {
         if (var1 < var7.size()) {
            var5 = var7;
            break;
         }

         var1 -= var7.size();
      }

      return var5 != null && !((ItemStack)var5.get(var1)).method32105() ? Class7920.method26563(var5, var1, var2) : ItemStack.EMPTY;
   }

   public void method4048(ItemStack var1) {
      for (Class25 var5 : this.field5442) {
         for (int var6 = 0; var6 < var5.size(); var6++) {
            if (var5.get(var6) == var1) {
               var5.set(var6, ItemStack.EMPTY);
               break;
            }
         }
      }
   }

   @Override
   public ItemStack method3620(int var1) {
      Class25 var4 = null;

      for (Class25 var6 : this.field5442) {
         if (var1 < var6.size()) {
            var4 = var6;
            break;
         }

         var1 -= var6.size();
      }

      if (var4 != null && !((ItemStack)var4.get(var1)).method32105()) {
         ItemStack var7 = (ItemStack)var4.get(var1);
         var4.set(var1, ItemStack.EMPTY);
         return var7;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public void method3621(int var1, ItemStack var2) {
      Class25 var5 = null;

      for (Class25 var7 : this.field5442) {
         if (var1 < var7.size()) {
            var5 = var7;
            break;
         }

         var1 -= var7.size();
      }

      if (var5 != null) {
         var5.set(var1, var2);
      }
   }

   public float method4049(Class7380 var1) {
      return this.field5439.get(this.field5443).method32109(var1);
   }

   public Class41 method4050(Class41 var1) {
      for (int var4 = 0; var4 < this.field5439.size(); var4++) {
         if (!this.field5439.get(var4).method32105()) {
            Class39 var5 = new Class39();
            var5.method100("Slot", (byte)var4);
            this.field5439.get(var4).method32112(var5);
            var1.add(var5);
         }
      }

      for (int var6 = 0; var6 < this.field5440.size(); var6++) {
         if (!this.field5440.get(var6).method32105()) {
            Class39 var8 = new Class39();
            var8.method100("Slot", (byte)(var6 + 100));
            this.field5440.get(var6).method32112(var8);
            var1.add(var8);
         }
      }

      for (int var7 = 0; var7 < this.field5441.size(); var7++) {
         if (!this.field5441.get(var7).method32105()) {
            Class39 var9 = new Class39();
            var9.method100("Slot", (byte)(var7 + 150));
            this.field5441.get(var7).method32112(var9);
            var1.add(var9);
         }
      }

      return var1;
   }

   public void method4051(Class41 var1) {
      this.field5439.clear();
      this.field5440.clear();
      this.field5441.clear();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         Class39 var5 = var1.method153(var4);
         int var6 = var5.method120("Slot") & 255;
         ItemStack var7 = ItemStack.method32104(var5);
         if (!var7.method32105()) {
            if (var6 >= 0 && var6 < this.field5439.size()) {
               this.field5439.set(var6, var7);
            } else if (var6 >= 100 && var6 < this.field5440.size() + 100) {
               this.field5440.set(var6 - 100, var7);
            } else if (var6 >= 150 && var6 < this.field5441.size() + 150) {
               this.field5441.set(var6 - 150, var7);
            }
         }
      }
   }

   @Override
   public int method3629() {
      return this.field5439.size() + this.field5440.size() + this.field5441.size();
   }

   @Override
   public boolean method3617() {
      for (ItemStack var4 : this.field5439) {
         if (!var4.method32105()) {
            return false;
         }
      }

      for (ItemStack var7 : this.field5440) {
         if (!var7.method32105()) {
            return false;
         }
      }

      for (ItemStack var8 : this.field5441) {
         if (!var8.method32105()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack method3618(int var1) {
      Class25 var4 = null;

      for (Class25 var6 : this.field5442) {
         if (var1 < var6.size()) {
            var4 = var6;
            break;
         }

         var1 -= var6.size();
      }

      return var4 != null ? (ItemStack)var4.get(var1) : ItemStack.EMPTY;
   }

   @Override
   public ITextComponent getName() {
      return new TranslationTextComponent("container.inventory");
   }

   public ItemStack method4052(int var1) {
      return this.field5440.get(var1);
   }

   public void method4053(Class8654 var1, float var2) {
      if (!(var2 <= 0.0F)) {
         var2 /= 4.0F;
         if (var2 < 1.0F) {
            var2 = 1.0F;
         }

         for (int var5 = 0; var5 < this.field5440.size(); var5++) {
            ItemStack var6 = this.field5440.get(var5);
            if ((!var1.method31141() || !var6.method32107().method11748()) && var6.method32107() instanceof Class3279) {
               int var7 = var5;
               var6.method32121((int)var2, this.field5444, var1x -> var1x.method3184(Class2106.method8777(Class1969.field12837, var7)));
            }
         }
      }
   }

   public void method4054() {
      for (List var4 : this.field5442) {
         for (int var5 = 0; var5 < var4.size(); var5++) {
            ItemStack var6 = (ItemStack)var4.get(var5);
            if (!var6.method32105()) {
               this.field5444.method2836(var6, true, false);
               var4.set(var5, ItemStack.EMPTY);
            }
         }
      }
   }

   @Override
   public void method3622() {
      this.field5446++;
   }

   public int method4055() {
      return this.field5446;
   }

   public void method4056(ItemStack var1) {
      this.field5445 = var1;
   }

   public ItemStack method4057() {
      return this.field5445;
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return !this.field5444.field5041 ? !(var1.getDistanceSq(this.field5444) > 64.0) : false;
   }

   public boolean method4058(ItemStack var1) {
      for (Class25<ItemStack> var5 : this.field5442) {
         for (ItemStack var7 : var5) {
            if (!var7.method32105() && var7.method32132(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method4059(Class7608<Class3257> var1) {
      for (Class25<ItemStack> var5 : this.field5442) {
         for (ItemStack var7 : var5) {
            if (!var7.method32105() && var1.method24917(var7.method32107())) {
               return true;
            }
         }
      }

      return false;
   }

   public void method4060(Class974 var1) {
      for (int var4 = 0; var4 < this.method3629(); var4++) {
         this.method3621(var4, var1.method3618(var4));
      }

      this.field5443 = var1.field5443;
   }

   @Override
   public void method3625() {
      for (List var4 : this.field5442) {
         var4.clear();
      }
   }

   public void method4061(Class6207 var1) {
      for (ItemStack var5 : this.field5439) {
         var1.method19116(var5);
      }
   }
}

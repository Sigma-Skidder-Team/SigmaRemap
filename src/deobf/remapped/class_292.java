package remapped;

import javax.annotation.Nullable;

public abstract class class_292 extends AbstractMinecartEntity implements class_6867, class_4259 {
   private class_2831<ItemStack> field_1062 = class_2831.<ItemStack>method_12872(36, ItemStack.EMPTY);
   private boolean field_1061 = true;
   private Identifier field_1063;
   private long field_1064;

   public class_292(class_6629<?> var1, World var2) {
      super(var1, var2);
   }

   public class_292(class_6629<?> var1, double var2, double var4, double var6, World var8) {
      super(var1, var8, var2, var4, var6);
   }

   @Override
   public void method_4743(DamageSource var1) {
      super.method_4743(var1);
      if (this.world.method_29537().method_1285(class_291.field_1024)) {
         class_1573.method_7105(this.world, this, this);
         if (!this.world.field_33055) {
            Entity var4 = var1.method_28353();
            if (var4 != null && var4.method_37387() == class_6629.field_34300) {
               class_134.method_474((class_704)var4, true);
            }
         }
      }
   }

   @Override
   public boolean method_31495() {
      for (ItemStack var4 : this.field_1062) {
         if (!var4.method_28022()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack method_31498(int var1) {
      this.method_1298((class_704)null);
      return this.field_1062.get(var1);
   }

   @Override
   public ItemStack method_31497(int var1, int var2) {
      this.method_1298((class_704)null);
      return class_3037.method_13881(this.field_1062, var1, var2);
   }

   @Override
   public ItemStack method_31507(int var1) {
      this.method_1298((class_704)null);
      ItemStack var4 = this.field_1062.get(var1);
      if (!var4.method_28022()) {
         this.field_1062.set(var1, ItemStack.EMPTY);
         return var4;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public void method_31503(int var1, ItemStack var2) {
      this.method_1298((class_704)null);
      this.field_1062.set(var1, var2);
      if (!var2.method_28022() && var2.method_27997() > this.method_31506()) {
         var2.method_28017(this.method_31506());
      }
   }

   @Override
   public boolean method_37166(int var1, ItemStack var2) {
      if (var1 >= 0 && var1 < this.method_31505()) {
         this.method_31503(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_17407() {
   }

   @Override
   public boolean method_31502(class_704 var1) {
      return !this.field_41751 ? !(var1.method_37275(this) > 64.0) : false;
   }

   @Nullable
   @Override
   public Entity method_37326(class_6331 var1) {
      this.field_1061 = false;
      return super.method_37326(var1);
   }

   @Override
   public void method_37204() {
      if (!this.world.field_33055 && this.field_1061) {
         class_1573.method_7105(this.world, this, this);
      }

      super.method_37204();
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      if (this.field_1063 == null) {
         class_3037.method_13878(var1, this.field_1062);
      } else {
         var1.method_25941("LootTable", this.field_1063.toString());
         if (this.field_1064 != 0L) {
            var1.method_25949("LootTableSeed", this.field_1064);
         }
      }
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_1062 = class_2831.<ItemStack>method_12872(this.method_31505(), ItemStack.EMPTY);
      if (!var1.contains("LootTable", 8)) {
         class_3037.method_13882(var1, this.field_1062);
      } else {
         this.field_1063 = new Identifier(var1.method_25965("LootTable"));
         this.field_1064 = var1.method_25948("LootTableSeed");
      }
   }

   @Override
   public class_6910 method_37128(class_704 var1, Hand var2) {
      var1.method_3152(this);
      if (var1.world.field_33055) {
         return class_6910.field_35520;
      } else {
         class_134.method_474(var1, true);
         return class_6910.field_35518;
      }
   }

   @Override
   public void method_4755() {
      float var3 = 0.98F;
      if (this.field_1063 == null) {
         int var4 = 15 - class_4088.method_18870(this);
         var3 += (float)var4 * 0.001F;
      }

      this.method_37215(this.method_37098().method_6210((double)var3, 0.0, (double)var3));
   }

   public void method_1298(class_704 var1) {
      if (this.field_1063 != null && this.world.method_29522() != null) {
         class_1758 var4 = this.world.method_29522().method_1722().method_4604(this.field_1063);
         if (var1 instanceof class_9359) {
            class_8807.field_45075.method_27870((class_9359)var1, this.field_1063);
         }

         this.field_1063 = null;
         class_8480 var5 = new class_8480((class_6331)this.world).method_39065(class_8712.field_44671, this.method_37245()).method_39067(this.field_1064);
         if (var1 != null) {
            var5.method_39063(var1.method_3234()).method_39065(class_8712.field_44676, var1);
         }

         var4.method_7872(this, var5.method_39064(class_4933.field_25565));
      }
   }

   @Override
   public void method_24975() {
      this.method_1298((class_704)null);
      this.field_1062.clear();
   }

   public void method_1297(Identifier var1, long var2) {
      this.field_1063 = var1;
      this.field_1064 = var2;
   }

   @Nullable
   @Override
   public class_4088 method_11419(int var1, class_7051 var2, class_704 var3) {
      if (this.field_1063 != null && var3.method_37221()) {
         return null;
      } else {
         this.method_1298(var2.field_36409);
         return this.method_1296(var1, var2);
      }
   }

   public abstract class_4088 method_1296(int var1, class_7051 var2);
}

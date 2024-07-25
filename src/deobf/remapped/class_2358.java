package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_2358 extends class_8346 {
   public Identifier field_11837;
   public long field_11836;

   public class_2358(class_133<?> var1) {
      super(var1);
   }

   public static void method_10817(class_6163 var0, Random var1, BlockPos var2, Identifier var3) {
      class_3757 var6 = var0.method_28260(var2);
      if (var6 instanceof class_2358) {
         ((class_2358)var6).method_10816(var3, var1.nextLong());
      }
   }

   public boolean method_10811(CompoundNBT var1) {
      if (!var1.contains("LootTable", 8)) {
         return false;
      } else {
         this.field_11837 = new Identifier(var1.method_25965("LootTable"));
         this.field_11836 = var1.method_25948("LootTableSeed");
         return true;
      }
   }

   public boolean method_10815(CompoundNBT var1) {
      if (this.field_11837 != null) {
         var1.method_25941("LootTable", this.field_11837.toString());
         if (this.field_11836 != 0L) {
            var1.method_25949("LootTableSeed", this.field_11836);
         }

         return true;
      } else {
         return false;
      }
   }

   public void method_10812(class_704 var1) {
      if (this.field_11837 != null && this.field_18364.method_29522() != null) {
         class_1758 var4 = this.field_18364.method_29522().method_1722().method_4604(this.field_11837);
         if (var1 instanceof class_9359) {
            class_8807.field_45075.method_27870((class_9359)var1, this.field_11837);
         }

         this.field_11837 = null;
         class_8480 var5 = new class_8480((class_6331)this.field_18364)
            .method_39065(class_8712.field_44671, class_1343.method_6216(this.field_18358))
            .method_39067(this.field_11836);
         if (var1 != null) {
            var5.method_39063(var1.method_3234()).method_39065(class_8712.field_44676, var1);
         }

         var4.method_7872(this, var5.method_39064(class_4933.field_25565));
      }
   }

   public void method_10816(Identifier var1, long var2) {
      this.field_11837 = var1;
      this.field_11836 = var2;
   }

   @Override
   public boolean method_31495() {
      this.method_10812((class_704)null);
      return this.method_10814().stream().allMatch(ItemStack::method_28022);
   }

   @Override
   public ItemStack method_31498(int var1) {
      this.method_10812((class_704)null);
      return this.method_10814().get(var1);
   }

   @Override
   public ItemStack method_31497(int var1, int var2) {
      this.method_10812((class_704)null);
      ItemStack var5 = class_3037.method_13881(this.method_10814(), var1, var2);
      if (!var5.method_28022()) {
         this.method_17407();
      }

      return var5;
   }

   @Override
   public ItemStack method_31507(int var1) {
      this.method_10812((class_704)null);
      return class_3037.method_13880(this.method_10814(), var1);
   }

   @Override
   public void method_31503(int var1, ItemStack var2) {
      this.method_10812((class_704)null);
      this.method_10814().set(var1, var2);
      if (var2.method_27997() > this.method_31506()) {
         var2.method_28017(this.method_31506());
      }

      this.method_17407();
   }

   @Override
   public boolean method_31502(class_704 var1) {
      return this.field_18364.method_28260(this.field_18358) == this
         ? !(
            var1.method_37273(
                  (double)this.field_18358.method_12173() + 0.5, (double)this.field_18358.method_12165() + 0.5, (double)this.field_18358.method_12185() + 0.5
               )
               > 64.0
         )
         : false;
   }

   @Override
   public void method_24975() {
      this.method_10814().clear();
   }

   public abstract class_2831<ItemStack> method_10814();

   public abstract void method_10813(class_2831<ItemStack> var1);

   @Override
   public boolean method_38430(class_704 var1) {
      return super.method_38430(var1) && (this.field_11837 == null || !var1.method_37221());
   }

   @Nullable
   @Override
   public class_4088 method_11419(int var1, class_7051 var2, class_704 var3) {
      if (!this.method_38430(var3)) {
         return null;
      } else {
         this.method_10812(var2.field_36409);
         return this.method_38431(var1, var2);
      }
   }
}

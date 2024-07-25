package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;

public class class_1665 extends class_5920<class_7666> {
   private static String[] field_8623;
   private ItemStack field_8625;
   private final List<ItemStack> field_8624 = Lists.newArrayList();
   private int field_8627;
   private int field_8622;
   private int field_8626;

   public class_1665(int var1, int var2) {
      super(ImmutableMap.of(class_6044.field_30861, class_561.field_3320), var1, var2);
   }

   public boolean method_7418(class_6331 var1, class_7666 var2) {
      class_1150 var5 = var2.method_26525();
      if (!var5.<class_5834>method_5138(class_6044.field_30861).isPresent()) {
         return false;
      } else {
         class_5834 var6 = var5.<class_5834>method_5138(class_6044.field_30861).get();
         return var6.getType() == EntityType.field_34300
            && var2.isAlive()
            && var6.isAlive()
            && !var2.method_26449()
            && var2.method_37275(var6) <= 17.0;
      }
   }

   public boolean method_7416(class_6331 var1, class_7666 var2, long var3) {
      return this.method_7418(var1, var2) && this.field_8626 > 0 && var2.method_26525().<class_5834>method_5138(class_6044.field_30861).isPresent();
   }

   public void method_7413(class_6331 var1, class_7666 var2, long var3) {
      super.method_27080(var1, var2, var3);
      this.method_7419(var2);
      this.field_8627 = 0;
      this.field_8622 = 0;
      this.field_8626 = 40;
   }

   public void method_7412(class_6331 var1, class_7666 var2, long var3) {
      class_5834 var7 = this.method_7419(var2);
      this.method_7415(var7, var2);
      if (this.field_8624.isEmpty()) {
         var2.method_37349(class_6943.field_35707, ItemStack.EMPTY);
         this.field_8626 = Math.min(this.field_8626, 40);
      } else {
         this.method_7410(var2);
      }

      this.field_8626--;
   }

   public void method_7414(class_6331 var1, class_7666 var2, long var3) {
      super.method_27081(var1, var2, var3);
      var2.method_26525().method_5127(class_6044.field_30861);
      var2.method_37349(class_6943.field_35707, ItemStack.EMPTY);
      this.field_8625 = null;
   }

   private void method_7415(class_5834 var1, class_7666 var2) {
      boolean var5 = false;
      ItemStack var6 = var1.method_26446();
      if (this.field_8625 == null || !ItemStack.method_28019(this.field_8625, var6)) {
         this.field_8625 = var6;
         var5 = true;
         this.field_8624.clear();
      }

      if (var5 && !this.field_8625.method_28022()) {
         this.method_7411(var2);
         if (!this.field_8624.isEmpty()) {
            this.field_8626 = 900;
            this.method_7420(var2);
         }
      }
   }

   private void method_7420(class_7666 var1) {
      var1.method_37349(class_6943.field_35707, this.field_8624.get(0));
   }

   private void method_7411(class_7666 var1) {
      for (class_8014 var5 : var1.method_974()) {
         if (!var5.method_36378() && this.method_7417(var5)) {
            this.field_8624.add(var5.method_36362());
         }
      }
   }

   private boolean method_7417(class_8014 var1) {
      return ItemStack.method_28019(this.field_8625, var1.method_36372()) || ItemStack.method_28019(this.field_8625, var1.method_36377());
   }

   private class_5834 method_7419(class_7666 var1) {
      class_1150 var4 = var1.method_26525();
      class_5834 var5 = var4.<class_5834>method_5138(class_6044.field_30861).get();
      var4.method_5105(class_6044.field_30874, new class_4843(var5, true));
      return var5;
   }

   private void method_7410(class_7666 var1) {
      if (this.field_8624.size() >= 2 && ++this.field_8627 >= 40) {
         this.field_8622++;
         this.field_8627 = 0;
         if (this.field_8622 > this.field_8624.size() - 1) {
            this.field_8622 = 0;
         }

         var1.method_37349(class_6943.field_35707, this.field_8624.get(this.field_8622));
      }
   }
}

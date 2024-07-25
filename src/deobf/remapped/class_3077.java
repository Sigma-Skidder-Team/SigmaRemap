package remapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Set;

public class class_3077 extends class_9742 implements class_1538 {
   private final Set<class_6414> field_15136;
   public final float field_15134;
   private final float field_15135;
   private final Multimap<class_225, class_9343> field_15133;

   public class_3077(float var1, float var2, class_1525 var3, Set<class_6414> var4, class_317 var5) {
      super(var3, var5);
      this.field_15136 = var4;
      this.field_15134 = var3.method_6959();
      this.field_15135 = var1 + var3.method_6957();
      Builder var8 = ImmutableMultimap.builder();
      var8.put(class_7331.field_37462, new class_9343(field_12168, "Tool modifier", (double)this.field_15135, class_9342.field_47679));
      var8.put(class_7331.field_37466, new class_9343(field_12167, "Tool modifier", (double)var2, class_9342.field_47679));
      this.field_15133 = var8.build();
   }

   @Override
   public float method_11235(ItemStack var1, class_2522 var2) {
      return !this.field_15136.contains(var2.method_8360()) ? 1.0F : this.field_15134;
   }

   @Override
   public boolean method_11246(ItemStack var1, class_5834 var2, class_5834 var3) {
      var1.method_28003(2, var3, var0 -> var0.method_26448(class_6943.field_35707));
      return true;
   }

   @Override
   public boolean method_11209(ItemStack var1, World var2, class_2522 var3, class_1331 var4, class_5834 var5) {
      if (!var2.field_33055 && var3.method_8341(var2, var4) != 0.0F) {
         var1.method_28003(1, var5, var0 -> var0.method_26448(class_6943.field_35707));
      }

      return true;
   }

   @Override
   public Multimap<class_225, class_9343> method_11205(class_6943 var1) {
      return var1 != class_6943.field_35707 ? super.method_11205(var1) : this.field_15133;
   }

   public float method_14105() {
      return this.field_15135;
   }
}

package remapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class class_2235 extends class_9742 implements class_1538 {
   private final float field_11140;
   private final Multimap<class_225, class_9343> field_11138;

   public class_2235(class_1525 var1, int var2, float var3, class_317 var4) {
      super(var1, var4);
      this.field_11140 = (float)var2 + var1.method_6957();
      Builder var7 = ImmutableMultimap.builder();
      var7.put(class_7331.field_37462, new class_9343(field_12168, "Weapon modifier", (double)this.field_11140, class_9342.field_47679));
      var7.put(class_7331.field_37466, new class_9343(field_12167, "Weapon modifier", (double)var3, class_9342.field_47679));
      this.field_11138 = var7.build();
   }

   public float method_10287() {
      return this.field_11140;
   }

   @Override
   public boolean method_11203(class_2522 var1, World var2, class_1331 var3, class_704 var4) {
      return !var4.method_3186();
   }

   @Override
   public float method_11235(class_6098 var1, class_2522 var2) {
      if (var2.method_8350(class_4783.field_23718)) {
         return 15.0F;
      } else {
         class_5371 var5 = var2.method_8362();
         return var5 != class_5371.field_27440
               && var5 != class_5371.field_27428
               && var5 != class_5371.field_27404
               && !var2.method_8349(class_2351.field_11737)
               && var5 != class_5371.field_27437
            ? 1.0F
            : 1.5F;
      }
   }

   @Override
   public boolean method_11246(class_6098 var1, class_5834 var2, class_5834 var3) {
      var1.method_28003(1, var3, var0 -> var0.method_26448(class_6943.field_35707));
      return true;
   }

   @Override
   public boolean method_11209(class_6098 var1, World var2, class_2522 var3, class_1331 var4, class_5834 var5) {
      if (var3.method_8341(var2, var4) != 0.0F) {
         var1.method_28003(2, var5, var0 -> var0.method_26448(class_6943.field_35707));
      }

      return true;
   }

   @Override
   public boolean method_11222(class_2522 var1) {
      return var1.method_8350(class_4783.field_23718);
   }

   @Override
   public Multimap<class_225, class_9343> method_11205(class_6943 var1) {
      return var1 != class_6943.field_35707 ? super.method_11205(var1) : this.field_11138;
   }
}

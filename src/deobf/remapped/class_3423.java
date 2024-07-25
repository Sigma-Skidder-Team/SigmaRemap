package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3423 extends class_2358 {
   private class_2831<class_6098> field_16855 = class_2831.<class_6098>method_12872(27, class_6098.field_31203);
   private int field_16854;

   private class_3423(class_133<?> var1) {
      super(var1);
   }

   public class_3423() {
      this(class_133.field_357);
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      if (!this.method_10815(var1)) {
         class_3037.method_13878(var1, this.field_16855);
      }

      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      this.field_16855 = class_2831.<class_6098>method_12872(this.method_31505(), class_6098.field_31203);
      if (!this.method_10811(var2)) {
         class_3037.method_13882(var2, this.field_16855);
      }
   }

   @Override
   public int method_31505() {
      return 27;
   }

   @Override
   public class_2831<class_6098> method_10814() {
      return this.field_16855;
   }

   @Override
   public void method_10813(class_2831<class_6098> var1) {
      this.field_16855 = var1;
   }

   @Override
   public ITextComponent method_38433() {
      return new TranslationTextComponent("container.barrel");
   }

   @Override
   public class_4088 method_38431(int var1, class_7051 var2) {
      return class_1465.method_6776(var1, var2, this);
   }

   @Override
   public void method_31501(class_704 var1) {
      if (!var1.method_37221()) {
         if (this.field_16854 < 0) {
            this.field_16854 = 0;
         }

         this.field_16854++;
         class_2522 var4 = this.method_17403();
         boolean var5 = var4.<Boolean>method_10313(class_7574.field_38592);
         if (!var5) {
            this.method_15824(var4, class_463.field_2115);
            this.method_15823(var4, true);
         }

         this.method_15822();
      }
   }

   private void method_15822() {
      this.field_18364.method_43367().method_14011(this.method_17399(), this.method_17403().method_8360(), 5);
   }

   public void method_15821() {
      int var3 = this.field_18358.method_12173();
      int var4 = this.field_18358.method_12165();
      int var5 = this.field_18358.method_12185();
      this.field_16854 = class_7099.method_32633(this.field_18364, this, var3, var4, var5);
      if (this.field_16854 <= 0) {
         class_2522 var6 = this.method_17403();
         if (!var6.method_8350(class_4783.field_23641)) {
            this.method_17406();
            return;
         }

         boolean var7 = var6.<Boolean>method_10313(class_7574.field_38592);
         if (var7) {
            this.method_15824(var6, class_463.field_2491);
            this.method_15823(var6, false);
         }
      } else {
         this.method_15822();
      }
   }

   @Override
   public void method_31499(class_704 var1) {
      if (!var1.method_37221()) {
         this.field_16854--;
      }
   }

   private void method_15823(class_2522 var1, boolean var2) {
      this.field_18364.method_7513(this.method_17399(), var1.method_10308(class_7574.field_38592, Boolean.valueOf(var2)), 3);
   }

   private void method_15824(class_2522 var1, class_8461 var2) {
      class_2700 var5 = var1.<Direction>method_10313(class_7574.field_38593).method_1037();
      double var6 = (double)this.field_18358.method_12173() + 0.5 + (double)var5.method_12173() / 2.0;
      double var8 = (double)this.field_18358.method_12165() + 0.5 + (double)var5.method_12165() / 2.0;
      double var10 = (double)this.field_18358.method_12185() + 0.5 + (double)var5.method_12185() / 2.0;
      this.field_18364
         .method_29528((class_704)null, var6, var8, var10, var2, class_562.field_3322, 0.5F, this.field_18364.field_33033.nextFloat() * 0.1F + 0.9F);
   }
}

package remapped;

import java.util.Random;

public abstract class class_3578 extends class_1829 {
   private static final class_7821<Boolean> field_17511 = class_8073.<Boolean>method_36641(class_3578.class, class_2734.field_13347);

   public class_3578(class_6629<? extends class_3578> var1, World var2) {
      super(var1, var2);
      this.field_29900 = new class_9239(this);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * 0.65F;
   }

   public static class_1313 method_16629() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 3.0);
   }

   @Override
   public boolean method_26915() {
      return super.method_26915() || this.method_16636();
   }

   public static boolean method_16634(class_6629<? extends class_3578> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      return var1.method_28262(var3).method_8350(class_4783.field_23900) && var1.method_28262(var3.method_6081()).method_8350(class_4783.field_23900);
   }

   @Override
   public boolean method_26911(double var1) {
      return !this.method_16636() && !this.method_45507();
   }

   @Override
   public int method_26856() {
      return 8;
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_17511, false);
   }

   private boolean method_16636() {
      return this.field_41735.<Boolean>method_36640(field_17511);
   }

   public void method_16631(boolean var1) {
      this.field_41735.method_36633(field_17511, var1);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25934("FromBucket", this.method_16636());
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.method_16631(var1.method_25933("FromBucket"));
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_29916.method_3485(0, new class_518(this, 1.25));
      this.field_29916.method_3485(2, new class_6837<class_704>(this, class_704.class, 8.0F, 1.6, 1.4, class_3572.field_17483::test));
      this.field_29916.method_3485(4, new class_7239(this));
   }

   @Override
   public class_1249 method_26933(World var1) {
      return new class_9811(this, var1);
   }

   @Override
   public void method_26431(class_1343 var1) {
      if (this.method_26530() && this.method_37285()) {
         this.method_37092(0.01F, var1);
         this.method_37226(class_7412.field_37839, this.method_37098());
         this.method_37215(this.method_37098().method_6209(0.9));
         if (this.method_17809() == null) {
            this.method_37215(this.method_37098().method_6214(0.0, -0.005, 0.0));
         }
      } else {
         super.method_26431(var1);
      }
   }

   @Override
   public void method_26606() {
      if (!this.method_37285() && this.field_41726 && this.field_41774) {
         this.method_37215(
            this.method_37098()
               .method_6214(
                  (double)((this.field_41717.nextFloat() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.field_41717.nextFloat() * 2.0F - 1.0F) * 0.05F)
               )
         );
         this.field_41726 = false;
         this.field_41763 = true;
         this.method_37155(this.method_16632(), this.method_26439(), this.method_26547());
      }

      super.method_26606();
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      class_6098 var5 = var1.method_26617(var2);
      if (var5.method_27960() == class_4897.field_24999 && this.method_37330()) {
         this.method_37155(class_463.field_2597, 1.0F, 1.0F);
         var5.method_27970(1);
         class_6098 var6 = this.method_16633();
         this.method_16630(var6);
         if (!this.field_41768.field_33055) {
            class_8807.field_45082.method_44414((class_9359)var1, var6);
         }

         if (!var5.method_28022()) {
            if (!var1.field_3853.method_32414(var6)) {
               var1.method_3153(var6, false);
            }
         } else {
            var1.method_26615(var2, var6);
         }

         this.method_37204();
         return class_6910.method_31659(this.field_41768.field_33055);
      } else {
         return super.method_26857(var1, var2);
      }
   }

   public void method_16630(class_6098 var1) {
      if (this.method_45507()) {
         var1.method_28032(this.method_45508());
      }
   }

   public abstract class_6098 method_16633();

   public boolean method_16635() {
      return true;
   }

   public abstract class_8461 method_16632();

   @Override
   public class_8461 method_37239() {
      return class_463.field_2864;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
   }
}

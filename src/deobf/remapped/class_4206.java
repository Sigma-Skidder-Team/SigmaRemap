package remapped;

import java.util.Random;

public class class_4206 extends class_516 implements class_1869 {
   private static final class_7821<Boolean> field_20448 = class_8073.<Boolean>method_36641(class_4206.class, class_2734.field_13347);
   private int field_20450 = 1;

   public class_4206(class_6629<? extends class_4206> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 5;
      this.field_29900 = new class_9851(this);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(5, new class_9287(this));
      this.field_29916.method_3485(7, new class_3156(this));
      this.field_29916.method_3485(7, new class_2221(this));
      this.field_29908
         .method_3485(1, new class_4138<class_704>(this, class_704.class, 10, true, false, var1 -> Math.abs(var1.method_37309() - this.method_37309()) <= 4.0));
   }

   public boolean method_19572() {
      return this.field_41735.<Boolean>method_36640(field_20448);
   }

   public void method_19573(boolean var1) {
      this.field_41735.method_36633(field_20448, var1);
   }

   public int method_19570() {
      return this.field_20450;
   }

   @Override
   public boolean method_26869() {
      return true;
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         if (var1.method_28353() instanceof class_9053 && var1.method_28372() instanceof class_704) {
            super.method_37181(var1, 1000.0F);
            return true;
         } else {
            return super.method_37181(var1, var2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_20448, false);
   }

   public static class_1313 method_19571() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 10.0).method_5984(class_7331.field_37471, 100.0);
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3332;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2364;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2209;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2841;
   }

   @Override
   public float method_26439() {
      return 5.0F;
   }

   public static boolean method_19574(class_6629<class_4206> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      return var1.method_43370() != class_423.field_1790 && var4.nextInt(20) == 0 && method_26908(var0, var1, var2, var3, var4);
   }

   @Override
   public int method_26856() {
      return 1;
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25931("ExplosionPower", this.field_20450);
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      if (var1.method_25939("ExplosionPower", 99)) {
         this.field_20450 = var1.method_25947("ExplosionPower");
      }
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 2.6F;
   }
}
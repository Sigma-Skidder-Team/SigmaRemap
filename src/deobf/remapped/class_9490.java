package remapped;

import java.util.Collection;

public class class_9490 extends class_1173 implements class_7187 {
   private static final class_7821<Integer> field_48362 = class_8073.<Integer>method_36641(class_9490.class, class_2734.field_13366);
   private static final class_7821<Boolean> field_48363 = class_8073.<Boolean>method_36641(class_9490.class, class_2734.field_13347);
   private static final class_7821<Boolean> field_48358 = class_8073.<Boolean>method_36641(class_9490.class, class_2734.field_13347);
   private int field_48360;
   private int field_48356;
   private int field_48361 = 30;
   private int field_48357 = 3;
   private int field_48359;

   public class_9490(class_6629<? extends class_9490> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(1, new class_787(this));
      this.field_29916.method_3485(2, new class_216(this));
      this.field_29916.method_3485(3, new class_6837<class_7617>(this, class_7617.class, 6.0F, 1.0, 1.2));
      this.field_29916.method_3485(3, new class_6837<class_5583>(this, class_5583.class, 6.0F, 1.0, 1.2));
      this.field_29916.method_3485(4, new class_9037(this, 1.0, false));
      this.field_29916.method_3485(5, new class_2889(this, 0.8));
      this.field_29916.method_3485(6, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(6, new class_9691(this));
      this.field_29908.method_3485(1, new class_4138<class_704>(this, class_704.class, true));
      this.field_29908.method_3485(2, new class_8420(this));
   }

   public static class_1313 method_43834() {
      return class_1173.method_5201().method_5984(class_7331.field_37465, 0.25);
   }

   @Override
   public int method_37232() {
      return this.method_17809() != null ? 3 + (int)(this.method_26551() - 1.0F) : 3;
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      boolean var5 = super.method_37270(var1, var2);
      this.field_48356 = (int)((float)this.field_48356 + var1 * 1.5F);
      if (this.field_48356 > this.field_48361 - 5) {
         this.field_48356 = this.field_48361 - 5;
      }

      return var5;
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_48362, -1);
      this.field_41735.method_36634(field_48363, false);
      this.field_41735.method_36634(field_48358, false);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      if (this.field_41735.<Boolean>method_36640(field_48363)) {
         var1.method_25934("powered", true);
      }

      var1.method_25958("Fuse", (short)this.field_48361);
      var1.method_25921("ExplosionRadius", (byte)this.field_48357);
      var1.method_25934("ignited", this.method_43835());
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.field_41735.method_36633(field_48363, var1.method_25933("powered"));
      if (var1.method_25939("Fuse", 99)) {
         this.field_48361 = var1.method_25956("Fuse");
      }

      if (var1.method_25939("ExplosionRadius", 99)) {
         this.field_48357 = var1.method_25950("ExplosionRadius");
      }

      if (var1.method_25933("ignited")) {
         this.method_43829();
      }
   }

   @Override
   public void method_37123() {
      if (this.method_37330()) {
         this.field_48360 = this.field_48356;
         if (this.method_43835()) {
            this.method_43836(1);
         }

         int var3 = this.method_43833();
         if (var3 > 0 && this.field_48356 == 0) {
            this.method_37155(class_463.field_2838, 1.0F, 0.5F);
         }

         this.field_48356 += var3;
         if (this.field_48356 < 0) {
            this.field_48356 = 0;
         }

         if (this.field_48356 >= this.field_48361) {
            this.field_48356 = this.field_48361;
            this.method_43831();
         }
      }

      super.method_37123();
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2664;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2302;
   }

   @Override
   public void method_26614(class_6199 var1, int var2, boolean var3) {
      super.method_26614(var1, var2, var3);
      Entity var6 = var1.method_28372();
      if (var6 != this && var6 instanceof class_9490) {
         class_9490 var7 = (class_9490)var6;
         if (var7.method_43837()) {
            var7.method_43832();
            this.method_37312(class_4897.field_25069);
         }
      }
   }

   @Override
   public boolean method_26442(Entity var1) {
      return true;
   }

   @Override
   public boolean method_32928() {
      return this.field_41735.<Boolean>method_36640(field_48363);
   }

   public float method_43830(float var1) {
      return class_9299.method_42795(var1, (float)this.field_48360, (float)this.field_48356) / (float)(this.field_48361 - 2);
   }

   public int method_43833() {
      return this.field_41735.<Integer>method_36640(field_48362);
   }

   public void method_43836(int var1) {
      this.field_41735.method_36633(field_48362, var1);
   }

   @Override
   public void method_37384(class_6331 var1, class_900 var2) {
      super.method_37384(var1, var2);
      this.field_41735.method_36633(field_48363, true);
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (var5.method_27960() != class_4897.field_25188) {
         return super.method_26857(var1, var2);
      } else {
         this.field_41768
            .method_29528(
               var1,
               this.method_37302(),
               this.method_37309(),
               this.method_37156(),
               class_463.field_2235,
               this.method_37197(),
               1.0F,
               this.field_41717.nextFloat() * 0.4F + 0.8F
            );
         if (!this.field_41768.field_33055) {
            this.method_43829();
            var5.method_28003(1, var1, var1x -> var1x.method_26447(var2));
         }

         return class_6910.method_31659(this.field_41768.field_33055);
      }
   }

   private void method_43831() {
      if (!this.field_41768.field_33055) {
         class_7298 var3 = !this.field_41768.method_29537().method_1285(class_291.field_1047) ? class_7298.field_37310 : class_7298.field_37311;
         float var4 = !this.method_32928() ? 1.0F : 2.0F;
         this.field_29659 = true;
         this.field_41768.method_29573(this, this.method_37302(), this.method_37309(), this.method_37156(), (float)this.field_48357 * var4, var3);
         this.method_37204();
         this.method_43828();
      }
   }

   private void method_43828() {
      Collection var3 = this.method_26503();
      if (!var3.isEmpty()) {
         class_4478 var4 = new class_4478(this.field_41768, this.method_37302(), this.method_37309(), this.method_37156());
         var4.method_20781(2.5F);
         var4.method_20779(-0.5F);
         var4.method_20796(10);
         var4.method_20787(var4.method_20791() / 2);
         var4.method_20780(-var4.method_20783() / (float)var4.method_20791());

         for (class_2250 var6 : var3) {
            var4.method_20788(new class_2250(var6));
         }

         this.field_41768.method_7509(var4);
      }
   }

   public boolean method_43835() {
      return this.field_41735.<Boolean>method_36640(field_48358);
   }

   public void method_43829() {
      this.field_41735.method_36633(field_48358, true);
   }

   public boolean method_43837() {
      return this.method_32928() && this.field_48359 < 1;
   }

   public void method_43832() {
      this.field_48359++;
   }
}

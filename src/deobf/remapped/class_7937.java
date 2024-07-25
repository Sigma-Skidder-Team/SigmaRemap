package remapped;

import javax.annotation.Nullable;

public class class_7937 extends class_1173 {
   private static String[] field_40596;
   private static final class_7821<Byte> field_40597 = class_8073.<Byte>method_36641(class_7937.class, class_2734.field_13361);

   public class_7937(class_6629<? extends class_7937> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(1, new class_787(this));
      this.field_29916.method_3485(3, new class_1937(this, 0.4F));
      this.field_29916.method_3485(4, new class_5215(this));
      this.field_29916.method_3485(5, new class_2889(this, 0.8));
      this.field_29916.method_3485(6, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(6, new class_9691(this));
      this.field_29908.method_3485(1, new class_8420(this));
      this.field_29908.method_3485(2, new class_1721<class_704>(this, class_704.class));
      this.field_29908.method_3485(3, new class_1721<class_8127>(this, class_8127.class));
   }

   @Override
   public double method_37149() {
      return (double)(this.method_37074() * 0.5F);
   }

   @Override
   public class_1249 method_26933(World var1) {
      return new class_8696(this, var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_40597, (byte)0);
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.field_41768.field_33055) {
         this.method_35904(this.field_41744);
      }
   }

   public static class_1313 method_35905() {
      return class_1173.method_5201().method_5984(class_7331.field_37468, 16.0).method_5984(class_7331.field_37465, 0.3F);
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2371;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2519;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2833;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      this.method_37155(class_463.field_1974, 0.15F, 1.0F);
   }

   @Override
   public boolean method_26505() {
      return this.method_35903();
   }

   @Override
   public void method_37130(class_2522 var1, class_1343 var2) {
      if (!var1.method_8350(class_4783.field_23718)) {
         super.method_37130(var1, var2);
      }
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13575;
   }

   @Override
   public boolean method_26495(class_2250 var1) {
      return var1.method_10339() != Effects.field_19718 ? super.method_26495(var1) : false;
   }

   public boolean method_35903() {
      return (this.field_41735.<Byte>method_36640(field_40597) & 1) != 0;
   }

   public void method_35904(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_40597);
      if (!var1) {
         var4 = (byte)(var4 & -2);
      } else {
         var4 = (byte)(var4 | 1);
      }

      this.field_41735.method_36633(field_40597, var4);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, class_5734 var5) {
      var4 = super.method_26864(var1, var2, var3, var4, var5);
      if (var1.method_43360().nextInt(100) == 0) {
         class_6778 var8 = class_6629.field_34241.method_30484(this.field_41768);
         var8.method_37144(this.method_37302(), this.method_37309(), this.method_37156(), this.field_41701, 0.0F);
         var8.method_26864(var1, var2, var3, (class_8733)null, (class_5734)null);
         var8.method_37353(this);
      }

      if (var4 == null) {
         var4 = new class_258();
         if (var1.method_43370() == class_423.field_1782 && var1.method_43360().nextFloat() < 0.1F * var2.method_44284()) {
            ((class_258)var4).method_1126(var1.method_43360());
         }
      }

      if (var4 instanceof class_258) {
         class_1425 var10 = ((class_258)var4).field_907;
         if (var10 != null) {
            this.method_26558(new class_2250(var10, Integer.MAX_VALUE));
         }
      }

      return var4;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.65F;
   }
}

package remapped;

import java.util.Random;

public class class_5973 extends class_3599 {
   private static String[] field_30425;
   private final class_5583 field_30422;
   private class_704 field_30424;
   private class_1331 field_30423;
   private int field_30426;

   public class_5973(class_5583 var1) {
      this.field_30422 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_30422.method_41215()) {
         if (!this.field_30422.method_41216()) {
            class_5834 var3 = this.field_30422.method_41207();
            if (var3 instanceof class_704) {
               this.field_30424 = (class_704)var3;
               if (!var3.method_26507()) {
                  return false;
               }

               if (this.field_30422.method_37275(this.field_30424) > 100.0) {
                  return false;
               }

               class_1331 var4 = this.field_30424.method_37075();
               class_2522 var5 = this.field_30422.field_41768.method_28262(var4);
               if (var5.method_8360().method_29299(class_2351.field_11784)) {
                  this.field_30423 = var5.<Direction>method_10309(class_3633.field_1543)
                     .<class_1331>map(var1 -> var4.method_6098(var1.method_1046()))
                     .orElseGet(() -> new class_1331(var4));
                  return !this.method_27274();
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method_27274() {
      for (class_5583 var4 : this.field_30422.field_41768.<class_5583>method_25868(class_5583.class, new class_4092(this.field_30423).method_18898(2.0))) {
         if (var4 != this.field_30422 && (var4.method_25365() || var4.method_25366())) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean method_16799() {
      return this.field_30422.method_41215()
         && !this.field_30422.method_41216()
         && this.field_30424 != null
         && this.field_30424.method_26507()
         && this.field_30423 != null
         && !this.method_27274();
   }

   @Override
   public void method_16796() {
      if (this.field_30423 != null) {
         this.field_30422.method_41214(false);
         this.field_30422
            .method_26927()
            .method_5595((double)this.field_30423.method_12173(), (double)this.field_30423.method_12165(), (double)this.field_30423.method_12185(), 1.1F);
      }
   }

   @Override
   public void method_16793() {
      this.field_30422.method_25358(false);
      float var3 = this.field_30422.field_41768.method_13578(1.0F);
      if (this.field_30424.method_3202() >= 100
         && (double)var3 > 0.77
         && (double)var3 < 0.8
         && (double)this.field_30422.field_41768.method_43360().nextFloat() < 0.7) {
         this.method_27275();
      }

      this.field_30426 = 0;
      this.field_30422.method_25355(false);
      this.field_30422.method_26927().method_5620();
   }

   private void method_27275() {
      Random var3 = this.field_30422.method_26594();
      class_2921 var4 = new class_2921();
      var4.method_13364(this.field_30422.method_37075());
      this.field_30422
         .method_26499(
            (double)(var4.method_12173() + var3.nextInt(11) - 5),
            (double)(var4.method_12165() + var3.nextInt(5) - 2),
            (double)(var4.method_12185() + var3.nextInt(11) - 5),
            false
         );
      var4.method_13364(this.field_30422.method_37075());
      class_1758 var5 = this.field_30422.field_41768.method_29522().method_1722().method_4604(class_5931.field_30109);
      class_8480 var6 = new class_8480((class_6331)this.field_30422.field_41768)
         .method_39065(class_8712.field_44671, this.field_30422.method_37245())
         .method_39065(class_8712.field_44676, this.field_30422)
         .method_39068(var3);

      for (ItemStack var8 : var5.method_7862(var6.method_39064(class_4933.field_25575))) {
         this.field_30422
            .field_41768
            .method_7509(
               new class_91(
                  this.field_30422.field_41768,
                  (double)var4.method_12173() - (double)class_9299.method_42818(this.field_30422.field_29605 * (float) (Math.PI / 180.0)),
                  (double)var4.method_12165(),
                  (double)var4.method_12185() + (double)class_9299.method_42840(this.field_30422.field_29605 * (float) (Math.PI / 180.0)),
                  var8
               )
            );
      }
   }

   @Override
   public void method_16794() {
      if (this.field_30424 != null && this.field_30423 != null) {
         this.field_30422.method_41214(false);
         this.field_30422
            .method_26927()
            .method_5595((double)this.field_30423.method_12173(), (double)this.field_30423.method_12165(), (double)this.field_30423.method_12185(), 1.1F);
         if (!(this.field_30422.method_37275(this.field_30424) < 2.5)) {
            this.field_30422.method_25358(false);
         } else {
            this.field_30426++;
            if (this.field_30426 <= 16) {
               this.field_30422.method_26914(this.field_30424, 45.0F, 45.0F);
               this.field_30422.method_25355(true);
            } else {
               this.field_30422.method_25358(true);
               this.field_30422.method_25355(false);
            }
         }
      }
   }
}

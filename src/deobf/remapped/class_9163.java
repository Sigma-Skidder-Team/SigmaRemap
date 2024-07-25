package remapped;

public class class_9163 {
   private int field_46890 = 20;
   private float field_46891;
   private float field_46892;
   private int field_46894;
   private int field_46895 = 20;

   public class_9163() {
      this.field_46891 = 5.0F;
   }

   public void method_42236(int var1, float var2) {
      this.field_46890 = Math.min(var1 + this.field_46890, 20);
      this.field_46891 = Math.min(this.field_46891 + (float)var1 * var2 * 2.0F, (float)this.field_46890);
   }

   public void method_42234(class_2451 var1, ItemStack var2) {
      if (var1.method_11247()) {
         class_8341 var5 = var1.method_11227();
         this.method_42236(var5.method_38406(), var5.method_38407());
      }
   }

   public void method_42228(class_704 var1) {
      class_423 var4 = var1.field_41768.method_43370();
      this.field_46895 = this.field_46890;
      if (this.field_46892 > 4.0F) {
         this.field_46892 -= 4.0F;
         if (!(this.field_46891 > 0.0F)) {
            if (var4 != class_423.field_1790) {
               this.field_46890 = Math.max(this.field_46890 - 1, 0);
            }
         } else {
            this.field_46891 = Math.max(this.field_46891 - 1.0F, 0.0F);
         }
      }

      boolean var5 = var1.field_41768.method_29537().method_1285(class_291.field_1049);
      if (var5 && this.field_46891 > 0.0F && var1.method_3246() && this.field_46890 >= 20) {
         this.field_46894++;
         if (this.field_46894 >= 10) {
            float var6 = Math.min(this.field_46891, 6.0F);
            var1.method_26457(var6 / 6.0F);
            this.method_42229(var6);
            this.field_46894 = 0;
         }
      } else if (var5 && this.field_46890 >= 18 && var1.method_3246()) {
         this.field_46894++;
         if (this.field_46894 >= 80) {
            var1.method_26457(1.0F);
            this.method_42229(6.0F);
            this.field_46894 = 0;
         }
      } else if (this.field_46890 > 0) {
         this.field_46894 = 0;
      } else {
         this.field_46894++;
         if (this.field_46894 >= 80) {
            if (var1.method_26551() > 10.0F || var4 == class_423.field_1782 || var1.method_26551() > 1.0F && var4 == class_423.field_1789) {
               var1.method_37181(class_6199.field_31694, 1.0F);
            }

            this.field_46894 = 0;
         }
      }
   }

   public void method_42230(class_5734 var1) {
      if (var1.method_25939("foodLevel", 99)) {
         this.field_46890 = var1.method_25947("foodLevel");
         this.field_46894 = var1.method_25947("foodTickTimer");
         this.field_46891 = var1.method_25955("foodSaturationLevel");
         this.field_46892 = var1.method_25955("foodExhaustionLevel");
      }
   }

   public void method_42233(class_5734 var1) {
      var1.method_25931("foodLevel", this.field_46890);
      var1.method_25931("foodTickTimer", this.field_46894);
      var1.method_25920("foodSaturationLevel", this.field_46891);
      var1.method_25920("foodExhaustionLevel", this.field_46892);
   }

   public int method_42238() {
      return this.field_46890;
   }

   public boolean method_42227() {
      return this.field_46890 < 20;
   }

   public void method_42229(float var1) {
      this.field_46892 = Math.min(this.field_46892 + var1, 40.0F);
   }

   public float method_42237() {
      return this.field_46891;
   }

   public void method_42235(int var1) {
      this.field_46890 = var1;
   }

   public void method_42232(float var1) {
      this.field_46891 = var1;
   }
}

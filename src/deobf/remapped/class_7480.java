package remapped;

public class class_7480 extends class_9128 {
   private int field_38166;
   private int field_38168;
   private double field_38165;
   private double[] field_38169 = new double[]{0.0, 0.25, 0.5, 0.75, 1.0};

   public class_7480() {
      super(class_5664.field_28716, "OmegaCraft", "A fly for OmegaCraft anticheat");
   }

   @Override
   public void method_42006() {
      this.field_38168 = 0;
      this.field_38166 = -1;
      double var3 = this.field_38169[0];
      int var5 = this.field_38169.length;
      double var6 = field_46692.field_9632.method_37245().field_7333 - (double)((int)field_46692.field_9632.method_37245().field_7333);

      for (int var8 = 1; var8 < var5; var8++) {
         double var9 = this.field_38169[var8] - var6;
         if (var9 < var6 - var3) {
            var3 = this.field_38169[var8];
         }
      }

      this.field_38165 = (double)((int)field_46692.field_9632.method_37245().field_7333) + var3;
      field_46692.field_9632.method_37256(field_46692.field_9632.method_37245().field_7336, this.field_38165, field_46692.field_9632.method_37245().field_7334);
   }

   @Override
   public void method_42020() {
      class_8865.method_40776(0.2);
      if (field_46692.field_9632.method_37098().field_7333 > 0.03) {
         class_314.method_1408(-0.0784);
      }
   }

   @class_9148
   public void method_34006(class_717 var1) {
      this.field_38168 = 0;
      this.field_38166 = -1;
      double var4 = this.field_38169[0];
      int var6 = this.field_38169.length;
      double var7 = field_46692.field_9632.method_37245().field_7333 - (double)((int)field_46692.field_9632.method_37245().field_7333);

      for (int var9 = 1; var9 < var6; var9++) {
         double var10 = this.field_38169[var9] - var7;
         if (var10 < var7 - var4) {
            var4 = this.field_38169[var9];
         }
      }

      this.field_38165 = (double)((int)field_46692.field_9632.method_37245().field_7333) + var4;
      field_46692.field_9632.method_37256(field_46692.field_9632.method_37245().field_7336, this.field_38165, field_46692.field_9632.method_37245().field_7334);
   }

   @class_9148
   public void method_34007(class_1393 var1) {
      if (var1.method_6449()) {
         var1.method_6444(true);
         if (this.field_38166 != 0) {
            if (this.field_38166 == 1) {
               var1.method_6451(false);
               var1.method_6455(var1.method_6454() + 0.03);
            }
         } else {
            var1.method_6451(true);
         }
      }
   }

   @class_9148
   public void method_34005(class_7767 var1) {
      this.field_38166++;
      if (this.field_38168 > 0) {
         this.field_38168--;
      }

      var1.method_35235(0.0);
      if (this.field_38166 != 1) {
         if (this.field_38166 > 1) {
            field_46692.field_9632
               .method_37256(field_46692.field_9632.method_37245().field_7336, this.field_38165, field_46692.field_9632.method_37245().field_7334);
            double var4 = !field_46692.field_9577.field_45560.method_27060() ? 0.405 + (double)class_8865.method_40770() * 0.02 : 0.25;
            class_8865.method_40777(var1, var4);
            this.field_38166 = 0;
         }
      } else {
         if (field_46692.field_9577.field_45450.method_27060() && this.field_38168 == 0) {
            var1.method_35235(0.5);
            this.field_38165 = this.field_38165 + var1.method_35236();
            this.field_38168 = 3;
            this.field_38166 = 0;
         }

         double var6 = !field_46692.field_9577.field_45560.method_27060() ? 0.6 : 0.25;
         class_8865.method_40777(var1, var6);
      }

      class_314.method_1463(var1.method_35234());
      class_314.method_1408(var1.method_35236());
      class_314.method_1405(var1.method_35231());
   }

   @class_9148
   public void method_34004(class_139 var1) {
      if (var1.method_557() instanceof class_509) {
         class_509 var4 = (class_509)var1.method_557();
         double var5 = this.field_38169[0];
         int var7 = this.field_38169.length;
         double var8 = var4.field_3144 - (double)((int)var4.field_3144);

         for (int var10 = 1; var10 < var7; var10++) {
            double var11 = this.field_38169[var10] - var8;
            if (var11 < var8 - var5) {
               var5 = this.field_38169[var10];
            }
         }

         this.field_38165 = (double)((int)var4.field_3144) + var5;
      }
   }
}

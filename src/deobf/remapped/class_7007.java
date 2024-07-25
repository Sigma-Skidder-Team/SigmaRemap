package remapped;

public class class_7007 extends class_2596 {
   public class_9486 field_35935;
   public class_9486 field_35940;
   public class_4636 field_35937;
   public class_4636 field_35936;
   public class_8691 field_35939 = SigmaMainClass.getInstance().method_3303();
   private String field_35938 = "§7Waiting...";

   public class_7007(class_7309 var1) {
      super("Alt Manager");
      this.method_32105(false);
      short var4 = 400;
      int var5 = 114;
      int var6 = (this.method_32109() - var4) / 2;
      this.method_32148(
         this.field_35935 = new class_9486(this, "username", var6, var5, var4, 45, class_9486.field_14738, "", "New name", class_5320.field_27156)
      );
      var5 += 80;
      this.method_32148(
         this.field_35940 = new class_9486(this, "password", var6, var5, var4, 45, class_9486.field_14738, "", "New password", class_5320.field_27156)
      );
      var5 += 190;
      this.method_32148(this.field_35937 = new class_4636(this, "edit", var6, var5, var4, 40, "Edit", class_1255.field_6920.field_6917));
      var5 += 50;
      this.method_32148(this.field_35936 = new class_4636(this, "back", var6, var5, var4, 40, "Cancel", class_1255.field_6920.field_6917));
      this.field_35940.method_13726(true);
      this.field_35940.method_13729("*");
      this.field_35937.method_32100((var2, var3) -> {
         if (this.field_35935.method_32165().length() > 0) {
            if (!this.field_35935.method_32165().equals(var1.method_33344())) {
               var1.method_33337(this.field_35935.method_32165());
            }

            var1.method_33326(this.field_35935.method_32165());
         }

         var1.method_33327(this.field_35940.method_32165());
         this.field_35938 = "Edited!";
      });
      this.field_35936.method_32100((var0, var1x) -> SigmaMainClass.getInstance().method_3299().method_30990(new class_2135()));
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_96(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_3054.field_15004);
      class_73.method_94(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_314.method_1444(class_1255.field_6912.field_6917, 0.1F));
      class_73.method_94(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_314.method_1444(class_1255.field_6929.field_6917, 0.95F));
      class_73.method_88(
         class_5320.field_27156,
         (float)(this.method_32109() / 2),
         20.0F,
         "Edit Alt",
         class_1255.field_6918.field_6917,
         class_6206.field_31726,
         class_6206.field_31724
      );
      class_73.method_89(
         class_5320.field_27156,
         (float)(this.method_32109() / 2),
         40.0F,
         this.field_35938,
         class_1255.field_6918.field_6917,
         class_6206.field_31726,
         class_6206.field_31724,
         true
      );
      super.method_32178(var1);
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         SigmaMainClass.getInstance().method_3299().method_30990(new class_2135());
      }
   }
}

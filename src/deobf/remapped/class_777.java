package remapped;

public class class_777 extends Module {
   public class_5664 field_4192;
   public Module field_4193;
   private String field_4194 = ">";

   public class_777() {
      super(class_5664.field_28716, "VClip", "Climp Walls like spiders!");
   }

   @class_9148
   private void method_3476(class_8706 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9577.field_45560.method_27060() && var1.method_40004() == class_3237.field_16101) {
            if (!(field_46692.field_9632.field_41755 < 0.0F)) {
               this.method_3473(this.method_3477());
            } else {
               this.method_3473(this.method_3478());
            }
         }
      }
   }

   @class_9148
   private void method_3475(class_2157 var1) {
      if (var1.method_10047() instanceof class_3211) {
         class_3211 var4 = (class_3211)var1.method_10047();
         String var5 = var4.method_14751();
         String var6 = "hclip";
         if (!var5.startsWith("/" + var6)) {
            return;
         }

         var1.method_29715(true);
         int var7 = 0;
         var5 = var5.replace("/" + var6, "").replaceAll("\\s", "");
         if (method_3474(var5)) {
            var7 = Integer.parseInt(var5);
         }

         float var8 = (float)Math.toRadians((double)(field_46692.field_9632.field_41701 + 90.0F));
         double var9 = (double)(class_9299.method_42840(var8) * (float)var7);
         double var11 = (double)(class_9299.method_42818(var8) * (float)var7);
         field_46692.field_9632
            .method_37256(field_46692.field_9632.method_37302() + var9, field_46692.field_9632.method_37309(), field_46692.field_9632.method_37156() + var11);
      }
   }

   public static boolean method_3474(String var0) {
      return var0.matches("-?\\d+(\\.\\d+)?");
   }

   private int method_3477() {
      boolean var3 = false;
      int var4 = 0;

      for (int var5 = 0; var5 < 10; var5++) {
         class_1331 var6 = new class_1331(
            field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309() - (double)var5, field_46692.field_9632.method_37156()
         );
         if (field_46692.field_9601.method_28262(var6).method_8302() && var3) {
            var4 = -var5;
            break;
         }

         var3 = field_46692.field_9601.method_28262(var6).method_8302();
      }

      return var4;
   }

   private int method_3478() {
      boolean var3 = false;
      int var4 = 0;

      for (int var5 = 10; var5 > 0; var5--) {
         class_1331 var6 = new class_1331(
            field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309() + (double)var5, field_46692.field_9632.method_37156()
         );
         if (field_46692.field_9601.method_28262(var6).method_8302() && var3 && !field_46692.field_9601.method_28262(var6.method_6100()).method_8302()) {
            var4 = var5;
            break;
         }

         var3 = field_46692.field_9601.method_28262(var6).method_8302();
      }

      return var4;
   }

   private void method_3473(int var1) {
      if (var1 == 0) {
         class_314.method_1443("§cCouldn't VClip");
      } else {
         field_46692.method_8614()
            .method_4813(
               new class_9515(
                  field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309() + (double)var1, field_46692.field_9632.method_37156(), false
               )
            );
         field_46692.field_9632
            .method_37256(field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309() + (double)var1, field_46692.field_9632.method_37156());
         SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Successfuly VCliped", var1 + " Blocks", 2000, class_2209.field_10993));
      }
   }
}

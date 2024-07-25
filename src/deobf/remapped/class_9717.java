package remapped;

import java.util.List;

public class class_9717 implements Runnable {
   public class_9717(AltManagerMenu var1, AltManagerMenu var2, List var3, boolean var4) {
      this.field_49398 = var1;
      this.field_49400 = var2;
      this.field_49399 = var3;
      this.field_49397 = var4;
   }

   @Override
   public void run() {
      int var3 = 0;
      if (AltManagerMenu.method_9900(this.field_49398) != null) {
         var3 = AltManagerMenu.method_9900(this.field_49398).method_11853();
         this.field_49400.method_32179(AltManagerMenu.method_9900(this.field_49398));
      }

      class_7038 var4 = this.field_49400.method_32094("alts");
      if (var4 != null) {
         this.field_49400.method_32179(var4);
      }

      this.field_49400
         .method_32150(
            AltManagerMenu.method_9896(
               this.field_49398,
               new class_2612(
                  this.field_49400,
                  "alts",
                  0,
                  114,
                  (int)((float) MinecraftClient.getInstance().window.method_43166() * class_2113.method_9905(this.field_49398)) - 4,
                  MinecraftClient.getInstance().window.method_43163() - 119 - class_2113.method_9894(this.field_49398)
               )
            )
         );

      for (class_7309 var6 : this.field_49399) {
         AltManagerMenu.method_9893(this.field_49398, var6, this.field_49397);
      }

      AltManagerMenu.method_9900(this.field_49398).method_11851(var3);
      AltManagerMenu.method_9900(this.field_49398).method_32105(false);
      AltManagerMenu.method_9900(this.field_49398).method_11852(false);
   }
}

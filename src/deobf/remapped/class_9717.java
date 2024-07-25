package remapped;

import java.util.List;

public class class_9717 implements Runnable {
   public class_9717(class_2113 var1, class_2113 var2, List var3, boolean var4) {
      this.field_49398 = var1;
      this.field_49400 = var2;
      this.field_49399 = var3;
      this.field_49397 = var4;
   }

   @Override
   public void run() {
      int var3 = 0;
      if (class_2113.method_9900(this.field_49398) != null) {
         var3 = class_2113.method_9900(this.field_49398).method_11853();
         this.field_49400.method_32179(class_2113.method_9900(this.field_49398));
      }

      class_7038 var4 = this.field_49400.method_32094("alts");
      if (var4 != null) {
         this.field_49400.method_32179(var4);
      }

      this.field_49400
         .method_32150(
            class_2113.method_9896(
               this.field_49398,
               new class_2612(
                  this.field_49400,
                  "alts",
                  0,
                  114,
                  (int)((float)class_1893.method_8510().field_9602.method_43166() * class_2113.method_9905(this.field_49398)) - 4,
                  class_1893.method_8510().field_9602.method_43163() - 119 - class_2113.method_9894(this.field_49398)
               )
            )
         );

      for (class_7309 var6 : this.field_49399) {
         class_2113.method_9893(this.field_49398, var6, this.field_49397);
      }

      class_2113.method_9900(this.field_49398).method_11851(var3);
      class_2113.method_9900(this.field_49398).method_32105(false);
      class_2113.method_9900(this.field_49398).method_11852(false);
   }
}

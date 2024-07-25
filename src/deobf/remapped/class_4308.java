package remapped;

public class class_4308 implements Runnable {
   public class_4308(class_2534 var1, float var2) {
      this.field_20900 = var1;
      this.field_20899 = var2;
   }

   @Override
   public void run() {
      boolean var3 = (float)Math.round((float)Math.random() * 100.0F) <= this.field_20900.method_42002("Hit Chance");
      float var4 = Math.max(class_2534.method_11536().field_9632.method_37175(class_2534.field_12556.method_15377()), this.field_20900.method_42002("Range"));
      class_5631 var5;
      if (!this.field_20900.method_42016("Attack Mode").equals("Pre")) {
         var5 = class_314.method_1461(
            class_2534.method_11533(this.field_20900).field_10069, class_2534.method_11533(this.field_20900).field_10067, var4, (double)this.field_20899
         );
      } else {
         double var6 = Math.sqrt(
            class_2534.method_11548().field_9632.method_37098().field_7336 * class_2534.method_11550().field_9632.method_37098().field_7336
               + class_2534.method_11539().field_9632.method_37098().field_7334 * class_2534.method_11532().field_9632.method_37098().field_7334
         );
         double var10003 = (double)this.field_20899;
         var5 = class_314.method_1461(
            class_2534.method_11547(this.field_20900).field_10069, class_2534.method_11547(this.field_20900).field_10067, var4, var10003 + var6
         );
      }

      if (class_2534.field_12558 != null
         && class_2534.method_11538(this.field_20900).method_40094()
         && !this.field_20900.method_42016("Autoblock Mode").equals("Vanilla")) {
         class_2534.method_11538(this.field_20900).method_40093();
      }

      String var8 = this.field_20900.method_42016("Mode");
      if (var3 && (var5 != null || !this.field_20900.method_42007("Raytrace") || var8.equals("Multi"))) {
         for (class_3357 var10 : class_2534.method_11556(this.field_20900)) {
            class_8145 var11 = var10.method_15377();
            if (var5 != null && this.field_20900.method_42007("Raytrace") && !var8.equals("Multi")) {
               var11 = var5.method_25524();
            }

            class_314.method_1431(var11, !this.field_20900.method_42007("No swing"));
         }

         if (var8.equals("Multi2")) {
            class_2534.method_11540(this.field_20900, class_2534.method_11544(this.field_20900) + 1);
         }
      } else if (!this.field_20900.method_42007("No swing")) {
         class_2534.method_11534().field_9632.method_26597(class_2584.field_12791);
      }

      if (class_2534.field_12558 != null
         && class_2534.method_11538(this.field_20900).method_40097()
         && this.field_20900.method_42016("Autoblock Mode").equals("Basic1")) {
         class_2534.method_11538(this.field_20900)
            .method_40101(class_2534.field_12558, class_2534.method_11533(this.field_20900).field_10069, class_2534.method_11533(this.field_20900).field_10067);
      }
   }
}

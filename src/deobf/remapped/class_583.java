package remapped;

public class class_583 extends class_9128 {
   private int field_3397;
   private int field_3400;
   private boolean field_3399;
   private double field_3398;

   public class_583() {
      super(class_5664.field_28716, "NCP", "Longjump for NoCheatPlus.");
      this.method_42010(new class_2748<Float>("Boost", "Longjump boost", 3.0F, Float.class, 1.0F, 5.0F, 0.01F));
      this.method_42010(new class_2748<Float>("Duration", "Speed duration", 10.0F, Float.class, 7.0F, 200.0F, 1.0F));
      this.method_42010(new class_2826("Glide Mode", "The way you will glide", 1, "None", "Basic", "High"));
      this.method_42010(new class_2826("Speed Mode", "The way you will speed", 0, "Basic", "Funcraft", "Hypixel"));
   }

   @Override
   public void method_42020() {
      this.field_3399 = false;
      field_46692.field_9616.field_32603 = 1.0F;
      class_8865.method_40776(class_8865.method_40767() * 0.7);
   }

   @Override
   public void method_42006() {
      this.field_3399 = false;
      this.field_3397 = 0;
   }

   @class_9148
   public void method_2758(class_7767 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         if (field_46692.field_9632.field_41726) {
            this.field_3400 = 0;
            this.field_3397++;
            if (this.field_3399 && var1.method_35236() != 0.599 && this.method_42017().method_42007("Auto Disable")) {
               this.method_42017().method_41999();
               class_8865.method_40777(var1, class_8865.method_40767() * 0.8);
               return;
            }

            class_1331 var4 = new class_1331(
               field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309() - 0.4, field_46692.field_9632.method_37156()
            );
            if (class_4181.field_20352 > 1) {
               if (this.method_42017().method_42007("BorderJump") && !class_7494.method_34090(var4) && this.field_3397 > 0 && class_314.method_1434()) {
                  field_46692.field_9632.method_26595();
                  var1.method_35232(field_46692.field_9632.method_37098().field_7336);
                  var1.method_35235(field_46692.field_9632.method_37098().field_7333);
                  var1.method_35229(field_46692.field_9632.method_37098().field_7334);
               } else if (this.method_42017().method_42007("Auto Jump") && this.field_3397 > (this.field_3399 ? 1 : 0) && class_314.method_1434()) {
                  field_46692.field_9632.method_26595();
                  var1.method_35232(field_46692.field_9632.method_37098().field_7336);
                  var1.method_35235(field_46692.field_9632.method_37098().field_7333);
                  var1.method_35229(field_46692.field_9632.method_37098().field_7334);
               }
            }
         } else {
            this.field_3400++;
            this.field_3397 = 0;
            if (this.field_3399) {
               double var5 = class_8865.method_40767() * 0.95;
               if (this.field_3400 == 1) {
                  this.field_3398 = (double)this.method_42002("Boost") * 0.4 + (double)class_8865.method_40770() * 0.05;
               } else if ((float)this.field_3400 > this.method_42002("Duration") + (float)class_8865.method_40770()) {
                  this.field_3398 = var5;
               } else if (this.field_3398 > var5) {
                  String var7 = this.method_42016("Speed Mode");
                  switch (var7) {
                     case "Basic":
                        this.field_3398 *= 0.987;
                        break;
                     case "Funcraft":
                        this.field_3398 -= 0.0075;
                        break;
                     case "Hypixel":
                        this.field_3398 -= 0.0079;
                  }

                  if (this.field_3398 < var5) {
                     this.field_3398 = var5;
                  }
               }

               if (field_46692.field_9632.field_41744 || !class_314.method_1434()) {
                  this.field_3398 = var5;
               }

               class_8865.method_40777(var1, this.field_3398);
               if (class_8865.method_40769() == 0) {
                  String var13 = this.method_42016("Glide Mode");
                  switch (var13) {
                     case "Basic":
                        var1.method_35235(((class_1213)this.method_42017()).method_5380(this.field_3400));
                        break;
                     case "High":
                        var1.method_35235(((class_1213)this.method_42017()).method_5381(this.field_3400));
                        if (class_314.method_1387()
                           && class_727.method_3328().method_3298().method_847(class_3095.class).method_42015()
                           && (this.field_3400 == 8 || this.field_3400 == 21)) {
                           double var9 = field_46692.field_9632.method_37309() + var1.method_35236();
                           double var11 = var9 - (double)((int)(var9 + 0.001));
                           if (Math.abs(var11) < 0.001) {
                              var1.method_35235(var1.method_35236() - var11);
                           } else {
                              var11 = var9 - (double)((int)var9) - 0.25;
                              if (Math.abs(var11) < 0.007) {
                                 var1.method_35235(var1.method_35236() - var11);
                              }
                           }
                        }
                  }
               }
            }

            if (this.field_3397 == 1 && field_46692.field_9632.method_37098().field_7333 < 0.0 && this.method_42017().method_42007("Auto Jump")) {
               class_8865.method_40777(var1, class_8865.method_40767() * 0.2);
            }
         }

         class_314.method_1408(var1.method_35236());
      }
   }

   @class_9148
   public void method_2756(class_2911 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         this.field_3399 = true;
         this.field_3398 = class_8865.method_40767();
         var1.method_13315(this.field_3398);
         var1.method_13313(0.425 + (double)class_8865.method_40769() * 0.1);
         if (this.method_42016("Glide Mode").equals("High") && class_8865.method_40769() == 0) {
            var1.method_13313(0.599);
            var1.method_13315(0.0);
            if ((double)this.method_42002("Boost") > 1.5) {
               var1.method_13315(0.28 + (double)this.method_42002("Boost") * 0.1 + (double)class_8865.method_40770() * 0.05);
            }

            if (this.method_42016("Speed Mode").equals("Hypixel") && (double)this.method_42002("Boost") > 1.75) {
               class_314.method_1450(true);
            }

            field_46692.method_8614()
               .method_4813(
                  new class_9515(
                     field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309() + 0.425, field_46692.field_9632.method_37156(), false
                  )
               );
            field_46692.method_8614()
               .method_4813(
                  new class_9515(
                     field_46692.field_9632.method_37302(), field_46692.field_9632.method_37309() + 0.425 + 0.396, field_46692.field_9632.method_37156(), false
                  )
               );
            field_46692.method_8614()
               .method_4813(
                  new class_9515(
                     field_46692.field_9632.method_37302(),
                     field_46692.field_9632.method_37309() + 0.425 + 0.396 - 0.122,
                     field_46692.field_9632.method_37156(),
                     false
                  )
               );
         }
      }
   }

   @class_9148
   public void method_2757(class_7982 var1) {
      if (!this.method_42015() || !this.method_42016("Glide Mode").equals("High")) {
         ;
      }
   }
}

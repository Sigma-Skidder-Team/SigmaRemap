package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_7031 extends class_9128 {
   private List<class_6310<?>> field_36206 = new ArrayList<class_6310<?>>();
   private boolean field_36207;
   private class_3223 field_36204 = new class_3223();

   public class_7031() {
      super(class_5664.field_28717, "Hypixel", "Disable watchdog.");
   }

   @Override
   public void method_42006() {
      if (!field_46692.field_9632.field_41726) {
         this.field_36207 = false;
      } else {
         double var3 = field_46692.field_9632.method_37302();
         double var5 = field_46692.field_9632.method_37309();
         double var7 = field_46692.field_9632.method_37156();
         this.field_36207 = false;
         field_46692.method_8614().method_4813(new class_9515(var3, var5 + 0.2, var7, false));
         field_46692.method_8614().method_4813(new class_9515(var3, var5 + 0.1, var7, false));
         this.field_36207 = true;
         this.field_36204.method_14773();
         this.field_36204.method_14776();
         if (!this.method_42007("Instant")) {
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Hypixel disabler", "Wait 5s..."));
         } else {
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Hypixel disabler", "Move where you want"));
         }
      }
   }

   @Override
   public void method_42020() {
      this.field_36204.method_14773();
      this.field_36204.method_14776();
      if (this.field_36207) {
         int var3 = this.field_36206.size();

         for (int var4 = 0; var4 < var3; var4++) {
            field_46692.method_8614().method_4813(this.field_36206.get(var4));
         }

         SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Hypixel disabler", "Disabler canceled"));
      }

      this.field_36206.clear();
   }

   @class_9148
   public void method_32068(class_1393 var1) {
      if (field_46692.field_9632 != null) {
         if (!this.field_36207 && field_46692.field_9632.field_41726) {
            if (!this.method_42007("Instant")) {
               SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Hypixel disabler", "Wait 5s..."));
            } else {
               SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Hypixel disabler", "Move where you want"));
            }

            this.field_36204.method_14773();
            this.field_36204.method_14776();
            this.field_36207 = true;
         }
      }
   }

   @class_9148
   public void method_32071(class_7767 var1) {
      if (field_46692.field_9632 != null) {
         if (!this.method_42007("Instant") && this.field_36207) {
            var1.method_35232(0.0);
            var1.method_35235(0.0);
            var1.method_35229(0.0);
         }

         if (this.field_36204.method_14772() > 10000L && this.field_36207) {
            this.field_36207 = false;
            int var4 = this.field_36206.size();

            for (int var5 = 0; var5 < var4; var5++) {
               field_46692.method_8614().method_4813(this.field_36206.get(var5));
            }

            this.field_36206.clear();
            this.field_36204.method_14773();
            this.field_36204.method_14774();
            this.method_42017().method_41999();
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Hypixel disabler", "Disabler failed"));
         }
      }
   }

   @class_9148
   private void method_32070(class_2157 var1) {
      if (field_46692.method_8614() != null) {
         if (this.field_36207) {
            if (var1.method_10047() instanceof class_2317
               || var1.method_10047() instanceof class_4609
               || var1.method_10047() instanceof class_3398
               || var1.method_10047() instanceof class_3195
               || var1.method_10047() instanceof class_1022) {
               if (this.method_42007("Instant")) {
                  this.field_36206.add(var1.method_10047());
               }

               var1.method_29715(true);
            }
         }
      }
   }

   @class_9148
   public void method_32069(class_139 var1) {
      if (field_46692.field_9632 != null && this.field_36207) {
         if (this.method_42015() || this.method_42007("Instant")) {
            if (var1.method_557() instanceof class_509) {
               this.method_42017().method_41999();
               if (!this.method_42007("Instant")) {
                  SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Hypixel disabler", "You can do what you want for 5s"));
               } else {
                  class_509 var4 = (class_509)var1.method_557();
                  var1.method_29715(true);
                  field_46692.method_8614()
                     .method_4813(new class_1514(var4.field_3139, var4.field_3144, var4.field_3141, var4.field_3143, var4.field_3140, false));
                  int var5 = this.field_36206.size();

                  for (int var6 = 0; var6 < var5; var6++) {
                     field_46692.method_8614().method_4813(this.field_36206.get(var6));
                  }

                  this.field_36206.clear();
                  SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Hypixel disabler", "Successfully sent packets"));
               }

               this.field_36207 = false;
            }
         }
      }
   }
}

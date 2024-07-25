package remapped;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class class_3116 {
   public List<String> field_15502 = new CopyOnWriteArrayList<String>();
   public List<String> field_15503 = new CopyOnWriteArrayList<String>();
   public int field_15501 = 0;
   private MinecraftClient field_15500 = MinecraftClient.getInstance();

   public void method_14473() {
      SigmaMainClass.method_3328().method_3302().method_7908(this);
      this.method_14463();
   }

   @class_9148
   private void method_14474(class_6435 var1) {
      if (var1.method_29384() == this.field_15500.field_9577.field_45541.field_30027.field_17800
         && this.field_15500.field_9662 != null
         && this.field_15500.field_9662.method_45509() != null) {
         class_4946 var4 = SigmaMainClass.method_3328().method_3325();
         var4.method_22653();
         if (this.method_14460(this.field_15500.field_9662)) {
            this.method_14467(this.field_15500.field_9662.method_45509().getUnformattedComponentText());
            class_6324.method_28832(
               "" + var4.method_22662() + " " + this.field_15500.field_9662.method_45509().getUnformattedComponentText() + " is no longer your friend."
            );
         } else {
            this.method_14464(this.field_15500.field_9662.method_45509().getUnformattedComponentText());
            class_6324.method_28832(
               "" + var4.method_22662() + " " + this.field_15500.field_9662.method_45509().getUnformattedComponentText() + " is now your friend."
            );
         }

         this.method_14470();
      }
   }

   public boolean method_14460(Entity var1) {
      return this.field_15502.contains(var1.method_45509().getUnformattedComponentText().toLowerCase());
   }

   public boolean method_14459(String var1) {
      return this.field_15502.contains(var1.toLowerCase());
   }

   public boolean method_14469(Entity var1) {
      return this.field_15503.contains(var1.method_45509().getUnformattedComponentText().toLowerCase());
   }

   public boolean method_14468(String var1) {
      return this.field_15503.contains(var1.toLowerCase());
   }

   public boolean method_14464(String var1) {
      if (this.method_14459(var1)) {
         return false;
      } else {
         this.field_15502.add(var1.toLowerCase());
         this.method_14470();
         return true;
      }
   }

   public boolean method_14458(String var1) {
      if (this.method_14468(var1)) {
         return false;
      } else {
         this.field_15503.add(var1.toLowerCase());
         this.method_14462();
         return true;
      }
   }

   public List<String> method_14465() {
      return this.field_15502;
   }

   public List<String> method_14471() {
      return this.field_15503;
   }

   public boolean method_14467(String var1) {
      boolean var4 = this.field_15502.remove(var1.toLowerCase());
      if (var4) {
         this.method_14470();
      }

      return var4;
   }

   public boolean method_14466(String var1) {
      boolean var4 = this.field_15503.remove(var1.toLowerCase());
      if (var4) {
         this.method_14462();
      }

      return var4;
   }

   public boolean method_14472() {
      if (!this.field_15502.isEmpty()) {
         this.field_15502.clear();
         this.method_14470();
         return true;
      } else {
         return false;
      }
   }

   public boolean method_14461() {
      if (!this.field_15503.isEmpty()) {
         this.field_15503.clear();
         this.method_14462();
         return true;
      } else {
         return false;
      }
   }

   public void method_14470() {
      SigmaMainClass.method_3328().method_3304().method_5821("friends", this.field_15502);
   }

   public void method_14462() {
      SigmaMainClass.method_3328().method_3304().method_5821("enemies", this.field_15503);
   }

   private void method_14463() {
      if (SigmaMainClass.method_3328().method_3304().method_5850("friends")) {
         class_1336 var3 = SigmaMainClass.method_3328().method_3304().method_5849("friends");
         if (var3 != null) {
            var3.forEach(var1 -> this.field_15502.add((String)var1));
         }
      }

      if (SigmaMainClass.method_3328().method_3304().method_5850("enemies")) {
         class_1336 var4 = SigmaMainClass.method_3328().method_3304().method_5849("enemies");
         if (var4 != null) {
            var4.forEach(var1 -> this.field_15503.add((String)var1));
         }
      }
   }
}

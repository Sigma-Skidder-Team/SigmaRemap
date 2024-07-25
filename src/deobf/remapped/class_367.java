package remapped;

public class class_367 extends Module {
   public class_367(String var1, String var2, Category var3) {
      super(var3, var1, var2);
   }

   @Override
   public boolean method_42015() {
      return SigmaMainClass.getInstance().method_3332().method_23084() ? super.method_42015() : false;
   }

   @Override
   public void method_42023(boolean var1) {
      if (SigmaMainClass.getInstance().method_3332().method_23084()) {
         super.method_42023(var1);
      } else {
         if (this.field_46700 != var1) {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Premium", this.getName() + " Not yet available for free version"));
            SigmaMainClass.getInstance().method_3315().method_21206("error");
         }
      }
   }

   @Override
   public void method_42018(boolean var1) {
      if (SigmaMainClass.getInstance().method_3332().method_23084()) {
         super.method_42018(var1);
      } else {
         if (this.field_46700 != var1 && var1) {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Premium", this.getName() + " Not yet available for free version"));
            SigmaMainClass.getInstance().method_3315().method_21206("error");
         }
      }
   }

   @Override
   public void method_41991(boolean var1) {
      if (SigmaMainClass.getInstance().method_3332().method_23084()) {
         super.method_41991(var1);
      } else {
         if (this.method_42015() != var1) {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Premium", this.getName() + " Not yet available for free version"));
            SigmaMainClass.getInstance().method_3315().method_21206("error");
         }
      }
   }
}

package remapped;

public class PremiumModule extends Module {
   public PremiumModule(String var1, String var2, Category var3) {
      super(var3, var1, var2);
   }

   @Override
   public boolean method_42015() {
      return SigmaMainClass.getInstance().getAccountManager().method_23084() ? super.method_42015() : false;
   }

   public void method_42023(boolean var1) {
      if (SigmaMainClass.getInstance().getAccountManager().method_23084()) {
         super.method_42023(var1);
      } else {
         if (this.field_46700 != var1) {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Premium", this.getName() + " Not yet available for free version"));
            SigmaMainClass.getInstance().getSoundManager().playSound("error");
         }
      }
   }

   public void setEnabled1(boolean var1) {
      if (SigmaMainClass.getInstance().getAccountManager().method_23084()) {
         super.setEnabled1(var1);
      } else {
         if (this.field_46700 != var1 && var1) {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Premium", this.getName() + " Not yet available for free version"));
            SigmaMainClass.getInstance().getSoundManager().playSound("error");
         }
      }
   }

   @Override
   public void setEnabled2(boolean var1) {
      if (SigmaMainClass.getInstance().getAccountManager().method_23084()) {
         super.setEnabled2(var1);
      } else {
         if (this.method_42015() != var1) {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Premium", this.getName() + " Not yet available for free version"));
            SigmaMainClass.getInstance().getSoundManager().playSound("error");
         }
      }
   }
}

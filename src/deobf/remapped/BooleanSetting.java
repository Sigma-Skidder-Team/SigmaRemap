package remapped;

public class BooleanSetting extends Setting<Boolean> {
   public boolean field_43797 = false;

   public BooleanSetting(String var1, String var2, boolean var3) {
      super(var1, var2, class_5195.field_26724, var3);
   }

   public BooleanSetting method_39397() {
      this.field_43797 = true;
      return this;
   }

   @Override
   public void method_23040() {
      this.field_43797 = false;
   }

   @Override
   public boolean method_23043() {
      return this.field_43797;
   }

   public void method_39399(Boolean var1, boolean var2) {
      if (this.field_43797 && var2) {
         SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Premium", "Not yet available for free version"));
      }

      super.method_23038(var1, var2);
   }

   public Boolean method_39398() {
      return !this.field_43797 ? this.field_25890 : this.field_25891;
   }

   @Override
   public JSONObjectImpl saveDataToJson(JSONObjectImpl var1) {
      this.field_25890 = JSONWriter.saveBooleanValue(var1, "value", this.getSaveValue());
      return var1;
   }
}

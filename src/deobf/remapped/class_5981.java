package remapped;

public class class_5981 extends Module {
   public class_5981() {
      super(Category.COMBAT, "AntiBot", "Avoid the client to focus bots.");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Advanced", "Hypixel").method_23029(var1 -> this.method_27290()));
   }

   @Override
   public void method_42012() {
      if (this.method_42015()) {
         this.method_27290();
      }
   }

   @Override
   public void method_42006() {
      this.method_27290();
   }

   @Override
   public void method_42020() {
      SigmaMainClass.getInstance().method_3331().field_21538 = null;
      SigmaMainClass.getInstance().method_3331().field_21536.clear();
   }

   private void method_27290() {
      SigmaMainClass.getInstance().method_3331().field_21536.clear();
      String var3 = this.getStringValueByName("Mode");
      switch (var3) {
         case "Advanced":
            SigmaMainClass.getInstance().method_3331().field_21538 = new class_1590();
            break;
         case "Hypixel":
            SigmaMainClass.getInstance().method_3331().field_21538 = new class_1911();
      }
   }
}

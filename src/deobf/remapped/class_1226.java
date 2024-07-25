package remapped;

public class class_1226 {
   public Module field_6787;
   public Class<? extends Screen> field_6788;

   public class_1226(Module var1) {
      this.field_6787 = var1;
   }

   public class_1226(Class<? extends Screen> var1) {
      this.field_6788 = var1;
   }

   public String method_5460() {
      return this.field_6787 == null ? GUIManager.field_34911.get(this.field_6788) : this.field_6787.getName();
   }

   public String method_5461() {
      return this.field_6787 == null ? "Screen" : this.field_6787.method_42004().getCategoryName();
   }

   public void method_5462(int var1) {
      if (this.field_6787 == null) {
         SigmaMainClass.getInstance().getModuleManager().getJelloTouch().method_367(var1, this.field_6788);
      } else {
         SigmaMainClass.getInstance().getModuleManager().getJelloTouch().method_368(var1, this.field_6787);
      }
   }

   public int method_5458() {
      return this.field_6787 == null
         ? SigmaMainClass.getInstance().getModuleManager().getJelloTouch().method_380(this.field_6788)
         : SigmaMainClass.getInstance().getModuleManager().getJelloTouch().method_381(this.field_6787);
   }
}

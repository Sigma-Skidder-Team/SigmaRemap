package remapped;

public class class_8454 extends Module {
   private class_7376 field_43222;

   public class_8454() {
      super(class_5664.field_28711, "Funcraft", "Gameplay for Funcraft");
   }

   @Override
   public void method_42012() {
      this.field_43222 = (class_7376)this.method_42017();
   }

   @class_9148
   private void method_38867(class_139 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_5182) {
            class_5182 var5 = (class_5182)var4;
            String var6 = var5.method_23768().getString();
            String var7 = mcInstance.field_9632.method_45509().getString().toLowerCase();
            if (this.field_43222.method_42007("AutoL")
               && (var6.toLowerCase().contains("a été tué par " + var7) || var6.toLowerCase().contains("a été tué par le vide et " + var7))) {
               this.field_43222.method_33596(var6);
            }
         }
      }
   }
}

package remapped;

public class XRayModule extends Module {
   public static XRayModule field_37635;

   public XRayModule() {
      super(Category.RENDER, "XRay", "Shows ores");
      field_37635 = this;
   }

   @Override
   public void onEnable() {
      mcInstance.worldRenderer.method_19998();
      class_914 var3 = (class_914) SigmaMainClass.getInstance().getModuleManager().method_847(class_914.class);
      if (!var3.method_42015()) {
         var3.method_42023(true);
      }
   }

   @Override
   public void onDisable() {
      mcInstance.worldRenderer.method_19998();
   }

   @EventListen
   public void method_33542(class_3310 var1) {
      if (this.method_42015()) {
         class_1873 var4 = var1.method_15183();
         if (!(var4.method_8360() instanceof class_285) && var4.method_8360() != class_4783.field_23211) {
            var1.method_29715(true);
         } else {
            var1.method_15182(true);
         }
      }
   }
}

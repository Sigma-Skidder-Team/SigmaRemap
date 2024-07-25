package remapped;

public class PortalGUIModule extends Module {
   public PortalGUIModule() {
      super(Category.MISC, "PortalGui", "Allows GUIs while in nether portal");
   }

   @EventListen
   private void method_12031(class_5596 var1) {
      if (this.method_42015()) {
         mcInstance.field_9632.field_41772 = false;
      }
   }
}

package remapped;

public class class_9459 extends Module {
   public int field_48266 = 30;

   public class_9459() {
      super(Category.PLAYER, "AutoRespawn", "Respawns for you");
   }

   @EventListen
   public void method_43730(class_5596 var1) {
      if (this.method_42015()) {
         if (!mc.field_9632.method_37330()) {
            mc.field_9632.method_3205();
         }
      }
   }
}

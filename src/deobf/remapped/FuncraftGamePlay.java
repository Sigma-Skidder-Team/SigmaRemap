package remapped;

public class FuncraftGamePlay extends Module {
   private GamePlayModule field_43222;

   public FuncraftGamePlay() {
      super(Category.MISC, "Funcraft", "Gameplay for Funcraft");
   }

   @Override
   public void method_42012() {
      this.field_43222 = (GamePlayModule)this.getModule();
   }

   @EventListen
   private void method_38867(PacketEvent var1) {
      if (this.method_42015() && client.thePlayer != null) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_5182) {
            class_5182 var5 = (class_5182)var4;
            String var6 = var5.method_23768().getString();
            String var7 = client.thePlayer.method_45509().getString().toLowerCase();
            if (this.field_43222.getBooleanValueByName("AutoL")
               && (var6.toLowerCase().contains("a été tué par " + var7) || var6.toLowerCase().contains("a été tué par le vide et " + var7))) {
               this.field_43222.method_33596(var6);
            }
         }
      }
   }
}

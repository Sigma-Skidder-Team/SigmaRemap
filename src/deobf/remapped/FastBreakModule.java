package remapped;

public class FastBreakModule extends Module {
   public FastBreakModule() {
      super(Category.WORLD, "FastBreak", "Break blocks faster");
   }

   @EventListen
   private void method_4769(class_5596 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9647.field_46832 > 0.7F) {
            mcInstance.field_9647.field_46832 = 1.0F;
         }

         mcInstance.field_9647.field_46831 = 0;
      }
   }
}

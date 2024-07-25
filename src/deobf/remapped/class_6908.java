package remapped;

public class class_6908 extends SecondModule {
   public static int field_35509;

   public class_6908() {
      super(
         Category.MOVEMENT,
         "Speed",
         "Vroom vroom",
         new class_8191(),
         new class_2462(),
         new class_6053(),
         new class_7448(),
         new class_5647(),
         new SlowHopModule(),
         new class_1467(),
         new class_6865(),
         new class_8318(),
         new class_2766(),
         new class_4835(),
         new class_5983(),
         new class_5761(),
         new class_6799(),
         new class_7318()
      );
      this.addSetting(new BooleanSetting("Lag back checker", "Disable speed when you get lag back", true));
      field_35509 = 0;
   }

   @EventListen
   public void method_31652(class_5596 var1) {
      field_35509++;
   }

   @EventListen
   public void method_31654(class_139 var1) {
      if (var1.method_557() instanceof class_509 && mcInstance.field_9632 != null) {
         field_35509 = 0;
         if (this.getBooleanValueByName("Lag back checker") && this.method_42015() && mcInstance.field_9632.field_41697 > 2) {
            SigmaMainClass.getInstance().method_3335().method_27841(new class_8235("Speed", "Disabled speed due to lagback."));
            this.method_41999();
         }
      }
   }

   public void method_31653() {
      if (this.field_17664 instanceof class_2462) {
         class_2462 var3 = (class_2462)this.field_17664;
         var3.method_11347();
      }
   }
}

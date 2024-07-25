package remapped;

public class UnderwaterAmbientSoundHandler implements IAmbientSoundHandler {
   private static String[] field_17424;
   private final ClientPlayerEntity field_17425;
   private final class_3541 field_17422;
   private int field_17423 = 0;

   public UnderwaterAmbientSoundHandler(ClientPlayerEntity var1, class_3541 var2) {
      this.field_17425 = var1;
      this.field_17422 = var2;
   }

   @Override
   public void tick() {
      this.field_17423--;
      if (this.field_17423 <= 0 && this.field_17425.method_37179()) {
         float var3 = this.field_17425.world.field_33033.nextFloat();
         if (!(var3 < 1.0E-4F)) {
            if (!(var3 < 0.001F)) {
               if (var3 < 0.01F) {
                  this.field_17423 = 0;
                  this.field_17422.play(new class_6120(this.field_17425, class_463.field_2710));
               }
            } else {
               this.field_17423 = 0;
               this.field_17422.play(new class_6120(this.field_17425, class_463.field_2184));
            }
         } else {
            this.field_17423 = 0;
            this.field_17422.play(new class_6120(this.field_17425, class_463.field_2736));
         }
      }
   }
}

package remapped;

public interface class_5543 {
   float method_25220();

   default float method_25221(boolean var1) {
      return this.method_25220() + (!var1 ? 0.0F : this.method_25218());
   }

   default float method_25219() {
      return 0.0F;
   }

   default float method_25218() {
      return 1.0F;
   }

   default float method_25217() {
      return 1.0F;
   }
}

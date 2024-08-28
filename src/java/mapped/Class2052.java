package mapped;

public interface Class2052 {
   float method8689();

   default float method8699(boolean var1) {
      return this.method8689() + (!var1 ? 0.0F : this.method8701());
   }

   default float method8700() {
      return 0.0F;
   }

   default float method8701() {
      return 1.0F;
   }

   default float method8702() {
      return 1.0F;
   }
}

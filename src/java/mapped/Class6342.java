package mapped;

public class Class6342 extends Class6333 {
   private static String[] field27867;
   private final ClientPlayerEntity field27868;
   private int field27869;

   public Class6342(ClientPlayerEntity var1) {
      super(Class6067.field26331, Class2266.field14736);
      this.field27868 = var1;
      this.field27861 = true;
      this.field27862 = 0;
      this.field27856 = 1.0F;
      this.field27864 = true;
      this.field27865 = true;
   }

   @Override
   public void method19269() {
      if (!this.field27868.field5041 && this.field27869 >= 0) {
         if (!this.field27868.method3256()) {
            this.field27869 -= 2;
         } else {
            this.field27869++;
         }

         this.field27869 = Math.min(this.field27869, 40);
         this.field27856 = Math.max(0.0F, Math.min((float)this.field27869 / 40.0F, 1.0F));
      } else {
         this.method19271();
      }
   }
}

package mapped;

public class Class6343 extends Class6333 {
   private static String[] field27870;
   private final ClientPlayerEntity field27871;
   private int field27872;

   public Class6343(ClientPlayerEntity var1) {
      super(Sounds.field26532, Class2266.field14735);
      this.field27871 = var1;
      this.field27861 = true;
      this.field27862 = 0;
      this.field27856 = 0.1F;
   }

   @Override
   public void method19269() {
      this.field27872++;
      if (!this.field27871.field5041 && (this.field27872 <= 20 || this.field27871.method3165())) {
         this.field27858 = (double)((float)this.field27871.getPosX());
         this.field27859 = (double)((float)this.field27871.getPosY());
         this.field27860 = (double)((float)this.field27871.getPosZ());
         float var3 = (float)this.field27871.method3433().method11349();
         if (!((double)var3 >= 1.0E-7)) {
            this.field27856 = 0.0F;
         } else {
            this.field27856 = MathHelper.method37777(var3 / 4.0F, 0.0F, 1.0F);
         }

         if (this.field27872 >= 20) {
            if (this.field27872 < 40) {
               this.field27856 = (float)((double)this.field27856 * ((double)(this.field27872 - 20) / 20.0));
            }
         } else {
            this.field27856 = 0.0F;
         }

         float var4 = 0.8F;
         if (!(this.field27856 > 0.8F)) {
            this.field27857 = 1.0F;
         } else {
            this.field27857 = 1.0F + (this.field27856 - 0.8F);
         }
      } else {
         this.method19271();
      }
   }
}

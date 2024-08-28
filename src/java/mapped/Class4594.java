package mapped;

public class Class4594 extends Class4566 {
   private static String[] field22086;
   private final Class7631 field22087;
   public boolean field22088;

   public Class4594(Class1656 var1, double var2, double var4, double var6, Class7631 var8) {
      super(var1, var2, var4, var6);
      this.method14519(0.01F, 0.01F);
      this.field22057 = 0.06F;
      this.field22087 = var8;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29735;
   }

   @Override
   public int method14499(float var1) {
      return !this.field22088 ? super.method14499(var1) : 240;
   }

   @Override
   public void method14500() {
      this.field22038 = this.field22041;
      this.field22039 = this.field22042;
      this.field22040 = this.field22043;
      this.method14533();
      if (!this.field22051) {
         this.field22045 = this.field22045 - (double)this.field22057;
         this.method14511(this.field22044, this.field22045, this.field22046);
         this.method14534();
         if (!this.field22051) {
            this.field22044 *= 0.98F;
            this.field22045 *= 0.98F;
            this.field22046 *= 0.98F;
            BlockPos var3 = new BlockPos(this.field22041, this.field22042, this.field22043);
            Class7379 var4 = this.field22037.method6739(var3);
            if (var4.method23472() == this.field22087 && this.field22042 < (double)((float)var3.getY() + var4.method23475(this.field22037, var3))) {
               this.method14518();
            }
         }
      }
   }

   public void method14533() {
      if (this.field22056-- <= 0) {
         this.method14518();
      }
   }

   public void method14534() {
   }
}

package mapped;

public class Class9715 {
   private static String[] field45393;
   private float field45394;
   private Class2422 field45395 = new Class2422();
   private Class8899 field45396 = new Class8899(this);
   private long field45397;
   private boolean field45398 = false;
   private float field45399 = -1.0F;

   public Class9715() {
      this.field45396.method32437();
      this.field45397 = (long)this.field45395.nextInt(8000, 10000);
      this.field45394 = this.field45395.nextFloat();
   }

   public void method38061() {
      if (this.field45396.method32440() > this.field45397) {
         this.field45397 = (long)this.field45395.nextInt(8000, 10000);
         this.field45398 = true;
         this.field45399 = this.field45395.nextFloat() + 0.75F;
         boolean var3 = this.field45395.nextBoolean();
         if (var3) {
            this.field45399 *= -1.0F;
         }

         this.field45396.method32439();
      }

      if (this.field45398 && this.field45399 != -1.0F && this.field45396.method32440() % 10L == 0L) {
         if (!(this.field45399 > this.field45394)) {
            this.field45394 -= 0.02F;
            if (this.field45399 > this.field45394) {
               this.field45394 = this.field45399;
               this.field45398 = false;
               this.field45399 = -1.0F;
            }
         } else {
            this.field45394 += 0.02F;
            if (this.field45399 < this.field45394) {
               this.field45394 = this.field45399;
               this.field45398 = false;
               this.field45399 = -1.0F;
            }
         }
      }
   }

   public float method38062() {
      return this.field45394;
   }
}

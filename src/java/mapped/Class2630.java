package mapped;

public class Class2630 extends Class2628 {
   private static String[] field16940;
   private final Class1088 field16941;

   public Class2630(Class1088 var1, double var2) {
      super(var1, var2, 16);
      this.field16941 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16941.method5045() && Class1088.method5056(this.field16941).method8317(this.field16941.getPositionVec(), 9.0) ? super.method10803() : false;
   }

   @Override
   public boolean method10806() {
      return super.method10806() && this.field16941.method5045() && Class1088.method5056(this.field16941).method8317(this.field16941.getPositionVec(), 9.0);
   }

   @Override
   public void method10805() {
      super.method10805();
      BlockPos var3 = this.field16941.getPosition();
      if (!this.field16941.method3250() && this.method10838()) {
         if (Class1088.method5059(this.field16941) >= 1) {
            if (Class1088.method5059(this.field16941) > 200) {
               World var4 = this.field16941.world;
               var4.method6742((PlayerEntity)null, var3, Sounds.field27172, Class2266.field14732, 0.3F, 0.9F + var4.field9016.nextFloat() * 0.2F);
               var4.method6725(
                  this.field16933.method8311(),
                  Blocks.field36964.method11579().method23465(Class3441.field19244, Integer.valueOf(Class1088.method5061(this.field16941).nextInt(4) + 1)),
                  3
               );
               Class1088.method5062(this.field16941, false);
               Class1088.method5060(this.field16941, false);
               this.field16941.method4504(600);
            }
         } else {
            Class1088.method5060(this.field16941, true);
         }

         if (this.field16941.method5047()) {
            Class1088.method5063(this.field16941);
         }
      }
   }

   @Override
   public boolean method10840(Class1662 var1, BlockPos var2) {
      return var1.method7007(var2.method8311()) ? Class3441.method12115(var1, var2) : false;
   }
}

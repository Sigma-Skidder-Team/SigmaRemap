package mapped;

public abstract class Class1046 extends Class1006 {
   public Class1046(Class8992<? extends Class1046> var1, World var2) {
      super(var1, var2);
   }

   public float method4771(BlockPos var1) {
      return this.method4339(var1, this.field5024);
   }

   public float method4339(BlockPos var1, Class1662 var2) {
      return 0.0F;
   }

   @Override
   public boolean method4265(Class1660 var1, Class2202 var2) {
      return this.method4339(this.method3432(), var1) >= 0.0F;
   }

   public boolean method4772() {
      return !this.method4230().method21664();
   }

   @Override
   public void method4293() {
      super.method4293();
      Entity var3 = this.method4297();
      if (var3 != null && var3.field5024 == this.field5024) {
         this.method4288(var3.method3432(), 5);
         float var4 = this.method3275(var3);
         if (this instanceof Class1013 && ((Class1013)this).method4395()) {
            if (var4 > 10.0F) {
               this.method4294(true, true);
            }

            return;
         }

         this.method4774(var4);
         if (!(var4 > 10.0F)) {
            if (!(var4 > 6.0F)) {
               this.field5600.method20009(Class2240.field14657);
               float var5 = 2.0F;
               Vector3d var6 = new Vector3d(
                     var3.getPosX() - this.getPosX(), var3.getPosY() - this.getPosY(), var3.getPosZ() - this.getPosZ()
                  )
                  .method11333()
                  .method11344((double)Math.max(var4 - 2.0F, 0.0F));
               this.method4230()
                  .method21654(this.getPosX() + var6.field18048, this.getPosY() + var6.field18049, this.getPosZ() + var6.field18050, this.method4773());
            } else {
               double var7 = (var3.getPosX() - this.getPosX()) / (double)var4;
               double var9 = (var3.getPosY() - this.getPosY()) / (double)var4;
               double var11 = (var3.getPosZ() - this.getPosZ()) / (double)var4;
               this.method3434(
                  this.method3433()
                     .method11339(Math.copySign(var7 * var7 * 0.4, var7), Math.copySign(var9 * var9 * 0.4, var9), Math.copySign(var11 * var11 * 0.4, var11))
               );
            }
         } else {
            this.method4294(true, true);
            this.field5600.method20008(Class2240.field14657);
         }
      }
   }

   public double method4773() {
      return 1.0;
   }

   public void method4774(float var1) {
   }
}

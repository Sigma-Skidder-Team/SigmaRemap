package mapped;

public class Class4593 extends Class4587 {
   private static String[] field22080;
   private final Class7911 field22081;
   private final Entity field22082;
   private final Entity field22083;
   private int field22084;
   private final Class8853 field22085;

   public Class4593(Class8853 var1, Class7911 var2, Class1656 var3, Entity var4, Entity var5) {
      this(var1, var2, var3, var4, var5, var4.method3433());
   }

   private Class4593(Class8853 var1, Class7911 var2, Class1656 var3, Entity var4, Entity var5, Vector3d var6) {
      super(var3, var4.getPosX(), var4.getPosY(), var4.getPosZ(), var6.field18048, var6.field18049, var6.field18050);
      this.field22081 = var2;
      this.field22082 = this.method14532(var4);
      this.field22083 = var5;
      this.field22085 = var1;
   }

   private Entity method14532(Entity var1) {
      return (Entity)(var1 instanceof ItemEntity ? ((ItemEntity)var1).method4139() : var1);
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29738;
   }

   @Override
   public void method14510(Class5422 var1, Class9624 var2, float var3) {
      Class7906 var6 = null;
      if (Class7944.method26921()) {
         var6 = Class8981.field40848;
         Class8981.method33079(this.field22082);
      }

      float var7 = ((float)this.field22084 + var3) / 3.0F;
      var7 *= var7;
      double var8 = MathHelper.method37822((double)var3, this.field22083.field5048, this.field22083.getPosX());
      double var10 = MathHelper.method37822((double)var3, this.field22083.field5049, this.field22083.getPosY()) + 0.5;
      double var12 = MathHelper.method37822((double)var3, this.field22083.field5050, this.field22083.getPosZ());
      double var14 = MathHelper.method37822((double)var7, this.field22082.getPosX(), var8);
      double var16 = MathHelper.method37822((double)var7, this.field22082.getPosY(), var10);
      double var18 = MathHelper.method37822((double)var7, this.field22082.getPosZ(), var12);
      Class7735 var20 = this.field22081.method26536();
      Vector3d var21 = var2.method37504();
      this.field22085
         .method32219(
            this.field22082,
            var14 - var21.method11320(),
            var16 - var21.method11321(),
            var18 - var21.method11322(),
            this.field22082.field5031,
            var3,
            new Class9332(),
            var20,
            this.field22085.method32208(this.field22082, var3)
         );
      var20.method25602();
      if (Class7944.method26921()) {
         Class8981.method33080((Entity)null);
         Class8981.method33021(var6);
      }
   }

   @Override
   public void method14500() {
      this.field22084++;
      if (this.field22084 == 3) {
         this.method14518();
      }
   }
}

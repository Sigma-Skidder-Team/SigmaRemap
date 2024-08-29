package mapped;

public class Class2675 extends Class2672 {
   private static String[] field17065;
   private final Class8522 field17066;
   public final Class1032 field17067;

   Class2675(Class1032 var1) {
      super(var1);
      this.field17067 = var1;
      this.field17066 = new Class8522().method30203(16.0).method30206().method30208().method30204().method30205();
   }

   @Override
   public boolean method10803() {
      if (super.method10803()) {
         int var3 = this.field17067
            .world
            .<Class1100>method7195(Class1100.class, this.field17066, this.field17067, this.field17067.method3389().method19664(16.0))
            .size();
         return Class1032.method4604(this.field17067).nextInt(8) + 1 > var3;
      } else {
         return false;
      }
   }

   @Override
   public int method10892() {
      return 100;
   }

   @Override
   public int method10893() {
      return 340;
   }

   @Override
   public void method10890() {
      ServerWorld var3 = (ServerWorld)this.field17067.world;

      for (int var4 = 0; var4 < 3; var4++) {
         BlockPos var5 = this.field17067
            .getPosition()
            .method8336(-2 + Class1032.method4605(this.field17067).nextInt(5), 1, -2 + Class1032.method4606(this.field17067).nextInt(5));
         Class1100 var6 = EntityType.field41097.method33215(this.field17067.world);
         var6.method3272(var5, 0.0F, 0.0F);
         var6.method4276(var3, this.field17067.world.method6807(var5), Class2202.field14396, (Class5093)null, (CompoundNBT)null);
         var6.method5277(this.field17067);
         var6.method5272(var5);
         var6.method5278(20 * (30 + Class1032.method4607(this.field17067).nextInt(90)));
         var3.method6995(var6);
      }
   }

   @Override
   public Class9455 method10894() {
      return Class6067.field26566;
   }

   @Override
   public Class2031 method10895() {
      return Class2031.field13182;
   }
}

package mapped;

public abstract class Class2692 extends Class2595 {
   private final Class8522 field17132;
   public final Class1095 field17133;

   public Class2692(Class1095 var1) {
      this.field17133 = var1;
      Class8522 var10001 = new Class8522().method30203(12.0).method30206();
      Class1095 var10004 = this.field17133;
      this.field17133.getClass();
      this.field17132 = var10001.method30209(new Class168(var10004));
   }

   public boolean method10910() {
      BlockPos var3 = new BlockPos(this.field17133.getPosX(), this.field17133.method3389().field28453, this.field17133.getPosZ());
      return !this.field17133.field5024.method7022(var3) && this.field17133.method4771(var3) >= 0.0F;
   }

   public boolean method10911() {
      return !this.field17133
         .field5024
         .<Class880>method7195(Class880.class, this.field17132, this.field17133, this.field17133.method3389().method19663(12.0, 6.0, 12.0))
         .isEmpty();
   }
}

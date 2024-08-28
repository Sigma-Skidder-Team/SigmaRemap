package mapped;

public class Class6461 extends Class6462 {
   private static String[] field28395;
   private final Class878 field28396;

   public Class6461(Class878 var1) {
      this.field28396 = var1;
   }

   @Override
   public void method19633(Class3257 var1, int var2) {
      super.method19633(var1, var2);
      this.field28396.field4855.sendPacket(new Class5574(var1, var2));
   }

   @Override
   public void method19634(Class3257 var1) {
      super.method19634(var1);
      this.field28396.field4855.sendPacket(new Class5574(var1, 0));
   }
}

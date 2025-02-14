package mapped;

public class Class2645 extends Class2642 {
   private static String[] field16985;
   private final boolean field16986;
   private int field16987;

   public Class2645(MobEntity var1, boolean var2) {
      super(var1);
      this.field16974 = var1;
      this.field16986 = var2;
   }

   @Override
   public boolean method10806() {
      return this.field16986 && this.field16987 > 0 && super.method10806();
   }

   @Override
   public void method10804() {
      this.field16987 = 20;
      this.method10851(true);
   }

   @Override
   public void method10807() {
      this.method10851(false);
   }

   @Override
   public void method10805() {
      this.field16987--;
      super.method10805();
   }
}

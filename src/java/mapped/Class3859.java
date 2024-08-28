package mapped;

public class Class3859 extends Class3758 {
   private static String[] field20085;
   public final Class1867 field20086;
   public final Class6904 field20087;

   public Class3859(Class6904 var1, Class1867 var2) {
      this.field20087 = var1;
      this.field20086 = var2;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22544);
      this.map(Class4750.field22541);
      this.map(Class4750.field22544);
      this.map(Class4750.field22528);
      this.map(Class4750.field22528);
      this.map(Class4750.field22528);
      this.map(Class4750.field22518);
      this.map(Class4750.field22518);
      this.map(Class4750.field22526);
      this.method12733(this.field20087.method21101());
      this.method12733(var2 -> {
         int var5 = var2.<Integer>method30555(Class4750.field22544, 0);
         Class1867 var6 = var2.method30580().<Class6036>method22438(Class6904.method21111(this.field20087)).method18668(var5);
         if (var6 == field20086) {
            var2.method30558(Class4750.field22526, 0, this.field20087.field29902.method19376().method18528(var2.<Integer>method30555(Class4750.field22526, 0)));
         }
      });
   }
}

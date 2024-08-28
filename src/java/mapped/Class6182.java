package mapped;

public class Class6182 implements Class6180 {
   private static String[] field27620;
   public final Class4499 field27621;

   public Class6182(Class4499 var1) {
      this.field27621 = var1;
   }

   @Override
   public Class7255 method19088(Object var1) {
      Class9757 var4 = new Class9757((Class<? extends Object>)var1.getClass());
      return this.field27621.method14193(this.field27621.method14203(var1.getClass(), var4), ((Enum)var1).name());
   }
}

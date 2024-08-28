package mapped;

public class Class3793 extends Class3758 {
   private static String[] field19976;
   public final Class4750 field19977;
   public final Class4750 field19978;
   public final Class8123 field19979;

   public Class3793(Class8123 var1, Class4750 var2, Class4750 var3) {
      this.field19979 = var1;
      this.field19977 = var2;
      this.field19978 = var3;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22526);
      this.map(Class4750.field22524);
      this.map(this.field19977);
      this.map(this.field19977);
      this.map(this.field19977);
      this.map(Class4750.field22532);
      this.map(Class4750.field22532);
      this.map(Class4750.field22532);
      this.map(Class4750.field22532);
      this.map(Class4750.field22526);
      this.method12733(var2 -> {
         int var5 = var2.<Integer>method30555(Class4750.field22526, 0);
         if (var5 != -1) {
            Class8939 var6 = Class8123.method28143(this.field19979).method19376().method18534();
            if (var5 == var6.method32667() || var5 == var6.method32668()) {
               int var7 = var2.method30561(Class4750.field22544);
               var2.method30558(Class4750.field22544, 0, Class8123.method28143(this.field19979).method19376().method18528(var7));
            } else if (var5 == var6.method32669()) {
               Class8123.method28142(this.field19979).method30683((Class9738) var2.method30561(field19978));
            }

            int var8 = Class8123.method28143(this.field19979).method19376().method18532(var5);
            if (var8 != var5) {
               var2.method30558(Class4750.field22526, 0, var8);
            }
         }
      });
   }
}

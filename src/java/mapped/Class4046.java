package mapped;

public class Class4046 extends Class3758 {
   private static String[] field20380;
   public final Class7136 field20381;

   public Class4046(Class7136 var1) {
      this.field20381 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var1 -> {
         Class5979 var4 = Class7136.method22260(this.field20381).method19376();
         Class7136.method22262(this.field20381, var1, var1x -> var4 == null ? null : var4.method18529(var1x), Class7136.method22261(this.field20381));
         Class7136.method22262(this.field20381, var1, var1x -> var4 == null ? null : var4.method18530(var1x), Class7136.method22263(this.field20381));
         if (Class7136.method22264(this.field20381) != null || !Class7136.method22265(this.field20381).isEmpty()) {
            int var5 = var1.<Integer>method30561(Class4750.field22544);

            for (int var6 = 0; var6 < var5; var6++) {
               var1.<String>method30561(Class4750.field22539);
               var1.<int[]>method30561(Class4750.field22546);
            }

            Class7136.method22262(this.field20381, var1, Class7136.method22264(this.field20381), Class7136.method22265(this.field20381));
         }
      });
   }
}

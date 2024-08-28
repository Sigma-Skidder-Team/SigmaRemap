package mapped;

public class Class4634 extends Class4633 {
   private static String[] field22159;
   public final Class6208 field22160;

   public Class4634(Class6208 var1) {
      super(var1);
      this.field22160 = var1;
   }

   @Override
   public void method14588(Class7255 var1, Object var2) {
      Class7254 var5 = (Class7254)var1;
      Class9460 var6 = var5.method22770().iterator().next();
      Class7255 var7 = var6.method36418();
      if (!(var7 instanceof Class7254)) {
         this.field22160.method19139(var2, Class6208.method19141(this.field22160, (Class7252)var7));
      } else {
         var7.method22785((Class<? extends Object>)var2.getClass());
         this.method14589((Class7254)var7, var2);
      }
   }

   @Override
   public Object method14587(Class7255 var1) {
      Class7256 var4;
      if (!(var1 instanceof Class7254)) {
         var4 = (Class7256)var1;
      } else {
         Class7254 var5 = (Class7254)var1;
         Class9460 var6 = var5.method22770().iterator().next();
         var1.method22786(true);
         var4 = (Class7256)var6.method36417();
      }

      Class8872 var7 = this.field22160.method19135(var4.method22791());
      return var7 != null ? this.field22160.method19132(var4, var7) : Class6208.method19142(this.field22160, var4);
   }
}

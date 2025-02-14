package mapped;

public class Class4638 implements Class4632 {
   public final Class6210 field22164;

   public Class4638(Class6210 var1) {
      this.field22164 = var1;
   }

   private Class4632 method14593(Class7255 var1) {
      Class var4 = this.field22164.method19146(var1);
      var1.method22785(var4);
      return this.field22164.field27701.get(var1.method22769());
   }

   @Override
   public Object method14587(Class7255 var1) {
      try {
         return this.method14593(var1).method14587(var1);
      } catch (Class2482 var5) {
         throw var5;
      } catch (Exception var6) {
         throw new Class2482(
            null, null, "Can't construct a java object for " + var1.method22780() + "; exception=" + var6.getMessage(), var1.method22782(), var6
         );
      }
   }

   @Override
   public void method14588(Class7255 var1, Object var2) {
      try {
         this.method14593(var1).method14588(var1, var2);
      } catch (Exception var6) {
         throw new Class2482(
            null,
            null,
            "Can't construct a second step for a java object for " + var1.method22780() + "; exception=" + var6.getMessage(),
            var1.method22782(),
            var6
         );
      }
   }
}

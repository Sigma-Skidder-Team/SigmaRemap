package mapped;

import com.google.gson.JsonObject;

public class Class4462 extends Class4457 {
   private final Class9587 field21642;
   private final Class9587 field21643;
   private final Class9587 field21644;

   public Class4462(Class9587 var1, Class9587 var2, Class9587 var3, Class9587 var4) {
      super(Class4891.method15114(), var1);
      this.field21642 = var2;
      this.field21643 = var3;
      this.field21644 = var4;
   }

   public static Class4462 method14104() {
      return new Class4462(Class9587.field44822, Class9587.field44822, Class9587.field44822, Class9587.field44822);
   }

   public static Class4462 method14105(Class7552 var0) {
      return new Class4462(Class9587.field44822, Class9587.field44822, Class9587.field44822, Class9587.method37226(var0.method24717()));
   }

   public static Class4462 method14106(Class6671 var0, Class6671 var1, Class6671 var2) {
      return new Class4462(Class9587.field44822, Class9587.method37226(var0), Class9587.method37226(var1), Class9587.method37226(var2));
   }

   public boolean method14107(Class7812 var1, Class7812 var2, Class7812 var3) {
      return this.field21644 == Class9587.field44822 || var3 != null && this.field21644.method37227(var3)
         ? this.field21642.method37227(var1) && this.field21643.method37227(var2) || this.field21642.method37227(var2) && this.field21643.method37227(var1)
         : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("parent", this.field21642.method37228(var1));
      var4.add("partner", this.field21643.method37228(var1));
      var4.add("child", this.field21644.method37228(var1));
      return var4;
   }
}

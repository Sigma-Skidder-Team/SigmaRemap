package mapped;

import com.google.gson.JsonObject;

public class Class4488 extends Class4457 {
   private final Class8705<Class1655> field21689;
   private final Class8705<Class1655> field21690;

   public Class4488(Class9587 var1, Class8705<Class1655> var2, Class8705<Class1655> var3) {
      super(Class4901.method15148(), var1);
      this.field21689 = var2;
      this.field21690 = var3;
   }

   public static Class4488 method14156(Class8705<Class1655> var0) {
      return new Class4488(Class9587.field44822, (Class8705<Class1655>)null, var0);
   }

   public boolean method14157(Class8705<Class1655> var1, Class8705<Class1655> var2) {
      return this.field21689 != null && this.field21689 != var1 ? false : this.field21690 == null || this.field21690 == var2;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      if (this.field21689 != null) {
         var4.addProperty("from", this.field21689.method31399().toString());
      }

      if (this.field21690 != null) {
         var4.addProperty("to", this.field21690.method31399().toString());
      }

      return var4;
   }
}

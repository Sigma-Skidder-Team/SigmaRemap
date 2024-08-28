package mapped;

import com.google.gson.JsonObject;

import java.util.Collection;
import java.util.stream.Stream;

public class Class4493 extends Class4457 {
   private final Class9587[] field21699;

   public Class4493(Class9587 var1, Class9587[] var2) {
      super(Class4887.method15102(), var1);
      this.field21699 = var2;
   }

   public static Class4493 method14169(Class6671... var0) {
      return new Class4493(Class9587.field44822, Stream.<Class6671>of(var0).<Class9587>map(Class9587::method37226).<Class9587>toArray(Class9587[]::new));
   }

   public boolean method14170(Collection<? extends Class7812> var1) {
      for (Class9587 var7 : this.field21699) {
         boolean var8 = false;

         for (Class7812 var10 : var1) {
            if (var7.method37227(var10)) {
               var8 = true;
               break;
            }
         }

         if (!var8) {
            return false;
         }
      }

      return true;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("victims", Class9587.method37229(this.field21699, var1));
      return var4;
   }
}

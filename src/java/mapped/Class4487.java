package mapped;

import com.google.gson.JsonObject;

import java.util.Collection;

public class Class4487 extends Class4457 {
   private final Class8634 field21686;
   private final Class9587 field21687;
   private final Class8634 field21688;

   public Class4487(Class9587 var1, Class8634 var2, Class9587 var3, Class8634 var4) {
      super(Class4895.method15126(), var1);
      this.field21686 = var2;
      this.field21687 = var3;
      this.field21688 = var4;
   }

   public static Class4487 method14154(Class8634 var0, Class6671 var1, Class8634 var2) {
      return new Class4487(Class9587.field44822, var0, Class9587.method37226(var1), var2);
   }

   public boolean method14155(Class8848 var1, Class7812 var2, Collection<Class8848> var3) {
      if (this.field21686.method31016(var1)) {
         if (!this.field21687.method37227(var2)) {
            return false;
         } else {
            if (this.field21688 != Class8634.field38839) {
               boolean var6 = false;
               Entity var7 = var2.<Entity>method26081(Class9525.field44330);
               if (var7 instanceof Class1000) {
                  Class1000 var8 = (Class1000)var7;
                  if (this.field21688.method31016(var8.method4124())) {
                     var6 = true;
                  }
               }

               for (Class8848 var9 : var3) {
                  if (this.field21688.method31016(var9)) {
                     var6 = true;
                     break;
                  }
               }

               if (!var6) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("rod", this.field21686.method31018());
      var4.add("entity", this.field21687.method37228(var1));
      var4.add("item", this.field21688.method31018());
      return var4;
   }
}

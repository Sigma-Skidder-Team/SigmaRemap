package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Class4467 extends Class4457 {
   private final Class9587[] field21653;
   private final Class8840 field21654;

   public Class4467(Class9587 var1, Class9587[] var2, Class8840 var3) {
      super(Class4902.method15151(), var1);
      this.field21653 = var2;
      this.field21654 = var3;
   }

   public static Class4467 method14115(Class7552... var0) {
      Class9587[] var3 = new Class9587[var0.length];

      for (int var4 = 0; var4 < var0.length; var4++) {
         Class7552 var5 = var0[var4];
         var3[var4] = Class9587.method37226(var5.method24717());
      }

      return new Class4467(Class9587.field44822, var3, Class8840.field39936);
   }

   public static Class4467 method14116(Class8840 var0) {
      Class9587[] var3 = new Class9587[0];
      return new Class4467(Class9587.field44822, var3, var0);
   }

   public boolean method14117(Collection<LootContext> var1, int var2) {
      if (this.field21653.length > 0) {
         ArrayList var5 = Lists.newArrayList(var1);

         for (Class9587 var9 : this.field21653) {
            boolean var10 = false;
            Iterator var11 = var5.iterator();

            while (var11.hasNext()) {
               LootContext var12 = (LootContext)var11.next();
               if (var9.method37227(var12)) {
                  var11.remove();
                  var10 = true;
                  break;
               }
            }

            if (!var10) {
               return false;
            }
         }
      }

      return this.field21654.method32015(var2);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("victims", Class9587.method37229(this.field21653, var1));
      var4.add("unique_entity_types", this.field21654.method32005());
      return var4;
   }
}

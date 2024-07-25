package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class class_3321 {
   private Identifier field_16411;
   private class_3139 field_16409;
   private class_7750 field_16412;
   private class_5123 field_16408 = class_5123.field_26441;
   private Map<String, class_7353> field_16410 = Maps.newLinkedHashMap();
   private String[][] field_16406;
   private class_6701 field_16407 = class_6701.field_34597;

   private class_3321(Identifier var1, class_7750 var2, class_5123 var3, Map<String, class_7353> var4, String[][] var5) {
      this.field_16411 = var1;
      this.field_16412 = var2;
      this.field_16408 = var3;
      this.field_16410 = var4;
      this.field_16406 = var5;
   }

   private class_3321() {
   }

   public static class_3321 method_15269() {
      return new class_3321();
   }

   public class_3321 method_15274(class_3139 var1) {
      this.field_16409 = var1;
      return this;
   }

   public class_3321 method_15260(Identifier var1) {
      this.field_16411 = var1;
      return this;
   }

   public class_3321 method_15261(
           class_6098 var1, ITextComponent var2, ITextComponent var3, Identifier var4, class_3361 var5, boolean var6, boolean var7, boolean var8
   ) {
      return this.method_15262(new class_7750(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public class_3321 method_15263(
           class_8525 var1, ITextComponent var2, ITextComponent var3, Identifier var4, class_3361 var5, boolean var6, boolean var7, boolean var8
   ) {
      return this.method_15262(new class_7750(new class_6098(var1.method_10803()), var2, var3, var4, var5, var6, var7, var8));
   }

   public class_3321 method_15262(class_7750 var1) {
      this.field_16412 = var1;
      return this;
   }

   public class_3321 method_15258(class_7365 var1) {
      return this.method_15257(var1.method_33540());
   }

   public class_3321 method_15257(class_5123 var1) {
      this.field_16408 = var1;
      return this;
   }

   public class_3321 method_15272(String var1, class_5154 var2) {
      return this.method_15273(var1, new class_7353(var2));
   }

   public class_3321 method_15273(String var1, class_7353 var2) {
      if (!this.field_16410.containsKey(var1)) {
         this.field_16410.put(var1, var2);
         return this;
      } else {
         throw new IllegalArgumentException("Duplicate criterion " + var1);
      }
   }

   public class_3321 method_15271(class_6701 var1) {
      this.field_16407 = var1;
      return this;
   }

   public boolean method_15264(Function<Identifier, class_3139> var1) {
      if (this.field_16411 != null) {
         if (this.field_16409 == null) {
            this.field_16409 = (class_3139)var1.apply(this.field_16411);
         }

         return this.field_16409 != null;
      } else {
         return true;
      }
   }

   public class_3139 method_15268(Identifier var1) {
      if (this.method_15264(var0 -> null)) {
         if (this.field_16406 == null) {
            this.field_16406 = this.field_16407.method_30697(this.field_16410.keySet());
         }

         return new class_3139(var1, this.field_16409, this.field_16412, this.field_16408, this.field_16410, this.field_16406);
      } else {
         throw new IllegalStateException("Tried to build incomplete advancement!");
      }
   }

   public class_3139 method_15270(Consumer<class_3139> var1, String var2) {
      class_3139 var5 = this.method_15268(new Identifier(var2));
      var1.accept(var5);
      return var5;
   }

   public JsonObject method_15265() {
      if (this.field_16406 == null) {
         this.field_16406 = this.field_16407.method_30697(this.field_16410.keySet());
      }

      JsonObject var3 = new JsonObject();
      if (this.field_16409 == null) {
         if (this.field_16411 != null) {
            var3.addProperty("parent", this.field_16411.toString());
         }
      } else {
         var3.addProperty("parent", this.field_16409.method_14520().toString());
      }

      if (this.field_16412 != null) {
         var3.add("display", this.field_16412.method_35166());
      }

      var3.add("rewards", this.field_16408.method_23508());
      JsonObject var4 = new JsonObject();

      for (Entry var6 : this.field_16410.entrySet()) {
         var4.add((String)var6.getKey(), ((class_7353)var6.getValue()).method_33500());
      }

      var3.add("criteria", var4);
      JsonArray var15 = new JsonArray();

      for (String[] var9 : this.field_16406) {
         JsonArray var10 = new JsonArray();

         for (String var14 : var9) {
            var10.add(var14);
         }

         var15.add(var10);
      }

      var3.add("requirements", var15);
      return var3;
   }

   public void method_15256(class_8248 var1) {
      if (this.field_16411 != null) {
         var1.writeBoolean(true);
         var1.method_37780(this.field_16411);
      } else {
         var1.writeBoolean(false);
      }

      if (this.field_16412 != null) {
         var1.writeBoolean(true);
         this.field_16412.method_35156(var1);
      } else {
         var1.writeBoolean(false);
      }

      class_7353.method_33502(this.field_16410, var1);
      var1.method_37743(this.field_16406.length);

      for (String[] var7 : this.field_16406) {
         var1.method_37743(var7.length);

         for (String var11 : var7) {
            var1.method_37760(var11);
         }
      }
   }

   @Override
   public String toString() {
      return "Task Advancement{parentId="
         + this.field_16411
         + ", display="
         + this.field_16412
         + ", rewards="
         + this.field_16408
         + ", criteria="
         + this.field_16410
         + ", requirements="
         + Arrays.deepToString(this.field_16406)
         + '}';
   }

   public static class_3321 method_15259(JsonObject var0, class_8096 var1) {
      Identifier var4 = !var0.has("parent") ? null : new Identifier(class_6539.method_29796(var0, "parent"));
      class_7750 var5 = !var0.has("display") ? null : class_7750.method_35159(class_6539.method_29783(var0, "display"));
      class_5123 var6 = !var0.has("rewards") ? class_5123.field_26441 : class_5123.method_23511(class_6539.method_29783(var0, "rewards"));
      Map var7 = class_7353.method_33506(class_6539.method_29783(var0, "criteria"), var1);
      if (var7.isEmpty()) {
         throw new JsonSyntaxException("Advancement criteria cannot be empty");
      } else {
         JsonArray var8 = class_6539.method_29788(var0, "requirements", new JsonArray());
         String[][] var9 = new String[var8.size()][];

         for (int var10 = 0; var10 < var8.size(); var10++) {
            JsonArray var11 = class_6539.method_29786(var8.get(var10), "requirements[" + var10 + "]");
            var9[var10] = new String[var11.size()];

            for (int var12 = 0; var12 < var11.size(); var12++) {
               var9[var10][var12] = class_6539.method_29795(var11.get(var12), "requirements[" + var10 + "][" + var12 + "]");
            }
         }

         if (var9.length == 0) {
            var9 = new String[var7.size()][];
            int var18 = 0;

            for (String var24 : var7.keySet()) {
               var9[var18++] = new String[]{var24};
            }
         }

         for (String[] var13 : var9) {
            if (var13.length == 0 && var7.isEmpty()) {
               throw new JsonSyntaxException("Requirement entry cannot be empty");
            }

            for (String var17 : var13) {
               if (!var7.containsKey(var17)) {
                  throw new JsonSyntaxException("Unknown required criterion '" + var17 + "'");
               }
            }
         }

         for (String var23 : var7.keySet()) {
            boolean var26 = false;

            for (String[] var30 : var9) {
               if (ArrayUtils.contains(var30, var23)) {
                  var26 = true;
                  break;
               }
            }

            if (!var26) {
               throw new JsonSyntaxException(
                  "Criterion '" + var23 + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required."
               );
            }
         }

         return new class_3321(var4, var5, var6, var7, var9);
      }
   }

   public static class_3321 method_15267(class_8248 var0) {
      Identifier var3 = !var0.readBoolean() ? null : var0.method_37768();
      class_7750 var4 = !var0.readBoolean() ? null : class_7750.method_35165(var0);
      Map var5 = class_7353.method_33507(var0);
      String[][] var6 = new String[var0.method_37778()][];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = new String[var0.method_37778()];

         for (int var8 = 0; var8 < var6[var7].length; var8++) {
            var6[var7][var8] = var0.method_37784(32767);
         }
      }

      return new class_3321(var3, var4, class_5123.field_26441, var5, var6);
   }

   public Map<String, class_7353> method_15255() {
      return this.field_16410;
   }
}

package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;

import net.minecraft.advancements.Advancement;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class Class7999 {
   private ResourceLocation field34392;
   private Advancement field34393;
   private Class9272 field34394;
   private Class8588 field34395 = Class8588.field38664;
   private Map<String, Class9181> field34396 = Maps.newLinkedHashMap();
   private String[][] field34397;
   private Class9014 field34398 = Class9014.field41220;

   public Class7999(ResourceLocation var1, Class9272 var2, Class8588 var3, Map<String, Class9181> var4, String[][] var5) {
      this.field34392 = var1;
      this.field34394 = var2;
      this.field34395 = var3;
      this.field34396 = var4;
      this.field34397 = var5;
   }

   private Class7999() {
   }

   public static Class7999 method27304() {
      return new Class7999();
   }

   public Class7999 method27305(Advancement var1) {
      this.field34393 = var1;
      return this;
   }

   public Class7999 method27306(ResourceLocation var1) {
      this.field34392 = var1;
      return this;
   }

   public Class7999 method27307(
           ItemStack var1, ITextComponent var2, ITextComponent var3, ResourceLocation var4, Class1965 var5, boolean var6, boolean var7, boolean var8
   ) {
      return this.method27309(new Class9272(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public Class7999 method27308(
           IItemProvider var1, ITextComponent var2, ITextComponent var3, ResourceLocation var4, Class1965 var5, boolean var6, boolean var7, boolean var8
   ) {
      return this.method27309(new Class9272(new ItemStack(var1.method11581()), var2, var3, var4, var5, var6, var7, var8));
   }

   public Class7999 method27309(Class9272 var1) {
      this.field34394 = var1;
      return this;
   }

   public Class7999 method27310(Class9182 var1) {
      return this.method27311(var1.method34347());
   }

   public Class7999 method27311(Class8588 var1) {
      this.field34395 = var1;
      return this;
   }

   public Class7999 method27312(String var1, Class4477 var2) {
      return this.method27313(var1, new Class9181(var2));
   }

   public Class7999 method27313(String var1, Class9181 var2) {
      if (!this.field34396.containsKey(var1)) {
         this.field34396.put(var1, var2);
         return this;
      } else {
         throw new IllegalArgumentException("Duplicate criterion " + var1);
      }
   }

   public Class7999 method27314(Class9014 var1) {
      this.field34398 = var1;
      return this;
   }

   public boolean method27315(Function<ResourceLocation, Advancement> var1) {
      if (this.field34392 != null) {
         if (this.field34393 == null) {
            this.field34393 = (Advancement)var1.apply(this.field34392);
         }

         return this.field34393 != null;
      } else {
         return true;
      }
   }

   public Advancement method27316(ResourceLocation var1) {
      if (this.method27315(var0 -> null)) {
         if (this.field34397 == null) {
            this.field34397 = this.field34398.method33310(this.field34396.keySet());
         }

         return new Advancement(var1, this.field34393, this.field34394, this.field34395, this.field34396, this.field34397);
      } else {
         throw new IllegalStateException("Tried to build incomplete advancement!");
      }
   }

   public Advancement method27317(Consumer<Advancement> var1, String var2) {
      Advancement var5 = this.method27316(new ResourceLocation(var2));
      var1.accept(var5);
      return var5;
   }

   public JsonObject method27318() {
      if (this.field34397 == null) {
         this.field34397 = this.field34398.method33310(this.field34396.keySet());
      }

      JsonObject var3 = new JsonObject();
      if (this.field34393 == null) {
         if (this.field34392 != null) {
            var3.addProperty("parent", this.field34392.toString());
         }
      } else {
         var3.addProperty("parent", this.field34393.getId().toString());
      }

      if (this.field34394 != null) {
         var3.add("display", this.field34394.method34948());
      }

      var3.add("rewards", this.field34395.method30723());
      JsonObject var4 = new JsonObject();

      for (Entry var6 : this.field34396.entrySet()) {
         var4.add((String)var6.getKey(), ((Class9181)var6.getValue()).method34342());
      }

      var3.add("criteria", var4);
      JsonArray var15 = new JsonArray();

      for (String[] var9 : this.field34397) {
         JsonArray var10 = new JsonArray();

         for (String var14 : var9) {
            var10.add(var14);
         }

         var15.add(var10);
      }

      var3.add("requirements", var15);
      return var3;
   }

   public void method27319(PacketBuffer var1) {
      if (this.field34392 != null) {
         var1.writeBoolean(true);
         var1.writeResourceLocation(this.field34392);
      } else {
         var1.writeBoolean(false);
      }

      if (this.field34394 != null) {
         var1.writeBoolean(true);
         this.field34394.method34946(var1);
      } else {
         var1.writeBoolean(false);
      }

      Class9181.method34340(this.field34396, var1);
      var1.writeVarInt(this.field34397.length);

      for (String[] var7 : this.field34397) {
         var1.writeVarInt(var7.length);

         for (String var11 : var7) {
            var1.writeString(var11);
         }
      }
   }

   @Override
   public String toString() {
      return "Task Advancement{parentId="
         + this.field34392
         + ", display="
         + this.field34394
         + ", rewards="
         + this.field34395
         + ", criteria="
         + this.field34396
         + ", requirements="
         + Arrays.deepToString(this.field34397)
         + '}';
   }

   public static Class7999 method27320(JsonObject var0, Class9366 var1) {
      ResourceLocation var4 = !var0.has("parent") ? null : new ResourceLocation(JSONUtils.method32763(var0, "parent"));
      Class9272 var5 = !var0.has("display") ? null : Class9272.method34944(JSONUtils.method32782(var0, "display"));
      Class8588 var6 = !var0.has("rewards") ? Class8588.field38664 : Class8588.method30724(JSONUtils.method32782(var0, "rewards"));
      Map<String, Class9181> var7 = Class9181.method34338(JSONUtils.method32782(var0, "criteria"), var1);
      if (var7.isEmpty()) {
         throw new JsonSyntaxException("Advancement criteria cannot be empty");
      } else {
         JsonArray var8 = JSONUtils.method32786(var0, "requirements", new JsonArray());
         String[][] var9 = new String[var8.size()][];

         for (int var10 = 0; var10 < var8.size(); var10++) {
            JsonArray var11 = JSONUtils.method32784(var8.get(var10), "requirements[" + var10 + "]");
            var9[var10] = new String[var11.size()];

            for (int var12 = 0; var12 < var11.size(); var12++) {
               var9[var10][var12] = JSONUtils.method32762(var11.get(var12), "requirements[" + var10 + "][" + var12 + "]");
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

         return new Class7999(var4, var5, var6, var7, var9);
      }
   }

   public static Class7999 method27321(PacketBuffer var0) {
      ResourceLocation var3 = !var0.readBoolean() ? null : var0.readResourceLocation();
      Class9272 var4 = !var0.readBoolean() ? null : Class9272.method34947(var0);
      Map var5 = Class9181.method34339(var0);
      String[][] var6 = new String[var0.readVarInt()][];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = new String[var0.readVarInt()];

         for (int var8 = 0; var8 < var6[var7].length; var8++) {
            var6[var7][var8] = var0.readString(32767);
         }
      }

      return new Class7999(var3, var4, Class8588.field38664, var5, var6);
   }

   public Map<String, Class9181> method27322() {
      return this.field34396;
   }
}

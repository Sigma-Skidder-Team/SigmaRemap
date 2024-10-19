package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class Class4852 implements Class4842 {
   private final int field22641;
   private final int field22642;
   private final NonNullList<Class120> field22643;
   private final ItemStack field22644;
   private final ResourceLocation field22645;
   private final String field22646;

   public Class4852(ResourceLocation var1, String var2, int var3, int var4, NonNullList<Class120> var5, ItemStack var6) {
      this.field22645 = var1;
      this.field22646 = var2;
      this.field22641 = var3;
      this.field22642 = var4;
      this.field22643 = var5;
      this.field22644 = var6;
   }

   @Override
   public ResourceLocation getId() {
      return this.field22645;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28470;
   }

   @Override
   public String method14970() {
      return this.field22646;
   }

   @Override
   public ItemStack getRecipeOutput() {
      return this.field22644;
   }

   @Override
   public NonNullList<Class120> method14969() {
      return this.field22643;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 >= this.field22641 && var2 >= this.field22642;
   }

   public boolean method14963(Class926 var1, World var2) {
      for (int var5 = 0; var5 <= var1.method3671() - this.field22641; var5++) {
         for (int var6 = 0; var6 <= var1.method3670() - this.field22642; var6++) {
            if (this.method14978(var1, var5, var6, true)) {
               return true;
            }

            if (this.method14978(var1, var5, var6, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean method14978(Class926 var1, int var2, int var3, boolean var4) {
      for (int var7 = 0; var7 < var1.method3671(); var7++) {
         for (int var8 = 0; var8 < var1.method3670(); var8++) {
            int var9 = var7 - var2;
            int var10 = var8 - var3;
            Class120 var11 = Class120.field427;
            if (var9 >= 0 && var10 >= 0 && var9 < this.field22641 && var10 < this.field22642) {
               if (!var4) {
                  var11 = this.field22643.get(var9 + var10 * this.field22641);
               } else {
                  var11 = this.field22643.get(this.field22641 - var9 - 1 + var10 * this.field22641);
               }
            }

            if (!var11.test(var1.getStackInSlot(var7 + var8 * var1.method3671()))) {
               return false;
            }
         }
      }

      return true;
   }

   public ItemStack method14962(Class926 var1) {
      return this.getRecipeOutput().copy();
   }

   public int method14979() {
      return this.field22641;
   }

   public int method14980() {
      return this.field22642;
   }

   private static NonNullList<Class120> method14981(String[] var0, Map<String, Class120> var1, int var2, int var3) {
      NonNullList var6 = NonNullList.<Class120>method68(var2 * var3, Class120.field427);
      HashSet var7 = Sets.newHashSet(var1.keySet());
      var7.remove(" ");

      for (int var8 = 0; var8 < var0.length; var8++) {
         for (int var9 = 0; var9 < var0[var8].length(); var9++) {
            String var10 = var0[var8].substring(var9, var9 + 1);
            Class120 var11 = (Class120)var1.get(var10);
            if (var11 == null) {
               throw new JsonSyntaxException("Pattern references symbol '" + var10 + "' but it's not defined in the key");
            }

            var7.remove(var10);
            var6.set(var9 + var2 * var8, var11);
         }
      }

      if (var7.isEmpty()) {
         return var6;
      } else {
         throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + var7);
      }
   }

   @VisibleForTesting
   public static String[] method14982(String... var0) {
      int var3 = Integer.MAX_VALUE;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var0.length; var7++) {
         String var8 = var0[var7];
         var3 = Math.min(var3, method14983(var8));
         int var9 = method14984(var8);
         var4 = Math.max(var4, var9);
         if (var9 >= 0) {
            var6 = 0;
         } else {
            if (var5 == var7) {
               var5++;
            }

            var6++;
         }
      }

      if (var0.length == var6) {
         return new String[0];
      } else {
         String[] var10 = new String[var0.length - var6 - var5];

         for (int var11 = 0; var11 < var10.length; var11++) {
            var10[var11] = var0[var11 + var5].substring(var3, var4 + 1);
         }

         return var10;
      }
   }

   private static int method14983(String var0) {
      int var3 = 0;

      while (var3 < var0.length() && var0.charAt(var3) == ' ') {
         var3++;
      }

      return var3;
   }

   private static int method14984(String var0) {
      int var3 = var0.length() - 1;

      while (var3 >= 0 && var0.charAt(var3) == ' ') {
         var3--;
      }

      return var3;
   }

   private static String[] method14985(JsonArray var0) {
      String[] var3 = new String[var0.size()];
      if (var3.length > 3) {
         throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
      } else if (var3.length == 0) {
         throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
      } else {
         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = JSONUtils.method32762(var0.get(var4), "pattern[" + var4 + "]");
            if (var5.length() > 3) {
               throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
            }

            if (var4 > 0 && var3[0].length() != var5.length()) {
               throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
            }

            var3[var4] = var5;
         }

         return var3;
      }
   }

   private static Map<String, Class120> method14986(JsonObject var0) {
      HashMap var3 = Maps.newHashMap();

      for (Entry var5 : var0.entrySet()) {
         if (((String)var5.getKey()).length() != 1) {
            throw new JsonSyntaxException("Invalid key entry: '" + (String)var5.getKey() + "' is an invalid symbol (must be 1 character only).");
         }

         if (" ".equals(var5.getKey())) {
            throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
         }

         var3.put(var5.getKey(), Class120.method344((JsonElement)var5.getValue()));
      }

      var3.put(" ", Class120.field427);
      return var3;
   }

   public static ItemStack method14987(JsonObject var0) {
      String var3 = JSONUtils.getString(var0, "item");
      Item var4 = Registry.ITEM.method9187(new ResourceLocation(var3)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + var3 + "'"));
      if (!var0.has("data")) {
         int var5 = JSONUtils.getInt(var0, "count", 1);
         return new ItemStack(var4, var5);
      } else {
         throw new JsonParseException("Disallowed data tag found");
      }
   }

   // $VF: synthetic method
   public static Map method14989(JsonObject var0) {
      return method14986(var0);
   }

   // $VF: synthetic method
   public static String[] method14990(JsonArray var0) {
      return method14985(var0);
   }

   // $VF: synthetic method
   public static NonNullList method14991(String[] var0, Map var1, int var2, int var3) {
      return method14981(var0, var1, var2, var3);
   }

   // $VF: synthetic method
   public static int method14992(Class4852 var0) {
      return var0.field22641;
   }

   // $VF: synthetic method
   public static int method14993(Class4852 var0) {
      return var0.field22642;
   }

   // $VF: synthetic method
   public static String method14994(Class4852 var0) {
      return var0.field22646;
   }

   // $VF: synthetic method
   public static NonNullList<Class120> method14995(Class4852 var0) {
      return var0.field22643;
   }

   // $VF: synthetic method
   public static ItemStack method14996(Class4852 var0) {
      return var0.field22644;
   }
}

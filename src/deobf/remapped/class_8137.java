package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class class_8137 implements Predicate<ItemStack> {
   public static final class_8137 field_41675 = new class_8137(Stream.empty());
   private final class_211[] field_41674;
   private ItemStack[] field_41677;
   private IntList field_41678;

   private class_8137(Stream<? extends class_211> var1) {
      this.field_41674 = var1.<class_211>toArray(class_211[]::new);
   }

   public ItemStack[] method_37020() {
      this.method_37025();
      return this.field_41677;
   }

   private void method_37025() {
      if (this.field_41677 == null) {
         this.field_41677 = Arrays.<class_211>stream(this.field_41674)
            .<ItemStack>flatMap(var0 -> var0.method_894().stream())
            .distinct()
            .<ItemStack>toArray(ItemStack[]::new);
      }
   }

   public boolean test(ItemStack var1) {
      if (var1 == null) {
         return false;
      } else {
         this.method_37025();
         if (this.field_41677.length == 0) {
            return var1.method_28022();
         } else {
            for (ItemStack var7 : this.field_41677) {
               if (var7.method_27960() == var1.method_27960()) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public IntList method_37021() {
      if (this.field_41678 == null) {
         this.method_37025();
         this.field_41678 = new IntArrayList(this.field_41677.length);

         for (ItemStack var6 : this.field_41677) {
            this.field_41678.add(class_534.method_2599(var6));
         }

         this.field_41678.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.field_41678;
   }

   public void method_37028(class_8248 var1) {
      this.method_37025();
      var1.method_37743(this.field_41677.length);

      for (int var4 = 0; var4 < this.field_41677.length; var4++) {
         var1.method_37764(this.field_41677[var4]);
      }
   }

   public JsonElement method_37027() {
      if (this.field_41674.length == 1) {
         return this.field_41674[0].method_893();
      } else {
         JsonArray var3 = new JsonArray();

         for (class_211 var7 : this.field_41674) {
            var3.add(var7.method_893());
         }

         return var3;
      }
   }

   public boolean method_37033() {
      return this.field_41674.length == 0
         && (this.field_41677 == null || this.field_41677.length == 0)
         && (this.field_41678 == null || this.field_41678.isEmpty());
   }

   private static class_8137 method_37031(Stream<? extends class_211> var0) {
      class_8137 var3 = new class_8137(var0);
      return var3.field_41674.length != 0 ? var3 : field_41675;
   }

   public static class_8137 method_37019(class_8525... var0) {
      return method_37023(Arrays.<class_8525>stream(var0).<ItemStack>map(ItemStack::new));
   }

   public static class_8137 method_37029(ItemStack... var0) {
      return method_37023(Arrays.<ItemStack>stream(var0));
   }

   public static class_8137 method_37023(Stream<ItemStack> var0) {
      return method_37031(var0.filter(var0x -> !var0x.method_28022()).map(var0x -> new class_3092(var0x, null)));
   }

   public static class_8137 method_37022(class_2307<class_2451> var0) {
      return method_37031(Stream.of(new class_8953(var0, null)));
   }

   public static class_8137 method_37026(class_8248 var0) {
      int var3 = var0.method_37778();
      return method_37031(Stream.<class_211>generate(() -> new class_3092(var0.method_37755(), null)).limit((long)var3));
   }

   public static class_8137 method_37024(JsonElement var0) {
      if (var0 == null || var0.isJsonNull()) {
         throw new JsonSyntaxException("Item cannot be null");
      } else if (var0.isJsonObject()) {
         return method_37031(Stream.of(method_37030(var0.getAsJsonObject())));
      } else if (!var0.isJsonArray()) {
         throw new JsonSyntaxException("Expected item to be object or array of objects");
      } else {
         JsonArray var3 = var0.getAsJsonArray();
         if (var3.size() != 0) {
            return method_37031(StreamSupport.<JsonElement>stream(var3.spliterator(), false).map(var0x -> method_37030(class_6539.method_29782(var0x, "item"))));
         } else {
            throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
         }
      }
   }

   private static class_211 method_37030(JsonObject var0) {
      if (var0.has("item") && var0.has("tag")) {
         throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
      } else if (!var0.has("item")) {
         if (!var0.has("tag")) {
            throw new JsonParseException("An ingredient entry needs either a tag or an item");
         } else {
            Identifier var5 = new Identifier(class_6539.method_29796(var0, "tag"));
            class_2307 var6 = class_8410.method_38721().method_29393().method_43140(var5);
            if (var6 != null) {
               return new class_8953(var6, null);
            } else {
               throw new JsonSyntaxException("Unknown item tag '" + var5 + "'");
            }
         }
      } else {
         Identifier var3 = new Identifier(class_6539.method_29796(var0, "item"));
         class_2451 var4 = class_8669.field_44382.method_39794(var3).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + var3 + "'"));
         return new class_3092(new ItemStack(var4), null);
      }
   }
}

package mapped;

import com.google.gson.*;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class Class120 implements Predicate<ItemStack> {
   public static final Class120 field427 = new Class120(Stream.empty());
   private final Class4826[] field428;
   private ItemStack[] field429;
   private IntList field430;

   private Class120(Stream<? extends Class4826> var1) {
      this.field428 = var1.<Class4826>toArray(Class4826[]::new);
   }

   public ItemStack[] method332() {
      this.method333();
      return this.field429;
   }

   private void method333() {
      if (this.field429 == null) {
         this.field429 = Arrays.<Class4826>stream(this.field428)
            .<ItemStack>flatMap(var0 -> var0.method14917().stream())
            .distinct()
            .<ItemStack>toArray(ItemStack[]::new);
      }
   }

   public boolean test(ItemStack var1) {
      if (var1 == null) {
         return false;
      } else {
         this.method333();
         if (this.field429.length == 0) {
            return var1.isEmpty();
         } else {
            for (ItemStack var7 : this.field429) {
               if (var7.getItem() == var1.getItem()) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public IntList method334() {
      if (this.field430 == null) {
         this.method333();
         this.field430 = new IntArrayList(this.field429.length);

         for (ItemStack var6 : this.field429) {
            this.field430.add(Class6207.method19119(var6));
         }

         this.field430.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.field430;
   }

   public void method335(PacketBuffer var1) {
      this.method333();
      var1.writeVarInt(this.field429.length);

      for (int var4 = 0; var4 < this.field429.length; var4++) {
         var1.writeItemStack(this.field429[var4]);
      }
   }

   public JsonElement method336() {
      if (this.field428.length == 1) {
         return this.field428[0].method14918();
      } else {
         JsonArray var3 = new JsonArray();

         for (Class4826 var7 : this.field428) {
            var3.add(var7.method14918());
         }

         return var3;
      }
   }

   public boolean method337() {
      return this.field428.length == 0 && (this.field429 == null || this.field429.length == 0) && (this.field430 == null || this.field430.isEmpty());
   }

   private static Class120 method338(Stream<? extends Class4826> var0) {
      Class120 var3 = new Class120(var0);
      return var3.field428.length != 0 ? var3 : field427;
   }

   public static Class120 method339(IItemProvider... var0) {
      return method341(Arrays.<IItemProvider>stream(var0).<ItemStack>map(ItemStack::new));
   }

   public static Class120 method340(ItemStack... var0) {
      return method341(Arrays.<ItemStack>stream(var0));
   }

   public static Class120 method341(Stream<ItemStack> var0) {
      return method338(var0.filter(var0x -> !var0x.isEmpty()).map(var0x -> new Class4827(var0x)));
   }

   public static Class120 method342(ITag<Item> var0) {
      return method338(Stream.of(new Class4828(var0)));
   }

   public static Class120 method343(PacketBuffer var0) {
      int var3 = var0.readVarInt();
      return method338(Stream.<Class4826>generate(() -> new Class4827(var0.readItemStack())).limit(var3));
   }

   public static Class120 method344(JsonElement var0) {
      if (var0 == null || var0.isJsonNull()) {
         throw new JsonSyntaxException("Item cannot be null");
      } else if (var0.isJsonObject()) {
         return method338(Stream.of(method345(var0.getAsJsonObject())));
      } else if (!var0.isJsonArray()) {
         throw new JsonSyntaxException("Expected item to be object or array of objects");
      } else {
         JsonArray var3 = var0.getAsJsonArray();
         if (var3.size() != 0) {
            return method338(StreamSupport.<JsonElement>stream(var3.spliterator(), false).map(var0x -> method345(JSONUtils.getJSONObject(var0x, "item"))));
         } else {
            throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
         }
      }
   }

   private static Class4826 method345(JsonObject var0) {
      if (var0.has("item") && var0.has("tag")) {
         throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
      } else if (!var0.has("item")) {
         if (!var0.has("tag")) {
            throw new JsonParseException("An ingredient entry needs either a tag or an item");
         } else {
            ResourceLocation var5 = new ResourceLocation(JSONUtils.getString(var0, "tag"));
            ITag var6 = Class9443.method36296().method32658().get(var5);
            if (var6 != null) {
               return new Class4828(var6);
            } else {
               throw new JsonSyntaxException("Unknown item tag '" + var5 + "'");
            }
         }
      } else {
         ResourceLocation var3 = new ResourceLocation(JSONUtils.getString(var0, "item"));
         Item var4 = Registry.ITEM.method9187(var3).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + var3 + "'"));
         return new Class4827(new ItemStack(var4));
      }
   }
}

package mapped;

import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.registry.Registry;

import java.util.List;
import java.util.function.Predicate;

public class Class7105 {
   private static final List<Class9127<Potion>> field30617 = Lists.newArrayList();
   private static final List<Class9127<Item>> field30618 = Lists.newArrayList();
   private static final List<Class120> field30619 = Lists.newArrayList();
   private static final Predicate<ItemStack> field30620 = var0 -> {
      for (Class120 var4 : field30619) {
         if (var4.test(var0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean method22132(ItemStack var0) {
      return method22133(var0) || method22134(var0);
   }

   public static boolean method22133(ItemStack var0) {
      int var3 = 0;

      for (int var4 = field30618.size(); var3 < var4; var3++) {
         if (Class9127.method34059(field30618.get(var3)).test(var0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method22134(ItemStack var0) {
      int var3 = 0;

      for (int var4 = field30617.size(); var3 < var4; var3++) {
         if (Class9127.method34059(field30617.get(var3)).test(var0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method22135(Potion var0) {
      int var3 = 0;

      for (int var4 = field30617.size(); var3 < var4; var3++) {
         if (Class9127.method34060(field30617.get(var3)) == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean method22136(ItemStack var0, ItemStack var1) {
      return !field30620.test(var0) ? false : method22137(var0, var1) || method22138(var0, var1);
   }

   public static boolean method22137(ItemStack var0, ItemStack var1) {
      Item var4 = var0.getItem();
      int var5 = 0;

      for (int var6 = field30618.size(); var5 < var6; var5++) {
         Class9127 var7 = field30618.get(var5);
         if (Class9127.method34061(var7) == var4 && Class9127.method34059(var7).test(var1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method22138(ItemStack var0, ItemStack var1) {
      Potion var4 = PotionUtils.getPotionFromItem(var0);
      int var5 = 0;

      for (int var6 = field30617.size(); var5 < var6; var5++) {
         Class9127 var7 = field30617.get(var5);
         if (Class9127.method34061(var7) == var4 && Class9127.method34059(var7).test(var1)) {
            return true;
         }
      }

      return false;
   }

   public static ItemStack method22139(ItemStack var0, ItemStack var1) {
      if (!var1.isEmpty()) {
         Potion var4 = PotionUtils.getPotionFromItem(var1);
         Item var5 = var1.getItem();
         int var6 = 0;

         for (int var7 = field30618.size(); var6 < var7; var6++) {
            Class9127 var8 = field30618.get(var6);
            if (Class9127.method34061(var8) == var5 && Class9127.method34059(var8).test(var0)) {
               return PotionUtils.addPotionToItemStack(new ItemStack((IItemProvider)Class9127.method34060(var8)), var4);
            }
         }

         var6 = 0;

         for (int var10 = field30617.size(); var6 < var10; var6++) {
            Class9127 var11 = field30617.get(var6);
            if (Class9127.method34061(var11) == var4 && Class9127.method34059(var11).test(var0)) {
               return PotionUtils.addPotionToItemStack(new ItemStack(var5), (Potion)Class9127.method34060(var11));
            }
         }
      }

      return var1;
   }

   public static void method22140() {
      method22142(Items.field37971);
      method22142(Items.SPLASH_POTION);
      method22142(Items.field38118);
      method22141(Items.field37971, Items.field37840, Items.SPLASH_POTION);
      method22141(Items.SPLASH_POTION, Items.field38114, Items.field38118);
      method22143(Potions.WATER, Items.field37980, Potions.MUNDANE);
      method22143(Potions.WATER, Items.field37968, Potions.MUNDANE);
      method22143(Potions.WATER, Items.field38080, Potions.MUNDANE);
      method22143(Potions.WATER, Items.field37975, Potions.MUNDANE);
      method22143(Potions.WATER, Items.field37973, Potions.MUNDANE);
      method22143(Potions.WATER, Items.field37936, Potions.MUNDANE);
      method22143(Potions.WATER, Items.field37976, Potions.MUNDANE);
      method22143(Potions.WATER, Items.field37908, Potions.THICK);
      method22143(Potions.WATER, Items.REDSTONE_DUST, Potions.MUNDANE);
      method22143(Potions.WATER, Items.field37970, Potions.AWKWARD);
      method22143(Potions.AWKWARD, Items.field38057, Potions.NIGHT_VISION);
      method22143(Potions.NIGHT_VISION, Items.REDSTONE_DUST, Potions.LONG_NIGHT_VISION);
      method22143(Potions.NIGHT_VISION, Items.field37974, Potions.INVISIBILITY);
      method22143(Potions.LONG_NIGHT_VISION, Items.field37974, Potions.LONG_INVISIBILITY);
      method22143(Potions.INVISIBILITY, Items.REDSTONE_DUST, Potions.LONG_INVISIBILITY);
      method22143(Potions.AWKWARD, Items.field37976, Potions.FIRE_RESISTANCE);
      method22143(Potions.FIRE_RESISTANCE, Items.REDSTONE_DUST, Potions.LONG_FIRE_RESISTANCE);
      method22143(Potions.AWKWARD, Items.field38080, Potions.LEAPING);
      method22143(Potions.LEAPING, Items.REDSTONE_DUST, Potions.LONG_LEAPING);
      method22143(Potions.LEAPING, Items.field37908, Potions.STRONG_LEAPING);
      method22143(Potions.LEAPING, Items.field37974, Potions.SLOWNESS);
      method22143(Potions.LONG_LEAPING, Items.field37974, Potions.LONG_SLOWNESS);
      method22143(Potions.SLOWNESS, Items.REDSTONE_DUST, Potions.LONG_SLOWNESS);
      method22143(Potions.SLOWNESS, Items.field37908, Potions.STRONG_SLOWNESS);
      method22143(Potions.AWKWARD, Items.field37792, Potions.TURTLE_MASTER);
      method22143(Potions.TURTLE_MASTER, Items.REDSTONE_DUST, Potions.LONG_TURTLE_MASTER);
      method22143(Potions.TURTLE_MASTER, Items.field37908, Potions.STRONG_TURTLE_MASTER);
      method22143(Potions.SWIFTNESS, Items.field37974, Potions.SLOWNESS);
      method22143(Potions.LONG_SWIFTNESS, Items.field37974, Potions.LONG_SLOWNESS);
      method22143(Potions.AWKWARD, Items.field37936, Potions.SWIFTNESS);
      method22143(Potions.SWIFTNESS, Items.REDSTONE_DUST, Potions.LONG_SWIFTNESS);
      method22143(Potions.SWIFTNESS, Items.field37908, Potions.STRONG_SWIFTNESS);
      method22143(Potions.AWKWARD, Items.field37912, Potions.WATER_BREATHING);
      method22143(Potions.WATER_BREATHING, Items.REDSTONE_DUST, Potions.LONG_WATER_BREATHING);
      method22143(Potions.AWKWARD, Items.field37980, Potions.HEALING);
      method22143(Potions.HEALING, Items.field37908, Potions.STRONG_HEALING);
      method22143(Potions.HEALING, Items.field37974, Potions.HARMING);
      method22143(Potions.STRONG_HEALING, Items.field37974, Potions.STRONG_HARMING);
      method22143(Potions.HARMING, Items.field37908, Potions.STRONG_HARMING);
      method22143(Potions.POISON, Items.field37974, Potions.HARMING);
      method22143(Potions.LONG_POISON, Items.field37974, Potions.HARMING);
      method22143(Potions.STRONG_POISON, Items.field37974, Potions.STRONG_HARMING);
      method22143(Potions.AWKWARD, Items.field37973, Potions.POISON);
      method22143(Potions.POISON, Items.REDSTONE_DUST, Potions.LONG_POISON);
      method22143(Potions.POISON, Items.field37908, Potions.STRONG_POISON);
      method22143(Potions.AWKWARD, Items.field37968, Potions.REGENERATION);
      method22143(Potions.REGENERATION, Items.REDSTONE_DUST, Potions.LONG_REGENERATION);
      method22143(Potions.REGENERATION, Items.field37908, Potions.STRONG_REGENERATION);
      method22143(Potions.AWKWARD, Items.field37975, Potions.STRENGTH);
      method22143(Potions.STRENGTH, Items.REDSTONE_DUST, Potions.LONG_STRENGTH);
      method22143(Potions.STRENGTH, Items.field37908, Potions.STRONG_STRENGTH);
      method22143(Potions.WATER, Items.field37974, Potions.WEAKNESS);
      method22143(Potions.WEAKNESS, Items.REDSTONE_DUST, Potions.LONG_WEAKNESS);
      method22143(Potions.AWKWARD, Items.field38145, Potions.SLOW_FALLING);
      method22143(Potions.SLOW_FALLING, Items.REDSTONE_DUST, Potions.LONG_SLOW_FALLING);
   }

   private static void method22141(Item var0, Item var1, Item var2) {
      if (var0 instanceof PotionItem) {
         if (var2 instanceof PotionItem) {
            field30618.add(new Class9127<Item>(var0, Class120.method339(var1), var2));
         } else {
            throw new IllegalArgumentException("Expected a potion, got: " + Registry.ITEM.getKey(var2));
         }
      } else {
         throw new IllegalArgumentException("Expected a potion, got: " + Registry.ITEM.getKey(var0));
      }
   }

   private static void method22142(Item var0) {
      if (var0 instanceof PotionItem) {
         field30619.add(Class120.method339(var0));
      } else {
         throw new IllegalArgumentException("Expected a potion, got: " + Registry.ITEM.getKey(var0));
      }
   }

   private static void method22143(Potion var0, Item var1, Potion var2) {
      field30617.add(new Class9127<Potion>(var0, Class120.method339(var1), var2));
   }
}

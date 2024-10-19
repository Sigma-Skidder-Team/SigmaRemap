package mapped;

import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.registry.Registry;

import java.util.List;
import java.util.function.Predicate;

public class Class7105 {
   private static final List<Class9127<Class8812>> field30617 = Lists.newArrayList();
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

   public static boolean method22135(Class8812 var0) {
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
      Class8812 var4 = Class9741.method38185(var0);
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
         Class8812 var4 = Class9741.method38185(var1);
         Item var5 = var1.getItem();
         int var6 = 0;

         for (int var7 = field30618.size(); var6 < var7; var6++) {
            Class9127 var8 = field30618.get(var6);
            if (Class9127.method34061(var8) == var5 && Class9127.method34059(var8).test(var0)) {
               return Class9741.method38187(new ItemStack((IItemProvider)Class9127.method34060(var8)), var4);
            }
         }

         var6 = 0;

         for (int var10 = field30617.size(); var6 < var10; var6++) {
            Class9127 var11 = field30617.get(var6);
            if (Class9127.method34061(var11) == var4 && Class9127.method34059(var11).test(var0)) {
               return Class9741.method38187(new ItemStack(var5), (Class8812)Class9127.method34060(var11));
            }
         }
      }

      return var1;
   }

   public static void method22140() {
      method22142(Items.field37971);
      method22142(Items.field38115);
      method22142(Items.field38118);
      method22141(Items.field37971, Items.field37840, Items.field38115);
      method22141(Items.field38115, Items.field38114, Items.field38118);
      method22143(Class8137.field34977, Items.field37980, Class8137.field34978);
      method22143(Class8137.field34977, Items.field37968, Class8137.field34978);
      method22143(Class8137.field34977, Items.field38080, Class8137.field34978);
      method22143(Class8137.field34977, Items.field37975, Class8137.field34978);
      method22143(Class8137.field34977, Items.field37973, Class8137.field34978);
      method22143(Class8137.field34977, Items.field37936, Class8137.field34978);
      method22143(Class8137.field34977, Items.field37976, Class8137.field34978);
      method22143(Class8137.field34977, Items.field37908, Class8137.field34979);
      method22143(Class8137.field34977, Items.REDSTONE_DUST, Class8137.field34978);
      method22143(Class8137.field34977, Items.field37970, Class8137.field34980);
      method22143(Class8137.field34980, Items.field38057, Class8137.field34981);
      method22143(Class8137.field34981, Items.REDSTONE_DUST, Class8137.field34982);
      method22143(Class8137.field34981, Items.field37974, Class8137.field34983);
      method22143(Class8137.field34982, Items.field37974, Class8137.field34984);
      method22143(Class8137.field34983, Items.REDSTONE_DUST, Class8137.field34984);
      method22143(Class8137.field34980, Items.field37976, Class8137.field34988);
      method22143(Class8137.field34988, Items.REDSTONE_DUST, Class8137.field34989);
      method22143(Class8137.field34980, Items.field38080, Class8137.field34985);
      method22143(Class8137.field34985, Items.REDSTONE_DUST, Class8137.field34986);
      method22143(Class8137.field34985, Items.field37908, Class8137.field34987);
      method22143(Class8137.field34985, Items.field37974, Class8137.field34993);
      method22143(Class8137.field34986, Items.field37974, Class8137.field34994);
      method22143(Class8137.field34993, Items.REDSTONE_DUST, Class8137.field34994);
      method22143(Class8137.field34993, Items.field37908, Class8137.field34995);
      method22143(Class8137.field34980, Items.field37792, Class8137.field34996);
      method22143(Class8137.field34996, Items.REDSTONE_DUST, Class8137.field34997);
      method22143(Class8137.field34996, Items.field37908, Class8137.field34998);
      method22143(Class8137.field34990, Items.field37974, Class8137.field34993);
      method22143(Class8137.field34991, Items.field37974, Class8137.field34994);
      method22143(Class8137.field34980, Items.field37936, Class8137.field34990);
      method22143(Class8137.field34990, Items.REDSTONE_DUST, Class8137.field34991);
      method22143(Class8137.field34990, Items.field37908, Class8137.field34992);
      method22143(Class8137.field34980, Items.field37912, Class8137.field34999);
      method22143(Class8137.field34999, Items.REDSTONE_DUST, Class8137.field35000);
      method22143(Class8137.field34980, Items.field37980, Class8137.field35001);
      method22143(Class8137.field35001, Items.field37908, Class8137.field35002);
      method22143(Class8137.field35001, Items.field37974, Class8137.field35003);
      method22143(Class8137.field35002, Items.field37974, Class8137.field35004);
      method22143(Class8137.field35003, Items.field37908, Class8137.field35004);
      method22143(Class8137.field35005, Items.field37974, Class8137.field35003);
      method22143(Class8137.field35006, Items.field37974, Class8137.field35003);
      method22143(Class8137.field35007, Items.field37974, Class8137.field35004);
      method22143(Class8137.field34980, Items.field37973, Class8137.field35005);
      method22143(Class8137.field35005, Items.REDSTONE_DUST, Class8137.field35006);
      method22143(Class8137.field35005, Items.field37908, Class8137.field35007);
      method22143(Class8137.field34980, Items.field37968, Class8137.field35008);
      method22143(Class8137.field35008, Items.REDSTONE_DUST, Class8137.field35009);
      method22143(Class8137.field35008, Items.field37908, Class8137.field35010);
      method22143(Class8137.field34980, Items.field37975, Class8137.field35011);
      method22143(Class8137.field35011, Items.REDSTONE_DUST, Class8137.field35012);
      method22143(Class8137.field35011, Items.field37908, Class8137.field35013);
      method22143(Class8137.field34977, Items.field37974, Class8137.field35014);
      method22143(Class8137.field35014, Items.REDSTONE_DUST, Class8137.field35015);
      method22143(Class8137.field34980, Items.field38145, Class8137.field35017);
      method22143(Class8137.field35017, Items.REDSTONE_DUST, Class8137.field35018);
   }

   private static void method22141(Item var0, Item var1, Item var2) {
      if (var0 instanceof Class3323) {
         if (var2 instanceof Class3323) {
            field30618.add(new Class9127<Item>(var0, Class120.method339(var1), var2));
         } else {
            throw new IllegalArgumentException("Expected a potion, got: " + Registry.ITEM.getKey(var2));
         }
      } else {
         throw new IllegalArgumentException("Expected a potion, got: " + Registry.ITEM.getKey(var0));
      }
   }

   private static void method22142(Item var0) {
      if (var0 instanceof Class3323) {
         field30619.add(Class120.method339(var0));
      } else {
         throw new IllegalArgumentException("Expected a potion, got: " + Registry.ITEM.getKey(var0));
      }
   }

   private static void method22143(Class8812 var0, Item var1, Class8812 var2) {
      field30617.add(new Class9127<Class8812>(var0, Class120.method339(var1), var2));
   }
}

package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class Class7858 {
   public static int method26311(Class6069 var0, ItemStack var1) {
      if (!var1.isEmpty()) {
         ResourceLocation var4 = Registry.field16073.getKey(var0);
         ListNBT var5 = var1.method32147();

         for (int var6 = 0; var6 < var5.size(); var6++) {
            CompoundNBT var7 = var5.method153(var6);
            ResourceLocation var8 = ResourceLocation.method8289(var7.getString("id"));
            if (var8 != null && var8.equals(var4)) {
               return MathHelper.method37775(var7.getInt("lvl"), 0, 255);
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   public static Map<Class6069, Integer> method26312(ItemStack var0) {
      ListNBT var3 = var0.getItem() != Items.field38070 ? var0.method32147() : Class3290.method11830(var0);
      return method26313(var3);
   }

   public static Map<Class6069, Integer> method26313(ListNBT var0) {
      Map<Class6069, Integer> var3 = Maps.newLinkedHashMap();

      for (int var4 = 0; var4 < var0.size(); var4++) {
         CompoundNBT var5 = var0.method153(var4);
         Registry.field16073.method9187(ResourceLocation.method8289(var5.getString("id"))).ifPresent(var2 -> {
            Integer var5x = var3.put(var2, var5.getInt("lvl"));
         });
      }

      return var3;
   }

   public static void method26314(Map<Class6069, Integer> var0, ItemStack var1) {
      ListNBT var4 = new ListNBT();

      for (Entry var6 : var0.entrySet()) {
         Class6069 var7 = (Class6069)var6.getKey();
         if (var7 != null) {
            int var8 = (Integer)var6.getValue();
            CompoundNBT var9 = new CompoundNBT();
            var9.method109("id", String.valueOf(Registry.field16073.getKey(var7)));
            var9.method101("lvl", (short)var8);
            var4.add(var9);
            if (var1.getItem() == Items.field38070) {
               Class3290.method11831(var1, new Class6694(var7, var8));
            }
         }
      }

      if (!var4.isEmpty()) {
         if (var1.getItem() != Items.field38070) {
            var1.setTagInfo("Enchantments", var4);
         }
      } else {
         var1.method32146("Enchantments");
      }
   }

   private static void method26315(Class8493 var0, ItemStack var1) {
      if (!var1.isEmpty()) {
         ListNBT var4 = var1.method32147();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            String var6 = var4.method153(var5).getString("id");
            int var7 = var4.method153(var5).getInt("lvl");
            Registry.field16073.method9187(ResourceLocation.method8289(var6)).ifPresent(var2 -> var0.method30078(var2, var7));
         }
      }
   }

   private static void method26316(Class8493 var0, Iterable<ItemStack> var1) {
      for (ItemStack var5 : var1) {
         method26315(var0, var5);
      }
   }

   public static int method26317(Iterable<ItemStack> var0, Class8654 var1) {
      MutableInt var4 = new MutableInt();
      method26316((var2, var3) -> var4.add(var2.method18814(var3, var1)), var0);
      return var4.intValue();
   }

   public static float method26318(ItemStack var0, Class7809 var1) {
      MutableFloat var4 = new MutableFloat();
      method26315((var2, var3) -> var4.add(var2.method18815(var3, var1)), var0);
      return var4.floatValue();
   }

   public static float method26319(LivingEntity var0) {
      int var3 = method26322(Class8122.field34914, var0);
      return var3 <= 0 ? 0.0F : Class6079.method18828(var3);
   }

   public static void method26320(LivingEntity var0, Entity var1) {
      Class8493 var4 = (var2, var3) -> var2.method18823(var0, var1, var3);
      if (var0 != null) {
         method26316(var4, var0.method3326());
      }

      if (var1 instanceof PlayerEntity) {
         method26315(var4, var0.getHeldItemMainhand());
      }
   }

   public static void method26321(LivingEntity var0, Entity var1) {
      Class8493 var4 = (var2, var3) -> var2.method18822(var0, var1, var3);
      if (var0 != null) {
         method26316(var4, var0.method3326());
      }

      if (var0 instanceof PlayerEntity) {
         method26315(var4, var0.getHeldItemMainhand());
      }
   }

   public static int method26322(Class6069 var0, LivingEntity var1) {
      Collection<ItemStack> var4 = var0.method18811(var1).values();
      if (var4 != null) {
         int var5 = 0;

         for (ItemStack var7 : var4) {
            int var8 = method26311(var0, var7);
            if (var8 > var5) {
               var5 = var8;
            }
         }

         return var5;
      } else {
         return 0;
      }
   }

   public static int method26323(LivingEntity var0) {
      return method26322(Class8122.field34911, var0);
   }

   public static int method26324(LivingEntity var0) {
      return method26322(Class8122.field34912, var0);
   }

   public static int method26325(LivingEntity var0) {
      return method26322(Class8122.field34901, var0);
   }

   public static int method26326(LivingEntity var0) {
      return method26322(Class8122.field34904, var0);
   }

   public static int method26327(LivingEntity var0) {
      return method26322(Class8122.field34915, var0);
   }

   public static int method26328(ItemStack var0) {
      return method26311(Class8122.field34923, var0);
   }

   public static int method26329(ItemStack var0) {
      return method26311(Class8122.field34924, var0);
   }

   public static int method26330(LivingEntity var0) {
      return method26322(Class8122.field34913, var0);
   }

   public static boolean method26331(LivingEntity var0) {
      return method26322(Class8122.field34902, var0) > 0;
   }

   public static boolean method26332(LivingEntity var0) {
      return method26322(Class8122.field34905, var0) > 0;
   }

   public static boolean method26333(LivingEntity var0) {
      return method26322(Class8122.field34907, var0) > 0;
   }

   public static boolean method26334(ItemStack var0) {
      return method26311(Class8122.field34906, var0) > 0;
   }

   public static boolean method26335(ItemStack var0) {
      return method26311(Class8122.field34933, var0) > 0;
   }

   public static int method26336(ItemStack var0) {
      return method26311(Class8122.field34925, var0);
   }

   public static int method26337(ItemStack var0) {
      return method26311(Class8122.field34927, var0);
   }

   public static boolean method26338(ItemStack var0) {
      return method26311(Class8122.field34928, var0) > 0;
   }

   @Nullable
   public static Entry<Class2106, ItemStack> method26339(Class6069 var0, LivingEntity var1) {
      return method26340(var0, var1, var0x -> true);
   }

   @Nullable
   public static Entry<Class2106, ItemStack> method26340(Class6069 var0, LivingEntity var1, Predicate<ItemStack> var2) {
      Map<Class2106, ItemStack> var5 = var0.method18811(var1);
      if (!var5.isEmpty()) {
         ArrayList var6 = Lists.newArrayList();

         for (Entry<Class2106, ItemStack> var8 : var5.entrySet()) {
            ItemStack var9 = (ItemStack)var8.getValue();
            if (!var9.isEmpty() && method26311(var0, var9) > 0 && var2.test(var9)) {
               var6.add(var8);
            }
         }

         return !var6.isEmpty() ? (Entry)var6.get(var1.method3013().nextInt(var6.size())) : null;
      } else {
         return null;
      }
   }

   public static int method26341(Random var0, int var1, int var2, ItemStack var3) {
      Item var6 = var3.getItem();
      int var7 = var6.method11736();
      if (var7 > 0) {
         if (var2 > 15) {
            var2 = 15;
         }

         int var8 = var0.nextInt(8) + 1 + (var2 >> 1) + var0.nextInt(var2 + 1);
         if (var1 != 0) {
            return var1 != 1 ? Math.max(var8, var2 * 2) : var8 * 2 / 3 + 1;
         } else {
            return Math.max(var8 / 3, 1);
         }
      } else {
         return 0;
      }
   }

   public static ItemStack method26342(Random var0, ItemStack var1, int var2, boolean var3) {
      List<Class6694> var6 = method26343(var0, var1, var2, var3);
      boolean var7 = var1.getItem() == Items.field37900;
      if (var7) {
         var1 = new ItemStack(Items.field38070);
      }

      for (Class6694 var9 : var6) {
         if (!var7) {
            var1.method32162(var9.field29316, var9.field29317);
         } else {
            Class3290.method11831(var1, var9);
         }
      }

      return var1;
   }

   public static List<Class6694> method26343(Random var0, ItemStack var1, int var2, boolean var3) {
      ArrayList var6 = Lists.newArrayList();
      Item var7 = var1.getItem();
      int var8 = var7.method11736();
      if (var8 <= 0) {
         return var6;
      } else {
         var2 = var2 + 1 + var0.nextInt(var8 / 4 + 1) + var0.nextInt(var8 / 4 + 1);
         float var9 = (var0.nextFloat() + var0.nextFloat() - 1.0F) * 0.15F;
         var2 = MathHelper.method37775(Math.round((float)var2 + (float)var2 * var9), 1, Integer.MAX_VALUE);
         List var10 = method26346(var2, var1, var3);
         if (!var10.isEmpty()) {
            var6.add(Class8879.<Class6691>method32314(var0, var10));

            while (var0.nextInt(50) <= var2) {
               method26344(var10, Util.<Class6694>method38504(var6));
               if (var10.isEmpty()) {
                  break;
               }

               var6.add(Class8879.<Class6691>method32314(var0, var10));
               var2 /= 2;
            }
         }

         return var6;
      }
   }

   public static void method26344(List<Class6694> var0, Class6694 var1) {
      Iterator var4 = var0.iterator();

      while (var4.hasNext()) {
         if (!var1.field29316.method18816(((Class6694)var4.next()).field29316)) {
            var4.remove();
         }
      }
   }

   public static boolean method26345(Collection<Class6069> var0, Class6069 var1) {
      for (Class6069 var5 : var0) {
         if (!var5.method18816(var1)) {
            return false;
         }
      }

      return true;
   }

   public static List<Class6694> method26346(int var0, ItemStack var1, boolean var2) {
      ArrayList var5 = Lists.newArrayList();
      Item var6 = var1.getItem();
      boolean var7 = var1.getItem() == Items.field37900;

      for (Class6069 var9 : Registry.field16073) {
         if ((!var9.method18824() || var2) && var9.method18827() && (var9.field27308.method8990(var6) || var7)) {
            for (int var10 = var9.method18809(); var10 > var9.method18813() - 1; var10--) {
               if (var0 >= var9.method18807(var10) && var0 <= var9.method18808(var10)) {
                  var5.add(new Class6694(var9, var10));
                  break;
               }
            }
         }
      }

      return var5;
   }
}

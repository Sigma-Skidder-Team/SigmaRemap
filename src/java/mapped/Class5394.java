package mapped;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.Random;

public class Class5394 implements Class5391 {
   private static String[] field24042;
   private final Item field24043;
   private final int field24044;
   private final int field24045;
   private final int field24046;

   public Class5394(Item var1, int var2) {
      this(var1, var2, 12, 1);
   }

   public Class5394(Item var1, int var2, int var3, int var4) {
      this.field24043 = var1;
      this.field24044 = var2;
      this.field24045 = var3;
      this.field24046 = var4;
   }

   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      ItemStack var5 = new ItemStack(Items.EMERALD, this.field24044);
      ItemStack var6 = new ItemStack(this.field24043);
      if (this.field24043 instanceof Class3278) {
         ArrayList var7 = Lists.newArrayList();
         var7.add(method16980(var2));
         if (var2.nextFloat() > 0.7F) {
            var7.add(method16980(var2));
         }

         if (var2.nextFloat() > 0.8F) {
            var7.add(method16980(var2));
         }

         var6 = Class3277.method11803(var6, var7);
      }

      return new Class9346(var5, var6, this.field24045, this.field24046, 0.2F);
   }

   private static Class3321 method16980(Random var0) {
      return Class3321.method11877(Class112.method315(var0.nextInt(16)));
   }
}

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Class5400 implements Class5391 {
   private static String[] field24076;
   private final ItemStack field24077;
   private final int field24078;
   private final int field24079;
   private final int field24080;
   private final int field24081;
   private final Item field24082;
   private final int field24083;
   private final float field24084;

   public Class5400(Item var1, int var2, Item var3, int var4, int var5, int var6, int var7) {
      this.field24077 = new ItemStack(var3);
      this.field24079 = var5;
      this.field24080 = var6;
      this.field24081 = var7;
      this.field24082 = var1;
      this.field24083 = var2;
      this.field24078 = var4;
      this.field24084 = 0.05F;
   }

   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      ItemStack var5 = new ItemStack(Items.field38049, this.field24079);
      List var6 = Registry.field16076.stream().filter(var0 -> !var0.method31816().isEmpty() && Class7105.method22135(var0)).collect(Collectors.toList());
      Class8812 var7 = (Class8812)var6.get(var2.nextInt(var6.size()));
      ItemStack var8 = Class9741.method38187(new ItemStack(this.field24077.getItem(), this.field24078), var7);
      return new Class9346(var5, new ItemStack(this.field24082, this.field24083), var8, this.field24080, this.field24081, this.field24084);
   }
}

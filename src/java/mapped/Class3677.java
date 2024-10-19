package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import net.minecraft.util.Util;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.Random;

public class Class3677 extends Class3676<Class1042> {
   private Class7699 field19689;

   public Class3677(int var1, int var2) {
      super(ImmutableMap.of(), var1, var2);
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      BlockPos var5 = var2.getPosition();
      this.field19689 = var1.method6957(var5);
      return this.field19689 != null && this.field19689.method25392() && Class3686.method12533(var1, var2, var5);
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      return this.field19689 != null && !this.field19689.method25391();
   }

   public void method12506(ServerWorld var1, Class1042 var2, long var3) {
      this.field19689 = null;
      var2.getBrain().method21422(var1.method6784(), var1.getGameTime());
   }

   public void method12504(ServerWorld var1, Class1042 var2, long var3) {
      Random var7 = var2.getRNG();
      if (var7.nextInt(100) == 0) {
         var2.method4750();
      }

      if (var7.nextInt(200) == 0 && Class3686.method12533(var1, var2, var2.getPosition())) {
         Class112 var8 = Util.<Class112>getRandomObject(Class112.values(), var7);
         int var9 = var7.nextInt(3);
         ItemStack var10 = this.method12510(var8, var9);
         Class888 var11 = new Class888(var2.world, var2, var2.getPosX(), var2.getPosYEye(), var2.getPosZ(), var10);
         var2.world.addEntity(var11);
      }
   }

   private ItemStack method12510(Class112 var1, int var2) {
      ItemStack var5 = new ItemStack(Items.field38068, 1);
      ItemStack var6 = new ItemStack(Items.field38069);
      CompoundNBT var7 = var6.method32144("Explosion");
      ArrayList var8 = Lists.newArrayList();
      var8.add(var1.method313());
      var7.putIntArray("Colors", var8);
      var7.putByte("Type", (byte)Class2119.field13811.method8800());
      CompoundNBT var9 = var5.method32144("Fireworks");
      ListNBT var10 = new ListNBT();
      CompoundNBT var11 = var6.method32145("Explosion");
      if (var11 != null) {
         var10.add(var11);
      }

      var9.putByte("Flight", (byte)var2);
      if (!var10.isEmpty()) {
         var9.put("Explosions", var10);
      }

      return var5;
   }
}

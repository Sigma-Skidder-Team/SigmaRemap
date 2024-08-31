package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;

import javax.annotation.Nullable;
import java.util.ArrayList;

public class Class46 extends ArrayList<Class9346> {
   public Class46() {
   }

   public Class46(CompoundNBT var1) {
      ListNBT var4 = var1.method131("Recipes", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         this.add(new Class9346(var4.method153(var5)));
      }
   }

   @Nullable
   public Class9346 method163(ItemStack var1, ItemStack var2, int var3) {
      if (var3 > 0 && var3 < this.size()) {
         Class9346 var8 = this.get(var3);
         return !var8.method35387(var1, var2) ? null : var8;
      } else {
         for (int var6 = 0; var6 < this.size(); var6++) {
            Class9346 var7 = this.get(var6);
            if (var7.method35387(var1, var2)) {
               return var7;
            }
         }

         return null;
      }
   }

   public void method164(PacketBuffer var1) {
      var1.writeByte((byte)(this.size() & 0xFF));

      for (int var4 = 0; var4 < this.size(); var4++) {
         Class9346 var5 = this.get(var4);
         var1.method35724(var5.method35365());
         var1.method35724(var5.method35368());
         ItemStack var6 = var5.method35367();
         var1.writeBoolean(!var6.isEmpty());
         if (!var6.isEmpty()) {
            var1.method35724(var6);
         }

         var1.writeBoolean(var5.method35382());
         var1.writeInt(var5.method35371());
         var1.writeInt(var5.method35373());
         var1.writeInt(var5.method35381());
         var1.writeInt(var5.method35378());
         var1.writeFloat(var5.method35380());
         var1.writeInt(var5.method35375());
      }
   }

   public static Class46 method165(PacketBuffer var0) {
      Class46 var3 = new Class46();
      int var4 = var0.readByte() & 255;

      for (int var5 = 0; var5 < var4; var5++) {
         ItemStack var6 = var0.method35726();
         ItemStack var7 = var0.method35726();
         ItemStack var8 = ItemStack.EMPTY;
         if (var0.readBoolean()) {
            var8 = var0.method35726();
         }

         boolean var9 = var0.readBoolean();
         int var10 = var0.readInt();
         int var11 = var0.readInt();
         int var12 = var0.readInt();
         int var13 = var0.readInt();
         float var14 = var0.readFloat();
         int var15 = var0.readInt();
         Class9346 var16 = new Class9346(var6, var8, var7, var10, var11, var12, var14, var15);
         if (var9) {
            var16.method35383();
         }

         var16.method35379(var13);
         var3.add(var16);
      }

      return var3;
   }

   public CompoundNBT method166() {
      CompoundNBT var3 = new CompoundNBT();
      ListNBT var4 = new ListNBT();

      for (int var5 = 0; var5 < this.size(); var5++) {
         Class9346 var6 = this.get(var5);
         var4.add(var6.method35386());
      }

      var3.put("Recipes", var4);
      return var3;
   }
}

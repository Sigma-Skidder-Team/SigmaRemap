package mapped;

import com.mentalfrostbyte.jello.viaversion.ViaVersionLoader;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;

import java.io.IOException;

public class Class5409 extends Class5408 {
   private static String[] field24093;

   @Override
   public Class9738 method16994(Class7161 var1) {
      Minecraft var4 = Minecraft.getInstance();
      ItemStack var5 = ! PlayerInventory.isHotbar(ViaVersionLoader.field31494) ? ItemStack.EMPTY : var4.player.inventory.field5439.get(ViaVersionLoader.field31494);
      Item var6 = var5.getItem();
      if (var6 != null) {
         Class9738 var7 = new Class9738(
            (short) Item.method11701(var6), (byte)var5.count, (short)var5.method32117(), this.method16995(var5.method32142())
         );
         Class9550.method36998(var7);
         Class8121.method28121(var7);
         Class8704.method31394(var7);
         Class8770.method31636(var7);
         Class7960.method27084(var7);
         Class9687.method37925(var7);
         Class8768.method31625(var7);
         return var7;
      } else {
         return new Class9738(0, (byte)0, (short)0, null);
      }
   }

   public Class72 method16995(CompoundNBT var1) {
      if (var1 == null) {
         return null;
      } else {
         ByteBuf var4 = Unpooled.wrappedBuffer(new byte[2048]);
         var4.resetWriterIndex();

         try {
            CompressedStreamTools.method31773(var1, new ByteBufOutputStream(var4));
            var4.writeByte(0);
            ByteBufInputStream var5 = new ByteBufInputStream(var4);
            return (Class72)Class8275.method28919(var5, false);
         } catch (IOException var6) {
            var6.printStackTrace();
            return null;
         }
      }
   }
}

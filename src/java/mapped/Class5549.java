package mapped;

import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;
import java.util.function.BiConsumer;

public class Class5549 implements Packet<Class5116> {
   private static String[] field24641;
   public Class2002 field24642;
   public short[] field24643;
   public BlockState[] field24644;
   public boolean field24645;

   public Class5549() {
   }

   public Class5549(Class2002 var1, ShortSet var2, Class7038 var3, boolean var4) {
      this.field24642 = var1;
      this.field24645 = var4;
      this.method17460(var2.size());
      int var7 = 0;

      for (ShortIterator var8 = var2.iterator(); var8.hasNext(); var7++) {
         short var9 = (Short)var8.next();
         this.field24643[var7] = var9;
         this.field24644[var7] = var3.method21852(Class2002.method8399(var9), Class2002.method8400(var9), Class2002.method8401(var9));
      }
   }

   private void method17460(int var1) {
      this.field24643 = new short[var1];
      this.field24644 = new BlockState[var1];
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24642 = Class2002.method8393(var1.readLong());
      this.field24645 = var1.readBoolean();
      int var4 = var1.method35714();
      this.method17460(var4);

      for (int var5 = 0; var5 < this.field24643.length; var5++) {
         long var6 = var1.method35715();
         this.field24643[var5] = (short)((int)(var6 & 4095L));
         this.field24644[var5] = Block.field18610.method9172((int)(var6 >>> 12));
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeLong(this.field24642.method8425());
      var1.writeBoolean(this.field24645);
      var1.writeVarInt(this.field24643.length);

      for (int var4 = 0; var4 < this.field24643.length; var4++) {
         var1.method35719((long)(Block.getStateId(this.field24644[var4]) << 12 | this.field24643[var4]));
      }
   }

   public void method17180(Class5116 var1) {
      var1.method15707(this);
   }

   public void method17461(BiConsumer<BlockPos, BlockState> var1) {
      Mutable var4 = new Mutable();

      for (int var5 = 0; var5 < this.field24643.length; var5++) {
         short var6 = this.field24643[var5];
         var4.method8372(this.field24642.method8402(var6), this.field24642.method8403(var6), this.field24642.method8404(var6));
         var1.accept(var4, this.field24644[var5]);
      }
   }

   public boolean method17462() {
      return this.field24645;
   }
}

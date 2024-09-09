package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class Class4751 extends Class4750<Class8173> {
   private static final Class72[] field22576 = new Class72[0];

   public Class4751() {
      super(Class8173.class);
   }

   public Class8173 method14894(ByteBuf var1) throws Exception {
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      boolean var6 = var1.readBoolean();
      boolean var7 = var1.readBoolean();
      int var8 = Class4750.field22544.method14907(var1);
      Class72 var9 = Class4750.field22555.method14894(var1);
      int[] var10 = !var6 ? null : new int[1024];
      if (var6) {
         for (int var11 = 0; var11 < 1024; var11++) {
            var10[var11] = var1.readInt();
         }
      }

      Class4750.field22544.method14907(var1);
      Class8225[] var15 = new Class8225[16];

      for (int var12 = 0; var12 < 16; var12++) {
         if ((var8 & 1 << var12) != 0) {
            short var13 = var1.readShort();
            Class8225 var14 = Class9657.field45140.method14894(var1);
            var14.method28652(var13);
            var15[var12] = var14;
         }
      }

      ArrayList var16 = new ArrayList<Class72>(Arrays.asList(Class4750.field22556.method14894(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var17 = Class4750.field22521.method14894(var1);
         if (ViaVersion3.method27614().method34425()) {
            ViaVersion3.method27613().method27366().warning("Found " + var17.length + " more bytes than expected while reading the chunk: " + var4 + "/" + var5);
         }
      }

      return new Class8171(var4, var5, var6, var7, var8, var15, var10, var9, var16);
   }

   public void method14895(ByteBuf var1, Class8173 var2) throws Exception {
      var1.writeInt(var2.method28440());
      var1.writeInt(var2.method28441());
      var1.writeBoolean(var2.method28442());
      var1.writeBoolean(var2.method28443());
      Class4750.field22544.method14908(var1, var2.method28445());
      Class4750.field22555.method14895(var1, var2.method28449());
      if (var2.method28439()) {
         for (int var8 : var2.method28447()) {
            var1.writeInt(var8);
         }
      }

      ByteBuf var12 = var1.alloc().buffer();

      try {
         for (int var13 = 0; var13 < 16; var13++) {
            Class8225 var14 = var2.method28446()[var13];
            if (var14 != null) {
               var12.writeShort(var14.method28651());
               Class9657.field45140.method14895(var12, var14);
            }
         }

         var12.readerIndex(0);
         Class4750.field22544.method14908(var1, var12.readableBytes());
         var1.writeBytes(var12);
      } finally {
         var12.release();
      }

      Class4750.field22556.method14895(var1, var2.method28451().<Class72>toArray(field22576));
   }

   @Override
   public Class<? extends Class4750> method14897() {
      return Class4800.class;
   }
}

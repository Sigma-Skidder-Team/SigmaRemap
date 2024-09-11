package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class Class4818 extends Class4750<Class8173> {
   private static final Class72[] field22597 = new Class72[0];

   public Class4818() {
      super(Class8173.class);
   }

   public Class8173 method14894(ByteBuf var1) throws Exception {
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      boolean var6 = var1.readBoolean();
      int var7 = Class4750.field22544.method14907(var1);
      Class72 var8 = Class4750.field22555.method14894(var1);
      int[] var9 = !var6 ? null : new int[1024];
      if (var6) {
         for (int var10 = 0; var10 < 1024; var10++) {
            var9[var10] = var1.readInt();
         }
      }

      Class4750.field22544.method14907(var1);
      Class8225[] var14 = new Class8225[16];

      for (int var11 = 0; var11 < 16; var11++) {
         if ((var7 & 1 << var11) != 0) {
            short var12 = var1.readShort();
            Class8225 var13 = Class8845.field39965.method14894(var1);
            var13.method28652(var12);
            var14[var11] = var13;
         }
      }

      ArrayList var15 = new ArrayList<Class72>(Arrays.asList(Class4750.field22556.method14894(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var16 = Class4750.field22521.method14894(var1);
         if (ViaVersion3.getInstance().method34425()) {
            ViaVersion3.method27613().getLogger().warning("Found " + var16.length + " more bytes than expected while reading the chunk: " + var4 + "/" + var5);
         }
      }

      return new Class8171(var4, var5, var6, false, var7, var14, var9, var8, var15);
   }

   public void method14895(ByteBuf var1, Class8173 var2) throws Exception {
      var1.writeInt(var2.method28440());
      var1.writeInt(var2.method28441());
      var1.writeBoolean(var2.method28442());
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
               Class8845.field39965.method14895(var12, var14);
            }
         }

         var12.readerIndex(0);
         Class4750.field22544.method14908(var1, var12.readableBytes());
         var1.writeBytes(var12);
      } finally {
         var12.release();
      }

      Class4750.field22556.method14895(var1, var2.method28451().<Class72>toArray(field22597));
   }

   @Override
   public Class<? extends Class4750> method14897() {
      return Class4800.class;
   }
}

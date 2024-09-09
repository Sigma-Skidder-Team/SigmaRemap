package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class Class4772 extends Class4750<Class8173> {
   public Class4772() {
      super(Class8173.class);
   }

   public Class8173 method14894(ByteBuf var1) throws Exception {
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      boolean var6 = var1.readBoolean();
      int var7 = Class4750.field22544.method14907(var1);
      Class72 var8 = Class4750.field22555.method14894(var1);
      Class4750.field22544.method14907(var1);
      Class8225[] var9 = new Class8225[16];

      for (int var10 = 0; var10 < 16; var10++) {
         if ((var7 & 1 << var10) != 0) {
            short var11 = var1.readShort();
            Class8225 var12 = Class8845.field39965.method14894(var1);
            var12.method28652(var11);
            var9[var10] = var12;
         }
      }

      int[] var13 = !var6 ? null : new int[256];
      if (var6) {
         for (int var14 = 0; var14 < 256; var14++) {
            var13[var14] = var1.readInt();
         }
      }

      ArrayList var15 = new ArrayList<Class72>(Arrays.asList(Class4750.field22556.method14894(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var16 = Class4750.field22521.method14894(var1);
         if (ViaVersion3.method27614().method34425()) {
            ViaVersion3.method27613().method27366().warning("Found " + var16.length + " more bytes than expected while reading the chunk: " + var4 + "/" + var5);
         }
      }

      return new Class8171(var4, var5, var6, false, var7, var9, var13, var8, var15);
   }

   public void method14895(ByteBuf var1, Class8173 var2) throws Exception {
      var1.writeInt(var2.method28440());
      var1.writeInt(var2.method28441());
      var1.writeBoolean(var2.method28442());
      Class4750.field22544.method14908(var1, var2.method28445());
      Class4750.field22555.method14895(var1, var2.method28449());
      ByteBuf var5 = var1.alloc().buffer();

      try {
         for (int var6 = 0; var6 < 16; var6++) {
            Class8225 var7 = var2.method28446()[var6];
            if (var7 != null) {
               var5.writeShort(var7.method28651());
               Class8845.field39965.method14895(var5, var7);
            }
         }

         var5.readerIndex(0);
         Class4750.field22544.method14908(var1, var5.readableBytes() + (var2.method28439() ? 1024 : 0));
         var1.writeBytes(var5);
      } finally {
         var5.release();
      }

      if (var2.method28439()) {
         for (int var9 : var2.method28447()) {
            var1.writeInt(var9 & 0xFF);
         }
      }

      Class4750.field22556.method14895(var1, var2.method28451().<Class72>toArray(new Class72[0]));
   }

   @Override
   public Class<? extends Class4750> method14897() {
      return Class4800.class;
   }
}

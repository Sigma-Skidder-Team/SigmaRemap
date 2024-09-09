package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class Class4824 extends Class4747<Class8173, Class6047> {
   public Class4824(Class6047 var1) {
      super(var1, Class8173.class);
   }

   public Class8173 method14893(ByteBuf var1, Class6047 var2) throws Exception {
      int var5 = var1.readInt();
      int var6 = var1.readInt();
      boolean var7 = var1.readBoolean();
      int var8 = Class4750.field22544.method14907(var1);
      Class4750.field22544.method14907(var1);
      Class8225[] var9 = new Class8225[16];

      for (int var10 = 0; var10 < 16; var10++) {
         if ((var8 & 1 << var10) != 0) {
            Class8225 var11 = Class7593.field32600.method14894(var1);
            var9[var10] = var11;
            var11.method28644(var1);
            if (var2.method18729() == Class2195.field14342) {
               var11.method28645(var1);
            }
         }
      }

      int[] var13 = !var7 ? null : new int[256];
      if (var7) {
         for (int var14 = 0; var14 < 256; var14++) {
            var13[var14] = var1.readByte() & 255;
         }
      }

      ArrayList var15 = new ArrayList<Class72>(Arrays.asList(Class4750.field22556.method14894(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var12 = Class4750.field22521.method14894(var1);
         if (ViaVersion3.method27614().method34425()) {
            ViaVersion3.method27613().method27366().warning("Found " + var12.length + " more bytes than expected while reading the chunk: " + var5 + "/" + var6);
         }
      }

      return new Class8171(var5, var6, var7, false, var8, var9, var13, var15);
   }

   public void method14892(ByteBuf var1, Class6047 var2, Class8173 var3) throws Exception {
      var1.writeInt(var3.method28440());
      var1.writeInt(var3.method28441());
      var1.writeBoolean(var3.method28442());
      Class4750.field22544.method14908(var1, var3.method28445());
      ByteBuf var6 = var1.alloc().buffer();

      try {
         for (int var7 = 0; var7 < 16; var7++) {
            Class8225 var8 = var3.method28446()[var7];
            if (var8 != null) {
               Class7593.field32600.method14895(var6, var8);
               var8.method28647(var6);
               if (var8.method28649()) {
                  var8.method28648(var6);
               }
            }
         }

         var6.readerIndex(0);
         Class4750.field22544.method14908(var1, var6.readableBytes() + (var3.method28439() ? 256 : 0));
         var1.writeBytes(var6);
      } finally {
         var6.release();
      }

      if (var3.method28439()) {
         for (int var10 : var3.method28447()) {
            var1.writeByte((byte)var10);
         }
      }

      Class4750.field22556.method14895(var1, var3.method28451().<Class72>toArray(new Class72[0]));
   }

   @Override
   public Class<? extends Class4750> method14897() {
      return Class4800.class;
   }
}

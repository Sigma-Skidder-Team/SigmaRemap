package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class Class4770 extends BruhMotha<Class8173> {
   private static final Class72[] field22579 = new Class72[0];

   public Class4770() {
      super(Class8173.class);
   }

   public Class8173 method14894(ByteBuf var1) throws Exception {
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      boolean var6 = var1.readBoolean();
      int var7 = BruhMotha.field22544.method14907(var1);
      Class72 var8 = BruhMotha.field22555.method14894(var1);
      int[] var9 = null;
      if (var6) {
         var9 = BruhMotha.field22546.method14894(var1);
      }

      BruhMotha.field22544.method14907(var1);
      Class8225[] var10 = new Class8225[16];

      for (int var11 = 0; var11 < 16; var11++) {
         if ((var7 & 1 << var11) != 0) {
            short var12 = var1.readShort();
            Class8225 var13 = Class9657.field45140.method14894(var1);
            var13.method28652(var12);
            var10[var11] = var13;
         }
      }

      ArrayList var14 = new ArrayList<Class72>(Arrays.asList(BruhMotha.field22556.method14894(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var15 = BruhMotha.field22521.method14894(var1);
         if (ViaVersion3.getInstance().method34425()) {
            ViaVersion3.method27613().getLogger().warning("Found " + var15.length + " more bytes than expected while reading the chunk: " + var4 + "/" + var5);
         }
      }

      return new Class8171(var4, var5, var6, false, var7, var10, var9, var8, var14);
   }

   public void method14895(ByteBuf var1, Class8173 var2) throws Exception {
      var1.writeInt(var2.method28440());
      var1.writeInt(var2.method28441());
      var1.writeBoolean(var2.method28442());
      BruhMotha.field22544.method14908(var1, var2.method28445());
      BruhMotha.field22555.method14895(var1, var2.method28449());
      if (var2.method28439()) {
         BruhMotha.field22546.method14895(var1, var2.method28447());
      }

      ByteBuf var5 = var1.alloc().buffer();

      try {
         for (int var6 = 0; var6 < 16; var6++) {
            Class8225 var7 = var2.method28446()[var6];
            if (var7 != null) {
               var5.writeShort(var7.method28651());
               Class9657.field45140.method14895(var5, var7);
            }
         }

         var5.readerIndex(0);
         BruhMotha.field22544.method14908(var1, var5.readableBytes());
         var1.writeBytes(var5);
      } finally {
         var5.release();
      }

      BruhMotha.field22556.method14895(var1, var2.method28451().<Class72>toArray(field22579));
   }

   @Override
   public Class<? extends BruhMotha> method14897() {
      return Class4800.class;
   }
}

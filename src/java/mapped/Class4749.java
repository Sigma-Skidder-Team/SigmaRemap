package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;

public class Class4749 extends Class4747<Class8173, Class6047> {
   public Class4749(Class6047 var1) {
      super(var1, Class8173.class);
   }

   public Class8173 method14893(ByteBuf var1, Class6047 var2) throws Exception {
      int var5 = var1.readInt();
      int var6 = var1.readInt();
      boolean var7 = var1.readBoolean();
      int var8 = BruhMotha.field22544.method14907(var1);
      ByteBuf var9 = var1.readSlice(BruhMotha.field22544.method14907(var1));
      Class8225[] var10 = new Class8225[16];

      for (int var11 = 0; var11 < 16; var11++) {
         if ((var8 & 1 << var11) != 0) {
            Class8225 var12 = Class8845.field39965.method14894(var9);
            var10[var11] = var12;
            var12.method28644(var9);
            if (var2.method18729() == Class2195.field14342) {
               var12.method28645(var9);
            }
         }
      }

      int[] var14 = !var7 ? null : new int[256];
      if (var7) {
         if (var9.readableBytes() < 1024) {
            ViaVersion3.method27613().getLogger().log(Level.WARNING, "Chunk x=" + var5 + " z=" + var6 + " doesn't have biome data!");
         } else {
            for (int var15 = 0; var15 < 256; var15++) {
               var14[var15] = var9.readInt();
            }
         }
      }

      ArrayList var16 = new ArrayList<Class72>(Arrays.asList(BruhMotha.field22556.method14894(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var13 = BruhMotha.field22521.method14894(var1);
         if (ViaVersion3.getInstance().method34425()) {
            ViaVersion3.method27613().getLogger().warning("Found " + var13.length + " more bytes than expected while reading the chunk: " + var5 + "/" + var6);
         }
      }

      return new Class8171(var5, var6, var7, false, var8, var10, var14, var16);
   }

   public void method14892(ByteBuf var1, Class6047 var2, Class8173 var3) throws Exception {
      var1.writeInt(var3.method28440());
      var1.writeInt(var3.method28441());
      var1.writeBoolean(var3.method28442());
      BruhMotha.field22544.method14908(var1, var3.method28445());
      ByteBuf var6 = var1.alloc().buffer();

      try {
         for (int var7 = 0; var7 < 16; var7++) {
            Class8225 var8 = var3.method28446()[var7];
            if (var8 != null) {
               Class8845.field39965.method14895(var6, var8);
               var8.method28647(var6);
               if (var8.method28649()) {
                  var8.method28648(var6);
               }
            }
         }

         var6.readerIndex(0);
         BruhMotha.field22544.method14908(var1, var6.readableBytes() + (var3.method28439() ? 1024 : 0));
         var1.writeBytes(var6);
      } finally {
         var6.release();
      }

      if (var3.method28439()) {
         for (int var10 : var3.method28447()) {
            var1.writeInt(var10);
         }
      }

      BruhMotha.field22556.method14895(var1, var3.method28451().<Class72>toArray(new Class72[0]));
   }

   @Override
   public Class<? extends BruhMotha> method14897() {
      return Class4800.class;
   }
}

package mapped;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Class6041 extends Class6037 {
   private static final short[] field26250 = new short[8582];
   private static Constructor<?> field26251;
   private final Map<Long, Class9284<byte[], Class7873>> field26252 = this.<Class9284<byte[], Class7873>>method18703();

   public Class6041(Class7161 var1) {
      super(var1);
   }

   public void method18693(int var1, int var2, int var3, int var4) {
      short var7 = field26250[var4];
      if (var7 != -1) {
         long var8 = this.method18699(var1, var2, var3);
         Class9284 var10 = this.method18698(var8, false);
         short var11 = this.method18701(var1, var2, var3);
         ((byte[])var10.method35008())[var11] = (byte)(var7 >> 4);
         Class7873 var12 = (Class7873)var10.method35009();
         if (var12 != null) {
            var12.method26405(var11, var7);
         }
      }
   }

   public int method18694(int var1, int var2, int var3) {
      long var6 = this.method18699(var1, var2, var3);
      Class9284 var8 = this.field26252.get(var6);
      if (var8 != null) {
         short var9 = this.method18701(var1, var2, var3);
         Class7873 var10 = (Class7873)var8.method35009();
         return Class7795.method25886((((byte[])var8.method35008())[var9] & 0xFF) << 4 | (var10 != null ? var10.method26403(var9) : 0));
      } else {
         return 0;
      }
   }

   public void method18695(int var1, int var2, int var3) {
      long var6 = this.method18699(var1, var2, var3);
      Class9284 var8 = this.field26252.get(var6);
      if (var8 != null) {
         short var9 = this.method18701(var1, var2, var3);
         Class7873 var10 = (Class7873)var8.method35009();
         if (var10 != null) {
            var10.method26405(var9, 0);
            boolean var11 = true;

            for (int var12 = 0; var12 < 4096; var12++) {
               if (var10.method26403(var12) != 0) {
                  var11 = false;
                  break;
               }
            }

            if (var11) {
               var8.method35010(null);
            }
         }

         ((byte[])var8.method35008())[var9] = 0;
         byte[] var15 = (byte[])var8.method35008();
         int var16 = var15.length;

         for (int var13 = 0; var13 < var16; var13++) {
            short var14 = (short)var15[var13];
            if (var14 != 0) {
               return;
            }
         }

         this.field26252.remove(var6);
      }
   }

   public void method18696() {
      this.field26252.clear();
   }

   public void method18697(int var1, int var2) {
      for (int var5 = 0; var5 < 256; var5 += 16) {
         this.field26252.remove(this.method18699(var1 << 4, var5, var2 << 4));
      }
   }

   private Class9284<byte[], Class7873> method18698(long var1, boolean var3) {
      Class9284 var6 = this.field26252.get(var1);
      if (var6 == null) {
         var6 = new Class9284(new byte[4096], null);
         this.field26252.put(var1, var6);
      }

      if (var6.method35009() == null && var3) {
         var6.method35010(new Class7873(4096));
      }

      return var6;
   }

   private long method18699(int var1, int var2, int var3) {
      return ((long)(var1 >> 4) & 67108863L) << 38 | ((long)(var2 >> 4) & 4095L) << 26 | (long)(var3 >> 4) & 67108863L;
   }

   private long method18700(Class9695 var1) {
      return this.method18699(var1.method37962(), var1.method37963(), var1.method37964());
   }

   private short method18701(int var1, int var2, int var3) {
      return (short)((var2 & 15) << 8 | (var1 & 15) << 4 | var3 & 15);
   }

   private short method18702(Class9695 var1) {
      return this.method18701(var1.method37962(), var1.method37963(), var1.method37964());
   }

   private <T> Map<Long, T> method18703() {
      if (field26251 != null) {
         try {
            return (Map<Long, T>)field26251.newInstance();
         } catch (InstantiationException | InvocationTargetException | IllegalAccessException var4) {
            var4.printStackTrace();
         }
      }

      return new HashMap<Long, T>();
   }

   static {
      try {
         field26251 = Class.forName("it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap").getConstructor();
         Class8042.method27613().method27366().info("Using FastUtil Long2ObjectOpenHashMap for block connections");
      } catch (NoSuchMethodException | ClassNotFoundException var8) {
      }

      Arrays.fill(field26250, (short)-1);

      for (int var6 = 0; var6 < 4096; var6++) {
         int var7 = Class6380.field27947.method18535().method22147(var6);
         if (var7 != -1) {
            field26250[var7] = (short)var6;
         }
      }
   }
}

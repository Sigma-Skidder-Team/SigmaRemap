package remapped;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class class_1334 extends class_1174 {
   private static final short[] field_7318 = new short[8582];
   private static Constructor<?> field_7320;
   private final Map<Long, class_7794<byte[], class_2962>> field_7317 = this.<class_7794<byte[], class_2962>>method_6114();

   public class_1334(class_1455 var1) {
      super(var1);
   }

   public void method_6122(int var1, int var2, int var3, int var4) {
      short var7 = field_7318[var4];
      if (var7 != -1) {
         long var8 = this.method_6115(var1, var2, var3);
         class_7794 var10 = this.method_6120(var8, false);
         short var11 = this.method_6117(var1, var2, var3);
         ((byte[])var10.method_35355())[var11] = (byte)(var7 >> 4);
         class_2962 var12 = (class_2962)var10.method_35352();
         if (var12 != null) {
            var12.method_13547(var11, var7);
         }
      }
   }

   public int method_6113(int var1, int var2, int var3) {
      long var6 = this.method_6115(var1, var2, var3);
      class_7794 var8 = this.field_7317.get(var6);
      if (var8 != null) {
         short var9 = this.method_6117(var1, var2, var3);
         class_2962 var10 = (class_2962)var8.method_35352();
         return class_2750.method_12391((((byte[])var8.method_35355())[var9] & 0xFF) << 4 | (var10 != null ? var10.method_13549(var9) : 0));
      } else {
         return 0;
      }
   }

   public void method_6112(int var1, int var2, int var3) {
      long var6 = this.method_6115(var1, var2, var3);
      class_7794 var8 = this.field_7317.get(var6);
      if (var8 != null) {
         short var9 = this.method_6117(var1, var2, var3);
         class_2962 var10 = (class_2962)var8.method_35352();
         if (var10 != null) {
            var10.method_13547(var9, 0);
            boolean var11 = true;

            for (int var12 = 0; var12 < 4096; var12++) {
               if (var10.method_13549(var12) != 0) {
                  var11 = false;
                  break;
               }
            }

            if (var11) {
               var8.method_35354(null);
            }
         }

         ((byte[])var8.method_35355())[var9] = 0;
         byte[] var15 = (byte[])var8.method_35355();
         int var16 = var15.length;

         for (int var13 = 0; var13 < var16; var13++) {
            short var14 = (short)var15[var13];
            if (var14 != 0) {
               return;
            }
         }

         this.field_7317.remove(var6);
      }
   }

   public void method_6121() {
      this.field_7317.clear();
   }

   public void method_6119(int var1, int var2) {
      for (byte var5 = 0; var5 < 256; var5 += 16) {
         this.field_7317.remove(this.method_6115(var1 << 4, var5, var2 << 4));
      }
   }

   private class_7794<byte[], class_2962> method_6120(long var1, boolean var3) {
      class_7794 var6 = this.field_7317.get(var1);
      if (var6 == null) {
         var6 = new class_7794(new byte[4096], null);
         this.field_7317.put(var1, var6);
      }

      if (var6.method_35352() == null && var3) {
         var6.method_35354(new class_2962(4096));
      }

      return var6;
   }

   private long method_6115(int var1, int var2, int var3) {
      return ((long)(var1 >> 4) & 67108863L) << 38 | ((long)(var2 >> 4) & 4095L) << 26 | (long)(var3 >> 4) & 67108863L;
   }

   private long method_6116(class_9371 var1) {
      return this.method_6115(var1.method_43340(), var1.method_43342(), var1.method_43343());
   }

   private short method_6117(int var1, int var2, int var3) {
      return (short)((var2 & 15) << 8 | (var1 & 15) << 4 | var3 & 15);
   }

   private short method_6118(class_9371 var1) {
      return this.method_6117(var1.method_43340(), var1.method_43342(), var1.method_43343());
   }

   private <T> Map<Long, T> method_6114() {
      if (field_7320 != null) {
         try {
            return (Map<Long, T>)field_7320.newInstance();
         } catch (InstantiationException | InvocationTargetException | IllegalAccessException var4) {
            var4.printStackTrace();
         }
      }

      return new HashMap<Long, T>();
   }

   static {
      try {
         field_7320 = Class.forName("it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap").getConstructor();
         class_3446.method_15886().method_34617().info("Using FastUtil Long2ObjectOpenHashMap for block connections");
      } catch (NoSuchMethodException | ClassNotFoundException var8) {
      }

      Arrays.fill(field_7318, (short)-1);

      for (int var6 = 0; var6 < 4096; var6++) {
         int var7 = class_8633.field_44277.method_28211().method_6437(var6);
         if (var7 != -1) {
            field_7318[var7] = (short)var6;
         }
      }
   }
}

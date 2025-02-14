package mapped;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.Random;

public class Class6659 implements Class6660<Class7900> {
   private static String[] field29224;
   private final Long2IntLinkedOpenHashMap field29225;
   private final int field29226;
   private final Class8718 field29227;
   private final long field29228;
   private long field29229;

   public Class6659(int var1, long var2, long var4) {
      this.field29228 = method20314(var2, var4);
      this.field29227 = new Class8718(new Random(var2));
      this.field29225 = new Long2IntLinkedOpenHashMap(16, 0.25F);
      this.field29225.defaultReturnValue(Integer.MIN_VALUE);
      this.field29226 = var1;
   }

   public Class7900 method20317(Class8984 var1) {
      return new Class7900(this.field29225, this.field29226, var1);
   }

   public Class7900 method20309(Class8984 var1, Class7900 var2) {
      return new Class7900(this.field29225, Math.min(1024, var2.method26472() * 4), var1);
   }

   public Class7900 method20310(Class8984 var1, Class7900 var2, Class7900 var3) {
      return new Class7900(this.field29225, Math.min(1024, Math.max(var2.method26472(), var3.method26472()) * 4), var1);
   }

   @Override
   public void method20311(long var1, long var3) {
      long var7 = this.field29228;
      var7 = Class7793.method25883(var7, var1);
      var7 = Class7793.method25883(var7, var3);
      var7 = Class7793.method25883(var7, var1);
      var7 = Class7793.method25883(var7, var3);
      this.field29229 = var7;
   }

   @Override
   public int method20312(int var1) {
      int var4 = (int)Math.floorMod(this.field29229 >> 24, (long)var1);
      this.field29229 = Class7793.method25883(this.field29229, this.field29228);
      return var4;
   }

   @Override
   public Class8718 method20313() {
      return this.field29227;
   }

   private static long method20314(long var0, long var2) {
      long var6 = Class7793.method25883(var2, var2);
      var6 = Class7793.method25883(var6, var2);
      var6 = Class7793.method25883(var6, var2);
      long var8 = Class7793.method25883(var0, var6);
      var8 = Class7793.method25883(var8, var6);
      return Class7793.method25883(var8, var6);
   }
}

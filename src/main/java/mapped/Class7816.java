package mapped;

import java.util.ArrayList;
import java.util.Arrays;

public class Class7816 implements Class7815 {
   private static String[] field33525;
   private Class2118[] field33526;
   private Class2118[] field33527;
   private Class2118[] field33528;
   private int field33529 = Integer.MAX_VALUE;
   private static final Class2118[] field33530 = new Class2118[0];

   public Class7816() {
      this((Class2118[])null, (Class2118[])null, (Class2118[])null);
   }

   public Class7816(Class2118[] var1, Class2118[] var2, Class2118[] var3) {
      this(var1, var2, var3, Integer.MAX_VALUE);
   }

   public Class7816(Class2118[] var1, Class2118[] var2, Class2118[] var3, int var4) {
      this.field33526 = method26095(var1);
      this.field33527 = method26095(var2);
      this.field33528 = method26095(var3);
      this.field33529 = var4;
   }

   private static Class2118[] method26095(Class2118[] var0) {
      return var0 != null ? var0 : field33530;
   }

   public Class2118[] method26096() {
      return this.field33526;
   }

   public Class2118[] method26097() {
      return this.field33527;
   }

   public Class2118[] method26098() {
      return this.field33528;
   }

   public int method26099() {
      return this.field33526 != null ? this.field33526.length : 0;
   }

   @Override
   public Class2118[] method26094(Class1878[] var1) {
      int var4 = this.field33526.length + this.field33528.length;
      int var5 = var1.length - var4;
      int var6 = 0;

      for (int var7 = 0; var7 + this.field33527.length <= var5 && var4 + var7 + this.field33527.length <= this.field33529; var7 += this.field33527.length) {
         var6++;
      }

      ArrayList<Class2118> var9 = new ArrayList();
      var9.addAll(Arrays.asList(this.field33526));

      for (int var8 = 0; var8 < var6; var8++) {
         var9.addAll(Arrays.asList(this.field33527));
      }

      var9.addAll(Arrays.asList(this.field33528));
      return var9.toArray(new Class2118[var9.size()]);
   }

   public Class7816 method26100(Class2118... var1) {
      return new Class7816(var1, this.field33527, this.field33528);
   }

   public Class7816 method26101(Class2118... var1) {
      return new Class7816(this.field33526, var1, this.field33528);
   }

   public Class7816 method26102(Class2118... var1) {
      return new Class7816(this.field33526, this.field33527, var1);
   }

   public Class7816 method26103(int var1) {
      return new Class7816(this.field33526, this.field33527, this.field33528, var1);
   }
}

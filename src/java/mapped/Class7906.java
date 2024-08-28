package mapped;

import java.nio.IntBuffer;
import java.util.Arrays;

public class Class7906 {
   private final int field33862;
   private final String field33863;
   private final Class2140 field33864;
   private final Class7906 field33865;
   private Class7675 field33866;
   private Class8069 field33867;
   private Class7125 field33868;
   private final Boolean[] field33869 = new Boolean[8];
   private int field33870;
   private int field33871;
   private String field33872;
   private IntBuffer field33873;
   private IntBuffer field33874;
   private int field33875;
   private int field33876;
   private final boolean[] field33877 = new boolean[8];

   public Class7906(int var1, String var2, Class2140 var3, Class7906 var4) {
      this.field33862 = var1;
      this.field33863 = var2;
      this.field33864 = var3;
      this.field33865 = var4;
   }

   public Class7906(int var1, String var2, Class2140 var3, boolean var4) {
      this.field33862 = var1;
      this.field33863 = var2;
      this.field33864 = var3;
      this.field33865 = !var4 ? null : this;
   }

   public void method26477() {
      this.field33866 = null;
      this.field33867 = null;
      this.field33868 = null;
      Arrays.fill(this.field33869, null);
   }

   public void method26478() {
      this.field33870 = 0;
      this.field33871 = 0;
   }

   public void method26479() {
      this.field33872 = null;
      this.field33875 = 0;
      this.field33876 = 0;
      if (this.field33874 == null) {
         this.field33874 = Class8981.method32945(8);
      }
   }

   public void method26480(Class7906 var1) {
      this.field33870 = var1.method26485();
      this.field33866 = var1.method26492();
      this.field33867 = var1.method26493();
      this.field33868 = var1.method26494();
      System.arraycopy(var1.method26495(), 0, this.field33869, 0, this.field33869.length);
      this.field33872 = var1.method26487();
      this.field33873 = var1.method26488();
      this.field33875 = var1.method26490();
      this.field33876 = var1.method26491();
      System.arraycopy(var1.method26496(), 0, this.field33877, 0, this.field33877.length);
   }

   public int method26481() {
      return this.field33862;
   }

   public String method26482() {
      return this.field33863;
   }

   public Class2140 method26483() {
      return this.field33864;
   }

   public Class7906 method26484() {
      return this.field33865;
   }

   public int method26485() {
      return this.field33870;
   }

   public int method26486() {
      return this.field33871;
   }

   public String method26487() {
      return this.field33872;
   }

   public IntBuffer method26488() {
      return this.field33873;
   }

   public IntBuffer method26489() {
      return this.field33874;
   }

   public int method26490() {
      return this.field33875;
   }

   public int method26491() {
      return this.field33876;
   }

   public Class7675 method26492() {
      return this.field33866;
   }

   public Class8069 method26493() {
      return this.field33867;
   }

   public Class7125 method26494() {
      return this.field33868;
   }

   public Boolean[] method26495() {
      return this.field33869;
   }

   public boolean[] method26496() {
      return this.field33877;
   }

   public void method26497(int var1) {
      this.field33870 = var1;
   }

   public void method26498(int var1) {
      this.field33871 = var1;
   }

   public void method26499(String var1) {
      this.field33872 = var1;
   }

   public void method26500(IntBuffer var1) {
      this.field33873 = var1;
   }

   public void method26501(int var1) {
      this.field33875 = var1;
   }

   public void method26502(int var1) {
      this.field33876 = var1;
   }

   public void method26503(Class7675 var1) {
      this.field33866 = var1;
   }

   public void method26504(Class8069 var1) {
      this.field33867 = var1;
   }

   public void method26505(Class7125 var1) {
      this.field33868 = var1;
   }

   public String method26506() {
      if (this.field33870 == 0) {
         return "none";
      } else {
         Class7906 var3;
         for (var3 = this; var3.method26486() != this.field33870; var3 = var3.method26484()) {
            if (var3.method26484() == null || var3.method26484() == var3) {
               return "unknown";
            }
         }

         return var3.method26482();
      }
   }

   @Override
   public String toString() {
      return "name: " + this.field33863 + ", id: " + this.field33870 + ", ref: " + this.field33871 + ", real: " + this.method26506();
   }
}

package mapped;

import net.optifine.Config;
import net.optifine.shaders.Shaders;

import java.util.Arrays;
import java.util.List;

public abstract class Class6679 {
   private String field29277 = null;
   private String field29278 = null;
   private String field29279 = null;
   private String[] field29280 = null;
   private String field29281 = null;
   private String[] field29282 = null;
   private boolean field29283 = true;
   private boolean field29284 = true;
   public static final String field29285 = "§a";
   public static final String field29286 = "§c";
   public static final String field29287 = "§9";

   public Class6679(String var1, String var2, String var3, String[] var4, String var5, String var6) {
      this.field29277 = var1;
      this.field29278 = var2;
      this.field29279 = var3;
      this.field29280 = var4;
      this.field29281 = var5;
      if (var6 != null) {
         this.field29282 = new String[]{var6};
      }
   }

   public String method20366() {
      return this.field29277;
   }

   public String method20367() {
      return this.field29278;
   }

   public String method20368() {
      String var3 = Config.method26946(this.field29278);
      var3 = Class9402.method35762(var3, "//");
      return Shaders.method33144("option." + this.method20366() + ".comment", var3);
   }

   public void method20369(String var1) {
      this.field29278 = var1;
   }

   public String method20370() {
      return this.field29279;
   }

   public boolean method20371(String var1) {
      int var4 = method20376(var1, this.field29280);
      if (var4 >= 0) {
         this.field29279 = var1;
         return true;
      } else {
         return false;
      }
   }

   public String method20372() {
      return this.field29281;
   }

   public void method20373() {
      this.field29279 = this.field29281;
   }

   public void method20374() {
      int var3 = method20376(this.field29279, this.field29280);
      if (var3 >= 0) {
         var3 = (var3 + 1) % this.field29280.length;
         this.field29279 = this.field29280[var3];
      }
   }

   public void method20375() {
      int var3 = method20376(this.field29279, this.field29280);
      if (var3 >= 0) {
         var3 = (var3 - 1 + this.field29280.length) % this.field29280.length;
         this.field29279 = this.field29280[var3];
      }
   }

   private static int method20376(String var0, String[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         if (var5.equals(var0)) {
            return var4;
         }
      }

      return -1;
   }

   public String[] method20377() {
      return this.field29282;
   }

   public void method20378(String[] var1) {
      List var4 = Arrays.<String>asList(this.field29282);

      for (int var5 = 0; var5 < var1.length; var5++) {
         String var6 = var1[var5];
         if (!var4.contains(var6)) {
            this.field29282 = (String[]) Config.method26948(this.field29282, var6);
         }
      }
   }

   public boolean method20379() {
      return this.field29283;
   }

   public void method20380(boolean var1) {
      this.field29283 = var1;
   }

   public boolean method20381() {
      return !Config.equals(this.field29279, this.field29281);
   }

   public boolean method20382() {
      return this.field29284;
   }

   public void method20383(boolean var1) {
      this.field29284 = var1;
   }

   public boolean method20384(String var1) {
      return method20376(var1, this.field29280) >= 0;
   }

   public String method20385() {
      return Shaders.method33144("option." + this.field29277, this.field29277);
   }

   public String method20361(String var1) {
      return Shaders.method33144("value." + this.field29277 + "." + var1, var1);
   }

   public String method20362(String var1) {
      return "";
   }

   public boolean method20363(String var1) {
      return false;
   }

   public boolean method20386() {
      return false;
   }

   public boolean method20387(String var1) {
      return false;
   }

   public String method20360() {
      return null;
   }

   public String[] method20388() {
      return (String[])this.field29280.clone();
   }

   public float method20389() {
      if (this.field29280.length > 1) {
         int var3 = method20376(this.field29279, this.field29280);
         return var3 >= 0 ? 1.0F * (float)var3 / ((float)this.field29280.length - 1.0F) : 0.0F;
      } else {
         return 0.0F;
      }
   }

   public void method20390(float var1) {
      if (this.field29280.length > 1) {
         var1 = Config.method26832(var1, 0.0F, 1.0F);
         int var4 = Math.round(var1 * (float)(this.field29280.length - 1));
         this.field29279 = this.field29280[var4];
      }
   }

   @Override
   public String toString() {
      return "" + this.field29277 + ", value: " + this.field29279 + ", valueDefault: " + this.field29281 + ", paths: " + Config.method26854(this.field29282);
   }
}

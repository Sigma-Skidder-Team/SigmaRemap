package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_6828 extends class_7958 {
   private static final int field_35195 = 16;
   private static final int field_35215 = 16;
   private static final int field_35207 = 16;
   private static final int field_35212 = 4;
   private static final int field_35213 = 8;
   private static final int field_35218 = 16;
   private class_8296 field_35199;
   private class_8965 field_35200;
   private int field_35201;
   private int field_35194;
   private int field_35211;
   private int field_35198;
   private int field_35191;
   private int field_35202;
   private boolean field_35210;
   private boolean field_35209;
   private boolean field_35192;
   private int field_35197;
   private int field_35214;
   private int field_35204;
   private boolean field_35193;
   private final class_6797[] field_35208 = new class_6797[16];
   private final class_6797[] field_35217 = new class_6797[16];
   private final class_6797[] field_35206 = new class_6797[16];
   private final int[] field_35203 = new int[4];
   private final int[] field_35190 = new int[8];
   private final class_4541[] field_35196 = new class_4541[16];
   private byte[] field_35216;

   public class_6828() {
      this.field_35200 = class_8965.field_45918;
   }

   public void method_31315(class_7390 var1) throws AACException {
      this.method_36003(var1);
      this.field_35199 = class_8296.method_38275(var1.method_33662(2));
      this.field_35200 = class_8965.method_41128(var1.method_33662(4));
      this.field_35201 = var1.method_33662(4);
      this.field_35194 = var1.method_33662(4);
      this.field_35211 = var1.method_33662(4);
      this.field_35198 = var1.method_33662(2);
      this.field_35191 = var1.method_33662(3);
      this.field_35202 = var1.method_33662(4);
      if (this.field_35210 = var1.method_33660()) {
         class_3471.field_17021.warning("mono mixdown present, but not yet supported");
         this.field_35197 = var1.method_33662(4);
      }

      if (this.field_35209 = var1.method_33660()) {
         class_3471.field_17021.warning("stereo mixdown present, but not yet supported");
         this.field_35214 = var1.method_33662(4);
      }

      if (this.field_35192 = var1.method_33660()) {
         class_3471.field_17021.warning("matrix mixdown present, but not yet supported");
         this.field_35204 = var1.method_33662(2);
         this.field_35193 = var1.method_33660();
      }

      this.method_31319(this.field_35208, var1, this.field_35201);
      this.method_31319(this.field_35217, var1, this.field_35194);
      this.method_31319(this.field_35206, var1, this.field_35211);

      for (int var4 = 0; var4 < this.field_35198; var4++) {
         this.field_35203[var4] = var1.method_33662(4);
      }

      for (int var6 = 0; var6 < this.field_35191; var6++) {
         this.field_35190[var6] = var1.method_33662(4);
      }

      for (int var7 = 0; var7 < this.field_35202; var7++) {
         this.field_35196[var7] = new class_4541(var1.method_33660(), var1.method_33662(4));
      }

      var1.method_33653();
      int var5 = var1.method_33662(8);
      this.field_35216 = new byte[var5];

      for (int var8 = 0; var8 < var5; var8++) {
         this.field_35216[var8] = (byte)var1.method_33662(8);
      }
   }

   private void method_31319(class_6797[] var1, class_7390 var2, int var3) throws AACException {
      for (int var6 = 0; var6 < var3; var6++) {
         var1[var6] = new class_6797(var2.method_33660(), var2.method_33662(4));
      }
   }

   public class_8296 method_31318() {
      return this.field_35199;
   }

   public class_8965 method_31316() {
      return this.field_35200;
   }

   public int method_31317() {
      return this.field_35201 + this.field_35194 + this.field_35211 + this.field_35198 + this.field_35191;
   }
}

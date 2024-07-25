package remapped;

public class class_5778 implements AutoCloseable {
   private final class_7884 field_29181;
   private final class_5797 field_29188;
   private final Identifier field_29192;
   private boolean field_29190;
   private float field_29182;
   private final GameRenderer field_29185;
   private final MinecraftClient field_29184;
   private boolean field_29191 = true;
   private boolean field_29183 = false;
   private class_2426 field_29189 = new class_2426();
   public static final int field_29187 = method_26127(15, 15);

   public class_5778(GameRenderer var1, MinecraftClient var2) {
      this.field_29185 = var1;
      this.field_29184 = var2;
      this.field_29181 = new class_7884(16, 16, false);
      this.field_29192 = this.field_29184.method_8577().method_35684("light_map", this.field_29181);
      this.field_29188 = this.field_29181.method_35651();

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            this.field_29188.method_26242(var6, var5, -1);
         }
      }

      this.field_29181.method_35650();
   }

   @Override
   public void close() {
      this.field_29181.close();
   }

   public void method_26130() {
      this.field_29182 = (float)((double)this.field_29182 + (Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
      this.field_29182 = (float)((double)this.field_29182 * 0.9);
      this.field_29190 = true;
   }

   public void method_26122() {
      class_3542.method_16492(33986);
      class_3542.method_16354();
      class_3542.method_16492(33984);
      if (class_3111.method_14424()) {
         class_6588.method_30325();
      }
   }

   public void method_26126() {
      if (this.field_29191) {
         class_3542.method_16492(33986);
         class_3542.method_16463(5890);
         class_3542.method_16476();
         float var3 = 0.00390625F;
         class_3542.method_16403(0.00390625F, 0.00390625F, 0.00390625F);
         class_3542.method_16413(8.0F, 8.0F, 8.0F);
         class_3542.method_16463(5888);
         this.field_29184.method_8577().method_35674(this.field_29192);
         class_3542.method_16490(3553, 10241, 9729);
         class_3542.method_16490(3553, 10240, 9729);
         class_3542.method_16490(3553, 10242, 33071);
         class_3542.method_16490(3553, 10243, 33071);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_3542.method_16432();
         class_3542.method_16492(33984);
         if (class_3111.method_14424()) {
            class_6588.method_30292();
         }
      }
   }

   public void method_26128(float var1) {
      if (this.field_29190) {
         this.field_29190 = false;
         this.field_29184.method_8562().method_16056("lightTex");
         class_174 var4 = this.field_29184.field_9601;
         if (var4 != null) {
            this.field_29183 = false;
            if (class_3111.method_14438()) {
               boolean var5 = this.field_29184.field_9632.method_26480(Effects.field_19746)
                  || this.field_29184.field_9632.method_26480(Effects.field_19744);
               if (class_9300.method_42873(var4, this.field_29182, this.field_29188, var5, var1)) {
                  this.field_29181.method_35650();
                  this.field_29190 = false;
                  this.field_29184.method_8562().method_16054();
                  this.field_29183 = true;
                  return;
               }
            }

            float var24 = var4.method_731(1.0F);
            float var6;
            if (var4.method_744() <= 0) {
               var6 = var24 * 0.95F + 0.05F;
            } else {
               var6 = 1.0F;
            }

            float var7 = this.field_29184.field_9632.method_27328();
            float var8;
            if (!this.field_29184.field_9632.method_26480(Effects.field_19746)) {
               if (var7 > 0.0F && this.field_29184.field_9632.method_26480(Effects.field_19744)) {
                  var8 = var7;
               } else {
                  var8 = 0.0F;
               }
            } else {
               var8 = GameRenderer.method_35954(this.field_29184.field_9632, var1);
            }

            class_2426 var9 = new class_2426(var24, var24, 1.0F);
            var9.method_11063(new class_2426(1.0F, 1.0F, 1.0F), 0.35F);
            float var10 = this.field_29182 + 1.5F;
            class_2426 var11 = new class_2426();

            for (int var12 = 0; var12 < 16; var12++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  float var14 = this.method_26132(var4, var12) * var6;
                  float var15 = this.method_26132(var4, var13) * var10;
                  float var16 = var15 * ((var15 * 0.6F + 0.4F) * 0.6F + 0.4F);
                  float var17 = var15 * (var15 * var15 * 0.6F + 0.4F);
                  var11.method_11065(var15, var16, var17);
                  if (!var4.method_738().method_34251()) {
                     class_2426 var18 = this.method_26124(var9);
                     var18.method_11068(var14);
                     var11.method_11072(var18);
                     var11.method_11063(this.method_26123(0.75F, 0.75F, 0.75F), 0.04F);
                     if (this.field_29185.method_35956(var1) > 0.0F) {
                        float var19 = this.field_29185.method_35956(var1);
                        class_2426 var20 = this.method_26124(var11);
                        var20.method_11069(0.7F, 0.6F, 0.6F);
                        var11.method_11063(var20, var19);
                     }
                  } else {
                     var11.method_11063(this.method_26123(0.99F, 1.12F, 1.0F), 0.25F);
                  }

                  var11.method_11073(0.0F, 1.0F);
                  if (var8 > 0.0F) {
                     float var25 = Math.max(var11.method_11057(), Math.max(var11.method_11061(), var11.method_11055()));
                     if (var25 < 1.0F) {
                        float var27 = 1.0F / var25;
                        class_2426 var29 = this.method_26124(var11);
                        var29.method_11068(var27);
                        var11.method_11063(var29, var8);
                     }
                  }

                  float var26 = (float)this.field_29184.gameOptions.field_45391;
                  class_2426 var28 = this.method_26124(var11);
                  var28.method_11056(this::method_26129);
                  var11.method_11063(var28, var26);
                  var11.method_11063(this.method_26123(0.75F, 0.75F, 0.75F), 0.04F);
                  var11.method_11073(0.0F, 1.0F);
                  var11.method_11068(255.0F);
                  short var30 = 255;
                  int var21 = (int)var11.method_11057();
                  int var22 = (int)var11.method_11061();
                  int var23 = (int)var11.method_11055();
                  this.field_29188.method_26242(var13, var12, 0xFF000000 | var23 << 16 | var22 << 8 | var21);
               }
            }

            this.field_29181.method_35650();
            this.field_29184.method_8562().method_16054();
         }
      }
   }

   private float method_26129(float var1) {
      float var4 = 1.0F - var1;
      return 1.0F - var4 * var4 * var4 * var4;
   }

   private float method_26132(World var1, int var2) {
      return var1.method_22572().method_40221(var2);
   }

   public static int method_26127(int var0, int var1) {
      return var0 << 4 | var1 << 20;
   }

   public static int method_26134(int var0) {
      return (var0 & 65535) >> 4;
   }

   public static int method_26131(int var0) {
      return var0 >> 20 & 65535;
   }

   private class_2426 method_26123(float var1, float var2, float var3) {
      this.field_29189.method_11065(var1, var2, var3);
      return this.field_29189;
   }

   private class_2426 method_26124(class_2426 var1) {
      this.field_29189.method_11065(var1.method_11057(), var1.method_11061(), var1.method_11055());
      return this.field_29189;
   }

   public boolean method_26133() {
      return this.field_29191;
   }

   public void method_26125(boolean var1) {
      this.field_29191 = var1;
   }

   public boolean method_26135() {
      return this.field_29183;
   }
}

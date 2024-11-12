package mapped;

import org.newdawn.slick.Color;

import java.util.ArrayList;

public class Class7462 {
   private static String[] field32086;
   private String field32087;
   private ArrayList field32088 = new ArrayList();
   private float field32089;
   private float field32090;
   private float field32091;
   private float field32092;
   private float field32093;
   private Image field32094;
   private boolean field32095;
   private Class8412 field32096;
   private String field32097;

   public Class7462(String var1, boolean var2) {
      this.field32087 = var1;
      this.field32095 = var2;
   }

   public boolean method24133() {
      return this.field32095;
   }

   public void method24134(Class8412 var1) {
      this.field32096 = var1;
   }

   public Class8412 method24135() {
      return this.field32096;
   }

   public void method24136(String var1) {
      this.field32097 = var1;
   }

   public void method24137(Class7710 var1) {
      if (this.field32097 != null) {
         Class7462 var4 = var1.method25473(this.field32097);

         for (int var5 = 0; var5 < var4.field32088.size(); var5++) {
            this.field32088.add(var4.field32088.get(var5));
         }
      }
   }

   public void method24138() {
      if (this.field32094 == null) {
         ImageBuffer var3 = new ImageBuffer(128, 16);

         for (int var4 = 0; var4 < 128; var4++) {
            Color var5 = this.method24151((float)var4 / 128.0F);

            for (int var6 = 0; var6 < 16; var6++) {
               var3.method21462(var4, var6, var5.getRedByte(), var5.getGreenByte(), var5.getBlueByte(), var5.getAlphaByte());
            }
         }

         this.field32094 = var3.method21463();
      }
   }

   public Image method24139() {
      this.method24138();
      return this.field32094;
   }

   public void method24140(float var1) {
      this.field32093 = var1;
   }

   public void method24141(float var1) {
      this.field32089 = var1;
   }

   public void method24142(float var1) {
      this.field32090 = var1;
   }

   public void method24143(float var1) {
      this.field32091 = var1;
   }

   public void method24144(float var1) {
      this.field32092 = var1;
   }

   public float method24145() {
      return this.field32093;
   }

   public float method24146() {
      return this.field32089;
   }

   public float method24147() {
      return this.field32090;
   }

   public float method24148() {
      return this.field32091;
   }

   public float method24149() {
      return this.field32092;
   }

   public void method24150(float var1, Color var2) {
      this.field32088.add(new Class8436(this, var1, var2));
   }

   public Color method24151(float var1) {
      if (var1 <= 0.0F) {
         return ((Class8436)this.field32088.get(0)).field36148;
      } else if (var1 > 1.0F) {
         return ((Class8436)this.field32088.get(this.field32088.size() - 1)).field36148;
      } else {
         for (int var4 = 1; var4 < this.field32088.size(); var4++) {
            Class8436 var5 = (Class8436)this.field32088.get(var4 - 1);
            Class8436 var6 = (Class8436)this.field32088.get(var4);
            if (var1 <= var6.field36147) {
               float var7 = var6.field36147 - var5.field36147;
               var1 -= var5.field36147;
               float var8 = var1 / var7;
               Color var9 = new Color(1, 1, 1, 1);
               var9.a = var5.field36148.a * (1.0F - var8) + var6.field36148.a * var8;
               var9.r = var5.field36148.r * (1.0F - var8) + var6.field36148.r * var8;
               var9.g = var5.field36148.g * (1.0F - var8) + var6.field36148.g * var8;
               var9.b = var5.field36148.b * (1.0F - var8) + var6.field36148.b * var8;
               return var9;
            }
         }

         return Color.black;
      }
   }
}

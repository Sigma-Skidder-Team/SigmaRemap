package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class7219 {
   public float field31028 = 64.0F;
   public float field31029 = 32.0F;
   private int field31030;
   private int field31031;
   public float field31032;
   public float field31033;
   public float field31034;
   public float field31035;
   public float field31036;
   public float field31037;
   public boolean field31038;
   public boolean field31039 = true;
   public final ObjectList<Class9661> field31040 = new ObjectArrayList();
   public final ObjectList<Class7219> field31041 = new ObjectArrayList();
   public List field31042 = new ArrayList();
   public boolean field31043 = false;
   public float field31044 = 1.0F;
   public float field31045 = 1.0F;
   public float field31046 = 1.0F;
   private ResourceLocation field31047 = null;
   private String field31048 = null;
   private Class8486 field31049;
   private WorldRenderer field31050 = Config.method26874();

   public Class7219(Class2828 var1) {
      var1.accept(this);
      this.method22684(var1.field17604, var1.field17605);
   }

   public Class7219(Class2828 var1, int var2, int var3) {
      this(var1.field17604, var1.field17605, var2, var3);
      var1.accept(this);
   }

   public Class7219(int var1, int var2, int var3, int var4) {
      this.method22684(var1, var2);
      this.method22671(var3, var4);
   }

   private Class7219() {
   }

   public Class7219 method22668() {
      Class7219 var3 = new Class7219();
      var3.method22669(this);
      return var3;
   }

   public void method22669(Class7219 var1) {
      this.field31035 = var1.field31035;
      this.field31036 = var1.field31036;
      this.field31037 = var1.field31037;
      this.field31032 = var1.field31032;
      this.field31033 = var1.field31033;
      this.field31034 = var1.field31034;
   }

   public void method22670(Class7219 var1) {
      this.field31041.add(var1);
   }

   public Class7219 method22671(int var1, int var2) {
      this.field31030 = var1;
      this.field31031 = var2;
      return this;
   }

   public Class7219 method22672(String var1, float var2, float var3, float var4, int var5, int var6, int var7, float var8, int var9, int var10) {
      this.method22671(var9, var10);
      this.method22678(this.field31030, this.field31031, var2, var3, var4, (float)var5, (float)var6, (float)var7, var8, var8, var8, this.field31038, false);
      return this;
   }

   public Class7219 method22673(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method22678(this.field31030, this.field31031, var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, this.field31038, false);
      return this;
   }

   public Class7219 method22674(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      this.method22678(this.field31030, this.field31031, var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7, false);
      return this;
   }

   public void method22675(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method22678(this.field31030, this.field31031, var1, var2, var3, var4, var5, var6, var7, var7, var7, this.field31038, false);
   }

   public void method22676(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.method22678(this.field31030, this.field31031, var1, var2, var3, var4, var5, var6, var7, var8, var9, this.field31038, false);
   }

   public void method22677(float var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8) {
      this.method22678(this.field31030, this.field31031, var1, var2, var3, var4, var5, var6, var7, var7, var7, var8, false);
   }

   private void method22678(
      int var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13
   ) {
      this.field31040.add(new Class9661(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, this.field31028, this.field31029));
   }

   public void method22679(float var1, float var2, float var3) {
      this.field31032 = var1;
      this.field31033 = var2;
      this.field31034 = var3;
   }

   public void method22680(MatrixStack var1, Class5422 var2, int var3, int var4) {
      this.method22681(var1, var2, var3, var4, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void method22681(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (this.field31039 && (!this.field31040.isEmpty() || !this.field31041.isEmpty() || !this.field31042.isEmpty())) {
         RenderType var11 = null;
         Class7735 var12 = null;
         if (this.field31047 != null) {
            if (this.field31050.field1020) {
               return;
            }

            var12 = var2.method17049();
            if (var12 != null) {
               var11 = var12.method25605();
               var2 = var12.method25604(this.field31047, var2);
            }
         }

         if (this.field31049 != null) {
            this.field31049.method30009();
         }

         var1.push();
         this.method22682(var1);
         this.method22683(var1.getLast(), var2, var3, var4, var5, var6, var7, var8);
         int var13 = this.field31041.size();

         for (int var14 = 0; var14 < var13; var14++) {
            Class7219 var15 = (Class7219)this.field31041.get(var14);
            var15.method22681(var1, var2, var3, var4, var5, var6, var7, var8);
         }

         int var17 = this.field31042.size();

         for (int var18 = 0; var18 < var17; var18++) {
            Class8515 var16 = (Class8515)this.field31042.get(var18);
            var16.method30159(var1, var2, var3, var4, var5, var6, var7, var8);
         }

         var1.pop();
         if (var11 != null) {
            var12.method25597(var11);
         }
      }
   }

   public void method22682(MatrixStack var1) {
      var1.translate((double)(this.field31032 / 16.0F), (double)(this.field31033 / 16.0F), (double)(this.field31034 / 16.0F));
      if (this.field31037 != 0.0F) {
         var1.rotate(Vector3f.ZP.method25285(this.field31037));
      }

      if (this.field31036 != 0.0F) {
         var1.rotate(Vector3f.YP.method25285(this.field31036));
      }

      if (this.field31035 != 0.0F) {
         var1.rotate(Vector3f.XP.method25285(this.field31035));
      }
   }

   private void method22683(Class8892 var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      Matrix4f var11 = var1.getMatrix();
      Class8967 var12 = var1.method32362();
      int var13 = this.field31040.size();

      for (int var14 = 0; var14 < var13; var14++) {
         Class9661 var15 = (Class9661)this.field31040.get(var14);
         int var16 = Class9661.method37713(var15).length;

         for (int var17 = 0; var17 < var16; var17++) {
            Class7394 var18 = Class9661.method37713(var15)[var17];
            if (var18 != null) {
               Vector3f var19 = var2.method17045(var18.field31655);
               var19.method25282(var12);
               float var20 = var19.method25269();
               float var21 = var19.method25270();
               float var22 = var19.method25271();

               for (int var23 = 0; var23 < 4; var23++) {
                  Class8161 var24 = var18.field31654[var23];
                  float var25 = var24.field35118.method25269() / 16.0F;
                  float var26 = var24.field35118.method25270() / 16.0F;
                  float var27 = var24.field35118.method25271() / 16.0F;
                  float var28 = var11.method35517(var25, var26, var27, 1.0F);
                  float var29 = var11.method35518(var25, var26, var27, 1.0F);
                  float var30 = var11.method35519(var25, var26, var27, 1.0F);
                  var2.method17032(var28, var29, var30, var5, var6, var7, var8, var24.field35119, var24.field35120, var4, var3, var20, var21, var22);
               }
            }
         }
      }
   }

   public Class7219 method22684(int var1, int var2) {
      this.field31028 = (float)var1;
      this.field31029 = (float)var2;
      return this;
   }

   public Class9661 method22685(Random var1) {
      return (Class9661)this.field31040.get(var1.nextInt(this.field31040.size()));
   }

   public void method22686(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.field31042.add(new Class8515(this, this.field31030, this.field31031, var1, var2, var3, var4, var5, var6, var7));
   }

   public ResourceLocation method22687() {
      return this.field31047;
   }

   public void method22688(ResourceLocation var1) {
      this.field31047 = var1;
   }

   public String method22689() {
      return this.field31048;
   }

   public void method22690(String var1) {
      this.field31048 = var1;
   }

   public void method22691(int[][] var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.field31040.add(new Class9661(var1, var2, var3, var4, var5, var6, var7, var8, var8, var8, this.field31038, this.field31028, this.field31029));
   }

   public Class7219 method22692(int var1) {
      if (this.field31041 == null) {
         return null;
      } else {
         return var1 >= 0 && var1 < this.field31041.size() ? (Class7219)this.field31041.get(var1) : null;
      }
   }

   public Class7219 method22693(String var1) {
      if (var1 == null) {
         return null;
      } else {
         if (this.field31041 != null) {
            for (int var4 = 0; var4 < this.field31041.size(); var4++) {
               Class7219 var5 = (Class7219)this.field31041.get(var4);
               if (var1.equals(var5.method22689())) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public Class7219 method22694(String var1) {
      if (var1 != null) {
         Class7219 var4 = this.method22693(var1);
         if (var4 != null) {
            return var4;
         } else {
            if (this.field31041 != null) {
               for (int var5 = 0; var5 < this.field31041.size(); var5++) {
                  Class7219 var6 = (Class7219)this.field31041.get(var5);
                  Class7219 var7 = var6.method22694(var1);
                  if (var7 != null) {
                     return var7;
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public void method22695(Class8486 var1) {
      this.field31049 = var1;
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer();
      var3.append(
         "id: "
            + this.field31048
            + ", boxes: "
            + (this.field31040 == null ? null : this.field31040.size())
            + ", submodels: "
            + (this.field31041 == null ? null : this.field31041.size())
      );
      return var3.toString();
   }
}

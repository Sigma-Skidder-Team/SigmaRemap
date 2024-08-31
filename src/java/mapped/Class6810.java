package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

import java.util.Properties;

public class Class6810 {
   private String field29641 = null;
   private ResourceLocation field29642 = null;
   private int field29643;
   private int[] field29644 = null;
   private ResourceLocation[] field29645 = null;
   private int[] field29646 = null;
   private Class8507[] field29647 = null;
   private Class9532 field29648 = null;
   private Class9532 field29649 = null;
   private boolean field29650 = false;
   private Class7305 field29651 = null;
   public int[] field29652 = null;
   public int field29653 = 1;
   private Class9710[] field29654 = null;
   private Class112[] field29655 = null;
   private Boolean field29656 = null;
   private Class9532 field29657 = null;
   private Class9532 field29658 = null;
   private Class1989[] field29659 = null;

   public Class6810(Properties var1, String var2, ResourceLocation var3, int var4, String var5, Class8896 var6) {
      this.field29641 = var2;
      this.field29642 = var3;
      this.field29643 = var4;
      this.field29644 = var6.method32399(var5);
      this.field29646 = var6.method32399(var1.getProperty("weights." + var4));
      this.field29647 = var6.method32396(var1.getProperty("biomes." + var4));
      this.field29648 = var6.method32404(var1.getProperty("heights." + var4));
      if (this.field29648 == null) {
         this.field29648 = this.method20748(var1, var4);
      }

      String var9 = var1.getProperty("health." + var4);
      if (var9 != null) {
         this.field29650 = var9.contains("%");
         var9 = var9.replace("%", "");
         this.field29649 = var6.method32404(var9);
      }

      this.field29651 = var6.method32417("name", var1.getProperty("name." + var4));
      this.field29654 = var6.method32418(var1.getProperty("professions." + var4));
      this.field29655 = var6.method32415(var1.getProperty("collarColors." + var4), "collar color", Class8896.field40260);
      this.field29656 = var6.method32407(var1.getProperty("baby." + var4));
      this.field29657 = var6.method32404(var1.getProperty("moonPhase." + var4));
      this.field29658 = var6.method32404(var1.getProperty("dayTime." + var4));
      this.field29659 = var6.method32416(var1.getProperty("weather." + var4), "weather." + var4, (Class1989[])null);
   }

   private Class9532 method20748(Properties var1, int var2) {
      String var5 = var1.getProperty("minHeight." + var2);
      String var6 = var1.getProperty("maxHeight." + var2);
      if (var5 == null && var6 == null) {
         return null;
      } else {
         int var7 = 0;
         if (var5 != null) {
            var7 = Class7944.method26899(var5, -1);
            if (var7 < 0) {
               Class7944.method26811("Invalid minHeight: " + var5);
               return null;
            }
         }

         int var8 = 256;
         if (var6 != null) {
            var8 = Class7944.method26899(var6, -1);
            if (var8 < 0) {
               Class7944.method26811("Invalid maxHeight: " + var6);
               return null;
            }
         }

         if (var8 >= 0) {
            Class9532 var9 = new Class9532();
            var9.method36837(new Class7589(var7, var8));
            return var9;
         } else {
            Class7944.method26811("Invalid minHeight, maxHeight: " + var5 + ", " + var6);
            return null;
         }
      }
   }

   public boolean method20749(String var1) {
      if (this.field29644 == null || this.field29644.length == 0) {
         Class7944.method26811("Invalid skins for rule: " + this.field29643);
         return false;
      } else if (this.field29645 != null) {
         return true;
      } else {
         this.field29645 = new ResourceLocation[this.field29644.length];
         boolean var4 = this.field29641.startsWith("optifine/mob/");
         ResourceLocation var5 = Class9387.method35639(this.field29642, var4);
         if (var5 == null) {
            Class7944.method26811("Invalid path: " + this.field29642.getPath());
            return false;
         } else {
            for (int var6 = 0; var6 < this.field29645.length; var6++) {
               int var7 = this.field29644[var6];
               if (var7 > 1) {
                  ResourceLocation var8 = Class9387.method35641(var5, var7);
                  if (var8 == null) {
                     Class7944.method26811("Invalid path: " + this.field29642.getPath());
                     return false;
                  }

                  if (!Class7944.method26866(var8)) {
                     Class7944.method26811("Texture not found: " + var8.getPath());
                     return false;
                  }

                  this.field29645[var6] = var8;
               } else {
                  this.field29645[var6] = this.field29642;
               }
            }

            if (this.field29646 != null) {
               if (this.field29646.length > this.field29645.length) {
                  Class7944.method26811("More weights defined than skins, trimming weights: " + var1);
                  int[] var9 = new int[this.field29645.length];
                  System.arraycopy(this.field29646, 0, var9, 0, var9.length);
                  this.field29646 = var9;
               }

               if (this.field29646.length < this.field29645.length) {
                  Class7944.method26811("Less weights defined than skins, expanding weights: " + var1);
                  int[] var10 = new int[this.field29645.length];
                  System.arraycopy(this.field29646, 0, var10, 0, this.field29646.length);
                  int var12 = Class7317.method23167(this.field29646);

                  for (int var14 = this.field29646.length; var14 < var10.length; var14++) {
                     var10[var14] = var12;
                  }

                  this.field29646 = var10;
               }

               this.field29652 = new int[this.field29646.length];
               int var11 = 0;

               for (int var13 = 0; var13 < this.field29646.length; var13++) {
                  if (this.field29646[var13] < 0) {
                     Class7944.method26811("Invalid weight: " + this.field29646[var13]);
                     return false;
                  }

                  var11 += this.field29646[var13];
                  this.field29652[var13] = var11;
               }

               this.field29653 = var11;
               if (this.field29653 <= 0) {
                  Class7944.method26811("Invalid sum of all weights: " + var11);
                  this.field29653 = 1;
               }
            }

            if (this.field29654 == Class8896.field40259) {
               Class7944.method26811("Invalid professions or careers: " + var1);
               return false;
            } else if (this.field29655 != Class8896.field40260) {
               return true;
            } else {
               Class7944.method26811("Invalid collar colors: " + var1);
               return false;
            }
         }
      }
   }

   public boolean method20750(Class7458 var1) {
      if (this.field29647 != null && !Class7542.method24662(var1.method24125(), this.field29647)) {
         return false;
      } else {
         if (this.field29648 != null) {
            BlockPos var4 = var1.method24124();
            if (var4 != null && !this.field29648.method36838(var4.getY())) {
               return false;
            }
         }

         if (this.field29649 != null) {
            int var10 = var1.method24127();
            if (this.field29650) {
               int var5 = var1.method24128();
               if (var5 > 0) {
                  var10 = (int)((double)(var10 * 100) / (double)var5);
               }
            }

            if (!this.field29649.method36838(var10)) {
               return false;
            }
         }

         if (this.field29651 != null) {
            String var11 = var1.method24126();
            if (!this.field29651.method23084(var11)) {
               return false;
            }
         }

         if (this.field29654 != null && var1 instanceof Class7460) {
            Class7460 var12 = (Class7460)var1;
            Entity var18 = var12.method24131();
            if (var18 instanceof Class1042) {
               Class1042 var6 = (Class1042)var18;
               Class7921 var7 = var6.method4674();
               Class8395 var8 = var7.method26571();
               int var9 = var7.method26572();
               if (!Class9710.method38046(var8, var9, this.field29654)) {
                  return false;
               }
            }
         }

         if (this.field29655 != null && var1 instanceof Class7460) {
            Class7460 var13 = (Class7460)var1;
            Entity var19 = var13.method24131();
            if (var19 instanceof Class1012) {
               Class1012 var24 = (Class1012)var19;
               if (!var24.method4393()) {
                  return false;
               }

               Class112 var27 = var24.method4382();
               if (!Class7944.method26943(var27, this.field29655)) {
                  return false;
               }
            }

            if (var19 instanceof Class1098) {
               Class1098 var25 = (Class1098)var19;
               if (!var25.method4393()) {
                  return false;
               }

               Class112 var28 = var25.method5256();
               if (!Class7944.method26943(var28, this.field29655)) {
                  return false;
               }
            }
         }

         if (this.field29656 != null && var1 instanceof Class7460) {
            Class7460 var14 = (Class7460)var1;
            Entity var20 = var14.method24131();
            if (var20 instanceof LivingEntity) {
               LivingEntity var26 = (LivingEntity)var20;
               if (var26.method3005() != this.field29656) {
                  return false;
               }
            }
         }

         if (this.field29657 != null) {
            ClientWorld var15 = Class7944.method26860().world;
            if (var15 != null) {
               int var21 = var15.method7002();
               if (!this.field29657.method36838(var21)) {
                  return false;
               }
            }
         }

         if (this.field29658 != null) {
            ClientWorld var16 = Class7944.method26860().world;
            if (var16 != null) {
               int var22 = (int)var16.method6784();
               if (!this.field29658.method36838(var22)) {
                  return false;
               }
            }
         }

         if (this.field29659 != null) {
            ClientWorld var17 = Class7944.method26860().world;
            if (var17 != null) {
               Class1989 var23 = Class1989.method8276(var17, 0.0F);
               if (!Class8720.method31458(this.field29659, var23)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public ResourceLocation method20751(ResourceLocation var1, int var2) {
      if (this.field29645 != null && this.field29645.length != 0) {
         int var5 = 0;
         if (this.field29646 != null) {
            int var6 = var2 % this.field29653;

            for (int var7 = 0; var7 < this.field29652.length; var7++) {
               if (this.field29652[var7] > var6) {
                  var5 = var7;
                  break;
               }
            }
         } else {
            var5 = var2 % this.field29645.length;
         }

         return this.field29645[var5];
      } else {
         return var1;
      }
   }
}

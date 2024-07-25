package remapped;

import java.util.Properties;

public class class_974 {
   private String field_4992 = null;
   private Identifier field_4986 = null;
   private int field_4979;
   private int[] field_4982 = null;
   private Identifier[] field_4994 = null;
   private int[] field_4976 = null;
   private class_4859[] field_4989 = null;
   private class_8750 field_4988 = null;
   private class_8750 field_4980 = null;
   private boolean field_4995 = false;
   private class_1719 field_4983 = null;
   public int[] field_4985 = null;
   public int field_4991 = 1;
   private class_9438[] field_4977 = null;
   private class_9077[] field_4990 = null;
   private Boolean field_4981 = null;
   private class_8750 field_4978 = null;
   private class_8750 field_4987 = null;
   private class_9614[] field_4984 = null;

   public class_974(Properties var1, String var2, Identifier var3, int var4, String var5, class_6284 var6) {
      this.field_4992 = var2;
      this.field_4986 = var3;
      this.field_4979 = var4;
      this.field_4982 = var6.method_28667(var5);
      this.field_4976 = var6.method_28667(var1.getProperty("weights." + var4));
      this.field_4989 = var6.method_28644(var1.getProperty("biomes." + var4));
      this.field_4988 = var6.method_28653(var1.getProperty("heights." + var4));
      if (this.field_4988 == null) {
         this.field_4988 = this.method_4260(var1, var4);
      }

      String var9 = var1.getProperty("health." + var4);
      if (var9 != null) {
         this.field_4995 = var9.contains("%");
         var9 = var9.replace("%", "");
         this.field_4980 = var6.method_28653(var9);
      }

      this.field_4983 = var6.method_28665("name", var1.getProperty("name." + var4));
      this.field_4977 = var6.method_28662(var1.getProperty("professions." + var4));
      this.field_4990 = var6.method_28646(var1.getProperty("collarColors." + var4), "collar color", class_6284.field_32118);
      this.field_4981 = var6.method_28666(var1.getProperty("baby." + var4));
      this.field_4978 = var6.method_28653(var1.getProperty("moonPhase." + var4));
      this.field_4987 = var6.method_28653(var1.getProperty("dayTime." + var4));
      this.field_4984 = var6.method_28674(var1.getProperty("weather." + var4), "weather." + var4, (class_9614[])null);
   }

   private class_8750 method_4260(Properties var1, int var2) {
      String var5 = var1.getProperty("minHeight." + var2);
      String var6 = var1.getProperty("maxHeight." + var2);
      if (var5 == null && var6 == null) {
         return null;
      } else {
         int var7 = 0;
         if (var5 != null) {
            var7 = class_3111.method_14361(var5, -1);
            if (var7 < 0) {
               class_3111.method_14317("Invalid minHeight: " + var5);
               return null;
            }
         }

         int var8 = 256;
         if (var6 != null) {
            var8 = class_3111.method_14361(var6, -1);
            if (var8 < 0) {
               class_3111.method_14317("Invalid maxHeight: " + var6);
               return null;
            }
         }

         if (var8 >= 0) {
            class_8750 var9 = new class_8750();
            var9.method_40162(new class_2279(var7, var8));
            return var9;
         } else {
            class_3111.method_14317("Invalid minHeight, maxHeight: " + var5 + ", " + var6);
            return null;
         }
      }
   }

   public boolean method_4264(String var1) {
      if (this.field_4982 == null || this.field_4982.length == 0) {
         class_3111.method_14317("Invalid skins for rule: " + this.field_4979);
         return false;
      } else if (this.field_4994 != null) {
         return true;
      } else {
         this.field_4994 = new Identifier[this.field_4982.length];
         boolean var4 = this.field_4992.startsWith("optifine/mob/");
         Identifier var5 = class_8192.method_37527(this.field_4986, var4);
         if (var5 == null) {
            class_3111.method_14317("Invalid path: " + this.field_4986.method_21456());
            return false;
         } else {
            for (int var6 = 0; var6 < this.field_4994.length; var6++) {
               int var7 = this.field_4982[var6];
               if (var7 > 1) {
                  Identifier var8 = class_8192.method_37539(var5, var7);
                  if (var8 == null) {
                     class_3111.method_14317("Invalid path: " + this.field_4986.method_21456());
                     return false;
                  }

                  if (!class_3111.method_14362(var8)) {
                     class_3111.method_14317("Texture not found: " + var8.method_21456());
                     return false;
                  }

                  this.field_4994[var6] = var8;
               } else {
                  this.field_4994[var6] = this.field_4986;
               }
            }

            if (this.field_4976 != null) {
               if (this.field_4976.length > this.field_4994.length) {
                  class_3111.method_14317("More weights defined than skins, trimming weights: " + var1);
                  int[] var9 = new int[this.field_4994.length];
                  System.arraycopy(this.field_4976, 0, var9, 0, var9.length);
                  this.field_4976 = var9;
               }

               if (this.field_4976.length < this.field_4994.length) {
                  class_3111.method_14317("Less weights defined than skins, expanding weights: " + var1);
                  int[] var10 = new int[this.field_4994.length];
                  System.arraycopy(this.field_4976, 0, var10, 0, this.field_4976.length);
                  int var12 = class_1750.method_7797(this.field_4976);

                  for (int var14 = this.field_4976.length; var14 < var10.length; var14++) {
                     var10[var14] = var12;
                  }

                  this.field_4976 = var10;
               }

               this.field_4985 = new int[this.field_4976.length];
               int var11 = 0;

               for (int var13 = 0; var13 < this.field_4976.length; var13++) {
                  if (this.field_4976[var13] < 0) {
                     class_3111.method_14317("Invalid weight: " + this.field_4976[var13]);
                     return false;
                  }

                  var11 += this.field_4976[var13];
                  this.field_4985[var13] = var11;
               }

               this.field_4991 = var11;
               if (this.field_4991 <= 0) {
                  class_3111.method_14317("Invalid sum of all weights: " + var11);
                  this.field_4991 = 1;
               }
            }

            if (this.field_4977 == class_6284.field_32117) {
               class_3111.method_14317("Invalid professions or careers: " + var1);
               return false;
            } else if (this.field_4990 != class_6284.field_32118) {
               return true;
            } else {
               class_3111.method_14317("Invalid collar colors: " + var1);
               return false;
            }
         }
      }
   }

   public boolean method_4261(class_1979 var1) {
      if (this.field_4989 != null && !class_2164.method_10062(var1.method_9094(), this.field_4989)) {
         return false;
      } else {
         if (this.field_4988 != null) {
            class_1331 var4 = var1.method_9092();
            if (var4 != null && !this.field_4988.method_40164(var4.method_12165())) {
               return false;
            }
         }

         if (this.field_4980 != null) {
            int var10 = var1.method_9097();
            if (this.field_4995) {
               int var5 = var1.method_9096();
               if (var5 > 0) {
                  var10 = (int)((double)(var10 * 100) / (double)var5);
               }
            }

            if (!this.field_4980.method_40164(var10)) {
               return false;
            }
         }

         if (this.field_4983 != null) {
            String var11 = var1.method_9093();
            if (!this.field_4983.method_7706(var11)) {
               return false;
            }
         }

         if (this.field_4977 != null && var1 instanceof class_7908) {
            class_7908 var12 = (class_7908)var1;
            class_8145 var18 = var12.method_35765();
            if (var18 instanceof class_7666) {
               class_7666 var6 = (class_7666)var18;
               class_3047 var7 = var6.method_15891();
               class_4466 var8 = var7.method_13910();
               int var9 = var7.method_13906();
               if (!class_9438.method_43664(var8, var9, this.field_4977)) {
                  return false;
               }
            }
         }

         if (this.field_4990 != null && var1 instanceof class_7908) {
            class_7908 var13 = (class_7908)var1;
            class_8145 var19 = var13.method_35765();
            if (var19 instanceof class_9408) {
               class_9408 var24 = (class_9408)var19;
               if (!var24.method_41215()) {
                  return false;
               }

               class_9077 var27 = var24.method_43584();
               if (!class_3111.method_14254(var27, this.field_4990)) {
                  return false;
               }
            }

            if (var19 instanceof class_5583) {
               class_5583 var25 = (class_5583)var19;
               if (!var25.method_41215()) {
                  return false;
               }

               class_9077 var28 = var25.method_25360();
               if (!class_3111.method_14254(var28, this.field_4990)) {
                  return false;
               }
            }
         }

         if (this.field_4981 != null && var1 instanceof class_7908) {
            class_7908 var14 = (class_7908)var1;
            class_8145 var20 = var14.method_35765();
            if (var20 instanceof class_5834) {
               class_5834 var26 = (class_5834)var20;
               if (var26.method_26449() != this.field_4981) {
                  return false;
               }
            }
         }

         if (this.field_4978 != null) {
            class_174 var15 = class_3111.method_14327().field_9601;
            if (var15 != null) {
               int var21 = var15.method_13575();
               if (!this.field_4978.method_40164(var21)) {
                  return false;
               }
            }
         }

         if (this.field_4987 != null) {
            class_174 var16 = class_3111.method_14327().field_9601;
            if (var16 != null) {
               int var22 = (int)var16.method_29584();
               if (!this.field_4987.method_40164(var22)) {
                  return false;
               }
            }
         }

         if (this.field_4984 != null) {
            class_174 var17 = class_3111.method_14327().field_9601;
            if (var17 != null) {
               class_9614 var23 = class_9614.method_44381(var17, 0.0F);
               if (!class_5657.method_25605(this.field_4984, var23)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public Identifier method_4262(Identifier var1, int var2) {
      if (this.field_4994 != null && this.field_4994.length != 0) {
         int var5 = 0;
         if (this.field_4976 != null) {
            int var6 = var2 % this.field_4991;

            for (int var7 = 0; var7 < this.field_4985.length; var7++) {
               if (this.field_4985[var7] > var6) {
                  var5 = var7;
                  break;
               }
            }
         } else {
            var5 = var2 % this.field_4994.length;
         }

         return this.field_4994[var5];
      } else {
         return var1;
      }
   }
}

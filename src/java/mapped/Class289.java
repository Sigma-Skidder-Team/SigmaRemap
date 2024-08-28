package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class289 extends Class290 implements Class288 {
   private static final Logger field1101 = LogManager.getLogger();
   /** @deprecated */
   public static final ResourceLocation field1102 = Class5830.field25539;
   /** @deprecated */
   public static final ResourceLocation field1103 = new ResourceLocation("textures/atlas/particles.png");
   private final List<Class1713> field1104 = Lists.newArrayList();
   private final Set<ResourceLocation> field1105 = Sets.newHashSet();
   private final Map<ResourceLocation, Class1713> field1106 = Maps.newHashMap();
   private final ResourceLocation field1107;
   private final int field1108;
   private Map<ResourceLocation, Class1713> field1109 = new LinkedHashMap<ResourceLocation, Class1713>();
   private Map<ResourceLocation, Class1713> field1110 = new LinkedHashMap<ResourceLocation, Class1713>();
   private Class1713[] field1111 = null;
   private int field1112 = -1;
   private int field1113 = -1;
   private int field1114 = -1;
   private double field1115 = -1.0;
   private double field1116 = -1.0;
   private Class9147 field1117 = new Class9147(0);
   public int field1118 = 0;
   public int field1119 = 0;
   private int field1120;
   private int field1121;
   private boolean field1122;
   private boolean field1123;
   private boolean field1124;

   public Class289(ResourceLocation var1) {
      this.field1107 = var1;
      this.field1108 = RenderSystem.method27908();
      this.field1122 = var1.equals(field1102);
      this.field1123 = Class7944.method26921();
      this.field1124 = Class7944.method26894();
      if (this.field1122) {
         Class7944.method26968(this);
      }
   }

   @Override
   public void method1090(Class191 var1) throws IOException {
   }

   public void method1091(Class8226 var1) {
      this.field1105.clear();
      this.field1105.addAll(var1.field35334);
      field1101.info("Created: {}x{}x{} {}-atlas", var1.field35335, var1.field35336, var1.field35337, this.field1107);
      Class8535.method30370(this.method1131(), var1.field35337, var1.field35335, var1.field35336);
      this.field1118 = var1.field35335;
      this.field1119 = var1.field35336;
      if (this.field1123) {
         Class9336.method35320(var1.field35337, var1.field35335, var1.field35336, this);
      }

      this.method1099();

      for (Class1713 var5 : var1.field35338) {
         this.field1106.put(var5.method7465(), var5);

         try {
            var5.method7469();
         } catch (Throwable var10) {
            Class4526 var7 = Class4526.method14413(var10, "Stitching texture atlas");
            Class8965 var8 = var7.method14410("Texture being stitched together");
            var8.method32807("Atlas path", this.field1107);
            var8.method32807("Sprite", var5);
            throw new Class2506(var7);
         }

         if (var5.method7473()) {
            var5.method7478(this.field1104.size());
            this.field1104.add(var5);
         }
      }

      Class8684.method31272(this);
      Class7944.method26815("Animated sprites: " + this.field1104.size());
      if (Class7944.method26894()) {
         for (Class1713 var13 : var1.field35338) {
            Class1713 var6 = var13.field9345;
            if (var6 != null) {
               var6.method7478(var13.method7477());
               var13.method7484();

               try {
                  var6.method7469();
               } catch (Exception var9) {
                  Class7944.method26810("Error uploading sprite single: " + var6 + ", parent: " + var13);
                  var9.printStackTrace();
               }
            }
         }

         Class7414.method23814(this.method1131());
      }

      if (Class7944.method26921()) {
         List<Class1713> var12 = var1.field35338;
         if (Class8981.field40874) {
            Class7414.method23814(this.method1135().field45440);

            for (Class1713 var16 : var12) {
               Class1713 var18 = var16.field9349;
               if (var18 != null) {
                  var18.method7469();
               }
            }
         }

         if (Class8981.field40875) {
            Class7414.method23814(this.method1135().field45441);

            for (Class1713 var17 : var12) {
               Class1713 var19 = var17.field9350;
               if (var19 != null) {
                  var19.method7469();
               }
            }
         }

         Class7414.method23814(this.method1131());
      }

      Class9299.method35055(Class9299.field42892, this);
      this.method1115(var1.field35335, var1.field35336);
      if (Class7944.equals(System.getProperty("saveTextureMap"), "true")) {
         Class7944.method26810("Exporting texture map: " + this.field1107);
         Class8684.method31287(
            "debug/" + this.field1107.method8292().replaceAll("/", "_"), this.method1131(), var1.field35337, var1.field35335, var1.field35336
         );
         if (this.field1123) {
            if (Class8981.field40874) {
               Class8684.method31287(
                  "debug/" + this.field1107.method8292().replaceAll("/", "_").replace(".png", "_n.png"),
                  this.field1128.field45440,
                  var1.field35337,
                  var1.field35335,
                  var1.field35336
               );
            }

            if (Class8981.field40875) {
               Class8684.method31287(
                  "debug/" + this.field1107.method8292().replaceAll("/", "_").replace(".png", "_s.png"),
                  this.field1128.field45441,
                  var1.field35337,
                  var1.field35335,
                  var1.field35336
               );
            }

            Class7414.method23814(this.method1131());
         }
      }
   }

   public Class8226 method1092(Class191 var1, Stream<ResourceLocation> var2, Class7165 var3, int var4) {
      this.field1122 = this.field1107.equals(field1102);
      this.field1123 = Class7944.method26921();
      this.field1124 = Class7944.method26894();
      int var7 = var4;
      this.field1109.clear();
      this.field1110.clear();
      this.field1117.method34166();
      var3.startSection("preparing");
      Set<ResourceLocation> var8 = var2.peek(var0 -> {
         if (var0 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
         }
      }).collect(Collectors.toSet());
      Class7944.method26810("Multitexture: " + Class7944.method26894());
      Class8684.method31271(this);
      var8.addAll(this.field1109.keySet());
      Set var9 = method1124(var8, this.field1109.keySet());
      Class8564.method30600(this, var9);
      var8.addAll(this.field1109.keySet());
      if (var4 >= 4) {
         var7 = this.method1110(var8, var1);
         Class7944.method26815("Mipmap levels: " + var7);
      }

      int var10 = Class8684.method31288();
      Class9374 var11 = new Class9374(var10, var10, var4);
      int var12 = Integer.MAX_VALUE;
      int var13 = method1112(var7);
      this.field1112 = var13;
      int var14 = 1 << var4;
      var3.endStartSection("extracting_frames");
      Class9299.method35055(Class9299.field42891, this, var8);

      for (Class9431 var16 : this.method1093(var1, var8)) {
         int var17 = var16.method36196();
         int var18 = var16.method36197();
         if (var17 >= 1 && var18 >= 1) {
            if (var17 < var13 || var7 > 0) {
               int var19 = var7 > 0 ? Class8684.method31283(var17, var13) : Class8684.method31284(var17, var13);
               if (var19 != var17) {
                  if (!Class8684.method31278(var17)) {
                     Class7944.method26815("Scaled non power of 2: " + var16.method36195() + ", " + var17 + " -> " + var19);
                  } else {
                     Class7944.method26815("Scaled too small texture: " + var16.method36195() + ", " + var17 + " -> " + var19);
                  }

                  int var20 = var18 * var19 / var17;
                  var16.method36198(var19);
                  var16.method36199(var20);
                  var16.method36202((double)var19 * 1.0 / (double)var17);
               }
            }

            var12 = Math.min(var12, Math.min(var16.method36196(), var16.method36197()));
            int var27 = Math.min(Integer.lowestOneBit(var16.method36196()), Integer.lowestOneBit(var16.method36197()));
            if (var27 < var14) {
               field1101.warn(
                  "Texture {} with size {}x{} limits mip level from {} to {}",
                  var16.method36195(),
                  var16.method36196(),
                  var16.method36197(),
                  MathHelper.method37803(var14),
                  MathHelper.method37803(var27)
               );
               var14 = var27;
            }

            var11.method35560(var16);
         } else {
            Class7944.method26811("Invalid sprite size: " + var16.method36195());
         }
      }

      int var23 = Math.min(var12, var14);
      int var24 = MathHelper.method37803(var23);
      if (var24 < 0) {
         var24 = 0;
      }

      int var25;
      if (var24 < var4) {
         field1101.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", this.field1107, var4, var24, var23);
         var25 = var24;
      } else {
         var25 = var4;
      }

      var3.endStartSection("register");
      Class9431 var26 = method1113(Class1714.method7514(), var13);
      var11.method35560(var26);
      var3.endStartSection("stitching");

      try {
         var11.method35561();
      } catch (Class2470 var22) {
         Class4526 var29 = Class4526.method14413(var22, "Stitching");
         Class8965 var21 = var29.method14410("Stitcher");
         var21.method32807(
            "Sprites",
            var22.method10469()
               .stream()
               .<CharSequence>map(var0 -> String.format("%s[%dx%d]", var0.method36195(), var0.method36196(), var0.method36197()))
               .collect(Collectors.joining(","))
         );
         var21.method32807("Max Texture Size", var10);
         throw new Class2506(var29);
      }

      var3.endStartSection("loading");
      List var28 = this.method1094(var1, var11, var25);
      var3.endSection();
      return new Class8226(var8, var11.method35558(), var11.method35559(), var25, var28);
   }

   private Collection<Class9431> method1093(Class191 var1, Set<ResourceLocation> var2) {
      List<CompletableFuture> var5 = Lists.newArrayList();
      ConcurrentLinkedQueue var6 = new ConcurrentLinkedQueue();

      for (ResourceLocation var8 : var2) {
         if (!Class1714.method7513().equals(var8)) {
            var5.add(CompletableFuture.runAsync(() -> {
               ResourceLocation var6x = this.method1096(var8);

               Class9431 var12;
               try (Class1783 var7 = var1.method580(var6x)) {
                  Class7756 var9 = new Class7756(var7.toString(), var7.method7763());
                  Class7788 var10 = var7.<Class7788>method7764(Class7788.field33411);
                  if (var10 == null) {
                     var10 = Class7788.field33412;
                  }

                  Pair var11 = var10.method25807(var9.field33321, var9.field33322);
                  var12 = new Class9431(var8, (Integer)var11.getFirst(), (Integer)var11.getSecond(), var10);
               } catch (RuntimeException var24) {
                  field1101.error("Unable to parse metadata from {} : {}", var6x, var24);
                  this.method1123(var8);
                  return;
               } catch (IOException var25) {
                  field1101.error("Using missing texture, unable to load {} : {}", var6x, var25);
                  this.method1123(var8);
                  return;
               }

               var6.add(var12);
            }, Util.method38492()));
         }
      }

      CompletableFuture.allOf(var5.toArray(new CompletableFuture[0])).join();
      return var6;
   }

   private List<Class1713> method1094(Class191 var1, Class9374 var2, int var3) {
      ConcurrentLinkedQueue var6 = new ConcurrentLinkedQueue();
      List<CompletableFuture> var7 = Lists.newArrayList();
      var2.method35562((var5, var6x, var7x, var8, var9) -> {
         if (!var5.method36195().equals(Class1714.method7514().method36195())) {
            var7.add(CompletableFuture.runAsync(() -> {
               Class1713 var11 = this.method1095(var1, var5, var6x, var7x, var3, var8, var9);
               if (var11 != null) {
                  var6.add(var11);
               }
            }, Util.method38492()));
         } else {
            Class1714 var12 = new Class1714(this, var5, var3, var6x, var7x, var8, var9);
            var12.method7498(var1);
            var6.add(var12);
         }
      });
      CompletableFuture.allOf(var7.toArray(new CompletableFuture[0])).join();
      return Lists.newArrayList(var6);
   }

   @Nullable
   private Class1713 method1095(Class191 var1, Class9431 var2, int var3, int var4, int var5, int var6, int var7) {
      ResourceLocation var10 = this.method1096(var2.method36195());

      try (Class1783 var11 = var1.method580(var10)) {
         Class1806 var13 = Class1806.method7879(var11.method7763());
         Class1713 var14 = new Class1713(this, var2, var5, var3, var4, var6, var7, var13);
         var14.method7498(var1);
         return var14;
      } catch (RuntimeException var28) {
         field1101.error("Unable to parse metadata from {}", var10, var28);
         return null;
      } catch (IOException var29) {
         field1101.error("Using missing texture, unable to load {}", var10, var29);
         return null;
      }
   }

   public ResourceLocation method1096(ResourceLocation var1) {
      return !this.method1102(var1)
         ? new ResourceLocation(var1.method8293(), String.format("textures/%s%s", var1.method8292(), ".png"))
         : new ResourceLocation(var1.method8293(), var1.method8292() + ".png");
   }

   public void method1097() {
      boolean var3 = false;
      boolean var4 = false;
      if (!this.field1104.isEmpty()) {
         this.method1133();
      }

      int var5 = 0;

      for (Class1713 var7 : this.field1104) {
         if (this.method1108(var7)) {
            var7.method7472();
            if (var7.method7479()) {
               var5++;
            }

            if (var7.field9349 != null) {
               var3 = true;
            }

            if (var7.field9350 != null) {
               var4 = true;
            }
         }
      }

      if (Class7944.method26894()) {
         for (Class1713 var13 : this.field1104) {
            if (this.method1108(var13) && var13.method7479()) {
               Class1713 var8 = var13.field9345;
               if (var8 != null) {
                  var13.method7484();
                  var8.method7472();
                  if (var8.method7479()) {
                     var5++;
                  }
               }
            }
         }

         Class7414.method23814(this.method1131());
      }

      if (Class7944.method26921()) {
         if (var3) {
            Class7414.method23814(this.method1135().field45440);

            for (Class1713 var14 : this.field1104) {
               if (var14.field9349 != null && this.method1108(var14) && var14.method7479()) {
                  var14.field9349.method7472();
                  if (var14.field9349.method7479()) {
                     var5++;
                  }
               }
            }
         }

         if (var4) {
            Class7414.method23814(this.method1135().field45441);

            for (Class1713 var15 : this.field1104) {
               if (var15.field9350 != null && this.method1108(var15) && var15.method7479()) {
                  var15.field9350.method7472();
                  if (var15.field9350.method7479()) {
                     var5++;
                  }
               }
            }
         }

         if (var3 || var4) {
            Class7414.method23814(this.method1131());
         }
      }

      if (this.field1122) {
         int var12 = Class7944.method26860().worldRenderer.method935();
         if (var12 != this.field1121) {
            this.field1120 = var5;
            this.field1121 = var12;
         }

         if (Class4501.method14213()) {
            Class4501.method14218(this);
         }
      }
   }

   @Override
   public void method1080() {
      if (RenderSystem.method27803()) {
         this.method1097();
      } else {
         RenderSystem.method27810(this::method1097);
      }
   }

   public Class1713 method1098(ResourceLocation var1) {
      Class1713 var4 = this.field1106.get(var1);
      return var4 != null ? var4 : this.field1106.get(Class1714.method7513());
   }

   public void method1099() {
      for (Class1713 var4 : this.field1106.values()) {
         var4.close();
      }

      if (this.field1124) {
         for (Class1713 var6 : this.field1106.values()) {
            var6.method7485();
         }
      }

      this.field1106.clear();
      this.field1104.clear();
   }

   public ResourceLocation method1100() {
      return this.field1107;
   }

   public void method1101(Class8226 var1) {
      this.method1130(false, var1.field35337 > 0);
   }

   private boolean method1102(ResourceLocation var1) {
      String var4 = var1.method8292();
      return this.method1103(var4);
   }

   private boolean method1103(String var1) {
      String var4 = var1.toLowerCase();
      return var4.startsWith("optifine/");
   }

   public Class1713 method1104(String var1) {
      ResourceLocation var4 = new ResourceLocation(var1);
      return this.method1105(var4);
   }

   public Class1713 method1105(ResourceLocation var1) {
      return this.field1109.get(var1);
   }

   public Class1713 method1106(String var1) {
      ResourceLocation var4 = new ResourceLocation(var1);
      return this.method1107(var4);
   }

   public Class1713 method1107(ResourceLocation var1) {
      return this.field1106.get(var1);
   }

   private boolean method1108(Class1713 var1) {
      if (this.field1122) {
         if (var1 == Class8684.field39192 || var1 == Class8684.field39193) {
            return Class7944.method26835();
         } else if (var1 == Class8684.field39194 || var1 == Class8684.field39195) {
            return Class7944.method26838();
         } else if (var1 == Class8684.field39196 || var1 == Class8684.field39197) {
            return Class7944.method26840();
         } else if (var1 == Class8684.field39198 || var1 == Class8684.field39199) {
            return Class7944.method26840();
         } else if (var1 == Class8684.field39200 || var1 == Class8684.field39201) {
            return Class7944.method26840();
         } else if (var1 != Class8684.field39202 && var1 != Class8684.field39203) {
            return var1 != Class8684.field39204 ? Class7944.method26904() : Class7944.method26837();
         } else {
            return Class7944.method26840();
         }
      } else {
         return true;
      }
   }

   public int method1109() {
      return this.field1117.method34167();
   }

   private int method1110(Set<ResourceLocation> var1, Class191 var2) {
      int var5 = this.method1111(var1, var2, 20);
      if (var5 < 16) {
         var5 = 16;
      }

      var5 = MathHelper.method37800(var5);
      if (var5 > 16) {
         Class7944.method26815("Sprite size: " + var5);
      }

      int var6 = MathHelper.method37803(var5);
      if (var6 < 4) {
         var6 = 4;
      }

      return var6;
   }

   private int method1111(Set<ResourceLocation> var1, Class191 var2, int var3) {
      HashMap var6 = new HashMap();

      for (ResourceLocation var8 : var1) {
         ResourceLocation var9 = this.method1096(var8);

         try {
            Class1783 var10 = var2.method580(var9);
            if (var10 != null) {
               InputStream var11 = var10.method7763();
               if (var11 != null) {
                  Dimension var12 = Class8684.method31285(var11, "png");
                  var11.close();
                  if (var12 != null) {
                     int var13 = var12.width;
                     int var14 = MathHelper.method37800(var13);
                     if (!var6.containsKey(var14)) {
                        var6.put(var14, 1);
                     } else {
                        int var15 = (Integer)var6.get(var14);
                        var6.put(var14, var15 + 1);
                     }
                  }
               }
            }
         } catch (Exception var16) {
         }
      }

      int var17 = 0;
      Set var18 = var6.keySet();
      Set<Integer> var19 = new TreeSet<>(var18);

      for (int var22 : var19) {
         int var24 = (Integer)var6.get(var22);
         var17 += var24;
      }

      int var21 = 16;
      int var23 = 0;
      int var25 = var17 * var3 / 100;

      for (int var27 : var19) {
         int var28 = (Integer)var6.get(var27);
         var23 += var28;
         if (var27 > var21) {
            var21 = var27;
         }

         if (var23 > var25) {
            return var21;
         }
      }

      return var21;
   }

   private static int method1112(int var0) {
      int var3 = 1 << var0;
      if (var3 < 8) {
         var3 = 8;
      }

      return var3;
   }

   private static Class9431 method1113(Class9431 var0, int var1) {
      if (var0.method36196() >= var1 && var0.method36197() >= var1) {
         return var0;
      } else {
         int var4 = Math.max(var0.method36196(), var1);
         int var5 = Math.max(var0.method36197(), var1);
         return new Class9431(var0.method36195(), var4, var5, var0.method36200());
      }
   }

   public boolean method1114() {
      int var3 = Class7414.method23865();
      int var4 = this.method1131();
      return var3 == var4;
   }

   private void method1115(int var1, int var2) {
      this.field1113 = -1;
      this.field1114 = -1;
      this.field1111 = null;
      if (this.field1112 > 0) {
         this.field1113 = var1 / this.field1112;
         this.field1114 = var2 / this.field1112;
         this.field1111 = new Class1713[this.field1113 * this.field1114];
         this.field1115 = 1.0 / (double)this.field1113;
         this.field1116 = 1.0 / (double)this.field1114;

         for (Class1713 var6 : this.field1106.values()) {
            double var7 = 0.5 / (double)var1;
            double var9 = 0.5 / (double)var2;
            double var11 = (double)Math.min(var6.method7459(), var6.method7460()) + var7;
            double var13 = (double)Math.min(var6.method7462(), var6.method7463()) + var9;
            double var15 = (double)Math.max(var6.method7459(), var6.method7460()) - var7;
            double var17 = (double)Math.max(var6.method7462(), var6.method7463()) - var9;
            int var19 = (int)(var11 / this.field1115);
            int var20 = (int)(var13 / this.field1116);
            int var21 = (int)(var15 / this.field1115);
            int var22 = (int)(var17 / this.field1116);

            for (int var23 = var19; var23 <= var21; var23++) {
               if (var23 >= 0 && var23 < this.field1113) {
                  for (int var24 = var20; var24 <= var22; var24++) {
                     if (var24 >= 0 && var24 < this.field1113) {
                        int var25 = var24 * this.field1113 + var23;
                        this.field1111[var25] = var6;
                     } else {
                        Class7944.method26811("Invalid grid V: " + var24 + ", icon: " + var6.method7465());
                     }
                  }
               } else {
                  Class7944.method26811("Invalid grid U: " + var23 + ", icon: " + var6.method7465());
               }
            }
         }
      }
   }

   public Class1713 method1116(double var1, double var3) {
      if (this.field1111 == null) {
         return null;
      } else {
         int var7 = (int)(var1 / this.field1115);
         int var8 = (int)(var3 / this.field1116);
         int var9 = var8 * this.field1113 + var7;
         return var9 >= 0 && var9 <= this.field1111.length ? this.field1111[var9] : null;
      }
   }

   public int method1117() {
      return this.field1104.size();
   }

   public int method1118() {
      return this.field1120;
   }

   public Class1713 method1119(ResourceLocation var1) {
      if (var1 != null) {
         Class1713 var4 = this.field1109.get(var1);
         if (var4 == null) {
            this.field1105.add(var1);
            var4 = new Class1713(var1);
            this.field1109.put(var1, var4);
            var4.method7476(this.field1117);
            return var4;
         } else {
            return var4;
         }
      } else {
         throw new IllegalArgumentException("Location cannot be null!");
      }
   }

   public Collection<Class1713> method1120() {
      return Collections.<Class1713>unmodifiableCollection(this.field1109.values());
   }

   public boolean method1121() {
      return this.field1122;
   }

   public Class9147 method1122() {
      return this.field1117;
   }

   private void method1123(ResourceLocation var1) {
      Class1713 var4 = this.field1109.get(var1);
      if (var4 != null) {
         this.field1110.put(var1, var4);
      }
   }

   private static <T> Set<T> method1124(Set<T> var0, Set<T> var1) {
      HashSet var4 = new HashSet();
      var4.addAll(var0);
      var4.addAll(var1);
      return var4;
   }

   @Override
   public String toString() {
      return "" + this.field1107;
   }
}

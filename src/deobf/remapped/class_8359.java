package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.awt.Dimension;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8359 extends class_8143 implements class_72 {
   private static final Logger field_42813 = LogManager.getLogger();
   /** @deprecated */
   public static final Identifier field_42824 = class_3683.field_18059;
   /** @deprecated */
   public static final Identifier field_42805 = new Identifier("textures/atlas/particles.png");
   private final List<class_5155> field_42802 = Lists.newArrayList();
   private final Set<Identifier> field_42821 = Sets.newHashSet();
   private final Map<Identifier, class_5155> field_42817 = Maps.newHashMap();
   private final Identifier field_42808;
   private final int field_42823;
   private Map<Identifier, class_5155> field_42812 = new LinkedHashMap<Identifier, class_5155>();
   private Map<Identifier, class_5155> field_42804 = new LinkedHashMap<Identifier, class_5155>();
   private class_5155[] field_42815 = null;
   private int field_42801 = -1;
   private int field_42820 = -1;
   private int field_42807 = -1;
   private double field_42816 = -1.0;
   private double field_42822 = -1.0;
   private class_7225 field_42806 = new class_7225(0);
   public int field_42819 = 0;
   public int field_42803 = 0;
   private int field_42809;
   private int field_42818;
   private boolean field_42811;
   private boolean field_42825;
   private boolean field_42810;

   public class_8359(Identifier var1) {
      this.field_42808 = var1;
      this.field_42823 = class_3542.method_16477();
      this.field_42811 = var1.equals(field_42824);
      this.field_42825 = class_3111.method_14424();
      this.field_42810 = class_3111.method_14405();
      if (this.field_42811) {
         class_3111.method_14325(this);
      }
   }

   @Override
   public void method_37053(class_7832 var1) throws IOException {
   }

   public void method_38520(class_3930 var1) {
      this.field_42821.clear();
      this.field_42821.addAll(var1.field_19097);
      field_42813.info("Created: {}x{}x{} {}-atlas", var1.field_19100, var1.field_19098, var1.field_19101, this.field_42808);
      class_4970.method_22841(this.method_37055(), var1.field_19101, var1.field_19100, var1.field_19098);
      this.field_42819 = var1.field_19100;
      this.field_42803 = var1.field_19098;
      if (this.field_42825) {
         class_7977.method_36167(var1.field_19101, var1.field_19100, var1.field_19098, this);
      }

      this.method_38518();

      for (class_5155 var5 : var1.field_19099) {
         this.field_42817.put(var5.method_23644(), var5);

         try {
            var5.method_23600();
         } catch (Throwable var10) {
            class_159 var7 = class_159.method_643(var10, "Stitching texture atlas");
            class_6544 var8 = var7.method_639("Texture being stitched together");
            var8.method_29850("Atlas path", this.field_42808);
            var8.method_29850("Sprite", var5);
            throw new class_3297(var7);
         }

         if (var5.method_23607()) {
            var5.method_23631(this.field_42802.size());
            this.field_42802.add(var5);
         }
      }

      class_5525.method_25075(this);
      class_3111.method_14280("Animated sprites: " + this.field_42802.size());
      if (class_3111.method_14405()) {
         for (class_5155 var13 : var1.field_19099) {
            class_5155 var6 = var13.field_26548;
            if (var6 != null) {
               var6.method_23631(var13.method_23612());
               var13.method_23617();

               try {
                  var6.method_23600();
               } catch (Exception var9) {
                  class_3111.method_14277("Error uploading sprite single: " + var6 + ", parent: " + var13);
                  var9.printStackTrace();
               }
            }
         }

         class_1920.method_8791(this.method_37055());
      }

      if (class_3111.method_14424()) {
         List var12 = var1.field_19099;
         if (class_6588.field_33603) {
            class_1920.method_8791(this.method_37050().field_48418);

            for (class_5155 var16 : var12) {
               class_5155 var18 = var16.field_26539;
               if (var18 != null) {
                  var18.method_23600();
               }
            }
         }

         if (class_6588.field_33634) {
            class_1920.method_8791(this.method_37050().field_48419);

            for (class_5155 var17 : var12) {
               class_5155 var19 = var17.field_26562;
               if (var19 != null) {
                  var19.method_23600();
               }
            }
         }

         class_1920.method_8791(this.method_37055());
      }

      class_7860.method_35547(class_7860.field_40114, this);
      this.method_38500(var1.field_19100, var1.field_19098);
      if (class_3111.equals(System.getProperty("saveTextureMap"), "true")) {
         class_3111.method_14277("Exporting texture map: " + this.field_42808);
         class_5525.method_25082(
            "debug/" + this.field_42808.method_21456().replaceAll("/", "_"), this.method_37055(), var1.field_19101, var1.field_19100, var1.field_19098
         );
         if (this.field_42825) {
            if (class_6588.field_33603) {
               class_5525.method_25082(
                  "debug/" + this.field_42808.method_21456().replaceAll("/", "_").replace(".png", "_n.png"),
                  this.field_41688.field_48418,
                  var1.field_19101,
                  var1.field_19100,
                  var1.field_19098
               );
            }

            if (class_6588.field_33634) {
               class_5525.method_25082(
                  "debug/" + this.field_42808.method_21456().replaceAll("/", "_").replace(".png", "_s.png"),
                  this.field_41688.field_48419,
                  var1.field_19101,
                  var1.field_19100,
                  var1.field_19098
               );
            }

            class_1920.method_8791(this.method_37055());
         }
      }
   }

   public class_3930 method_38516(class_7832 var1, Stream<Identifier> var2, class_3492 var3, int var4) {
      this.field_42811 = this.field_42808.equals(field_42824);
      this.field_42825 = class_3111.method_14424();
      this.field_42810 = class_3111.method_14405();
      int var7 = var4;
      this.field_42812.clear();
      this.field_42804.clear();
      this.field_42806.method_33084();
      var3.method_16056("preparing");
      Set var8 = var2.peek(var0 -> {
         if (var0 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
         }
      }).collect(Collectors.toSet());
      class_3111.method_14277("Multitexture: " + class_3111.method_14405());
      class_5525.method_25073(this);
      var8.addAll(this.field_42812.keySet());
      Set var9 = method_38507(var8, this.field_42812.keySet());
      class_5052.method_23274(this, var9);
      var8.addAll(this.field_42812.keySet());
      if (var4 >= 4) {
         var7 = this.method_38517(var8, var1);
         class_3111.method_14280("Mipmap levels: " + var7);
      }

      int var10 = class_5525.method_25079();
      class_8130 var11 = new class_8130(var10, var10, var4);
      int var12 = Integer.MAX_VALUE;
      int var13 = method_38508(var7);
      this.field_42801 = var13;
      int var14 = 1 << var4;
      var3.method_16050("extracting_frames");
      class_7860.method_35547(class_7860.field_40019, this, var8);

      for (class_8353 var16 : this.method_38532(var1, var8)) {
         int var17 = var16.method_38453();
         int var18 = var16.method_38456();
         if (var17 >= 1 && var18 >= 1) {
            if (var17 < var13 || var7 > 0) {
               int var19 = var7 > 0 ? class_5525.method_25087(var17, var13) : class_5525.method_25069(var17, var13);
               if (var19 != var17) {
                  if (!class_5525.method_25097(var17)) {
                     class_3111.method_14280("Scaled non power of 2: " + var16.method_38459() + ", " + var17 + " -> " + var19);
                  } else {
                     class_3111.method_14280("Scaled too small texture: " + var16.method_38459() + ", " + var17 + " -> " + var19);
                  }

                  int var20 = var18 * var19 / var17;
                  var16.method_38463(var19);
                  var16.method_38458(var20);
                  var16.method_38454((double)var19 * 1.0 / (double)var17);
               }
            }

            var12 = Math.min(var12, Math.min(var16.method_38453(), var16.method_38456()));
            int var27 = Math.min(Integer.lowestOneBit(var16.method_38453()), Integer.lowestOneBit(var16.method_38456()));
            if (var27 < var14) {
               field_42813.warn(
                  "Texture {} with size {}x{} limits mip level from {} to {}",
                  var16.method_38459(),
                  var16.method_38453(),
                  var16.method_38456(),
                  class_9299.method_42798(var14),
                  class_9299.method_42798(var27)
               );
               var14 = var27;
            }

            var11.method_36990(var16);
         } else {
            class_3111.method_14317("Invalid sprite size: " + var16.method_38459());
         }
      }

      int var23 = Math.min(var12, var14);
      int var24 = class_9299.method_42798(var23);
      if (var24 < 0) {
         var24 = 0;
      }

      int var25;
      if (var24 < var4) {
         field_42813.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", this.field_42808, var4, var24, var23);
         var25 = var24;
      } else {
         var25 = var4;
      }

      var3.method_16050("register");
      class_8353 var26 = method_38504(class_2008.method_9326(), var13);
      var11.method_36990(var26);
      var3.method_16050("stitching");

      try {
         var11.method_36996();
      } catch (class_1882 var22) {
         class_159 var29 = class_159.method_643(var22, "Stitching");
         class_6544 var21 = var29.method_639("Stitcher");
         var21.method_29850(
            "Sprites",
            var22.method_8418()
               .stream()
               .<CharSequence>map(var0 -> String.format("%s[%dx%d]", var0.method_38459(), var0.method_38453(), var0.method_38456()))
               .collect(Collectors.joining(","))
         );
         var21.method_29850("Max Texture Size", var10);
         throw new class_3297(var29);
      }

      var3.method_16050("loading");
      List var28 = this.method_38527(var1, var11, var25);
      var3.method_16054();
      return new class_3930(var8, var11.method_36992(), var11.method_36994(), var25, var28);
   }

   private Collection<class_8353> method_38532(class_7832 var1, Set<Identifier> var2) {
      ArrayList var5 = Lists.newArrayList();
      ConcurrentLinkedQueue var6 = new ConcurrentLinkedQueue();

      for (Identifier var8 : var2) {
         if (!class_2008.method_9327().equals(var8)) {
            var5.add(CompletableFuture.runAsync(() -> {
               Identifier var6x = this.method_38503(var8);

               class_8353 var12;
               try (class_4038 var7 = var1.method_35458(var6x)) {
                  class_2639 var9 = new class_2639(var7.toString(), var7.method_18576());
                  class_4016 var10 = var7.<class_4016>method_18577(class_4016.field_19496);
                  if (var10 == null) {
                     var10 = class_4016.field_19494;
                  }

                  Pair var11 = var10.method_18505(var9.field_13007, var9.field_13006);
                  var12 = new class_8353(var8, (Integer)var11.getFirst(), (Integer)var11.getSecond(), var10);
               } catch (RuntimeException var24) {
                  field_42813.error("Unable to parse metadata from {} : {}", var6x, var24);
                  this.method_38512(var8);
                  return;
               } catch (IOException var25) {
                  field_42813.error("Using missing texture, unable to load {} : {}", var6x, var25);
                  this.method_38512(var8);
                  return;
               }

               var6.add(var12);
            }, Util.getMainWorkerExecutor()));
         }
      }

      CompletableFuture.allOf(var5.<CompletableFuture<?>>toArray(new CompletableFuture[0])).join();
      return var6;
   }

   private List<class_5155> method_38527(class_7832 var1, class_8130 var2, int var3) {
      ConcurrentLinkedQueue var6 = new ConcurrentLinkedQueue();
      ArrayList var7 = Lists.newArrayList();
      var2.method_36993((var5, var6x, var7x, var8, var9) -> {
         if (!var5.method_38459().equals(class_2008.method_9326().method_38459())) {
            var7.add(CompletableFuture.runAsync(() -> {
               class_5155 var11 = this.method_38531(var1, var5, var6x, var7x, var3, var8, var9);
               if (var11 != null) {
                  var6.add(var11);
               }
            }, Util.getMainWorkerExecutor()));
         } else {
            class_2008 var12 = new class_2008(this, var5, var3, var6x, var7x, var8, var9);
            var12.method_23638(var1);
            var6.add(var12);
         }
      });
      CompletableFuture.allOf(var7.<CompletableFuture<?>>toArray(new CompletableFuture[0])).join();
      return Lists.newArrayList(var6);
   }

   @Nullable
   private class_5155 method_38531(class_7832 var1, class_8353 var2, int var3, int var4, int var5, int var6, int var7) {
      Identifier var10 = this.method_38503(var2.method_38459());

      try (class_4038 var11 = var1.method_35458(var10)) {
         class_5797 var13 = class_5797.method_26230(var11.method_18576());
         class_5155 var14 = new class_5155(this, var2, var5, var3, var4, var6, var7, var13);
         var14.method_23638(var1);
         return var14;
      } catch (RuntimeException var28) {
         field_42813.error("Unable to parse metadata from {}", var10, var28);
         return null;
      } catch (IOException var29) {
         field_42813.error("Using missing texture, unable to load {}", var10, var29);
         return null;
      }
   }

   public Identifier method_38503(Identifier var1) {
      return !this.method_38514(var1)
         ? new Identifier(var1.method_21461(), String.format("textures/%s%s", var1.method_21456(), ".png"))
         : new Identifier(var1.method_21461(), var1.method_21456() + ".png");
   }

   public void method_38526() {
      boolean var3 = false;
      boolean var4 = false;
      if (!this.field_42802.isEmpty()) {
         this.method_37048();
      }

      int var5 = 0;

      for (class_5155 var7 : this.field_42802) {
         if (this.method_38501(var7)) {
            var7.method_23633();
            if (var7.method_23593()) {
               var5++;
            }

            if (var7.field_26539 != null) {
               var3 = true;
            }

            if (var7.field_26562 != null) {
               var4 = true;
            }
         }
      }

      if (class_3111.method_14405()) {
         for (class_5155 var13 : this.field_42802) {
            if (this.method_38501(var13) && var13.method_23593()) {
               class_5155 var8 = var13.field_26548;
               if (var8 != null) {
                  var13.method_23617();
                  var8.method_23633();
                  if (var8.method_23593()) {
                     var5++;
                  }
               }
            }
         }

         class_1920.method_8791(this.method_37055());
      }

      if (class_3111.method_14424()) {
         if (var3) {
            class_1920.method_8791(this.method_37050().field_48418);

            for (class_5155 var14 : this.field_42802) {
               if (var14.field_26539 != null && this.method_38501(var14) && var14.method_23593()) {
                  var14.field_26539.method_23633();
                  if (var14.field_26539.method_23593()) {
                     var5++;
                  }
               }
            }
         }

         if (var4) {
            class_1920.method_8791(this.method_37050().field_48419);

            for (class_5155 var15 : this.field_42802) {
               if (var15.field_26562 != null && this.method_38501(var15) && var15.method_23593()) {
                  var15.field_26562.method_23633();
                  if (var15.field_26562.method_23593()) {
                     var5++;
                  }
               }
            }
         }

         if (var3 || var4) {
            class_1920.method_8791(this.method_37055());
         }
      }

      if (this.field_42811) {
         int var12 = class_3111.method_14327().worldRenderer.method_20022();
         if (var12 != this.field_42818) {
            this.field_42809 = var5;
            this.field_42818 = var12;
         }

         if (class_153.method_611()) {
            class_153.method_617(this);
         }
      }
   }

   @Override
   public void method_80() {
      if (class_3542.method_16366()) {
         this.method_38526();
      } else {
         class_3542.method_16474(this::method_38526);
      }
   }

   public class_5155 method_38528(Identifier var1) {
      class_5155 var4 = this.field_42817.get(var1);
      return var4 != null ? var4 : this.field_42817.get(class_2008.method_9327());
   }

   public void method_38518() {
      for (class_5155 var4 : this.field_42817.values()) {
         var4.close();
      }

      if (this.field_42810) {
         for (class_5155 var6 : this.field_42817.values()) {
            var6.method_23635();
         }
      }

      this.field_42817.clear();
      this.field_42802.clear();
   }

   public Identifier method_38519() {
      return this.field_42808;
   }

   public void method_38521(class_3930 var1) {
      this.method_37049(false, var1.field_19101 > 0);
   }

   private boolean method_38514(Identifier var1) {
      String var4 = var1.method_21456();
      return this.method_38505(var4);
   }

   private boolean method_38505(String var1) {
      String var4 = var1.toLowerCase();
      return var4.startsWith("optifine/");
   }

   public class_5155 method_38509(String var1) {
      Identifier var4 = new Identifier(var1);
      return this.method_38510(var4);
   }

   public class_5155 method_38510(Identifier var1) {
      return this.field_42812.get(var1);
   }

   public class_5155 method_38522(String var1) {
      Identifier var4 = new Identifier(var1);
      return this.method_38523(var4);
   }

   public class_5155 method_38523(Identifier var1) {
      return this.field_42817.get(var1);
   }

   private boolean method_38501(class_5155 var1) {
      if (this.field_42811) {
         if (var1 == class_5525.field_28157 || var1 == class_5525.field_28158) {
            return class_3111.method_14380();
         } else if (var1 == class_5525.field_28138 || var1 == class_5525.field_28148) {
            return class_3111.method_14323();
         } else if (var1 == class_5525.field_28144 || var1 == class_5525.field_28135) {
            return class_3111.method_14251();
         } else if (var1 == class_5525.field_28132 || var1 == class_5525.field_28150) {
            return class_3111.method_14251();
         } else if (var1 == class_5525.field_28129 || var1 == class_5525.field_28156) {
            return class_3111.method_14251();
         } else if (var1 != class_5525.field_28162 && var1 != class_5525.field_28142) {
            return var1 != class_5525.field_28128 ? class_3111.method_14425() : class_3111.method_14446();
         } else {
            return class_3111.method_14251();
         }
      } else {
         return true;
      }
   }

   public int method_38525() {
      return this.field_42806.method_33085();
   }

   private int method_38517(Set<Identifier> var1, class_7832 var2) {
      int var5 = this.method_38502(var1, var2, 20);
      if (var5 < 16) {
         var5 = 16;
      }

      var5 = class_9299.method_42801(var5);
      if (var5 > 16) {
         class_3111.method_14280("Sprite size: " + var5);
      }

      int var6 = class_9299.method_42798(var5);
      if (var6 < 4) {
         var6 = 4;
      }

      return var6;
   }

   private int method_38502(Set<Identifier> var1, class_7832 var2, int var3) {
      HashMap var6 = new HashMap();

      for (Identifier var8 : var1) {
         Identifier var9 = this.method_38503(var8);

         try {
            class_4038 var10 = var2.method_35458(var9);
            if (var10 != null) {
               InputStream var11 = var10.method_18576();
               if (var11 != null) {
                  Dimension var12 = class_5525.method_25063(var11, "png");
                  var11.close();
                  if (var12 != null) {
                     int var13 = var12.width;
                     int var14 = class_9299.method_42801(var13);
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
      TreeSet var19 = new TreeSet(var18);

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

   private static int method_38508(int var0) {
      int var3 = 1 << var0;
      if (var3 < 8) {
         var3 = 8;
      }

      return var3;
   }

   private static class_8353 method_38504(class_8353 var0, int var1) {
      if (var0.method_38453() >= var1 && var0.method_38456() >= var1) {
         return var0;
      } else {
         int var4 = Math.max(var0.method_38453(), var1);
         int var5 = Math.max(var0.method_38456(), var1);
         return new class_8353(var0.method_38459(), var4, var5, var0.method_38457());
      }
   }

   public boolean method_38524() {
      int var3 = class_1920.method_8841();
      int var4 = this.method_37055();
      return var3 == var4;
   }

   private void method_38500(int var1, int var2) {
      this.field_42820 = -1;
      this.field_42807 = -1;
      this.field_42815 = null;
      if (this.field_42801 > 0) {
         this.field_42820 = var1 / this.field_42801;
         this.field_42807 = var2 / this.field_42801;
         this.field_42815 = new class_5155[this.field_42820 * this.field_42807];
         this.field_42816 = 1.0 / (double)this.field_42820;
         this.field_42822 = 1.0 / (double)this.field_42807;

         for (class_5155 var6 : this.field_42817.values()) {
            double var7 = 0.5 / (double)var1;
            double var9 = 0.5 / (double)var2;
            double var11 = (double)Math.min(var6.method_23630(), var6.method_23619()) + var7;
            double var13 = (double)Math.min(var6.method_23642(), var6.method_23640()) + var9;
            double var15 = (double)Math.max(var6.method_23630(), var6.method_23619()) - var7;
            double var17 = (double)Math.max(var6.method_23642(), var6.method_23640()) - var9;
            int var19 = (int)(var11 / this.field_42816);
            int var20 = (int)(var13 / this.field_42822);
            int var21 = (int)(var15 / this.field_42816);
            int var22 = (int)(var17 / this.field_42822);

            for (int var23 = var19; var23 <= var21; var23++) {
               if (var23 >= 0 && var23 < this.field_42820) {
                  for (int var24 = var20; var24 <= var22; var24++) {
                     if (var24 >= 0 && var24 < this.field_42820) {
                        int var25 = var24 * this.field_42820 + var23;
                        this.field_42815[var25] = var6;
                     } else {
                        class_3111.method_14317("Invalid grid V: " + var24 + ", icon: " + var6.method_23644());
                     }
                  }
               } else {
                  class_3111.method_14317("Invalid grid U: " + var23 + ", icon: " + var6.method_23644());
               }
            }
         }
      }
   }

   public class_5155 method_38533(double var1, double var3) {
      if (this.field_42815 == null) {
         return null;
      } else {
         int var7 = (int)(var1 / this.field_42816);
         int var8 = (int)(var3 / this.field_42822);
         int var9 = var8 * this.field_42820 + var7;
         return var9 >= 0 && var9 <= this.field_42815.length ? this.field_42815[var9] : null;
      }
   }

   public int method_38530() {
      return this.field_42802.size();
   }

   public int method_38511() {
      return this.field_42809;
   }

   public class_5155 method_38515(Identifier var1) {
      if (var1 != null) {
         class_5155 var4 = this.field_42812.get(var1);
         if (var4 == null) {
            this.field_42821.add(var1);
            var4 = new class_5155(var1);
            this.field_42812.put(var1, var4);
            var4.method_23628(this.field_42806);
            return var4;
         } else {
            return var4;
         }
      } else {
         throw new IllegalArgumentException("Location cannot be null!");
      }
   }

   public Collection<class_5155> method_38506() {
      return Collections.<class_5155>unmodifiableCollection(this.field_42812.values());
   }

   public boolean method_38529() {
      return this.field_42811;
   }

   public class_7225 method_38513() {
      return this.field_42806;
   }

   private void method_38512(Identifier var1) {
      class_5155 var4 = this.field_42812.get(var1);
      if (var4 != null) {
         this.field_42804.put(var1, var4);
      }
   }

   private static <T> Set<T> method_38507(Set<T> var0, Set<T> var1) {
      HashSet var4 = new HashSet();
      var4.addAll(var0);
      var4.addAll(var1);
      return var4;
   }

   @Override
   public String toString() {
      return "" + this.field_42808;
   }
}

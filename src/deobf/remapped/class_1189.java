package remapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class class_1189 extends class_3261 {
   private final Map<Integer, UUID> field_6660 = new ConcurrentHashMap<Integer, UUID>();
   private final Map<Integer, List<class_5407>> field_6662 = new ConcurrentHashMap<Integer, List<class_5407>>();
   private final Map<Integer, Integer> field_6663 = new ConcurrentHashMap<Integer, Integer>();
   private final Map<Integer, class_1033> field_6659 = new ConcurrentHashMap<Integer, class_1033>();
   private final Set<Integer> field_6657 = Sets.newConcurrentHashSet();
   private final Set<Integer> field_6658 = Sets.newConcurrentHashSet();
   private final Set<class_9371> field_6664 = Collections.<class_9371>newSetFromMap(
      CacheBuilder.newBuilder().maximumSize(10L).expireAfterAccess(250L, TimeUnit.MILLISECONDS).build().asMap()
   );
   private boolean field_6670 = false;
   private boolean field_6668 = false;
   private class_9371 field_6665 = null;
   private boolean field_6666 = false;
   private class_427 field_6669;
   private String field_6661;

   public class_1189(class_1455 var1) {
      super(var1, class_5813.field_29404);
   }

   public UUID method_5268(int var1) {
      UUID var4 = this.field_6660.get(var1);
      if (var4 == null) {
         var4 = UUID.randomUUID();
         this.field_6660.put(var1, var4);
      }

      return var4;
   }

   public void method_5258(class_9530 var1) {
      this.method_5257(this.method_14874(), var1);
   }

   public void method_5257(int var1, class_9530 var2) {
      class_5051 var5 = new class_5051(60, null, this.method_5205());
      var5.method_23236(class_8039.field_41157, var1);
      var5.method_23236(class_8039.field_41157, 1);
      var5.method_23236(class_8039.field_41149, var2);

      try {
         var5.method_23233(class_6890.class);
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   @Override
   public void method_14877(int var1) {
      super.method_14877(var1);
      this.field_6663.remove(var1);
      this.field_6660.remove(var1);
      this.field_6657.remove(var1);
      this.field_6658.remove(var1);
      this.field_6662.remove(var1);
      class_1033 var4 = this.field_6659.remove(var1);
      if (var4 != null) {
         var4.method_4580();
         class_3446.method_15883().method_33743().<class_2470>method_24490(class_2470.class).method_11364(this.method_5205(), var4.method_4585());
      }
   }

   public boolean method_5273(int var1, int var2, int var3) {
      return this.field_6664.contains(new class_9371(var1, (short)var2, var3));
   }

   public void method_5261(class_9371 var1) {
      this.field_6664.add(var1);
   }

   public void method_5259(int var1, List<class_5407> var2) {
      class_754 var5 = this.method_14879(var1);
      if (var5 != null) {
         for (class_5407 var7 : new ArrayList(var2)) {
            if (var5 == class_5813.field_29396 && var7.method_24602() == 10) {
               var2.remove(var7);
            }

            if (var5 == class_5813.field_29361 && var7.method_24602() == 11) {
               var2.remove(var7);
            }

            if (var5 == class_5813.field_29412 && this.method_5253(var2, 12) == null) {
               var2.add(new class_5407(12, class_4907.field_25380, true));
            }

            if (var5 == class_5813.field_29398 && var7.method_24602() == 16 && (Integer)var7.method_24609() == Integer.MIN_VALUE) {
               var7.method_24607(0);
            }

            if (var5 == class_5813.field_29404) {
               if (var7.method_24602() == 0) {
                  byte var8 = (Byte)var7.method_24609();
                  if (var1 != this.method_5246() && class_3446.method_15884().method_25805()) {
                     if ((var8 & 16) == 16) {
                        if (this.field_6657.contains(var1)) {
                           class_9530 var9 = new class_9530(442, (byte)1, (short)0, null);
                           this.method_5257(var1, var9);
                        } else {
                           this.method_5257(var1, null);
                        }
                     } else {
                        this.method_5257(var1, null);
                     }
                  }
               }

               if (var7.method_24602() == 12 && class_3446.method_15884().method_25847()) {
                  var2.add(new class_5407(13, class_4907.field_25378, (byte)((var7.method_24609() & 128) != 0 ? 0 : 1)));
               }
            }

            if (var5 == class_5813.field_29362 && class_3446.method_15884().method_25844() && var7.method_24602() == 0 && this.method_5253(var2, 10) != null) {
               class_5407 var13 = this.method_5253(var2, 10);
               byte var18 = (Byte)var7.method_24609();
               if ((var18 & 32) == 32
                  && ((Byte)var13.method_24609() & 1) == 1
                  && !((String)this.method_5253(var2, 2).method_24609()).isEmpty()
                  && (Boolean)this.method_5253(var2, 3).method_24609()
                  && !this.field_6658.contains(var1)) {
                  this.field_6658.add(var1);

                  try {
                     class_5051 var10 = new class_5051(37, null, this.method_5205());
                     var10.method_23236(class_8039.field_41157, var1);
                     var10.method_23236(class_8039.field_41166, (short)0);
                     var10.method_23236(class_8039.field_41166, (short)((int)(128.0 * class_3446.method_15884().method_25806() * 32.0)));
                     var10.method_23236(class_8039.field_41166, (short)0);
                     var10.method_23236(class_8039.field_41161, true);
                     var10.method_23235(class_6890.class, true, false);
                  } catch (Exception var12) {
                  }
               }
            }

            if (class_3446.method_15884().method_25825() && (var5 == class_5813.field_29361 || var5 == class_5813.field_29396)) {
               if (var7.method_24602() == 2) {
                  class_1033 var14 = this.field_6659.get(var1);
                  String var19 = (String)var7.method_24609();
                  var19 = var19.isEmpty() ? (var5 == class_5813.field_29361 ? "Ender Dragon" : "Wither") : var19;
                  if (var14 == null) {
                     var14 = class_3446.method_15885().method_38373(var19, class_7754.field_39333, class_3704.field_18181);
                     this.field_6659.put(var1, var14);
                     var14.method_4570(this.method_5205());
                     var14.method_4567();
                     class_3446.method_15883().method_33743().<class_2470>method_24490(class_2470.class).method_11363(this.method_5205(), var14.method_4585());
                  } else {
                     var14.method_4583(var19);
                  }
               } else if (var7.method_24602() == 6 && !class_3446.method_15884().method_25826()) {
                  class_1033 var16 = this.field_6659.get(var1);
                  float var21 = var5 == class_5813.field_29361 ? 200.0F : 300.0F;
                  float var22 = Math.max(0.0F, Math.min((Float)var7.method_24609() / var21, 1.0F));
                  if (var16 == null) {
                     String var11 = var5 == class_5813.field_29361 ? "Ender Dragon" : "Wither";
                     var16 = class_3446.method_15885().method_38372(var11, var22, class_7754.field_39333, class_3704.field_18181);
                     this.field_6659.put(var1, var16);
                     var16.method_4570(this.method_5205());
                     var16.method_4567();
                     class_3446.method_15883().method_33743().<class_2470>method_24490(class_2470.class).method_11363(this.method_5205(), var16.method_4585());
                  } else {
                     var16.method_4572(var22);
                  }
               }
            }
         }
      }
   }

   public class_5407 method_5253(List<class_5407> var1, int var2) {
      for (class_5407 var6 : var1) {
         if (var2 == var6.method_24602()) {
            return var6;
         }
      }

      return null;
   }

   public void method_5263(boolean var1, boolean var2) {
      class_5051 var5 = new class_5051(65, null, this.method_5205());
      var5.method_23236(class_8039.field_41171, "viaversion");
      if (var1) {
         if (!this.field_6666) {
            var5.method_23236(class_8039.field_41133, (byte)0);
            var5.method_23236(class_8039.field_41171, "viaversion");
            var5.method_23236(class_8039.field_41171, "§f");
            var5.method_23236(class_8039.field_41171, "");
            var5.method_23236(class_8039.field_41133, (byte)0);
            var5.method_23236(class_8039.field_41171, "");
            var5.method_23236(class_8039.field_41171, "never");
            var5.method_23236(class_8039.field_41133, (byte)15);
         } else {
            var5.method_23236(class_8039.field_41133, (byte)3);
         }

         var5.method_23236(class_8039.field_41152, new String[]{this.method_5205().method_6744().method_17602()});
      } else {
         var5.method_23236(class_8039.field_41133, (byte)1);
      }

      this.field_6666 = var1;

      try {
         var5.method_23235(class_6890.class, true, var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   public void method_5265(int var1, List<class_5407> var2) {
      List var5 = this.field_6662.get(var1);
      if (var5 == null) {
         this.field_6662.put(var1, var2);
      } else {
         var5.addAll(var2);
      }
   }

   public void method_5254(int var1) {
      List var4 = this.field_6662.get(var1);
      if (var4 != null) {
         class_5051 var5 = new class_5051(57, null, this.method_5205());
         var5.method_23236(class_8039.field_41157, var1);
         var5.method_23236(class_2287.field_11420, var4);
         this.method_5205()
            .method_6744()
            .method_17596()
            .<class_6890>method_42440(class_6890.class)
            .<class_1206>method_18997(class_1206.class)
            .method_33131(var1, var4, this.method_5205());
         this.method_5259(var1, var4);
         if (!var4.isEmpty()) {
            try {
               var5.method_23233(class_6890.class);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         this.field_6662.remove(var1);
      }
   }

   public int method_5246() {
      try {
         return class_3446.method_15883().method_33743().<class_271>method_24490(class_271.class).method_1215(this.method_5205());
      } catch (Exception var4) {
         return this.method_14874();
      }
   }

   public Map<Integer, UUID> method_5256() {
      return this.field_6660;
   }

   public Map<Integer, List<class_5407>> method_5252() {
      return this.field_6662;
   }

   public Map<Integer, Integer> method_5271() {
      return this.field_6663;
   }

   public Map<Integer, class_1033> method_5267() {
      return this.field_6659;
   }

   public Set<Integer> method_5262() {
      return this.field_6657;
   }

   public Set<Integer> method_5264() {
      return this.field_6658;
   }

   public Set<class_9371> method_5272() {
      return this.field_6664;
   }

   public boolean method_5260() {
      return this.field_6670;
   }

   public void method_5255(boolean var1) {
      this.field_6670 = var1;
   }

   public boolean method_5266() {
      return this.field_6668;
   }

   public void method_5250(boolean var1) {
      this.field_6668 = var1;
   }

   public class_9371 method_5270() {
      return this.field_6665;
   }

   public void method_5249(class_9371 var1) {
      this.field_6665 = var1;
   }

   public boolean method_5274() {
      return this.field_6666;
   }

   public class_427 method_5269() {
      return this.field_6669;
   }

   public void method_5251(class_427 var1) {
      this.field_6669 = var1;
   }

   public String method_5248() {
      return this.field_6661;
   }

   public void method_5247(String var1) {
      this.field_6661 = var1;
   }
}

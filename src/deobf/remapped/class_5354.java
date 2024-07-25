package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_5354 extends class_3757 implements class_3745 {
   private final List<class_7955> field_27341 = Lists.newArrayList();
   private BlockPos field_27340 = null;

   public class_5354() {
      super(class_133.field_353);
   }

   @Override
   public void method_17407() {
      if (this.method_24446()) {
         this.method_24447((PlayerEntity)null, this.field_18364.method_28262(this.method_17399()), class_8771.field_44900);
      }

      super.method_17407();
   }

   public boolean method_24446() {
      if (this.field_18364 == null) {
         return false;
      } else {
         for (BlockPos var4 : BlockPos.method_6076(this.field_18358.method_6104(-1, -1, -1), this.field_18358.method_6104(1, 1, 1))) {
            if (this.field_18364.method_28262(var4).method_8360() instanceof class_1878) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean method_24452() {
      return this.field_27341.isEmpty();
   }

   public boolean method_24453() {
      return this.field_27341.size() == 3;
   }

   public void method_24447(PlayerEntity var1, class_2522 var2, class_8771 var3) {
      List var6 = this.method_24445(var2, var3);
      if (var1 != null) {
         for (Entity var8 : var6) {
            if (var8 instanceof class_8829) {
               class_8829 var9 = (class_8829)var8;
               if (var1.method_37245().method_6204(var8.method_37245()) <= 16.0) {
                  if (this.method_24449()) {
                     var9.method_40617(400);
                  } else {
                     var9.method_26860(var1);
                  }
               }
            }
         }
      }
   }

   private List<Entity> method_24445(class_2522 var1, class_8771 var2) {
      ArrayList var5 = Lists.newArrayList();
      this.field_27341.removeIf(var4 -> this.method_24441(var1, var4, var5, var2));
      return var5;
   }

   public void method_24442(Entity var1, boolean var2) {
      this.method_24443(var1, var2, 0);
   }

   public int method_24448() {
      return this.field_27341.size();
   }

   public static int method_24451(class_2522 var0) {
      return var0.<Integer>method_10313(class_4745.field_22992);
   }

   public boolean method_24449() {
      return class_8474.method_39005(this.field_18364, this.method_17399());
   }

   public void method_24438() {
      class_1892.method_8441(this);
   }

   public void method_24443(Entity var1, boolean var2, int var3) {
      if (this.field_27341.size() < 3) {
         var1.method_37390();
         var1.method_37305();
         CompoundNBT var6 = new CompoundNBT();
         var1.method_37350(var6);
         this.field_27341.add(new class_7955(var6, var3, !var2 ? 600 : 2400, null));
         if (this.field_18364 != null) {
            if (var1 instanceof class_8829) {
               class_8829 var7 = (class_8829)var1;
               if (var7.method_40603() && (!this.method_24440() || this.field_18364.field_33033.nextBoolean())) {
                  this.field_27340 = var7.method_40558();
               }
            }

            BlockPos var8 = this.method_17399();
            this.field_18364
               .method_29528(
                  (PlayerEntity)null,
                  (double)var8.getX(),
                  (double)var8.method_12165(),
                  (double)var8.method_12185(),
                  SoundEvents.field_2714,
                  class_562.field_3322,
                  1.0F,
                  1.0F
               );
         }

         var1.method_37204();
      }
   }

   private boolean method_24441(class_2522 var1, class_7955 var2, List<Entity> var3, class_8771 var4) {
      if ((this.field_18364.method_29544() || this.field_18364.method_29561()) && var4 != class_8771.field_44900) {
         return false;
      } else {
         BlockPos var7 = this.method_17399();
         CompoundNBT var8 = class_7955.method_35994(var2);
         var8.method_25959("Passengers");
         var8.method_25959("Leash");
         var8.method_25959("UUID");
         Direction var9 = var1.<Direction>method_10313(class_4745.field_22991);
         BlockPos var10 = var7.method_6098(var9);
         boolean var11 = !this.field_18364.method_28262(var10).method_8324(this.field_18364, var10).method_19485();
         if (var11 && var4 != class_8771.field_44900) {
            return false;
         } else {
            Entity var12 = EntityType.method_30455(var8, this.field_18364, var0 -> var0);
            if (var12 == null) {
               return false;
            } else if (var12.getType().isContained(EntityTypeTags.BEEHIVE_INHABITORS)) {
               if (var12 instanceof class_8829) {
                  class_8829 var13 = (class_8829)var12;
                  if (this.method_24440() && !var13.method_40603() && this.field_18364.field_33033.nextFloat() < 0.9F) {
                     var13.method_40551(this.field_27340);
                  }

                  if (var4 == class_8771.field_44897) {
                     var13.method_40581();
                     if (var1.method_8360().method_29299(class_2351.field_11727)) {
                        int var14 = method_24451(var1);
                        if (var14 < 5) {
                           int var15 = this.field_18364.field_33033.nextInt(100) != 0 ? 1 : 2;
                           if (var14 + var15 > 5) {
                              var15--;
                           }

                           this.field_18364.method_29594(this.method_17399(), var1.method_10308(class_4745.field_22992, Integer.valueOf(var14 + var15)));
                        }
                     }
                  }

                  this.method_24450(class_7955.method_35996(var2), var13);
                  if (var3 != null) {
                     var3.add(var13);
                  }

                  float var24 = var12.method_37086();
                  double var16 = !var11 ? 0.55 + (double)(var24 / 2.0F) : 0.0;
                  double var18 = (double)var7.getX() + 0.5 + var16 * (double)var9.method_1041();
                  double var20 = (double)var7.method_12165() + 0.5 - (double)(var12.method_37074() / 2.0F);
                  double var22 = (double)var7.method_12185() + 0.5 + var16 * (double)var9.method_1034();
                  var12.method_37144(var18, var20, var22, var12.rotationYaw, var12.rotationPitch);
               }

               this.field_18364.method_43359((PlayerEntity)null, var7, SoundEvents.field_2672, class_562.field_3322, 1.0F, 1.0F);
               return this.field_18364.method_7509(var12);
            } else {
               return false;
            }
         }
      }
   }

   private void method_24450(int var1, class_8829 var2) {
      int var5 = var2.method_8634();
      if (var5 >= 0) {
         if (var5 > 0) {
            var2.method_8635(Math.max(0, var5 - var1));
         }
      } else {
         var2.method_8635(Math.min(0, var5 + var1));
      }

      var2.method_24868(Math.max(0, var2.method_24871() - var1));
      var2.method_40584();
   }

   private boolean method_24440() {
      return this.field_27340 != null;
   }

   private void method_24444() {
      Iterator var3 = this.field_27341.iterator();
      class_2522 var4 = this.method_17403();

      while (var3.hasNext()) {
         class_7955 var5 = (class_7955)var3.next();
         if (class_7955.method_35996(var5) > class_7955.method_35993(var5)) {
            class_8771 var6 = !class_7955.method_35994(var5).method_25933("HasNectar") ? class_8771.field_44898 : class_8771.field_44897;
            if (this.method_24441(var4, var5, (List<Entity>)null, var6)) {
               var3.remove();
            }
         }

         class_7955.method_35997(var5);
      }
   }

   @Override
   public void method_17353() {
      if (!this.field_18364.field_33055) {
         this.method_24444();
         BlockPos var3 = this.method_17399();
         if (this.field_27341.size() > 0 && this.field_18364.method_43360().nextDouble() < 0.005) {
            double var4 = (double)var3.getX() + 0.5;
            double var6 = (double)var3.method_12165();
            double var8 = (double)var3.method_12185() + 0.5;
            this.field_18364.method_29528((PlayerEntity)null, var4, var6, var8, SoundEvents.field_2340, class_562.field_3322, 1.0F, 1.0F);
         }

         this.method_24438();
      }
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_27341.clear();
      class_3416 var5 = var2.method_25927("Bees", 10);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         CompoundNBT var7 = var5.method_15764(var6);
         class_7955 var8 = new class_7955(var7.getCompound("EntityData"), var7.method_25947("TicksInHive"), var7.method_25947("MinOccupationTicks"), null);
         this.field_27341.add(var8);
      }

      this.field_27340 = null;
      if (var2.method_25938("FlowerPos")) {
         this.field_27340 = class_4338.method_20189(var2.getCompound("FlowerPos"));
      }
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      var1.put("Bees", this.method_24439());
      if (this.method_24440()) {
         var1.put("FlowerPos", class_4338.method_20190(this.field_27340));
      }

      return var1;
   }

   public class_3416 method_24439() {
      class_3416 var3 = new class_3416();

      for (class_7955 var5 : this.field_27341) {
         class_7955.method_35994(var5).method_25959("UUID");
         CompoundNBT var6 = new CompoundNBT();
         var6.put("EntityData", class_7955.method_35994(var5));
         var6.putInt("TicksInHive", class_7955.method_35996(var5));
         var6.putInt("MinOccupationTicks", class_7955.method_35993(var5));
         var3.add(var6);
      }

      return var3;
   }
}

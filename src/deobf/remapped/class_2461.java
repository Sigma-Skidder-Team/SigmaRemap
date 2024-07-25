package remapped;

import java.util.List;

public class class_2461 extends class_9128 {
   private float field_12315;
   private float field_12313;
   private int field_12316 = 0;
   private int field_12311 = 0;
   private int field_12318;
   private int field_12312;
   private double field_12314;

   public class_2461() {
      super(class_5664.field_28716, "AAC", "Places block underneath if it is in hand");
      this.method_42010(new class_8563("Haphe (AACAP)", "Never let's you touch the ground.", false));
   }

   @Override
   public void method_42006() {
      this.field_12311 = field_46692.field_9632.field_3853.field_36404;
      this.field_12315 = field_46692.field_9632.field_41701;
      this.field_12313 = field_46692.field_9632.field_41755;
      this.field_12316 = (int)field_46692.field_9632.method_37309();
      this.field_12312 = -1;
      ((class_3709)this.method_42017()).field_18196 = -1;
   }

   @Override
   public void method_42020() {
      if (this.field_12311 != -1 && this.method_42017().method_42016("ItemSpoof").equals("Switch")) {
         field_46692.field_9632.field_3853.field_36404 = this.field_12311;
      }

      this.field_12311 = -1;
      if (((class_3709)this.method_42017()).field_18196 >= 0) {
         field_46692.method_8614().method_4813(new class_7371(field_46692.field_9632.field_3853.field_36404));
         ((class_3709)this.method_42017()).field_18196 = -1;
      }

      field_46692.field_9616.field_32603 = 1.0F;
   }

   @class_9148
   @class_7664
   public void method_11335(class_2157 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         if (var1.method_10047() instanceof class_7371 && ((class_3709)this.method_42017()).field_18196 >= 0) {
            var1.method_29715(true);
         }
      }
   }

   @class_9148
   public void method_11338(class_139 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_509) {
            this.field_12312 = 0;
         }
      }
   }

   @class_9148
   public void method_11342(class_7982 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632.field_41726 && class_727.method_3328().method_3298().method_847(class_1396.class).method_42015()) {
            var1.method_36186(true);
         }
      }
   }

   @class_9148
   public void method_11337(class_7767 var1) {
      if (this.method_42015()) {
         if (this.method_42017().method_42007("No Sprint")) {
            field_46692.field_9632.method_37140(false);
         }

         if (!this.method_42007("Haphe (AACAP)")) {
            field_46692.field_9577.field_45444.field_30024 = false;
            field_46692.field_9632.method_37140(false);
         }

         ((class_3709)this.method_42017()).method_17220(var1);
         if (this.method_42007("Haphe (AACAP)")) {
            if (!field_46692.field_9632.field_41726 || field_46692.field_9632.field_29673 == 0.0F && field_46692.field_9632.field_29676 == 0.0F) {
               if (this.field_12318 >= 0) {
                  this.field_12318++;
               }
            } else {
               this.field_12318 = 0;
               field_46692.field_9632.method_26595();
               var1.method_35235(0.419998 + (double)class_8865.method_40769() * 0.1);
               if (this.field_12312 < 3) {
                  this.field_12312++;
               }
            }

            if (field_46692.field_9632.field_29673 == 0.0F && field_46692.field_9632.field_29676 == 0.0F || field_46692.field_9632.field_41744) {
               this.field_12312 = 0;
            }

            this.field_12314 = class_6053.method_27638(this.field_12318, this.field_12312, () -> this.field_12312 = 0);
            if (this.field_12318 >= 0) {
               class_8865.method_40777(var1, this.field_12314);
            }
         }
      }
   }

   @class_9148
   private void method_11341(class_8128 var1) {
      if (this.method_42015() && field_46692.field_9601 != null && field_46692.field_9632 != null) {
         if (this.method_42007("Haphe (AACAP)") && class_8865.method_40772() && !field_46692.field_9632.method_37321()) {
            var1.field_41637 *= 1.14F;
         }
      }
   }

   private boolean method_11333() {
      class_9529 var3 = (class_9529)class_7494.method_34115(
         field_46692.field_9632.field_30535, field_46692.field_9632.field_30524, class_7494.method_34074(), 0.0F
      );
      boolean var4 = false;
      if (var3 != null && var3.method_33990() == class_1430.field_7717) {
         if (this.method_42017().method_42016("ItemSpoof").equals("None")) {
            class_3709 var10000 = (class_3709)this.method_42017();
            if (!class_3709.method_17216(field_46692.field_9632.method_26617(class_2584.field_12791).method_27960())) {
               return false;
            }
         }

         if (this.method_42007("Haphe (AACAP)") && !field_46692.field_9632.field_29654 && !field_46692.field_9632.field_41726) {
            if (var3.method_43956() == class_240.field_817) {
               return false;
            }

            if (var3.method_43955().method_12165() != this.field_12316 - 1) {
               return false;
            }
         }

         if (var3.method_43956() == class_240.field_817
            && (double)(var3.method_43955().method_12165() + 2) > field_46692.field_9632.method_37309()
            && class_7494.method_34090(var3.method_43955())) {
            return false;
         }

         if ((double)var3.method_43955().method_12165() == field_46692.field_9632.method_37309()) {
            return false;
         }

         ((class_3709)this.method_42017()).method_17215();
         int var5 = field_46692.field_9632.field_3853.field_36404;
         if (!this.method_42017().method_42016("ItemSpoof").equals("None")) {
            ((class_3709)this.method_42017()).method_17211();
         }

         class_6910 var6 = field_46692.field_9647.method_42147(field_46692.field_9632, field_46692.field_9601, class_2584.field_12791, var3);
         if (this.method_42017().method_42016("ItemSpoof").equals("Spoof") || this.method_42017().method_42016("ItemSpoof").equals("LiteSpoof")) {
            field_46692.field_9632.field_3853.field_36404 = var5;
         }

         if (var6 == class_6910.field_35520) {
            if (!this.method_42017().method_42007("NoSwing")) {
               field_46692.field_9632.method_26597(class_2584.field_12791);
            } else {
               field_46692.method_8614().method_4813(new class_3195(class_2584.field_12791));
            }

            if (var3.method_43956() == class_240.field_817) {
               this.field_12316 = var3.method_43955().method_12165() + 2;
            }

            var4 = true;
         }
      }

      return var4;
   }

   public List<class_7606> method_11334(class_6414 var1, class_1331 var2) {
      return class_7829.method_35452(var1, var2, (int)field_46692.field_9647.method_42146());
   }

   @class_9148
   public void method_11339(class_1711 var1) {
      if (this.method_42015()) {
         if (!this.method_42007("Haphe (AACAP)")) {
            ;
         }
      }
   }

   @class_9148
   @class_4249
   private void method_11336(class_1393 var1) {
      if (this.method_42015()) {
         if (!var1.method_6449()) {
            if (class_8865.method_40772() && field_46692.field_9632.field_41726 && this.method_42007("Haphe (AACAP)") && !field_46692.field_9632.field_29654) {
               field_46692.field_9632.method_26595();
            }

            if (!this.method_42007("Haphe (AACAP)")) {
               if (!this.method_11333()) {
                  float var11 = 0.0F;

                  while (var11 < 0.7F && !this.method_11333()) {
                     var11 += 0.1F;
                  }
               }
            } else {
               this.method_11333();
            }
         } else {
            double var4 = field_46692.field_9632.method_37309();
            if (!field_46692.field_9632.field_29654 && this.method_42007("Haphe (AACAP)")) {
               var4 = (double)this.field_12316;
            }

            class_1331 var6 = new class_1331(field_46692.field_9632.method_37302(), (double)Math.round(var4 - 1.0), field_46692.field_9632.method_37156());
            List var7 = this.method_11334(class_4783.field_23644, var6);
            if (!var7.isEmpty()) {
               class_7606 var8 = (class_7606)var7.get(var7.size() - 1);
               class_9529 var9 = class_7494.method_34079(this.field_12315, this.field_12313, 5.0F);
               if (!var9.method_43955().equals(var8.field_38725) || !var9.method_43956().equals(var8.field_38724)) {
                  float[] var10 = class_7494.method_34097(var8.field_38725, var8.field_38724);
                  this.field_12315 = class_7494.method_34097(var8.field_38725, var8.field_38724)[0];
                  this.field_12313 = class_7494.method_34097(var8.field_38725, var8.field_38724)[1];
               }
            }

            var1.method_6448(this.field_12313);
            var1.method_6441(this.field_12315);
         }
      }
   }

   @class_9148
   public void method_11340(class_2911 var1) {
      if (this.method_42015()) {
         if (this.method_42017().method_42016("Tower Mode").equalsIgnoreCase("Vanilla")
            && (!class_314.method_1434() || this.method_42017().method_42007("Tower while moving"))) {
            var1.method_29715(true);
         }
      }
   }
}

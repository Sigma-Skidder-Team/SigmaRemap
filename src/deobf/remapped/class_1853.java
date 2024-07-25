package remapped;

public class class_1853 extends class_9128 {
   private class_3223 field_9397 = new class_3223();
   private boolean field_9393;
   public static boolean field_9392;
   public boolean field_9396 = false;
   public boolean field_9395 = false;

   public class_1853() {
      super(class_5664.field_28712, "AutoArmor", "Automaticly equips your armor");
      this.method_42010(new class_8563("Fake Items", "Bypass for fake items (AAC).", false));
      this.method_42010(new class_2748<Float>("Delay", "Inventory clicks delay", 0.3F, Float.class, 0.0F, 1.0F, 0.01F));
      this.method_42010(new class_2826("Mode", "The way it will move armor in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
      this.method_42010(new class_2826("Elytra", "Elytra Equip Mode", 0, "Ignore", "Equip", "On Use"));
   }

   @Override
   public void method_42006() {
      if (!this.field_9397.method_14771()) {
         this.field_9397.method_14776();
      }

      this.field_9393 = field_46692.field_9623 instanceof class_3431;
      field_9392 = false;
   }

   @Override
   public void method_42020() {
      field_9392 = false;
   }

   @class_9148
   @class_315
   public void method_8194(class_5596 var1) {
      if (this.method_42015()) {
         if (!this.field_9397.method_14771()) {
            this.field_9397.method_14776();
         }

         if (!this.method_42016("Mode").equals("OpenInv") || field_46692.field_9623 instanceof class_3431) {
            long var4 = (long)(this.method_42002("Delay") * 1000.0F);
            String var6 = this.method_42016("Elytra");
            switch (var6) {
               case "Ignore":
                  this.field_9396 = false;
                  break;
               case "Equip":
                  this.field_9396 = true;
                  break;
               case "On Use":
                  if (!field_46692.field_9632.field_41726 && field_46692.field_9632.field_29600 == 0 && field_46692.field_9632.field_29654 && !this.field_9395) {
                     this.field_9396 = true;
                  } else if (field_46692.field_9632.field_41726) {
                     this.field_9396 = false;
                  }
            }

            this.field_9395 = field_46692.field_9632.field_29654;
            if (field_46692.field_9623 instanceof class_3431) {
               this.field_9393 = false;
            }

            if ((field_46692.field_9623 == null || field_46692.field_9623 instanceof class_3431 || field_46692.field_9623 instanceof class_5766)
               && this.field_9397.method_14772() > var4
               && (float)class_727.method_3328().method_3310().method_25303() > (float)var4 / 50.0F) {
               field_9392 = false;
               this.method_8193(this.method_42016("Mode").equalsIgnoreCase("FakeInv"));
            }

            for (class_6943 var9 : class_6943.values()) {
               if (field_46692.field_9632.field_3869.method_18878(8 - var9.method_31767()).method_35884()) {
                  if (class_2740.method_12361(8 - var9.method_31767())) {
                     return;
                  }
               } else if (this.method_8195(var9)) {
                  return;
               }
            }

            if (!this.field_9393 && !(field_46692.field_9623 instanceof class_3431) && this.field_9397.method_14772() > 0L) {
               this.field_9393 = true;
               field_46692.method_8614().method_4813(new class_1194(-1));
            }
         }
      }
   }

   private void method_8193(boolean var1) {
      for (class_6943 var7 : class_6943.values()) {
         if (field_46692.field_9632.field_3869.method_18878(8 - var7.method_31767()).method_35884()) {
            class_6098 var8 = field_46692.field_9632.field_3869.method_18878(8 - var7.method_31767()).method_35898();
            if (class_2740.method_12364(var8) && (!this.field_9396 || var7 != class_6943.field_35708)) {
               continue;
            }
         }

         for (int var12 = 9; var12 < 45; var12++) {
            if (field_46692.field_9632.field_3869.method_18878(var12).method_35884()) {
               class_6098 var9 = field_46692.field_9632.field_3869.method_18878(var12).method_35898();
               if (var9.method_27960() instanceof class_3286
                  && this.field_9396
                  && !(field_46692.field_9632.field_3853.method_31498(36 + class_6943.field_35708.method_31767()).method_27960() instanceof class_3286)) {
                  class_3286 var13 = (class_3286)var9.method_27960();
                  if (class_6943.field_35708 == var7
                     && (
                        !class_727.method_3328().method_3298().method_847(class_1853.class).method_42007("Fake Items")
                           || class_727.method_3328().method_3319().method_30523(var12) >= 1500L
                     )) {
                     this.method_8196(var1);
                     if (!(field_46692.field_9632.field_3853.method_31498(36 + var7.method_31767()).method_27960() instanceof class_221)) {
                        class_2740.method_12350(8 - var7.method_31767(), 0, true);
                     }

                     class_2740.method_12356(field_46692.field_9632.field_3869.field_19925, var12, 0, class_6269.field_32019, field_46692.field_9632, true);
                     this.field_9397.method_14773();
                     field_9392 = true;
                     if (this.method_42016("Elytra").equals("On Use")) {
                        field_46692.method_8614().method_4813(new class_2317(field_46692.field_9632, class_4127.field_20093));
                        field_46692.field_9632.method_37220(7, true);
                     }

                     if (class_727.method_3328().method_3298().method_847(class_1853.class).method_42002("Delay") > 0.0F) {
                        return;
                     }
                  }
               } else if (var9.method_27960() instanceof class_8228 && !this.field_9396) {
                  class_8228 var10 = (class_8228)var9.method_27960();
                  if (var10.method_37669() == var7
                     && class_2740.method_12364(var9)
                     && class_2740.method_12323(var9) > 0
                     && (
                        !class_727.method_3328().method_3298().method_847(class_1853.class).method_42007("Fake Items")
                           || class_727.method_3328().method_3319().method_30523(var12) >= 1500L
                     )) {
                     this.method_8196(var1);
                     class_2451 var11 = field_46692.field_9632.field_3853.method_31498(36 + var10.method_37669().method_31767()).method_27960();
                     if (!(var11 instanceof class_3286)) {
                        if (!(var11 instanceof class_221)) {
                           class_2740.method_12365(8 - var10.method_37669().method_31767());
                        }
                     } else {
                        class_2740.method_12350(8 - var7.method_31767(), 0, true);
                     }

                     class_2740.method_12356(field_46692.field_9632.field_3869.field_19925, var12, 0, class_6269.field_32019, field_46692.field_9632, true);
                     this.field_9397.method_14773();
                     field_9392 = true;
                     if (class_727.method_3328().method_3298().method_847(class_1853.class).method_42002("Delay") > 0.0F) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   private void method_8196(boolean var1) {
      if (var1 && this.field_9393 && !(field_46692.field_9623 instanceof class_3431) && class_3347.method_15349() <= class_412.field_1752.method_2055()) {
         field_46692.method_8614().method_4813(new class_8559(class_2105.field_10551));
         this.field_9393 = false;
      }
   }

   private boolean method_8195(class_6943 var1) {
      for (int var4 = 9; var4 < 45; var4++) {
         if (field_46692.field_9632.field_3869.method_18878(var4).method_35884()) {
            class_6098 var5 = field_46692.field_9632.field_3869.method_18878(var4).method_35898();
            class_2451 var6 = var5.method_27960();
            if (var6 instanceof class_8228) {
               class_8228 var7 = (class_8228)var6;
               if (var1 == var7.method_37669()) {
                  return true;
               }
            }
         }
      }

      return false;
   }
}

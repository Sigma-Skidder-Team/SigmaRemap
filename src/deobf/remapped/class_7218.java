package remapped;

public class class_7218 extends Module {
   private double[] field_37059 = new double[]{0.0, 0.0};
   private boolean field_37058;

   public class_7218() {
      super(Category.PLAYER, "AutoSprint", "Sprints for you");
      this.addSetting(new BooleanSetting("Keep Sprint", "Keep Sprinting after hitting a player", true));
   }

   @EventListen
   public void method_33059(class_5596 var1) {
      if (this.method_42015()) {
         SecondModule var4 = (SecondModule) SigmaMainClass.getInstance().getModuleManager().method_847(BlockFlyModule.class);
         Module var5 = var4.field_17664;
         if (var5 == null || !var5.method_42015() || !(var5 instanceof AACBlockFly) || var5.getBooleanValueByName("Haphe (AACAP)")) {
            if (mc.field_9632.field_29673 > 0.0F && !((BlockFlyModule) SigmaMainClass.getInstance().getModuleManager().method_847(BlockFlyModule.class)).method_17212()) {
               mc.field_9632.method_37140(true);
            } else {
               mc.field_9632.method_37140(false);
            }
         }
      }
   }

   @EventListen
   public void method_33060(class_8128 var1) {
      if (this.method_42015()
         && !(mc.field_9632.field_29673 <= 0.0F)
         && (!mc.field_9632.method_26554() || mc.field_9632.method_26576().method_27960() != class_4897.field_25206)
         && !((BlockFlyModule) SigmaMainClass.getInstance().getModuleManager().method_847(BlockFlyModule.class)).method_17212()) {
         class_9747 var4 = mc.field_9632.method_26561(class_7331.field_37465);
         float var5 = (float)(
               (var4.method_44996() + 0.03F + (double)(0.015F * (float)class_8865.method_40770())) / (double) mc.field_9632.field_3876.method_4229()
                  + 1.0
            )
            / 2.0F;
         var1.field_41637 = var5;
      }
   }

   @EventListen
   public void method_33058(class_3645 var1) {
      if (this.method_42015() && this.getBooleanValueByName("Keep Sprint")) {
         if (!var1.method_16971()) {
            if (this.field_37059.length == 2) {
               double var4 = this.field_37059[0] - mc.field_9632.method_37098().field_7336;
               double var6 = this.field_37059[1] - mc.field_9632.method_37098().field_7334;
               if (var4 != 0.0 || var6 != 0.0) {
                  mc.field_9632.method_37214(this.field_37059[0], mc.field_9632.method_37098().field_7333, this.field_37059[1]);
               }

               if (this.field_37058 && !mc.field_9632.method_37321()) {
                  mc.field_9632.method_37140(true);
               }
            }
         } else {
            this.field_37059[0] = mc.field_9632.method_37098().field_7336;
            this.field_37059[1] = mc.field_9632.method_37098().field_7334;
            this.field_37058 = mc.field_9632.method_37321();
         }
      }
   }
}

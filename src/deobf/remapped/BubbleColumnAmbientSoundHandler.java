package remapped;

public class BubbleColumnAmbientSoundHandler implements IAmbientSoundHandler {
   private static String[] field_38349;
   private final ClientPlayerEntity field_38350;
   private boolean field_38347;
   private boolean field_38348 = true;

   public BubbleColumnAmbientSoundHandler(ClientPlayerEntity var1) {
      this.field_38350 = var1;
   }

   @Override
   public void tick() {
      World var3 = this.field_38350.world;
      class_2522 var4 = var3.method_22549(this.field_38350.getBoundingBox().method_18899(0.0, -0.4F, 0.0).method_18924(0.001))
         .filter(var0 -> var0.method_8350(class_4783.field_23269))
         .findFirst()
         .orElse((class_2522)null);
      if (var4 == null) {
         this.field_38347 = false;
      } else {
         if (!this.field_38347 && !this.field_38348 && var4.method_8350(class_4783.field_23269) && !this.field_38350.method_37221()) {
            boolean var5 = var4.<Boolean>method_10313(class_6644.field_34381);
            if (!var5) {
               this.field_38350.method_37155(SoundEvents.field_2051, 1.0F, 1.0F);
            } else {
               this.field_38350.method_37155(SoundEvents.field_2761, 1.0F, 1.0F);
            }
         }

         this.field_38347 = true;
      }

      this.field_38348 = false;
   }
}

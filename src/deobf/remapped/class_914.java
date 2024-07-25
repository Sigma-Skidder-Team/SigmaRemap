package remapped;

public class class_914 extends Module {
   public float field_4691 = 1.0F;

   public class_914() {
      super(Category.RENDER, "Fullbright", "Makes you see in the dark");
      this.addSetting(new ModeSetting("Type", "Fullbright type", 0, "Normal"));
   }

   @Override
   public void method_42012() {
      if (!this.method_42015()) {
         mcInstance.field_9577.field_45391 = 1.0;
      }
   }

   @Override
   public void method_42006() {
      if (this.method_42016("Type").equals("Normal")) {
         mcInstance.field_9577.field_45391 = 999.0;
      }
   }

   @EventListen
   public void method_3924(class_5596 var1) {
      if (this.method_42015()) {
         mcInstance.field_9577.field_45391 = 999.0;
         if (mcInstance.field_9601 != null) {
            if (!this.method_42016("Type").equals("Normal")) {
               int var4 = 16;
               class_1331 var5 = new class_1331(
                     mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309(), mcInstance.field_9632.method_37156()
                  )
                  .method_6081();
               class_5990 var6 = mcInstance.field_9601.method_22556(var5);
               if (var6 != null && var5.method_12165() >= 0 && var5.method_12165() < 256 && !var6.method_27339()) {
                  var4 -= var6.method_28263(var5);
               }

               this.field_4691 = this.field_4691 + ((float)var4 - this.field_4691) * 0.2F;
               if (!(this.field_4691 < 1.5F)) {
                  mcInstance.field_9577.field_45391 = (double)Math.min(Math.max(1.0F, this.field_4691), 10.0F);
               }
            }
         }
      }
   }

   @Override
   public void method_42020() {
      mcInstance.field_9577.field_45391 = 1.0;
   }
}

package remapped;

public class class_5571 {
   private static String[] field_28309;
   private int field_28315 = 0;
   private int field_28308 = 0;
   private int field_28311 = 0;
   private int field_28310 = 0;
   private boolean field_28314 = false;
   private long field_28313 = System.currentTimeMillis();
   private float field_28307 = 1.0F;
   private MinecraftClient field_28312 = MinecraftClient.getInstance();

   public void method_25292() {
      SigmaMainClass.getInstance().getEventManager().subscribe2(this);
   }

   @EventListen
   private void method_25296(class_5596 var1) {
      this.field_28315++;
      this.field_28308++;
      this.field_28311++;
      this.field_28310++;
      if (!this.field_28312.thePlayer.onGround) {
         this.field_28308 = 0;
      }

      if (this.field_28312.field_9623 != null) {
         this.field_28315 = 0;
      }

      if (!class_8865.method_40772()) {
         this.field_28311 = 0;
         this.field_28314 = true;
      }

      if (this.field_28312.thePlayer.field_41697 <= 1) {
         this.field_28314 = false;
      }
   }

   @EventListen
   private void method_25298(class_2157 var1) {
      if (var1.method_10047() instanceof class_5955) {
         this.field_28310 = 0;
      }
   }

   @EventListen
   private void method_25297(PacketEvent var1) {
      if (var1.method_557() instanceof class_7573) {
         long var4 = System.currentTimeMillis() - this.field_28313;
         this.field_28307 = Math.min(1.05F, Math.max(0.0F, 15000.0F / (float)var4));
         this.field_28313 = System.currentTimeMillis();
      }
   }

   public float method_25300() {
      return this.field_28307;
   }

   public float method_25295() {
      return this.method_25300() * 20.0F;
   }

   public int method_25293() {
      return this.field_28308;
   }

   public boolean method_25294() {
      return this.field_28314;
   }

   public int method_25301() {
      return this.field_28308;
   }

   public int method_25291() {
      return this.field_28315;
   }

   public int method_25303() {
      return this.field_28310;
   }

   public void method_25302() {
      this.field_28308 = 0;
      this.field_28315 = 0;
   }
}

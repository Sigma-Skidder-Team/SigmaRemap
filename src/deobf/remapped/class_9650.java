package remapped;

public class class_9650 extends class_2833 {
   private static String[] field_49155;
   private float field_49156;

   public class_9650(class_9825 var1, MobEntity var2) {
      super(var2);
      this.field_49154 = var1;
      this.field_49156 = 0.1F;
   }

   @Override
   public void method_12883() {
      if (this.field_49154.field_41744) {
         this.field_49154.field_41701 += 180.0F;
         this.field_49156 = 0.1F;
      }

      float var3 = (float)(class_9825.method_45284(this.field_49154).field_7336 - this.field_49154.method_37302());
      float var4 = (float)(class_9825.method_45284(this.field_49154).field_7333 - this.field_49154.method_37309());
      float var5 = (float)(class_9825.method_45284(this.field_49154).field_7334 - this.field_49154.method_37156());
      double var6 = (double)class_9299.method_42843(var3 * var3 + var5 * var5);
      double var8 = 1.0 - (double)class_9299.method_42804(var4 * 0.7F) / var6;
      var3 = (float)((double)var3 * var8);
      var5 = (float)((double)var5 * var8);
      var6 = (double)class_9299.method_42843(var3 * var3 + var5 * var5);
      double var10 = (double)class_9299.method_42843(var3 * var3 + var5 * var5 + var4 * var4);
      float var12 = this.field_49154.field_41701;
      float var13 = (float)class_9299.method_42821((double)var5, (double)var3);
      float var14 = class_9299.method_42810(this.field_49154.field_41701 + 90.0F);
      float var15 = class_9299.method_42810(var13 * (180.0F / (float)Math.PI));
      this.field_49154.field_41701 = class_9299.method_42844(var14, var15, 4.0F) - 90.0F;
      this.field_49154.field_29605 = this.field_49154.field_41701;
      if (!(class_9299.method_42813(var12, this.field_49154.field_41701) < 3.0F)) {
         this.field_49156 = class_9299.method_42831(this.field_49156, 0.2F, 0.025F);
      } else {
         this.field_49156 = class_9299.method_42831(this.field_49156, 1.8F, 0.005F * (1.8F / this.field_49156));
      }

      float var16 = (float)(-(class_9299.method_42821((double)(-var4), var6) * 180.0F / (float)Math.PI));
      this.field_49154.field_41755 = var16;
      float var17 = this.field_49154.field_41701 + 90.0F;
      double var18 = (double)(this.field_49156 * class_9299.method_42840(var17 * (float) (Math.PI / 180.0))) * Math.abs((double)var3 / var10);
      double var20 = (double)(this.field_49156 * class_9299.method_42818(var17 * (float) (Math.PI / 180.0))) * Math.abs((double)var5 / var10);
      double var22 = (double)(this.field_49156 * class_9299.method_42818(var16 * (float) (Math.PI / 180.0))) * Math.abs((double)var4 / var10);
      class_1343 var24 = this.field_49154.method_37098();
      this.field_49154.method_37215(var24.method_6215(new class_1343(var18, var22, var20).method_6194(var24).method_6209(0.2)));
   }
}

package remapped;

public class class_5595 extends class_7164<class_6092, class_7916<class_6092>> {
   public static final Identifier field_28393 = new Identifier(field_28394[0] + class_5276.field_26968.method_12948().method_21456() + field_28394[1]);
   public static final Identifier[] field_28392 = class_5276.field_26969
      .stream()
      .<Identifier>map(var0 -> new Identifier("textures/" + var0.method_12948().method_21456() + ".png"))
      .<Identifier>toArray(Identifier[]::new);

   public class_5595(EntityRenderDispatcher var1) {
      super(var1, new class_7916<class_6092>(), 0.0F);
      this.method_29100(new class_5994(this));
   }

   public Vector3d method_25402(class_6092 var1, float var2) {
      int var5 = var1.method_27925();
      if (var5 > 0 && var1.method_27918()) {
         BlockPos var6 = var1.method_27906();
         BlockPos var7 = var1.method_27921();
         double var8 = (double)((float)var5 - var2) / 6.0;
         var8 *= var8;
         double var10 = (double)(var6.getX() - var7.getX()) * var8;
         double var12 = (double)(var6.getY() - var7.getY()) * var8;
         double var14 = (double)(var6.getZ() - var7.getZ()) * var8;
         return new Vector3d(-var10, -var12, -var14);
      } else {
         return super.method_32555(var1, var2);
      }
   }

   public boolean method_25400(class_6092 var1, class_2359 var2, double var3, double var5, double var7) {
      if (!super.method_32863(var1, var2, var3, var5, var7)) {
         if (var1.method_27925() > 0 && var1.method_27918()) {
            Vector3d var11 = Vector3d.method_6205(var1.method_27906());
            Vector3d var12 = Vector3d.method_6205(var1.method_27921());
            if (var2.method_10824(new Box(var12.field_7336, var12.field_7333, var12.field_7334, var11.field_7336, var11.field_7333, var11.field_7334))) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public Identifier method_25401(class_6092 var1) {
      return var1.method_27909() != null ? field_28392[var1.method_27909().method_41794()] : field_28393;
   }

   public void method_25399(class_6092 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4 + 180.0F, var5);
      var2.method_36065(0.0, 0.5, 0.0);
      var2.method_36060(var1.method_27914().method_1046().method_1026());
      var2.method_36065(0.0, -0.5, 0.0);
   }
}

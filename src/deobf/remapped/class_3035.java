package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_3035<T extends LivingEntity, M extends class_2344<T>, A extends class_2344<T>> extends class_4171<T, M> {
   private static final Map<String, Identifier> field_14900 = Maps.newHashMap();
   private final A field_14901;
   private final A field_14898;

   public class_3035(class_2514<T, M> var1, A var2, A var3) {
      super(var1);
      this.field_14901 = (A)var2;
      this.field_14898 = (A)var3;
   }

   public void method_13866(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.method_13872(var1, var2, (T)var4, class_6943.field_35708, var3, this.method_13869(class_6943.field_35708));
      this.method_13872(var1, var2, (T)var4, class_6943.field_35698, var3, this.method_13869(class_6943.field_35698));
      this.method_13872(var1, var2, (T)var4, class_6943.field_35700, var3, this.method_13869(class_6943.field_35700));
      this.method_13872(var1, var2, (T)var4, class_6943.field_35704, var3, this.method_13869(class_6943.field_35704));
   }

   private void method_13872(class_7966 var1, class_2565 var2, T var3, class_6943 var4, int var5, A var6) {
      ItemStack var9 = var3.method_26520(var4);
      if (var9.method_27960() instanceof class_8228) {
         class_8228 var10 = (class_8228)var9.method_27960();
         if (var10.method_37669() == var4) {
            if (class_7860.field_40161.method_45472()) {
               var6 = this.method_13867((T)var3, var9, var4, (A)var6);
            }

            this.method_19347().method_10742(var6);
            this.method_13871((A)var6, var4);
            this.method_13865(var4);
            boolean var11 = var9.method_27977();
            if (!(var10 instanceof class_9168)) {
               this.method_13868(var1, var2, var5, var11, (A)var6, 1.0F, 1.0F, 1.0F, this.method_13874(var3, var9, var4, (String)null));
            } else {
               int var12 = ((class_9168)var10).method_42261(var9);
               float var13 = (float)(var12 >> 16 & 0xFF) / 255.0F;
               float var14 = (float)(var12 >> 8 & 0xFF) / 255.0F;
               float var15 = (float)(var12 & 0xFF) / 255.0F;
               this.method_13868(var1, var2, var5, var11, (A)var6, var13, var14, var15, this.method_13874(var3, var9, var4, (String)null));
               this.method_13868(var1, var2, var5, var11, (A)var6, 1.0F, 1.0F, 1.0F, this.method_13874(var3, var9, var4, "overlay"));
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_13871(A var1, class_6943 var2) {
      var1.method_10741(false);
      switch (var2) {
         case field_35704:
            var1.field_11696.field_8200 = true;
            var1.field_11695.field_8200 = true;
            break;
         case field_35708:
            var1.field_11704.field_8200 = true;
            var1.field_11705.field_8200 = true;
            var1.field_11701.field_8200 = true;
            break;
         case field_35698:
            var1.field_11704.field_8200 = true;
            var1.field_11706.field_8200 = true;
            var1.field_11703.field_8200 = true;
            break;
         case field_35700:
            var1.field_11706.field_8200 = true;
            var1.field_11703.field_8200 = true;
      }
   }

   private void method_13870(
      class_7966 var1, class_2565 var2, int var3, class_8228 var4, boolean var5, A var6, boolean var7, float var8, float var9, float var10, String var11
   ) {
      this.method_13868(var1, var2, var3, var5, (A)var6, var8, var9, var10, this.method_13873(var4, var7, var11));
   }

   private void method_13868(class_7966 var1, class_2565 var2, int var3, boolean var4, A var5, float var6, float var7, float var8, Identifier var9) {
      class_7907 var12 = ItemRenderer.method_40282(var2, RenderLayer.method_16749(var9), false, var4);
      var5.method_45499(var1, var12, var3, class_5367.field_27381, var6, var7, var8, 1.0F);
   }

   private A method_13869(class_6943 var1) {
      return !this.method_13865(var1) ? this.field_14898 : this.field_14901;
   }

   private boolean method_13865(class_6943 var1) {
      return var1 == class_6943.field_35698;
   }

   private Identifier method_13873(class_8228 var1, boolean var2, String var3) {
      String var6 = "textures/models/armor/" + var1.method_37667().method_22186() + "_layer_" + (!var2 ? 1 : 2) + (var3 != null ? "_" + var3 : "") + ".png";
      return field_14900.computeIfAbsent(var6, Identifier::new);
   }

   public A method_13867(T var1, ItemStack var2, class_6943 var3, A var4) {
      return (A)(!class_7860.field_40132.method_3596() ? var4 : class_7860.field_40132.method_3582(var1, var2, var3, var4));
   }

   public Identifier method_13874(Entity var1, ItemStack var2, class_6943 var3, String var4) {
      class_8228 var7 = (class_8228)var2.method_27960();
      String var8 = var7.method_37667().method_22186();
      String var9 = "minecraft";
      int var10 = var8.indexOf(58);
      if (var10 != -1) {
         var9 = var8.substring(0, var10);
         var8 = var8.substring(var10 + 1);
      }

      String var11 = String.format(
         "%s:textures/models/armor/%s_layer_%d%s.png", var9, var8, !this.method_13865(var3) ? 1 : 2, var4 != null ? String.format("_%s", var4) : ""
      );
      if (class_7860.field_39899.method_3596()) {
         var11 = class_7860.method_35576(class_7860.field_39899, var1, var2, var11, var3, var4);
      }

      Identifier var12 = field_14900.get(var11);
      if (var12 == null) {
         var12 = new Identifier(var11);
         field_14900.put(var11, var12);
      }

      if (Config.method_14390()) {
         var12 = class_3290.method_15106(var2, var3, var4, var12);
      }

      return var12;
   }
}

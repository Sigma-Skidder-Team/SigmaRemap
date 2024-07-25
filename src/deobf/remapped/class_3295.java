package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;

public class class_3295<T extends class_5834 & class_3449, M extends class_6521<T> & class_6582> extends class_4171<T, M> implements class_6491 {
   private static final Int2ObjectMap<Identifier> field_16305 = Util.<Int2ObjectMap<Identifier>>method_44659(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(1, new Identifier("stone"));
      var0.put(2, new Identifier("iron"));
      var0.put(3, new Identifier("gold"));
      var0.put(4, new Identifier("emerald"));
      var0.put(5, new Identifier("diamond"));
   });
   private final Object2ObjectMap<class_8853, class_1646> field_16310 = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<class_4466, class_1646> field_16308 = new Object2ObjectOpenHashMap();
   private final class_550 field_16306;
   private final String field_16307;

   public class_3295(class_2514<T, M> var1, class_550 var2, String var3) {
      super(var1);
      this.field_16306 = var2;
      this.field_16307 = var3;
      var2.method_2649(this);
   }

   public void method_15114(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method_37109()) {
         class_3047 var13 = ((class_3449)var4).method_15891();
         class_8853 var14 = var13.method_13912();
         class_4466 var15 = var13.method_13910();
         class_1646 var16 = this.method_15115(this.field_16310, "type", class_8669.field_44375, var14);
         class_1646 var17 = this.method_15115(this.field_16308, "profession", class_8669.field_44425, var15);
         class_6521 var18 = this.method_19347();
         ((class_6582)var18).method_30080(var17 == class_1646.field_8566 || var17 == class_1646.field_8567 && var16 != class_1646.field_8565);
         Identifier var19 = this.method_15116("type", class_8669.field_44375.method_39797(var14));
         method_19348(var18, var19, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
         ((class_6582)var18).method_30080(true);
         if (var15 != class_4466.field_21775 && !var4.method_26449()) {
            Identifier var20 = this.method_15116("profession", class_8669.field_44425.method_39797(var15));
            method_19348(var18, var20, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
            if (var15 != class_4466.field_21771) {
               Identifier var21 = this.method_15116(
                  "profession_level", (Identifier)field_16305.get(class_9299.method_42829(var13.method_13906(), 1, field_16305.size()))
               );
               method_19348(var18, var21, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private Identifier method_15116(String var1, Identifier var2) {
      return new Identifier(var2.method_21461(), "textures/entity/" + this.field_16307 + "/" + var1 + "/" + var2.method_21456() + ".png");
   }

   public <K> class_1646 method_15115(Object2ObjectMap<K, class_1646> var1, String var2, class_3991<K> var3, K var4) {
      return (class_1646)var1.computeIfAbsent(var4, var4x -> {
         try (class_4038 var7 = this.field_16306.method_35458(this.method_15116(var2, var3.method_39797(var4)))) {
            class_2002 var9 = var7.<class_2002>method_18577(class_2002.field_10167);
            if (var9 != null) {
               return var9.method_9295();
            }
         } catch (IOException var23) {
         }

         return class_1646.field_8566;
      });
   }

   @Override
   public void method_29609(class_7832 var1) {
      this.field_16308.clear();
      this.field_16310.clear();
   }
}

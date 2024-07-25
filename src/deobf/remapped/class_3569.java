package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class class_3569 {
   public final Map<class_133<?>, class_2255<?>> field_17471 = Maps.newHashMap();
   public static final class_3569 field_17468 = new class_3569();
   private final class_9633 field_17465 = new class_9633(256);
   private TextRenderer field_17464;
   public TextureManager field_17470;
   public World field_17466;
   public Camera field_17463;
   public class_7474 field_17467;
   public class_3757 field_17469;

   private class_3569() {
      this.method_16589(class_133.field_349, new class_3913(this));
      this.method_16589(class_133.field_379, new class_1233(this));
      this.method_16589(class_133.field_364, new class_9613(this));
      this.method_16589(class_133.field_361, new class_4732<class_7099>(this));
      this.method_16589(class_133.field_371, new class_4732<class_9180>(this));
      this.method_16589(class_133.field_373, new class_4732<class_1962>(this));
      this.method_16589(class_133.field_384, new class_4293(this));
      this.method_16589(class_133.field_360, new class_7130(this));
      this.method_16589(class_133.field_362, new class_7260<class_9795>(this));
      this.method_16589(class_133.field_354, new class_8674(this));
      this.method_16589(class_133.field_377, new class_1227(this));
      this.method_16589(class_133.field_386, new class_903(this));
      this.method_16589(class_133.field_382, new class_9429(this));
      this.method_16589(class_133.field_359, new class_373(this));
      this.method_16589(class_133.field_378, new class_6963(new class_7916(), this));
      this.method_16589(class_133.field_374, new class_1365(this));
      this.method_16589(class_133.field_375, new class_5611(this));
      this.method_16589(class_133.field_350, new class_5420(this));
      this.method_16589(class_133.field_365, new class_4229(this));
   }

   private <E extends class_3757> void method_16589(class_133<E> var1, class_2255<E> var2) {
      this.field_17471.put(var1, var2);
   }

   @Nullable
   public <E extends class_3757> class_2255<E> method_16595(E var1) {
      return (class_2255<E>)this.field_17471.get(var1.method_17405());
   }

   public void method_16590(World var1, TextureManager var2, TextRenderer var3, Camera var4, class_7474 var5) {
      if (this.field_17466 != var1) {
         this.method_16588(var1);
      }

      this.field_17470 = var2;
      this.field_17463 = var4;
      this.field_17464 = var3;
      this.field_17467 = var5;
   }

   public <E extends class_3757> void method_16586(E var1, float var2, class_7966 var3, class_2565 var4) {
      if (class_1343.method_6216(var1.method_17399()).method_6222(this.field_17463.method_41627(), var1.method_17404())) {
         class_2255 var7 = this.<class_3757>method_16595(var1);
         if (var7 != null && var1.method_17392() && var1.method_17405().method_448(var1.method_17403().method_8360())) {
            method_16593(var1, () -> method_16585(var7, var1, var2, var3, var4));
         }
      }
   }

   private static <T extends class_3757> void method_16585(class_2255<T> var0, T var1, float var2, class_7966 var3, class_2565 var4) {
      World var7 = var1.method_17402();
      int var8;
      if (var7 == null) {
         var8 = 15728880;
      } else {
         var8 = WorldRenderer.method_20002(var7, var1.method_17399());
      }

      if (class_5052.method_23281()) {
         class_5052.method_23286();
      }

      var0.method_10364(var1, var2, var3, var4, var8, class_5367.field_27381);
      if (class_5052.method_23281()) {
         if (class_5052.method_23269()) {
            class_5052.method_23282();
            var0.method_10364(var1, var2, var3, var4, class_5778.field_29187, class_5367.field_27381);
            class_5052.method_23278();
         }

         class_5052.method_23275();
      }
   }

   public <E extends class_3757> boolean method_16592(E var1, class_7966 var2, class_2565 var3, int var4, int var5) {
      class_2255 var8 = this.<class_3757>method_16595(var1);
      if (var8 != null) {
         method_16593(var1, () -> {
            this.field_17469 = var1;
            if (class_5052.method_23281()) {
               class_5052.method_23286();
            }

            var8.method_10364(var1, 0.0F, var2, var3, var4, var5);
            if (class_5052.method_23281()) {
               if (class_5052.method_23269()) {
                  class_5052.method_23282();
                  var8.method_10364(var1, 0.0F, var2, var3, class_5778.field_29187, var5);
                  class_5052.method_23278();
               }

               class_5052.method_23275();
            }

            this.field_17469 = null;
         });
         return false;
      } else {
         return true;
      }
   }

   private static void method_16593(class_3757 var0, Runnable var1) {
      try {
         var1.run();
      } catch (Throwable var7) {
         class_159 var5 = class_159.method_643(var7, "Rendering Block Entity");
         class_6544 var6 = var5.method_639("Block Entity Details");
         var0.method_17398(var6);
         throw new class_3297(var5);
      }
   }

   public void method_16588(World var1) {
      this.field_17466 = var1;
      if (var1 == null) {
         this.field_17463 = null;
      }
   }

   public TextRenderer method_16591() {
      return this.field_17464;
   }

   public class_2255 method_16594(class_133 var1) {
      return this.field_17471.get(var1);
   }

   public synchronized <T extends class_3757> void method_16596(class_133<T> var1, class_2255<? super T> var2) {
      this.field_17471.put(var1, var2);
   }
}

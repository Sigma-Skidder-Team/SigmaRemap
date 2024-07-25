package remapped;

import java.util.Objects;
import java.util.function.Function;

public class class_2843 {
   private final Identifier field_13941;
   private final Identifier field_13943;
   private RenderLayer field_13944;

   public class_2843(Identifier var1, Identifier var2) {
      this.field_13941 = var1;
      this.field_13943 = var2;
   }

   public Identifier method_12946() {
      return this.field_13941;
   }

   public Identifier method_12948() {
      return this.field_13943;
   }

   public class_5155 method_12947() {
      class_5155 var3 = MinecraftClient.getInstance().method_8490(this.method_12946()).apply(this.method_12948());
      if (class_5052.method_23281()) {
         var3 = class_5052.method_23271(var3);
      }

      return var3;
   }

   public RenderLayer method_12945(Function<Identifier, RenderLayer> var1) {
      if (this.field_13944 == null) {
         this.field_13944 = (RenderLayer)var1.apply(this.field_13941);
      }

      return this.field_13944;
   }

   public class_7907 method_12943(class_2565 var1, Function<Identifier, RenderLayer> var2) {
      class_5155 var5 = this.method_12947();
      RenderLayer var6 = this.method_12945(var2);
      if (var5.field_26528 && var6.method_16717()) {
         var6 = RenderLayer.method_16747(this.field_13941);
      }

      return var5.method_23601(var1.method_11645(var6));
   }

   public class_7907 method_12944(class_2565 var1, Function<Identifier, RenderLayer> var2, boolean var3) {
      return this.method_12947().method_23601(class_8765.method_40275(var1, this.method_12945(var2), true, var3));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_2843 var4 = (class_2843)var1;
         return this.field_13941.equals(var4.field_13941) && this.field_13943.equals(var4.field_13943);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_13941, this.field_13943);
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.field_13941 + ", texture=" + this.field_13943 + '}';
   }
}
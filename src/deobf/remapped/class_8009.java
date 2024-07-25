package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class class_8009 {
   private final class_1331 field_41033;
   private final class_236 field_41031;
   private int field_41029;
   private final Runnable field_41032;

   public static Codec<class_8009> method_36338(Runnable var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
                  class_1331.field_7305.fieldOf("pos").forGetter(var0xx -> var0xx.field_41033),
                  class_8669.field_44430.fieldOf("type").forGetter(var0xx -> var0xx.field_41031),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(var0xx -> var0xx.field_41029),
                  RecordCodecBuilder.point(var0)
               )
               .apply(var1, class_8009::new)
      );
   }

   private class_8009(class_1331 var1, class_236 var2, int var3, Runnable var4) {
      this.field_41033 = var1.method_6072();
      this.field_41031 = var2;
      this.field_41029 = var3;
      this.field_41032 = var4;
   }

   public class_8009(class_1331 var1, class_236 var2, Runnable var3) {
      this(var1, var2, var2.method_1000(), var3);
   }

   public boolean method_36339() {
      if (this.field_41029 > 0) {
         this.field_41029--;
         this.field_41032.run();
         return true;
      } else {
         return false;
      }
   }

   public boolean method_36342() {
      if (this.field_41029 < this.field_41031.method_1000()) {
         this.field_41029++;
         this.field_41032.run();
         return true;
      } else {
         return false;
      }
   }

   public boolean method_36340() {
      return this.field_41029 > 0;
   }

   public boolean method_36343() {
      return this.field_41029 != this.field_41031.method_1000();
   }

   public class_1331 method_36337() {
      return this.field_41033;
   }

   public class_236 method_36341() {
      return this.field_41031;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? Objects.equals(this.field_41033, ((class_8009)var1).field_41033) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.field_41033.hashCode();
   }
}

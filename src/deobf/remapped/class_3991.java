package remapped;

import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nonnull;

public class class_3991<T> extends class_5383<T> {
   private static String[] field_19394;
   private final Identifier field_19395;
   private T field_19396;

   public class_3991(String var1, class_5621<? extends class_8669<T>> var2, Lifecycle var3) {
      super(var2, var3);
      this.field_19395 = new Identifier(var1);
   }

   @Override
   public <V extends T> V method_29380(int var1, class_5621<T> var2, V var3, Lifecycle var4) {
      if (this.field_19395.equals(var2.method_25499())) {
         this.field_19396 = (T)var3;
      }

      return super.<V>method_29380(var1, var2, (V)var3, var4);
   }

   @Override
   public int method_14041(T var1) {
      int var4 = super.method_14041((T)var1);
      return var4 != -1 ? var4 : super.method_14041(this.field_19396);
   }

   @Nonnull
   @Override
   public Identifier method_39797(T var1) {
      Identifier var4 = super.method_39797((T)var1);
      return var4 != null ? var4 : this.field_19395;
   }

   @Nonnull
   @Override
   public T method_39806(Identifier var1) {
      Object var4 = super.method_39806(var1);
      return (T)(var4 != null ? var4 : this.field_19396);
   }

   @Override
   public Optional<T> method_39794(Identifier var1) {
      return Optional.<T>ofNullable(super.method_39806(var1));
   }

   @Nonnull
   @Override
   public T method_14040(int var1) {
      Object var4 = super.method_14040(var1);
      return (T)(var4 != null ? var4 : this.field_19396);
   }

   @Nonnull
   @Override
   public T method_24525(Random var1) {
      Object var4 = super.method_24525(var1);
      return (T)(var4 != null ? var4 : this.field_19396);
   }

   public Identifier method_18397() {
      return this.field_19395;
   }
}

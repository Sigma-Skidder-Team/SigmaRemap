package net.minecraft.util.text;

import com.google.common.collect.ImmutableList;
import mapped.Class2341;

import java.util.List;
import java.util.Optional;

public interface ITextProperties {
   Optional<Class2341> field_240650_b_ = Optional.<Class2341>of(Class2341.field16010);
   ITextProperties field_240651_c_ = new ITextProperties$1();

   <T> Optional<T> func_230438_a_(ITextProperties$ITextAcceptor<T> var1);

   <T> Optional<T> func_230439_a_(ITextProperties$IStyledTextAcceptor<T> var1, Style var2);

   static ITextProperties func_240652_a_(String p_240652_0_) {
      return new ITextProperties$2(p_240652_0_);
   }

   static ITextProperties func_240653_a_(String p_240653_0_, Style p_240653_1_) {
      return new ITextProperties$3(p_240653_0_, p_240653_1_);
   }

   static ITextProperties func_240655_a_(ITextProperties... p_240655_0_) {
      return func_240654_a_(ImmutableList.copyOf(p_240655_0_));
   }

   static ITextProperties func_240654_a_(List<ITextProperties> p_240654_0_) {
      return new ITextProperties$4(p_240654_0_);
   }

   default String getString() {
      StringBuilder var3 = new StringBuilder();
      this.func_230438_a_(p_241754_1_ -> {
         var3.append(p_241754_1_);
         return Optional.empty();
      });
      return var3.toString();
   }
}

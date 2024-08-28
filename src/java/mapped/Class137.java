package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class Class137 extends Class128 {
   private final boolean field460;
   private final List<ITextComponent> field461;
   private final Class2063 field462;

   public Class137(Class122[] var1, boolean var2, List<ITextComponent> var3, Class2063 var4) {
      super(var1);
      this.field460 = var2;
      this.field461 = ImmutableList.copyOf(var3);
      this.field462 = var4;
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38635;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return this.field462 == null ? ImmutableSet.of() : ImmutableSet.of(this.field462.method8717());
   }

   @Override
   public Class8848 method371(Class8848 var1, Class7812 var2) {
      Class41 var5 = this.method402(var1, !this.field461.isEmpty());
      if (var5 != null) {
         if (this.field460) {
            var5.clear();
         }

         UnaryOperator<ITextComponent> var6 = Class132.method384(var2, this.field462);
         this.field461.stream().map(var6).map(ITextComponent$Serializer::toJson).map(Class40::method150).forEach(var5::add);
      }

      return var1;
   }

   @Nullable
   private Class41 method402(Class8848 var1, boolean var2) {
      Class39 var5;
      if (!var1.method32141()) {
         if (!var2) {
            return null;
         }

         var5 = new Class39();
         var1.method32148(var5);
      } else {
         var5 = var1.method32142();
      }

      Class39 var6;
      if (!var5.method119("display", 10)) {
         if (!var2) {
            return null;
         }

         var6 = new Class39();
         var5.method99("display", var6);
      } else {
         var6 = var5.method130("display");
      }

      if (!var6.method119("Lore", 9)) {
         if (!var2) {
            return null;
         } else {
            Class41 var7 = new Class41();
            var6.method99("Lore", var7);
            return var7;
         }
      } else {
         return var6.method131("Lore", 8);
      }
   }

   // $VF: synthetic method
   public static boolean method403(Class137 var0) {
      return var0.field460;
   }

   // $VF: synthetic method
   public static List<ITextComponent> method404(Class137 var0) {
      return var0.field461;
   }

   // $VF: synthetic method
   public static Class2063 method405(Class137 var0) {
      return var0.field462;
   }
}

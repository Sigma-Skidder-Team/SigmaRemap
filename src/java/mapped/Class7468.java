package mapped;

import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class Class7468 {
   private final BlockPos field32104;
   private final Class112 field32105;
   private final ITextComponent field32106;

   public Class7468(BlockPos var1, Class112 var2, ITextComponent var3) {
      this.field32104 = var1;
      this.field32105 = var2;
      this.field32106 = var3;
   }

   public static Class7468 method24183(Class39 var0) {
      BlockPos var3 = Class8354.method29283(var0.method130("Pos"));
      Class112 var4 = Class112.method316(var0.method126("Color"), Class112.field386);
      IFormattableTextComponent var5 = !var0.method118("Name") ? null : ITextComponent$Serializer.func_240643_a_(var0.method126("Name"));
      return new Class7468(var3, var4, var5);
   }

   @Nullable
   public static Class7468 method24184(Class1665 var0, BlockPos var1) {
      Class944 var4 = var0.method6759(var1);
      if (!(var4 instanceof Class958)) {
         return null;
      } else {
         Class958 var5 = (Class958)var4;
         Class112 var6 = var5.method3894(() -> var0.method6738(var1));
         ITextComponent var7 = !var5.method3381() ? null : var5.method3380();
         return new Class7468(var1, var6, var7);
      }
   }

   public BlockPos method24185() {
      return this.field32104;
   }

   public Class2223 method24186() {
      switch (Class7178.field30861[this.field32105.ordinal()]) {
         case 1:
            return Class2223.field14526;
         case 2:
            return Class2223.field14527;
         case 3:
            return Class2223.field14528;
         case 4:
            return Class2223.field14529;
         case 5:
            return Class2223.field14530;
         case 6:
            return Class2223.field14531;
         case 7:
            return Class2223.field14532;
         case 8:
            return Class2223.field14533;
         case 9:
            return Class2223.field14534;
         case 10:
            return Class2223.field14535;
         case 11:
            return Class2223.field14536;
         case 12:
            return Class2223.field14537;
         case 13:
            return Class2223.field14538;
         case 14:
            return Class2223.field14539;
         case 15:
            return Class2223.field14540;
         case 16:
         default:
            return Class2223.field14541;
      }
   }

   @Nullable
   public ITextComponent method24187() {
      return this.field32106;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class7468 var4 = (Class7468)var1;
         return Objects.equals(this.field32104, var4.field32104) && this.field32105 == var4.field32105 && Objects.equals(this.field32106, var4.field32106);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field32104, this.field32105, this.field32106);
   }

   public Class39 method24188() {
      Class39 var3 = new Class39();
      var3.method99("Pos", Class8354.method29284(this.field32104));
      var3.method109("Color", this.field32105.method310());
      if (this.field32106 != null) {
         var3.method109("Name", ITextComponent$Serializer.toJson(this.field32106));
      }

      return var3;
   }

   public String method24189() {
      return "banner-" + this.field32104.method8304() + "," + this.field32104.getY() + "," + this.field32104.method8306();
   }
}

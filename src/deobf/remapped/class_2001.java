package remapped;

import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class class_2001 {
   private final class_1331 field_10165;
   private final class_9077 field_10163;
   private final ITextComponent field_10166;

   public class_2001(class_1331 var1, class_9077 var2, ITextComponent var3) {
      this.field_10165 = var1;
      this.field_10163 = var2;
      this.field_10166 = var3;
   }

   public static class_2001 method_9288(CompoundNBT var0) {
      class_1331 var3 = class_4338.method_20189(var0.getCompound("Pos"));
      class_9077 var4 = class_9077.method_41788(var0.method_25965("Color"), class_9077.field_46493);
      IFormattableTextComponent var5 = !var0.method_25938("Name") ? null : ITextComponent$class_40.func_240643_a_(var0.method_25965("Name"));
      return new class_2001(var3, var4, var5);
   }

   @Nullable
   public static class_2001 method_9293(class_6163 var0, class_1331 var1) {
      class_3757 var4 = var0.method_28260(var1);
      if (!(var4 instanceof class_8837)) {
         return null;
      } else {
         class_8837 var5 = (class_8837)var4;
         class_9077 var6 = var5.method_40659(() -> var0.method_28262(var1));
         ITextComponent var7 = !var5.method_45507() ? null : var5.method_45508();
         return new class_2001(var1, var6, var7);
      }
   }

   public class_1331 method_9287() {
      return this.field_10165;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_8086 method_9292() {
      switch (this.field_10163) {
         case field_46493:
            return class_8086.field_41399;
         case field_46486:
            return class_8086.field_41411;
         case field_46480:
            return class_8086.field_41395;
         case field_46491:
            return class_8086.field_41417;
         case field_46477:
            return class_8086.field_41404;
         case field_46489:
            return class_8086.field_41396;
         case field_46495:
            return class_8086.field_41413;
         case field_46498:
            return class_8086.field_41402;
         case field_46503:
            return class_8086.field_41407;
         case field_46501:
            return class_8086.field_41406;
         case field_46499:
            return class_8086.field_41418;
         case field_46487:
            return class_8086.field_41408;
         case field_46479:
            return class_8086.field_41419;
         case field_46497:
            return class_8086.field_41398;
         case field_46494:
            return class_8086.field_41403;
         case field_46496:
         default:
            return class_8086.field_41409;
      }
   }

   @Nullable
   public ITextComponent method_9291() {
      return this.field_10166;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_2001 var4 = (class_2001)var1;
         return Objects.equals(this.field_10165, var4.field_10165)
            && this.field_10163 == var4.field_10163
            && Objects.equals(this.field_10166, var4.field_10166);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_10165, this.field_10163, this.field_10166);
   }

   public CompoundNBT method_9290() {
      CompoundNBT var3 = new CompoundNBT();
      var3.put("Pos", class_4338.method_20190(this.field_10165));
      var3.method_25941("Color", this.field_10163.method_41796());
      if (this.field_10166 != null) {
         var3.method_25941("Name", ITextComponent$class_40.toJson(this.field_10166));
      }

      return var3;
   }

   public String method_9294() {
      return "banner-" + this.field_10165.method_12173() + "," + this.field_10165.method_12165() + "," + this.field_10165.method_12185();
   }
}

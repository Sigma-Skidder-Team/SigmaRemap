package remapped;

import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_3245 {
   private static String[] field_16129;
   private final class_8086 field_16128;
   private byte field_16132;
   private byte field_16131;
   private byte field_16127;
   private final ITextComponent field_16130;

   public class_3245(class_8086 var1, byte var2, byte var3, byte var4, ITextComponent var5) {
      this.field_16128 = var1;
      this.field_16132 = var2;
      this.field_16131 = var3;
      this.field_16127 = var4;
      this.field_16130 = var5;
   }

   public byte method_14845() {
      return this.field_16128.method_36723();
   }

   public class_8086 method_14848() {
      return this.field_16128;
   }

   public byte method_14846() {
      return this.field_16132;
   }

   public byte method_14850() {
      return this.field_16131;
   }

   public byte method_14844() {
      return this.field_16127;
   }

   public boolean method_14851() {
      return this.field_16128.method_36719();
   }

   @Nullable
   public ITextComponent method_14847() {
      return this.field_16130;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof class_3245) {
            class_3245 var4 = (class_3245)var1;
            if (this.field_16128 == var4.field_16128) {
               if (this.field_16127 == var4.field_16127) {
                  if (this.field_16132 == var4.field_16132) {
                     return this.field_16131 == var4.field_16131 ? Objects.equals(this.field_16130, var4.field_16130) : false;
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_16128.method_36723();
      var3 = 31 * var3 + this.field_16132;
      var3 = 31 * var3 + this.field_16131;
      var3 = 31 * var3 + this.field_16127;
      return 31 * var3 + Objects.hashCode(this.field_16130);
   }
}

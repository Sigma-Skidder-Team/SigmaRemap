package remapped;

import com.google.common.collect.AbstractIterator;

public final class class_1698 extends AbstractIterator<class_2921> {
   private static String[] field_8783;
   private final class_240[] field_8772;
   private final class_2921 field_8784;
   private final int field_8773;
   private int field_8782;
   private int field_8780;
   private int field_8777;
   private int field_8781;
   private int field_8774;
   private int field_8775;

   public class_1698(class_240 var1, class_240 var2, class_1331 var3, int var4) {
      this.field_8776 = var1;
      this.field_8778 = var2;
      this.field_8779 = var3;
      this.field_8785 = var4;
      this.field_8772 = new class_240[]{this.field_8776, this.field_8778, this.field_8776.method_1046(), this.field_8778.method_1046()};
      this.field_8784 = this.field_8779.method_6089().method_13368(this.field_8778);
      this.field_8773 = 4 * this.field_8785;
      this.field_8782 = -1;
      this.field_8781 = this.field_8784.method_12173();
      this.field_8774 = this.field_8784.method_12165();
      this.field_8775 = this.field_8784.method_12185();
   }

   public class_2921 computeNext() {
      this.field_8784.method_13362(this.field_8781, this.field_8774, this.field_8775).method_13368(this.field_8772[(this.field_8782 + 4) % 4]);
      this.field_8781 = this.field_8784.method_12173();
      this.field_8774 = this.field_8784.method_12165();
      this.field_8775 = this.field_8784.method_12185();
      if (this.field_8777 >= this.field_8780) {
         if (this.field_8782 >= this.field_8773) {
            return (class_2921)this.endOfData();
         }

         this.field_8782++;
         this.field_8777 = 0;
         this.field_8780 = this.field_8782 / 2 + 1;
      }

      this.field_8777++;
      return this.field_8784;
   }
}

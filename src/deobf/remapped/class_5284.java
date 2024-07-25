package remapped;

import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_5284 extends class_5841 {
   public static final class_3265<class_5284> field_27025 = new class_5498();
   public static final class_5284 field_27023 = method_24120((byte)0);
   public static final class_5284 field_27026 = method_24120((byte)1);
   private final byte field_27027;

   private class_5284(byte var1) {
      this.field_27027 = var1;
   }

   public static class_5284 method_24120(byte var0) {
      return class_4437.method_20592()[128 + var0];
   }

   public static class_5284 method_24121(boolean var0) {
      return !var0 ? field_27023 : field_27026;
   }

   @Override
   public void method_38707(DataOutput var1) throws IOException {
      var1.writeByte(this.field_27027);
   }

   @Override
   public byte method_38706() {
      return 1;
   }

   @Override
   public class_3265<class_5284> method_38709() {
      return field_27025;
   }

   @Override
   public String toString() {
      return this.field_27027 + "b";
   }

   public class_5284 method_24119() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class_5284 && this.field_27027 == ((class_5284)var1).field_27027;
   }

   @Override
   public int hashCode() {
      return this.field_27027;
   }

   @Override
   public ITextComponent method_38712(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("b").mergeStyle(field_43007);
      return new StringTextComponent(String.valueOf(this.field_27027)).append(var5).mergeStyle(field_43005);
   }

   @Override
   public long method_26635() {
      return (long)this.field_27027;
   }

   @Override
   public int method_26636() {
      return this.field_27027;
   }

   @Override
   public short method_26640() {
      return (short)this.field_27027;
   }

   @Override
   public byte method_26641() {
      return this.field_27027;
   }

   @Override
   public double method_26642() {
      return (double)this.field_27027;
   }

   @Override
   public float method_26639() {
      return (float)this.field_27027;
   }

   @Override
   public Number method_26638() {
      return this.field_27027;
   }
}

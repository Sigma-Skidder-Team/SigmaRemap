package mapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class Class32 extends Class31 {
   public static final Class32 field60 = new Class32(0.0F);
   public static final Class7052<Class32> field61 = new Class7056();
   private final float field62;

   private Class32(float var1) {
      this.field62 = var1;
   }

   public static Class32 method90(float var0) {
      return var0 != 0.0F ? new Class32(var0) : field60;
   }

   @Override
   public void method73(DataOutput var1) throws IOException {
      var1.writeFloat(this.field62);
   }

   @Override
   public byte method74() {
      return 5;
   }

   @Override
   public Class7052<Class32> method75() {
      return field61;
   }

   @Override
   public String toString() {
      return this.field62 + "f";
   }

   public Class32 method79() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof Class32 && this.field62 == ((Class32)var1).field62;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.field62);
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("f").mergeStyle(field59);
      return new StringTextComponent(String.valueOf(this.field62)).append(var5).mergeStyle(field58);
   }

   @Override
   public long method83() {
      return (long)this.field62;
   }

   @Override
   public int method84() {
      return Class9679.method37767(this.field62);
   }

   @Override
   public short method85() {
      return (short)(Class9679.method37767(this.field62) & 65535);
   }

   @Override
   public byte method86() {
      return (byte)(Class9679.method37767(this.field62) & 0xFF);
   }

   @Override
   public double method87() {
      return (double)this.field62;
   }

   @Override
   public float method88() {
      return this.field62;
   }

   @Override
   public Number method89() {
      return this.field62;
   }
}

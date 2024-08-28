package mapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class Class37 extends Class31 {
   public static final Class7052<Class37> field75 = new Class7059();
   private final short field76;

   private Class37(short var1) {
      this.field76 = var1;
   }

   public static Class37 method96(short var0) {
      return var0 >= -128 && var0 <= 1024 ? Class9087.field41600[var0 + 128] : new Class37(var0);
   }

   @Override
   public void method73(DataOutput var1) throws IOException {
      var1.writeShort(this.field76);
   }

   @Override
   public byte method74() {
      return 2;
   }

   @Override
   public Class7052<Class37> method75() {
      return field75;
   }

   @Override
   public String toString() {
      return this.field76 + "s";
   }

   public Class37 method79() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof Class37 && this.field76 == ((Class37)var1).field76;
   }

   @Override
   public int hashCode() {
      return this.field76;
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("s").mergeStyle(field59);
      return new StringTextComponent(String.valueOf(this.field76)).append(var5).mergeStyle(field58);
   }

   @Override
   public long method83() {
      return (long)this.field76;
   }

   @Override
   public int method84() {
      return this.field76;
   }

   @Override
   public short method85() {
      return this.field76;
   }

   @Override
   public byte method86() {
      return (byte)(this.field76 & 255);
   }

   @Override
   public double method87() {
      return (double)this.field76;
   }

   @Override
   public float method88() {
      return (float)this.field76;
   }

   @Override
   public Number method89() {
      return this.field76;
   }

   // $VF: synthetic method
   public Class37(short var1, Class7059 var2) {
      this(var1);
   }
}

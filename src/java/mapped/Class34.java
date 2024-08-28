package mapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class Class34 extends Class31 {
   public static final Class34 field67 = new Class34(0.0);
   public static final Class7052<Class34> field68 = new Class7057();
   private final double field69;

   private Class34(double var1) {
      this.field69 = var1;
   }

   public static Class34 method93(double var0) {
      return var0 != 0.0 ? new Class34(var0) : field67;
   }

   @Override
   public void method73(DataOutput var1) throws IOException {
      var1.writeDouble(this.field69);
   }

   @Override
   public byte method74() {
      return 6;
   }

   @Override
   public Class7052<Class34> method75() {
      return field68;
   }

   @Override
   public String toString() {
      return this.field69 + "d";
   }

   public Class34 method79() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof Class34 && this.field69 == ((Class34)var1).field69;
   }

   @Override
   public int hashCode() {
      long var3 = Double.doubleToLongBits(this.field69);
      return (int)(var3 ^ var3 >>> 32);
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("d").mergeStyle(field59);
      return new StringTextComponent(String.valueOf(this.field69)).append(var5).mergeStyle(field58);
   }

   @Override
   public long method83() {
      return (long)Math.floor(this.field69);
   }

   @Override
   public int method84() {
      return Class9679.method37769(this.field69);
   }

   @Override
   public short method85() {
      return (short)(Class9679.method37769(this.field69) & 65535);
   }

   @Override
   public byte method86() {
      return (byte)(Class9679.method37769(this.field69) & 0xFF);
   }

   @Override
   public double method87() {
      return this.field69;
   }

   @Override
   public float method88() {
      return (float)this.field69;
   }

   @Override
   public Number method89() {
      return this.field69;
   }
}

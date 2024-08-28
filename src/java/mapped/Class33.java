package mapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class Class33 extends Class31 {
   public static final Class7052<Class33> field63 = new Class7063();
   public static final Class33 field64 = method91((byte)0);
   public static final Class33 field65 = method91((byte)1);
   private final byte field66;

   private Class33(byte var1) {
      this.field66 = var1;
   }

   public static Class33 method91(byte var0) {
      return Class8383.method29376()[128 + var0];
   }

   public static Class33 method92(boolean var0) {
      return !var0 ? field64 : field65;
   }

   @Override
   public void method73(DataOutput var1) throws IOException {
      var1.writeByte(this.field66);
   }

   @Override
   public byte method74() {
      return 1;
   }

   @Override
   public Class7052<Class33> method75() {
      return field63;
   }

   @Override
   public String toString() {
      return this.field66 + "b";
   }

   public Class33 method79() {
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof Class33 && this.field66 == ((Class33)var1).field66;
   }

   @Override
   public int hashCode() {
      return this.field66;
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      IFormattableTextComponent var5 = new StringTextComponent("b").mergeStyle(field59);
      return new StringTextComponent(String.valueOf(this.field66)).append(var5).mergeStyle(field58);
   }

   @Override
   public long method83() {
      return (long)this.field66;
   }

   @Override
   public int method84() {
      return this.field66;
   }

   @Override
   public short method85() {
      return (short)this.field66;
   }

   @Override
   public byte method86() {
      return this.field66;
   }

   @Override
   public double method87() {
      return (double)this.field66;
   }

   @Override
   public float method88() {
      return (float)this.field66;
   }

   @Override
   public Number method89() {
      return this.field66;
   }

   // $VF: synthetic method
   public Class33(byte var1, Class7063 var2) {
      this(var1);
   }
}

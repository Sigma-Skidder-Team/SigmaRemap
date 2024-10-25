package net.sourceforge.jaad.mp4.api;

public class Frame implements Comparable<Frame> {
   private static String[] field13009;
   private final Type type;
   private final long field13011;
   private final long field13012;
   private final double field13013;
   private byte[] field13014;

   public Frame(Type var1, long var2, long var4, double var6) {
      this.type = var1;
      this.field13011 = var2;
      this.field13012 = var4;
      this.field13013 = var6;
   }

   public Type getType() {
      return this.type;
   }

   public long getOffset() {
      return this.field13011;
   }

   public long getSize() {
      return this.field13012;
   }

   public double getTime() {
      return this.field13013;
   }

   public int compareTo(Frame var1) {
      double var4 = this.field13013 - var1.field13013;
      return !(var4 < 0.0) ? (!(var4 > 0.0) ? 0 : 1) : -1;
   }

   public void method8281(byte[] var1) {
      this.field13014 = var1;
   }

   public byte[] getData() {
      return this.field13014;
   }
}

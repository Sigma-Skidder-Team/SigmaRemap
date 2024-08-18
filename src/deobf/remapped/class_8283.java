package remapped;

import java.io.IOException;

public class class_8283 implements Packet<class_392> {
   private static String[] field_42463;
   public Identifier field_42460;
   private class_562 field_42456;
   private int field_42459;
   private int field_42461 = Integer.MAX_VALUE;
   private int field_42457;
   private float field_42462;
   private float field_42458;

   public class_8283() {
   }

   public class_8283(Identifier var1, class_562 var2, Vector3d var3, float var4, float var5) {
      this.field_42460 = var1;
      this.field_42456 = var2;
      this.field_42459 = (int)(var3.field_7336 * 8.0);
      this.field_42461 = (int)(var3.field_7333 * 8.0);
      this.field_42457 = (int)(var3.field_7334 * 8.0);
      this.field_42462 = var4;
      this.field_42458 = var5;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_42460 = var1.method_37768();
      this.field_42456 = var1.<class_562>method_37787(class_562.class);
      this.field_42459 = var1.readInt();
      this.field_42461 = var1.readInt();
      this.field_42457 = var1.readInt();
      this.field_42462 = var1.readFloat();
      this.field_42458 = var1.readFloat();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37780(this.field_42460);
      var1.method_37750(this.field_42456);
      var1.writeInt(this.field_42459);
      var1.writeInt(this.field_42461);
      var1.writeInt(this.field_42457);
      var1.writeFloat(this.field_42462);
      var1.writeFloat(this.field_42458);
   }

   public Identifier method_38221() {
      return this.field_42460;
   }

   public class_562 method_38225() {
      return this.field_42456;
   }

   public double method_38223() {
      return (double)((float)this.field_42459 / 8.0F);
   }

   public double method_38226() {
      return (double)((float)this.field_42461 / 8.0F);
   }

   public double method_38224() {
      return (double)((float)this.field_42457 / 8.0F);
   }

   public float method_38222() {
      return this.field_42462;
   }

   public float method_38219() {
      return this.field_42458;
   }

   public void method_38227(class_392 var1) {
      var1.method_1898(this);
   }
}

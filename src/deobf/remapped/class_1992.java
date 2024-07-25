package remapped;

import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Set;
import java.util.function.Supplier;

public class class_1992 implements Packet<class_392> {
   private static String[] field_10116;
   private int field_10122;
   private long field_10120;
   private boolean field_10117;
   private GameType field_10115;
   private GameType field_10109;
   private Set<class_5621<World>> field_10112;
   private class_7522 field_10119;
   private class_8760 field_10114;
   private class_5621<World> field_10118;
   private int field_10110;
   private int field_10113;
   private boolean field_10121;
   private boolean field_10111;
   private boolean field_10123;
   private boolean field_10108;

   public class_1992() {
   }

   public class_1992(
      int var1,
      GameType var2,
      GameType var3,
      long var4,
      boolean var6,
      Set<class_5621<World>> var7,
      class_7522 var8,
      class_8760 var9,
      class_5621<World> var10,
      int var11,
      int var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16
   ) {
      this.field_10122 = var1;
      this.field_10112 = var7;
      this.field_10119 = var8;
      this.field_10114 = var9;
      this.field_10118 = var10;
      this.field_10120 = var4;
      this.field_10115 = var2;
      this.field_10109 = var3;
      this.field_10110 = var11;
      this.field_10117 = var6;
      this.field_10113 = var12;
      this.field_10121 = var13;
      this.field_10111 = var14;
      this.field_10123 = var15;
      this.field_10108 = var16;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_10122 = var1.readInt();
      this.field_10117 = var1.readBoolean();
      this.field_10115 = GameType.method_21590(var1.readByte());
      this.field_10109 = GameType.method_21590(var1.readByte());
      int var4 = var1.method_37778();
      this.field_10112 = Sets.newHashSet();

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_10112.add(class_5621.<World>method_25497(class_8669.field_44372, var1.method_37768()));
      }

      this.field_10119 = var1.<class_7522>method_37771(class_7522.field_38395);
      this.field_10114 = var1.<Supplier<class_8760>>method_37771(class_8760.field_44831).get();
      this.field_10118 = class_5621.<World>method_25497(class_8669.field_44372, var1.method_37768());
      this.field_10120 = var1.readLong();
      this.field_10110 = var1.method_37778();
      this.field_10113 = var1.method_37778();
      this.field_10121 = var1.readBoolean();
      this.field_10111 = var1.readBoolean();
      this.field_10123 = var1.readBoolean();
      this.field_10108 = var1.readBoolean();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeInt(this.field_10122);
      var1.writeBoolean(this.field_10117);
      var1.writeByte(this.field_10115.method_21589());
      var1.writeByte(this.field_10109.method_21589());
      var1.method_37743(this.field_10112.size());

      for (class_5621 var5 : this.field_10112) {
         var1.method_37780(var5.method_25499());
      }

      var1.method_37786(class_7522.field_38395, this.field_10119);
      var1.method_37786(class_8760.field_44831, () -> this.field_10114);
      var1.method_37780(this.field_10118.method_25499());
      var1.writeLong(this.field_10120);
      var1.method_37743(this.field_10110);
      var1.method_37743(this.field_10113);
      var1.writeBoolean(this.field_10121);
      var1.writeBoolean(this.field_10111);
      var1.writeBoolean(this.field_10123);
      var1.writeBoolean(this.field_10108);
   }

   public void method_9237(class_392 var1) {
      var1.method_1902(this);
   }

   public int method_9225() {
      return this.field_10122;
   }

   public long method_9235() {
      return this.field_10120;
   }

   public boolean method_9231() {
      return this.field_10117;
   }

   public GameType method_9226() {
      return this.field_10115;
   }

   public GameType method_9238() {
      return this.field_10109;
   }

   public Set<class_5621<World>> method_9233() {
      return this.field_10112;
   }

   public class_6322 method_9228() {
      return this.field_10119;
   }

   public class_8760 method_9232() {
      return this.field_10114;
   }

   public class_5621<World> method_9234() {
      return this.field_10118;
   }

   public int method_9229() {
      return this.field_10113;
   }

   public boolean method_9227() {
      return this.field_10121;
   }

   public boolean method_9230() {
      return this.field_10111;
   }

   public boolean method_9236() {
      return this.field_10123;
   }

   public boolean method_9240() {
      return this.field_10108;
   }
}

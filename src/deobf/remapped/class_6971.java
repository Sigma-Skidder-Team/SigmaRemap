package remapped;

import java.io.IOException;

public class class_6971 implements Packet<class_1243> {
   private static String[] field_35822;
   private BlockPos field_35827;
   private class_6664 field_35819;
   private class_589 field_35832;
   private String field_35825;
   private BlockPos field_35820;
   private BlockPos field_35829;
   private class_9022 field_35824;
   private class_6631 field_35831;
   private String field_35828;
   private boolean field_35830;
   private boolean field_35821;
   private boolean field_35823;
   private float field_35826;
   private long field_35833;

   public class_6971() {
   }

   public class_6971(
      BlockPos var1,
      class_6664 var2,
      class_589 var3,
      String var4,
      BlockPos var5,
      BlockPos var6,
      class_9022 var7,
      class_6631 var8,
      String var9,
      boolean var10,
      boolean var11,
      boolean var12,
      float var13,
      long var14
   ) {
      this.field_35827 = var1;
      this.field_35819 = var2;
      this.field_35832 = var3;
      this.field_35825 = var4;
      this.field_35820 = var5;
      this.field_35829 = var6;
      this.field_35824 = var7;
      this.field_35831 = var8;
      this.field_35828 = var9;
      this.field_35830 = var10;
      this.field_35821 = var11;
      this.field_35823 = var12;
      this.field_35826 = var13;
      this.field_35833 = var14;
   }

   @Override
   public void method_28775(class_8248 param1) throws IOException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 1604911808
      // 002: istore 2
      // 003: aload 0
      // 004: aload 1
      // 005: invokevirtual remapped/class_8248.method_37748 ()Lremapped/class_1331;
      // 008: putfield remapped/class_6971.field_35827 Lremapped/class_1331;
      // 00b: aload 0
      // 00c: aload 1
      // 00d: ldc remapped/class_6664
      // 00f: invokevirtual remapped/class_8248.method_37787 (Ljava/lang/Class;)Ljava/lang/Enum;
      // 012: checkcast remapped/class_6664
      // 015: putfield remapped/class_6971.field_35819 Lremapped/class_6664;
      // 018: aload 0
      // 019: aload 1
      // 01a: ldc remapped/class_589
      // 01c: invokevirtual remapped/class_8248.method_37787 (Ljava/lang/Class;)Ljava/lang/Enum;
      // 01f: checkcast remapped/class_589
      // 022: putfield remapped/class_6971.field_35832 Lremapped/class_589;
      // 025: aload 0
      // 026: aload 1
      // 027: sipush 32767
      // 02a: invokevirtual remapped/class_8248.method_37784 (I)Ljava/lang/String;
      // 02d: putfield remapped/class_6971.field_35825 Ljava/lang/String;
      // 030: bipush 48
      // 032: istore 4
      // 034: aload 0
      // 035: new remapped/class_1331
      // 038: dup
      // 039: aload 1
      // 03a: invokevirtual remapped/class_8248.readByte ()B
      // 03d: bipush -48
      // 03f: bipush 48
      // 041: invokestatic remapped/class_9299.method_42829 (III)I
      // 044: aload 1
      // 045: invokevirtual remapped/class_8248.readByte ()B
      // 048: bipush -48
      // 04a: bipush 48
      // 04c: invokestatic remapped/class_9299.method_42829 (III)I
      // 04f: aload 1
      // 050: invokevirtual remapped/class_8248.readByte ()B
      // 053: bipush -48
      // 055: bipush 48
      // 057: invokestatic remapped/class_9299.method_42829 (III)I
      // 05a: invokespecial remapped/class_1331.<init> (III)V
      // 05d: putfield remapped/class_6971.field_35820 Lremapped/class_1331;
      // 060: bipush 48
      // 062: istore 5
      // 064: aload 0
      // 065: new remapped/class_1331
      // 068: dup
      // 069: aload 1
      // 06a: invokevirtual remapped/class_8248.readByte ()B
      // 06d: bipush 0
      // 06e: bipush 48
      // 070: invokestatic remapped/class_9299.method_42829 (III)I
      // 073: aload 1
      // 074: invokevirtual remapped/class_8248.readByte ()B
      // 077: bipush 0
      // 078: bipush 48
      // 07a: invokestatic remapped/class_9299.method_42829 (III)I
      // 07d: aload 1
      // 07e: invokevirtual remapped/class_8248.readByte ()B
      // 081: bipush 0
      // 082: bipush 48
      // 084: invokestatic remapped/class_9299.method_42829 (III)I
      // 087: invokespecial remapped/class_1331.<init> (III)V
      // 08a: putfield remapped/class_6971.field_35829 Lremapped/class_1331;
      // 08d: aload 0
      // 08e: aload 1
      // 08f: ldc remapped/class_9022
      // 091: invokevirtual remapped/class_8248.method_37787 (Ljava/lang/Class;)Ljava/lang/Enum;
      // 094: checkcast remapped/class_9022
      // 097: putfield remapped/class_6971.field_35824 Lremapped/class_9022;
      // 09a: aload 0
      // 09b: aload 1
      // 09c: ldc remapped/class_6631
      // 09e: invokevirtual remapped/class_8248.method_37787 (Ljava/lang/Class;)Ljava/lang/Enum;
      // 0a1: checkcast remapped/class_6631
      // 0a4: putfield remapped/class_6971.field_35831 Lremapped/class_6631;
      // 0a7: aload 0
      // 0a8: aload 1
      // 0a9: bipush 12
      // 0ab: invokevirtual remapped/class_8248.method_37784 (I)Ljava/lang/String;
      // 0ae: putfield remapped/class_6971.field_35828 Ljava/lang/String;
      // 0b1: aload 0
      // 0b2: aload 1
      // 0b3: invokevirtual remapped/class_8248.readFloat ()F
      // 0b6: fconst_0
      // 0b7: fconst_1
      // 0b8: invokestatic remapped/class_9299.method_42828 (FFF)F
      // 0bb: putfield remapped/class_6971.field_35826 F
      // 0be: aload 0
      // 0bf: aload 1
      // 0c0: invokevirtual remapped/class_8248.method_37781 ()J
      // 0c3: putfield remapped/class_6971.field_35833 J
      // 0c6: aload 1
      // 0c7: invokevirtual remapped/class_8248.readByte ()B
      // 0ca: istore 6
      // 0cc: aload 0
      // 0cd: iload 2
      // 0ce: ldc 134217728
      // 0d0: iand
      // 0d1: ifne 0d7
      // 0d4: goto 10e
      // 0d7: iload 2
      // 0d8: ldc 268435456
      // 0da: iand
      // 0db: ifeq 0ef
      // 0de: bipush 0
      // 0df: goto 0e4
      // 0e2: athrow
      // 0e3: bipush 1
      // 0e4: iload 2
      // 0e5: ldc 67108864
      // 0e7: iand
      // 0e8: ifeq 103
      // 0eb: putfield remapped/class_6971.field_35830 Z
      // 0ee: aload 0
      // 0ef: iload 2
      // 0f0: ldc 67108864
      // 0f2: iand
      // 0f3: ifeq 10e
      // 0f6: iload 2
      // 0f7: ldc 32768
      // 0f9: iand
      // 0fa: ifne 0cd
      // 0fd: bipush 0
      // 0fe: goto 103
      // 101: athrow
      // 102: bipush 1
      // 103: iload 2
      // 104: ldc 128
      // 106: iand
      // 107: ifeq 0e4
      // 10a: putfield remapped/class_6971.field_35821 Z
      // 10d: aload 0
      // 10e: iload 2
      // 10f: ldc 8388608
      // 111: iand
      // 112: ifeq 0ef
      // 115: iload 2
      // 116: ldc 67108864
      // 118: iand
      // 119: ifne 11f
      // 11c: goto 0cd
      // 11f: bipush 0
      // 120: goto 125
      // 123: athrow
      // 124: bipush 1
      // 125: putfield remapped/class_6971.field_35823 Z
      // 128: return
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_35827);
      var1.method_37750(this.field_35819);
      var1.method_37750(this.field_35832);
      var1.method_37760(this.field_35825);
      var1.writeByte(this.field_35820.method_12173());
      var1.writeByte(this.field_35820.method_12165());
      var1.writeByte(this.field_35820.method_12185());
      var1.writeByte(this.field_35829.method_12173());
      var1.writeByte(this.field_35829.method_12165());
      var1.writeByte(this.field_35829.method_12185());
      var1.method_37750(this.field_35824);
      var1.method_37750(this.field_35831);
      var1.method_37760(this.field_35828);
      var1.writeFloat(this.field_35826);
      var1.method_37752(this.field_35833);
      byte var4 = 0;
      if (this.field_35830) {
         var4 |= 1;
      }

      if (this.field_35821) {
         var4 |= 2;
      }

      if (this.field_35823) {
         var4 |= 4;
      }

      var1.writeByte(var4);
   }

   public void method_31881(class_1243 var1) {
      var1.method_5571(this);
   }

   public BlockPos method_31869() {
      return this.field_35827;
   }

   public class_6664 method_31872() {
      return this.field_35819;
   }

   public class_589 method_31875() {
      return this.field_35832;
   }

   public String method_31871() {
      return this.field_35825;
   }

   public BlockPos method_31884() {
      return this.field_35820;
   }

   public BlockPos method_31879() {
      return this.field_35829;
   }

   public class_9022 method_31880() {
      return this.field_35824;
   }

   public class_6631 method_31873() {
      return this.field_35831;
   }

   public String method_31878() {
      return this.field_35828;
   }

   public boolean method_31876() {
      return this.field_35830;
   }

   public boolean method_31882() {
      return this.field_35821;
   }

   public boolean method_31874() {
      return this.field_35823;
   }

   public float method_31877() {
      return this.field_35826;
   }

   public long method_31883() {
      return this.field_35833;
   }
}

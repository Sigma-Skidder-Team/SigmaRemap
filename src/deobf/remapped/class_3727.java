package remapped;

import java.io.IOException;

public class class_3727 implements Packet<class_392> {
   private static String[] field_18234;
   private boolean field_18239;
   private boolean field_18237;
   private boolean field_18236;
   private boolean field_18238;
   private float field_18233;
   private float field_18235;

   public class_3727() {
   }

   public class_3727(class_964 var1) {
      this.field_18239 = var1.field_4940;
      this.field_18237 = var1.field_4942;
      this.field_18236 = var1.field_4941;
      this.field_18238 = var1.field_4944;
      this.field_18233 = var1.method_4230();
      this.field_18235 = var1.method_4229();
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
      // 00: ldc 1809789569
      // 02: istore 2
      // 03: aload 1
      // 04: invokevirtual remapped/class_8248.readByte ()B
      // 07: istore 4
      // 09: aload 0
      // 0a: iload 2
      // 0b: ldc 2147483647
      // 0d: iand
      // 0e: ifeq ac
      // 11: iload 2
      // 12: ldc 134217728
      // 14: iand
      // 15: ifne 1b
      // 18: goto 76
      // 1b: iload 2
      // 1c: ldc 1
      // 1e: iand
      // 1f: ifne 25
      // 22: goto 3d
      // 25: bipush 0
      // 26: goto 2b
      // 29: athrow
      // 2a: bipush 1
      // 2b: iload 2
      // 2c: ldc 8
      // 2e: iand
      // 2f: ifne 97
      // 32: iload 2
      // 33: ldc 2147483647
      // 35: iand
      // 36: ifeq 61
      // 39: putfield remapped/class_3727.field_18239 Z
      // 3c: aload 0
      // 3d: iload 2
      // 3e: ldc 2147483647
      // 40: iand
      // 41: ifne 47
      // 44: goto ac
      // 47: iload 2
      // 48: ldc 1024
      // 4a: iand
      // 4b: ifeq 51
      // 4e: goto 76
      // 51: iload 2
      // 52: ldc 32768
      // 54: iand
      // 55: ifeq 5b
      // 58: goto 0a
      // 5b: bipush 0
      // 5c: goto 61
      // 5f: athrow
      // 60: bipush 1
      // 61: iload 2
      // 62: ldc 524288
      // 64: iand
      // 65: ifne 6b
      // 68: goto 97
      // 6b: iload 2
      // 6c: ldc 4
      // 6e: iand
      // 6f: ifne 2b
      // 72: putfield remapped/class_3727.field_18237 Z
      // 75: aload 0
      // 76: iload 2
      // 77: ldc 4
      // 79: iand
      // 7a: ifeq 80
      // 7d: goto ac
      // 80: iload 2
      // 81: ldc 1
      // 83: iand
      // 84: ifne 8a
      // 87: goto 3d
      // 8a: iload 2
      // 8b: ldc 134217728
      // 8d: iand
      // 8e: ifeq 0a
      // 91: bipush 0
      // 92: goto 97
      // 95: athrow
      // 96: bipush 1
      // 97: iload 2
      // 98: ldc 16384
      // 9a: iand
      // 9b: ifne 61
      // 9e: iload 2
      // 9f: ldc 4194304
      // a1: iand
      // a2: ifne a8
      // a5: goto 2b
      // a8: putfield remapped/class_3727.field_18236 Z
      // ab: aload 0
      // ac: iload 2
      // ad: ldc 4
      // af: iand
      // b0: ifne 76
      // b3: iload 2
      // b4: ldc 262144
      // b6: iand
      // b7: ifeq 3d
      // ba: iload 2
      // bb: ldc 524288
      // bd: iand
      // be: ifne c4
      // c1: goto 0a
      // c4: bipush 0
      // c5: goto ca
      // c8: athrow
      // c9: bipush 1
      // ca: putfield remapped/class_3727.field_18238 Z
      // cd: aload 0
      // ce: aload 1
      // cf: invokevirtual remapped/class_8248.readFloat ()F
      // d2: putfield remapped/class_3727.field_18233 F
      // d5: aload 0
      // d6: aload 1
      // d7: invokevirtual remapped/class_8248.readFloat ()F
      // da: putfield remapped/class_3727.field_18235 F
      // dd: return
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      byte var4 = 0;
      if (this.field_18239) {
         var4 = (byte)(var4 | 1);
      }

      if (this.field_18237) {
         var4 = (byte)(var4 | 2);
      }

      if (this.field_18236) {
         var4 = (byte)(var4 | 4);
      }

      if (this.field_18238) {
         var4 = (byte)(var4 | 8);
      }

      var1.writeByte(var4);
      var1.writeFloat(this.field_18233);
      var1.writeFloat(this.field_18235);
   }

   public void method_17277(class_392 var1) {
      var1.method_1969(this);
   }

   public boolean method_17273() {
      return this.field_18239;
   }

   public boolean method_17271() {
      return this.field_18237;
   }

   public boolean method_17272() {
      return this.field_18236;
   }

   public boolean method_17274() {
      return this.field_18238;
   }

   public float method_17275() {
      return this.field_18233;
   }

   public float method_17276() {
      return this.field_18235;
   }
}

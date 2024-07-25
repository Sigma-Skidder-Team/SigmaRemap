package remapped;

import java.io.IOException;

public class class_6066 implements class_6310<class_1243> {
   private static String[] field_31028;
   private class_1331 field_31031;
   private String field_31029;
   private boolean field_31025;
   private boolean field_31030;
   private boolean field_31026;
   private class_9776 field_31027;

   public class_6066() {
   }

   public class_6066(class_1331 var1, String var2, class_9776 var3, boolean var4, boolean var5, boolean var6) {
      this.field_31031 = var1;
      this.field_31029 = var2;
      this.field_31025 = var4;
      this.field_31030 = var5;
      this.field_31026 = var6;
      this.field_31027 = var3;
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
      // 00: ldc -575060431
      // 02: istore 2
      // 03: aload 0
      // 04: aload 1
      // 05: invokevirtual remapped/class_8248.method_37748 ()Lremapped/class_1331;
      // 08: putfield remapped/class_6066.field_31031 Lremapped/class_1331;
      // 0b: aload 0
      // 0c: aload 1
      // 0d: sipush 32767
      // 10: invokevirtual remapped/class_8248.method_37784 (I)Ljava/lang/String;
      // 13: putfield remapped/class_6066.field_31029 Ljava/lang/String;
      // 16: aload 0
      // 17: aload 1
      // 18: ldc remapped/class_9776
      // 1a: invokevirtual remapped/class_8248.method_37787 (Ljava/lang/Class;)Ljava/lang/Enum;
      // 1d: checkcast remapped/class_9776
      // 20: putfield remapped/class_6066.field_31027 Lremapped/class_9776;
      // 23: aload 1
      // 24: invokevirtual remapped/class_8248.readByte ()B
      // 27: istore 4
      // 29: aload 0
      // 2a: iload 2
      // 2b: ldc 131072
      // 2d: iand
      // 2e: ifeq 34
      // 31: goto 77
      // 34: iload 2
      // 35: ldc 1024
      // 37: iand
      // 38: ifne 3e
      // 3b: goto 52
      // 3e: bipush 0
      // 3f: goto 44
      // 42: athrow
      // 43: bipush 1
      // 44: iload 2
      // 45: ldc 1073741824
      // 47: iand
      // 48: ifne 4e
      // 4b: goto 69
      // 4e: putfield remapped/class_6066.field_31025 Z
      // 51: aload 0
      // 52: iload 2
      // 53: ldc 8388608
      // 55: iand
      // 56: ifeq 77
      // 59: iload 2
      // 5a: ldc 16384
      // 5c: iand
      // 5d: ifne 63
      // 60: goto 2a
      // 63: bipush 0
      // 64: goto 69
      // 67: athrow
      // 68: bipush 1
      // 69: iload 2
      // 6a: ldc 16384
      // 6c: iand
      // 6d: ifne 73
      // 70: goto 44
      // 73: putfield remapped/class_6066.field_31030 Z
      // 76: aload 0
      // 77: iload 2
      // 78: ldc 2097152
      // 7a: iand
      // 7b: ifne 81
      // 7e: goto 52
      // 81: iload 2
      // 82: ldc 16384
      // 84: iand
      // 85: ifne 8b
      // 88: goto 2a
      // 8b: bipush 0
      // 8c: goto 91
      // 8f: athrow
      // 90: bipush 1
      // 91: putfield remapped/class_6066.field_31026 Z
      // 94: return
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37770(this.field_31031);
      var1.method_37760(this.field_31029);
      var1.method_37750(this.field_31027);
      byte var4 = 0;
      if (this.field_31025) {
         var4 |= 1;
      }

      if (this.field_31030) {
         var4 |= 2;
      }

      if (this.field_31026) {
         var4 |= 4;
      }

      var1.writeByte(var4);
   }

   public void method_27786(class_1243 var1) {
      var1.method_5550(this);
   }

   public class_1331 method_27779() {
      return this.field_31031;
   }

   public String method_27783() {
      return this.field_31029;
   }

   public boolean method_27784() {
      return this.field_31025;
   }

   public boolean method_27782() {
      return this.field_31030;
   }

   public boolean method_27781() {
      return this.field_31026;
   }

   public class_9776 method_27780() {
      return this.field_31027;
   }
}

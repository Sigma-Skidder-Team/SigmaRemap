package remapped;

public class class_5137 implements class_857 {
   private static String[] field_26480;

   public class_5137(class_5991 var1) {
      this.field_26479 = var1;
   }

   @Override
   public void method_3722(class_5051 param1) throws Exception {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc -368356882
      // 02: istore 2
      // 03: aload 1
      // 04: getstatic remapped/class_8039.field_41146 Lremapped/class_574;
      // 07: invokevirtual remapped/class_5051.method_23242 (Lremapped/class_8039;)Ljava/lang/Object;
      // 0a: checkcast java/lang/Float
      // 0d: invokevirtual java/lang/Float.floatValue ()F
      // 10: fstore 4
      // 12: aload 1
      // 13: getstatic remapped/class_8039.field_41148 Lremapped/class_2302;
      // 16: invokevirtual remapped/class_5051.method_23242 (Lremapped/class_8039;)Ljava/lang/Object;
      // 19: checkcast java/lang/Long
      // 1c: invokevirtual java/lang/Long.longValue ()J
      // 1f: lstore 5
      // 21: aload 1
      // 22: getstatic remapped/class_8039.field_41133 Lremapped/class_8039;
      // 25: invokevirtual remapped/class_5051.method_23242 (Lremapped/class_8039;)Ljava/lang/Object;
      // 28: checkcast java/lang/Byte
      // 2b: invokevirtual java/lang/Byte.byteValue ()B
      // 2e: istore 7
      // 30: aload 1
      // 31: getstatic remapped/class_8039.field_41161 Lremapped/class_8039;
      // 34: iload 2
      // 35: ldc 8
      // 37: iand
      // 38: ifne 3e
      // 3b: goto 87
      // 3e: iload 2
      // 3f: ldc 1073741824
      // 41: iand
      // 42: ifeq 5c
      // 45: bipush 0
      // 46: goto 4b
      // 49: athrow
      // 4a: bipush 1
      // 4b: iload 2
      // 4c: ldc 8
      // 4e: iand
      // 4f: ifeq 73
      // 52: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 55: invokevirtual remapped/class_5051.method_23236 (Lremapped/class_8039;Ljava/lang/Object;)V
      // 58: aload 1
      // 59: getstatic remapped/class_8039.field_41161 Lremapped/class_8039;
      // 5c: iload 2
      // 5d: ldc 32
      // 5f: iand
      // 60: ifne 66
      // 63: goto 87
      // 66: iload 2
      // 67: ldc 32768
      // 69: iand
      // 6a: ifne 34
      // 6d: bipush 0
      // 6e: goto 73
      // 71: athrow
      // 72: bipush 1
      // 73: iload 2
      // 74: ldc 33554432
      // 76: iand
      // 77: ifne 7d
      // 7a: goto 4b
      // 7d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 80: invokevirtual remapped/class_5051.method_23236 (Lremapped/class_8039;Ljava/lang/Object;)V
      // 83: aload 1
      // 84: getstatic remapped/class_8039.field_41161 Lremapped/class_8039;
      // 87: iload 2
      // 88: ldc 16
      // 8a: iand
      // 8b: ifeq 91
      // 8e: goto 5c
      // 91: iload 2
      // 92: ldc 16777216
      // 94: iand
      // 95: ifne 34
      // 98: bipush 0
      // 99: goto 9e
      // 9c: athrow
      // 9d: bipush 1
      // 9e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // a1: invokevirtual remapped/class_5051.method_23236 (Lremapped/class_8039;Ljava/lang/Object;)V
      // a4: aload 1
      // a5: getstatic remapped/class_8039.field_41146 Lremapped/class_574;
      // a8: fload 4
      // aa: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // ad: invokevirtual remapped/class_5051.method_23236 (Lremapped/class_8039;Ljava/lang/Object;)V
      // b0: aload 1
      // b1: getstatic remapped/class_8039.field_41148 Lremapped/class_2302;
      // b4: lload 5
      // b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b9: invokevirtual remapped/class_5051.method_23236 (Lremapped/class_8039;Ljava/lang/Object;)V
      // bc: return
   }
}

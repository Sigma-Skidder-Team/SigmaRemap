package remapped;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;

public class class_9889 implements class_6310<class_392> {
   private static String[] field_50148;
   private UUID field_50145;
   private class_8891 field_50154;
   public ITextComponent field_50151;
   private float field_50147;
   private class_1062 field_50150;
   private class_2976 field_50146;
   private boolean field_50152;
   private boolean field_50153;
   private boolean field_50149;

   public class_9889() {
   }

   public class_9889(class_8891 var1, class_9394 var2) {
      this.field_50154 = var1;
      this.field_50145 = var2.method_43454();
      this.field_50151 = var2.method_43453();
      this.field_50147 = var2.method_43450();
      this.field_50150 = var2.method_43456();
      this.field_50146 = var2.method_43462();
      this.field_50152 = var2.method_43460();
      this.field_50153 = var2.method_43464();
      this.field_50149 = var2.method_43455();
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_50145 = var1.method_37753();
      this.field_50154 = var1.<class_8891>method_37787(class_8891.class);
      switch (this.field_50154) {
         case field_45606:
            this.field_50151 = var1.method_37776();
            this.field_50147 = var1.readFloat();
            this.field_50150 = var1.<class_1062>method_37787(class_1062.class);
            this.field_50146 = var1.<class_2976>method_37787(class_2976.class);
            this.method_45558(var1.readUnsignedByte());
         case field_45607:
         default:
            break;
         case field_45612:
            this.field_50147 = var1.readFloat();
            break;
         case field_45608:
            this.field_50151 = var1.method_37776();
            break;
         case field_45609:
            this.field_50150 = var1.<class_1062>method_37787(class_1062.class);
            this.field_50146 = var1.<class_2976>method_37787(class_2976.class);
            break;
         case field_45610:
            this.method_45558(var1.readUnsignedByte());
      }
   }

   private void method_45558(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc 373442422
      // 02: istore 2
      // 03: aload 0
      // 04: iload 2
      // 05: ldc 1048576
      // 07: iand
      // 08: ifeq 0e
      // 0b: goto 4e
      // 0e: iload 2
      // 0f: ldc 4
      // 11: iand
      // 12: ifne 18
      // 15: goto 2c
      // 18: bipush 0
      // 19: goto 1e
      // 1c: athrow
      // 1d: bipush 1
      // 1e: iload 2
      // 1f: ldc 1048576
      // 21: iand
      // 22: ifeq 28
      // 25: goto 40
      // 28: putfield remapped/class_9889.field_50152 Z
      // 2b: aload 0
      // 2c: iload 2
      // 2d: ldc 4
      // 2f: iand
      // 30: ifeq 4e
      // 33: iload 2
      // 34: ldc 4194304
      // 36: iand
      // 37: ifeq 04
      // 3a: bipush 0
      // 3b: goto 40
      // 3e: athrow
      // 3f: bipush 1
      // 40: iload 2
      // 41: ldc 1073741824
      // 43: iand
      // 44: ifeq 4a
      // 47: goto 1e
      // 4a: putfield remapped/class_9889.field_50153 Z
      // 4d: aload 0
      // 4e: iload 2
      // 4f: ldc 67108864
      // 51: iand
      // 52: ifne 58
      // 55: goto 2c
      // 58: iload 2
      // 59: ldc 16777216
      // 5b: iand
      // 5c: ifne 04
      // 5f: bipush 0
      // 60: goto 65
      // 63: athrow
      // 64: bipush 1
      // 65: putfield remapped/class_9889.field_50149 Z
      // 68: return
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37746(this.field_50145);
      var1.method_37750(this.field_50154);
      switch (this.field_50154) {
         case field_45606:
            var1.method_37779(this.field_50151);
            var1.writeFloat(this.field_50147);
            var1.method_37750(this.field_50150);
            var1.method_37750(this.field_50146);
            var1.writeByte(this.method_45563());
         case field_45607:
         default:
            break;
         case field_45612:
            var1.writeFloat(this.field_50147);
            break;
         case field_45608:
            var1.method_37779(this.field_50151);
            break;
         case field_45609:
            var1.method_37750(this.field_50150);
            var1.method_37750(this.field_50146);
            break;
         case field_45610:
            var1.writeByte(this.method_45563());
      }
   }

   private int method_45563() {
      byte var3 = 0;
      if (this.field_50152) {
         var3 |= 1;
      }

      if (this.field_50153) {
         var3 |= 2;
      }

      if (this.field_50149) {
         var3 |= 4;
      }

      return var3;
   }

   public void method_45565(class_392 var1) {
      var1.method_1911(this);
   }

   public UUID method_45554() {
      return this.field_50145;
   }

   public class_8891 method_45557() {
      return this.field_50154;
   }

   public ITextComponent method_45562() {
      return this.field_50151;
   }

   public float method_45559() {
      return this.field_50147;
   }

   public class_1062 method_45556() {
      return this.field_50150;
   }

   public class_2976 method_45566() {
      return this.field_50146;
   }

   public boolean method_45564() {
      return this.field_50152;
   }

   public boolean method_45555() {
      return this.field_50153;
   }

   public boolean method_45561() {
      return this.field_50149;
   }
}

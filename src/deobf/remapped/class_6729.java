package remapped;

import io.netty.buffer.ByteBuf;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

public class class_6729 implements class_8332<ClientPlayerEntity> {
   public int method_30867(ClientPlayerEntity var1) {
      if (var1 != null) {
         return class_3347.method_15346();
      } else {
         throw new NullPointerException("player is marked non-null but is null");
      }
   }

   @Override
   public int method_38378(UUID var1) {
      if (var1 != null) {
         return class_3347.method_15346();
      } else {
         throw new NullPointerException("uuid is marked non-null but is null");
      }
   }

   @Override
   public boolean method_38371(UUID var1) {
      return this.method_30865().containsKey(var1);
   }

   @Override
   public String method_38380() {
      return class_3446.method_15886().method_34619();
   }

   @Override
   public void method_38376(UUID var1, ByteBuf var2) throws IllegalArgumentException {
      System.out.println("sendRawPacket");
      if (this.method_38371(var1)) {
         class_1455 var5 = this.method_30865().get(var1);
         var5.method_6738(var2);
      } else {
         throw new IllegalArgumentException("This player is not controlled by ViaVersion!");
      }
   }

   public void method_30866(ClientPlayerEntity var1, ByteBuf var2) throws IllegalArgumentException {
      System.out.println("sendRawPacket");
      this.method_38376(var1.method_37328(), var2);
   }

   @Override
   public class_1033 method_38373(String var1, class_7754 var2, class_3704 var3) {
      return new class_4154(var1, 1.0F, var2, var3);
   }

   @Override
   public class_1033 method_38372(String var1, float var2, class_7754 var3, class_3704 var4) {
      return new class_4154(var1, var2, var3, var4);
   }

   @Override
   public SortedSet<Integer> method_38374() {
      TreeSet var3 = new TreeSet<Integer>(class_6710.method_30787());
      var3.removeAll(class_3446.method_15886().method_34626().method_25842());
      return var3;
   }

   public Map<UUID, class_1455> method_30865() {
      return class_3446.method_15883().method_33733();
   }

   @Override
   public boolean method_38379(UUID var1) {
      return false;
   }
}

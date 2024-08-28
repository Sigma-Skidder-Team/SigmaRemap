package mapped;

import com.google.common.collect.Lists;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class Class5550 implements Packet<Class5116> {
   private int field24646;
   private final List<Class7919> field24647 = Lists.newArrayList();

   public Class5550() {
   }

   public Class5550(int var1, Collection<Class9805> var2) {
      this.field24646 = var1;

      for (Class9805 var6 : var2) {
         this.field24647.add(new Class7919(var6.method38659(), var6.method38660(), var6.method38663()));
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24646 = var1.method35714();
      int var4 = var1.readInt();

      for (int var5 = 0; var5 < var4; var5++) {
         ResourceLocation var6 = var1.method35731();
         Class4869 var7 = Class2348.field16087.method9184(var6);
         double var8 = var1.readDouble();
         ArrayList var10 = Lists.newArrayList();
         int var11 = var1.method35714();

         for (int var12 = 0; var12 < var11; var12++) {
            UUID var13 = var1.method35717();
            var10.add(new Class9689(var13, "Unknown synced attribute modifier", var1.readDouble(), Class2045.method8686(var1.readByte())));
         }

         this.field24647.add(new Class7919(var7, var8, var10));
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24646);
      var1.writeInt(this.field24647.size());

      for (Class7919 var5 : this.field24647) {
         var1.method35732(Class2348.field16087.method9181(var5.method26560()));
         var1.writeDouble(var5.method26561());
         var1.writeVarInt(var5.method26562().size());

         for (Class9689 var7 : var5.method26562()) {
            var1.method35716(var7.method37930());
            var1.writeDouble(var7.method37933());
            var1.writeByte(var7.method37932().method8685());
         }
      }
   }

   public void method17180(Class5116 var1) {
      var1.method15752(this);
   }

   public int method17463() {
      return this.field24646;
   }

   public List<Class7919> method17464() {
      return this.field24647;
   }
}

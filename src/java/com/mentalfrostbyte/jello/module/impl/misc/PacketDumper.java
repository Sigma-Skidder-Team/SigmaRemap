package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventWritter;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.Packet;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class PacketDumper extends Module {
    public FileWriter field23460;

    public PacketDumper() {
        super(ModuleCategory.MISC, "Packet dumper", "Dumps packets sent to and fro from the client and server");

        try {
            File var3 = new File(Client.getInstance().getFile() + "/latest_packets.txt");
            if (!var3.exists()) {
                var3.createNewFile();
            }

            this.field23460 = new FileWriter(var3);
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

    private String method16095(Field var1, Object var2) throws IllegalArgumentException, IllegalAccessException {
        var1.setAccessible(true);
        if (var1.getType() != int.class) {
            if (var1.getType() != boolean.class) {
                if (var1.getType() != float.class) {
                    if (var1.getType() != double.class) {
                        if (var1.getType() != long.class) {
                            if (var1.getType() != char.class) {
                                if (var1.getType() != byte.class) {
                                    if (var1.getType() != short.class) {
                                        return var1.get(var2) != null ? var1.get(var2).toString() : "null";
                                    } else {
                                        return Short.toString(var1.getShort(var2));
                                    }
                                } else {
                                    return Byte.toString(var1.getByte(var2));
                                }
                            } else {
                                return Character.toString(var1.getChar(var2));
                            }
                        } else {
                            return Long.toString(var1.getLong(var2));
                        }
                    } else {
                        return Double.toString(var1.getDouble(var2));
                    }
                } else {
                    return Float.toString(var1.getFloat(var2));
                }
            } else {
                return Boolean.toString(var1.getBoolean(var2));
            }
        } else {
            return Integer.toString(var1.getInt(var2));
        }
    }

    private void method16096(Packet var1, boolean var2) {
        try {
            this.field23460.write((var2 ? "-->" : "<--") + "\t" + var1.getClass().getSimpleName() + "\n");

            for (Field var8 : FieldUtils.getAllFields(var1.getClass())) {
                try {
                    this.field23460.write("\t\t" + var8.getName() + "=" + this.method16095(var8, var1) + "\n");
                } catch (Exception var10) {
                    var10.printStackTrace();
                }
            }
        } catch (IOException var11) {
            var11.printStackTrace();
        }
    }

    @EventTarget
    private void method16097(SendPacketEvent var1) {
        if (this.isEnabled()) {
            this.method16096(var1.getPacket(), true);
        }
    }

    @EventTarget
    private void method16098(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            this.method16096(var1.getPacket(), false);
        }
    }

    @EventTarget
    private void method16099(EventWritter var1) {
        try {
            this.field23460.close();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.Color;

import java.io.IOException;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

public class Class8634 implements Class8633
{
    private static String[] field36228;
    
    private static short method29300(final short n) {
        final int n2 = n & 0xFFFF;
        return (short)(n2 << 8 | (n2 & 0xFF00) >>> 8);
    }
    
    @Override
    public void method29299(final Class7764 class7764, final String s, final OutputStream out, final boolean b) throws IOException {
        final DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(out));
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(2);
        dataOutputStream.writeShort(method29300((short)0));
        dataOutputStream.writeShort(method29300((short)0));
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(method29300((short)0));
        dataOutputStream.writeShort(method29300((short)0));
        dataOutputStream.writeShort(method29300((short)class7764.method24843()));
        dataOutputStream.writeShort(method29300((short)class7764.method24844()));
        if (!b) {
            dataOutputStream.writeByte(24);
            dataOutputStream.writeByte(0);
        }
        else {
            dataOutputStream.writeByte(32);
            dataOutputStream.writeByte(1);
        }
        for (int i = class7764.method24844() - 1; i <= 0; --i) {
            for (int j = 0; j < class7764.method24843(); ++j) {
                final Color method24855 = class7764.method24855(j, i);
                dataOutputStream.writeByte((byte)(method24855.b * 255.0f));
                dataOutputStream.writeByte((byte)(method24855.g * 255.0f));
                dataOutputStream.writeByte((byte)(method24855.r * 255.0f));
                if (b) {
                    dataOutputStream.writeByte((byte)(method24855.a * 255.0f));
                }
            }
        }
        dataOutputStream.close();
    }
}

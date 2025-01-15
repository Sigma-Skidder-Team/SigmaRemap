// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.reflect.FieldUtils;
import java.lang.reflect.Field;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class Class3241 extends Class3167
{
    public FileWriter field15729;
    
    public Class3241() {
        super(Class8013.field32988, "Packet dumper", "Dumps packets sent to and fro from the client and server");
        try {
            final File file = new File(Class9463.method35173().method35208() + "/latest_packets.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            this.field15729 = new FileWriter(file);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private String method10234(final Field field, final Object o) throws IllegalArgumentException, IllegalAccessException {
        field.setAccessible(true);
        if (field.getType() == Integer.TYPE) {
            return Integer.toString(field.getInt(o));
        }
        if (field.getType() == Boolean.TYPE) {
            return Boolean.toString(field.getBoolean(o));
        }
        if (field.getType() == Float.TYPE) {
            return Float.toString(field.getFloat(o));
        }
        if (field.getType() == Double.TYPE) {
            return Double.toString(field.getDouble(o));
        }
        if (field.getType() == Long.TYPE) {
            return Long.toString(field.getLong(o));
        }
        if (field.getType() == Character.TYPE) {
            return Character.toString(field.getChar(o));
        }
        if (field.getType() == Byte.TYPE) {
            return Byte.toString(field.getByte(o));
        }
        if (field.getType() != Short.TYPE) {
            return (field.get(o) != null) ? field.get(o).toString() : "null";
        }
        return Short.toString(field.getShort(o));
    }
    
    private void method10235(final Class4252 class4252, final boolean b) {
        try {
            this.field15729.write((b ? "-->" : "<--") + "\t" + class4252.getClass().getSimpleName() + "\n");
            for (final Field field : FieldUtils.getAllFields((Class)class4252.getClass())) {
                try {
                    this.field15729.write("\t\t" + field.getName() + "=" + this.method10234(field, class4252) + "\n");
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        catch (final IOException ex2) {
            ex2.printStackTrace();
        }
    }
    
    @Class6753
    private void method10236(final Class5721 class5721) {
        if (this.method9906()) {
            this.method10235(class5721.method16990(), true);
        }
    }
    
    @Class6753
    private void method10237(final Class5723 class5723) {
        if (this.method9906()) {
            this.method10235(class5723.method16998(), false);
        }
    }
    
    @Class6753
    private void method10238(final Class5736 class5736) {
        try {
            this.field15729.close();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
}

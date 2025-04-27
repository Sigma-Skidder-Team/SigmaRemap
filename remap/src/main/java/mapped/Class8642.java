// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import net.minecraft.world.storage.SessionLockException;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import com.mojang.datafixers.DataFixer;
import java.io.File;
import org.apache.logging.log4j.Logger;

public class Class8642 implements Class8643
{
    private static final Logger field36243;
    private final File field36244;
    private final File field36245;
    private final long field36246;
    private final String field36247;
    private final Class1795 field36248;
    public final DataFixer field36249;
    
    public Class8642(final File parent, final String s, final MinecraftServer class394, final DataFixer field36249) {
        this.field36246 = Util.method27837();
        this.field36249 = field36249;
        (this.field36244 = new File(parent, s)).mkdirs();
        this.field36245 = new File(this.field36244, "playerdata");
        this.field36247 = s;
        if (class394 == null) {
            this.field36248 = null;
        }
        else {
            this.field36245.mkdirs();
            this.field36248 = new Class1795(class394, this.field36244, field36249);
        }
        this.method29391();
    }
    
    public void method29390(final WorldInfo class8660, final CompoundNBT class8661) {
        class8660.method29552(19133);
        final CompoundNBT method29532 = class8660.method29532(class8661);
        final CompoundNBT class8662 = new CompoundNBT();
        class8662.put("Data", method29532);
        try {
            final File file = new File(this.field36244, "level.dat_new");
            final File dest = new File(this.field36244, "level.dat_old");
            final File dest2 = new File(this.field36244, "level.dat");
            Class8097.method26591(class8662, new FileOutputStream(file));
            if (dest.exists()) {
                dest.delete();
            }
            dest2.renameTo(dest);
            if (dest2.exists()) {
                dest2.delete();
            }
            file.renameTo(dest2);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void method29391() {
        try {
            final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(this.field36244, "session.lock")));
            try {
                dataOutputStream.writeLong(this.field36246);
            }
            finally {
                dataOutputStream.close();
            }
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }
    
    public File method29392() {
        return this.field36244;
    }
    
    public void method29393() throws SessionLockException {
        try {
            final DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File(this.field36244, "session.lock")));
            try {
                if (dataInputStream.readLong() != this.field36246) {
                    throw new Class2337("The save is being accessed from another location, aborting");
                }
            }
            finally {
                dataInputStream.close();
            }
        }
        catch (final IOException ex) {
            throw new Class2337("Failed to check session lock, aborting");
        }
    }
    
    @Nullable
    public WorldInfo method29394() {
        final File file = new File(this.field36244, "level.dat");
        if (file.exists()) {
            final WorldInfo method25793 = Class7952.method25793(file, this.field36249);
            if (method25793 != null) {
                return method25793;
            }
        }
        final File file2 = new File(this.field36244, "level.dat_old");
        return file2.exists() ? Class7952.method25793(file2, this.field36249) : null;
    }
    
    public void method29395(final WorldInfo class8660) {
        this.method29390(class8660, null);
    }
    
    @Override
    public void method29396(final PlayerEntity playerEntity) {
        try {
            final CompoundNBT method1756 = playerEntity.method1756(new CompoundNBT());
            final File file = new File(this.field36245, playerEntity.method1866() + ".dat.tmp");
            final File dest = new File(this.field36245, playerEntity.method1866() + ".dat");
            Class8097.method26591(method1756, new FileOutputStream(file));
            if (dest.exists()) {
                dest.delete();
            }
            file.renameTo(dest);
        }
        catch (final Exception ex) {
            Class8642.field36243.warn("Failed to save player data for {}", playerEntity.getName().getString());
        }
    }
    
    @Nullable
    @Override
    public CompoundNBT method29397(final PlayerEntity playerEntity) {
        CompoundNBT method26590 = null;
        try {
            final File file = new File(this.field36245, playerEntity.method1866() + ".dat");
            if (file.exists() && file.isFile()) {
                method26590 = Class8097.method26590(new FileInputStream(file));
            }
        }
        catch (final Exception ex) {
            Class8642.field36243.warn("Failed to load player data for {}", playerEntity.getName().getString());
        }
        if (method26590 != null) {
            playerEntity.method1757(Class9346.method34651(this.field36249, Class1959.field10676, method26590, method26590.contains("DataVersion", 3) ? method26590.getInt("DataVersion") : -1));
        }
        return method26590;
    }
    
    public String[] method29398() {
        String[] list = this.field36245.list();
        if (list == null) {
            list = new String[0];
        }
        for (int i = 0; i < list.length; ++i) {
            if (list[i].endsWith(".dat")) {
                list[i] = list[i].substring(0, list[i].length() - 4);
            }
        }
        return list;
    }
    
    public Class1795 method29399() {
        return this.field36248;
    }
    
    public DataFixer method29400() {
        return this.field36249;
    }
    
    static {
        field36243 = LogManager.getLogger();
    }
}

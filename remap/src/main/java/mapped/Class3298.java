// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.suggestion.Suggestion;
import java.util.Iterator;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Class3298 extends Class3167
{
    public String field15864;
    public List<String> field15865;
    public List<String> field15866;
    
    public Class3298() {
        super(Class8013.field32989, "Dumper", "Dumps the plugins/commands from the server");
        this.field15864 = null;
        this.field15865 = new ArrayList<String>();
        this.field15866 = new ArrayList<String>();
    }
    
    @Override
    public void method9879() {
        this.field15864 = null;
        this.field15865.clear();
        this.field15866.clear();
        Class6430.method19106("Dumping...");
        this.method10453("");
    }
    
    @Override
    public void method9897() {
        Class6430.method19106("Done.");
        Class6430.method19106("§aPlugins:");
        final StringBuilder sb = new StringBuilder();
        final Iterator<String> iterator = this.field15866.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append(", ");
        }
        final String substring = sb.substring();
        Class6430.method19106(substring);
        Class6430.method19106("§aCommands:");
        final StringBuilder sb2 = new StringBuilder();
        final Iterator<String> iterator2 = this.field15865.iterator();
        while (iterator2.hasNext()) {
            sb2.append(iterator2.next()).append(", ");
        }
        final String substring2 = sb2.substring();
        Class6430.method19106(substring2);
        try {
            final File file = new File(Class9463.method35173().method35208() + "/plugin_and_command_dump.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            final FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Plugins: " + substring + "\n\n");
            fileWriter.write("Commands: " + substring2 + "\n");
            fileWriter.close();
            Class6430.method19106("§bDumped to: " + file.getAbsolutePath());
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            Class6430.method19106("§cCould not save dump file.");
        }
    }
    
    private String method10451() {
        return this.field15864.equals("") ? "a" : (this.field15864.equals("z") ? null : Character.toString((char)(this.field15864.charAt(0) + '\u0001')));
    }
    
    @Class6753
    private void method10452(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4337) {
                for (final Suggestion suggestion : ((Class4337)class5723.method16998()).method13021().getList()) {
                    final String[] split = suggestion.getText().split(":");
                    if (split.length > 1) {
                        final String substring = split[0].substring(1, split[0].length());
                        if (!substring.equals("minecraft")) {
                            if (!substring.equals("bukkit")) {
                                if (!this.field15866.contains(substring)) {
                                    this.field15866.add(substring);
                                }
                            }
                        }
                    }
                    if (this.field15865.contains(suggestion.getText())) {
                        continue;
                    }
                    this.field15865.add(suggestion.getText());
                }
                final String method10451 = this.method10451();
                if (method10451 == null) {
                    this.method9910();
                }
                else {
                    this.method10453(method10451);
                }
            }
        }
    }
    
    private void method10453(final String s) {
        this.field15864 = s;
        Class3298.field15514.method5269().method17292(new Class4265(0, "/" + s));
    }
}

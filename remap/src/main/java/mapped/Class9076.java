// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.io.FileInputStream;
import java.io.File;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class9076
{
    private List<Class8241> field38428;
    private Class8241 field38429;
    private Class8241 field38430;
    public static final String field38431 = ".profile";
    public static final String field38432 = "/profiles/";
    public static final String field38433 = "Default";
    
    public Class9076() {
        this.field38428 = new ArrayList<Class8241>();
    }
    
    public void method32700(final Class8241 class8241) {
        this.field38428.add(0, class8241);
    }
    
    public boolean method32701(final Class8241 class8241) {
        if (Class9463.method35173().method35209() == Class2209.field13465 && class8241.field33839.equals("Classic")) {
            return false;
        }
        if (this.field38428.size() <= 1) {
            return false;
        }
        this.field38428.remove(class8241);
        if (class8241 == this.field38429) {
            this.method32708(this.field38428.get(0));
        }
        return true;
    }
    
    public boolean method32702(final String anObject) {
        for (final Class8241 class8241 : this.field38428) {
            if (class8241.field33839.equals(anObject) && this.method32701(class8241)) {
                return true;
            }
        }
        return false;
    }
    
    public Class8241 method32703(final String s) {
        for (final Class8241 class8241 : this.field38428) {
            if (!class8241.field33839.toLowerCase().equals(s.toLowerCase())) {
                continue;
            }
            return class8241;
        }
        return null;
    }
    
    public void method32704(String s) throws IOException {
        final File file = new File(Class9463.method35173().method35208() + "/profiles/");
        if (!file.exists()) {
            file.mkdirs();
        }
        for (final File file2 : file.listFiles((p0, s2) -> s2.toLowerCase().endsWith(".profile"))) {
            try {
                final Class8241 method27288 = new Class8241().method27288(new Class4405(IOUtils.toString((InputStream)new FileInputStream(file2))));
                method27288.field33839 = file2.getName().substring(0, file2.getName().length() - ".profile".length());
                this.field38428.add(method27288);
                if (s != null && method27288.field33839.toLowerCase().equals(s.toLowerCase())) {
                    this.field38429 = method27288;
                }
            }
            catch (final Class2381 class2381) {
                Class9463.method35173().method35187().method20241("Unable to load profile from " + file2.getName());
            }
        }
        if (this.field38428.size() == 0 || this.field38429 == null) {
            if (s == null || s.length() == 0) {
                s = "Default";
            }
            this.field38428.add(this.field38429 = new Class8241(s, new Class4405()));
        }
        Class9463.method35173().method35189().method21545(this.field38429.field33838);
    }
    
    public boolean method32705(final String s) {
        final Iterator<Class8241> iterator = this.field38428.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().field33839.toLowerCase().equals(s.toLowerCase())) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public void method32706() throws IOException {
        this.field38429.field33838 = Class9463.method35173().method35189().method21546(new Class4405());
        final File file = new File(Class9463.method35173().method35208() + "/profiles/");
        if (!file.exists()) {
            file.mkdirs();
        }
        final File[] listFiles = file.listFiles((p0, s) -> s.toLowerCase().endsWith(".profile"));
        for (int length = listFiles.length, i = 0; i < length; ++i) {
            listFiles[i].delete();
        }
        for (final Class8241 class8241 : this.field38428) {
            final File file2 = new File(Class9463.method35173().method35208() + "/profiles/" + class8241.field33839 + ".profile");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            IOUtils.write(class8241.method27289(new Class4405()).toString(0), (OutputStream)new FileOutputStream(file2));
        }
    }
    
    public Class8241 method32707() {
        return this.field38429;
    }
    
    public void method32708(final Class8241 field38429) {
        Class9463.method35173().method35179();
        Class1607.field8978 = new HashMap<Object, Integer>();
        if (Class9463.method35173().method35209() != Class2209.field13465) {
            this.field38429.field33838 = Class9463.method35173().method35189().method21546(new Class4405());
            this.field38429 = field38429;
            Class9463.method35173().method35206().method13301("profile", field38429.field33839);
            Class9463.method35173().method35189().method21545(field38429.field33838);
            Class9463.method35173().method35179();
            return;
        }
        this.field38429.field33838 = field38429.method27290();
        Class9463.method35173().method35206().method13301("profile", "Classic");
        Class9463.method35173().method35189().method21545(field38429.field33838);
        Class9463.method35173().method35179();
    }
    
    public List<Class8241> method32709() {
        return this.field38428;
    }
}

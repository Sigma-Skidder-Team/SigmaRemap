// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.xml.transform.Transformer;
import org.w3c.dom.Document;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.newdawn.slick.Color;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

public class Class9125
{
    public static Class8014 method33085(final String s, final Color color) throws IOException {
        return method33093(Class8834.method30851(s), null, null, color);
    }
    
    public static Class8014 method33086(final String s) throws IOException {
        return method33093(Class8834.method30851(s), null, null, null);
    }
    
    public static Class8014 method33087(final File file) throws IOException {
        return method33093(new FileInputStream(file), null, null, null);
    }
    
    public static Class8014 method33088(final InputStream inputStream, final Color color) throws IOException {
        return method33093(inputStream, null, null, color);
    }
    
    public static Class8014 method33089(final InputStream inputStream) throws IOException {
        return method33093(inputStream, null, null, null);
    }
    
    public static Class8014 method33090(final String s, final Class7865 class7865) throws IOException {
        return method33093(Class8834.method30851(s), class7865, null, null);
    }
    
    public static Class8014 method33091(final File file, final Class7865 class7865) throws IOException {
        return method33093(new FileInputStream(file), class7865, null, null);
    }
    
    public static Class8014 method33092(final InputStream inputStream, final Class7865 class7865) throws IOException {
        return method33093(inputStream, class7865, null, null);
    }
    
    public static Class8014 method33093(final InputStream is, Class7865 class7865, Class8014 class7866, final Color class7867) throws IOException {
        if (class7865 == null) {
            class7865 = new Class7866();
        }
        try {
            final Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is).getDocumentElement();
            if (!documentElement.getNodeName().equals("system")) {
                throw new IOException("Not a particle system file");
            }
            if (class7866 == null) {
                class7866 = new Class8014("org/newdawn/slick/data/particle.tga", 2000, class7867);
            }
            if ("true".equals(documentElement.getAttribute("additive"))) {
                class7866.method26239(1);
            }
            else {
                class7866.method26239(2);
            }
            class7866.method26234("true".equals(documentElement.getAttribute("points")));
            final NodeList elementsByTagName = documentElement.getElementsByTagName("emitter");
            for (int i = 0; i < elementsByTagName.getLength(); ++i) {
                final Element element = (Element)elementsByTagName.item(i);
                final Class7395 method25487 = class7865.method25487("new");
                method33105(element, method25487);
                class7866.method26242(method25487);
            }
            class7866.method26233(false);
            return class7866;
        }
        catch (final IOException ex) {
            Class8452.method28203(ex);
            throw ex;
        }
        catch (final Exception ex2) {
            Class8452.method28203(ex2);
            throw new IOException("Unable to load particle system config");
        }
    }
    
    public static void method33094(final File file, final Class8014 class8014) throws IOException {
        method33095(new FileOutputStream(file), class8014);
    }
    
    public static void method33095(final OutputStream out, final Class8014 class8014) throws IOException {
        try {
            final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            final Element element = document.createElement("system");
            element.setAttribute("additive", "" + (class8014.method26237() == 1));
            element.setAttribute("points", "" + class8014.method26235());
            document.appendChild(element);
            for (int i = 0; i < class8014.method26240(); ++i) {
                final Class7394 method26241 = class8014.method26241(i);
                if (!(method26241 instanceof Class7395)) {
                    throw new RuntimeException("Only ConfigurableEmitter instances can be stored");
                }
                element.appendChild(method33106(document, (Class7395)method26241));
            }
            final StreamResult streamResult = new StreamResult(new OutputStreamWriter(out, StandardCharsets.UTF_8));
            final DOMSource domSource = new DOMSource(document);
            final Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("indent", "yes");
            transformer.transform(domSource, streamResult);
        }
        catch (final Exception ex) {
            Class8452.method28203(ex);
            throw new IOException("Unable to save configured particle system");
        }
    }
    
    public static Class7395 method33096(final String s) throws IOException {
        return method33101(Class8834.method30851(s), null);
    }
    
    public static Class7395 method33097(final File file) throws IOException {
        return method33101(new FileInputStream(file), null);
    }
    
    public static Class7395 method33098(final InputStream inputStream) throws IOException {
        return method33101(inputStream, null);
    }
    
    public static Class7395 method33099(final String s, final Class7865 class7865) throws IOException {
        return method33101(Class8834.method30851(s), class7865);
    }
    
    public static Class7395 method33100(final File file, final Class7865 class7865) throws IOException {
        return method33101(new FileInputStream(file), class7865);
    }
    
    public static Class7395 method33101(final InputStream is, Class7865 class7865) throws IOException {
        if (class7865 == null) {
            class7865 = new Class7864();
        }
        try {
            final Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
            if (!parse.getDocumentElement().getNodeName().equals("emitter")) {
                throw new IOException("Not a particle emitter file");
            }
            final Class7395 method25487 = class7865.method25487("new");
            method33105(parse.getDocumentElement(), method25487);
            return method25487;
        }
        catch (final IOException ex) {
            Class8452.method28203(ex);
            throw ex;
        }
        catch (final Exception ex2) {
            Class8452.method28203(ex2);
            throw new IOException("Unable to load emitter");
        }
    }
    
    public static void method33102(final File file, final Class7395 class7395) throws IOException {
        method33103(new FileOutputStream(file), class7395);
    }
    
    public static void method33103(final OutputStream out, final Class7395 class7395) throws IOException {
        try {
            final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            document.appendChild(method33106(document, class7395));
            final StreamResult streamResult = new StreamResult(new OutputStreamWriter(out, StandardCharsets.UTF_8));
            final DOMSource domSource = new DOMSource(document);
            final Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("indent", "yes");
            transformer.transform(domSource, streamResult);
        }
        catch (final Exception ex) {
            Class8452.method28203(ex);
            throw new IOException("Failed to save emitter");
        }
    }
    
    private static Element method33104(final Element element, final String s) {
        final NodeList elementsByTagName = element.getElementsByTagName(s);
        if (elementsByTagName.getLength() != 0) {
            return (Element)elementsByTagName.item(0);
        }
        return null;
    }
    
    private static void method33105(final Element element, final Class7395 class7395) {
        class7395.field28502 = element.getAttribute("name");
        class7395.method22709(element.getAttribute("imageName"));
        final String attribute = element.getAttribute("renderType");
        class7395.field28499 = 1;
        if (attribute.equals("quads")) {
            class7395.field28499 = 3;
        }
        if (attribute.equals("points")) {
            class7395.field28499 = 2;
        }
        final String attribute2 = element.getAttribute("useOriented");
        if (attribute2 != null) {
            class7395.field28500 = "true".equals(attribute2);
        }
        final String attribute3 = element.getAttribute("useAdditive");
        if (attribute3 != null) {
            class7395.field28501 = "true".equals(attribute3);
        }
        method33109(method33104(element, "spawnInterval"), class7395.field28477);
        method33109(method33104(element, "spawnCount"), class7395.field28478);
        method33109(method33104(element, "initialLife"), class7395.field28479);
        method33109(method33104(element, "initialSize"), class7395.field28480);
        method33109(method33104(element, "xOffset"), class7395.field28481);
        method33109(method33104(element, "yOffset"), class7395.field28482);
        method33109(method33104(element, "initialDistance"), class7395.field28485);
        method33109(method33104(element, "speed"), class7395.field28486);
        method33109(method33104(element, "length"), class7395.field28490);
        method33109(method33104(element, "emitCount"), class7395.field28498);
        method33110(method33104(element, "spread"), class7395.field28483);
        method33110(method33104(element, "angularOffset"), class7395.field28484);
        method33110(method33104(element, "growthFactor"), class7395.field28487);
        method33110(method33104(element, "gravityFactor"), class7395.field28488);
        method33110(method33104(element, "windFactor"), class7395.field28489);
        method33110(method33104(element, "startAlpha"), class7395.field28492);
        method33110(method33104(element, "endAlpha"), class7395.field28493);
        method33110(method33104(element, "alpha"), class7395.field28494);
        method33110(method33104(element, "size"), class7395.field28495);
        method33110(method33104(element, "velocity"), class7395.field28496);
        method33110(method33104(element, "scaleY"), class7395.field28497);
        final NodeList elementsByTagName = method33104(element, "color").getElementsByTagName("step");
        class7395.field28491.clear();
        for (int i = 0; i < elementsByTagName.getLength(); ++i) {
            final Element element2 = (Element)elementsByTagName.item(i);
            class7395.method22719(Float.parseFloat(element2.getAttribute("offset")), new Color(Float.parseFloat(element2.getAttribute("r")), Float.parseFloat(element2.getAttribute("g")), Float.parseFloat(element2.getAttribute("b")), 1.0f));
        }
        class7395.method22715();
    }
    
    private static Element method33106(final Document document, final Class7395 class7395) {
        final Element element = document.createElement("emitter");
        element.setAttribute("name", class7395.field28502);
        element.setAttribute("imageName", (class7395.field28503 != null) ? class7395.field28503 : "");
        element.setAttribute("useOriented", class7395.field28500 ? "true" : "false");
        element.setAttribute("useAdditive", class7395.field28501 ? "true" : "false");
        if (class7395.field28499 == 1) {
            element.setAttribute("renderType", "inherit");
        }
        if (class7395.field28499 == 2) {
            element.setAttribute("renderType", "points");
        }
        if (class7395.field28499 == 3) {
            element.setAttribute("renderType", "quads");
        }
        element.appendChild(method33107(document, "spawnInterval", class7395.field28477));
        element.appendChild(method33107(document, "spawnCount", class7395.field28478));
        element.appendChild(method33107(document, "initialLife", class7395.field28479));
        element.appendChild(method33107(document, "initialSize", class7395.field28480));
        element.appendChild(method33107(document, "xOffset", class7395.field28481));
        element.appendChild(method33107(document, "yOffset", class7395.field28482));
        element.appendChild(method33107(document, "initialDistance", class7395.field28485));
        element.appendChild(method33107(document, "speed", class7395.field28486));
        element.appendChild(method33107(document, "length", class7395.field28490));
        element.appendChild(method33107(document, "emitCount", class7395.field28498));
        element.appendChild(method33108(document, "spread", class7395.field28483));
        element.appendChild(method33108(document, "angularOffset", class7395.field28484));
        element.appendChild(method33108(document, "growthFactor", class7395.field28487));
        element.appendChild(method33108(document, "gravityFactor", class7395.field28488));
        element.appendChild(method33108(document, "windFactor", class7395.field28489));
        element.appendChild(method33108(document, "startAlpha", class7395.field28492));
        element.appendChild(method33108(document, "endAlpha", class7395.field28493));
        element.appendChild(method33108(document, "alpha", class7395.field28494));
        element.appendChild(method33108(document, "size", class7395.field28495));
        element.appendChild(method33108(document, "velocity", class7395.field28496));
        element.appendChild(method33108(document, "scaleY", class7395.field28497));
        final Element element2 = document.createElement("color");
        final ArrayList field28491 = class7395.field28491;
        for (int i = 0; i < field28491.size(); ++i) {
            final Class8757 class7396 = field28491.get(i);
            final Element element3 = document.createElement("step");
            element3.setAttribute("offset", "" + class7396.field36776);
            element3.setAttribute("r", "" + class7396.field36777.r);
            element3.setAttribute("g", "" + class7396.field36777.g);
            element3.setAttribute("b", "" + class7396.field36777.b);
            element2.appendChild(element3);
        }
        element.appendChild(element2);
        return element;
    }
    
    private static Element method33107(final Document document, final String s, final Class9523 class9523) {
        final Element element = document.createElement(s);
        element.setAttribute("min", "" + class9523.method35548());
        element.setAttribute("max", "" + class9523.method35546());
        element.setAttribute("enabled", "" + class9523.method35544());
        return element;
    }
    
    private static Element method33108(final Document document, final String s, final Class7198 class7198) {
        final Element element = document.createElement(s);
        if (!(class7198 instanceof Class7201)) {
            if (!(class7198 instanceof Class7200)) {
                if (!(class7198 instanceof Class7199)) {
                    Class8452.method28205("unkown value type ignored: " + class7198.getClass());
                }
                else {
                    element.setAttribute("type", "linear");
                    element.setAttribute("min", "" + ((Class7199)class7198).method22091());
                    element.setAttribute("max", "" + ((Class7199)class7198).method22089());
                    element.setAttribute("active", "" + ((Class7199)class7198).method22087());
                    final ArrayList method22086 = ((Class7199)class7198).method22086();
                    for (int i = 0; i < method22086.size(); ++i) {
                        final Class2412 class7199 = method22086.get(i);
                        final Element element2 = document.createElement("point");
                        element2.setAttribute("x", "" + class7199.field14278);
                        element2.setAttribute("y", "" + class7199.field14279);
                        element.appendChild(element2);
                    }
                }
            }
            else {
                element.setAttribute("type", "random");
                element.setAttribute("value", "" + ((Class7200)class7198).method22094());
            }
        }
        else {
            element.setAttribute("type", "simple");
            element.setAttribute("value", "" + class7198.method22084(0.0f));
        }
        return element;
    }
    
    private static void method33109(final Element element, final Class9523 class9523) {
        if (element != null) {
            class9523.method35549(Float.parseFloat(element.getAttribute("min")));
            class9523.method35547(Float.parseFloat(element.getAttribute("max")));
            class9523.method35545("true".equals(element.getAttribute("enabled")));
        }
    }
    
    private static void method33110(final Element obj, final Class7198 class7198) {
        if (obj != null) {
            final String attribute = obj.getAttribute("type");
            final String attribute2 = obj.getAttribute("value");
            if (attribute != null && attribute.length() != 0) {
                if (!attribute.equals("simple")) {
                    if (!attribute.equals("random")) {
                        if (!attribute.equals("linear")) {
                            Class8452.method28205("unkown type detected: " + attribute);
                        }
                        else {
                            final String attribute3 = obj.getAttribute("min");
                            final String attribute4 = obj.getAttribute("max");
                            final String attribute5 = obj.getAttribute("active");
                            final NodeList elementsByTagName = obj.getElementsByTagName("point");
                            final ArrayList list = new ArrayList();
                            for (int i = 0; i < elementsByTagName.getLength(); ++i) {
                                final Element element = (Element)elementsByTagName.item(i);
                                list.add(new Class2412(Float.parseFloat(element.getAttribute("x")), Float.parseFloat(element.getAttribute("y"))));
                            }
                            ((Class7199)class7198).method22085(list);
                            ((Class7199)class7198).method22092(Integer.parseInt(attribute3));
                            ((Class7199)class7198).method22090(Integer.parseInt(attribute4));
                            ((Class7199)class7198).method22088("true".equals(attribute5));
                        }
                    }
                    else {
                        ((Class7200)class7198).method22093(Float.parseFloat(attribute2));
                    }
                }
                else {
                    ((Class7201)class7198).method22095(Float.parseFloat(attribute2));
                }
            }
            else if (!(class7198 instanceof Class7201)) {
                if (!(class7198 instanceof Class7200)) {
                    Class8452.method28205("problems reading element, skipping: " + obj);
                }
                else {
                    ((Class7200)class7198).method22093(Float.parseFloat(attribute2));
                }
            }
            else {
                ((Class7201)class7198).method22095(Float.parseFloat(attribute2));
            }
        }
    }
}

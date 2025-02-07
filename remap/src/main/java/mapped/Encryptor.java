// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.auth.SerialNumberUtil;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Encryptor {
    public String username;
    public String authToken;
    public String agoraToken;

    public Encryptor(final String username, final String authToken, final String agoraToken) {
        this.username = username;
        this.authToken = authToken;
        this.agoraToken = agoraToken;
    }

    public Encryptor(final byte[] input) {
        final byte[] copy = Arrays.copyOf(SerialNumberUtil.getHWID("mcAzMFSvCM6wFCHcgzOn"), 16);
        final byte[] bytes = "jelloconnectvect".getBytes();
        final SecretKeySpec key = new SecretKeySpec(copy, "AES");
        try {
            final Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(2, key, new IvParameterSpec(bytes));

            final JSONObject JSONObject = new JSONObject(new String(instance.doFinal(input)));
            if (JSONObject.has("username")) {
                this.username = JSONObject.getString("username");
            }
            if (JSONObject.has("authToken")) {
                this.authToken = JSONObject.getString("authToken");
            }
            if (JSONObject.has("agoraToken")) {
                this.agoraToken = JSONObject.getString("agoraToken");
            }
        } catch (final InvalidKeyException | InvalidAlgorithmParameterException | NoSuchAlgorithmException |
                       NoSuchPaddingException |
                       JSONException | IllegalBlockSizeException | BadPaddingException ignored) {
        }
    }

    public byte[] encrypt() {
        final byte[] copy = Arrays.copyOf(SerialNumberUtil.getHWID("mcAzMFSvCM6wFCHcgzOn"), 16);
        final byte[] bytes = "jelloconnectvect".getBytes();
        final SecretKeySpec key = new SecretKeySpec(copy, "AES");
        try {
            final Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(1, key, new IvParameterSpec(bytes));
            return instance.doFinal(this.formatData().toString().getBytes());
        } catch (final NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException |
                       InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public JSONObject formatData() {
        final JSONObject JSONObject = new JSONObject();
        JSONObject.put("username", this.username);
        JSONObject.put("authToken", this.authToken);
        JSONObject.put("agoraToken", this.agoraToken);
        return JSONObject;
    }
}
